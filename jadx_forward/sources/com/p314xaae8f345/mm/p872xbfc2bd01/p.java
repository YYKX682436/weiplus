package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes12.dex */
public class p extends com.p314xaae8f345.mm.p872xbfc2bd01.o {
    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.o
    public android.graphics.Bitmap b(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
            try {
                try {
                    android.graphics.Bitmap h17 = h(inputStream, null, options);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return h17;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PurgeableBitmapFactory", "decode error: %s", e.getMessage());
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream2 = inputStream;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream2);
            throw th;
        }
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.o
    public void d(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PurgeableBitmapFactory", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PurgeableBitmapFactory", "recycle error: %s", e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.o
    public android.graphics.Bitmap e(java.lang.String str, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2 = null;
        try {
            inputStream = com.p314xaae8f345.mm.vfs.w6.E(str);
            try {
                try {
                    android.graphics.Bitmap h17 = h(inputStream, rect, options);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return h17;
                } catch (java.lang.Exception e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PurgeableBitmapFactory", "decode error: %s", e.getMessage());
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    return null;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                inputStream2 = inputStream;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream2);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0058: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:29:0x0058 */
    public final android.graphics.Bitmap g(java.io.InputStream inputStream, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = null;
        if (inputStream != null) {
            int i17 = -1;
            try {
                try {
                    i17 = inputStream.available();
                    com.p314xaae8f345.mm.p872xbfc2bd01.i iVar = com.p314xaae8f345.mm.p872xbfc2bd01.i.f150496d;
                    bArr = (byte[]) iVar.l(java.lang.Integer.valueOf(i17));
                    if (bArr == null) {
                        try {
                            bArr = new byte[i17];
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PurgeableBitmapFactory", "decodeByByteArray error: %s", e.getMessage());
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                            if (i17 > 0 && bArr != null) {
                                com.p314xaae8f345.mm.p872xbfc2bd01.i.f150496d.n(bArr);
                            }
                            return null;
                        }
                    }
                    inputStream.read(bArr);
                    android.graphics.Bitmap h17 = com.p314xaae8f345.mm.p786x600aa8b.e.h(rect == null ? com.p314xaae8f345.mm.p786x600aa8b.e.b(bArr, 0, i17, options) : com.p314xaae8f345.mm.p786x600aa8b.i.b(bArr, 0, i17, rect, options));
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    if (i17 > 0) {
                        iVar.n(bArr);
                    }
                    return h17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bArr3 = bArr2;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                    if (i17 > 0 && bArr3 != null) {
                        com.p314xaae8f345.mm.p872xbfc2bd01.i.f150496d.n(bArr3);
                    }
                    throw th;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                bArr = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
                if (i17 > 0) {
                    com.p314xaae8f345.mm.p872xbfc2bd01.i.f150496d.n(bArr3);
                }
                throw th;
            }
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(inputStream);
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0055: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:27:0x0055 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap h(java.io.InputStream r5, android.graphics.Rect r6, android.graphics.BitmapFactory.Options r7) {
        /*
            r4 = this;
            r0 = 0
            com.tencent.mm.memory.k r1 = com.p314xaae8f345.mm.p872xbfc2bd01.k.f150497d     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            java.lang.Object r2 = r1.a()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            android.graphics.BitmapFactory$Options r7 = r4.i(r5, r7, r2)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.f274597a     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            boolean r3 = r5.markSupported()     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            if (r3 == 0) goto L16
            goto L2a
        L16:
            boolean r3 = r5 instanceof java.io.FileInputStream     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            if (r3 == 0) goto L24
            com.tencent.mm.sdk.platformtools.j1 r3 = new com.tencent.mm.sdk.platformtools.j1     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            r3.<init>(r5)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            goto L29
        L22:
            r5 = move-exception
            goto L3b
        L24:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            r3.<init>(r5)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
        L29:
            r5 = r3
        L2a:
            r4.f(r5)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            android.graphics.Bitmap r5 = r4.g(r5, r6, r7)     // Catch: java.lang.Exception -> L22 java.lang.Throwable -> L54
            if (r2 == 0) goto L36
            r1.b(r2)
        L36:
            return r5
        L37:
            r5 = move-exception
            goto L56
        L39:
            r5 = move-exception
            r2 = r0
        L3b:
            java.lang.String r6 = "MicroMsg.PurgeableBitmapFactory"
            java.lang.String r7 = "error decode bitmap %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L54
            r3 = 0
            r1[r3] = r5     // Catch: java.lang.Throwable -> L54
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r7, r1)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L53
            com.tencent.mm.memory.k r5 = com.p314xaae8f345.mm.p872xbfc2bd01.k.f150497d
            r5.b(r2)
        L53:
            return r0
        L54:
            r5 = move-exception
            r0 = r2
        L56:
            if (r0 == 0) goto L5d
            com.tencent.mm.memory.k r6 = com.p314xaae8f345.mm.p872xbfc2bd01.k.f150497d
            r6.b(r0)
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p872xbfc2bd01.p.h(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final android.graphics.BitmapFactory.Options i(java.io.InputStream inputStream, android.graphics.BitmapFactory.Options options, java.nio.ByteBuffer byteBuffer) {
        if (options == null) {
            options = new android.graphics.BitmapFactory.Options();
        }
        if (byteBuffer != null) {
            options.inTempStorage = byteBuffer.array();
        }
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.p786x600aa8b.e.g(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new java.lang.IllegalArgumentException("cannot get the bitmap size!");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PurgeableBitmapFactory", "mimetype: %s", options.outMimeType);
        options.inDither = true;
        options.inMutable = true;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inJustDecodeBounds = false;
        return options;
    }
}
