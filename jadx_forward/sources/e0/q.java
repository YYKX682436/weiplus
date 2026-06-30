package e0;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f327202a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f327203b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f327204c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f327205d;

    /* renamed from: e, reason: collision with root package name */
    public int f327206e;

    /* renamed from: f, reason: collision with root package name */
    public int f327207f;

    /* renamed from: g, reason: collision with root package name */
    public int f327208g;

    /* renamed from: h, reason: collision with root package name */
    public int f327209h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f327210i;

    public q(p3325xe03a0797.p3326xc267989b.y0 scope, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f327202a = scope;
        this.f327203b = z17;
        this.f327204c = new java.util.LinkedHashMap();
        this.f327205d = kz5.q0.f395534d;
        this.f327206e = -1;
        this.f327208g = -1;
        this.f327210i = new java.util.LinkedHashSet();
    }

    public final int a(int i17, int i18, int i19, long j17, boolean z17, int i27, int i28) {
        boolean z18 = false;
        int i29 = this.f327208g;
        boolean z19 = z17 ? i29 > i17 : i29 < i17;
        int i37 = this.f327206e;
        if (z17 ? i37 < i17 : i37 > i17) {
            z18 = true;
        }
        if (z19) {
            return i27 + this.f327209h + (i19 * (((i17 - this.f327208g) * (z17 ? -1 : 1)) - 1)) + b(j17);
        }
        if (z18) {
            return ((this.f327207f - i18) - (i19 * (((this.f327206e - i17) * (z17 ? -1 : 1)) - 1))) + b(j17);
        }
        return i28;
    }

    public final int b(long j17) {
        if (this.f327203b) {
            return p2.m.b(j17);
        }
        int i17 = p2.m.f432922c;
        return (int) (j17 >> 32);
    }

    public final void c(e0.q0 q0Var, e0.b bVar) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int i17;
        while (true) {
            int size = ((java.util.ArrayList) bVar.f327029b).size();
            int size2 = q0Var.f327219i.size();
            list = bVar.f327029b;
            if (size <= size2) {
                break;
            } else {
                kz5.h0.D(list);
            }
        }
        while (true) {
            arrayList = (java.util.ArrayList) list;
            if (arrayList.size() >= q0Var.f327219i.size()) {
                break;
            }
            int size3 = arrayList.size();
            long c17 = q0Var.c(size3);
            long j17 = bVar.f327028a;
            arrayList.add(new e0.u1(p2.n.a(((int) (c17 >> 32)) - ((int) (j17 >> 32)), p2.m.b(c17) - p2.m.b(j17)), q0Var.b(size3), null));
        }
        int size4 = arrayList.size();
        int i18 = 0;
        while (i18 < size4) {
            e0.u1 u1Var = (e0.u1) arrayList.get(i18);
            long j18 = u1Var.f327241c;
            long j19 = bVar.f327028a;
            long a17 = p2.n.a(((int) (j18 >> 32)) + ((int) (j19 >> 32)), p2.m.b(j18) + p2.m.b(j19));
            long c18 = q0Var.c(i18);
            u1Var.f327239a = q0Var.b(i18);
            z.k0 a18 = q0Var.a(i18);
            if (a17 == c18) {
                i17 = i18;
            } else {
                long j27 = bVar.f327028a;
                i17 = i18;
                u1Var.f327241c = p2.n.a(((int) (c18 >> 32)) - ((int) (j27 >> 32)), p2.m.b(c18) - p2.m.b(j27));
                if (a18 != null) {
                    ((n0.q4) u1Var.f327242d).mo148714x53d8522f(java.lang.Boolean.TRUE);
                    p3325xe03a0797.p3326xc267989b.l.d(this.f327202a, null, null, new e0.p(u1Var, a18, null), 3, null);
                }
            }
            i18 = i17 + 1;
        }
    }
}
