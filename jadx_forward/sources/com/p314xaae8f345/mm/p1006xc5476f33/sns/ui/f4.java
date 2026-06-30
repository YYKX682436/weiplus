package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class f4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f249823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 f249824e;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f249824e = c4Var;
        this.f249823d = c17933xe8d1b226;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var = this.f249824e;
        c4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doFootSheetCLick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "request deal QBAR string");
        wd4.l1 l1Var = c4Var.f249624h;
        if (l1Var != null && l1Var.g()) {
            c4Var.f249624h.d().u();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f249823d;
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        bundle.putString("stat_msg_id", "sns_" + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        bundle.putString("stat_chat_talker_username", c17933xe8d1b226.f68896xdde069b);
        bundle.putString("stat_send_msg_user", c17933xe8d1b226.f68896xdde069b);
        bundle.putInt("stat_scene", 3);
        bundle.putInt("pay_qrcode_session_type", 3);
        bundle.putString("pay_qrcode_session_name", c17933xe8d1b226.f68896xdde069b);
        bundle.putString("pay_qrcode_sender_username", c17933xe8d1b226.f68896xdde069b);
        bundle.putString("pay_qrcode_timeline_objid", t07);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("DealQBarString", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "request deal QBAR string snsSvrId: %s", t07);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        android.app.Activity activity = (android.app.Activity) c4Var.f249620d;
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = activity;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = c4Var.f249636w;
        r3Var.f89313a = c17261xe88a6357.f240152d;
        r3Var.f89315c = c17261xe88a6357.f240153e;
        r3Var.f89316d = c17261xe88a6357.f240154f;
        r3Var.f89321i = 38;
        r3Var.f89324l = bundle;
        r3Var.f89325m = c17261xe88a6357.f240160o;
        r3Var.f89327o = true;
        r3Var.f89329q = c17261xe88a6357.f240163r;
        r45.db0 db0Var = new r45.db0();
        r3Var.f89328p = db0Var;
        db0Var.f453815e = t07;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        android.os.Bundle bundle2 = r3Var.f89324l;
        if (bundle2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "addStatInfo4AppBrand, statObj is null");
            bundle2 = new android.os.Bundle();
            r3Var.f89324l = bundle2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "addStatInfo4AppBrand, from sns");
        bundle2.putInt("LaunchCodeScene_ScanScene", 2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        c5292x67f91197.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("DealQBarString", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doFootSheetCLick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$2");
    }
}
