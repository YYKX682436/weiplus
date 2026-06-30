package com.tencent.mm.plugin.appbrand.screenshot;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes7.dex */
public final class b0 extends i95.w implements l81.k0 {
    public l81.j0 wi(java.lang.String imgPath) {
        boolean b17;
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        com.tencent.mm.plugin.appbrand.screenshot.z zVar = com.tencent.mm.plugin.appbrand.screenshot.a0.f88464e;
        com.tencent.mm.plugin.appbrand.screenshot.a0 a17 = zVar.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, storage is null");
        } else {
            com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo y07 = a17.y0(imgPath);
            if (y07 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotPath: " + imgPath + ", screenshotInfo is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo: " + y07);
                com.tencent.mm.plugin.appbrand.screenshot.a0 a18 = zVar.a();
                if (a18 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "deleteAllExpired, storage is null");
                } else {
                    ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.screenshot.y(a18));
                }
                java.lang.String str = y07.field_screenshotPath;
                if ((str == null || y07.field_screenshotMd5 == null || y07.field_appId == null || y07.field_nickname == null || y07.field_iconUrl == null) ? false : true) {
                    java.lang.String str2 = y07.field_screenshotMd5;
                    kotlin.jvm.internal.o.d(str);
                    b17 = kotlin.jvm.internal.o.b(str2, com.tencent.mm.vfs.w6.p(str));
                } else {
                    b17 = false;
                }
                if (b17) {
                    java.lang.String str3 = y07.field_screenshotPath;
                    kotlin.jvm.internal.o.d(str3);
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3));
                    if ((r6Var.m() && r6Var.B() == y07.field_screenshotLastModified) ? false : true) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo has modified");
                    } else {
                        if (!(hq.d.a() - y07.field_screenshotLastModified >= 2592000000L)) {
                            return y07;
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo is expired");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, screenshotInfo is invalid");
                    if (!a17.delete(y07, new java.lang.String[0])) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "queryNonExpired, delete screenshotInfo fail");
                    }
                }
            }
        }
        return null;
    }
}
