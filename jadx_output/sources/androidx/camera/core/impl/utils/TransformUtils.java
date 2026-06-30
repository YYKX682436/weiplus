package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public class TransformUtils {
    public static final android.graphics.RectF NORMALIZED_RECT = new android.graphics.RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static float calculateSignedAngle(float f17, float f18, float f19, float f27) {
        float f28 = (f17 * f19) + (f18 * f27);
        float f29 = (f17 * f27) - (f18 * f19);
        double sqrt = java.lang.Math.sqrt((f17 * f17) + (f18 * f18)) * java.lang.Math.sqrt((f19 * f19) + (f27 * f27));
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan2(f29 / sqrt, f28 / sqrt));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static android.graphics.Matrix getExifTransform(int i17, int i18, int i19) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f17 = i18;
        float f18 = i19;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f17, f18);
        android.graphics.RectF rectF2 = NORMALIZED_RECT;
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.FILL);
        boolean z17 = true;
        switch (i17) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                z17 = false;
                break;
            case 3:
                matrix.postRotate(180.0f);
                z17 = false;
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                z17 = false;
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
            default:
                z17 = false;
                break;
        }
        if (z17) {
            rectF = new android.graphics.RectF(0.0f, 0.0f, f18, f17);
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static android.graphics.Matrix getNormalizedToBuffer(android.graphics.Rect rect) {
        return getNormalizedToBuffer(new android.graphics.RectF(rect));
    }

    public static android.graphics.Matrix getRectToRect(android.graphics.RectF rectF, android.graphics.RectF rectF2, int i17) {
        return getRectToRect(rectF, rectF2, i17, false);
    }

    public static android.util.Size getRotatedSize(android.graphics.Rect rect, int i17) {
        return rotateSize(rectToSize(rect), i17);
    }

    public static int getRotationDegrees(android.graphics.Matrix matrix) {
        matrix.getValues(new float[9]);
        return within360((int) java.lang.Math.round(java.lang.Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static boolean hasCropping(android.graphics.Rect rect, android.util.Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean is90or270(int i17) {
        if (i17 == 90 || i17 == 270) {
            return true;
        }
        if (i17 == 0 || i17 == 180) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("Invalid rotation degrees: " + i17);
    }

    public static boolean isAspectRatioMatchingWithRoundingError(android.util.Size size, android.util.Size size2) {
        return isAspectRatioMatchingWithRoundingError(size, false, size2, false);
    }

    public static boolean isMirrored(android.graphics.Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return calculateSignedAngle(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static float max(float f17, float f18, float f19, float f27) {
        return java.lang.Math.max(java.lang.Math.max(f17, f18), java.lang.Math.max(f19, f27));
    }

    public static float min(float f17, float f18, float f19, float f27) {
        return java.lang.Math.min(java.lang.Math.min(f17, f18), java.lang.Math.min(f19, f27));
    }

    public static android.util.Size rectToSize(android.graphics.Rect rect) {
        return new android.util.Size(rect.width(), rect.height());
    }

    public static java.lang.String rectToString(android.graphics.Rect rect) {
        return java.lang.String.format(java.util.Locale.US, "%s(%dx%d)", rect, java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
    }

    public static float[] rectToVertices(android.graphics.RectF rectF) {
        float f17 = rectF.left;
        float f18 = rectF.top;
        float f19 = rectF.right;
        float f27 = rectF.bottom;
        return new float[]{f17, f18, f19, f18, f19, f27, f17, f27};
    }

    public static android.util.Size reverseSize(android.util.Size size) {
        return new android.util.Size(size.getHeight(), size.getWidth());
    }

    public static android.util.SizeF reverseSizeF(android.util.SizeF sizeF) {
        return new android.util.SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    public static android.graphics.RectF rotateRect(android.graphics.RectF rectF, int i17) {
        m3.h.b(i17 % 90 == 0, "Invalid rotation degrees: " + i17);
        return is90or270(within360(i17)) ? new android.graphics.RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    public static android.util.Size rotateSize(android.util.Size size, int i17) {
        m3.h.b(i17 % 90 == 0, "Invalid rotation degrees: " + i17);
        return is90or270(within360(i17)) ? reverseSize(size) : size;
    }

    public static android.graphics.Rect sizeToRect(android.util.Size size) {
        return sizeToRect(size, 0, 0);
    }

    public static android.graphics.RectF sizeToRectF(android.util.Size size) {
        return sizeToRectF(size, 0, 0);
    }

    public static float[] sizeToVertices(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static android.graphics.Matrix updateSensorToBufferTransform(android.graphics.Matrix matrix, android.graphics.Rect rect) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static android.graphics.RectF verticesToRect(float[] fArr) {
        return new android.graphics.RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static int within360(int i17) {
        return ((i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    public static android.graphics.Matrix getNormalizedToBuffer(android.graphics.RectF rectF) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static android.graphics.Matrix getRectToRect(android.graphics.RectF rectF, android.graphics.RectF rectF2, int i17, boolean z17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postRotate(i17);
        if (z17) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static boolean isAspectRatioMatchingWithRoundingError(android.util.Size size, boolean z17, android.util.Size size2, boolean z18) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z17) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z18) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static android.graphics.Rect sizeToRect(android.util.Size size, int i17, int i18) {
        return new android.graphics.Rect(i17, i18, size.getWidth() + i17, size.getHeight() + i18);
    }

    public static android.graphics.RectF sizeToRectF(android.util.Size size, int i17, int i18) {
        return new android.graphics.RectF(i17, i18, i17 + size.getWidth(), i18 + size.getHeight());
    }
}
