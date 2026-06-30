package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class i extends la.b {

    /* renamed from: a, reason: collision with root package name */
    public float f44384a;

    /* renamed from: b, reason: collision with root package name */
    public float f44385b;

    /* renamed from: c, reason: collision with root package name */
    public float f44386c;

    /* renamed from: d, reason: collision with root package name */
    public float f44387d;

    /* renamed from: e, reason: collision with root package name */
    public float f44388e;

    public i(float f17, float f18, float f19) {
        this.f44385b = f17;
        this.f44384a = f18;
        this.f44387d = f19;
        if (f19 < 0.0f) {
            throw new java.lang.IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f44388e = 0.0f;
    }

    @Override // la.b
    public void a(float f17, float f18, la.g gVar) {
        float f19 = this.f44386c;
        if (f19 == 0.0f) {
            gVar.b(f17, 0.0f);
            return;
        }
        float f27 = ((this.f44385b * 2.0f) + f19) / 2.0f;
        float f28 = f18 * this.f44384a;
        float f29 = (f17 / 2.0f) + this.f44388e;
        float f37 = (this.f44387d * f18) + ((1.0f - f18) * f27);
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
