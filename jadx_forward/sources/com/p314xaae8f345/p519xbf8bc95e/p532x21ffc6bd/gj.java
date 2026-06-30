package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gj {

    /* renamed from: a, reason: collision with root package name */
    public float f131120a;

    /* renamed from: b, reason: collision with root package name */
    public float f131121b;

    /* renamed from: c, reason: collision with root package name */
    public float f131122c;

    /* renamed from: d, reason: collision with root package name */
    public float f131123d = 1.0f;

    public gj() {
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj a(float[] fArr) {
        float[] fArr2 = new float[4];
        android.opengl.Matrix.multiplyMV(fArr2, 0, fArr, 0, new float[]{this.f131120a, this.f131121b, this.f131122c, this.f131123d}, 0);
        float f17 = fArr2[0];
        float f18 = fArr2[3];
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj(f17 / f18, fArr2[1] / f18, fArr2[2] / f18);
    }

    /* renamed from: equals */
    public final boolean m36750xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj)) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj) obj;
        return this.f131120a == gjVar.f131120a && this.f131121b == gjVar.f131121b && this.f131122c == gjVar.f131122c;
    }

    /* renamed from: toString */
    public final java.lang.String m36751x9616526c() {
        return this.f131120a + "," + this.f131121b + "," + this.f131122c;
    }

    public gj(float f17, float f18, float f19) {
        this.f131120a = f17;
        this.f131121b = f18;
        this.f131122c = f19;
    }
}
