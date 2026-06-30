package com.tencent.liteav.base.networkbinder;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes13.dex */
public class NetworkBinder {
    public static final int CELLULAR = 2;
    public static final int DEFAULT = 0;
    private static final java.lang.String TAG = "NetworkBinder";
    public static final int WIFI = 1;
    private static boolean isPrint = true;
    private long mNativeNetworkBinderJni;
    private final java.lang.Object mLocker = new java.lang.Object();
    private boolean mIsActivatingNetwork = false;
    private boolean mIsNetworkAvailable = false;
    private int mNetworkType = 0;
    private android.net.ConnectivityManager.NetworkCallback mNetworkCallback = null;
    private final java.lang.Runnable mTimeoutRunnable = new java.lang.Runnable() { // from class: com.tencent.liteav.base.networkbinder.NetworkBinder.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (com.tencent.liteav.base.networkbinder.NetworkBinder.this.mLocker) {
                if (com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsActivatingNetwork && com.tencent.liteav.base.networkbinder.NetworkBinder.this.checkNativeValid()) {
                    com.tencent.liteav.base.networkbinder.NetworkBinder.nativeOnNetworkAvailable(com.tencent.liteav.base.networkbinder.NetworkBinder.this.mNativeNetworkBinderJni, "", false);
                    com.tencent.liteav.base.util.LiteavLog.e(com.tencent.liteav.base.networkbinder.NetworkBinder.TAG, "[BindSocket]:activate network timeout");
                    com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsActivatingNetwork = false;
                    com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsNetworkAvailable = false;
                    com.tencent.liteav.base.networkbinder.NetworkBinder.this.deactivateNetworkAdapter();
                }
            }
        }
    };
    private final android.os.Handler mHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    public NetworkBinder(long j17) {
        this.mNativeNetworkBinderJni = j17;
    }

    public static boolean bindSocket(java.lang.String str, int i17) {
        if (str != null && !str.isEmpty() && i17 != -1) {
            try {
                if (!checkSystemVersionValid()) {
                    return false;
                }
                android.net.Network findNetwork = findNetwork(str);
                if (findNetwork == null) {
                    com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:NetworkBinder bindSocket can not find network:".concat(str));
                    return false;
                }
                findNetwork.bindSocket(android.os.ParcelFileDescriptor.fromFd(i17).getFileDescriptor());
                return true;
            } catch (java.lang.Exception unused) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:bindSocket in java encountered an exception, name:" + str + " socket:" + i17);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancleTimeoutRunnable() {
        if (this.mHandler != null) {
            com.tencent.liteav.base.Log.i(TAG, "[BindSocket]:remove cancel last request network runnable", new java.lang.Object[0]);
            this.mHandler.removeCallbacks(this.mTimeoutRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkNativeValid() {
        boolean z17;
        synchronized (this.mLocker) {
            z17 = this.mNativeNetworkBinderJni != -1;
        }
        return z17;
    }

    private static boolean checkSystemVersionValid() {
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            return true;
        }
        if (isPrint) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:The android version is too low and does not support network binding");
            isPrint = false;
        }
        return false;
    }

    private android.net.ConnectivityManager.NetworkCallback createNetworkCallback() {
        final android.net.ConnectivityManager connectivityManager;
        synchronized (this.mLocker) {
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.mNetworkCallback;
            if (networkCallback != null) {
                return networkCallback;
            }
            if (!checkSystemVersionValid() || (connectivityManager = getConnectivityManager()) == null) {
                return null;
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback2 = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.networkbinder.NetworkBinder.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(android.net.Network network) {
                    super.onAvailable(network);
                    if (network == null) {
                        com.tencent.liteav.base.Log.e(com.tencent.liteav.base.networkbinder.NetworkBinder.TAG, "[BindSocket]:onAvailable, network is null", new java.lang.Object[0]);
                        return;
                    }
                    android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                    synchronized (com.tencent.liteav.base.networkbinder.NetworkBinder.this.mLocker) {
                        if (com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsActivatingNetwork) {
                            com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsActivatingNetwork = false;
                            com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsNetworkAvailable = true;
                            if (linkProperties != null && com.tencent.liteav.base.networkbinder.NetworkBinder.this.checkNativeValid()) {
                                java.lang.String interfaceName = linkProperties.getInterfaceName();
                                com.tencent.liteav.base.networkbinder.NetworkBinder.nativeOnNetworkAvailable(com.tencent.liteav.base.networkbinder.NetworkBinder.this.mNativeNetworkBinderJni, interfaceName, true);
                                com.tencent.liteav.base.Log.i(com.tencent.liteav.base.networkbinder.NetworkBinder.TAG, "[BindSocket]:start network succ, network name=".concat(java.lang.String.valueOf(interfaceName)), new java.lang.Object[0]);
                            }
                            com.tencent.liteav.base.networkbinder.NetworkBinder.this.cancleTimeoutRunnable();
                        }
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(android.net.Network network) {
                    super.onLost(network);
                    synchronized (com.tencent.liteav.base.networkbinder.NetworkBinder.this.mLocker) {
                        if (com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsNetworkAvailable && !com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsActivatingNetwork) {
                            com.tencent.liteav.base.networkbinder.NetworkBinder.this.mIsNetworkAvailable = false;
                            if (com.tencent.liteav.base.networkbinder.NetworkBinder.this.checkNativeValid()) {
                                com.tencent.liteav.base.networkbinder.NetworkBinder.nativeOnNetworkAvailable(com.tencent.liteav.base.networkbinder.NetworkBinder.this.mNativeNetworkBinderJni, "", false);
                                com.tencent.liteav.base.Log.i(com.tencent.liteav.base.networkbinder.NetworkBinder.TAG, "[BindSocket]:network onLost", new java.lang.Object[0]);
                            }
                            com.tencent.liteav.base.networkbinder.NetworkBinder.this.deactivateNetworkAdapter();
                        }
                    }
                }
            };
            synchronized (this.mLocker) {
                this.mNetworkCallback = networkCallback2;
            }
            return networkCallback2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deactivateNetworkAdapter() {
        android.net.ConnectivityManager connectivityManager;
        try {
            if (checkSystemVersionValid() && (connectivityManager = getConnectivityManager()) != null) {
                synchronized (this.mLocker) {
                    if (this.mNetworkCallback != null) {
                        com.tencent.liteav.base.Log.i(TAG, "[BindSocket]:deactivat network adapter", new java.lang.Object[0]);
                        connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:deactivateNetworkAdapter in java encountered an exception");
        }
    }

    public static android.net.Network findNetwork(java.lang.String str) {
        android.net.ConnectivityManager connectivityManager;
        if (!checkSystemVersionValid() || (connectivityManager = getConnectivityManager()) == null) {
            return null;
        }
        for (android.net.Network network : connectivityManager.getAllNetworks()) {
            android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null && linkProperties.getInterfaceName().equals(str)) {
                return network;
            }
        }
        return null;
    }

    private static android.net.ConnectivityManager getConnectivityManager() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        return (android.net.ConnectivityManager) applicationContext.getSystemService("connectivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnNetworkAvailable(long j17, java.lang.String str, boolean z17);

    public boolean activateNetworkAdapter(int i17) {
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        try {
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:activateNetworkAdapter in java encountered an exception, networkType:".concat(java.lang.String.valueOf(i17)));
        }
        synchronized (this.mLocker) {
            if (this.mIsActivatingNetwork) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:mIsActivatingNetwork is true");
                return false;
            }
            this.mIsActivatingNetwork = true;
            this.mIsNetworkAvailable = false;
            if (this.mNetworkType != i17) {
                deactivateNetworkAdapter();
            }
            this.mNetworkType = i17;
            if (doActivateNetworkAdapter(i17)) {
                synchronized (this.mLocker) {
                    android.os.Handler handler = this.mHandler;
                    if (handler != null) {
                        handler.postDelayed(this.mTimeoutRunnable, 2000L);
                    }
                }
                return true;
            }
            return false;
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mIsActivatingNetwork = false;
            this.mIsNetworkAvailable = false;
            deactivateNetworkAdapter();
            cancleTimeoutRunnable();
            this.mNativeNetworkBinderJni = -1L;
        }
    }

    public boolean doActivateNetworkAdapter(int i17) {
        int i18;
        android.net.ConnectivityManager connectivityManager;
        android.net.ConnectivityManager.NetworkCallback createNetworkCallback;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = 0;
            }
            return false;
        }
        i18 = 1;
        try {
            if (!checkSystemVersionValid() || (connectivityManager = getConnectivityManager()) == null || (createNetworkCallback = createNetworkCallback()) == null) {
                return false;
            }
            connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(i18).build(), createNetworkCallback);
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "[BindSocket]:requestNetwork in java encountered an exception, networkType:".concat(java.lang.String.valueOf(i17)));
        }
    }

    public void resumeDefaultNetworkAdapter() {
        this.mNetworkType = 0;
        deactivateNetworkAdapter();
    }
}
