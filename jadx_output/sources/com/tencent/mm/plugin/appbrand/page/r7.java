package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class r7 implements com.tencent.mm.plugin.appbrand.widget.recent.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87060a;

    public r7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87060a = n7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.c2
    public com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo getScene() {
        if (this.f87060a.isRunning()) {
            return new com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo(this.f87060a.getRuntime().u0().f47278x, this.f87060a.getRuntime().E0().f305842e, this.f87060a.getRuntime().E0().f305852r.f75399d, this.f87060a.getRuntime().E0().f305852r.pkgVersion, this.f87060a.getRuntime().E0().f305841d, this.f87060a.getRuntime().E0().f47295v, this.f87060a.getRuntime().E0().f305843f, false, this.f87060a.getRuntime().E0().f47294p0, 0L);
        }
        return null;
    }
}
