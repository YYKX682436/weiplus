package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class t0 extends com.tencent.mm.plugin.appbrand.report.model.h implements com.tencent.mm.plugin.appbrand.report.model.r {

    /* renamed from: h, reason: collision with root package name */
    public volatile long f88405h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f88406i;

    /* renamed from: j, reason: collision with root package name */
    public volatile java.lang.String f88407j;

    /* renamed from: k, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.AppBrandRuntime f88408k;

    public t0(int i17) {
        super(i17);
        this.f88405h = 0L;
        this.f88406i = false;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.h
    public void d() {
        super.d();
        if (com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.isGame(this.f88408k)) {
            java.lang.String t07 = this.f88408k.f74806p0 ? this.f88408k.t0() : this.f88408k.x0().getCurrentUrl();
            this.f88405h = 0L;
            if (t07.startsWith("__wx__")) {
                this.f88406i = false;
                this.f88407j = null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.h
    public void e(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f87983c = appBrandRuntime.f74803n;
        this.f87984d = appBrandRuntime;
        this.f88408k = appBrandRuntime;
    }
}
