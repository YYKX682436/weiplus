package fz4;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f348841a;

    public g(ih0.p holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f348841a = holder;
    }

    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j a(fz4.g gVar, java.lang.String str) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar;
        java.lang.String b17;
        java.lang.String c17;
        long j17;
        gVar.getClass();
        try {
            jVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j();
            b17 = hz4.l.b("ImageDataItem-" + str, 18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "createImageMediaInfoResp: generated initial dataId=" + b17 + " for image: " + str);
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.e0(b17);
            c17 = hz4.l.c(gp0Var);
            try {
                j17 = com.p314xaae8f345.mm.vfs.w6.d(str, c17, false);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeNoteAsyncMediaProcessor", e17, "createImageMediaInfoResp copy file error", new java.lang.Object[0]);
                j17 = -1;
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeNoteAsyncMediaProcessor", e18, "createImageMediaInfoResp error", new java.lang.Object[0]);
        }
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "createImageMediaInfoResp copy file failed, imgPath: " + str);
            return null;
        }
        jz5.l d17 = gVar.d(c17);
        int intValue = ((java.lang.Number) d17.f384366d).intValue();
        int intValue2 = ((java.lang.Number) d17.f384367e).intValue();
        jVar.k(c17);
        jVar.l((int) com.p314xaae8f345.mm.vfs.w6.k(c17));
        jVar.n(intValue);
        jVar.j(intValue2);
        jVar.g(c17);
        jVar.d(0);
        jVar.i((int) com.p314xaae8f345.mm.vfs.w6.k(c17));
        jVar.e(true);
        jVar.c(com.p314xaae8f345.mm.vfs.w6.n(str));
        jVar.f(false);
        jVar.f298342q = b17;
        boolean[] zArr = jVar.f298344s;
        zArr[11] = true;
        jVar.f298343r = true;
        zArr[12] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "createImageMediaInfoResp: dataId=" + b17 + ", thumbPath=" + jVar.m112716x4eae2065() + ", media_path=" + jVar.m112715x7f002773() + ", needCompress=true");
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(fz4.g r8, android.graphics.Bitmap r9, java.lang.String r10) {
        /*
            r8.getClass()
            java.lang.String r8 = "createThumbnail created black thumbnail, thumbPath: "
            java.lang.String r0 = "createThumbnail saved bitmap, thumbPath: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "createThumbnail start, thumbPath: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = ", bitmap: "
            r1.append(r2)
            if (r9 == 0) goto L1c
            java.lang.String r2 = "not null"
            goto L1f
        L1c:
            java.lang.String r2 = "null"
        L1f:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WeNoteAsyncMediaProcessor"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r1 = ", exists: "
            r3 = 100
            r4 = 1
            r5 = 0
            if (r9 == 0) goto L60
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L56
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r9, r3, r6, r10, r4)     // Catch: java.lang.Exception -> L56
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53
            r9.<init>(r0)     // Catch: java.lang.Exception -> L53
            r9.append(r10)     // Catch: java.lang.Exception -> L53
            r9.append(r1)     // Catch: java.lang.Exception -> L53
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r10)     // Catch: java.lang.Exception -> L53
            r9.append(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L53
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)     // Catch: java.lang.Exception -> L53
            r0 = r4
            goto L61
        L53:
            r9 = move-exception
            r0 = r4
            goto L58
        L56:
            r9 = move-exception
            r0 = r5
        L58:
            java.lang.String r6 = "createThumbnail saveBitmapToImage failed"
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r9, r6, r7)
            goto L61
        L60:
            r0 = r5
        L61:
            if (r0 != 0) goto La5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "createThumbnail create black thumbnail, thumbPath: "
            r9.<init>(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            r9 = 320(0x140, float:4.48E-43)
            r0 = 480(0x1e0, float:6.73E-43)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.Bitmap r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(r6, r9, r0)     // Catch: java.lang.Exception -> L9d
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L9d
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(r9, r3, r0, r10, r4)     // Catch: java.lang.Exception -> L9d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9d
            r9.<init>(r8)     // Catch: java.lang.Exception -> L9d
            r9.append(r10)     // Catch: java.lang.Exception -> L9d
            r9.append(r1)     // Catch: java.lang.Exception -> L9d
            boolean r8 = com.p314xaae8f345.mm.vfs.w6.j(r10)     // Catch: java.lang.Exception -> L9d
            r9.append(r8)     // Catch: java.lang.Exception -> L9d
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Exception -> L9d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)     // Catch: java.lang.Exception -> L9d
            goto La5
        L9d:
            r8 = move-exception
            java.lang.String r9 = "createThumbnail create black thumbnail failed"
            java.lang.Object[] r10 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r8, r9, r10)
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fz4.g.b(fz4.g, android.graphics.Bitmap, java.lang.String):void");
    }

    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j c(fz4.g gVar, iz4.k kVar) {
        gVar.getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j jVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.j();
        jVar.k(kVar.f377650t);
        jVar.l((int) com.p314xaae8f345.mm.vfs.w6.k(kVar.f377650t));
        jz5.l d17 = gVar.d(kVar.f377650t);
        int intValue = ((java.lang.Number) d17.f384366d).intValue();
        int intValue2 = ((java.lang.Number) d17.f384367e).intValue();
        jVar.n(intValue);
        jVar.j(intValue2);
        jVar.g(kVar.f377668s);
        jVar.d(kVar.f377651u);
        jVar.i(kVar.f377665p);
        jVar.e(false);
        jVar.c(kVar.f377652v);
        jVar.f(false);
        jVar.f298342q = kVar.f377636a;
        boolean[] zArr = jVar.f298344s;
        zArr[11] = true;
        jVar.f298343r = true;
        zArr[12] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "createVideoMediaInfoResp: dataId=" + kVar.f377636a + ", thumbPath=" + jVar.m112716x4eae2065() + ", media_path=" + jVar.m112715x7f002773() + ", needCompress=true");
        return jVar;
    }

    public final jz5.l d(java.lang.String str) {
        if ((str == null || str.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "getImageDimensions but imagePath err");
            return new jz5.l(0, 0);
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(str, options);
            if (d17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "recycle bitmap:%s", d17.toString());
                d17.recycle();
            }
            int i17 = options.outWidth;
            if (i17 <= 0) {
                i17 = 0;
            }
            int i18 = options.outHeight;
            return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18 > 0 ? i18 : 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeNoteAsyncMediaProcessor", "Failed to get image dimensions for path: " + str + ", error: " + e17.getMessage());
            return new jz5.l(0, 0);
        }
    }
}
