package hc4;

/* loaded from: classes4.dex */
public final class d implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5 f361893d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5 activityC18203x35bf69b5) {
        this.f361893d = activityC18203x35bf69b5;
    }

    @Override // vj5.k
    public final void n6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI$callback$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsTimelineUI", "fixActionBarStuff newHeight=" + i17);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5.f250173u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getActionBarContainer$p", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        android.view.View view = this.f361893d.f250174s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getActionBarContainer$p", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
        if (view != null) {
            view.setPadding(0, i17, 0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStatusBarHeightChange", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI$callback$1");
    }
}
