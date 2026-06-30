package fd4;

/* loaded from: classes4.dex */
public class h implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.i f342842a;

    public h(fd4.i iVar) {
        this.f342842a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        ca4.z0.q(true);
        fd4.i iVar = this.f342842a;
        fd4.k.s(iVar.f342846g).setBackgroundColor(0);
        iVar.f342845f.f506687o.f249947d.performClick();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2
    public void b(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        boolean z17 = true;
        ca4.z0.q(true);
        fd4.i iVar = this.f342842a;
        fd4.k kVar = iVar.f342846g;
        fd4.k kVar2 = iVar.f342846g;
        fd4.k.s(kVar).setBackgroundColor(0);
        if (list.size() > 0) {
            try {
                try {
                    int i17 = kVar2.f342827n == 0 ? 1 : 2;
                    boolean a17 = l44.n5.a(iVar.f342843d, list, iVar.f342844e, i17, fd4.k.s(kVar2).getWidth(), fd4.k.s(kVar2).getHeight());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureAdBusiness", "confirmOpenGestureLandingPage=" + a17 + ", scene=" + i17);
                    if (a17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = kVar2.f342826m;
                        if (nVar == null || nVar.f38341xd41fa323 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureAdBusiness", "no gestureClickActionInfo");
                            kVar2.r(null);
                            kVar2.l();
                            kVar2.k(25);
                        } else {
                            s34.x xVar = kVar2.f342825i.m70354x74235b3e().f38171x7a21d490;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("has gestureClickActionInfo, has animInfo=");
                            if (xVar == null) {
                                z17 = false;
                            }
                            sb6.append(z17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GestureAdBusiness", sb6.toString());
                            kVar2.f342826m.f38341xd41fa323.f244102a = 16;
                            t34.g gVar = new t34.g();
                            t34.f fVar = gVar.f496964a;
                            gVar.f(kVar2.f342827n);
                            gVar.e(kVar2.f342825i);
                            gVar.c(kVar2.f342826m.f38341xd41fa323);
                            gVar.d(kVar2.f342821e);
                            gVar.a(xVar);
                            gVar.b(kVar2.f342829p);
                            u74.d dVar = iVar.f342845f;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            fVar.f496963i = dVar;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar2 = kVar2.f342824h;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            fVar.f496962h = iVar2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
                            gVar.g(kVar2.f342820d);
                        }
                        ca4.z0.I0(new long[]{20, 100});
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GestureAdBusiness", e17, "recog gesture error!", new java.lang.Object[0]);
                }
                fd4.k.s(kVar2).a();
            } catch (java.lang.Throwable th6) {
                fd4.k.s(kVar2).a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGestureEnd", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.w2
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
        ca4.z0.q(false);
        fd4.i iVar = this.f342842a;
        fd4.k.s(iVar.f342846g).setBackgroundColor(iVar.f342846g.f342820d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561041a52));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGestureStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.GestureAdBusiness$1$1");
    }
}
