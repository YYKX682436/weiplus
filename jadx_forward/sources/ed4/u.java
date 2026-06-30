package ed4;

/* loaded from: classes4.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 f332859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ed4.v f332860f;

    public u(ed4.v vVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var) {
        this.f332860f = vVar;
        this.f332858d = str;
        this.f332859e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$2");
        ed4.v vVar = this.f332860f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = vVar.f332861a.f250940r;
        java.lang.String str = pVar != null ? pVar.f247628g : "";
        java.lang.String str2 = this.f332858d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var = this.f332859e;
        if (str2 == null || !str2.equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "before do shot, url != CardInfo.sphereImageUrl, url=" + str2 + ", info.url=" + str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "do shot");
            jb4.v.f(p0Var.G0, str, "scene_timeline");
            vVar.f332861a.f250942t = false;
        }
        vVar.f332861a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "enable touch and sensor after shot, isInLowPriority=false");
        vVar.f332861a.getClass();
        p0Var.G0.m70291xc4a52ce5(true);
        p0Var.G0.m70292xd5adfc84(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$2");
    }
}
