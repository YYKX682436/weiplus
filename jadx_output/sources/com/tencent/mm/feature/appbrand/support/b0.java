package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.plugin.appbrand.appusage.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ft.h f65056a;

    public b0(ft.h hVar) {
        this.f65056a = hVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.b1
    public final void a(boolean z17, java.lang.String str) {
        ft.h hVar = this.f65056a;
        if (hVar != null) {
            cl1.c0 c0Var = (cl1.c0) hVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRecentDesktopViewModel", "fetchNextPageFromServer: " + z17 + ' ' + str);
            cl1.d0 d0Var = c0Var.f42855a;
            yz5.l lVar = c0Var.f42856b;
            d0Var.getClass();
            ((ku5.t0) ku5.t0.f312615d).q(new cl1.b0(d0Var, lVar));
        }
    }
}
