package oc4;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f425868d;

    public c(android.view.ViewGroup viewGroup) {
        this.f425868d = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$1");
        android.view.ViewGroup viewGroup = this.f425868d;
        java.lang.Float valueOf = java.lang.Float.valueOf(viewGroup.getMeasuredHeight() / 2);
        android.os.Vibrator vibrator = ca4.z0.f121601a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("roundCorner", "com.tencent.mm.plugin.sns.data.SnsUtil");
        viewGroup.setOutlineProvider(new ca4.y0(valueOf));
        viewGroup.setClipToOutline(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("roundCorner", "com.tencent.mm.plugin.sns.data.SnsUtil");
        viewGroup.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$1");
    }
}
