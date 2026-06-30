package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.g0 f89695e;

    public f0(com.tencent.mm.plugin.appbrand.ui.g0 g0Var, boolean z17) {
        this.f89695e = g0Var;
        this.f89694d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f89694d;
        com.tencent.mm.plugin.appbrand.ui.g0 g0Var = this.f89695e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Y6(g0Var.f89722b.f89747e, g0Var.f89721a);
        } else {
            com.tencent.mm.plugin.appbrand.ui.h0 h0Var = g0Var.f89722b;
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Y6(h0Var.f89747e, h0Var.f89746d);
        }
        g0Var.f89722b.f89747e.q7();
        ((com.tencent.mm.ui.base.preference.h0) g0Var.f89722b.f89747e.f89308n).notifyDataSetChanged();
    }
}
