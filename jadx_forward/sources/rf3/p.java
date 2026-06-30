package rf3;

/* loaded from: classes12.dex */
public final class p extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public em.m1 f476531v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.ImageBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
    }

    public static final void g0(rf3.p pVar, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = pVar.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (mVar = (dg3.m) pVar.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, pVar.f435359s, qVar);
    }

    @Override // rf3.h
    public void D() {
        e0();
        Y(this, new rf3.o(this));
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eji, (android.view.ViewGroup) null);
        this.f476531v = new em.m1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        Y(this, rf3.m.f476528d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new rf3.n(this));
        a0();
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        e0();
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20473x21afd34e()) == 1) {
            em.m1 m1Var = this.f476531v;
            if (m1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            if (m1Var.f336130e == null) {
                m1Var.f336130e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m1Var.f336126a.findViewById(com.p314xaae8f345.mm.R.id.bhi);
            }
            m1Var.f336130e.setImageResource(com.p314xaae8f345.mm.R.raw.f79963x411ef6b4);
        }
        em.m1 m1Var2 = this.f476531v;
        if (m1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnMore(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new rf3.i(this), 1, null);
        em.m1 m1Var3 = this.f476531v;
        if (m1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (m1Var3.f336128c == null) {
            m1Var3.f336128c = (android.widget.FrameLayout) m1Var3.f336126a.findViewById(com.p314xaae8f345.mm.R.id.smc);
        }
        android.widget.FrameLayout frameLayout = m1Var3.f336128c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getBtnGrid(...)");
        pf3.d.W(this, frameLayout, null, 1, null);
        pf3.d.U(this, frameLayout, null, new rf3.j(this), 1, null);
        em.m1 m1Var4 = this.f476531v;
        if (m1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var4.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnSave(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new rf3.k(this), 1, null);
        em.m1 m1Var5 = this.f476531v;
        if (m1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = m1Var5.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnShare(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new rf3.l(this), 1, null);
    }
}
