package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.SkylineJNI */
/* loaded from: classes7.dex */
public class C25602x506342f0 {

    /* renamed from: cronetClient */
    private static com.p314xaae8f345.p2936x80def495.jni.InterfaceC25600x80206bc f46922x556bb9e8;

    /* renamed from: reporter */
    private static com.p314xaae8f345.p2936x80def495.jni.InterfaceC25604x6e6b2163 f46923xe68be4e1;

    /* renamed from: skylineExperiment */
    private static com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 f46924x9895b672;

    private C25602x506342f0() {
    }

    /* renamed from: disableNewImage */
    public static native void m95931xaf1a32a3();

    /* renamed from: disableNewSVGImage */
    public static native void m95932xf9c76f0f();

    /* renamed from: enableNewImage */
    public static native void m95933x655e6a3e();

    /* renamed from: enableNewSVGImage */
    public static native void m95934x864a4d94();

    /* renamed from: exitFullscreen */
    public static native void m95935x6cac379(int i17, long j17);

    /* renamed from: getExperiment */
    public static java.lang.String m95936xe92a93f3(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 interfaceC25593x90f37129 = f46924x9895b672;
        return interfaceC25593x90f37129 == null ? str2 : interfaceC25593x90f37129.get(str, str2);
    }

    /* renamed from: getSkylineDebugInfo */
    public static native void m95937xdae6f802(java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    /* renamed from: idKeyReport */
    public static void m95938x7ce3fd98(int i17, int i18, int i19) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25604x6e6b2163 interfaceC25604x6e6b2163 = f46923xe68be4e1;
        if (interfaceC25604x6e6b2163 != null) {
            interfaceC25604x6e6b2163.mo95955x7ce3fd98(i17, i18, i19);
        }
    }

    /* renamed from: kvStatReport */
    public static void m95939x21d29873(int i17, java.lang.String str) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25604x6e6b2163 interfaceC25604x6e6b2163 = f46923xe68be4e1;
        if (interfaceC25604x6e6b2163 != null) {
            interfaceC25604x6e6b2163.mo95956x5eee527f(i17, str);
        }
    }

    /* renamed from: notifyCronetResponse */
    public static native void m95940x584236c7(int i17, int i18, int i19, java.lang.String[] strArr, java.lang.String[] strArr2, byte[] bArr);

    /* renamed from: setCronetClient */
    public static void m95941xeca7476a(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25600x80206bc interfaceC25600x80206bc) {
        f46922x556bb9e8 = interfaceC25600x80206bc;
    }

    /* renamed from: setDiskCacheDirPath */
    public static native void m95942x5024fb2f(java.lang.String str);

    /* renamed from: setEnableCronet */
    public static native void m95943x17408ca2(long j17, boolean z17);

    /* renamed from: setEnableCronet2 */
    public static native void m95944xd0d107d0(long j17, boolean z17, java.lang.String str, java.lang.String str2);

    /* renamed from: setEnableReport */
    public static native void m95945x30228619(boolean z17);

    /* renamed from: setReporter */
    public static void m95946x5d1e8363(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25604x6e6b2163 interfaceC25604x6e6b2163) {
        f46923xe68be4e1 = interfaceC25604x6e6b2163;
    }

    /* renamed from: setSkylineExperiment */
    public static void m95947xc7604a30(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 interfaceC25593x90f37129) {
        f46924x9895b672 = interfaceC25593x90f37129;
    }

    /* renamed from: startCronetHttpTask */
    public static void m95948x5ffa1e0c(int i17, java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25600x80206bc interfaceC25600x80206bc = f46922x556bb9e8;
        if (interfaceC25600x80206bc != null) {
            interfaceC25600x80206bc.mo95924xaaade5ec(i17, str, hashMap);
        } else {
            m95940x584236c7(i17, 0, 0, null, null, null);
        }
    }
}
