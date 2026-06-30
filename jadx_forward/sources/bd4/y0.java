package bd4;

/* loaded from: classes4.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc f100946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f100947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f100949g;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc c18275x32e752fc, int i17, int i18, int i19) {
        this.f100946d = c18275x32e752fc;
        this.f100947e = i17;
        this.f100948f = i18;
        this.f100949g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2$onGlobalLayout$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18275x32e752fc c18275x32e752fc = this.f100946d;
        int i17 = this.f100947e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c18275x32e752fc.p0(i17);
        int top = (p07 == null || (view = p07.f3639x46306858) == null) ? 0 : view.getTop();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("forceScrollToPosition view:");
        sb6.append(p07 != null ? p07.f3639x46306858 : null);
        sb6.append(" offset:");
        sb6.append(top);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.RecyclerView", sb6.toString());
        int i18 = this.f100948f;
        if (top == i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2$onGlobalLayout$1");
            return;
        }
        int i19 = this.f100949g + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        c18275x32e752fc.g1(i17, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$safeForceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView$safeForceScrollToPosition$2$onGlobalLayout$1");
    }
}
