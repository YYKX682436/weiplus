package by0;

/* loaded from: classes5.dex */
public abstract class w {
    public static float[] a(float[] fArr, float f17, float f18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = 0.01f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fArr, "<this>");
        float f19 = f18 - f17;
        if (fArr.length == 0) {
            return fArr;
        }
        float[] fArr2 = new float[fArr.length];
        java.lang.Float g07 = kz5.z.g0(fArr);
        if (g07 == null) {
            return fArr;
        }
        float floatValue = g07.floatValue();
        java.lang.Float i07 = kz5.z.i0(fArr);
        if (i07 == null) {
            return fArr;
        }
        float floatValue2 = i07.floatValue();
        int length = fArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            fArr2[i18] = (((fArr[i18] - floatValue2) / (floatValue - floatValue2)) * f19) + f17;
        }
        return fArr2;
    }
}
