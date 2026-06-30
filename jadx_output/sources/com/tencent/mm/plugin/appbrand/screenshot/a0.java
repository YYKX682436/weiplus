package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class a0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.screenshot.z f88464e = new com.tencent.mm.plugin.appbrand.screenshot.z(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f88465f = {l75.n0.getCreateSQLs(dm.f0.f236757J, "AppBrandScreenshotInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f88466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l75.k0 db6) {
        super(db6, dm.f0.f236757J, "AppBrandScreenshotInfo", dm.f0.f236763w);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f88466d = db6;
    }

    public final com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo y0(java.lang.String screenshotPath) {
        kotlin.jvm.internal.o.g(screenshotPath, "screenshotPath");
        new com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo().field_screenshotPath = screenshotPath;
        p75.i0 i17 = dm.f0.f236758r.i();
        i17.f352657d = dm.f0.f236759s.j(screenshotPath);
        i17.f352656c = "MicroMsg.SDK.BaseAppBrandScreenshotInfo";
        return (com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo) i17.a().o(this.f88466d, com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo.class);
    }
}
