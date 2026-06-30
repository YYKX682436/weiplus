package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    private float f49584a;

    /* renamed from: b, reason: collision with root package name */
    private float f49585b;

    /* renamed from: c, reason: collision with root package name */
    private float f49586c;

    public gi(float f17, float f18, float f19) {
        this.f49584a = f17;
        this.f49585b = f18;
        this.f49586c = f19;
        double e17 = e();
        if (e17 != 0.0d) {
            this.f49584a = (float) (this.f49584a / e17);
            this.f49585b = (float) (this.f49585b / e17);
            this.f49586c = (float) (this.f49586c / e17);
        }
    }

    private static com.tencent.mapsdk.internal.gi b(com.tencent.mapsdk.internal.gi giVar) {
        return new com.tencent.mapsdk.internal.gi(-giVar.f49584a, -giVar.f49585b, -giVar.f49586c);
    }

    private float c() {
        return this.f49585b;
    }

    private float d() {
        return this.f49586c;
    }

    private double e() {
        float f17 = this.f49584a;
        float f18 = this.f49585b;
        float f19 = (f17 * f17) + (f18 * f18);
        float f27 = this.f49586c;
        return java.lang.Math.sqrt(f19 + (f27 * f27));
    }

    private void f() {
        double e17 = e();
        if (e17 == 0.0d) {
            return;
        }
        this.f49584a = (float) (this.f49584a / e17);
        this.f49585b = (float) (this.f49585b / e17);
        this.f49586c = (float) (this.f49586c / e17);
    }

    public final float[] a() {
        return new float[]{this.f49584a, this.f49585b, this.f49586c};
    }

    public final java.lang.String toString() {
        return this.f49584a + "," + this.f49585b + "," + this.f49586c;
    }

    private static com.tencent.mapsdk.internal.gi a(com.tencent.mapsdk.internal.gi giVar, com.tencent.mapsdk.internal.gi giVar2) {
        return new com.tencent.mapsdk.internal.gi(giVar.f49584a + giVar2.f49584a, giVar.f49585b + giVar2.f49585b, giVar.f49586c + giVar2.f49586c);
    }

    private float b() {
        return this.f49584a;
    }

    private double c(com.tencent.mapsdk.internal.gi giVar) {
        return (java.lang.Math.acos((((this.f49584a * giVar.f49584a) + (this.f49585b * giVar.f49585b)) + (this.f49586c * giVar.f49586c)) / (e() * giVar.e())) * 180.0d) / 3.141592653589793d;
    }

    private static com.tencent.mapsdk.internal.gi a(com.tencent.mapsdk.internal.gi giVar) {
        float f17 = giVar.f49584a;
        float f18 = giVar.f49585b;
        float e17 = (float) (f17 / giVar.e());
        float e18 = (float) ((-f18) / giVar.e());
        com.tencent.mapsdk.internal.gi giVar2 = new com.tencent.mapsdk.internal.gi(e17, e18, 0.0f);
        return (java.lang.Math.acos(((double) (((giVar2.f49584a * giVar.f49584a) + (giVar2.f49585b * giVar.f49585b)) + (giVar2.f49586c * giVar.f49586c))) / (giVar2.e() * giVar.e())) * 180.0d) / 3.141592653589793d != 90.0d ? new com.tencent.mapsdk.internal.gi(-e17, -e18, 0.0f) : giVar2;
    }
}
