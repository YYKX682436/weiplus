package c16;

/* loaded from: classes16.dex */
public final class i extends f26.q2 {

    /* renamed from: d, reason: collision with root package name */
    public static final c16.a f37965d;

    /* renamed from: e, reason: collision with root package name */
    public static final c16.a f37966e;

    /* renamed from: b, reason: collision with root package name */
    public final c16.g f37967b;

    /* renamed from: c, reason: collision with root package name */
    public final f26.k2 f37968c;

    static {
        f26.x2 x2Var = f26.x2.f259236e;
        f37965d = c16.b.a(x2Var, false, true, null, 5, null).b(c16.c.f37952f);
        f37966e = c16.b.a(x2Var, false, true, null, 5, null).b(c16.c.f37951e);
    }

    public i(f26.k2 k2Var, int i17, kotlin.jvm.internal.i iVar) {
        k2Var = (i17 & 1) != 0 ? null : k2Var;
        c16.g gVar = new c16.g();
        this.f37967b = gVar;
        this.f37968c = k2Var == null ? new f26.k2(gVar, null, 2, null) : k2Var;
    }

    @Override // f26.q2
    public f26.l2 d(f26.o0 key) {
        kotlin.jvm.internal.o.g(key, "key");
        return new f26.n2(h(key, new c16.a(f26.x2.f259236e, null, false, false, null, null, 62, null)));
    }

    public final jz5.l g(f26.z0 z0Var, o06.g gVar, c16.a aVar) {
        if (z0Var.w0().getParameters().isEmpty()) {
            return new jz5.l(z0Var, java.lang.Boolean.FALSE);
        }
        if (l06.o.z(z0Var)) {
            f26.l2 l2Var = (f26.l2) z0Var.u0().get(0);
            f26.d3 c17 = l2Var.c();
            f26.o0 type = l2Var.getType();
            kotlin.jvm.internal.o.f(type, "getType(...)");
            return new jz5.l(f26.r0.e(z0Var.v0(), z0Var.w0(), kz5.b0.c(new f26.n2(c17, h(type, aVar))), z0Var.x0(), null, 16, null), java.lang.Boolean.FALSE);
        }
        if (f26.s0.a(z0Var)) {
            return new jz5.l(h26.m.c(h26.l.f278365t, z0Var.w0().toString()), java.lang.Boolean.FALSE);
        }
        y16.s F = gVar.F(this);
        kotlin.jvm.internal.o.f(F, "getMemberScope(...)");
        f26.r1 v07 = z0Var.v0();
        f26.c2 g17 = gVar.g();
        kotlin.jvm.internal.o.f(g17, "getTypeConstructor(...)");
        java.util.List<o06.e2> parameters = gVar.g().getParameters();
        kotlin.jvm.internal.o.f(parameters, "getParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(parameters, 10));
        for (o06.e2 e2Var : parameters) {
            kotlin.jvm.internal.o.d(e2Var);
            f26.k2 k2Var = this.f37968c;
            arrayList.add(this.f37967b.a(e2Var, aVar, k2Var, k2Var.b(e2Var, aVar)));
        }
        return new jz5.l(f26.r0.g(v07, g17, arrayList, z0Var.x0(), F, new c16.h(gVar, this, z0Var, aVar)), java.lang.Boolean.TRUE);
    }

    public final f26.o0 h(f26.o0 o0Var, c16.a aVar) {
        o06.j i17 = o0Var.w0().i();
        if (i17 instanceof o06.e2) {
            aVar.getClass();
            return h(this.f37968c.b((o06.e2) i17, c16.a.a(aVar, null, null, true, false, null, null, 59, null)), aVar);
        }
        if (!(i17 instanceof o06.g)) {
            throw new java.lang.IllegalStateException(("Unexpected declaration kind: " + i17).toString());
        }
        o06.j i18 = f26.h0.d(o0Var).w0().i();
        if (i18 instanceof o06.g) {
            jz5.l g17 = g(f26.h0.c(o0Var), (o06.g) i17, f37965d);
            f26.z0 z0Var = (f26.z0) g17.f302833d;
            boolean booleanValue = ((java.lang.Boolean) g17.f302834e).booleanValue();
            jz5.l g18 = g(f26.h0.d(o0Var), (o06.g) i18, f37966e);
            f26.z0 z0Var2 = (f26.z0) g18.f302833d;
            return (booleanValue || ((java.lang.Boolean) g18.f302834e).booleanValue()) ? new c16.k(z0Var, z0Var2) : f26.r0.a(z0Var, z0Var2);
        }
        throw new java.lang.IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + i18 + "\" while for lower it's \"" + i17 + '\"').toString());
    }
}
