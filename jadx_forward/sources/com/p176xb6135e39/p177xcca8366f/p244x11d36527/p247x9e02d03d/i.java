package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p247x9e02d03d;

/* loaded from: classes15.dex */
public class i extends la.b {

    /* renamed from: a, reason: collision with root package name */
    public float f125917a;

    /* renamed from: b, reason: collision with root package name */
    public float f125918b;

    /* renamed from: c, reason: collision with root package name */
    public float f125919c;

    /* renamed from: d, reason: collision with root package name */
    public float f125920d;

    /* renamed from: e, reason: collision with root package name */
    public float f125921e;

    public i(float f17, float f18, float f19) {
        this.f125918b = f17;
        this.f125917a = f18;
        this.f125920d = f19;
        if (f19 < 0.0f) {
            throw new java.lang.IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f125921e = 0.0f;
    }

    @Override // la.b
    public void a(float f17, float f18, la.g gVar) {
        float f19 = this.f125919c;
        if (f19 == 0.0f) {
            gVar.b(f17, 0.0f);
            return;
        }
        float f27 = ((this.f125918b * 2.0f) + f19) / 2.0f;
        float f28 = f18 * this.f125917a;
        float f29 = (f17 / 2.0f) + this.f125921e;
        float f37 = (this.f125920d * f18) + ((1.0f - f18) * f27);
        if (f37 / f27 >= 1.0f) {
            gVar.b(f17, 0.0f);
            return;
        }
        float f38 = f27 + f28;
        float f39 = f37 + f28;
        float sqrt = (float) java.lang.Math.sqrt((f38 * f38) - (f39 * f39));
        float f47 = f29 - sqrt;
        float f48 = f29 + sqrt;
        float degrees = (float) java.lang.Math.toDegrees(java.lang.Math.atan(sqrt / f39));
        float f49 = 90.0f - degrees;
        float f57 = f47 - f28;
        gVar.b(f57, 0.0f);
        float f58 = f28 * 2.0f;
        gVar.a(f57, 0.0f, f47 + f28, f58, 270.0f, degrees);
        gVar.a(f29 - f27, (-f27) - f37, f29 + f27, f27 - f37, 180.0f - f49, (f49 * 2.0f) - 180.0f);
        gVar.a(f48 - f28, 0.0f, f48 + f28, f58, 270.0f - degrees, degrees);
        gVar.b(f17, 0.0f);
    }
}
