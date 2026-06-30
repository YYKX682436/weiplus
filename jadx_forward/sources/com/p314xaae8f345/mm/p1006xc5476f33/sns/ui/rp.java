package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class rp implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a f251962d;

    public rp(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a) {
        this.f251962d = activityC18109x7a461b7a;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a = this.f251962d;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.d7(activityC18109x7a461b7a));
            if (k17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSightPlayerUI", "expose id " + k17.m70367x7525eefd());
            }
            intent.putExtra("k_expose_msg_id", k17 == null ? 0 : k17.m70367x7525eefd());
            intent.putExtra("k_username", k17 == null ? "" : k17.f68896xdde069b);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 33));
            j45.l.j(activityC18109x7a461b7a, "webview", ".ui.tools.WebViewUI", intent, null);
        } else if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.d7(activityC18109x7a461b7a));
            if (k18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            qb4.a.e(c5303xc75d2f73, k18);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87856i = activityC18109x7a461b7a;
            c4Var.f87860m = 17;
            c5303xc75d2f73.e();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            boolean z17 = activityC18109x7a461b7a.f248905h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            if (z17) {
                ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a), 5, k18.f68891x29d1292e, 11, 0));
                i64.s1.d(i64.q1.Sight, i64.p1.Fav, i64.r1.Full, 0, k18, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a));
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.U6(activityC18109x7a461b7a) == 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6056xc8ff7c74 c6056xc8ff7c74 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6056xc8ff7c74();
                k18.m70363x51f8f990();
                am.ov ovVar = c6056xc8ff7c74.f136339g;
                ovVar.getClass();
                ovVar.f89112a = ca4.z0.T(k18);
                c6056xc8ff7c74.e();
            }
        } else if (itemId == 3) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.Y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2502", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            activityC18109x7a461b7a.f248912r = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2502", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Conv_Type", 3);
            intent2.putExtra("select_is_ret", true);
            intent2.putExtra("mutil_select_is_ret", true);
            intent2.putExtra("image_path", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.c7(activityC18109x7a461b7a));
            intent2.putExtra("Retr_Msg_Type", 11);
            j45.l.v(activityC18109x7a461b7a, ".ui.transmit.SelectConversationUI", intent2, 4097);
        } else if (itemId == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.d7(activityC18109x7a461b7a));
            if (k19 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            if (k19.m70371x485d7().f39014x86965dde.f451370e == 15 && ((r45.jj4) k19.m70371x485d7().f39014x86965dde.f451373h.get(0)) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsSightPlayerUI", "send sight fail, mediaObj is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
                return;
            } else {
                intent3.putExtra("exdevice_open_scene_type", 2);
                intent3.putExtra("sns_local_id", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.d7(activityC18109x7a461b7a));
                intent3.putExtra("sns_send_data_ui_activity", true);
                j45.l.u(activityC18109x7a461b7a, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$14");
    }
}
