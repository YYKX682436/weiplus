package dc4;

/* loaded from: classes4.dex */
public class x implements xd4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f310386a;

    public x(dc4.d0 d0Var) {
        this.f310386a = d0Var;
    }

    @Override // xd4.e0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$2");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("timelineVideoView setUICallback onDestroy, the tlId is ");
        sb6.append(str);
        sb6.append(", the timelineId is ");
        dc4.d0 d0Var = this.f310386a;
        sb6.append(d0Var.f310364d.Id);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardAdDetailItemView", sb6.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(d0Var.f310364d.Id)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            d0Var.f310271x1 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$2");
    }
}
