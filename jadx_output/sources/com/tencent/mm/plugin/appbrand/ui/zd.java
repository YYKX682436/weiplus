package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class zd implements com.tencent.mm.plugin.appbrand.ui.bd {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f90373d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f90374e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f90375f;

    public zd(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f90373d = rt6;
        jz5.i iVar = jz5.i.f302831f;
        this.f90374e = jz5.h.a(iVar, new com.tencent.mm.plugin.appbrand.ui.xd(this));
        this.f90375f = jz5.h.a(iVar, new com.tencent.mm.plugin.appbrand.ui.yd(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.bd
    public int E6(com.tencent.mm.plugin.appbrand.e9 service) {
        xi1.f statusBar;
        kotlin.jvm.internal.o.g(service, "service");
        xi1.g windowAndroid = service.getWindowAndroid();
        if (windowAndroid == null || (statusBar = windowAndroid.getStatusBar()) == null || 8 == statusBar.f454703b) {
            return 0;
        }
        return statusBar.f454702a;
    }

    public final int a(android.content.Context context, int i17) {
        if (context == null) {
            context = this.f90373d.f74795d;
        }
        return context.getResources().getDimensionPixelSize(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.bd
    public com.tencent.mm.plugin.appbrand.ui.ad a7() {
        xi1.o a17 = this.f90373d.getWindowAndroid().getOrientationHandler().a();
        xi1.o oVar = xi1.o.PORTRAIT;
        jz5.g gVar = this.f90375f;
        return a17 == oVar ? new com.tencent.mm.plugin.appbrand.ui.ad(0, (a(b(), com.tencent.mm.R.dimen.f479623ay) - a((android.content.Context) gVar.getValue(), com.tencent.mm.R.dimen.f480036m8)) / 2, a(b(), com.tencent.mm.R.dimen.f480020lt), 0) : new com.tencent.mm.plugin.appbrand.ui.ad(0, (a(b(), com.tencent.mm.R.dimen.f479623ay) - a((android.content.Context) gVar.getValue(), com.tencent.mm.R.dimen.f480036m8)) / 2, a(b(), com.tencent.mm.R.dimen.f480021lu), 0);
    }

    public final android.content.Context b() {
        return (android.content.Context) this.f90374e.getValue();
    }
}
