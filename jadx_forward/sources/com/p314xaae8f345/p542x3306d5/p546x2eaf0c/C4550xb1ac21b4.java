package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.MarsPlatformComm */
/* loaded from: classes13.dex */
public class C4550xb1ac21b4 {
    private static final java.lang.String TAG = "MarsPlatformComm";
    private static android.content.Context ctx;

    /* renamed from: mIsVpnUsed */
    private static java.lang.Boolean f19245x7f9d205a;

    /* renamed from: com.tencent.mars.comm.MarsPlatformComm$VpnNetworkCallback */
    /* loaded from: classes13.dex */
    public static class VpnNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private VpnNetworkCallback() {
        }

        /* renamed from: updateVpnStatus */
        private void m40030x6109b73d() {
            boolean m40020xbbd78272 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.m40020xbbd78272();
            if (m40020xbbd78272 != com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.f19245x7f9d205a.booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.TAG, "vpn status from [" + com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.f19245x7f9d205a + "] to [" + m40020xbbd78272 + "]");
                java.lang.Boolean unused = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.f19245x7f9d205a = java.lang.Boolean.valueOf(m40020xbbd78272);
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.m40027x70ed565f();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            super.onAvailable(network);
            m40030x6109b73d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            super.onLost(network);
            m40030x6109b73d();
        }
    }

    /* renamed from: access$200 */
    public static /* synthetic */ boolean m40020xbbd78272() {
        return m40024x189c6f50();
    }

    /* renamed from: bindSocketToCellular */
    public static boolean m40023xe18b7735(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "bindSocketToCellular, fd:" + i17);
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.INSTANCE.m40049x21169495().m40041x564b252d(i17, ctx);
    }

    /* renamed from: getVpnStatus */
    private static boolean m40024x189c6f50() {
        android.net.NetworkCapabilities networkCapabilities;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ctx.getSystemService("connectivity");
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(4);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "ex: " + th6);
            return false;
        }
    }

    /* renamed from: isCellularNetworkActive */
    public static boolean m40025xbc545e80() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "active network");
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.INSTANCE.m40049x21169495().m40046x5bd4cb2b(ctx);
    }

    /* renamed from: isVpnConnected */
    public static boolean m40026xcf0a0ebf() {
        java.lang.Boolean bool = f19245x7f9d205a;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.class) {
            if (f19245x7f9d205a == null) {
                f19245x7f9d205a = java.lang.Boolean.valueOf(m40024x189c6f50());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Vpn status init:" + f19245x7f9d205a);
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) ctx.getSystemService("connectivity");
                if (connectivityManager != null && android.os.Build.VERSION.SDK_INT >= 30) {
                    try {
                        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().removeCapability(15).build(), new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.VpnNetworkCallback());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Register vpn event");
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "registerNetworkCallback failed: " + e17.getMessage());
                    }
                }
            }
        }
        return f19245x7f9d205a.booleanValue();
    }

    /* renamed from: onVpnChanged */
    public static native void m40027x70ed565f();

    /* renamed from: resolveHostByCellular */
    public static java.lang.String m40028xcc5763b5(final java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "resolveHostByCellular host:" + str);
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(1);
        java.util.concurrent.Future submit = newFixedThreadPool.submit(new java.util.concurrent.Callable<java.lang.String>() { // from class: com.tencent.mars.comm.MarsPlatformComm.1
            @Override // java.util.concurrent.Callable
            public java.lang.String call() {
                return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4551xb30b7784.INSTANCE.m40049x21169495().m40045xcc5763b5(str, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4550xb1ac21b4.ctx);
            }
        });
        try {
            return (java.lang.String) submit.get(i17, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "ex: " + th6);
                submit.cancel(true);
                newFixedThreadPool.shutdown();
                return "";
            } finally {
                newFixedThreadPool.shutdown();
            }
        }
    }

    /* renamed from: setContext */
    public static void m40029xe9f5beed(android.content.Context context) {
        ctx = context;
    }
}
