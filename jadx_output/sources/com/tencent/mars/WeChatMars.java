package com.tencent.mars;

/* loaded from: classes12.dex */
public class WeChatMars {
    public static final java.lang.String CerName_Default = "default";
    public static final java.lang.String CerName_Ilink = "ilink";
    private static final int CertVersion_Mainland = 1;
    private static final int CertVersion_WeChatUS = 2;
    private static final java.lang.String TAG = "WeChatMars";
    public static final java.lang.String libAndromeda = "andromeda";
    public static final java.lang.String libMarsBase = "wechatbase";
    public static final java.lang.String libMarsComm = "marscomm";
    public static final java.lang.String libMarsMM = "wechatmm";
    public static final java.lang.String libMarsNetwork = "wechatnetwork";
    public static final java.lang.String libMarsQuic = "marsquic";
    public static final java.lang.String libMarsXlog = "wechatxlog";
    private byte _hellAccFlag_;
    private static java.util.ArrayList<java.lang.String[]> libModules = new java.util.ArrayList<>();
    private static final com.tencent.mm.app.s2 appForegroundListener = new com.tencent.mm.app.s2() { // from class: com.tencent.mars.WeChatMars.1
        @Override // com.tencent.mm.app.t2
        public void onAppBackground(java.lang.String str) {
            com.tencent.mars.WeChatMars.onForeground(false);
        }

        @Override // com.tencent.mm.app.t2
        public void onAppForeground(java.lang.String str) {
            com.tencent.mars.WeChatMars.onForeground(true);
        }
    };
    private static volatile boolean hasInitialized = false;

    public static synchronized void checkLoadedModules(java.util.ArrayList<java.lang.String> arrayList, java.lang.String str) {
        synchronized (com.tencent.mars.WeChatMars.class) {
            if (arrayList == null) {
                return;
            }
            int i17 = 0;
            java.lang.String[] strArr = new java.lang.String[0];
            com.tencent.mars.xlog.Log.i(str, "loaded modules: " + java.util.Arrays.toString(arrayList.toArray(strArr)));
            java.util.Arrays.sort(strArr);
            libModules.add(strArr);
            boolean z17 = true;
            for (int i18 = 0; i18 < libModules.size(); i18++) {
                if (!java.util.Arrays.equals(libModules.get(i18), libModules.get(0))) {
                    z17 = false;
                }
            }
            if (!z17) {
                while (i17 < libModules.size()) {
                    int i19 = i17 + 1;
                    for (int i27 = i19; i27 < libModules.size() && (!hasInterSection(libModules.get(i17), libModules.get(i27))); i27++) {
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

    public static int currentCertVer() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        com.tencent.mm.sdk.platformtools.z8 z8Var = yp5.a.f464409a;
        return 1;
    }

    public static java.lang.String getCallStack() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.StackTraceElement stackTraceElement : java.lang.Thread.currentThread().getStackTrace()) {
            sb6.append(stackTraceElement.toString());
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static boolean hasInterSection(java.lang.String[] strArr, java.lang.String[] strArr2) {
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

    public static void init(android.content.Context context, android.os.Handler handler) {
        com.tencent.mars.comm.PlatformComm.init(context, handler);
        hasInitialized = true;
    }

    private static void initCert() {
        onInit(currentCertVer());
    }

    public static void loadCppSharedLibrary() {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("c++_shared");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mars/WeChatMars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mars/WeChatMars", "loadCppSharedLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void loadDependentLibraries() {
        com.tencent.mars.xlog.Log.i(TAG, "load mars from %s", getCallStack());
        fp.d0.o(libMarsComm);
        fp.d0.o("wechatbase");
        fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
        fp.d0.o("andromeda");
        fp.d0.o("wechatmm");
    }

    public static void loadDependentLibrariesAll() {
        com.tencent.mars.xlog.Log.i(TAG, "load mars from %s", getCallStack());
        fp.d0.o(libMarsComm);
        fp.d0.o("wechatbase");
        fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
        fp.d0.o("andromeda");
        fp.d0.o("marsquic");
        fp.d0.o("wechatmm");
        fp.d0.o("wechatnetwork");
    }

    public static void loadDependentLibrariesForNetwork() {
        com.tencent.mars.xlog.Log.i(TAG, "load mars from %s", getCallStack());
        fp.d0.o("wechatbase");
        fp.d0.o(org.chromium.net.impl.CronetLibraryLoader.libraryName());
        fp.d0.o("marsquic");
        fp.d0.o("wechatmm");
        fp.d0.o("wechatnetwork");
    }

    public static void onCreate(boolean z17) {
        if (z17 && hasInitialized) {
            onCreate();
        } else if (!z17) {
            onCreate();
        } else {
            throw new java.lang.IllegalStateException("function MarsCore.init must be executed before Mars.onCreate when application firststartup.");
        }
        appForegroundListener.alive();
    }

    public static void onDestroy() {
        onDestroyImpl();
        appForegroundListener.dead();
    }

    private static void onDestroyImpl() {
        com.tencent.mars.BaseEvent.onDestroy();
    }

    public static void onExceptionCrash() {
        com.tencent.mars.BaseEvent.onExceptionCrash();
    }

    public static void onForeground(boolean z17) {
        com.tencent.mars.BaseEvent.onForeground(z17);
    }

    private static void onInit(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mars", "packerEncoderVersion %s", java.lang.Integer.valueOf(i17));
        com.tencent.mars.BaseEvent.onInitConfigBeforeOnCreate(i17);
    }

    public static void onNetworkChange() {
        com.tencent.mars.BaseEvent.onNetworkChange();
    }

    public static void onSingalCrash(int i17) {
        com.tencent.mars.BaseEvent.onSingalCrash(i17);
    }

    public static void onCreate() {
        initCert();
        com.tencent.mars.BaseEvent.onCreate();
    }
}
