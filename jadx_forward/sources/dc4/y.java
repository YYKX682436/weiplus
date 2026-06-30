package dc4;

/* loaded from: classes4.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f310398d;

    public y(dc4.d0 d0Var) {
        this.f310398d = d0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
        dc4.d0 d0Var = this.f310398d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = d0Var.f310365e;
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70378x4c74e984()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "forbidAutoPlay");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            d0Var.p();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
            return;
        }
        if (d0Var.X.w() || d0Var.X.f0()) {
            d0Var.X.K();
        } else {
            l44.b3.f397574a.h(d0Var.f310365e);
            d0Var.X.C();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$3");
    }
}
