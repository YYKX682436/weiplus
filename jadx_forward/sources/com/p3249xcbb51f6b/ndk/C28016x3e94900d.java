package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.FitScLibraryLoader */
/* loaded from: classes.dex */
public class C28016x3e94900d {

    /* renamed from: sLoaderImpl */
    private static com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader f63083x6b39eda6 = com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader.f63084x86df6221;

    /* renamed from: com.tenpay.ndk.FitScLibraryLoader$ILoader */
    /* loaded from: classes.dex */
    public interface ILoader {

        /* renamed from: DEFAULT */
        public static final com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader f63084x86df6221 = new com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader() { // from class: com.tenpay.ndk.FitScLibraryLoader.ILoader.1

            /* renamed from: _hellAccFlag_ */
            private byte f63085x7f11beae;

            @Override // com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader
            /* renamed from: loadLibrary */
            public void mo53497xeb57c8f5(java.lang.String str) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tenpay/ndk/FitScLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tenpay/ndk/FitScLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
        };

        /* renamed from: loadLibrary */
        void mo53497xeb57c8f5(java.lang.String str);
    }

    private C28016x3e94900d() {
    }

    /* renamed from: load */
    public static void m121820x32c4e6(java.lang.String str) {
        f63083x6b39eda6.mo53497xeb57c8f5(str);
    }

    /* renamed from: setLoader */
    public static void m121821x16e18715(com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader iLoader) {
        if (iLoader == null) {
            f63083x6b39eda6 = com.p3249xcbb51f6b.ndk.C28016x3e94900d.ILoader.f63084x86df6221;
        } else {
            f63083x6b39eda6 = iLoader;
        }
    }
}
