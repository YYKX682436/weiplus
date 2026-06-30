package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public abstract class xf {
    public static final java.lang.String a(java.lang.String videoPath, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(videoPath.concat(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG));
        try {
            ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
            android.graphics.Bitmap p17 = ai3.d.p(videoPath);
            if (p17 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 100, android.graphics.Bitmap.CompressFormat.PNG, r6Var.o(), true);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SendVideoCommons", "createThumbFile, fail since " + e17);
            r6Var = null;
        }
        if (r6Var != null) {
            return r6Var.o();
        }
        return null;
    }

    public static final int b(java.lang.String videoPath) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        try {
            gp.d dVar = new gp.d();
            dVar.setDataSource(videoPath);
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(dVar.extractMetadata(9), 0L);
            dVar.release();
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(V);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SendVideoCommons", "parseVideoDurationS, duration: " + i17);
        return i17;
    }
}
