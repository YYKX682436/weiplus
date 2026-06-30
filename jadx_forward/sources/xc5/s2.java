package xc5;

/* loaded from: classes12.dex */
public final class s2 extends pf3.g implements fg3.a {

    /* renamed from: v, reason: collision with root package name */
    public em.i2 f535097v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f535098w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f535099x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f535100y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f535101z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.MsgHistoryGalleryVideoBottomBarLayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        this.f535101z = jz5.h.b(xc5.n2.f535075d);
    }

    public static final void g0(xc5.s2 s2Var, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = s2Var.f407643m;
        if (sVar == null || (kVar = sVar.f407650a) == null || (mVar = (dg3.m) s2Var.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, s2Var.f435359s, qVar);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        if (this.f535099x) {
            b0();
            return;
        }
        super.F();
        i0();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekw, (android.view.ViewGroup) null);
        this.f535097v = new em.i2(inflate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // fg3.a
    public void b() {
        this.f535099x = true;
        Y(this, xc5.m2.f535068d);
        b0();
    }

    @Override // pf3.g, pf3.h
    public void c() {
        if (this.f535099x) {
            return;
        }
        super.c();
    }

    @Override // pf3.g
    public void f0() {
        if (this.f535099x) {
            return;
        }
        super.f0();
    }

    public final boolean h0() {
        return ((java.lang.Boolean) ((jz5.n) this.f535101z).mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:34|35|(11:39|40|41|42|43|44|(1:59)(1:50)|51|(1:53)|54|(2:56|57)(1:58))|63|41|42|43|44|(1:46)|59|51|(0)|54|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.s2.i0():void");
    }

    @Override // mf3.l
    /* renamed from: onResume */
    public void mo124474x57429eec() {
        if (this.f535099x) {
            b0();
        } else {
            mo129544x6761d4f();
            a0();
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    /* renamed from: recycle */
    public void mo129548x408b7293() {
        mf3.s sVar;
        mf3.k kVar;
        gg3.b bVar;
        super.mo129548x408b7293();
        if (this.f535100y && (sVar = this.f407643m) != null && (kVar = sVar.f407650a) != null && (bVar = (gg3.b) H(gg3.b.class)) != null) {
            bVar.H5(kVar);
        }
        this.f535100y = false;
    }

    @Override // pf3.g, pf3.h
    /* renamed from: reset */
    public void mo129544x6761d4f() {
        if (this.f535099x) {
            b0();
        } else {
            e0();
            i0();
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        gg3.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f535099x = false;
        boolean z17 = this.f535100y;
        mf3.k kVar = bindContext.f407650a;
        if (z17 && kVar != null && (bVar = (gg3.b) H(gg3.b.class)) != null) {
            bVar.H5(kVar);
        }
        this.f535100y = false;
        if (kVar != null) {
            kVar.f(mf3.w.f407661d);
        }
        i0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentView, "parentView");
        super.u(parentView);
        em.i2 i2Var = this.f535097v;
        if (i2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (i2Var.f335965g == null) {
            i2Var.f335965g = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) i2Var.f335959a.findViewById(com.p314xaae8f345.mm.R.id.u9w);
        }
        i2Var.f335965g.m66609x311b1826(0);
        em.i2 i2Var2 = this.f535097v;
        if (i2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        if (i2Var2.f335963e == null) {
            i2Var2.f335963e = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) i2Var2.f335959a.findViewById(com.p314xaae8f345.mm.R.id.uzd);
        }
        i2Var2.f335963e.m66609x311b1826(1);
        em.i2 i2Var3 = this.f535097v;
        if (i2Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        i2Var3.b().m66605x311b1826(0);
        em.i2 i2Var4 = this.f535097v;
        if (i2Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9 b17 = i2Var4.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new xc5.g2(this), 1, null);
        em.i2 i2Var5 = this.f535097v;
        if (i2Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        this.f535098w = i2Var5.b();
        em.i2 i2Var6 = this.f535097v;
        if (i2Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 f17 = i2Var6.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getBtnShare(...)");
        pf3.d.W(this, f17, null, 1, null);
        pf3.d.U(this, f17, null, new xc5.h2(this), 1, null);
        em.i2 i2Var7 = this.f535097v;
        if (i2Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 e17 = i2Var7.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getBtnSave(...)");
        pf3.d.W(this, e17, null, 1, null);
        pf3.d.U(this, e17, null, new xc5.i2(this), 1, null);
        em.i2 i2Var8 = this.f535097v;
        if (i2Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 c17 = i2Var8.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnLocate(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new xc5.j2(this), 1, null);
        em.i2 i2Var9 = this.f535097v;
        if (i2Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 a17 = i2Var9.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnGrid(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new xc5.k2(this), 1, null);
        if (h0()) {
            em.i2 i2Var10 = this.f535097v;
            if (i2Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            i2Var10.a().setVisibility(8);
        } else {
            em.i2 i2Var11 = this.f535097v;
            if (i2Var11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            i2Var11.c().setVisibility(8);
        }
        em.i2 i2Var12 = this.f535097v;
        if (i2Var12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 d17 = i2Var12.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getBtnMore(...)");
        pf3.d.W(this, d17, null, 1, null);
        pf3.d.U(this, d17, null, new xc5.l2(this), 1, null);
    }
}
