package e3;

/* loaded from: classes13.dex */
public abstract class f {
    public static float[] a(float[] fArr, int i17, int i18) {
        if (i17 > i18) {
            throw new java.lang.IllegalArgumentException();
        }
        int length = fArr.length;
        if (i17 < 0 || i17 > length) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i19 = i18 - i17;
        int min = java.lang.Math.min(i19, length - i17);
        float[] fArr2 = new float[i19];
        java.lang.System.arraycopy(fArr, i17, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0088, code lost:
    
        if (r16 == 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[Catch: NumberFormatException -> 0x00b6, LOOP:3: B:29:0x006c->B:39:0x0095, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b6, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:39:0x0095, B:43:0x009b, B:48:0x00ab, B:59:0x00b0), top: B:25:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[Catch: NumberFormatException -> 0x00b6, TryCatch #0 {NumberFormatException -> 0x00b6, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:39:0x0095, B:43:0x009b, B:48:0x00ab, B:59:0x00b0), top: B:25:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab A[Catch: NumberFormatException -> 0x00b6, TryCatch #0 {NumberFormatException -> 0x00b6, blocks: (B:26:0x0058, B:29:0x006c, B:31:0x0072, B:35:0x007e, B:39:0x0095, B:43:0x009b, B:48:0x00ab, B:59:0x00b0), top: B:25:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e3.e[] b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.f.b(java.lang.String):e3.e[]");
    }

    public static android.graphics.Path c(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        e3.e[] b17 = b(str);
        if (b17 == null) {
            return null;
        }
        try {
            e3.e.b(b17, path);
            return path;
        } catch (java.lang.RuntimeException e17) {
            throw new java.lang.RuntimeException("Error in parsing " + str, e17);
        }
    }
}
