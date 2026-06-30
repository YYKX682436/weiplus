package com.p314xaae8f345.p2841xd11c237d;

/* renamed from: com.tencent.paymars.WeChatMars */
/* loaded from: classes12.dex */
public class C23006xdd79435b {

    /* renamed from: CerName_Default */
    public static final java.lang.String f40059x682f68bd = "default";

    /* renamed from: CerName_Ilink */
    public static final java.lang.String f40060x1f90555f = "ilink";

    /* renamed from: CertVersion_Mainland */
    private static final int f40061x8512b92f = 1;

    /* renamed from: CertVersion_WeChatUS */
    private static final int f40062x2645f66f = 2;
    private static final java.lang.String TAG = "WeChatPayMars";

    /* renamed from: libPayMarsBase */
    public static final java.lang.String f40069x4de7ac49 = "wechatpaybase";

    /* renamed from: libPayMarsMM */
    public static final java.lang.String f40070x1054b0f8 = "wechatpaymm";

    /* renamed from: libPayMarsNetwork */
    public static final java.lang.String f40071x64c021b6 = "wechatpaynetwork";

    /* renamed from: _hellAccFlag_ */
    private byte f40073x7f11beae;

    /* renamed from: libModules */
    private static java.util.ArrayList<java.lang.String[]> f40068x4fa22d42 = new java.util.ArrayList<>();

    /* renamed from: appForegroundListener */
    private static final com.p314xaae8f345.mm.app.s2 f40064x66e0ef18 = new com.p314xaae8f345.mm.app.s2() { // from class: com.tencent.paymars.WeChatMars.1
        @Override // com.p314xaae8f345.mm.app.t2
        /* renamed from: onAppBackground */
        public void mo8889x3be51a90(java.lang.String str) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84233x3d65c882(false);
        }

        @Override // com.p314xaae8f345.mm.app.t2
        /* renamed from: onAppForeground */
        public void mo8890x1952ea5(java.lang.String str) {
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84233x3d65c882(true);
        }
    };

    /* renamed from: hasInitialized */
    private static volatile boolean f40067x4383f7da = false;

    /* renamed from: hasCreated */
    private static volatile boolean f40066xb67242ee = false;

    /* renamed from: realOpen */
    private static volatile boolean f40072xccb8f508 = false;

    /* renamed from: firstQueryAbtest */
    private static boolean f40065xe9c6ee4b = true;

    /* renamed from: abtestCallCount */
    private static int f40063x6b0f025e = 0;

    /* renamed from: abtestOpen */
    public static boolean m84216xda9a11d() {
        boolean l17 = j62.e.g().l("clicfg_enable_paymars_android", false, true, true);
        if (!l17) {
            f40072xccb8f508 = false;
        } else if (f40065xe9c6ee4b) {
            f40072xccb8f508 = true;
        }
        f40065xe9c6ee4b = false;
        int i17 = f40063x6b0f025e + 1;
        f40063x6b0f025e = i17;
        if (i17 >= 25) {
            f40063x6b0f025e = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "paymars abtest-open:%s hasCreated:%s realOpen:%s", java.lang.Boolean.valueOf(l17), java.lang.Boolean.valueOf(f40066xb67242ee), java.lang.Boolean.valueOf(f40072xccb8f508));
        }
        return f40072xccb8f508;
    }

    /* renamed from: checkLoadedModules */
    public static synchronized void m84217xab22279a(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        synchronized (com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.class) {
            if (arrayList == null) {
                return;
            }
            int i17 = 0;
            java.lang.String[] strArr = new java.lang.String[0];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "loaded modules: " + java.util.Arrays.toString(arrayList.toArray(strArr)));
            java.util.Arrays.sort(strArr);
            f40068x4fa22d42.add(strArr);
            boolean z17 = true;
            for (int i18 = 0; i18 < f40068x4fa22d42.size(); i18++) {
                if (!java.util.Arrays.equals(f40068x4fa22d42.get(i18), f40068x4fa22d42.get(0))) {
                    z17 = false;
                }
            }
            if (!z17) {
                while (i17 < f40068x4fa22d42.size()) {
                    int i19 = i17 + 1;
                    for (int i27 = i19; i27 < f40068x4fa22d42.size() && (!m84220xb22a9223(f40068x4fa22d42.get(i17), f40068x4fa22d42.get(i27))); i27++) {
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
    public static int m84218xc91b5326() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z8 z8Var = yp5.a.f545942a;
        return 1;
    }

    /* renamed from: getCallStack */
    public static java.lang.String m84219xc06a9414() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    /* renamed from: hasInterSection */
    public static boolean m84220xb22a9223(java.lang.String[] strArr, java.lang.String[] strArr2) {
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
    public static void m84221x316510(android.content.Context context, android.os.Handler handler) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start init, before hasInitialized:%s", java.lang.Boolean.valueOf(f40067x4383f7da));
        f40067x4383f7da = true;
    }

    /* renamed from: initCert */
    private static void m84222xff85b54() {
        m84234xc39adf8f(m84218xc91b5326());
    }

    /* renamed from: isEnable */
    public static boolean m84223xdac2174d() {
        return m84216xda9a11d() && f40066xb67242ee;
    }

    /* renamed from: loadCppSharedLibrary */
    public static void m84224x351470b9() {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/paymars/WeChatMars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/paymars/WeChatMars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: loadDependentLibraries */
    public static void m84225x13c589e0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m84219xc06a9414());
        fp.d0.o(f40069x4de7ac49);
        fp.d0.o(f40070x1054b0f8);
    }

    /* renamed from: loadDependentLibrariesAll */
    public static void m84226xd8c8aba1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m84219xc06a9414());
        fp.d0.o(f40069x4de7ac49);
        fp.d0.o(f40070x1054b0f8);
        fp.d0.o(f40071x64c021b6);
    }

    /* renamed from: loadDependentLibrariesForNetwork */
    public static void m84227xb66baf25() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "load mars from %s", m84219xc06a9414());
        fp.d0.o(f40069x4de7ac49);
        fp.d0.o(f40070x1054b0f8);
        fp.d0.o(f40071x64c021b6);
    }

    /* renamed from: onCreate */
    public static void m84229x3e5a77bb(boolean z17) {
        if (z17 && f40067x4383f7da) {
            m84228x3e5a77bb();
        } else if (!z17) {
            m84228x3e5a77bb();
        } else {
            throw new java.lang.IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
        f40064x66e0ef18.m43071x58998cd();
    }

    /* renamed from: onDestroy */
    public static void m84230xac79a11b() {
        m84231xa66071db();
        f40064x66e0ef18.m43072x2efc64();
    }

    /* renamed from: onDestroyImpl */
    private static void m84231xa66071db() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84188xac79a11b();
    }

    /* renamed from: onExceptionCrash */
    public static void m84232x2a942457() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84189x2a942457();
    }

    /* renamed from: onForeground */
    public static void m84233x3d65c882(boolean z17) {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84190x3d65c882(z17);
    }

    /* renamed from: onInit */
    private static void m84234xc39adf8f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "packerEncoderVersion %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84191xcb55566b(i17);
    }

    /* renamed from: onNetworkChange */
    public static void m84235xde9f63df() {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84192xde9f63df();
    }

    /* renamed from: onSingalCrash */
    public static void m84236x79d8456e(int i17) {
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84193x79d8456e(i17);
    }

    /* renamed from: onCreate */
    public static void m84228x3e5a77bb() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start onCreate, before hasCreated:%s", java.lang.Boolean.valueOf(f40066xb67242ee));
        f40066xb67242ee = true;
        m84222xff85b54();
        com.p314xaae8f345.p2841xd11c237d.C23002x9c03629.m84187x3e5a77bb();
    }
}
