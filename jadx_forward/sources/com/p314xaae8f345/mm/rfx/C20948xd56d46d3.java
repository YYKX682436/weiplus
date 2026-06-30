package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagPlayer */
/* loaded from: classes13.dex */
public class C20948xd56d46d3 {

    /* renamed from: pagSurface */
    private com.p314xaae8f345.mm.rfx.C20951x8730befb f39094xce6b1f37 = null;

    /* renamed from: nativePlayer */
    private long f39093x899929d8 = 0;

    static {
        tq5.k.a("xlabeffect");
        m77476xb90145c7();
    }

    public C20948xd56d46d3() {
        m77480x67b070a6();
    }

    /* renamed from: nativeFinalize */
    private native void m77473xef578955();

    /* renamed from: nativeGetComposition */
    private native com.p314xaae8f345.mm.rfx.C20940x143804f8 m77474x75c8f86b();

    /* renamed from: nativeGetMatrix */
    private native void m77475xb07b460(float[] fArr);

    /* renamed from: nativeInit */
    private static final native void m77476xb90145c7();

    /* renamed from: nativeRelease */
    private final native void m77477x7f877f0();

    /* renamed from: nativeSetMatrix */
    private native void m77478xfe3ce86c(float f17, float f18, float f19, float f27, float f28, float f29);

    /* renamed from: nativeSetSurface */
    private native void m77479x28c4b162(long j17);

    /* renamed from: nativeSetup */
    private final native void m77480x67b070a6();

    /* renamed from: duration */
    public native long m77481x89444d94();

    /* renamed from: finalize */
    public void m77482xd764dc1e() {
        m77473xef578955();
    }

    /* renamed from: flush */
    public boolean m77483x5d03b04() {
        return m77484x58cef79(null);
    }

    /* renamed from: flushAndFenceSync */
    public native boolean m77484x58cef79(long[] jArr);

    /* renamed from: flushWithInfo */
    public native com.p314xaae8f345.mm.rfx.C20944x47b47a89 m77485x183a11b8();

    /* renamed from: getComposition */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77486xa7d55074() {
        return (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) m77474x75c8f86b();
    }

    /* renamed from: getProgress */
    public native double m77487x402effa3();

    /* renamed from: getSurface */
    public com.p314xaae8f345.mm.rfx.C20951x8730befb m77488xcf572877() {
        return this.f39094xce6b1f37;
    }

    /* renamed from: matrix */
    public android.graphics.Matrix m77489xbf8d97c1() {
        float[] fArr = new float[9];
        m77475xb07b460(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    /* renamed from: maxFrameRate */
    public native float m77490xcba736e9();

    /* renamed from: prepare */
    public native void m77491xed060d07();

    /* renamed from: release */
    public void m77492x41012807() {
        m77477x7f877f0();
    }

    /* renamed from: scaleMode */
    public native int m77493x900e020d();

    /* renamed from: setComposition */
    public native void m77494x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee);

    /* renamed from: setMatrix */
    public void m77495x17d9eec3(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        m77478xfe3ce86c(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    /* renamed from: setMaxFrameRate */
    public native void m77496x62e2c46b(float f17);

    /* renamed from: setProgress */
    public native void m77497x3ae760af(double d17);

    /* renamed from: setScaleMode */
    public native void m77498xebcf33cb(int i17);

    /* renamed from: setSurface */
    public void m77499x42c875eb(com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb) {
        this.f39094xce6b1f37 = c20951x8730befb;
        if (c20951x8730befb == null) {
            m77479x28c4b162(0L);
        } else {
            m77479x28c4b162(c20951x8730befb.f39099x58813c96);
        }
    }

    /* renamed from: waitSync */
    public native boolean m77500xe9f5db0(long j17);
}
