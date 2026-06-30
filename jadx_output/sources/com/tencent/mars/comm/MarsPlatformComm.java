package com.tencent.mars.comm;

/* loaded from: classes13.dex */
public class MarsPlatformComm {
    private static final java.lang.String TAG = "MarsPlatformComm";
    private static android.content.Context ctx;
    private static java.lang.Boolean mIsVpnUsed;

    /* loaded from: classes13.dex */
    public static class VpnNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private VpnNetworkCallback() {
        }

        private void updateVpnStatus() {
            boolean access$200 = com.tencent.mars.comm.MarsPlatformComm.access$200();
            if (access$200 != com.tencent.mars.comm.MarsPlatformComm.mIsVpnUsed.booleanValue()) {
                com.tencent.mars.xlog.Log.i(com.tencent.mars.comm.MarsPlatformComm.TAG, "vpn status from [" + com.tencent.mars.comm.MarsPlatformComm.mIsVpnUsed + "] to [" + access$200 + "]");
                java.lang.Boolean unused = com.tencent.mars.comm.MarsPlatformComm.mIsVpnUsed = java.lang.Boolean.valueOf(access$200);
                com.tencent.mars.comm.MarsPlatformComm.onVpnChanged();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            super.onAvailable(network);
            updateVpnStatus();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            super.onLost(network);
            updateVpnStatus();
        }
    }

    public static /* synthetic */ boolean access$200() {
        return getVpnStatus();
    }

    public static boolean bindSocketToCellular(int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "bindSocketToCellular, fd:" + i17);
        return com.tencent.mars.comm.MultiNetLinkWaysUtil.INSTANCE.instance().bindSocketToMobile(i17, ctx);
    }

    private static boolean getVpnStatus() {
        android.net.NetworkCapabilities networkCapabilities;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ctx.getSystemService("connectivity");
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(4);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "ex: " + th6);
            return false;
        }
    }

    public static boolean isCellularNetworkActive() {
        com.tencent.mars.xlog.Log.i(TAG, "active network");
        return com.tencent.mars.comm.MultiNetLinkWaysUtil.INSTANCE.instance().syncActiveMobileNetwork(ctx);
    }

    public static boolean isVpnConnected() {
        java.lang.Boolean bool = mIsVpnUsed;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (com.tencent.mars.comm.MarsPlatformComm.class) {
            if (mIsVpnUsed == null) {
                mIsVpnUsed = java.lang.Boolean.valueOf(getVpnStatus());
                com.tencent.mars.xlog.Log.i(TAG, "Vpn status init:" + mIsVpnUsed);
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ctx.getSystemService("connectivity");
                if (connectivityManager != null && android.os.Build.VERSION.SDK_INT >= 30) {
                    try {
                        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().removeCapability(15).build(), new com.tencent.mars.comm.MarsPlatformComm.VpnNetworkCallback());
                        com.tencent.mars.xlog.Log.i(TAG, "Register vpn event");
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.i(TAG, "registerNetworkCallback failed: " + e17.getMessage());
                    }
                }
            }
        }
        return mIsVpnUsed.booleanValue();
    }

    public static native void onVpnChanged();

    public static java.lang.String resolveHostByCellular(final java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "resolveHostByCellular host:" + str);
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(1);
        java.util.concurrent.Future submit = newFixedThreadPool.submit(new java.util.concurrent.Callable<java.lang.String>() { // from class: com.tencent.mars.comm.MarsPlatformComm.1
            @Override // java.util.concurrent.Callable
            public java.lang.String call() {
                return com.tencent.mars.comm.MultiNetLinkWaysUtil.INSTANCE.instance().resolveHostByCellular(str, com.tencent.mars.comm.MarsPlatformComm.ctx);
            }
        });
        try {
            return (java.lang.String) submit.get(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.e(TAG, "ex: " + th6);
                submit.cancel(true);
                newFixedThreadPool.shutdown();
                return "";
            } finally {
                newFixedThreadPool.shutdown();
            }
        }
    }

    public static void setContext(android.content.Context context) {
        ctx = context;
    }
}
