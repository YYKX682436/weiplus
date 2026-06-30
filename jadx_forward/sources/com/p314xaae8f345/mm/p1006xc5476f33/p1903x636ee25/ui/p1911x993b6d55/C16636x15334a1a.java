package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1911x993b6d55;

/* renamed from: com.tencent.mm.plugin.music.ui.transition.GravityArcMotion */
/* loaded from: classes5.dex */
public class C16636x15334a1a extends android.transition.ArcMotion {

    /* renamed from: g, reason: collision with root package name */
    public static final float f232325g = (float) java.lang.Math.tan(java.lang.Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    public float f232326a;

    /* renamed from: b, reason: collision with root package name */
    public float f232327b;

    /* renamed from: c, reason: collision with root package name */
    public float f232328c;

    /* renamed from: d, reason: collision with root package name */
    public float f232329d;

    /* renamed from: e, reason: collision with root package name */
    public float f232330e;

    /* renamed from: f, reason: collision with root package name */
    public float f232331f;

    public C16636x15334a1a() {
        this.f232326a = 0.0f;
        this.f232327b = 0.0f;
        this.f232328c = 70.0f;
        this.f232329d = 0.0f;
        this.f232330e = 0.0f;
        this.f232331f = f232325g;
    }

    public static float a(float f17) {
        if (f17 < 0.0f || f17 > 90.0f) {
            throw new java.lang.IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) java.lang.Math.tan(java.lang.Math.toRadians(f17 / 2.0f));
    }

    @Override // android.transition.ArcMotion
    public float getMaximumAngle() {
        return this.f232328c;
    }

    @Override // android.transition.ArcMotion
    public float getMinimumHorizontalAngle() {
        return this.f232326a;
    }

    @Override // android.transition.ArcMotion
    public float getMinimumVerticalAngle() {
        return this.f232327b;
    }

    @Override // android.transition.ArcMotion, android.transition.PathMotion
    public android.graphics.Path getPath(float f17, float f18, float f19, float f27) {
        float f28;
        float f29;
        float f37;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f17, f18);
        if (f18 == f27) {
            f28 = (f17 + f19) / 2.0f;
            f37 = ((this.f232329d * java.lang.Math.abs(f19 - f17)) / 2.0f) + f18;
        } else if (f17 == f19) {
            f28 = ((this.f232330e * java.lang.Math.abs(f27 - f18)) / 2.0f) + f17;
            f37 = (f18 + f27) / 2.0f;
        } else {
            float f38 = f19 - f17;
            float f39 = f27 < f18 ? f18 - f27 : f27 - f18;
            float f47 = (f38 * f38) + (f39 * f39);
            float f48 = (f17 + f19) / 2.0f;
            float f49 = (f18 + f27) / 2.0f;
            float f57 = 0.25f * f47;
            if (java.lang.Math.abs(f38) < java.lang.Math.abs(f39)) {
                float f58 = f27 + (f47 / (f39 * 2.0f));
                float f59 = this.f232330e;
                f29 = f57 * f59 * f59;
                f37 = f58;
                f28 = f19;
            } else {
                f28 = f19 + (f47 / (f38 * 2.0f));
                float f66 = this.f232329d;
                f29 = f57 * f66 * f66;
                f37 = f27;
            }
            float f67 = f48 - f28;
            float f68 = f49 - f37;
            float f69 = (f67 * f67) + (f68 * f68);
            float f76 = this.f232331f;
            float f77 = f57 * f76 * f76;
            if (f69 >= f29) {
                f29 = f69 > f77 ? f77 : 0.0f;
            }
            if (f29 != 0.0f) {
                float sqrt = (float) java.lang.Math.sqrt(f29 / f69);
                f28 = ((f28 - f48) * sqrt) + f48;
                f37 = f49 + (sqrt * (f37 - f49));
            }
        }
        path.cubicTo((f17 + f28) / 2.0f, (f18 + f37) / 2.0f, (f28 + f19) / 2.0f, (f37 + f27) / 2.0f, f19, f27);
        return path;
    }

    @Override // android.transition.ArcMotion
    public void setMaximumAngle(float f17) {
        this.f232328c = f17;
        this.f232331f = a(f17);
    }

    @Override // android.transition.ArcMotion
    public void setMinimumHorizontalAngle(float f17) {
        this.f232326a = f17;
        this.f232329d = a(f17);
    }

    @Override // android.transition.ArcMotion
    public void setMinimumVerticalAngle(float f17) {
        this.f232327b = f17;
        this.f232330e = a(f17);
    }

    public C16636x15334a1a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f232326a = 0.0f;
        this.f232327b = 0.0f;
        this.f232328c = 70.0f;
        this.f232329d = 0.0f;
        this.f232330e = 0.0f;
        this.f232331f = f232325g;
    }
}
