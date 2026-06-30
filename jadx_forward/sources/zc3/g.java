package zc3;

/* loaded from: classes7.dex */
public final class g implements zc3.c {

    /* renamed from: a, reason: collision with root package name */
    public iq0.c f552948a;

    /* renamed from: b, reason: collision with root package name */
    public zq0.a f552949b;

    /* renamed from: c, reason: collision with root package name */
    public final jc3.y0 f552950c;

    public g() {
        jc3.y0 wi6 = ((com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.v) ((xj.j) i95.n0.c(xj.j.class))).wi("MagicFlutterWebDemo");
        wi6.f380545a = kz5.n0.t0(wi6.f380545a, kz5.c0.i(new rd3.k(), new rd3.j(), new vd3.f(), new vd3.d(), new ce3.a("")));
        this.f552950c = wi6;
    }

    @Override // zc3.c
    public void a() {
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        jc3.s0 s0Var = jc3.s0.f380517d;
        jc3.y0 y0Var = this.f552950c;
        ((nq0.p) tVar).Vi(new iq0.i("MagicFlutterWebDemo", s0Var, 0L, null, kz5.n0.S0(y0Var.f380545a), kz5.n0.Q0(y0Var.f380546b), 0.0d, null, null, 460, null));
    }

    @Override // zc3.c
    public void b(zq0.a container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        if (this.f552948a == null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
            iq0.c de6 = gq0.t.de(tVar, new zc3.f(this, container), null, 2, null);
            gq0.t.bh(tVar, de6, null, 2, null);
            this.f552948a = de6;
            this.f552949b = container;
        }
    }

    @Override // zc3.c
    /* renamed from: show */
    public void mo178669x35dafd() {
        zq0.a aVar;
        iq0.c cVar = this.f552948a;
        if (cVar == null || (aVar = this.f552949b) == null) {
            return;
        }
        ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1836x2efde3.ui.C16429xd6c03710(aVar.getWidth(), aVar.getHeight(), 0, 0, null, 28, null));
    }

    @Override // zc3.c
    /* renamed from: stop */
    public void mo178670x360802() {
        iq0.c cVar = this.f552948a;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            this.f552948a = null;
            this.f552949b = null;
        }
    }
}
