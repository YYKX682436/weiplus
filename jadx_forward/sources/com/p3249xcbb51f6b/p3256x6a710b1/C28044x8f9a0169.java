package com.p3249xcbb51f6b.p3256x6a710b1;

/* renamed from: com.tenpay.utils.AndroidLibLoader */
/* loaded from: classes.dex */
public class C28044x8f9a0169 {

    /* renamed from: sLoaderImpl */
    private static com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader f65654x6b39eda6 = com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader.f65655x86df6221;

    /* renamed from: com.tenpay.utils.AndroidLibLoader$ILoader */
    /* loaded from: classes.dex */
    public interface ILoader {

        /* renamed from: DEFAULT */
        public static final com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader f65655x86df6221 = new com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader() { // from class: com.tenpay.utils.AndroidLibLoader.ILoader.1

            /* renamed from: _hellAccFlag_ */
            private byte f65656x7f11beae;

            @Override // com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader
            /* renamed from: loadLibrary */
            public void mo122031xeb57c8f5(java.lang.String str) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tenpay/utils/AndroidLibLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tenpay/utils/AndroidLibLoader$ILoader$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            }
        };

        /* renamed from: loadLibrary */
        void mo122031xeb57c8f5(java.lang.String str);
    }

    /* renamed from: load */
    public static void m122028x32c4e6(java.lang.String str) {
        f65654x6b39eda6.mo122031xeb57c8f5(str);
    }

    /* renamed from: setLoader */
    public static void m122029x16e18715(com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader iLoader) {
        if (iLoader == null) {
            f65654x6b39eda6 = com.p3249xcbb51f6b.p3256x6a710b1.C28044x8f9a0169.ILoader.f65655x86df6221;
        } else {
            f65654x6b39eda6 = iLoader;
        }
    }
}
