package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k8 implements com.tencent.mm.plugin.appbrand.widget.recent.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f86833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.l8 f86834e;

    public k8(com.tencent.mm.plugin.appbrand.page.l8 l8Var, android.view.View view) {
        this.f86834e = l8Var;
        this.f86833d = view;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.k0
    public void b(int i17) {
        com.tencent.mm.plugin.appbrand.page.l8 l8Var = this.f86834e;
        l8Var.f86858d.Q1.setRefreshListener(null);
        l8Var.a(this.f86833d);
    }
}
