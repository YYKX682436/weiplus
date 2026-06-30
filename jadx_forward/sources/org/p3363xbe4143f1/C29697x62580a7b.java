package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGLayer */
/* loaded from: classes13.dex */
public class C29697x62580a7b {

    /* renamed from: LayerTypeImage */
    public static final int f75016x2c912010 = 5;

    /* renamed from: LayerTypeNull */
    public static final int f75017x5c492432 = 1;

    /* renamed from: LayerTypePreCompose */
    public static final int f75018x96321bda = 6;

    /* renamed from: LayerTypeShape */
    public static final int f75019x2d1bc656 = 4;

    /* renamed from: LayerTypeSolid */
    public static final int f75020x2d1f1d60 = 2;

    /* renamed from: LayerTypeText */
    public static final int f75021x5c4ba3d8 = 3;

    /* renamed from: LayerTypeUnknown */
    public static final int f75022xc9d949bf = 0;

    /* renamed from: nativeContext */
    protected long f75023xffae8598;

    static {
        b56.a.a("pag");
        m154833xb90145c7();
    }

    public C29697x62580a7b(long j17) {
        this.f75023xffae8598 = j17;
    }

    /* renamed from: getTotalMatrix */
    private native void m154830xa2b722ef(float[] fArr);

    /* renamed from: matrix */
    private native void m154831xbf8d97c1(float[] fArr);

    /* renamed from: nativeEquals */
    private native boolean m154832x77230eb6(org.p3363xbe4143f1.C29697x62580a7b c29697x62580a7b);

    /* renamed from: nativeInit */
    private static native void m154833xb90145c7();

    /* renamed from: nativeRelease */
    private native void m154834x7f877f0();

    /* renamed from: setMatrix */
    private native void m154835x17d9eec3(float[] fArr);

    /* renamed from: currentTime */
    public native long m154836x23d61fe6();

    /* renamed from: duration */
    public native long m154837x89444d94();

    /* renamed from: editableIndex */
    public native int m154838xd1fea8ce();

    /* renamed from: equals */
    public boolean m154839xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.p3363xbe4143f1.C29697x62580a7b) {
            return m154832x77230eb6((org.p3363xbe4143f1.C29697x62580a7b) obj);
        }
        return false;
    }

    /* renamed from: excludedFromTimeline */
    public native boolean m154840x4d53d8f5();

    /* renamed from: finalize */
    public void m154841xd764dc1e() {
        m154834x7f877f0();
    }

    /* renamed from: frameRate */
    public native float m154842x207cebed();

    /* renamed from: getBounds */
    public native android.graphics.RectF m154843x12a519ab();

    /* renamed from: getProgress */
    public native double m154844x402effa3();

    /* renamed from: getTotalMatrix */
    public android.graphics.Matrix m154845xa2b722ef() {
        float[] fArr = new float[9];
        m154830xa2b722ef(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    /* renamed from: globalToLocalTime */
    public native long m154846xa00234fa(long j17);

    /* renamed from: hashCode */
    public int m154847x8cdac1b() {
        long j17 = this.f75023xffae8598;
        return ((int) (j17 ^ (j17 >>> 32))) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de;
    }

    /* renamed from: layerName */
    public native java.lang.String m154848x9cc7b37c();

    /* renamed from: layerType */
    public native int m154849x9ccac82b();

    /* renamed from: localTimeToGlobal */
    public native long m154850x6973faf6(long j17);

    /* renamed from: markers */
    public native org.p3363xbe4143f1.C29698xea5b0450[] m154851x3205f379();

    /* renamed from: matrix */
    public android.graphics.Matrix m154852xbf8d97c1() {
        float[] fArr = new float[9];
        m154831xbf8d97c1(fArr);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    /* renamed from: parent */
    public native org.p3363xbe4143f1.C29687x78413754 m154853xc4ab08aa();

    /* renamed from: resetMatrix */
    public native void m154854xc6ab29f0();

    /* renamed from: setCurrentTime */
    public native void m154855x9411da24(long j17);

    /* renamed from: setExcludedFromTimeline */
    public native void m154856x7572c477(boolean z17);

    /* renamed from: setMatrix */
    public void m154857x17d9eec3(android.graphics.Matrix matrix) {
        if (matrix == null) {
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        m154835x17d9eec3(fArr);
    }

    /* renamed from: setProgress */
    public native void m154858x3ae760af(double d17);

    /* renamed from: setStartTime */
    public native void m154859xdcd6bc0d(long j17);

    /* renamed from: setVisible */
    public native void m154860xcd1079b0(boolean z17);

    /* renamed from: startTime */
    public native long m154861x81158a4f();

    /* renamed from: trackMatteLayer */
    public native org.p3363xbe4143f1.C29697x62580a7b m154862x4435afab();

    /* renamed from: visible */
    public native boolean m154863x1bd1f072();
}
