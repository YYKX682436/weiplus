package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagDecoder */
/* loaded from: classes13.dex */
public class C20941x51967e92 {

    /* renamed from: nativeDecoder */
    private long f39067x22e6fc2d;

    static {
        tq5.k.a("xlabeffect");
        m77377xb90145c7();
    }

    private C20941x51967e92(long j17) {
        this.f39067x22e6fc2d = j17;
    }

    /* renamed from: Make */
    public static com.p314xaae8f345.mm.rfx.C20941x51967e92 m77370x247a0e(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee) {
        return m77371x247a0e(c20942x379cf5ee, c20942x379cf5ee.m77467x207cebed(), 1.0f);
    }

    /* renamed from: MakeFromScale */
    private static native long m77374xbfd95152(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee, float f17, float f18);

    /* renamed from: MakeFromWH */
    private static native long m77375x6fe603a9(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee, float f17, int i17, int i18);

    /* renamed from: nativeFinalize */
    private native void m77376xef578955();

    /* renamed from: nativeInit */
    private static native void m77377xb90145c7();

    /* renamed from: nativeRelease */
    private native void m77378x7f877f0();

    /* renamed from: checkFrameChanged */
    public native boolean m77379xf68939af(int i17);

    /* renamed from: copyFrameTo */
    public native boolean m77380xb6ae9793(android.graphics.Bitmap bitmap, int i17);

    /* renamed from: finalize */
    public void m77381xd764dc1e() {
        m77376xef578955();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: frameAtIndex */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap m77382x440cbe32(int r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.rfx.C20941x51967e92.m77382x440cbe32(int):android.graphics.Bitmap");
    }

    /* renamed from: frameRate */
    public native float m77383x207cebed();

    /* renamed from: height */
    public native int m77384xb7389127();

    /* renamed from: numFrames */
    public native int m77385x333fdfcc();

    /* renamed from: readFrame */
    public native boolean m77386xbc40ed77(int i17, android.hardware.HardwareBuffer hardwareBuffer);

    /* renamed from: release */
    public void m77387x41012807() {
        m77378x7f877f0();
    }

    /* renamed from: width */
    public native int m77388x6be2dc6();

    /* renamed from: Make */
    public static com.p314xaae8f345.mm.rfx.C20941x51967e92 m77373x247a0e(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee, int i17, int i18) {
        long m77375x6fe603a9 = m77375x6fe603a9(c20942x379cf5ee, c20942x379cf5ee.m77467x207cebed(), i17, i18);
        if (m77375x6fe603a9 == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20941x51967e92(m77375x6fe603a9);
    }

    /* renamed from: Make */
    public static com.p314xaae8f345.mm.rfx.C20941x51967e92 m77371x247a0e(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee, float f17, float f18) {
        long m77374xbfd95152 = m77374xbfd95152(c20942x379cf5ee, f17, f18);
        if (m77374xbfd95152 == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20941x51967e92(m77374xbfd95152);
    }

    /* renamed from: Make */
    public static com.p314xaae8f345.mm.rfx.C20941x51967e92 m77372x247a0e(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee, float f17, int i17, int i18) {
        long m77375x6fe603a9 = m77375x6fe603a9(c20942x379cf5ee, f17, i17, i18);
        if (m77375x6fe603a9 == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20941x51967e92(m77375x6fe603a9);
    }
}
