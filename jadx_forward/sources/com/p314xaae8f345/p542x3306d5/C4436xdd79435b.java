package com.p314xaae8f345.p542x3306d5;

/* renamed from: com.tencent.mars.WeChatMars */
/* loaded from: classes12.dex */
public class C4436xdd79435b {

    /* renamed from: CerName_Default */
    public static final java.lang.String f17569x682f68bd = "default";

    /* renamed from: CerName_Ilink */
    public static final java.lang.String f17570x1f90555f = "ilink";

    /* renamed from: CertVersion_Mainland */
    private static final int f17571x8512b92f = 1;

    /* renamed from: CertVersion_WeChatUS */
    private static final int f17572x2645f66f = 2;
    private static final java.lang.String TAG = "WeChatMars";

    /* renamed from: libAndromeda */
    public static final java.lang.String f17575x8fc4bb64 = "andromeda";

    /* renamed from: libMarsBase */
    public static final java.lang.String f17576xd7c0c0eb = "wechatbase";

    /* renamed from: libMarsComm */
    public static final java.lang.String f17577xd7c16926 = "marscomm";

    /* renamed from: libMarsMM */
    public static final java.lang.String f17578xf14e861a = "wechatmm";

    /* renamed from: libMarsNetwork */
    public static final java.lang.String f17579xe9a831d4 = "wechatnetwork";

    /* renamed from: libMarsQuic */
    public static final java.lang.String f17580xd7c7dc58 = "marsquic";

    /* renamed from: libMarsXlog */
    public static final java.lang.String f17581xd7cae9e6 = "wechatxlog";

    /* renamed from: _hellAccFlag_ */
    private byte f17583x7f11beae;

    /* renamed from: libModules */
    private static java.util.ArrayList<java.lang.String[]> f17582x4fa22d42 = new java.util.ArrayList<>();

    /* renamed from: appForegroundListener */
    private static final com.p314xaae8f345.mm.app.s2 f17573x66e0ef18 = new com.p314xaae8f345.mm.app.s2() { // from class: com.tencent.mars.WeChatMars.1
        @Override // com.p314xaae8f345.mm.app.t2
        /* renamed from: onAppBackground */
        public void mo8889x3be51a90(java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37520x3d65c882(false);
        }

        @Override // com.p314xaae8f345.mm.app.t2
        /* renamed from: onAppForeground */
        public void mo8890x1952ea5(java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37520x3d65c882(true);
        }
    };

    /* renamed from: hasInitialized */
    private static volatile boolean f17574x4383f7da = false;

    /* renamed from: checkLoadedModules */
    public static synchronized void m37505xab22279a(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        synchronized (com.p314xaae8f345.p542x3306d5.C4436xdd79435b.class) {
            if (arrayList == null) {
                return;
            }
            int i17 = 0;
            java.lang.String[] strArr = new java.lang.String[0];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loaded modules: " + java.util.Arrays.toString(arrayList.toArray(strArr)));
            java.util.Arrays.sort(strArr);
            f17582x4fa22d42.add(strArr);
            boolean z17 = true;
            for (int i18 = 0; i18 < f17582x4fa22d42.size(); i18++) {
                if (!java.util.Arrays.equals(f17582x4fa22d42.get(i18), f17582x4fa22d42.get(0))) {
                    z17 = false;
                }
            }
            if (!z17) {
                while (i17 < f17582x4fa22d42.size()) {
                    int i19 = i17 + 1;
                    for (int i27 = i19; i27 < f17582x4fa22d42.size() && (!m37508xb22a9223(f17582x4fa22d42.get(i17), f17582x4fa22d42.get(i27))); i27++) {
                    }
                    if (!z17) {
                        break;
                    } else {
                        i17 = i19;
                    }
                }
            }
            if (!z17) {
                throw new java.lang.IllegalStateException("mars lib module custom made error, pls check your *.so.");
            }
        }
    }

    /* renamed from: currentCertVer */
    public static int m37506xc91b5326() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
        return 1;
    }

    /* renamed from: getCallStack */
    public static java.lang.String m37507xc06a9414() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    /* renamed from: hasInterSection */
    public static boolean m37508xb22a9223(java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(str);
        }
        for (java.lang.String str2 : strArr2) {
            if (arrayList.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: init */
    public static void m37509x316510(android.content.Context context, android.os.Handler handler) {
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.m40107x316510(context, handler);
        f17574x4383f7da = true;
    }

    /* renamed from: initCert */
    private static void m37510xff85b54() {
        m37521xc39adf8f(m37506xc91b5326());
    }

    /* renamed from: loadCppSharedLibrary */
    public static void m37511x351470b9() {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mars/WeChatMars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mars/WeChatMars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: loadDependentLibraries */
    public static void m37512x13c589e0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m37507xc06a9414());
        fp.d0.o(f17577xd7c16926);
        fp.d0.o("wechatbase");
        fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
        fp.d0.o("andromeda");
        fp.d0.o("wechatmm");
    }

    /* renamed from: loadDependentLibrariesAll */
    public static void m37513xd8c8aba1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m37507xc06a9414());
        fp.d0.o(f17577xd7c16926);
        fp.d0.o("wechatbase");
        fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
        fp.d0.o("andromeda");
        fp.d0.o("marsquic");
        fp.d0.o("wechatmm");
        fp.d0.o("wechatnetwork");
    }

    /* renamed from: loadDependentLibrariesForNetwork */
    public static void m37514xb66baf25() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m37507xc06a9414());
        fp.d0.o("wechatbase");
        fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
        fp.d0.o("marsquic");
        fp.d0.o("wechatmm");
        fp.d0.o("wechatnetwork");
    }

    /* renamed from: onCreate */
    public static void m37516x3e5a77bb(boolean z17) {
        if (z17 && f17574x4383f7da) {
            m37515x3e5a77bb();
        } else if (!z17) {
            m37515x3e5a77bb();
        } else {
            throw new java.lang.IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
        f17573x66e0ef18.m43071x58998cd();
    }

    /* renamed from: onDestroy */
    public static void m37517xac79a11b() {
        m37518xa66071db();
        f17573x66e0ef18.m43072x2efc64();
    }

    /* renamed from: onDestroyImpl */
    private static void m37518xa66071db() {
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37477xac79a11b();
    }

    /* renamed from: onExceptionCrash */
    public static void m37519x2a942457() {
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37478x2a942457();
    }

    /* renamed from: onForeground */
    public static void m37520x3d65c882(boolean z17) {
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37479x3d65c882(z17);
    }

    /* renamed from: onInit */
    private static void m37521xc39adf8f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mars", "packerEncoderVersion %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37480xcb55566b(i17);
    }

    /* renamed from: onNetworkChange */
    public static void m37522xde9f63df() {
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37481xde9f63df();
    }

    /* renamed from: onSingalCrash */
    public static void m37523x79d8456e(int i17) {
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37482x79d8456e(i17);
    }

    /* renamed from: onCreate */
    public static void m37515x3e5a77bb() {
        m37510xff85b54();
        com.p314xaae8f345.p542x3306d5.C4432x9c03629.m37476x3e5a77bb();
    }
}
