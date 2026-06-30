package d0;

/* loaded from: classes14.dex */
public final class x implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f306768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0.d f306769b;

    public x(boolean z17, z0.d dVar) {
        this.f306768a = z17;
        this.f306769b = dVar;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.d(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.a(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.c(this, uVar, list, i17);
    }

    @Override // s1.t0
    public final s1.u0 d(s1.x0 MeasurePolicy, java.util.List measurables, long j17) {
        int j18;
        s1.o1 m17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(MeasurePolicy, "$this$MeasurePolicy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(measurables, "measurables");
        if (measurables.isEmpty()) {
            return s1.v0.b(MeasurePolicy, p2.c.j(j17), p2.c.i(j17), null, d0.u.f306745d, 4, null);
        }
        long a17 = this.f306768a ? j17 : p2.c.a(j17, 0, 0, 0, 0, 10, null);
        if (measurables.size() == 1) {
            s1.r0 r0Var = (s1.r0) measurables.get(0);
            java.lang.Object g17 = r0Var.g();
            d0.q qVar = g17 instanceof d0.q ? (d0.q) g17 : null;
            if (qVar != null ? qVar.f306725e : false) {
                j18 = p2.c.j(j17);
                int i18 = p2.c.i(j17);
                p2.b bVar = p2.c.f432906b;
                int j19 = p2.c.j(j17);
                int i19 = p2.c.i(j17);
                if (!(j19 >= 0 && i19 >= 0)) {
                    throw new java.lang.IllegalArgumentException(("width(" + j19 + ") and height(" + i19 + ") must be >= 0").toString());
                }
                m17 = r0Var.m(bVar.b(j19, j19, i19, i19));
                i17 = i18;
            } else {
                s1.o1 m18 = r0Var.m(a17);
                int max = java.lang.Math.max(p2.c.j(j17), m18.f483583d);
                i17 = java.lang.Math.max(p2.c.i(j17), m18.f483584e);
                m17 = m18;
                j18 = max;
            }
            return s1.v0.b(MeasurePolicy, j18, i17, null, new d0.v(m17, r0Var, MeasurePolicy, j18, i17, this.f306769b), 4, null);
        }
        s1.o1[] o1VarArr = new s1.o1[measurables.size()];
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = p2.c.j(j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = p2.c.i(j17);
        int size = measurables.size();
        boolean z17 = false;
        for (int i27 = 0; i27 < size; i27++) {
            s1.r0 r0Var2 = (s1.r0) measurables.get(i27);
            java.lang.Object g18 = r0Var2.g();
            d0.q qVar2 = g18 instanceof d0.q ? (d0.q) g18 : null;
            if (qVar2 != null ? qVar2.f306725e : false) {
                z17 = true;
            } else {
                s1.o1 m19 = r0Var2.m(a17);
                o1VarArr[i27] = m19;
                f0Var.f391649d = java.lang.Math.max(f0Var.f391649d, m19.f483583d);
                f0Var2.f391649d = java.lang.Math.max(f0Var2.f391649d, m19.f483584e);
            }
        }
        if (z17) {
            int i28 = f0Var.f391649d;
            int i29 = i28 != Integer.MAX_VALUE ? i28 : 0;
            int i37 = f0Var2.f391649d;
            long a18 = p2.d.a(i29, i28, i37 != Integer.MAX_VALUE ? i37 : 0, i37);
            int size2 = measurables.size();
            for (int i38 = 0; i38 < size2; i38++) {
                s1.r0 r0Var3 = (s1.r0) measurables.get(i38);
                java.lang.Object g19 = r0Var3.g();
                d0.q qVar3 = g19 instanceof d0.q ? (d0.q) g19 : null;
                if (qVar3 != null ? qVar3.f306725e : false) {
                    o1VarArr[i38] = r0Var3.m(a18);
                }
            }
        }
        return s1.v0.b(MeasurePolicy, f0Var.f391649d, f0Var2.f391649d, null, new d0.w(o1VarArr, measurables, MeasurePolicy, f0Var, f0Var2, this.f306769b), 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.b(this, uVar, list, i17);
    }
}
