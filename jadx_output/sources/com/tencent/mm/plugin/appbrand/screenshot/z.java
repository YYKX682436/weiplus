package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class z {
    public z(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.screenshot.a0 a() {
        return (com.tencent.mm.plugin.appbrand.screenshot.a0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.screenshot.a0.class);
    }

    public final boolean b(com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo screenshotInfo) {
        kotlin.jvm.internal.o.g(screenshotInfo, "screenshotInfo");
        com.tencent.mm.plugin.appbrand.screenshot.a0 a17 = a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "insert, storage is null");
            return false;
        }
        boolean insert = a17.insert(screenshotInfo);
        com.tencent.mm.plugin.appbrand.screenshot.a0 a18 = com.tencent.mm.plugin.appbrand.screenshot.a0.f88464e.a();
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "deleteAllExpired, storage is null");
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.screenshot.y(a18));
        }
        return insert;
    }
}
