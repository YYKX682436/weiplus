package je;

/* loaded from: classes7.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #2 {Exception -> 0x0036, blocks: (B:7:0x000f, B:11:0x0032, B:19:0x002f, B:24:0x002c, B:21:0x0027, B:14:0x0017), top: B:6:0x000f, inners: #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.String r6) {
        /*
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            r1 = 0
            java.lang.String r2 = "Luggage.ImageInfoUtils"
            if (r0 != 0) goto Lf
            java.lang.String r6 = "getExifOrientation err "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r6)
            return r1
        Lf:
            java.io.InputStream r0 = com.p314xaae8f345.mm.vfs.w6.E(r6)     // Catch: java.lang.Exception -> L36
            if (r0 != 0) goto L17
        L15:
            r3 = r1
            goto L30
        L17:
            androidx.exifinterface.media.ExifInterface r3 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L24
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L24
            java.lang.String r4 = "Orientation"
            r5 = 1
            int r3 = r3.m7343x245ab229(r4, r5)     // Catch: java.lang.Throwable -> L15 java.lang.Throwable -> L24
            goto L30
        L24:
            r3 = move-exception
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.Exception -> L36
        L2f:
            throw r3     // Catch: java.lang.Exception -> L36
        L30:
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.lang.Exception -> L36
        L35:
            return r3
        L36:
            r0 = move-exception
            java.lang.String r3 = "getExifOrientation, path = %s, e = %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: je.a.a(java.lang.String):int");
    }

    public static java.lang.String b(int i17) {
        switch (i17) {
            case 2:
                return "up-mirrored";
            case 3:
                return "down";
            case 4:
                return "down-mirrored";
            case 5:
                return "left-mirrored";
            case 6:
                return "right";
            case 7:
                return "right-mirrored";
            case 8:
                return "left";
            default:
                return "up";
        }
    }

    public static java.lang.String c(android.graphics.BitmapFactory.Options options) {
        java.lang.String str;
        if (options == null || (str = options.outMimeType) == null) {
            return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return (lowerCase.indexOf("jpg") < 0 && lowerCase.indexOf("jpeg") < 0) ? lowerCase.indexOf("png") >= 0 ? "png" : lowerCase.indexOf("gif") >= 0 ? "gif" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "jpeg";
    }

    public static boolean d(android.graphics.BitmapFactory.Options options) {
        java.lang.String str;
        if (options == null || (str = options.outMimeType) == null) {
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return lowerCase.indexOf("jpg") >= 0 || lowerCase.indexOf("jpeg") >= 0;
    }
}
