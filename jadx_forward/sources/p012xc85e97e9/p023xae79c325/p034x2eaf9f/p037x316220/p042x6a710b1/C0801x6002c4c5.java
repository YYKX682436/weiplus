package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.TransformUtils */
/* loaded from: classes14.dex */
public class C0801x6002c4c5 {

    /* renamed from: NORMALIZED_RECT */
    public static final android.graphics.RectF f1976xa6b75e2c = new android.graphics.RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private C0801x6002c4c5() {
    }

    /* renamed from: calculateSignedAngle */
    public static float m5947xa1ebd3d1(float f17, float f18, float f19, float f27) {
        float f28 = (f17 * f19) + (f18 * f27);
        float f29 = (f17 * f27) - (f18 * f19);
        double sqrt = java.lang.Math.sqrt((f17 * f17) + (f18 * f18)) * java.lang.Math.sqrt((f19 * f19) + (f27 * f27));
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan2(f29 / sqrt, f28 / sqrt));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: getExifTransform */
    public static android.graphics.Matrix m5948x8f97c086(int i17, int i18, int i19) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f17 = i18;
        float f18 = i19;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f17, f18);
        android.graphics.RectF rectF2 = f1976xa6b75e2c;
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

    /* renamed from: getNormalizedToBuffer */
    public static android.graphics.Matrix m5949x52e9e8a8(android.graphics.Rect rect) {
        return m5950x52e9e8a8(new android.graphics.RectF(rect));
    }

    /* renamed from: getRectToRect */
    public static android.graphics.Matrix m5951xeff629f9(android.graphics.RectF rectF, android.graphics.RectF rectF2, int i17) {
        return m5952xeff629f9(rectF, rectF2, i17, false);
    }

    /* renamed from: getRotatedSize */
    public static android.util.Size m5953x492f0cd4(android.graphics.Rect rect, int i17) {
        return m5966xfb4e0bfc(m5960x1b5f820(rect), i17);
    }

    /* renamed from: getRotationDegrees */
    public static int m5954x2a7ffb93(android.graphics.Matrix matrix) {
        matrix.getValues(new float[9]);
        return m5974x36f045e2((int) java.lang.Math.round(java.lang.Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    /* renamed from: hasCropping */
    public static boolean m5955x29b830bc(android.graphics.Rect rect, android.util.Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    /* renamed from: is90or270 */
    public static boolean m5956x99b544a7(int i17) {
        if (i17 == 90 || i17 == 270) {
            return true;
        }
        if (i17 == 0 || i17 == 180) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("Invalid rotation degrees: " + i17);
    }

    /* renamed from: isAspectRatioMatchingWithRoundingError */
    public static boolean m5957xe14b5628(android.util.Size size, android.util.Size size2) {
        return m5958xe14b5628(size, false, size2, false);
    }

    /* renamed from: isMirrored */
    public static boolean m5959x87092be8(android.graphics.Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return m5947xa1ebd3d1(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static float max(float f17, float f18, float f19, float f27) {
        return java.lang.Math.max(java.lang.Math.max(f17, f18), java.lang.Math.max(f19, f27));
    }

    public static float min(float f17, float f18, float f19, float f27) {
        return java.lang.Math.min(java.lang.Math.min(f17, f18), java.lang.Math.min(f19, f27));
    }

    /* renamed from: rectToSize */
    public static android.util.Size m5960x1b5f820(android.graphics.Rect rect) {
        return new android.util.Size(rect.width(), rect.height());
    }

    /* renamed from: rectToString */
    public static java.lang.String m5961x6cafec70(android.graphics.Rect rect) {
        return java.lang.String.format(java.util.Locale.US, "%s(%dx%d)", rect, java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
    }

    /* renamed from: rectToVertices */
    public static float[] m5962x1f255898(android.graphics.RectF rectF) {
        float f17 = rectF.left;
        float f18 = rectF.top;
        float f19 = rectF.right;
        float f27 = rectF.bottom;
        return new float[]{f17, f18, f19, f18, f19, f27, f17, f27};
    }

    /* renamed from: reverseSize */
    public static android.util.Size m5963x5aad6603(android.util.Size size) {
        return new android.util.Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: reverseSizeF */
    public static android.util.SizeF m5964xfaff5aa3(android.util.SizeF sizeF) {
        return new android.util.SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    /* renamed from: rotateRect */
    public static android.graphics.RectF m5965xfb4d85df(android.graphics.RectF rectF, int i17) {
        m3.h.b(i17 % 90 == 0, "Invalid rotation degrees: " + i17);
        return m5956x99b544a7(m5974x36f045e2(i17)) ? new android.graphics.RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    /* renamed from: rotateSize */
    public static android.util.Size m5966xfb4e0bfc(android.util.Size size, int i17) {
        m3.h.b(i17 % 90 == 0, "Invalid rotation degrees: " + i17);
        return m5956x99b544a7(m5974x36f045e2(i17)) ? m5963x5aad6603(size) : size;
    }

    /* renamed from: sizeToRect */
    public static android.graphics.Rect m5967x82ce2e60(android.util.Size size) {
        return m5968x82ce2e60(size, 0, 0);
    }

    /* renamed from: sizeToRectF */
    public static android.graphics.RectF m5969xd6f79de6(android.util.Size size) {
        return m5970xd6f79de6(size, 0, 0);
    }

    /* renamed from: sizeToVertices */
    public static float[] m5971xb29e9e75(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    /* renamed from: updateSensorToBufferTransform */
    public static android.graphics.Matrix m5972xf59ba76e(android.graphics.Matrix matrix, android.graphics.Rect rect) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    /* renamed from: verticesToRect */
    public static android.graphics.RectF m5973xf81cdc58(float[] fArr) {
        return new android.graphics.RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    /* renamed from: within360 */
    public static int m5974x36f045e2(int i17) {
        return ((i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) + com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
    }

    /* renamed from: getNormalizedToBuffer */
    public static android.graphics.Matrix m5950x52e9e8a8(android.graphics.RectF rectF) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(f1976xa6b75e2c, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* renamed from: getRectToRect */
    public static android.graphics.Matrix m5952xeff629f9(android.graphics.RectF rectF, android.graphics.RectF rectF2, int i17, boolean z17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(rectF, f1976xa6b75e2c, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postRotate(i17);
        if (z17) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(m5950x52e9e8a8(rectF2));
        return matrix;
    }

    /* renamed from: isAspectRatioMatchingWithRoundingError */
    public static boolean m5958xe14b5628(android.util.Size size, boolean z17, android.util.Size size2, boolean z18) {
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

    /* renamed from: sizeToRect */
    public static android.graphics.Rect m5968x82ce2e60(android.util.Size size, int i17, int i18) {
        return new android.graphics.Rect(i17, i18, size.getWidth() + i17, size.getHeight() + i18);
    }

    /* renamed from: sizeToRectF */
    public static android.graphics.RectF m5970xd6f79de6(android.util.Size size, int i17, int i18) {
        return new android.graphics.RectF(i17, i18, i17 + size.getWidth(), i18 + size.getHeight());
    }
}
