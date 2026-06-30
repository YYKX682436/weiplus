package th5;

/* loaded from: classes12.dex */
public final class l0 extends pf3.g implements uf3.a {
    public long A;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 f500934v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f500935w;

    /* renamed from: x, reason: collision with root package name */
    public lg3.a f500936x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f500937y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f500938z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.BizPhotoLiveBottomBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
    }

    @Override // rf3.h
    public void D() {
        h0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        h0();
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar != null) {
            android.view.View view = this.f500935w;
            boolean z17 = false;
            if (view != null && view.getVisibility() == 0) {
                z17 = true;
            }
            th5.v0 v0Var = th5.v0.f501003a;
            if (z17) {
                v0Var.a(qVar.f500877c, qVar.f500875a, qVar.f500876b, th5.a.f500866e, th5.e.f500899e);
            }
            v0Var.a(qVar.f500877c, qVar.f500875a, qVar.f500876b, th5.a.f500867f, th5.e.f500899e);
        }
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzt, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        android.view.View view = this.f500935w;
        if (view == null) {
            return;
        }
        Y(this, new th5.j0(view));
        b0();
    }

    public final boolean g0(th5.q qVar) {
        if (!qVar.h()) {
            return true;
        }
        if (!(qVar.f500985j.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(qVar.f500985j)) {
            if (!(qVar.f500987l.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(qVar.f500987l)) {
                return true;
            }
        }
        return false;
    }

    @Override // rf3.h
    public void h() {
        h0();
    }

    public final void h0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c16492xe3ef89b2;
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        android.view.View view = this.f500935w;
        if (view == null || (c16492xe3ef89b2 = this.f500934v) == null) {
            return;
        }
        Y(this, new th5.k0(c16492xe3ef89b2, qVar, this, view));
        a0();
    }

    public final void i0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        vf3.e eVar;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null || !((eVar = X6.f517922a) == vf3.e.f517911e || eVar == vf3.e.f517914h || eVar == vf3.e.f517917n)) {
            this.f500937y = true;
            return;
        }
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).X();
        }
    }

    public final void j0() {
        mf3.k kVar;
        mf3.s sVar = this.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || kVar.mo147256x74bf41ce() != mf3.w.f407661d) {
            return;
        }
        kVar.f(mf3.w.f407662e);
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).V();
        }
    }

    @Override // uf3.a
    public void m(vf3.e state, vf3.f extraInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar == null) {
            return;
        }
        if (state == vf3.e.f517919p || state == vf3.e.f517918o) {
            c0();
            return;
        }
        boolean z17 = false;
        if (state == vf3.e.f517914h) {
            if (this.f500937y) {
                i0();
                this.f500937y = false;
            }
            if (this.f500938z) {
                j0();
                this.f500938z = false;
            }
        }
        lg3.a aVar = this.f500936x;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).h(qVar, extraInfo);
        }
        int ordinal = state.ordinal();
        if (ordinal == 1) {
            h0();
        } else if (ordinal == 4) {
            if (qVar.f500983h == mf3.w.f407662e && g0(qVar)) {
                z17 = true;
            }
            if (!z17) {
                h0();
            }
        }
        mf3.w wVar = qVar.f500983h;
        mf3.w wVar2 = mf3.w.f407662e;
        if (wVar == wVar2 && state == vf3.e.f517913g) {
            a0();
        }
        if (qVar.f500983h == wVar2 && state == vf3.e.f517916m) {
            h0();
        }
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        h0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        lg3.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f500938z = false;
        this.f500937y = false;
        mf3.k kVar = bindContext.f407650a;
        th5.q qVar = kVar instanceof th5.q ? (th5.q) kVar : null;
        if (qVar == null) {
            return;
        }
        if (qVar.h() && !g0(qVar)) {
            vf3.a aVar2 = (vf3.a) H(vf3.a.class);
            vf3.f X6 = aVar2 != null ? ((vf3.i) aVar2).X6(qVar) : null;
            if (qVar.f500983h == mf3.w.f407662e && X6 != null) {
                vf3.e eVar = X6.f517922a;
                vf3.e eVar2 = vf3.e.f517913g;
                if (eVar == eVar2) {
                    lg3.a aVar3 = this.f500936x;
                    if (aVar3 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar3).h(qVar, new vf3.f(eVar2, null, 0, X6.f517925d, 6, null));
                    }
                }
            }
            lg3.a aVar4 = this.f500936x;
            if (aVar4 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar4).h(qVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
            }
            long j17 = qVar.f500876b;
            if (j17 > 0 && (aVar = this.f500936x) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
            }
        }
        h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        this.f500934v = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2) M().findViewById(com.p314xaae8f345.mm.R.id.smh);
        android.view.View findViewById = M().findViewById(com.p314xaae8f345.mm.R.id.smo);
        this.f500935w = findViewById;
        this.f500936x = findViewById instanceof lg3.a ? (lg3.a) findViewById : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c16492xe3ef89b2 = this.f500934v;
        if (c16492xe3ef89b2 != null) {
            pf3.d.W(this, c16492xe3ef89b2, null, 1, null);
            T(c16492xe3ef89b2, new pf3.j(0, 24, 0, 24), new th5.h0(this));
        }
        android.view.View view = this.f500935w;
        if (view != null) {
            pf3.d.W(this, view, null, 1, null);
            pf3.d.U(this, view, null, new th5.i0(this), 1, null);
        }
    }

    @Override // uf3.a
    public void v(vf3.b bVar) {
        lg3.a aVar = this.f500936x;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).g(bVar);
        }
    }
}
