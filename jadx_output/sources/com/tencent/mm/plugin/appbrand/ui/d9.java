package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class d9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.c9 f89666d;

    public d9(com.tencent.mm.plugin.appbrand.ui.c9 c9Var) {
        this.f89666d = c9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = this.f89666d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = c9Var.f89628x;
        c9Var.setActionBar((appBrandRuntime == null || appBrandRuntime.s0() == null) ? new mi1.i(c9Var.getContext()) : (mi1.i) c9Var.f89628x.s0().a(c9Var.getContext(), mi1.i.class));
    }
}
