package mu3;

/* loaded from: classes10.dex */
public class b extends ms0.e {

    /* renamed from: t, reason: collision with root package name */
    public os0.a f412929t;

    /* renamed from: u, reason: collision with root package name */
    public os0.a f412930u;

    /* renamed from: v, reason: collision with root package name */
    public p05.l4 f412931v;

    /* renamed from: w, reason: collision with root package name */
    public is0.c f412932w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab f412933x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.p f412934y;

    public b(int i17) {
        super(1, i17);
        this.f412933x = new com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab();
    }

    @Override // ms0.c
    public os0.a f() {
        os0.c cVar = new os0.c(this.f412478a, this.f412479b, this.f412480c, this.f412481d, 2, this.f412483f);
        this.f412929t = cVar;
        cVar.f429539o = true;
        os0.a aVar = this.f412930u;
        if (aVar != null) {
            aVar.n();
        }
        int i17 = this.f412480c;
        int i18 = this.f412481d;
        this.f412930u = new os0.e(i17, i18, i17, i18, this.f412482e, 1);
        p05.l4 l4Var = this.f412931v;
        if (l4Var != null) {
            l4Var.o();
        }
        p05.l4 l4Var2 = new p05.l4(0, false, false, false, false, false, rh0.z.f477149m, null, false, 447, null);
        this.f412931v = l4Var2;
        l4Var2.F(this.f412933x);
        p05.l4 l4Var3 = this.f412931v;
        if (l4Var3 != null) {
            l4Var3.g(null, 0.0f);
        }
        p05.l4 l4Var4 = this.f412931v;
        if (l4Var4 != null) {
            l4Var4.H(false);
        }
        p05.l4 l4Var5 = this.f412931v;
        if (l4Var5 != null) {
            l4Var5.J(this.f412480c, this.f412481d);
        }
        is0.c cVar2 = this.f412932w;
        if (cVar2 != null) {
            cVar2.close();
        }
        this.f412932w = is0.b.b(true, 16L);
        return cVar;
    }

    @Override // ms0.c
    public is0.c g() {
        return this.f412932w;
    }

    @Override // ms0.c
    public int h() {
        os0.a aVar = this.f412930u;
        if (aVar != null) {
            return aVar.f429549y;
        }
        return 0;
    }

    @Override // ms0.c
    public int i() {
        os0.a aVar = this.f412930u;
        if (aVar != null) {
            return aVar.f429548x;
        }
        return 0;
    }

    @Override // ms0.c
    public void n(boolean z17) {
        super.n(z17);
        os0.a aVar = this.f412930u;
        if (aVar != null) {
            aVar.n();
        }
        this.f412930u = null;
        p05.l4 l4Var = this.f412931v;
        if (l4Var != null) {
            l4Var.o();
        }
        this.f412931v = null;
        is0.c cVar = this.f412932w;
        if (cVar != null) {
            cVar.close();
        }
        this.f412932w = null;
    }

    @Override // ms0.c
    public void p() {
        is0.c cVar;
        super.p();
        os0.a aVar = this.f412929t;
        if (aVar == null || (cVar = aVar.f429533i) == null) {
            return;
        }
        p05.l4 l4Var = this.f412931v;
        if (l4Var != null) {
            p05.z3 z3Var = p05.l4.R;
            rh0.d0.b(l4Var, cVar.f375928e, false, 0, false, 8, null);
        }
        is0.c cVar2 = this.f412932w;
        if (cVar2 != null) {
            is0.c.b(cVar2, this.f412480c, this.f412481d, 0, null, 0, 0, 60, null);
        }
        is0.c cVar3 = this.f412932w;
        if (cVar3 != null) {
            p05.l4 l4Var2 = this.f412931v;
            java.lang.Integer valueOf = l4Var2 != null ? java.lang.Integer.valueOf(p05.l4.y(l4Var2, cVar, cVar3, 0L, 0, false, false, 60, null)) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                cVar = cVar3;
            }
        }
        os0.a aVar2 = this.f412930u;
        if (aVar2 != null) {
            ((os0.e) aVar2).H = cVar.f375928e;
        }
        if (aVar2 != null) {
            aVar2.o();
        }
    }

    @Override // ms0.c
    public void q(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        os0.a aVar = this.f412930u;
        if (aVar == null) {
            return;
        }
        aVar.f429542r = listener;
    }

    @Override // ms0.c
    public void s() {
        os0.a aVar = this.f412930u;
        if (aVar != null) {
            aVar.f429546v = true;
        }
    }

    @Override // ms0.c
    public void t(int i17, int i18) {
        super.t(i17, i18);
        os0.a aVar = this.f412930u;
        if (aVar != null) {
            aVar.w(this.f412480c, this.f412481d);
        }
        os0.a aVar2 = this.f412930u;
        if (aVar2 != null) {
            aVar2.u(this.f412480c, this.f412481d);
        }
        p05.l4 l4Var = this.f412931v;
        if (l4Var != null) {
            l4Var.J(this.f412480c, this.f412481d);
        }
        yz5.p pVar = this.f412934y;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
