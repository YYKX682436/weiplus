package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.SkylineLibraryLoader */
/* loaded from: classes7.dex */
public class C25603xf5ecd239 {

    /* renamed from: DEFAULT */
    private static com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402 f46925x86df6221;

    /* renamed from: sSkylineLibraryLoader */
    private static com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402 f46926x9ea31b2c;

    static {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402 interfaceC25596x8d8ad402 = new com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402() { // from class: com.tencent.skyline.jni.SkylineLibraryLoader.1

            /* renamed from: _hellAccFlag_ */
            private byte f46927x7f11beae;

            @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402
            /* renamed from: afterLoad */
            public boolean mo95909x3cbcf0e2() {
                return false;
            }

            @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402
            /* renamed from: beforeLoad */
            public boolean mo95910x1ee4a105() {
                return false;
            }

            @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402
            /* renamed from: load */
            public boolean mo95911x32c4e6(java.lang.String str) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/skyline/jni/SkylineLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/skyline/jni/SkylineLibraryLoader$1", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    return true;
                } catch (java.lang.Exception e17) {
                    java.lang.String.format("%s load fail %s", str, e17);
                    return true;
                }
            }
        };
        f46925x86df6221 = interfaceC25596x8d8ad402;
        f46926x9ea31b2c = interfaceC25596x8d8ad402;
    }

    /* renamed from: afterLoad */
    public static void m95950x3cbcf0e2() {
        f46926x9ea31b2c.mo95909x3cbcf0e2();
    }

    /* renamed from: beforeLoad */
    public static void m95951x1ee4a105() {
        f46926x9ea31b2c.mo95910x1ee4a105();
    }

    /* renamed from: initLibraryLoader */
    public static void m95952xeddb0d7e(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402 interfaceC25596x8d8ad402) {
        f46926x9ea31b2c = interfaceC25596x8d8ad402;
    }

    /* renamed from: initXWebLibraryLoader */
    public static void m95953x24b5e722(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25596x8d8ad402 interfaceC25596x8d8ad402) {
        f46926x9ea31b2c = interfaceC25596x8d8ad402;
    }

    /* renamed from: load */
    public static boolean m95954x32c4e6(java.lang.String str) {
        return f46926x9ea31b2c.mo95911x32c4e6(str);
    }
}
