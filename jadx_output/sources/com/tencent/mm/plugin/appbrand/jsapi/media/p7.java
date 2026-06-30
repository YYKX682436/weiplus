package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public abstract class p7 {
    public static final void a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaUtils", "clearExif path:%s", path);
            com.tencent.mm.sdk.platformtools.t8.c(path);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaUtils", "clearExif error:%s", e17.getMessage());
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaUtils", "clearExif error:%s", e18.getMessage());
        }
    }

    public static final java.lang.String b(java.lang.String originalPath) {
        kotlin.jvm.internal.o.g(originalPath, "originalPath");
        java.lang.String K = lp0.b.K();
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(K + "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG, true);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(K);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        return (!com.tencent.mm.sdk.platformtools.t8.K0(i17) && com.tencent.mm.vfs.w6.d(originalPath, i17, false) > 0) ? i17 : originalPath;
    }

    public static final java.lang.String c(java.lang.String srcPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.media.p7.d(java.lang.String, int, int, int):java.lang.String");
    }

    public static final java.lang.String e(java.lang.String srcPath, boolean z17) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(srcPath).getOrientationInDegree();
        if (orientationInDegree == 0) {
            return srcPath;
        }
        int i17 = orientationInDegree % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(srcPath, options);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaUtils", "rotate image, get null bmp");
                return srcPath;
            }
            android.graphics.Bitmap w07 = com.tencent.mm.sdk.platformtools.x.w0(d17, i17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.K());
            sb6.append("microMsg.tmp.");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(je.a.d(options) ? com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG : ".png");
            java.lang.String sb7 = sb6.toString();
            try {
                com.tencent.mm.sdk.platformtools.x.D0(w07, z17 ? 97 : 80, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, sb7, true);
                if (je.a.d(options)) {
                    ya1.d.b(srcPath, sb7);
                }
                return sb7;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaUtils", "rotate image, exception occurred when saving | %s", e17);
                com.tencent.mm.vfs.w6.h(sb7);
                return srcPath;
            }
        } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError unused) {
            return srcPath;
        }
    }

    public static final boolean f(java.util.List imageFiles) {
        kotlin.jvm.internal.o.g(imageFiles, "imageFiles");
        if (com.tencent.mm.sdk.platformtools.t8.L0(imageFiles)) {
            return false;
        }
        java.util.Iterator it = imageFiles.iterator();
        while (it.hasNext()) {
            if (com.tencent.mm.compatible.util.Exif.fromFile((java.lang.String) it.next()).getOrientationInDegree() != 0) {
                return true;
            }
        }
        return false;
    }
}
