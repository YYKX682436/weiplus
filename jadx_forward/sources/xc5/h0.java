package xc5;

/* loaded from: classes12.dex */
public final class h0 extends pf3.g implements rf3.h {
    public final jz5.g A;

    /* renamed from: v, reason: collision with root package name */
    public em.z1 f534997v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f534998w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f534999x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f535000y;

    /* renamed from: z, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f535001z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.MsgHistoryGalleryImageBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f535001z = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.A = jz5.h.b(xc5.y.f535125d);
    }

    public static final void g0(xc5.h0 h0Var, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = h0Var.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (mVar = (dg3.m) h0Var.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, h0Var.f435359s, qVar);
    }

    @Override // rf3.h
    public void D() {
        if (this.f534999x) {
            b0();
            return;
        }
        e0();
        j0();
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        if (this.f534999x) {
            b0();
            return;
        }
        super.F();
        j0();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekj, (android.view.ViewGroup) null);
        this.f534997v = new em.z1(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        this.f534999x = true;
        Y(this, xc5.w.f535112d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new xc5.x(this));
        a0();
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 h0() {
        mf3.s sVar = this.f407643m;
        mf3.k kVar = sVar != null ? sVar.f407650a : null;
        uh5.i iVar = kVar instanceof uh5.i ? (uh5.i) kVar : null;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public final boolean i0() {
        return ((java.lang.Boolean) this.A.mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.h0.j0():void");
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        if (this.f534999x) {
            b0();
        } else {
            e0();
            a0();
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f534999x = false;
        this.f535000y = false;
        mf3.k kVar = bindContext.f407650a;
        if (kVar != null) {
            kVar.f(mf3.w.f407661d);
        }
        j0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        em.z1 z1Var = this.f534997v;
        if (z1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (z1Var.f336514g == null) {
            z1Var.f336514g = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) z1Var.f336508a.findViewById(com.p314xaae8f345.mm.R.id.u9w);
        }
        z1Var.f336514g.m66609x311b1826(0);
        em.z1 z1Var2 = this.f534997v;
        if (z1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (z1Var2.f336512e == null) {
            z1Var2.f336512e = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) z1Var2.f336508a.findViewById(com.p314xaae8f345.mm.R.id.uzd);
        }
        z1Var2.f336512e.m66609x311b1826(1);
        em.z1 z1Var3 = this.f534997v;
        if (z1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        z1Var3.b().m66605x311b1826(0);
        em.z1 z1Var4 = this.f534997v;
        if (z1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9 b17 = z1Var4.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new xc5.q(this), 1, null);
        em.z1 z1Var5 = this.f534997v;
        if (z1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        this.f534998w = z1Var5.b();
        em.z1 z1Var6 = this.f534997v;
        if (z1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 f17 = z1Var6.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getBtnShare(...)");
        pf3.d.W(this, f17, null, 1, null);
        pf3.d.U(this, f17, null, new xc5.r(this), 1, null);
        em.z1 z1Var7 = this.f534997v;
        if (z1Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 e17 = z1Var7.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getBtnSave(...)");
        pf3.d.W(this, e17, null, 1, null);
        pf3.d.U(this, e17, null, new xc5.s(this), 1, null);
        em.z1 z1Var8 = this.f534997v;
        if (z1Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 c17 = z1Var8.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnLocate(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new xc5.t(this), 1, null);
        em.z1 z1Var9 = this.f534997v;
        if (z1Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 a17 = z1Var9.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnGrid(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new xc5.u(this), 1, null);
        if (i0()) {
            em.z1 z1Var10 = this.f534997v;
            if (z1Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            z1Var10.a().setVisibility(8);
        } else {
            em.z1 z1Var11 = this.f534997v;
            if (z1Var11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            z1Var11.c().setVisibility(8);
        }
        em.z1 z1Var12 = this.f534997v;
        if (z1Var12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 d17 = z1Var12.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getBtnMore(...)");
        pf3.d.W(this, d17, null, 1, null);
        pf3.d.U(this, d17, null, new xc5.v(this), 1, null);
    }
}
