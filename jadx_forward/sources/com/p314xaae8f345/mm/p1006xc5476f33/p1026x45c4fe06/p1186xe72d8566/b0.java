package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class b0 extends i95.w implements l81.k0 {
    public l81.j0 wi(java.lang.String imgPath) {
        boolean b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0.f169997e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0 a17 = zVar.a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, storage is null");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12570xcc3b76da y07 = a17.y0(imgPath);
            if (y07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotPath: " + imgPath + ", screenshotInfo is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo: " + y07);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0 a18 = zVar.a();
                if (a18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "deleteAllExpired, storage is null");
                } else {
                    ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.y(a18));
                }
                java.lang.String str = y07.f66474x90a2b490;
                if ((str == null || y07.f66473xe3a21bb3 == null || y07.f66466x28d45f97 == null || y07.f66470x21f9b213 == null || y07.f66468xd6403ff1 == null) ? false : true) {
                    java.lang.String str2 = y07.f66473xe3a21bb3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p314xaae8f345.mm.vfs.w6.p(str));
                } else {
                    b17 = false;
                }
                if (b17) {
                    java.lang.String str3 = y07.f66474x90a2b490;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3));
                    if ((r6Var.m() && r6Var.B() == y07.f66472x127cb8ea) ? false : true) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo has modified");
                    } else {
                        if (!(hq.d.a() - y07.f66472x127cb8ea >= 2592000000L)) {
                            return y07;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo is expired");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo is invalid");
                    if (!a17.mo9951xb06685ab(y07, new java.lang.String[0])) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, delete screenshotInfo fail");
                    }
                }
            }
        }
        return null;
    }
}
