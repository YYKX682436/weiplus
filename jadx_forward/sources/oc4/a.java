package oc4;

/* loaded from: classes4.dex */
public final class a extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee f425866a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18249xbd6bf5ee c18249xbd6bf5ee) {
        this.f425866a = c18249xbd6bf5ee;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        long hashCode = this.f425866a.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        return hashCode;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("Key-Unread-Expose", currentTimeMillis);
            android.content.Context context = this.f425866a.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8 c18250x12aff9a8 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2191xcdea73af.C18250x12aff9a8.class);
            c18250x12aff9a8.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unreadBtnExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            c18250x12aff9a8.f250552o++;
            if (c18250x12aff9a8.f250553p <= 0) {
                c18250x12aff9a8.f250553p = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unreadBtnExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            rc4.e eVar = rc4.e.f475669a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUnreadTierExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            rc4.e.f475675g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUnreadTierExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveUnreadTierView", "markTierIndicatorExpose time:" + currentTimeMillis);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$1");
    }
}
