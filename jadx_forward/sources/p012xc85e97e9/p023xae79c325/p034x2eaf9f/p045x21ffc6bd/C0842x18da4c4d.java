package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.ViewPorts */
/* loaded from: classes14.dex */
public class C0842x18da4c4d {
    private C0842x18da4c4d() {
    }

    /* renamed from: calculateViewPortRects */
    public static java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, android.graphics.Rect> m6143x84cdf423(android.graphics.Rect rect, boolean z17, android.util.Rational rational, int i17, int i18, int i19, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map) {
        m3.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> entry : map.entrySet()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, 0.0f, entry.getValue().mo5191x8ee230a2().getWidth(), entry.getValue().mo5191x8ee230a2().getHeight());
            matrix.setRectToRect(rectF3, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            android.graphics.RectF rectF4 = new android.graphics.RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        android.graphics.RectF m6149x6129e954 = m6149x6129e954(rectF2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6217xf04e9260(i17, rational), i18, z17, i19, i17);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.graphics.RectF rectF5 = new android.graphics.RectF();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            ((android.graphics.Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, m6149x6129e954);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            rectF5.round(rect2);
            hashMap2.put((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    /* renamed from: correctStartOrEnd */
    private static android.graphics.RectF m6144x3b9954c0(boolean z17, int i17, android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        boolean z18 = i17 == 0 && !z17;
        boolean z19 = i17 == 90 && z17;
        if (z18 || z19) {
            return rectF2;
        }
        boolean z27 = i17 == 0 && z17;
        boolean z28 = i17 == 270 && !z17;
        if (z27 || z28) {
            return m6145x4b4839be(rectF2, rectF.centerX());
        }
        boolean z29 = i17 == 90 && !z17;
        boolean z37 = i17 == 180 && z17;
        if (z29 || z37) {
            return m6146x6ca267d0(rectF2, rectF.centerY());
        }
        boolean z38 = i17 == 180 && !z17;
        boolean z39 = i17 == 270 && z17;
        if (z38 || z39) {
            return m6145x4b4839be(m6146x6ca267d0(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new java.lang.IllegalArgumentException("Invalid argument: mirrored " + z17 + " rotation " + i17);
    }

    /* renamed from: flipHorizontally */
    private static android.graphics.RectF m6145x4b4839be(android.graphics.RectF rectF, float f17) {
        return new android.graphics.RectF(m6147x5d00d8b(rectF.right, f17), rectF.top, m6147x5d00d8b(rectF.left, f17), rectF.bottom);
    }

    /* renamed from: flipVertically */
    private static android.graphics.RectF m6146x6ca267d0(android.graphics.RectF rectF, float f17) {
        return new android.graphics.RectF(rectF.left, m6148x5d00d8c(rectF.bottom, f17), rectF.right, m6148x5d00d8c(rectF.top, f17));
    }

    /* renamed from: flipX */
    private static float m6147x5d00d8b(float f17, float f18) {
        return (f18 + f18) - f17;
    }

    /* renamed from: flipY */
    private static float m6148x5d00d8c(float f17, float f18) {
        return (f18 + f18) - f17;
    }

    /* renamed from: getScaledRect */
    public static android.graphics.RectF m6149x6129e954(android.graphics.RectF rectF, android.util.Rational rational, int i17, boolean z17, int i18, int i19) {
        if (i17 == 3) {
            return rectF;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i17 == 0) {
            matrix.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.START);
        } else if (i17 == 1) {
            matrix.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("Unexpected scale type: " + i17);
            }
            matrix.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.END);
        }
        android.graphics.RectF rectF3 = new android.graphics.RectF();
        matrix.mapRect(rectF3, rectF2);
        return m6144x3b9954c0(m6150xe82eb7d4(z17, i18), i19, rectF, rectF3);
    }

    /* renamed from: shouldMirrorStartAndEnd */
    private static boolean m6150xe82eb7d4(boolean z17, int i17) {
        return z17 ^ (i17 == 1);
    }
}
