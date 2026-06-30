package br;

/* loaded from: classes12.dex */
public final class a {
    public final boolean a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (!n22.m.j(emojiInfo)) {
            return true;
        }
        if (emojiInfo.m1() != qk.x6.STATUS_MIXING && emojiInfo.m1() != qk.x6.STATUS_UPLOADING && emojiInfo.m1() != qk.x6.STATUS_UPLOAD_FAIL) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.EmojiLoader.AnimateDecoder", "capture status is " + emojiInfo.m1() + ", not delete local file");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x011a, code lost:
    
        if (r5 == 0) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable b(com.tencent.mm.storage.emotion.EmojiInfo r19, yz5.p r20) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: br.a.b(com.tencent.mm.storage.emotion.EmojiInfo, yz5.p):android.graphics.drawable.Drawable");
    }

    public final android.graphics.Bitmap c(byte[] content, android.graphics.Bitmap originalBitmap) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(originalBitmap, "originalBitmap");
        try {
            int attributeInt = new android.media.ExifInterface(new java.io.ByteArrayInputStream(content)).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 0);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (attributeInt == 3) {
                matrix.postRotate(180.0f);
            } else if (attributeInt == 6) {
                matrix.postRotate(90.0f);
            } else if (attributeInt == 8) {
                matrix.postRotate(270.0f);
            }
            int width = originalBitmap.getWidth();
            int height = originalBitmap.getHeight();
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(java.lang.Boolean.TRUE);
            aVar.c(matrix);
            aVar.c(java.lang.Integer.valueOf(height));
            aVar.c(java.lang.Integer.valueOf(width));
            aVar.c(0);
            aVar.c(0);
            aVar.c(originalBitmap);
            java.lang.Object obj = new java.lang.Object();
            yj0.a.d(obj, aVar.b(), "com/tencent/mm/emoji/loader/decoder/AnimateDecoder", "fixOrientation", "([BLandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/loader/decoder/AnimateDecoder", "fixOrientation", "([BLandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            return createBitmap;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiLoader.AnimateDecoder", e17, "", new java.lang.Object[0]);
            return originalBitmap;
        }
    }
}
