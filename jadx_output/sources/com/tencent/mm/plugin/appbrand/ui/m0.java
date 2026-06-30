package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.n0 f89856e;

    public m0(com.tencent.mm.plugin.appbrand.ui.n0 n0Var, boolean z17) {
        this.f89856e = n0Var;
        this.f89855d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f89855d;
        com.tencent.mm.plugin.appbrand.ui.n0 n0Var = this.f89856e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = n0Var.f89876c;
            int i17 = n0Var.f89874a;
            java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
            appBrandAuthorizeUI.p7(i17);
        } else {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI2 = n0Var.f89876c;
            int i18 = n0Var.f89875b;
            java.lang.String[] strArr2 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
            appBrandAuthorizeUI2.p7(i18);
        }
        n0Var.f89876c.o7();
        ((com.tencent.mm.ui.base.preference.h0) n0Var.f89876c.f89308n).notifyDataSetChanged();
    }
}
