package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy */
/* loaded from: classes16.dex */
public class C26370x41ff35aa implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f52729x59634b6e = "TPDownloadProxy";

    /* renamed from: mConnectivityManager */
    private android.net.ConnectivityManager f52730xfcf94049;

    /* renamed from: mCurrentStoragePath */
    private java.lang.String f52731xb166b554 = "";

    /* renamed from: mIsInit */
    private boolean f52732x9106827 = false;

    /* renamed from: mNetworkCallback */
    private android.net.ConnectivityManager.NetworkCallback f52733x79780066;

    /* renamed from: mServiceType */
    private int f52734x371c78e2;

    public C26370x41ff35aa(int i17) {
        this.f52734x371c78e2 = i17;
    }

    /* renamed from: registerNetworkConnectivity */
    private void m102328x8b8c9b62(android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, context is null, can not set interface 4g");
            return;
        }
        android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        this.f52730xfcf94049 = connectivityManager;
        if (connectivityManager == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, connectivityManager is null, can not set interface 4g");
            return;
        }
        android.net.NetworkRequest build = builder.build();
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(android.net.Network network) {
                super.onAvailable(network);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102386x1f1fe36c(network);
                long networkHandle = network.getNetworkHandle();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa.f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network, net_id_t: " + networkHandle);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa.this.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52737x73f1b047, java.lang.Long.valueOf(networkHandle));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                super.onLost(network);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa.this.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52737x73f1b047, 0);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa.f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network failed");
            }
        };
        this.f52733x79780066 = networkCallback;
        this.f52730xfcf94049.requestNetwork(build, networkCallback);
    }

    /* renamed from: unregisterNetworkConnectivity */
    private void m102329xe6e13529() {
        android.net.ConnectivityManager connectivityManager = this.f52730xfcf94049;
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.f52733x79780066);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: checkResourceStatus */
    public int mo102231xc32400c8(java.lang.String str, java.lang.String str2, int i17) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102398xc32400c8(str, str2, i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "checkResourceStatus failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: clearCache */
    public int mo102232xd2bef135(java.lang.String str, java.lang.String str2, int i17) {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return -1;
        }
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102399xd2bef135(str, str2, i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "clearCache failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: deinit */
    public int mo102233xb0654911() {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return -1;
        }
        try {
            this.f52732x9106827 = false;
            m102329xe6e13529();
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102401x5ca09844(this.f52734x371c78e2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "deinit failed, error:" + th6.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getClipPlayUrl */
    public java.lang.String mo102234x5a566f5(int i17, int i18, int i19) {
        java.lang.String str = "";
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                str = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102404x5a566f5(i17, i18, i19));
                if (i19 != 2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102425x5cae6f0a(i17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getClipPlayUrl failed, error:" + th6.toString());
            }
        }
        return str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getNativeInfo */
    public java.lang.String mo102235xa741fd5b(int i17) {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return null;
        }
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102407xa741fd5b(i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getNativeInfo failed, error:" + th6.toString());
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getPlayErrorCodeStr */
    public java.lang.String mo102236xe1ed3aa6(int i17) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102405xa7e2b452(i17));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayErrorCodeStr failed, error:" + th6.toString());
            }
        }
        return "";
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getPlayUrl */
    public java.lang.String mo102237x2061c165(int i17, int i18) {
        java.lang.String str = "";
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                str = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102404x5a566f5(i17, 1, i18));
                if (i18 != 2) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102425x5cae6f0a(i17);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getPlayUrl failed, error:" + th6.toString());
            }
        }
        return str;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: getResourceSize */
    public long mo102238x4a08f3a5(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102409x4a08f3a5(str, str2);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getResourceSize failed, error:" + th6.toString());
            }
        }
        return -1L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: init */
    public synchronized int mo102239x316510(android.content.Context context, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26368x17a977b3 c26368x17a977b3) {
        int m102411xc4f22785;
        if (this.f52732x9106827) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "download already init");
            return 0;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102418x989ce250(context);
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                if (!android.text.TextUtils.isEmpty(c26368x17a977b3.m102300x10fbb8b8())) {
                    mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52905x6ff5a606, c26368x17a977b3.m102300x10fbb8b8());
                }
                if (c26368x17a977b3.m102305xeb97a5e9() > 0) {
                    mo102248x66a91097("platform", java.lang.Integer.valueOf(c26368x17a977b3.m102305xeb97a5e9()));
                }
                if (!android.text.TextUtils.isEmpty(c26368x17a977b3.m102304xfb7ffeff())) {
                    mo102248x66a91097("guid", c26368x17a977b3.m102304xfb7ffeff());
                }
                java.lang.String m102301x62035321 = c26368x17a977b3.m102301x62035321();
                if (android.text.TextUtils.isEmpty(m102301x62035321) && context != null) {
                    try {
                        java.io.File m102470xb4a5c0f1 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26379xc74951ef.m102470xb4a5c0f1(context, "download");
                        if (m102470xb4a5c0f1 != null) {
                            m102301x62035321 = m102470xb4a5c0f1.getAbsolutePath();
                        }
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "init get cache dir failed, error:" + th6.toString());
                    }
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102379x77f9b81a();
                if (!android.text.TextUtils.isEmpty(c26368x17a977b3.m102303x93d2404d()) || android.text.TextUtils.isEmpty(this.f52731xb166b554)) {
                    if (!android.text.TextUtils.isEmpty(c26368x17a977b3.m102303x93d2404d())) {
                        this.f52731xb166b554 = c26368x17a977b3.m102303x93d2404d();
                    }
                    m102411xc4f22785 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102411xc4f22785(this.f52734x371c78e2, m102301x62035321, c26368x17a977b3.m102303x93d2404d(), c26368x17a977b3.m102302xcf7a54d9());
                } else {
                    m102411xc4f22785 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102411xc4f22785(this.f52734x371c78e2, m102301x62035321, this.f52731xb166b554, c26368x17a977b3.m102302xcf7a54d9());
                }
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxy.2
                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        java.lang.String action = intent.getAction();
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa.this.mo102241xd0c233a0(20);
                        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa.this.mo102241xd0c233a0(19);
                        }
                    }
                };
                if (context != null) {
                    context.registerReceiver(broadcastReceiver, intentFilter);
                }
                if (m102411xc4f22785 == 0) {
                    this.f52732x9106827 = true;
                }
                m102328x8b8c9b62(context);
                return m102411xc4f22785;
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "init failed, error:" + th7.toString());
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: pauseDownload */
    public int mo102240xe51afc9e(int i17) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102415xe51afc9e(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "pauseDownload failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: pushEvent */
    public void mo102241xd0c233a0(int i17) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102416xd0c233a0(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "cellular_network pushEvent failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: removeStorageCache */
    public int mo102242xd0dc786b(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102402xbb8f0c97(this.f52731xb166b554, str);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "deleteCache failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: resumeDownload */
    public int mo102243xb0277d5(int i17) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102417xb0277d5(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "resumeDownload failed, error:" + th6.toString());
            }
        }
        return -1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setClipInfo */
    public boolean mo102244xad41f2a0(int i17, int i18, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9) {
        int m102311x15d5aed8 = c26369x41f783c9.m102311x15d5aed8();
        if (c26369x41f783c9.m102324x81235559()) {
            m102311x15d5aed8 += 300;
        }
        int i19 = m102311x15d5aed8;
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return false;
        }
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102419xad41f2a0(i17, i18, str, i19, c26369x41f783c9.m102308x63b13a7b(), c26369x41f783c9.m102319x1672b4(), c26369x41f783c9.m102314x6eb8b630()) >= 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setClipInfo failed, error:" + th6.toString());
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setLogListener */
    public void mo102245x282f0256(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7 interfaceC26358x35916b7) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.m102493x282f0256(this.f52734x371c78e2, interfaceC26358x35916b7);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setMaxStorageSizeMB */
    public void mo102246xd7e17d2f(long j17) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102421xd7e17d2f(this.f52734x371c78e2, j17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setMaxStorageSizeMB failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setPlayState */
    public void mo102247xeb2f5b7b(int i17, int i18) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102422x90c7986e(i17, i18);
                if (i18 == 1) {
                    long mo102274xe243028a = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102374x838f6e5e(i17).mo102274xe243028a();
                    int mo102275x9746038c = (int) (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102374x838f6e5e(i17).mo102275x9746038c() / 1000);
                    int mo102281xe15692bd = (int) (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102374x838f6e5e(i17).mo102281xe15692bd() / 1000);
                    int mo102271x7dd980b6 = (int) (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102374x838f6e5e(i17).mo102271x7dd980b6() / 1000);
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102430x1b6687bc(i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52903x7e093972, java.lang.String.valueOf(mo102274xe243028a));
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102428x7d92db43(i17, mo102275x9746038c, mo102281xe15692bd, mo102271x7dd980b6);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setPlayState failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: setUserData */
    public void mo102248x66a91097(java.lang.String str, java.lang.Object obj) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                if (str.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52905x6ff5a606)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52905x6ff5a606, (java.lang.String) obj);
                } else if (str.equalsIgnoreCase("platform")) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097("platform", obj.toString());
                } else if (str.equalsIgnoreCase("guid")) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097("guid", (java.lang.String) obj);
                } else if (str.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52912x3112e5c)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52912x3112e5c, ((java.lang.Boolean) obj).booleanValue() ? "1" : "0");
                } else if (str.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52927x1ed77e94)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52927x1ed77e94, (java.lang.String) obj);
                } else if (str.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52928xeeb06f06)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52928xeeb06f06, obj.toString());
                } else if (str.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52921xa6ff5647)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52921xa6ff5647, obj.toString());
                } else if (str.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52922xea8f1b20)) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102423xb979bd15(this.f52734x371c78e2, obj.toString());
                } else {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(str, obj.toString());
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setUserData failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startClipOfflineDownload */
    public int mo102249xc5764659(java.lang.String str, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a) {
        int i18 = -1;
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return -1;
        }
        try {
            i18 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102400xb8d64949(this.f52734x371c78e2, str, 102, i17);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102387x4d1629d(i18, interfaceC26362x7fbc8b1a);
            return i18;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startClipOfflineDownload failed, error:" + th6.toString());
            return i18;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startClipPlay */
    public int mo102250x3e462126(java.lang.String str, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d) {
        int i18 = -1;
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return -1;
        }
        try {
            i18 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102400xb8d64949(this.f52734x371c78e2, str, 2, i17);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102388xbdb2cd8a(i18, interfaceC26364x758c112d);
            return i18;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startClipPlay failed, error:" + th6.toString());
            return i18;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startClipPreload */
    public int mo102251xed7cbad7(java.lang.String str, int i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8) {
        int i18 = -1;
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return -1;
        }
        try {
            i18 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102400xb8d64949(this.f52734x371c78e2, str, 202, i17);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102389xc0393d3b(i18, interfaceC26365x6c7f32b8);
            return i18;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startClipPreload failed, error:" + th6.toString());
            return i18;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startOfflineDownload */
    public int mo102252xbd770ac9(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26362x7fbc8b1a interfaceC26362x7fbc8b1a) {
        int i17 = -1;
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                int m102311x15d5aed8 = c26369x41f783c9.m102311x15d5aed8() + 100;
                i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102400xb8d64949(this.f52734x371c78e2, str, m102311x15d5aed8, c26369x41f783c9.m102309x9e54c0e9());
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102387x4d1629d(i17, interfaceC26362x7fbc8b1a);
                if (!android.text.TextUtils.isEmpty(c26369x41f783c9.m102316x74b13604())) {
                    str = c26369x41f783c9.m102316x74b13604();
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102419xad41f2a0(i17, c26369x41f783c9.m102310x142a3c27(), str, m102311x15d5aed8, c26369x41f783c9.m102308x63b13a7b(), c26369x41f783c9.m102319x1672b4(), c26369x41f783c9.m102314x6eb8b630());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "stopOfflineDownload failed, error:" + th6.toString());
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startPlay */
    public int mo102253x8113c2b6(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d) {
        int m102311x15d5aed8 = c26369x41f783c9.m102311x15d5aed8();
        if (interfaceC26364x758c112d != null) {
            c26369x41f783c9.m102313xb883b063().put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52747x131c9fba, java.lang.Long.valueOf(interfaceC26364x758c112d.mo102271x7dd980b6() / 1000));
        }
        if (c26369x41f783c9.m102324x81235559()) {
            m102311x15d5aed8 += 300;
        }
        int i17 = -1;
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                if (c26369x41f783c9.m102323x82df7dc0() && (m102311x15d5aed8 == 3 || m102311x15d5aed8 == 5)) {
                    m102311x15d5aed8 += 400;
                }
                int i18 = m102311x15d5aed8;
                i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102400xb8d64949(this.f52734x371c78e2, str, i18, c26369x41f783c9.m102309x9e54c0e9());
                if (!android.text.TextUtils.isEmpty(c26369x41f783c9.m102316x74b13604())) {
                    str = c26369x41f783c9.m102316x74b13604();
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102419xad41f2a0(i17, c26369x41f783c9.m102310x142a3c27(), str, i18, c26369x41f783c9.m102308x63b13a7b(), c26369x41f783c9.m102319x1672b4(), c26369x41f783c9.m102314x6eb8b630());
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102388xbdb2cd8a(i17, interfaceC26364x758c112d);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startPlay failed, error:" + th6.toString());
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startPreload */
    public int mo102254xe500ef47(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26365x6c7f32b8 interfaceC26365x6c7f32b8) {
        int i17 = -1;
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                int m102311x15d5aed8 = c26369x41f783c9.m102311x15d5aed8() + 200;
                i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102400xb8d64949(this.f52734x371c78e2, str, m102311x15d5aed8, c26369x41f783c9.m102309x9e54c0e9());
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102389xc0393d3b(i17, interfaceC26365x6c7f32b8);
                if (!android.text.TextUtils.isEmpty(c26369x41f783c9.m102316x74b13604())) {
                    str = c26369x41f783c9.m102316x74b13604();
                }
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102419xad41f2a0(i17, c26369x41f783c9.m102310x142a3c27(), str, m102311x15d5aed8, c26369x41f783c9.m102308x63b13a7b(), c26369x41f783c9.m102319x1672b4(), c26369x41f783c9.m102314x6eb8b630());
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102425x5cae6f0a(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startPreload failed, error:" + th6.toString());
            }
        }
        return i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: startTask */
    public void mo102255x81156d07(int i17) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102425x5cae6f0a(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "startTask failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: stopOfflineDownload */
    public void mo102256xa81329(int i17) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102427xf2c12aa(i17);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102382xd019a03b(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "stopOfflineDownload failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: stopPlay */
    public void mo102257x66343656(int i17) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102427xf2c12aa(i17);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102383xc368e6ac(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "stopPlay failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: stopPreload */
    public void mo102258xa07057a7(int i17) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102427xf2c12aa(i17);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102384x622ff8d9(i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "stopPreload failed, error:" + th6.toString());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: updateStoragePath */
    public void mo102259x9cbbacb7(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f52731xb166b554 = str;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102429x9cbbacb7(this.f52734x371c78e2, str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "updateStoragePath failed, error:" + th6.toString());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41
    /* renamed from: updateTaskInfo */
    public void mo102260x1b6687bc(int i17, java.lang.String str, java.lang.Object obj) {
        if (i17 > 0 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102430x1b6687bc(i17, str, obj.toString());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52729x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "updateTaskInfo failed, error:" + th6.toString());
            }
        }
    }
}
