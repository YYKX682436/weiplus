package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public abstract class xf {
    public static final java.lang.String a(java.lang.String videoPath, java.lang.String str) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(videoPath.concat(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG));
        try {
            ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
            android.graphics.Bitmap p17 = ai3.d.p(videoPath);
            if (p17 != null) {
                com.tencent.mm.sdk.platformtools.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.PNG, r6Var.o(), true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.SendVideoCommons", "createThumbFile, fail since " + e17);
            r6Var = null;
        }
        if (r6Var != null) {
            return r6Var.o();
        }
        return null;
    }

    public static final int b(java.lang.String videoPath) {
        int i17;
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        try {
            gp.d dVar = new gp.d();
            dVar.setDataSource(videoPath);
            long V = com.tencent.mm.sdk.platformtools.t8.V(dVar.extractMetadata(9), 0L);
            dVar.release();
            i17 = com.tencent.mm.sdk.platformtools.t8.V1(V);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SendVideoCommons", "parseVideoDurationS, duration: " + i17);
        return i17;
    }
}
