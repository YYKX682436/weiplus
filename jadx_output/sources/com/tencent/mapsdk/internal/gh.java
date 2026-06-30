package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gh {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.gj f49580a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.gj f49581b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mapsdk.internal.gj f49582c;

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mapsdk.internal.gk f49583d;

    public gh() {
        this.f49583d = new com.tencent.mapsdk.internal.gk();
    }

    private void a(com.tencent.mapsdk.internal.gj gjVar, com.tencent.mapsdk.internal.gj gjVar2, com.tencent.mapsdk.internal.gj gjVar3) {
        this.f49580a = gjVar;
        this.f49581b = gjVar2;
        this.f49582c = gjVar3;
        this.f49583d.a(gjVar);
        this.f49583d.a(gjVar2);
        this.f49583d.a(gjVar3);
    }

    private float[] b() {
        return this.f49583d.a();
    }

    public gh(com.tencent.mapsdk.internal.gj gjVar, com.tencent.mapsdk.internal.gj gjVar2, com.tencent.mapsdk.internal.gj gjVar3) {
        this();
        a(gjVar, gjVar2, gjVar3);
    }

    public gh(float[] fArr) {
        this();
        a(new com.tencent.mapsdk.internal.gj(fArr[0], fArr[1], fArr[2]), new com.tencent.mapsdk.internal.gj(fArr[3], fArr[4], fArr[5]), new com.tencent.mapsdk.internal.gj(fArr[6], fArr[7], fArr[8]));
    }

    private boolean a(float[] fArr) {
        com.tencent.mapsdk.internal.gj gjVar = new com.tencent.mapsdk.internal.gj(fArr[0], fArr[1], fArr[2]);
        return ((double) java.lang.Math.abs(a() - ((new com.tencent.mapsdk.internal.gh(gjVar, this.f49580a, this.f49581b).a() + new com.tencent.mapsdk.internal.gh(gjVar, this.f49580a, this.f49582c).a()) + new com.tencent.mapsdk.internal.gh(gjVar, this.f49581b, this.f49582c).a()))) < 0.001d;
    }

    public final float a() {
        float[] a17 = this.f49583d.a();
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
