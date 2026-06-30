package ht4;

/* loaded from: classes.dex */
public class e implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.i4 f366491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae f366492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ht4.g f366494g;

    public e(ht4.g gVar, am.i4 i4Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae c5314x8b748bae, java.lang.String str) {
        this.f366494g = gVar;
        this.f366491d = i4Var;
        this.f366492e = c5314x8b748bae;
        this.f366493f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(580, this);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae c5314x8b748bae = this.f366492e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreECard", "jsapi check fail");
            c5314x8b748bae.f135630h.f88542a = -1;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m4) c5314x8b748bae.f135629g.f88444l).run();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreECard", "jsapi check success");
        h45.y.f360501a = ((ss4.d) m1Var).H();
        android.content.Context context = (android.content.Context) this.f366491d.f88442j.get();
        if (context == null || !(context instanceof android.app.Activity)) {
            c5314x8b748bae.f135630h.f88542a = -1;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m4) c5314x8b748bae.f135629g.f88444l).run();
            return;
        }
        ht4.g gVar = this.f366494g;
        gVar.f366497d = new ht4.f(gVar, c5314x8b748bae);
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(c5314x8b748bae.f135629g.f88441i, 0);
        am.i4 i4Var = c5314x8b748bae.f135629g;
        jt4.f.d(P, i4Var.f88443k, i4Var.f88440h, this.f366493f, context, gVar.f366497d);
    }
}
