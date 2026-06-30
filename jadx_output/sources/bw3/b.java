package bw3;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.RectF f24900a = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public float[] f24901b = new float[2];

    /* renamed from: c, reason: collision with root package name */
    public float f24902c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f24903d = 1.0f;

    public final void a(android.graphics.Matrix matrix, yz5.p pVar) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, this.f24901b);
        float f17 = fArr[0];
        android.graphics.RectF rectF = this.f24900a;
        float f18 = fArr[1];
        android.graphics.RectF rectF2 = this.f24900a;
        float[] fArr2 = {java.lang.Math.max(rectF.left, java.lang.Math.min(f17, rectF.right)), java.lang.Math.max(rectF2.top, java.lang.Math.min(f18, rectF2.bottom))};
        float[] fArr3 = new float[9];
        matrix.getValues(fArr3);
        double d17 = fArr3[0];
        double d18 = fArr3[3];
        double d19 = fArr3[4];
        float sqrt = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
        float round = (float) java.lang.Math.round(java.lang.Math.atan2(d18, d19) * 57.29577951308232d);
        float max = java.lang.Math.max(this.f24902c, java.lang.Math.min(sqrt, this.f24903d));
        if (sqrt == max) {
            if (fArr[0] == fArr2[0]) {
                if (fArr[1] == fArr2[1]) {
                    if (pVar != null) {
                        pVar.invoke(matrix, java.lang.Boolean.TRUE);
                        return;
                    }
                    return;
                }
            }
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new bw3.a(this, sqrt, max, round, fArr, fArr2, pVar));
        ofFloat.start();
    }
}
