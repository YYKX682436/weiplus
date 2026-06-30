package fg3;

/* loaded from: classes12.dex */
public final class g extends pf3.g implements fg3.a {

    /* renamed from: v, reason: collision with root package name */
    public em.m1 f343966v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.VideoBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f343966v = new em.m1(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eji, (android.view.ViewGroup) null));
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2549xbc1609e9.C20473x21afd34e()) == 1) {
            em.m1 m1Var = this.f343966v;
            if (m1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            if (m1Var.f336130e == null) {
                m1Var.f336130e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m1Var.f336126a.findViewById(com.p314xaae8f345.mm.R.id.bhi);
            }
            m1Var.f336130e.setImageResource(com.p314xaae8f345.mm.R.raw.f79963x411ef6b4);
        }
        em.m1 m1Var2 = this.f343966v;
        if (m1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.view.View view = m1Var2.f336126a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // fg3.a
    public void b() {
        Y(this, fg3.e.f343964d);
        b0();
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        mo129544x6761d4f();
    }

    @Override // pf3.g, pf3.h
    /* renamed from: reset */
    public void mo129544x6761d4f() {
        e0();
        Y(this, new fg3.f(this));
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        em.m1 m1Var = this.f343966v;
        if (m1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnMore(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new fg3.b(this), 1, null);
        em.m1 m1Var2 = this.f343966v;
        if (m1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var2.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnSave(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new fg3.c(this), 1, null);
        em.m1 m1Var3 = this.f343966v;
        if (m1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = m1Var3.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnShare(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new fg3.d(this), 1, null);
    }
}
