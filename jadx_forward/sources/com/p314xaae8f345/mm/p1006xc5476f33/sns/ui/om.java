package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class om implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 f251646d;

    public om(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 activityC18080xc668b4d6) {
        this.f251646d = activityC18080xc668b4d6;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$1");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f1() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18080xc668b4d6 activityC18080xc668b4d6 = this.f251646d;
        intent.putExtra("sns_cmd_list", activityC18080xc668b4d6.f248813t);
        activityC18080xc668b4d6.setResult(-1, intent);
        activityC18080xc668b4d6.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUIWithRelevance$1");
        return true;
    }
}
