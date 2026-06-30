package fd4;

/* loaded from: classes4.dex */
public class p implements a94.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.r f342856a;

    public p(fd4.r rVar) {
        this.f342856a = rVar;
    }

    @Override // a94.x
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
        fd4.r rVar = this.f342856a;
        if (rVar.f342825i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeAdBusiness", "onShake, mSnsInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("ad_no_click_anim", true);
        rVar.r(bundle);
        rVar.l();
        rVar.k(36);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShake", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$1");
    }
}
