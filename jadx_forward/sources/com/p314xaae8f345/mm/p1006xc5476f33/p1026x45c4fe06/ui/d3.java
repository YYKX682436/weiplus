package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f171190d = appBrandDebugUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe it = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = !it.h();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w8.f157559a;
        if (z17 != com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__appbrand_comm_lib__prefs").getBoolean("disable_develop_lib", false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("__appbrand_comm_lib__prefs").putBoolean("disable_develop_lib", z17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293262s = "重启微信使内置基础库更改生效";
            aVar.f293265v = "重启";
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f171190d;
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c3(appBrandDebugUI);
            aVar.f293266w = of5.b.a(appBrandDebugUI).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
            aVar.A = false;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(appBrandDebugUI, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
        }
        return jz5.f0.f384359a;
    }
}
