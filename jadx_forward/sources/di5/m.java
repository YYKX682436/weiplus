package di5;

/* loaded from: classes12.dex */
public final class m extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public em.j1 f314338v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.FinderPostImageBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
    }

    public static final void g0(di5.m mVar, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar2;
        mf3.s sVar = mVar.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (mVar2 = (dg3.m) mVar.H(dg3.m.class)) == null) {
            return;
        }
        mVar2.Z0(kVar, mVar.f435359s, qVar);
    }

    @Override // rf3.h
    public void D() {
        e0();
        Y(this, new di5.l(this));
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
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ejf, (android.view.ViewGroup) null);
        this.f314338v = new em.j1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        Y(this, di5.j.f314335d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new di5.k(this));
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
            em.j1 j1Var = this.f314338v;
            if (j1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            if (j1Var.f335995f == null) {
                j1Var.f335995f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) j1Var.f335990a.findViewById(com.p314xaae8f345.mm.R.id.bhi);
            }
            j1Var.f335995f.setImageResource(com.p314xaae8f345.mm.R.raw.f79963x411ef6b4);
        }
        em.j1 j1Var2 = this.f314338v;
        if (j1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = j1Var2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnMore(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new di5.e(this), 1, null);
        em.j1 j1Var3 = this.f314338v;
        if (j1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (j1Var3.f335992c == null) {
            j1Var3.f335992c = (android.widget.FrameLayout) j1Var3.f335990a.findViewById(com.p314xaae8f345.mm.R.id.smc);
        }
        android.widget.FrameLayout frameLayout = j1Var3.f335992c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(frameLayout, "getBtnGrid(...)");
        pf3.d.W(this, frameLayout, null, 1, null);
        pf3.d.U(this, frameLayout, null, new di5.f(this), 1, null);
        em.j1 j1Var4 = this.f314338v;
        if (j1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = j1Var4.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnSave(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new di5.g(this), 1, null);
        em.j1 j1Var5 = this.f314338v;
        if (j1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = j1Var5.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnShare(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new di5.h(this), 1, null);
        em.j1 j1Var6 = this.f314338v;
        if (j1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.LinearLayout d17 = j1Var6.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getGalleryFinderPostBtn(...)");
        pf3.d.U(this, d17, null, new di5.i(this), 1, null);
    }
}
