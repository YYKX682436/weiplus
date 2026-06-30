package dc4;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dc4.u0 f310351e;

    public t0(dc4.u0 u0Var, java.lang.String str) {
        this.f310351e = u0Var;
        this.f310350d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$2");
        dc4.u0 u0Var = this.f310351e;
        java.lang.String str = dc4.v0.n(u0Var.f310363a) != null ? dc4.v0.n(u0Var.f310363a).f247628g : "";
        java.lang.String str2 = this.f310350d;
        if (str2 == null || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "before do shot, url != CardInfo.sphereImageUrl, url=" + str2 + ", info.url=" + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "do shot");
            jb4.v.f(u0Var.f310363a.f310381x, str, "scene_timeline");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "enable touch and sensor after shot");
        u0Var.f310363a.f310381x.m70291xc4a52ce5(true);
        u0Var.f310363a.f310381x.m70292xd5adfc84(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$2");
    }
}
