package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.FitHkWxLibraryLoader */
/* loaded from: classes.dex */
public class C28014xdc86afd9 {

    /* renamed from: sLoaderImpl */
    private static com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader f63079x6b39eda6 = com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader.f63080x86df6221;

    /* renamed from: com.tenpay.ndk.FitHkWxLibraryLoader$ILoader */
    /* loaded from: classes.dex */
    public interface ILoader {

        /* renamed from: DEFAULT */
        public static final com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader f63080x86df6221 = new com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader() { // from class: com.tenpay.ndk.FitHkWxLibraryLoader.ILoader.1

            /* renamed from: _hellAccFlag_ */
            private byte f63081x7f11beae;

            @Override // com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader
            /* renamed from: loadLibrary */
            public void mo121815xeb57c8f5(java.lang.String str) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tenpay/ndk/FitHkWxLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tenpay/ndk/FitHkWxLibraryLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
        };

        /* renamed from: loadLibrary */
        void mo121815xeb57c8f5(java.lang.String str);
    }

    /* renamed from: load */
    public static void m121812x32c4e6(java.lang.String str) {
        f63079x6b39eda6.mo121815xeb57c8f5(str);
    }

    /* renamed from: setLoader */
    public static void m121813x16e18715(com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader iLoader) {
        if (iLoader == null) {
            f63079x6b39eda6 = com.p3249xcbb51f6b.ndk.C28014xdc86afd9.ILoader.f63080x86df6221;
        } else {
            f63079x6b39eda6 = iLoader;
        }
    }
}
