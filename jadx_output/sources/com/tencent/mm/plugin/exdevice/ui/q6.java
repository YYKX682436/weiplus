package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class q6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI f99633d;

    public q6(com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI) {
        this.f99633d = exdeviceRankInfoUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String valueOf;
        r45.dh7 dh7Var;
        r32.a y07;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI exdeviceRankInfoUI = this.f99633d;
        if (itemId == 0) {
            ve4.g.a(15);
            if (com.tencent.mm.sdk.platformtools.t8.K0(exdeviceRankInfoUI.f99332J) && (y07 = com.tencent.mm.plugin.exdevice.model.l3.wi().y0(exdeviceRankInfoUI.f99347u)) != null) {
                exdeviceRankInfoUI.f99332J = y07.field_championUrl;
            }
            r32.d c17 = exdeviceRankInfoUI.f99334e.c(exdeviceRankInfoUI.f99347u, exdeviceRankInfoUI.D);
            if (c17 != null) {
                str = java.lang.String.valueOf(c17.field_ranknum);
                valueOf = java.lang.String.valueOf(c17.field_score);
            } else {
                str = "--";
                valueOf = (c17 != null || (dh7Var = exdeviceRankInfoUI.Q) == null) ? "0" : java.lang.String.valueOf(dh7Var.f372476e);
            }
            new com.tencent.mm.plugin.exdevice.model.f3().b(exdeviceRankInfoUI, str, valueOf, exdeviceRankInfoUI.f99332J, new com.tencent.mm.plugin.exdevice.ui.h6(exdeviceRankInfoUI));
            return;
        }
        if (itemId == 1) {
            ve4.g.a(16);
            int i18 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
            exdeviceRankInfoUI.a7();
        } else {
            if (itemId != 2) {
                if (itemId != 3) {
                    return;
                }
                ve4.g.a(36);
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                appBrandStatObject.f87790f = 1063;
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(null, "gh_1f9ebf140e39@app", null, 0, 0, null, appBrandStatObject);
                return;
            }
            ve4.g.a(7);
            int i19 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.V;
            exdeviceRankInfoUI.getClass();
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject2.f87790f = 1063;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(exdeviceRankInfoUI.getContext(), null, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_wesports_appbrand_path_appid_and, "wxff244f6b82a094d2", true), 0, 0, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_wesports_appbrand_path_rank_and, "pages/whole/match/main.html?spm=59.2486.2487", true), appBrandStatObject2);
        }
    }
}
