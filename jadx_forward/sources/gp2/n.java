package gp2;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f355808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f355810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f355811h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355812i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.q84 f355813m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f355814n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, so2.j5 j5Var, gp2.l0 l0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962, android.view.View view, r45.q84 q84Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f355807d = str;
        this.f355808e = j5Var;
        this.f355809f = l0Var;
        this.f355810g = i17;
        this.f355811h = c14522x8ffd8962;
        this.f355812i = view;
        this.f355813m = q84Var;
        this.f355814n = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        mn0.b0 b0Var;
        mn0.b0 b0Var2;
        java.lang.String liveUrl = this.f355807d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveUrl, "$liveUrl");
        so2.h1 h1Var = (so2.h1) this.f355808e;
        gp2.l0 l0Var = this.f355809f;
        int i17 = this.f355810g;
        gp2.a aVar = new gp2.a(liveUrl, h1Var, l0Var.A(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f355811h;
        c14522x8ffd8962.m58393x5bde035d(aVar);
        android.view.View view = this.f355812i;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.icp) : null;
        int hashCode = frameLayout != null ? frameLayout.hashCode() : 0;
        java.util.Iterator it = l0Var.A.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gp2.g gVar = (gp2.g) obj;
            if (gVar.f355753a == i17 && gVar.f355754b == hashCode) {
                break;
            }
        }
        gp2.g gVar2 = (gp2.g) obj;
        boolean z17 = gVar2 != null ? gVar2.f355755c : true;
        gp2.l0 l0Var2 = this.f355809f;
        android.view.View view2 = this.f355812i;
        so2.j5 j5Var = this.f355808e;
        gp2.m mVar = new gp2.m(l0Var2, view2, j5Var, this.f355810g, this.f355811h);
        ig2.h a17 = ig2.m.f372926a.a(((so2.h1) j5Var).mo2128x1ed62e84());
        boolean z18 = a17.f372914b;
        c14522x8ffd8962.m58392x2c9d5ca8(z18);
        ig2.j jVar = a17.f372915c;
        if (z18) {
            if (jVar != null && (b0Var2 = jVar.f372942h) != null) {
                ((mn0.y) b0Var2).G(z17);
            }
            c14522x8ffd8962.u(a17, mVar, null, null);
        } else {
            if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh() && jVar != null && (b0Var = jVar.f372942h) != null) {
                mn0.b0.C(b0Var, false, false, false, 6, null);
            }
            c14522x8ffd8962.mo58394x764d819b(z17);
            ws5.f.j(this.f355811h, mVar, null, null, null, null, null, 62, null);
        }
        mn0.b0 player = c14522x8ffd8962.getPlayer();
        if (player != null) {
            ((mn0.y) player).K(l0Var.f355784j, l0Var.f355785k);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "checkAutoPlay canReusePlayer:" + z18 + " view:" + c14522x8ffd8962 + ",previewTimeLimit:" + this.f355813m.m75939xb282bd08(2));
        ne2.k kVar = (ne2.k) this.f355814n.f391656d;
        if (kVar != null) {
            r45.nw1 m76794xd0557130 = h1Var.getFeedObject().getFeedObject().m76794xd0557130();
            kVar.c(m76794xd0557130 != null ? (r45.td2) m76794xd0557130.m75936x14adae67(27) : null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "checkAutoPlay pos:" + i17 + " startCountDown!");
        return jz5.f0.f384359a;
    }
}
