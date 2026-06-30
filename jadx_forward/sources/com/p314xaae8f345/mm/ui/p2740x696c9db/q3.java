package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f292181a;

    /* renamed from: b, reason: collision with root package name */
    public final float f292182b;

    /* renamed from: c, reason: collision with root package name */
    public final float f292183c;

    /* renamed from: d, reason: collision with root package name */
    public final float f292184d;

    /* renamed from: e, reason: collision with root package name */
    public final float f292185e;

    /* renamed from: f, reason: collision with root package name */
    public final float f292186f;

    /* renamed from: g, reason: collision with root package name */
    public final float f292187g;

    public q3(float f17, float f18, float f19, float f27, float f28, float f29, float f37) {
        this.f292181a = f17;
        this.f292182b = f18;
        this.f292183c = f19;
        this.f292184d = f27;
        this.f292185e = f28;
        this.f292186f = f29;
        this.f292187g = f37;
    }

    /* renamed from: equals */
    public boolean m81126xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.q3)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.q3 q3Var = (com.p314xaae8f345.mm.ui.p2740x696c9db.q3) obj;
        return java.lang.Float.compare(this.f292181a, q3Var.f292181a) == 0 && java.lang.Float.compare(this.f292182b, q3Var.f292182b) == 0 && java.lang.Float.compare(this.f292183c, q3Var.f292183c) == 0 && java.lang.Float.compare(this.f292184d, q3Var.f292184d) == 0 && java.lang.Float.compare(this.f292185e, q3Var.f292185e) == 0 && java.lang.Float.compare(this.f292186f, q3Var.f292186f) == 0 && java.lang.Float.compare(this.f292187g, q3Var.f292187g) == 0;
    }

    /* renamed from: hashCode */
    public int m81127x8cdac1b() {
        return (((((((((((java.lang.Float.hashCode(this.f292181a) * 31) + java.lang.Float.hashCode(this.f292182b)) * 31) + java.lang.Float.hashCode(this.f292183c)) * 31) + java.lang.Float.hashCode(this.f292184d)) * 31) + java.lang.Float.hashCode(this.f292185e)) * 31) + java.lang.Float.hashCode(this.f292186f)) * 31) + java.lang.Float.hashCode(this.f292187g);
    }

    /* renamed from: toString */
    public java.lang.String m81128x9616526c() {
        return "ThumbParams(left=" + this.f292181a + ", top=" + this.f292182b + ", width=" + this.f292183c + ", height=" + this.f292184d + ", radius=" + this.f292185e + ", imgWidth=" + this.f292186f + ", imgHeight=" + this.f292187g + ')';
    }
}
