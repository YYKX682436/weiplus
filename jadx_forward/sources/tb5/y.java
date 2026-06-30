package tb5;

@yn.c(m177365x976763e5 = tb5.m0.class)
/* loaded from: classes12.dex */
public final class y extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements tb5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f498637e;

    /* renamed from: f, reason: collision with root package name */
    public final tb5.v f498638f = new tb5.v();

    /* renamed from: g, reason: collision with root package name */
    public final tb5.w f498639g = new tb5.w(this);

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (this.f498637e) {
            android.view.ViewGroup view = this.f280113d.p().f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            tb5.w listener = this.f498639g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            if (ih.d.c() && (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4)) {
                java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.mca);
                if ((tag instanceof tb5.l0 ? (tb5.l0) tag : null) == null) {
                    tb5.l0 l0Var = new tb5.l0("chatting", null, listener, 2, null);
                    ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).i(l0Var);
                    view.setTag(com.p314xaae8f345.mm.R.id.mca, l0Var);
                }
            }
            tb5.v vVar = this.f498638f;
            vVar.getClass();
            vVar.f498623g.f498574d = java.lang.System.currentTimeMillis() - vVar.f498620d;
            vVar.f498618b.f();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        m0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (this.f498637e) {
            tb5.v vVar = this.f498638f;
            vVar.getClass();
            vVar.f498624h.f498574d = java.lang.System.currentTimeMillis() - vVar.f498621e;
            vVar.f498619c.f();
            m0();
            this.f280113d.q().mo50297x7c4d7ca2(new tb5.x(this, this.f280113d.x()), 50L);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8.f283466w = null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        if (this.f498637e) {
            tb5.v vVar = this.f498638f;
            vVar.getClass();
            vVar.f498621e = java.lang.System.currentTimeMillis();
            tb5.j0 j0Var = vVar.f498619c;
            j0Var.getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(j0Var);
            wu5.c cVar = vVar.f498622f;
            if (cVar != null) {
                cVar.cancel(false);
            }
            vVar.f498622f = null;
            vVar.f498617a = false;
        }
    }

    public final void m0() {
        android.view.ViewGroup view = this.f280113d.p().f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (ih.d.c() && (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4)) {
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.mca);
            tb5.l0 l0Var = tag instanceof tb5.l0 ? (tb5.l0) tag : null;
            if (l0Var != null) {
                l0Var.f498601e.f();
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).V0(l0Var);
                view.setTag(com.p314xaae8f345.mm.R.id.mca, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20042x89b04126()) == 1;
        this.f498637e = z17;
        if (z17) {
            tb5.v vVar = this.f498638f;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8.f283466w = vVar;
            vVar.getClass();
            vVar.f498620d = java.lang.System.currentTimeMillis();
            tb5.j0 j0Var = vVar.f498618b;
            j0Var.getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q1) ((ob0.x2) i95.n0.c(ob0.x2.class))).wi(j0Var);
        }
    }
}
