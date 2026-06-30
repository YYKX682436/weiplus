package m11;

/* loaded from: classes10.dex */
public abstract class c {
    public static boolean a(java.lang.String str) {
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("C2CImgCompressFileSize", 102400);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageUtil", "bigImgCompressFileSize: %s", java.lang.Integer.valueOf(b17));
        return k17 <= ((long) b17);
    }

    public static m11.b b(java.lang.String str) {
        float f17;
        float f18;
        int i17;
        int i18;
        m11.b bVar = new m11.b();
        android.graphics.Point c17 = c();
        int i19 = c17.x;
        int i27 = c17.y;
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str);
        if (n07 == null || n07.outWidth == 0 || n07.outHeight == 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = str;
            objArr[1] = java.lang.Boolean.valueOf(n07 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.C2CImageUtil", "genBigImg getImageOptions error:%s, origOptions_null:%b", objArr);
            return bVar;
        }
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b();
        if (m43592x7a249f0b == 90 || m43592x7a249f0b == 270) {
            bVar.f404161a = n07.outHeight;
            bVar.f404162b = n07.outWidth;
        } else {
            bVar.f404161a = n07.outWidth;
            bVar.f404162b = n07.outHeight;
        }
        int i28 = bVar.f404161a;
        int i29 = bVar.f404162b;
        int max = java.lang.Math.max(i28, i29);
        int min = java.lang.Math.min(i28, i29);
        if (i27 > 0) {
            f17 = i27 * 1.0f;
            f18 = min;
        } else {
            f17 = i19 * 1.0f;
            f18 = max;
        }
        float f19 = f17 / f18;
        if (f19 < 1.0f) {
            i18 = (int) (i29 * f19);
            i17 = (int) (i28 * f19);
        } else {
            i17 = i28;
            i18 = i29;
        }
        if (i17 * i18 > 10240000) {
            float sqrt = (float) java.lang.Math.sqrt(1.024E7d / (i28 * i29));
            i18 = (int) (i29 * sqrt);
            i17 = (int) (i28 * sqrt);
        }
        bVar.f404163c = i17;
        bVar.f404164d = i18;
        return bVar;
    }

    public static android.graphics.Point c() {
        int i17;
        int i18;
        java.lang.String d17;
        int indexOf;
        int i19 = 0;
        int i27 = 1080;
        android.graphics.Point point = new android.graphics.Point(0, 1080);
        try {
            d17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressResolutionForWifi") : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressResolutionFor2G") : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressResolutionFor3G") : ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressResolutionFor4G");
        } catch (java.lang.Exception unused) {
        }
        if (d17 != null && -1 != (indexOf = d17.indexOf("*"))) {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17.substring(0, indexOf), 0);
            try {
                i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17.substring(indexOf + 1), 1080);
            } catch (java.lang.Exception unused2) {
            }
            if ((i17 <= 0 || i18 > 0) && i18 < 2160) {
                if (i18 <= 0 || i17 <= 3240) {
                    i27 = i18;
                    i19 = i17;
                } else {
                    i27 = 0;
                    i19 = 1620;
                }
            }
            point.x = i19;
            point.y = i27;
            return point;
        }
        i17 = 0;
        i18 = 1080;
        if (i17 <= 0) {
        }
        if (i18 <= 0) {
        }
        i27 = i18;
        i19 = i17;
        point.x = i19;
        point.y = i27;
        return point;
    }

    public static int d() {
        int i17;
        try {
            i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelForWifi"), 60) : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelFor2G"), 40) : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelFor3G"), 40) : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("CompressPicLevelFor4G"), 60);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageUtil", "genBigImg CompressPicLevel-level:%d", java.lang.Integer.valueOf(i17));
        if (i17 <= 10 || i17 > 100) {
            return 70;
        }
        return i17;
    }

    public static int e(java.lang.String str, java.lang.String str2) {
        return ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ui(str, str2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x.B(false, r14, r17, r16, android.graphics.Bitmap.CompressFormat.JPEG, r19, r15, null, r20) == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(java.lang.String r14, java.lang.String r15, int r16, int r17, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a r18, int r19, int r20, boolean r21) {
        /*
            r0 = r18
            boolean r1 = r0.f38859x6ac9171
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG
            r8 = 0
            r2 = r14
            r3 = r17
            r4 = r16
            r6 = r19
            r7 = r15
            r9 = r20
            int r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.B(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L1b
            r1 = r3
            goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 != 0) goto L39
            boolean r4 = r0.f38859x6ac9171
            if (r4 == 0) goto L39
            r0.f38859x6ac9171 = r2
            r5 = 0
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            r12 = 0
            r6 = r14
            r7 = r17
            r8 = r16
            r10 = r19
            r11 = r15
            r13 = r20
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.B(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != r3) goto L39
            goto L3a
        L39:
            r3 = r1
        L3a:
            if (r3 == 0) goto L4d
            if (r21 == 0) goto L4d
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(r14)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 == 0) goto L49
            goto L4d
        L49:
            r1 = r15
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(r0, r15)
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.c.f(java.lang.String, java.lang.String, int, int, com.tencent.mm.pointers.PBool, int, int, boolean):boolean");
    }

    public static boolean g(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, int i19, int i27, boolean z17) {
        int i28;
        boolean f17 = f(str, str2, i17, i18, c19762x487075a, i19, i27, z17);
        if (f17) {
            if (z17) {
                java.lang.String Y = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Y)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(Y, str2);
                }
            }
            i28 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ui(str2, str3, 1);
        } else {
            i28 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageUtil", "origToJpgToWxam: result:%s, hevc:%s", java.lang.Boolean.valueOf(f17), java.lang.Integer.valueOf(i28));
        return f17;
    }

    public static boolean h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        long j17;
        int i19;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        boolean z17 = false;
        if (k17 >= 2147483648L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageUtil", "origToWxamToJpg: orig file is too large to convert wxam. size: %s", java.lang.Long.valueOf(k17));
            return false;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int cj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).cj(str, str3, i17, i18, 1);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (cj6 == 0) {
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            i19 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str3, str2, 1);
            j17 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
            if (i19 == 0) {
                z17 = true;
            }
        } else {
            j17 = 0;
            i19 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageUtil", "origToWxamToJpg: result:%s hevc:%s, %s; jpg:%s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(cj6), java.lang.Long.valueOf(elapsedRealtime2), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17));
        return z17;
    }
}
