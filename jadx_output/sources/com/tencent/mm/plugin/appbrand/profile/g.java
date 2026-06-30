package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class g implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f87681d;

    public g(com.tencent.mm.plugin.appbrand.y yVar) {
        this.f87681d = yVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        com.tencent.mm.plugin.appbrand.page.v5 pageView;
        com.tencent.mm.plugin.appbrand.page.i3 x07 = this.f87681d.getRuntime().x0();
        if (x07 == null || (pageView = x07.getPageView()) == null) {
            return null;
        }
        return pageView.S1(false);
    }
}
