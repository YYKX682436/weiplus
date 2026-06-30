package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes10.dex */
public abstract class q2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00be  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.a(java.lang.String, int, int):android.graphics.Bitmap");
    }

    public static boolean b(java.lang.String str, android.graphics.Bitmap.CompressFormat compressFormat, int i17, java.lang.String str2, int i18) {
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        android.graphics.Bitmap a17 = a(str, i18, 0);
        try {
            c19767x257d7f.f38864x6ac9171 = a17.getWidth();
            c19767x257d7f2.f38864x6ac9171 = a17.getHeight();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(a17, i17, compressFormat, str2, true);
            return true;
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LongBitmapHandler", "create thumbnail from orig failed: " + str2);
            return false;
        }
    }

    public static boolean c(int i17, int i18) {
        return ((double) i17) > ((double) i18) * 2.0d;
    }

    public static int d(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap bitmap = null;
        try {
            java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str);
            bitmap = com.p314xaae8f345.mm.p786x600aa8b.e.g(E, null, options);
            E.close();
        } catch (java.io.FileNotFoundException | java.io.IOException unused) {
        }
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongBitmapHandler", "isLongPicture bitmap recycle. %s", bitmap);
            bitmap.recycle();
        }
        int i17 = options.outWidth;
        int i18 = options.outHeight;
        float f17 = i17 / i18;
        float f18 = i18 / i17;
        if (f17 >= 2.0f) {
            return 1;
        }
        return f18 >= 2.0f ? 2 : -1;
    }

    public static boolean e(int i17, int i18) {
        return ((double) i18) > ((double) i17) * 2.0d;
    }
}
