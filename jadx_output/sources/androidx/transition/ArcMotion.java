package androidx.transition;

/* loaded from: classes13.dex */
public class ArcMotion extends androidx.transition.PathMotion {

    /* renamed from: d, reason: collision with root package name */
    public static final float f12374d = (float) java.lang.Math.tan(java.lang.Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    public float f12375a;

    /* renamed from: b, reason: collision with root package name */
    public float f12376b;

    /* renamed from: c, reason: collision with root package name */
    public float f12377c;

    public ArcMotion(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12375a = 0.0f;
        this.f12376b = 0.0f;
        this.f12377c = f12374d;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424565i);
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) attributeSet;
        this.f12376b = b(d3.r.d(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f12375a = b(d3.r.d(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.f12377c = b(d3.r.d(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    public static float b(float f17) {
        if (f17 < 0.0f || f17 > 90.0f) {
            throw new java.lang.IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) java.lang.Math.tan(java.lang.Math.toRadians(f17 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path a(float f17, float f18, float f19, float f27) {
        float f28;
        float f29;
        float f37;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(f17, f18);
        float f38 = f19 - f17;
        float f39 = f27 - f18;
        float f47 = (f38 * f38) + (f39 * f39);
        float f48 = (f17 + f19) / 2.0f;
        float f49 = (f18 + f27) / 2.0f;
        float f57 = 0.25f * f47;
        boolean z17 = f18 > f27;
        if (java.lang.Math.abs(f38) < java.lang.Math.abs(f39)) {
            float abs = java.lang.Math.abs(f47 / (f39 * 2.0f));
            if (z17) {
                f29 = abs + f27;
                f28 = f19;
            } else {
                f29 = abs + f18;
                f28 = f17;
            }
            f37 = this.f12376b;
        } else {
            float f58 = f47 / (f38 * 2.0f);
            if (z17) {
                f29 = f18;
                f28 = f58 + f17;
            } else {
                f28 = f19 - f58;
                f29 = f27;
            }
            f37 = this.f12375a;
        }
        float f59 = f57 * f37 * f37;
        float f66 = f48 - f28;
        float f67 = f49 - f29;
        float f68 = (f66 * f66) + (f67 * f67);
        float f69 = this.f12377c;
        float f76 = f57 * f69 * f69;
        if (f68 >= f59) {
            f59 = f68 > f76 ? f76 : 0.0f;
        }
        if (f59 != 0.0f) {
            float sqrt = (float) java.lang.Math.sqrt(f59 / f68);
            f28 = ((f28 - f48) * sqrt) + f48;
            f29 = f49 + (sqrt * (f29 - f49));
        }
        path.cubicTo((f17 + f28) / 2.0f, (f18 + f29) / 2.0f, (f28 + f19) / 2.0f, (f29 + f27) / 2.0f, f19, f27);
        return path;
    }
}
