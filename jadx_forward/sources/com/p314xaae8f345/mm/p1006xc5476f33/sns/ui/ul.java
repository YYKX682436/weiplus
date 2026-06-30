package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ul implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d f252120d;

    public ul(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        this.f252120d = activityC18078x319f375d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = this.f252120d;
        if (activityC18078x319f375d.B && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", activityC18078x319f375d.f248813t);
        activityC18078x319f375d.setResult(-1, intent);
        activityC18078x319f375d.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$4");
        return true;
    }
}
