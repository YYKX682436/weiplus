package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.networkbinder.NetworkBinder */
/* loaded from: classes13.dex */
public class C3771xd98eb158 {

    /* renamed from: CELLULAR */
    public static final int f14684xf803c96a = 2;

    /* renamed from: DEFAULT */
    public static final int f14685x86df6221 = 0;
    private static final java.lang.String TAG = "NetworkBinder";

    /* renamed from: WIFI */
    public static final int f14686x28a715 = 1;

    /* renamed from: isPrint */
    private static boolean f14687x7b485fa3 = true;

    /* renamed from: mNativeNetworkBinderJni */
    private long f14692x7c9d0211;

    /* renamed from: mLocker */
    private final java.lang.Object f14691xe0259e5 = new java.lang.Object();

    /* renamed from: mIsActivatingNetwork */
    private boolean f14689x7b847d67 = false;

    /* renamed from: mIsNetworkAvailable */
    private boolean f14690x4b21fcd2 = false;

    /* renamed from: mNetworkType */
    private int f14694x3661a7db = 0;

    /* renamed from: mNetworkCallback */
    private android.net.ConnectivityManager.NetworkCallback f14693x79780066 = null;

    /* renamed from: mTimeoutRunnable */
    private final java.lang.Runnable f14695x5af8c371 = new java.lang.Runnable() { // from class: com.tencent.liteav.base.networkbinder.NetworkBinder.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14691xe0259e5) {
                if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14689x7b847d67 && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.m29420x183a93fd()) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.m29426x2f4d6cb1(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14692x7c9d0211, "", false);
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.TAG, "[BindSocket]:activate network timeout");
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14689x7b847d67 = false;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14690x4b21fcd2 = false;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.m29423xcda372d5();
                }
            }
        }
    };

    /* renamed from: mHandler */
    private final android.os.Handler f14688xc7640a1d = new android.os.Handler(android.os.Looper.getMainLooper());

    public C3771xd98eb158(long j17) {
        this.f14692x7c9d0211 = j17;
    }

    /* renamed from: bindSocket */
    public static boolean m29418x34cc4e10(java.lang.String str, int i17) {
        if (str != null && !str.isEmpty() && i17 != -1) {
            try {
                if (!m29421x6ea330fb()) {
                    return false;
                }
                android.net.Network m29424x9fb5ca35 = m29424x9fb5ca35(str);
                if (m29424x9fb5ca35 == null) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:NetworkBinder bindSocket can not find network:".concat(str));
                    return false;
                }
                m29424x9fb5ca35.bindSocket(android.os.ParcelFileDescriptor.fromFd(i17).getFileDescriptor());
                return true;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:bindSocket in java encountered an exception, name:" + str + " socket:" + i17);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancleTimeoutRunnable */
    public void m29419x5d2d1ab2() {
        if (this.f14688xc7640a1d != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "[BindSocket]:remove cancel last request network runnable", new java.lang.Object[0]);
            this.f14688xc7640a1d.removeCallbacks(this.f14695x5af8c371);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkNativeValid */
    public boolean m29420x183a93fd() {
        boolean z17;
        synchronized (this.f14691xe0259e5) {
            z17 = this.f14692x7c9d0211 != -1;
        }
        return z17;
    }

    /* renamed from: checkSystemVersionValid */
    private static boolean m29421x6ea330fb() {
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 23) {
            return true;
        }
        if (f14687x7b485fa3) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:The android version is too low and does not support network binding");
            f14687x7b485fa3 = false;
        }
        return false;
    }

    /* renamed from: createNetworkCallback */
    private android.net.ConnectivityManager.NetworkCallback m29422x9e994ff7() {
        final android.net.ConnectivityManager m29425x6a8d0ec0;
        synchronized (this.f14691xe0259e5) {
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.f14693x79780066;
            if (networkCallback != null) {
                return networkCallback;
            }
            if (!m29421x6ea330fb() || (m29425x6a8d0ec0 = m29425x6a8d0ec0()) == null) {
                return null;
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback2 = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.networkbinder.NetworkBinder.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onAvailable(android.net.Network network) {
                    super.onAvailable(network);
                    if (network == null) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.TAG, "[BindSocket]:onAvailable, network is null", new java.lang.Object[0]);
                        return;
                    }
                    android.net.LinkProperties linkProperties = m29425x6a8d0ec0.getLinkProperties(network);
                    synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14691xe0259e5) {
                        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14689x7b847d67) {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14689x7b847d67 = false;
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14690x4b21fcd2 = true;
                            if (linkProperties != null && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.m29420x183a93fd()) {
                                java.lang.String interfaceName = linkProperties.getInterfaceName();
                                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.m29426x2f4d6cb1(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14692x7c9d0211, interfaceName, true);
                                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.TAG, "[BindSocket]:start network succ, network name=".concat(java.lang.String.valueOf(interfaceName)), new java.lang.Object[0]);
                            }
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.m29419x5d2d1ab2();
                        }
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(android.net.Network network) {
                    super.onLost(network);
                    synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14691xe0259e5) {
                        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14690x4b21fcd2 && !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14689x7b847d67) {
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14690x4b21fcd2 = false;
                            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.m29420x183a93fd()) {
                                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.m29426x2f4d6cb1(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.f14692x7c9d0211, "", false);
                                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.TAG, "[BindSocket]:network onLost", new java.lang.Object[0]);
                            }
                            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p384xe08a9558.C3771xd98eb158.this.m29423xcda372d5();
                        }
                    }
                }
            };
            synchronized (this.f14691xe0259e5) {
                this.f14693x79780066 = networkCallback2;
            }
            return networkCallback2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deactivateNetworkAdapter */
    public void m29423xcda372d5() {
        android.net.ConnectivityManager m29425x6a8d0ec0;
        try {
            if (m29421x6ea330fb() && (m29425x6a8d0ec0 = m29425x6a8d0ec0()) != null) {
                synchronized (this.f14691xe0259e5) {
                    if (this.f14693x79780066 != null) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "[BindSocket]:deactivat network adapter", new java.lang.Object[0]);
                        m29425x6a8d0ec0.unregisterNetworkCallback(this.f14693x79780066);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:deactivateNetworkAdapter in java encountered an exception");
        }
    }

    /* renamed from: findNetwork */
    public static android.net.Network m29424x9fb5ca35(java.lang.String str) {
        android.net.ConnectivityManager m29425x6a8d0ec0;
        if (!m29421x6ea330fb() || (m29425x6a8d0ec0 = m29425x6a8d0ec0()) == null) {
            return null;
        }
        for (android.net.Network network : m29425x6a8d0ec0.getAllNetworks()) {
            android.net.LinkProperties linkProperties = m29425x6a8d0ec0.getLinkProperties(network);
            if (linkProperties != null && linkProperties.getInterfaceName().equals(str)) {
                return network;
            }
        }
        return null;
    }

    /* renamed from: getConnectivityManager */
    private static android.net.ConnectivityManager m29425x6a8d0ec0() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            return null;
        }
        return (android.net.ConnectivityManager) m29240x6e669035.getSystemService("connectivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nativeOnNetworkAvailable */
    public static native void m29426x2f4d6cb1(long j17, java.lang.String str, boolean z17);

    /* renamed from: activateNetworkAdapter */
    public boolean m29427x17762d14(int i17) {
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        try {
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:activateNetworkAdapter in java encountered an exception, networkType:".concat(java.lang.String.valueOf(i17)));
        }
        synchronized (this.f14691xe0259e5) {
            if (this.f14689x7b847d67) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:mIsActivatingNetwork is true");
                return false;
            }
            this.f14689x7b847d67 = true;
            this.f14690x4b21fcd2 = false;
            if (this.f14694x3661a7db != i17) {
                m29423xcda372d5();
            }
            this.f14694x3661a7db = i17;
            if (m29429xe2dc1b7f(i17)) {
                synchronized (this.f14691xe0259e5) {
                    android.os.Handler handler = this.f14688xc7640a1d;
                    if (handler != null) {
                        handler.postDelayed(this.f14695x5af8c371, 2000L);
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: destroy */
    public void m29428x5cd39ffa() {
        synchronized (this.f14691xe0259e5) {
            this.f14689x7b847d67 = false;
            this.f14690x4b21fcd2 = false;
            m29423xcda372d5();
            m29419x5d2d1ab2();
            this.f14692x7c9d0211 = -1L;
        }
    }

    /* renamed from: doActivateNetworkAdapter */
    public boolean m29429xe2dc1b7f(int i17) {
        int i18;
        android.net.ConnectivityManager m29425x6a8d0ec0;
        android.net.ConnectivityManager.NetworkCallback m29422x9e994ff7;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = 0;
            }
            return false;
        }
        i18 = 1;
        try {
            if (!m29421x6ea330fb() || (m29425x6a8d0ec0 = m29425x6a8d0ec0()) == null || (m29422x9e994ff7 = m29422x9e994ff7()) == null) {
                return false;
            }
            m29425x6a8d0ec0.requestNetwork(new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(i18).build(), m29422x9e994ff7);
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "[BindSocket]:requestNetwork in java encountered an exception, networkType:".concat(java.lang.String.valueOf(i17)));
        }
    }

    /* renamed from: resumeDefaultNetworkAdapter */
    public void m29430x7a8523b5() {
        this.f14694x3661a7db = 0;
        m29423xcda372d5();
    }
}
