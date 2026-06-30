package androidx.camera.core.impl.utils;

/* loaded from: classes14.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    private static void denormalize(float[] fArr, float f17, float f18) {
        android.opengl.Matrix.translateM(fArr, 0, -f17, -f18, 0.0f);
    }

    private static void normalize(float[] fArr, float f17, float f18) {
        android.opengl.Matrix.translateM(fArr, 0, f17, f18, 0.0f);
    }

    public static void postRotate(float[] fArr, float f17, float f18, float f19) {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            android.opengl.Matrix.setIdentityM(fArr2, 0);
            normalize(fArr2, f18, f19);
            android.opengl.Matrix.rotateM(fArr2, 0, f17, 0.0f, 0.0f, 1.0f);
            denormalize(fArr2, f18, f19);
            android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public static void preRotate(float[] fArr, float f17, float f18, float f19) {
        normalize(fArr, f18, f19);
        android.opengl.Matrix.rotateM(fArr, 0, f17, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f18, f19);
    }

    public static void preVerticalFlip(float[] fArr, float f17) {
        normalize(fArr, 0.0f, f17);
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, 0.0f, f17);
    }

    public static void setRotate(float[] fArr, float f17, float f18, float f19) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f17, f18, f19);
    }

    public static java.lang.String toString(float[] fArr, int i17) {
        return java.lang.String.format(java.util.Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", java.lang.Float.valueOf(fArr[i17]), java.lang.Float.valueOf(fArr[i17 + 4]), java.lang.Float.valueOf(fArr[i17 + 8]), java.lang.Float.valueOf(fArr[i17 + 12]), java.lang.Float.valueOf(fArr[i17 + 1]), java.lang.Float.valueOf(fArr[i17 + 5]), java.lang.Float.valueOf(fArr[i17 + 9]), java.lang.Float.valueOf(fArr[i17 + 13]), java.lang.Float.valueOf(fArr[i17 + 2]), java.lang.Float.valueOf(fArr[i17 + 6]), java.lang.Float.valueOf(fArr[i17 + 10]), java.lang.Float.valueOf(fArr[i17 + 14]), java.lang.Float.valueOf(fArr[i17 + 3]), java.lang.Float.valueOf(fArr[i17 + 7]), java.lang.Float.valueOf(fArr[i17 + 11]), java.lang.Float.valueOf(fArr[i17 + 15]));
    }
}
