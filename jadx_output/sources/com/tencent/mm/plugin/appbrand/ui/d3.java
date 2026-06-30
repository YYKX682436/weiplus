package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f89657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        super(1);
        this.f89657d = appBrandDebugUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.weui.base.preference.CheckBoxPreference it = (com.tencent.weui.base.preference.CheckBoxPreference) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = !it.h();
        int i17 = com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
        if (z17 != com.tencent.mm.sdk.platformtools.o4.M("__appbrand_comm_lib__prefs").getBoolean("disable_develop_lib", false)) {
            com.tencent.mm.sdk.platformtools.o4.M("__appbrand_comm_lib__prefs").putBoolean("disable_develop_lib", z17);
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211729s = "重启微信使内置基础库更改生效";
            aVar.f211732v = "重启";
            com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI = this.f89657d;
            aVar.E = new com.tencent.mm.plugin.appbrand.ui.c3(appBrandDebugUI);
            aVar.f211733w = of5.b.a(appBrandDebugUI).getString(com.tencent.mm.R.string.f490347sg);
            aVar.A = false;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(appBrandDebugUI, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
        }
        return jz5.f0.f302826a;
    }
}
