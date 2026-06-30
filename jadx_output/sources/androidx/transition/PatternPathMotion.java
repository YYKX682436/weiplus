package androidx.transition;

/* loaded from: classes13.dex */
public class PatternPathMotion extends androidx.transition.PathMotion {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f12378a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Matrix f12379b = new android.graphics.Matrix();

    public PatternPathMotion(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4.u0.f424566j);
        try {
            java.lang.String g17 = d3.r.g(obtainStyledAttributes, (org.xmlpull.v1.XmlPullParser) attributeSet, "patternPathData", 0);
            if (g17 == null) {
                throw new java.lang.RuntimeException("pathData must be supplied for patternPathMotion");
            }
            b(e3.f.c(g17));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path a(float f17, float f18, float f19, float f27) {
        float f28 = f27 - f18;
        float sqrt = (float) java.lang.Math.sqrt((r6 * r6) + (f28 * f28));
        double atan2 = java.lang.Math.atan2(f28, f19 - f17);
        android.graphics.Matrix matrix = this.f12379b;
        matrix.setScale(sqrt, sqrt);
        matrix.postRotate((float) java.lang.Math.toDegrees(atan2));
        matrix.postTranslate(f17, f18);
        android.graphics.Path path = new android.graphics.Path();
        this.f12378a.transform(matrix, path);
        return path;
    }

    public void b(android.graphics.Path path) {
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f17 = fArr[0];
        float f18 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f19 = fArr[0];
        float f27 = fArr[1];
        if (f19 == f17 && f27 == f18) {
            throw new java.lang.IllegalArgumentException("pattern must not end at the starting point");
        }
        android.graphics.Matrix matrix = this.f12379b;
        matrix.setTranslate(-f19, -f27);
        float f28 = f18 - f27;
        float sqrt = 1.0f / ((float) java.lang.Math.sqrt((r2 * r2) + (f28 * f28)));
        matrix.postScale(sqrt, sqrt);
        matrix.postRotate((float) java.lang.Math.toDegrees(-java.lang.Math.atan2(f28, f17 - f19)));
        path.transform(matrix, this.f12378a);
    }
}
