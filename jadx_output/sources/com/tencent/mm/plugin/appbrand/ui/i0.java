package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.j0 f89770e;

    public i0(com.tencent.mm.plugin.appbrand.ui.j0 j0Var, boolean z17) {
        this.f89770e = j0Var;
        this.f89769d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f89769d;
        com.tencent.mm.plugin.appbrand.ui.j0 j0Var = this.f89770e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z6(j0Var.f89798b.f89817e, j0Var.f89797a);
        } else {
            com.tencent.mm.plugin.appbrand.ui.k0 k0Var = j0Var.f89798b;
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z6(k0Var.f89817e, k0Var.f89816d);
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = j0Var.f89798b.f89817e;
        com.tencent.mm.ui.base.preference.Preference preference = appBrandAuthorizeUI.f89310p;
        if (preference != null) {
            if (appBrandAuthorizeUI.f89315u.f388060f != 1) {
                preference.G(com.tencent.mm.R.string.f490062ju);
            } else {
                preference.G(com.tencent.mm.R.string.f490061jt);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) j0Var.f89798b.f89817e.f89308n).notifyDataSetChanged();
    }
}
