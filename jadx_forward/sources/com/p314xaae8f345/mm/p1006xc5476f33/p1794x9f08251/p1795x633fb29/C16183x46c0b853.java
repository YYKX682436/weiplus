package com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29;

/* renamed from: com.tencent.mm.plugin.licence.model.LibCardRecog */
/* loaded from: classes13.dex */
public final class C16183x46c0b853 {

    /* renamed from: _hellAccFlag_ */
    private byte f37118x7f11beae;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("IDCardRecog");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/licence/model/LibCardRecog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/plugin/licence/model/LibCardRecog", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: recognizeBankCardGetVersion */
    public static native int m65224x93c5525c();

    /* renamed from: recognizeBankCardInit */
    public static native int m65225x1678b24a(int i17, int i18, boolean z17);

    /* renamed from: recognizeBankCardProcess */
    public static native int m65226x81010ef5(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16181x59f50e5a c16181x59f50e5a, boolean[] zArr);

    /* renamed from: recognizeBankCardRelease */
    public static native int m65227xd475188d();

    /* renamed from: recognizeBankCardSegmentNumber */
    public static native java.lang.String m65228x384fe862(java.lang.String str, int i17, int[] iArr);

    /* renamed from: recognizeCardInit */
    public static native int m65229xdd674aee(int i17, int i18, int i19);

    /* renamed from: recognizeCardProcess */
    public static native int m65230x70b603d1(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, com.p314xaae8f345.mm.p1006xc5476f33.p1794x9f08251.p1795x633fb29.C16182x357affe c16182x357affe, boolean[] zArr);

    /* renamed from: recognizeCardRelease */
    public static native int m65231xc42a0d69();
}
