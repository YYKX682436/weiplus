package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    private float f131117a;

    /* renamed from: b, reason: collision with root package name */
    private float f131118b;

    /* renamed from: c, reason: collision with root package name */
    private float f131119c;

    public gi(float f17, float f18, float f19) {
        this.f131117a = f17;
        this.f131118b = f18;
        this.f131119c = f19;
        double e17 = e();
        if (e17 != 0.0d) {
            this.f131117a = (float) (this.f131117a / e17);
            this.f131118b = (float) (this.f131118b / e17);
            this.f131119c = (float) (this.f131119c / e17);
        }
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi giVar) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi(-giVar.f131117a, -giVar.f131118b, -giVar.f131119c);
    }

    private float c() {
        return this.f131118b;
    }

    private float d() {
        return this.f131119c;
    }

    private double e() {
        float f17 = this.f131117a;
        float f18 = this.f131118b;
        float f19 = (f17 * f17) + (f18 * f18);
        float f27 = this.f131119c;
        return java.lang.Math.sqrt(f19 + (f27 * f27));
    }

    private void f() {
        double e17 = e();
        if (e17 == 0.0d) {
            return;
        }
        this.f131117a = (float) (this.f131117a / e17);
        this.f131118b = (float) (this.f131118b / e17);
        this.f131119c = (float) (this.f131119c / e17);
    }

    public final float[] a() {
        return new float[]{this.f131117a, this.f131118b, this.f131119c};
    }

    /* renamed from: toString */
    public final java.lang.String m36749x9616526c() {
        return this.f131117a + "," + this.f131118b + "," + this.f131119c;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi giVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi giVar2) {
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi(giVar.f131117a + giVar2.f131117a, giVar.f131118b + giVar2.f131118b, giVar.f131119c + giVar2.f131119c);
    }

    private float b() {
        return this.f131117a;
    }

    private double c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi giVar) {
        return (java.lang.Math.acos((((this.f131117a * giVar.f131117a) + (this.f131118b * giVar.f131118b)) + (this.f131119c * giVar.f131119c)) / (e() * giVar.e())) * 180.0d) / 3.141592653589793d;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi giVar) {
        float f17 = giVar.f131117a;
        float f18 = giVar.f131118b;
        float e17 = (float) (f17 / giVar.e());
        float e18 = (float) ((-f18) / giVar.e());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi giVar2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi(e17, e18, 0.0f);
        return (java.lang.Math.acos(((double) (((giVar2.f131117a * giVar.f131117a) + (giVar2.f131118b * giVar.f131118b)) + (giVar2.f131119c * giVar.f131119c))) / (giVar2.e() * giVar.e())) * 180.0d) / 3.141592653589793d != 90.0d ? new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gi(-e17, -e18, 0.0f) : giVar2;
    }
}
