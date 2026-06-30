package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public abstract class p7 {
    public static final void a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaUtils", "clearExif path:%s", path);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c(path);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaUtils", "clearExif error:%s", e17.getMessage());
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaUtils", "clearExif error:%s", e18.getMessage());
        }
    }

    public static final java.lang.String b(java.lang.String originalPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalPath, "originalPath");
        java.lang.String K = lp0.b.K();
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(K + "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, true);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(K);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                m18.f294799a.r(m18.f294800b);
            }
        }
        return (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) && com.p314xaae8f345.mm.vfs.w6.d(originalPath, i17, false) > 0) ? i17 : originalPath;
    }

    public static final java.lang.String c(java.lang.String srcPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        return d(srcPath, -1, -1, 70);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(java.lang.String r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.d(java.lang.String, int, int, int):java.lang.String");
    }

    public static final java.lang.String e(java.lang.String srcPath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(srcPath).m43592x7a249f0b();
        if (m43592x7a249f0b == 0) {
            return srcPath;
        }
        int i17 = m43592x7a249f0b % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap d17 = com.p314xaae8f345.mm.p786x600aa8b.e.d(srcPath, options);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaUtils", "rotate image, get null bmp");
                return srcPath;
            }
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(d17, i17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.K());
            sb6.append("microMsg.tmp.");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(je.a.d(options) ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG : ".png");
            java.lang.String sb7 = sb6.toString();
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(w07, z17 ? 97 : 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                if (je.a.d(options)) {
                    ya1.d.b(srcPath, sb7);
                }
                return sb7;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaUtils", "rotate image, exception occurred when saving | %s", e17);
                com.p314xaae8f345.mm.vfs.w6.h(sb7);
                return srcPath;
            }
        } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
            return srcPath;
        }
    }

    public static final boolean f(java.util.List imageFiles) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageFiles, "imageFiles");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(imageFiles)) {
            return false;
        }
        java.util.Iterator it = imageFiles.iterator();
        while (it.hasNext()) {
            if (com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46((java.lang.String) it.next()).m43592x7a249f0b() != 0) {
                return true;
            }
        }
        return false;
    }
}
