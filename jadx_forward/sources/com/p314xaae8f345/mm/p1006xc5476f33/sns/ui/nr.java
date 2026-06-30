package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes11.dex */
public class nr implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 f251556d;

    public nr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 activityC18115x808957e7) {
        this.f251556d = activityC18115x808957e7;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18115x808957e7 activityC18115x808957e7 = this.f251556d;
        sb6.append(activityC18115x808957e7.f248981i);
        sb6.append(" ");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(activityC18115x808957e7.f248979g, ","));
        if (!sb6.toString().equals(activityC18115x808957e7.f248982m) || activityC18115x808957e7.f248980h == 0) {
            db5.e1.n(activityC18115x808957e7, com.p314xaae8f345.mm.R.C30867xcad56011.jff, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mr(this), null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
            return true;
        }
        activityC18115x808957e7.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$5");
        return true;
    }
}
