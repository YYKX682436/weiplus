package dc4;

/* loaded from: classes4.dex */
public class t implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.u f310349a;

    public t(dc4.u uVar) {
        this.f310349a = uVar;
    }

    @Override // b94.d
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$4");
        android.view.View view = this.f310349a.f310368h.f249951h;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdNormalSightDetailItem", "doOnShake, succ");
            view.performClick();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdNormalSightDetailItem", "doOnShake, clickView==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$4");
    }
}
