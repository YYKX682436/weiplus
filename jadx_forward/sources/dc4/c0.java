package dc4;

/* loaded from: classes4.dex */
public class c0 implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f310255a;

    public c0(dc4.d0 d0Var) {
        this.f310255a = d0Var;
    }

    @Override // b94.d
    public void a() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$7");
        dc4.d0 d0Var = this.f310255a;
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            if (d0Var.f310368h.f249951h.getVisibility() == 0) {
                view = d0Var.f310368h.f249951h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, sight");
            } else if (d0Var.f310272y.getVisibility() == 0) {
                view = d0Var.f310272y;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, img");
            } else {
                view = null;
            }
            if (view != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, succ");
                view.performClick();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdDetailItemView", "doOnShake, clickView==null");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardAdDetailItemView", "doOnShake, exp=" + e17);
            ca4.q.c("doOnShake, cardAdDetail", e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$7");
    }
}
