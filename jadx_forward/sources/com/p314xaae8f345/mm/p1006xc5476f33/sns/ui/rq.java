package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class rq implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18113x5ae4cc1c f251963d;

    public rq(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18113x5ae4cc1c activityC18113x5ae4cc1c) {
        this.f251963d = activityC18113x5ae4cc1c;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStarListUI$setStarListUITitle$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18113x5ae4cc1c activity = this.f251963d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.class);
        c17694x1b4b7a7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        intent.putExtra("sns_cmd_list", c17694x1b4b7a7.f244085r);
        activity.setResult(-1, intent);
        activity.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStarListUI$setStarListUITitle$1");
        return true;
    }
}
