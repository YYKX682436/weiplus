package c16;

/* loaded from: classes16.dex */
public final class k extends f26.e0 implements f26.y0 {
    public k(f26.z0 z0Var, f26.z0 z0Var2, boolean z17) {
        super(z0Var, z0Var2);
        if (z17) {
            return;
        }
        ((g26.v) g26.g.f267991a).b(z0Var, z0Var2);
    }

    public static final java.util.List F0(q16.s sVar, f26.o0 o0Var) {
        java.util.List<f26.l2> u07 = o0Var.u0();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
        for (f26.l2 typeProjection : u07) {
            q16.a0 a0Var = (q16.a0) sVar;
            a0Var.getClass();
            kotlin.jvm.internal.o.g(typeProjection, "typeProjection");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            kz5.n0.f0(kz5.b0.c(typeProjection), sb6, ", ", null, null, 0, null, new q16.u(a0Var), 60, null);
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            arrayList.add(sb7);
        }
        return arrayList;
    }

    public static final java.lang.String G0(java.lang.String str, java.lang.String str2) {
        if (!r26.n0.C(str, '<', false, 2, null)) {
            return str;
        }
        return r26.n0.r0(str, '<', null, 2, null) + '<' + str2 + '>' + r26.n0.o0(str, '>', str);
    }

    @Override // f26.c3
    public f26.c3 A0(boolean z17) {
        return new c16.k(this.f259153e.A0(z17), this.f259154f.A0(z17));
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new c16.k((f26.z0) kotlinTypeRefiner.a(this.f259153e), (f26.z0) kotlinTypeRefiner.a(this.f259154f), true);
    }

    @Override // f26.c3
    public f26.c3 C0(f26.r1 newAttributes) {
        kotlin.jvm.internal.o.g(newAttributes, "newAttributes");
        return new c16.k(this.f259153e.C0(newAttributes), this.f259154f.C0(newAttributes));
    }

    @Override // f26.e0
    public f26.z0 D0() {
        return this.f259153e;
    }

    @Override // f26.e0
    public java.lang.String E0(q16.s renderer, q16.c0 options) {
        kotlin.jvm.internal.o.g(renderer, "renderer");
        kotlin.jvm.internal.o.g(options, "options");
        f26.z0 z0Var = this.f259153e;
        java.lang.String v17 = renderer.v(z0Var);
        f26.z0 z0Var2 = this.f259154f;
        java.lang.String v18 = renderer.v(z0Var2);
        if (options.c()) {
            return "raw (" + v17 + ".." + v18 + ')';
        }
        if (z0Var2.u0().isEmpty()) {
            return renderer.s(v17, v18, j26.c.e(this));
        }
        java.util.List F0 = F0(renderer, z0Var);
        java.util.List F02 = F0(renderer, z0Var2);
        java.lang.String g07 = kz5.n0.g0(F0, ", ", null, null, 0, null, c16.j.f37969d, 30, null);
        java.util.List a17 = kz5.n0.a1(F0, F02);
        boolean z17 = true;
        if (!a17.isEmpty()) {
            java.util.Iterator it = a17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jz5.l lVar = (jz5.l) it.next();
                java.lang.String str = (java.lang.String) lVar.f302833d;
                java.lang.String str2 = (java.lang.String) lVar.f302834e;
                if (!(kotlin.jvm.internal.o.b(str, r26.n0.W(str2, "out ")) || kotlin.jvm.internal.o.b(str2, "*"))) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            v18 = G0(v18, g07);
        }
        java.lang.String G0 = G0(v17, g07);
        return kotlin.jvm.internal.o.b(G0, v18) ? G0 : renderer.s(G0, v18, j26.c.e(this));
    }

    @Override // f26.e0, f26.o0
    public y16.s V() {
        o06.j i17 = w0().i();
        o06.g gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
        if (gVar != null) {
            y16.s F = gVar.F(new c16.i(null, 1, null));
            kotlin.jvm.internal.o.f(F, "getMemberScope(...)");
            return F;
        }
        throw new java.lang.IllegalStateException(("Incorrect classifier: " + w0().i()).toString());
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new c16.k((f26.z0) kotlinTypeRefiner.a(this.f259153e), (f26.z0) kotlinTypeRefiner.a(this.f259154f), true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(f26.z0 lowerBound, f26.z0 upperBound) {
        this(lowerBound, upperBound, false);
        kotlin.jvm.internal.o.g(lowerBound, "lowerBound");
        kotlin.jvm.internal.o.g(upperBound, "upperBound");
    }
}
