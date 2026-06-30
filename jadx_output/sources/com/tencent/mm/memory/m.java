package com.tencent.mm.memory;

/* loaded from: classes12.dex */
public class m extends com.tencent.mm.memory.o {
    @Override // com.tencent.mm.memory.o
    public android.graphics.Bitmap b(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        android.graphics.Bitmap bitmap = null;
        try {
            inputStream = com.tencent.mm.vfs.w6.E(str);
            try {
                try {
                    bitmap = g(inputStream, options);
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.InBitmapFactory", e, "error decode bitmap %s", e.getMessage());
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    return bitmap;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream2 = inputStream;
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mm.sdk.platformtools.t8.v1(inputStream2);
            throw th;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
        return bitmap;
    }

    @Override // com.tencent.mm.memory.o
    public void d(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.memory.c cVar = com.tencent.mm.memory.c.f68956e;
        synchronized (cVar) {
            if (bitmap.isMutable() && !bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BitmapPool", "release: %s", bitmap);
                cVar.k(bitmap);
                try {
                    if (com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_bitmap_pool_release_recycle", "0", false, true), 0) == 1) {
                        bitmap.recycle();
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    @Override // com.tencent.mm.memory.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap e(java.lang.String r10, android.graphics.Rect r11, android.graphics.BitmapFactory.Options r12) {
        /*
            r9 = this;
            r0 = 0
            java.io.InputStream r10 = com.tencent.mm.vfs.w6.E(r10)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2f
            com.tencent.mm.memory.k r7 = com.tencent.mm.memory.k.f68964d     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.lang.Object r1 = r7.a()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r8 = r1
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            r5 = 1
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r8
            r6 = r11
            android.graphics.BitmapFactory$Options r12 = r1.i(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L4c
            android.graphics.Bitmap r0 = r9.h(r10, r11, r12)     // Catch: java.lang.Exception -> L25 java.lang.Throwable -> L4c
            if (r8 == 0) goto L21
            r7.b(r8)
        L21:
            com.tencent.mm.sdk.platformtools.t8.v1(r10)
            goto L4b
        L25:
            r11 = move-exception
            goto L32
        L27:
            r11 = move-exception
            goto L4e
        L29:
            r11 = move-exception
            r8 = r0
            goto L32
        L2c:
            r11 = move-exception
            r10 = r0
            goto L4e
        L2f:
            r11 = move-exception
            r10 = r0
            r8 = r10
        L32:
            java.lang.String r12 = "MicroMsg.InBitmapFactory"
            java.lang.String r1 = "error decode bitmap %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L4c
            r3 = 0
            r2[r3] = r11     // Catch: java.lang.Throwable -> L4c
            com.tencent.mars.xlog.Log.e(r12, r1, r2)     // Catch: java.lang.Throwable -> L4c
            if (r8 == 0) goto L21
            com.tencent.mm.memory.k r11 = com.tencent.mm.memory.k.f68964d
            r11.b(r8)
            goto L21
        L4b:
            return r0
        L4c:
            r11 = move-exception
            r0 = r8
        L4e:
            if (r0 == 0) goto L55
            com.tencent.mm.memory.k r12 = com.tencent.mm.memory.k.f68964d
            r12.b(r0)
        L55:
            com.tencent.mm.sdk.platformtools.t8.v1(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.memory.m.e(java.lang.String, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap g(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11) {
        /*
            r9 = this;
            r0 = 0
            com.tencent.mm.memory.k r1 = com.tencent.mm.memory.k.f68964d     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            java.lang.Object r2 = r1.a()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r2
            android.graphics.BitmapFactory$Options r11 = r3.i(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3c
            android.graphics.Bitmap r0 = r9.h(r10, r0, r11)     // Catch: java.lang.Exception -> L1d java.lang.Throwable -> L3c
            if (r2 == 0) goto L3b
            r1.b(r2)
            goto L3b
        L1d:
            r10 = move-exception
            goto L23
        L1f:
            r10 = move-exception
            goto L3e
        L21:
            r10 = move-exception
            r2 = r0
        L23:
            java.lang.String r11 = "MicroMsg.InBitmapFactory"
            java.lang.String r1 = "error decode bitmap %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            r3[r4] = r10     // Catch: java.lang.Throwable -> L3c
            com.tencent.mars.xlog.Log.e(r11, r1, r3)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3b
            com.tencent.mm.memory.k r10 = com.tencent.mm.memory.k.f68964d
            r10.b(r2)
        L3b:
            return r0
        L3c:
            r10 = move-exception
            r0 = r2
        L3e:
            if (r0 == 0) goto L45
            com.tencent.mm.memory.k r11 = com.tencent.mm.memory.k.f68964d
            r11.b(r0)
        L45:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.memory.m.g(java.io.InputStream, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap h(java.io.InputStream r21, android.graphics.Rect r22, android.graphics.BitmapFactory.Options r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.memory.m.h(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final android.graphics.BitmapFactory.Options i(java.io.InputStream inputStream, android.graphics.BitmapFactory.Options options, java.nio.ByteBuffer byteBuffer, boolean z17, android.graphics.Rect rect) {
        int i17;
        if (options == null) {
            options = new android.graphics.BitmapFactory.Options();
        }
        if (byteBuffer != null) {
            options.inTempStorage = byteBuffer.array();
        }
        options.inJustDecodeBounds = true;
        android.graphics.Bitmap bitmap = null;
        com.tencent.mm.graphics.e.g(inputStream, null, options);
        int i18 = options.outWidth;
        if (i18 == -1 || (i17 = options.outHeight) == -1) {
            throw new java.lang.IllegalArgumentException("cannot get the bitmap size!");
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        if (rect == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.InBitmapFactory", "options.outWidth: %s, options.outHeight: %s, sampleSize: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(options.inSampleSize));
        } else {
            i18 = rect.right - rect.left;
            i17 = rect.bottom - rect.top;
            com.tencent.mars.xlog.Log.i("MicroMsg.InBitmapFactory", "region decode, width: %s, height: %s, rect: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), rect);
        }
        if (z17) {
            com.tencent.mm.memory.c cVar = com.tencent.mm.memory.c.f68956e;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18 * i17);
            cVar.getClass();
            bitmap = (android.graphics.Bitmap) cVar.m(java.lang.Integer.valueOf(valueOf.intValue() * 4));
            if (bitmap != null && fp.h.c(19)) {
                bitmap.reconfigure(i18, i17, android.graphics.Bitmap.Config.ARGB_8888);
            }
        } else {
            com.tencent.mm.memory.c cVar2 = com.tencent.mm.memory.c.f68956e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18 * i17);
            cVar2.getClass();
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(valueOf2.intValue() * 4);
            synchronized (cVar2) {
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) cVar2.l(valueOf3);
                if (bitmap2 != null && !bitmap2.isRecycled() && bitmap2.isMutable()) {
                    bitmap2.getWidth();
                    bitmap2.getHeight();
                    cVar2.f(bitmap2);
                    bitmap = bitmap2;
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = bitmap;
        objArr[1] = java.lang.Boolean.valueOf(bitmap == null || bitmap.isRecycled());
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Integer.valueOf(bitmap != null ? bitmap.getWidth() : 0);
        objArr[4] = java.lang.Integer.valueOf(bitmap != null ? bitmap.getHeight() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.InBitmapFactory", "bitmapToReuse: %s, isRecycle: %s, isRegionDecode: %s, width: %s, height: %s", objArr);
        if (bitmap != null && bitmap.isMutable() && !bitmap.isRecycled()) {
            options.inBitmap = bitmap;
        }
        options.inMutable = true;
        boolean z18 = com.tencent.mm.sdk.platformtools.x.f193064a;
        com.tencent.mars.xlog.Log.i("MicroMsg.InBitmapFactory", "mimetype: %s", options.outMimeType);
        return options;
    }
}
