package n0;

/* loaded from: classes14.dex */
public final class x1 implements x0.z0, n0.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f415278d;

    /* renamed from: e, reason: collision with root package name */
    public n0.v1 f415279e;

    public x1(yz5.a calculation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calculation, "calculation");
        this.f415278d = calculation;
        this.f415279e = new n0.v1();
    }

    public final n0.v1 b(n0.v1 v1Var, x0.m snapshot, yz5.a aVar) {
        n0.v1 v1Var2;
        v1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        int i17 = 0;
        if (v1Var.f415260d != n0.v1.f415258f && v1Var.f415261e == v1Var.c(this, snapshot)) {
            return v1Var;
        }
        java.lang.Boolean bool = (java.lang.Boolean) n0.t4.f415241b.a();
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List list = (p0.e) n0.t4.f415240a.a();
        if (list == null) {
            list = q0.l.f440774f;
        }
        int d17 = ((kz5.b) list).d();
        for (int i18 = 0; i18 < d17; i18++) {
            ((yz5.l) ((jz5.l) list.get(i18)).f384366d).mo146xb9724478(this);
        }
        if (!booleanValue) {
            try {
                n0.t4.f415241b.b(java.lang.Boolean.TRUE);
            } finally {
                int d18 = ((kz5.b) list).d();
                while (i17 < d18) {
                    ((yz5.l) ((jz5.l) list.get(i17)).f384367e).mo146xb9724478(this);
                    i17++;
                }
            }
        }
        java.lang.Object a17 = x0.m.f532440e.a(new n0.w1(this, hashSet), null, aVar);
        if (!booleanValue) {
            n0.t4.f415241b.b(java.lang.Boolean.FALSE);
        }
        synchronized (x0.z.f532496b) {
            x0.m i19 = x0.z.i();
            v1Var2 = (n0.v1) x0.z.l(this.f415279e, this, i19);
            v1Var2.f415259c = hashSet;
            v1Var2.f415261e = v1Var2.c(this, i19);
            v1Var2.f415260d = a17;
        }
        if (!booleanValue) {
            x0.z.i().l();
        }
        return v1Var2;
    }

    @Override // x0.z0
    public x0.a1 d(x0.a1 a1Var, x0.a1 a1Var2, x0.a1 a1Var3) {
        x0.y0.a(this, a1Var, a1Var2, a1Var3);
        return null;
    }

    @Override // x0.z0
    public void e(x0.a1 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f415279e = (n0.v1) value;
    }

    @Override // x0.z0
    public x0.a1 g() {
        return this.f415279e;
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        yz5.l f17 = x0.z.i().f();
        if (f17 != null) {
            f17.mo146xb9724478(this);
        }
        return b((n0.v1) x0.z.h(this.f415279e, x0.z.i()), x0.z.i(), this.f415278d).f415260d;
    }

    /* renamed from: toString */
    public java.lang.String m148755x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DerivedState(value=");
        n0.v1 v1Var = (n0.v1) x0.z.h(this.f415279e, x0.z.i());
        sb6.append(v1Var.f415260d != n0.v1.f415258f && v1Var.f415261e == v1Var.c(this, x0.z.i()) ? java.lang.String.valueOf(v1Var.f415260d) : "<Not calculated>");
        sb6.append(")@");
        sb6.append(hashCode());
        return sb6.toString();
    }
}
