package cy5;

/* loaded from: classes13.dex */
public class j implements com.p314xaae8f345.p3210x3857dc.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final cy5.t f306414a;

    /* renamed from: b, reason: collision with root package name */
    public final cy5.h f306415b;

    /* renamed from: c, reason: collision with root package name */
    public final by5.n0 f306416c;

    /* renamed from: d, reason: collision with root package name */
    public final xx5.n f306417d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306418e;

    public j(cy5.t tVar, cy5.h hVar, by5.n0 n0Var, xx5.m mVar) {
        xx5.n nVar = new xx5.n();
        this.f306417d = nVar;
        this.f306414a = tVar;
        this.f306415b = hVar;
        this.f306416c = n0Var;
        nVar.f539598g = mVar;
        if (hVar != null) {
            nVar.f539593b = hVar.m();
            nVar.f539594c = hVar.f306412a;
        }
        if (n0Var == null) {
            this.f306418e = false;
            return;
        }
        nVar.f539595d = n0Var.f118107m.f118070e;
        boolean z17 = n0Var.f118104j;
        nVar.f539596e = z17 ? 2 : 1;
        nVar.f539597f = n0Var.f118101g;
        this.f306418e = z17;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b2
    public void a(int i17) {
        java.lang.String m17 = this.f306415b.m();
        if (by5.s0.f118128c == null) {
            return;
        }
        int i18 = this.f306418e ? 51 : 60;
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450.equals(m17)) {
            by5.s0.f118128c.b(577L, 185L, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c.equals(m17)) {
            by5.s0.f118128c.b(1068L, i18, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa.equals(m17)) {
            by5.s0.f118128c.b(1071L, i18, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32.equals(m17)) {
            by5.s0.f118128c.b(1069L, i18, 1L);
            return;
        }
        if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f.equals(m17)) {
            by5.s0.f118128c.b(1070L, i18, 1L);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4.equals(m17)) {
            by5.s0.f118128c.b(1544L, i18, 1L);
        } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228.equals(m17)) {
            by5.s0.f118128c.b(1889L, i18, 1L);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b2
    public void b(int i17) {
        java.lang.String m17 = this.f306415b.m();
        cy5.t tVar = this.f306414a;
        if (tVar.f306436g.f306430a == 3 && tVar.k() && tVar.f306444o.equals(m17)) {
            tVar.f306445p.b(i17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b2
    public void c(com.p314xaae8f345.p3210x3857dc.c2 c2Var) {
        cy5.h hVar = this.f306415b;
        this.f306414a.l(hVar.m(), -1);
        xx5.n nVar = this.f306417d;
        nVar.f539599h = c2Var;
        if (c2Var != null && c2Var.f301761f > 0) {
            nVar.f539600i = java.lang.System.currentTimeMillis() - c2Var.f301761f;
        }
        nVar.f539592a = -2;
        xx5.o.b(nVar);
        by5.s0.h(hVar.m(), this.f306418e);
        cy5.b.a(hVar.m()).V(null);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b2
    public void d(com.p314xaae8f345.p3210x3857dc.c2 c2Var) {
        xx5.n nVar = this.f306417d;
        nVar.f539599h = c2Var;
        if (c2Var != null && c2Var.f301761f > 0) {
            nVar.f539600i = java.lang.System.currentTimeMillis() - c2Var.f301761f;
        }
        cy5.h hVar = this.f306415b;
        java.lang.String m17 = hVar.m();
        if (by5.s0.f118128c != null) {
            int i17 = this.f306418e ? 52 : 61;
            if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61206xd3e8e450.equals(m17)) {
                by5.s0.f118128c.b(577L, 186L, 1L);
            } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61209xfb9a522c.equals(m17)) {
                by5.s0.f118128c.b(1068L, i17, 1L);
            } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61208xfb9a50aa.equals(m17)) {
                by5.s0.f118128c.b(1071L, i17, 1L);
            } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61211x77b31e32.equals(m17)) {
                by5.s0.f118128c.b(1069L, i17, 1L);
            } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61205x7db6e06f.equals(m17)) {
                by5.s0.f118128c.b(1070L, i17, 1L);
            } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4.equals(m17)) {
                by5.s0.f118128c.b(1544L, i17, 1L);
            } else if (com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61210xfb9a6228.equals(m17)) {
                by5.s0.f118128c.b(1889L, i17, 1L);
            }
        }
        cy5.b.a(hVar.m()).V(null);
        new cy5.i(this).e(new java.lang.Void[0]);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b2
    public void e() {
        cy5.h hVar = this.f306415b;
        this.f306414a.l(hVar.m(), -3);
        by5.s0.h(hVar.m(), this.f306418e);
        cy5.b.a(hVar.m()).V(null);
    }
}
