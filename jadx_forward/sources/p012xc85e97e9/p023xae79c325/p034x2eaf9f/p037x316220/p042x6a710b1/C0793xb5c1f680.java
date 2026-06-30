package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.MatrixExt */
/* loaded from: classes14.dex */
public final class C0793xb5c1f680 {

    /* renamed from: sTemp */
    private static final float[] f1966x67c46e7 = new float[16];

    private C0793xb5c1f680() {
    }

    /* renamed from: denormalize */
    private static void m5923x9869d3ac(float[] fArr, float f17, float f18) {
        android.opengl.Matrix.translateM(fArr, 0, -f17, -f18, 0.0f);
    }

    /* renamed from: normalize */
    private static void m5924xe1a5f0d(float[] fArr, float f17, float f18) {
        android.opengl.Matrix.translateM(fArr, 0, f17, f18, 0.0f);
    }

    /* renamed from: postRotate */
    public static void m5925x5e876a1b(float[] fArr, float f17, float f18, float f19) {
        float[] fArr2 = f1966x67c46e7;
        synchronized (fArr2) {
            android.opengl.Matrix.setIdentityM(fArr2, 0);
            m5924xe1a5f0d(fArr2, f18, f19);
            android.opengl.Matrix.rotateM(fArr2, 0, f17, 0.0f, 0.0f, 1.0f);
            m5923x9869d3ac(fArr2, f18, f19);
            android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    /* renamed from: preRotate */
    public static void m5926x914bb5de(float[] fArr, float f17, float f18, float f19) {
        m5924xe1a5f0d(fArr, f18, f19);
        android.opengl.Matrix.rotateM(fArr, 0, f17, 0.0f, 0.0f, 1.0f);
        m5923x9869d3ac(fArr, f18, f19);
    }

    /* renamed from: preVerticalFlip */
    public static void m5927x6105b46(float[] fArr, float f17) {
        m5924xe1a5f0d(fArr, 0.0f, f17);
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        m5923x9869d3ac(fArr, 0.0f, f17);
    }

    /* renamed from: setRotate */
    public static void m5928x2127345d(float[] fArr, float f17, float f18, float f19) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        m5926x914bb5de(fArr, f17, f18, f19);
    }

    /* renamed from: toString */
    public static java.lang.String m5929x9616526c(float[] fArr, int i17) {
        return java.lang.String.format(java.util.Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", java.lang.Float.valueOf(fArr[i17]), java.lang.Float.valueOf(fArr[i17 + 4]), java.lang.Float.valueOf(fArr[i17 + 8]), java.lang.Float.valueOf(fArr[i17 + 12]), java.lang.Float.valueOf(fArr[i17 + 1]), java.lang.Float.valueOf(fArr[i17 + 5]), java.lang.Float.valueOf(fArr[i17 + 9]), java.lang.Float.valueOf(fArr[i17 + 13]), java.lang.Float.valueOf(fArr[i17 + 2]), java.lang.Float.valueOf(fArr[i17 + 6]), java.lang.Float.valueOf(fArr[i17 + 10]), java.lang.Float.valueOf(fArr[i17 + 14]), java.lang.Float.valueOf(fArr[i17 + 3]), java.lang.Float.valueOf(fArr[i17 + 7]), java.lang.Float.valueOf(fArr[i17 + 11]), java.lang.Float.valueOf(fArr[i17 + 15]));
    }
}
