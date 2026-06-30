package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory */
/* loaded from: classes16.dex */
public class C26372xd16c000 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f52930x59634b6e = "TPDownloadProxyFactory";

    /* renamed from: downloadProxyFactoryAidl */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 f52931xb9a06834;

    /* renamed from: mMapObject */
    private static java.lang.Object f52936xa94c09ce = new java.lang.Object();

    /* renamed from: mvTPDownloadProxyMap */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41> f52939x8e7874bb = new java.util.HashMap<>();

    /* renamed from: mvTPDownloadProxyClientMap */
    private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3037xaf12f3cb.C26375xca5eae15> f52938xb7d12db0 = new java.util.HashMap<>();

    /* renamed from: mUseService */
    private static boolean f52937xf1d39b7b = false;

    /* renamed from: mCanUseAIDL */
    private static boolean f52933x7fa4f714 = false;

    /* renamed from: mIsReadyForDownload */
    private static boolean f52935xf4bc7365 = false;

    /* renamed from: mCallback */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26367x9b214ef3 f52932x1ab9c7d2 = null;

    /* renamed from: mConnection */
    private static android.content.ServiceConnection f52934xadf6772b = new android.content.ServiceConnection() { // from class: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 unused = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52931xb9a06834 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102224xbd0d1927(iBinder);
            try {
                for (java.util.Map.Entry entry : com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52938xb7d12db0.entrySet()) {
                    ((com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3037xaf12f3cb.C26375xca5eae15) entry.getValue()).m102392xee53cf19(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52931xb9a06834.mo102221x61ce4f94(((java.lang.Integer) entry.getKey()).intValue()));
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "onServiceConnected failed, error:" + th6.toString());
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on service connected!");
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52931xb9a06834 == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on service connected, aidl is null!");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on service connected, aidl not null!");
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102345xbfd804c9(true);
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52932x1ab9c7d2 != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52932x1ab9c7d2.m102299x8b856da7();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "on service disconnected");
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 unused = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52931xb9a06834 = null;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102345xbfd804c9(false);
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102337x1b13737a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.f52932x1ab9c7d2);
        }
    };

    /* renamed from: canUseService */
    public static synchronized boolean m102336xadb37b1e() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            if (!f52937xf1d39b7b) {
                return true;
            }
            if (!f52933x7fa4f714) {
                return false;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 interfaceC26357x23d5e2d0 = f52931xb9a06834;
            if (interfaceC26357x23d5e2d0 != null) {
                try {
                    interfaceC26357x23d5e2d0.mo102223xccbd22c4();
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "canUseService failed, error:" + th6.toString());
                }
            }
            return false;
        }
    }

    /* renamed from: ensurePlayManagerService */
    public static boolean m102337x1b13737a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26367x9b214ef3 interfaceC26367x9b214ef3) {
        android.content.Context m102349x76847179 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102349x76847179();
        if (m102349x76847179 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "ensurePlayManagerService get context null!");
            return false;
        }
        f52932x1ab9c7d2 = interfaceC26367x9b214ef3;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "ensurePlayManagerService ".concat("ok"));
        try {
            android.content.Intent intent = new android.content.Intent(m102349x76847179, (java.lang.Class<?>) com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3038x7643c6b5.ServiceC26377xc46f55ab.class);
            m102349x76847179.startService(intent);
            if (!m102349x76847179.bindService(intent, f52934xadf6772b, 1)) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "ensurePlayManagerService bind service failed!");
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "ensurePlayManagerService failed, error:" + th6.toString());
            return false;
        }
    }

    /* renamed from: getCanUseAIDL */
    public static synchronized boolean m102338x91b3b6bd() {
        boolean z17;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            z17 = f52933x7fa4f714;
        }
        return z17;
    }

    /* renamed from: getNativeVersion */
    public static java.lang.String m102339x994c290b() {
        if (f52937xf1d39b7b && f52933x7fa4f714) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 interfaceC26357x23d5e2d0 = f52931xb9a06834;
            if (interfaceC26357x23d5e2d0 != null) {
                try {
                    return interfaceC26357x23d5e2d0.mo102220x994c290b();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getNativeVersion failed, error:" + th6.toString());
                }
            }
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102408x994c290b();
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102408x994c290b();
    }

    /* renamed from: getTPDownloadProxy */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 m102340x61ce4f94(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 interfaceC26361x94977a41;
        if (i17 <= 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getTPDownloadProxy is invalid, serviceType:" + i17);
            return null;
        }
        if (!f52937xf1d39b7b) {
            synchronized (f52936xa94c09ce) {
                interfaceC26361x94977a41 = f52939x8e7874bb.get(java.lang.Integer.valueOf(i17));
                if (interfaceC26361x94977a41 == null) {
                    interfaceC26361x94977a41 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26370x41ff35aa(i17);
                    f52939x8e7874bb.put(java.lang.Integer.valueOf(i17), interfaceC26361x94977a41);
                }
            }
            return interfaceC26361x94977a41;
        }
        if (!f52933x7fa4f714) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getTPDownloadProxy failed, can't use aidl!");
            return null;
        }
        try {
            return m102341xfef52081(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getTPDownloadProxy failed, error:" + th6.toString());
            return null;
        }
    }

    /* renamed from: getTPDownloadProxyService */
    private static synchronized com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 m102341xfef52081(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3037xaf12f3cb.C26375xca5eae15 c26375xca5eae15;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            if (f52931xb9a06834 == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getTPDownloadProxyService failed, aidl is null!");
                return null;
            }
            synchronized (f52938xb7d12db0) {
                c26375xca5eae15 = f52938xb7d12db0.get(java.lang.Integer.valueOf(i17));
                if (c26375xca5eae15 == null) {
                    try {
                        c26375xca5eae15 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3037xaf12f3cb.C26375xca5eae15(f52931xb9a06834.mo102221x61ce4f94(i17));
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getTPDownloadProxyService failed, error:" + th6.toString());
                    }
                }
                f52938xb7d12db0.put(java.lang.Integer.valueOf(i17), c26375xca5eae15);
            }
            return c26375xca5eae15;
        }
    }

    /* renamed from: getUseService */
    public static boolean m102342x3e25b24() {
        return f52937xf1d39b7b;
    }

    /* renamed from: isReadyForDownload */
    public static synchronized boolean m102343xf56d1818() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            boolean z17 = false;
            if (!f52937xf1d39b7b) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "isReadyForDownload ret:" + f52935xf4bc7365);
                return f52935xf4bc7365;
            }
            if (!f52933x7fa4f714) {
                return false;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 interfaceC26357x23d5e2d0 = f52931xb9a06834;
            if (interfaceC26357x23d5e2d0 != null) {
                try {
                    z17 = interfaceC26357x23d5e2d0.mo102222xf56d1818();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "isReadyForDownload failed, error:" + th6.toString());
                }
            }
            return z17;
        }
    }

    /* renamed from: isReadyForPlay */
    public static synchronized boolean m102344xccbd22c4() {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            boolean z17 = false;
            if (!f52937xf1d39b7b) {
                boolean m102414xccc05ea1 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102414xccc05ea1();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "isReadyForPlay ret:" + m102414xccc05ea1);
                return m102414xccc05ea1;
            }
            if (!f52933x7fa4f714) {
                return false;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 interfaceC26357x23d5e2d0 = f52931xb9a06834;
            if (interfaceC26357x23d5e2d0 != null) {
                try {
                    z17 = interfaceC26357x23d5e2d0.mo102223xccbd22c4();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52930x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "isReadyForPlay failed, error:" + th6.toString());
                }
            }
            return z17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCanUseAIDL */
    public static synchronized void m102345xbfd804c9(boolean z17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            f52933x7fa4f714 = z17;
        }
    }

    /* renamed from: setReadyForDownload */
    public static synchronized void m102346x97595750(boolean z17) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.class) {
            f52935xf4bc7365 = z17;
        }
    }

    /* renamed from: setUseService */
    public static void m102347x3206a930(boolean z17) {
        f52937xf1d39b7b = z17;
    }
}
