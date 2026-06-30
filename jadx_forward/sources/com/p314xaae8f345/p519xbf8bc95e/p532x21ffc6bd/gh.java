package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gh {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj f131113a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj f131114b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj f131115c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gk f131116d;

    public gh() {
        this.f131116d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gk();
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar3) {
        this.f131113a = gjVar;
        this.f131114b = gjVar2;
        this.f131115c = gjVar3;
        this.f131116d.a(gjVar);
        this.f131116d.a(gjVar2);
        this.f131116d.a(gjVar3);
    }

    private float[] b() {
        return this.f131116d.a();
    }

    public gh(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar3) {
        this();
        a(gjVar, gjVar2, gjVar3);
    }

    public gh(float[] fArr) {
        this();
        a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj(fArr[0], fArr[1], fArr[2]), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj(fArr[3], fArr[4], fArr[5]), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj(fArr[6], fArr[7], fArr[8]));
    }

    private boolean a(float[] fArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj(fArr[0], fArr[1], fArr[2]);
        return ((double) java.lang.Math.abs(a() - ((new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gh(gjVar, this.f131113a, this.f131114b).a() + new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gh(gjVar, this.f131113a, this.f131115c).a()) + new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gh(gjVar, this.f131114b, this.f131115c).a()))) < 0.001d;
    }

    public final float a() {
        float[] a17 = this.f131116d.a();
        float a18 = a(a17[0], a17[1], a17[2], a17[3], a17[4], a17[5]);
        float a19 = a(a17[3], a17[4], a17[5], a17[6], a17[7], a17[8]);
        float a27 = ((a18 + a19) + a(a17[0], a17[1], a17[2], a17[6], a17[7], a17[8])) / 2.0f;
        return (float) java.lang.Math.sqrt((a27 - a18) * a27 * (a27 - a19) * (a27 - r1));
    }

    private static float a(float f17, float f18, float f19, float f27, float f28, float f29) {
        float f37 = f17 - f27;
        float f38 = f18 - f28;
        float f39 = f19 - f29;
        return (float) java.lang.Math.sqrt((f37 * f37) + (f38 * f38) + (f39 * f39));
    }
}
