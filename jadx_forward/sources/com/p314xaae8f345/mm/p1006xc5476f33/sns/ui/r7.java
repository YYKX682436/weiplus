package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class r7 implements ud4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 f251925a;

    public r7(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var) {
        this.f251925a = p7Var;
    }

    @Override // ud4.d
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var = this.f251925a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7 x7Var = p7Var.f251697g;
        x7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        if (i17 == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        } else if (x7Var.f253025a.size() <= i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        } else {
            java.lang.String str = (java.lang.String) x7Var.f253025a.remove(i17);
            if (i18 < x7Var.f253025a.size()) {
                x7Var.f253025a.add(i18, str);
            } else {
                x7Var.f253025a.add(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        }
        p7Var.f251490c.getIntent().putExtra("sns_kemdia_path_list", p7Var.f251697g.d());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("moveItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
    }

    @Override // ud4.d
    /* renamed from: removeItem */
    public void mo71192x417605b7(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PicWidget", "removeItem: pos:%d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 p7Var = this.f251925a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x7 x7Var = p7Var.f251697g;
        x7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        if (x7Var.f253025a.size() > i17) {
            x7Var.f253025a.remove(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = p7Var.f251490c;
        if (abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) abstractActivityC21394xb3d2c0cf).q7();
        }
        p7Var.f251490c.getIntent().putExtra("sns_kemdia_path_list", p7Var.f251697g.d());
        p7Var.f251490c.getIntent().putExtra("sns_kemdia_path", "");
        ((ud4.t) p7Var.f251698h).d(p7Var.f251697g.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeItem", "com.tencent.mm.plugin.sns.ui.PicWidget$2");
    }
}
