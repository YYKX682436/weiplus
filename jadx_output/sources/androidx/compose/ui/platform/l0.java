package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class l0 {
    public static final void a(float[] fArr, float[] fArr2) {
        float b17 = b(fArr2, 0, fArr, 0);
        float b18 = b(fArr2, 0, fArr, 1);
        float b19 = b(fArr2, 0, fArr, 2);
        float b27 = b(fArr2, 0, fArr, 3);
        float b28 = b(fArr2, 1, fArr, 0);
        float b29 = b(fArr2, 1, fArr, 1);
        float b37 = b(fArr2, 1, fArr, 2);
        float b38 = b(fArr2, 1, fArr, 3);
        float b39 = b(fArr2, 2, fArr, 0);
        float b47 = b(fArr2, 2, fArr, 1);
        float b48 = b(fArr2, 2, fArr, 2);
        float b49 = b(fArr2, 2, fArr, 3);
        float b57 = b(fArr2, 3, fArr, 0);
        float b58 = b(fArr2, 3, fArr, 1);
        float b59 = b(fArr2, 3, fArr, 2);
        float b67 = b(fArr2, 3, fArr, 3);
        fArr[0] = b17;
        fArr[1] = b18;
        fArr[2] = b19;
        fArr[3] = b27;
        fArr[4] = b28;
        fArr[5] = b29;
        fArr[6] = b37;
        fArr[7] = b38;
        fArr[8] = b39;
        fArr[9] = b47;
        fArr[10] = b48;
        fArr[11] = b49;
        fArr[12] = b57;
        fArr[13] = b58;
        fArr[14] = b59;
        fArr[15] = b67;
    }

    public static final float b(float[] fArr, int i17, float[] fArr2, int i18) {
        int i19 = i17 * 4;
        return (fArr[i19 + 0] * fArr2[0 + i18]) + (fArr[i19 + 1] * fArr2[4 + i18]) + (fArr[i19 + 2] * fArr2[8 + i18]) + (fArr[i19 + 3] * fArr2[12 + i18]);
    }
}
