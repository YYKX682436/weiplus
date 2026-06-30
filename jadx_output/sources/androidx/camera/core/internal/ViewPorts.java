package androidx.camera.core.internal;

/* loaded from: classes14.dex */
public class ViewPorts {
    private ViewPorts() {
    }

    public static java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects(android.graphics.Rect rect, boolean z17, android.util.Rational rational, int i17, int i18, int i19, java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> map) {
        m3.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
        for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> entry : map.entrySet()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            android.graphics.RectF rectF4 = new android.graphics.RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        android.graphics.RectF scaledRect = getScaledRect(rectF2, androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(i17, rational), i18, z17, i19, i17);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.graphics.RectF rectF5 = new android.graphics.RectF();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            ((android.graphics.Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            rectF5.round(rect2);
            hashMap2.put((androidx.camera.core.UseCase) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    private static android.graphics.RectF correctStartOrEnd(boolean z17, int i17, android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        boolean z18 = i17 == 0 && !z17;
        boolean z19 = i17 == 90 && z17;
        if (z18 || z19) {
            return rectF2;
        }
        boolean z27 = i17 == 0 && z17;
        boolean z28 = i17 == 270 && !z17;
        if (z27 || z28) {
            return flipHorizontally(rectF2, rectF.centerX());
        }
        boolean z29 = i17 == 90 && !z17;
        boolean z37 = i17 == 180 && z17;
        if (z29 || z37) {
            return flipVertically(rectF2, rectF.centerY());
        }
        boolean z38 = i17 == 180 && !z17;
        boolean z39 = i17 == 270 && z17;
        if (z38 || z39) {
            return flipHorizontally(flipVertically(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new java.lang.IllegalArgumentException("Invalid argument: mirrored " + z17 + " rotation " + i17);
    }

    private static android.graphics.RectF flipHorizontally(android.graphics.RectF rectF, float f17) {
        return new android.graphics.RectF(flipX(rectF.right, f17), rectF.top, flipX(rectF.left, f17), rectF.bottom);
    }

    private static android.graphics.RectF flipVertically(android.graphics.RectF rectF, float f17) {
        return new android.graphics.RectF(rectF.left, flipY(rectF.bottom, f17), rectF.right, flipY(rectF.top, f17));
    }

    private static float flipX(float f17, float f18) {
        return (f18 + f18) - f17;
    }

    private static float flipY(float f17, float f18) {
        return (f18 + f18) - f17;
    }

    public static android.graphics.RectF getScaledRect(android.graphics.RectF rectF, android.util.Rational rational, int i17, boolean z17, int i18, int i19) {
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
        return correctStartOrEnd(shouldMirrorStartAndEnd(z17, i18), i19, rectF, rectF3);
    }

    private static boolean shouldMirrorStartAndEnd(boolean z17, int i17) {
        return z17 ^ (i17 == 1);
    }
}
