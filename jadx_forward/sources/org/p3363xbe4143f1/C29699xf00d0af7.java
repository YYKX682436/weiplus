package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGPlayer */
/* loaded from: classes13.dex */
public class C29699xf00d0af7 {

    /* renamed from: a, reason: collision with root package name */
    private org.p3363xbe4143f1.C29703xc0897f57 f429335a = null;

    /* renamed from: nativeContext */
    private long f75027xffae8598 = 0;

    static {
        b56.a.a("pag");
        m154867xb90145c7();
    }

    public C29699xf00d0af7() {
        m154871x67b070a6();
    }

    /* renamed from: nativeFinalize */
    private native void m154865xef578955();

    /* renamed from: nativeGetMatrix */
    private native void m154866xb07b460(float[] fArr);

    /* renamed from: nativeInit */
    private static final native void m154867xb90145c7();

    /* renamed from: nativeRelease */
    private final native void m154868x7f877f0();

    /* renamed from: nativeSetMatrix */
    private native void m154869xfe3ce86c(float f17, float f18, float f19, float f27, float f28, float f29);

    /* renamed from: nativeSetSurface */
    private native void m154870x28c4b162(long j17);

    /* renamed from: nativeSetup */
    private final native void m154871x67b070a6();

    /* renamed from: cacheEnabled */
    public native boolean m154872x17ad5d5f();

    /* renamed from: cacheScale */
    public native float m154873x10acae8();

    /* renamed from: currentFrame */
    public native long m154874x562c7f74();

    /* renamed from: duration */
    public native long m154875x89444d94();

    /* renamed from: finalize */
    public void m154876xd764dc1e() {
        m154865xef578955();
    }

    /* renamed from: flush */
    public boolean m154877x5d03b04() {
        return m154878x58cef79(null);
    }

    /* renamed from: flushAndFenceSync */
    public native boolean m154878x58cef79(long[] jArr);

    /* renamed from: getBounds */
    public native android.graphics.RectF m154879x12a519ab(org.p3363xbe4143f1.C29697x62580a7b c29697x62580a7b);

    /* renamed from: getComposition */
    public native org.p3363xbe4143f1.C29687x78413754 m154880xa7d55074();

    /* renamed from: getLayersUnderPoint */
    public native org.p3363xbe4143f1.C29697x62580a7b[] m154881x149c17f0(float f17, float f18);

    /* renamed from: getProgress */
    public native double m154882x402effa3();

    /* renamed from: getSurface */
    public org.p3363xbe4143f1.C29703xc0897f57 m154883xcf572877() {
        return this.f429335a;
    }

    /* renamed from: hitTestPoint */
    public native boolean m154884x13850dcb(org.p3363xbe4143f1.C29697x62580a7b c29697x62580a7b, float f17, float f18, boolean z17);

    /* renamed from: matrix */
    public android.graphics.Matrix m154885xbf8d97c1() {
        float[] fArr = new float[9];
        m154866xb07b460(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    /* renamed from: maxFrameRate */
    public native float m154886xcba736e9();

    /* renamed from: prepare */
    public native void m154887xed060d07();

    /* renamed from: release */
    public void m154888x41012807() {
        m154868x7f877f0();
    }

    /* renamed from: scaleMode */
    public native int m154889x900e020d();

    /* renamed from: setCacheEnabled */
    public native void m154890xaee8eae1(boolean z17);

    /* renamed from: setCacheScale */
    public native void m154891x1d6fd0ea(float f17);

    /* renamed from: setComposition */
    public native void m154892x3e3ac3e8(org.p3363xbe4143f1.C29687x78413754 c29687x78413754);

    /* renamed from: setMatrix */
    public void m154893x17d9eec3(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        m154869xfe3ce86c(fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
    }

    /* renamed from: setMaxFrameRate */
    public native void m154894x62e2c46b(float f17);

    /* renamed from: setProgress */
    public native void m154895x3ae760af(double d17);

    /* renamed from: setScaleMode */
    public native void m154896xebcf33cb(int i17);

    /* renamed from: setSurface */
    public void m154897x42c875eb(org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57) {
        this.f429335a = c29703xc0897f57;
        if (c29703xc0897f57 == null) {
            m154870x28c4b162(0L);
        } else {
            m154870x28c4b162(c29703xc0897f57.f75032x58813c96);
        }
    }

    /* renamed from: setUseDiskCache */
    public native void m154898xda8bdba0(boolean z17);

    /* renamed from: setVideoEnabled */
    public native void m154899x2e85abc8(boolean z17);

    /* renamed from: useDiskCache */
    public native boolean m154900x43504e1e();

    /* renamed from: videoEnabled */
    public native boolean m154901x974a1e46();

    /* renamed from: waitSync */
    public native boolean m154902xe9f5db0(long j17);
}
