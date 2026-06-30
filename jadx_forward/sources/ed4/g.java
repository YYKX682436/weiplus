package ed4;

/* loaded from: classes4.dex */
public class g implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l f332831a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l lVar) {
        this.f332831a = lVar;
    }

    @Override // b94.d
    public void a() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l lVar = this.f332831a;
        lVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            if (lVar.f250903q.f250802f0.f249951h.getVisibility() == 0) {
                view = lVar.f250903q.f250802f0.f249951h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.CardAdTimeLineItem", "doOnShake, sight");
            } else if (lVar.f250903q.G0.getVisibility() == 0) {
                view = lVar.f250903q.G0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.CardAdTimeLineItem", "doOnShake, img");
            } else {
                view = null;
            }
            if (view != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.CardAdTimeLineItem", "doOnShake, succ");
                view.performClick();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.CardAdTimeLineItem", "doOnShake, clickView==null");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.CardAdTimeLineItem", "doOnShake, exp=" + e17);
            ca4.q.c("doOnShake, cardAd", e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$6");
    }
}
