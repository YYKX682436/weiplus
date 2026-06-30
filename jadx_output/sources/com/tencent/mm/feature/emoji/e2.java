package com.tencent.mm.feature.emoji;

/* loaded from: classes5.dex */
public abstract class e2 {
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034e, code lost:
    
        if (r7 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0350, code lost:
    
        r7.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (com.tencent.mm.sdk.platformtools.y1.c(r22) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0380, code lost:
    
        if (r7 != null) goto L130;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32, types: [int] */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.emoji.e2.a(java.lang.String):java.lang.String");
    }

    public static final jz5.l b(int i17, int i18, int i19) {
        if (i17 <= i19 && i18 <= i19) {
            return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        float f17 = i19;
        float f18 = i17;
        float f19 = i18;
        float min = java.lang.Math.min(f17 / f18, f17 / f19);
        int i27 = (int) (f18 * min);
        if (i27 < 1) {
            i27 = 1;
        }
        int i28 = (int) (f19 * min);
        return new jz5.l(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28 >= 1 ? i28 : 1));
    }

    public static final void c(java.lang.String str) {
        try {
            if (com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.h(str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiUploadAndPrepareTask", "safeDelete error: " + e17.getMessage());
        }
    }
}
