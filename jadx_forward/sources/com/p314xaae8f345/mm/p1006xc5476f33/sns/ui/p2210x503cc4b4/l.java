package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f251365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.m f251368g;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str, java.lang.String str2) {
        this.f251368g = mVar;
        this.f251365d = c17933xe8d1b226;
        this.f251366e = str;
        this.f251367f = str2;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.m mVar = this.f251368g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f251365d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_permission_snsinfo_svr_id", c17933xe8d1b226 == null ? 0L : c17933xe8d1b226.f68891x29d1292e);
            intent.putExtra("sns_permission_userName", this.f251366e);
            intent.putExtra("sns_permission_anim", true);
            intent.putExtra("sns_permission_block_scene", 5);
            j45.l.n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(mVar.f251370d), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
        } else if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            java.lang.String str = this.f251367f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = Fj.k1(str);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "error get snsinfo by id " + str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "expose id " + k17.m70367x7525eefd() + " " + k17.f68896xdde069b);
            if (j62.e.g().l("clicfg_sns_expose_config_switch_android", false, false, true)) {
                q80.d0 d0Var = new q80.d0();
                android.os.Bundle bundle = new android.os.Bundle();
                d0Var.f442182a = "wxalited4df4810a40b1d9ddc0cbea44d263fd9";
                d0Var.f442184c = "{\"scene\":33}";
                bundle.putString("k_username", k17.f68896xdde069b);
                bundle.putLong("k_expose_msg_id", k17.f68891x29d1292e);
                d0Var.f442188g = bundle;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(mVar.f251370d), d0Var, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.k(this, k17));
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("k_expose_msg_id", k17.f68891x29d1292e);
                intent2.putExtra("k_username", k17.f68896xdde069b);
                intent2.putExtra("showShare", false);
                intent2.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 33));
                j45.l.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(mVar.f251370d), "webview", ".ui.tools.WebViewUI", intent2, null);
            }
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(c17933xe8d1b226.m70374x6bf53a6c());
            if (f07 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c17933xe8d1b226.m70374x6bf53a6c()) && "3552365301".equals(f07.Q0())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
                java.lang.String m70374x6bf53a6c = k17.m70374x6bf53a6c();
                s0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportWechatWorkExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7141x85bb31b6 c7141x85bb31b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7141x85bb31b6();
                c7141x85bb31b6.f144511f = c7141x85bb31b6.b("OpenimUsername", m70374x6bf53a6c, true);
                c7141x85bb31b6.f144509d = 3L;
                c7141x85bb31b6.f144510e = 1L;
                c7141x85bb31b6.k();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportWechatWorkExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
    }
}
