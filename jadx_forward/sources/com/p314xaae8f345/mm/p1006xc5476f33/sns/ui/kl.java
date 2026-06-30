package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class kl implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d f251172d;

    public kl(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        this.f251172d = activityC18078x319f375d;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$13");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = this.f251172d;
        if (itemId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.c7(activityC18078x319f375d, activityC18078x319f375d.I);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected delMsg snsCommentID:%d", java.lang.Integer.valueOf(activityC18078x319f375d.I));
        } else if (itemId == 1) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.Z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            activityC18078x319f375d.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notRemind", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            db5.e1.A(activityC18078x319f375d, activityC18078x319f375d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbu), "", activityC18078x319f375d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hbt), activityC18078x319f375d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nl(activityC18078x319f375d), null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notRemind", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            gc4.e.a();
            gc4.e.f351982b.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected notRemind snsCommentID:%d", java.lang.Integer.valueOf(activityC18078x319f375d.I));
        } else if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.V6(activityC18078x319f375d, false);
            gc4.e.a();
            gc4.e.f351982b.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onMMMenuItemSelected remindImp snsCommentID:%d", java.lang.Integer.valueOf(activityC18078x319f375d.I));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$13");
    }
}
