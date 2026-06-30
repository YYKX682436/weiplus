package o74;

/* loaded from: classes4.dex */
public class h implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f425103a;

    public h(o74.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        this.f425103a = baseViewHolder;
    }

    @Override // b94.d
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$4");
        android.view.View view = this.f425103a.f250802f0.f249951h;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdSightTimeLineItem", "doOnShake, succ");
            view.performClick();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdSightTimeLineItem", "doOnShake, clickView==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$4");
    }
}
