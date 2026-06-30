package gp2;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f355845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f355846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f355848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f355849i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f355851n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f355852o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, so2.h1 h1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962, gp2.l0 l0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar, android.view.View view, yz5.a aVar2, yz5.p pVar) {
        super(0);
        this.f355844d = str;
        this.f355845e = h1Var;
        this.f355846f = c14522x8ffd8962;
        this.f355847g = l0Var;
        this.f355848h = h0Var;
        this.f355849i = aVar;
        this.f355850m = view;
        this.f355851n = aVar2;
        this.f355852o = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String liveUrl = this.f355844d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveUrl, "$liveUrl");
        so2.h1 h1Var = this.f355845e;
        gp2.a aVar = new gp2.a(liveUrl, h1Var, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f355846f;
        c14522x8ffd8962.m58393x5bde035d(aVar);
        yz5.a aVar2 = this.f355849i;
        android.view.View view = this.f355850m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd89622 = this.f355846f;
        gp2.l0 l0Var = this.f355847g;
        so2.h1 h1Var2 = this.f355845e;
        gp2.q qVar = new gp2.q(aVar2, view, c14522x8ffd89622, l0Var, h1Var2);
        gp2.p pVar = new gp2.p(this.f355851n, l0Var, h1Var2);
        gp2.r rVar = new gp2.r(this.f355852o, l0Var, h1Var2);
        ig2.h a17 = ig2.m.f372926a.a(h1Var2.mo2128x1ed62e84());
        boolean z17 = a17.f372914b;
        c14522x8ffd8962.m58392x2c9d5ca8(z17);
        if (z17) {
            ig2.j jVar = a17.f372915c;
            mn0.b0 b0Var = jVar != null ? jVar.f372942h : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
            ((mn0.y) b0Var).G(true);
            c14522x8ffd8962.u(a17, qVar, pVar, rVar);
        } else {
            c14522x8ffd8962.mo58394x764d819b(true);
            ws5.f.j(this.f355846f, qVar, pVar, rVar, null, null, null, 56, null);
        }
        mn0.b0 player = c14522x8ffd8962.getPlayer();
        gp2.l0 l0Var2 = this.f355847g;
        if (player != null) {
            ((mn0.y) player).K(l0Var2.f355784j, l0Var2.f355785k);
        }
        ne2.k kVar = (ne2.k) this.f355848h.f391656d;
        if (kVar != null) {
            r45.nw1 m76794xd0557130 = h1Var.getFeedObject().getFeedObject().m76794xd0557130();
            kVar.c(m76794xd0557130 != null ? (r45.td2) m76794xd0557130.m75936x14adae67(27) : null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var2.t(), "checkAutoPlayByOutside: canReusePlayer:" + z17 + " view:" + c14522x8ffd8962);
        return jz5.f0.f384359a;
    }
}
