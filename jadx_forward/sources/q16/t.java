package q16;

/* loaded from: classes16.dex */
public final class t implements o06.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q16.a0 f441316a;

    public t(q16.a0 a0Var) {
        this.f441316a = a0Var;
    }

    @Override // o06.o
    public java.lang.Object a(o06.l2 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f441316a.j0(descriptor, true, builder, true);
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object b(o06.d1 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        q16.a0 a0Var = this.f441316a;
        a0Var.getClass();
        r06.z0 z0Var = (r06.z0) descriptor;
        a0Var.Y(z0Var.f450099h, "package-fragment", builder);
        if (a0Var.c()) {
            builder.append(" in ");
            a0Var.U(z0Var.e(), builder, false);
        }
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object c(o06.d2 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        q16.a0 a0Var = this.f441316a;
        a0Var.F(builder, descriptor, null);
        r06.l lVar = (r06.l) descriptor;
        o06.g0 g0Var = lVar.f450013i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g0Var, "getVisibility(...)");
        a0Var.l0(g0Var, builder);
        a0Var.Q(descriptor, builder);
        builder.append(a0Var.O("typealias"));
        builder.append(" ");
        a0Var.U(descriptor, builder, true);
        a0Var.h0(lVar.m(), builder, false);
        a0Var.H(descriptor, builder);
        builder.append(" = ");
        builder.append(a0Var.v(((d26.p0) descriptor).v0()));
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object d(o06.v0 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f441316a.U(descriptor, builder, true);
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object e(o06.q1 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        o(descriptor, builder, "setter");
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object f(o06.g descriptor, java.lang.Object obj) {
        o06.d s17;
        java.lang.String str;
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        q16.a0 a0Var = this.f441316a;
        a0Var.getClass();
        boolean z17 = descriptor.j() == o06.h.f423496g;
        if (!a0Var.A()) {
            a0Var.F(builder, descriptor, null);
            java.util.List f07 = descriptor.f0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f07, "getContextReceivers(...)");
            a0Var.J(f07, builder);
            if (!z17) {
                o06.g0 mo9617x61f71b08 = descriptor.mo9617x61f71b08();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9617x61f71b08, "getVisibility(...)");
                a0Var.l0(mo9617x61f71b08, builder);
            }
            if ((descriptor.j() != o06.h.f423494e || descriptor.f() != o06.t0.f423521h) && (!descriptor.j().h() || descriptor.f() != o06.t0.f423518e)) {
                o06.t0 f17 = descriptor.f();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getModality(...)");
                a0Var.R(f17, builder, a0Var.E(descriptor));
            }
            a0Var.Q(descriptor, builder);
            a0Var.T(builder, a0Var.z().contains(q16.b0.f441243n) && descriptor.p(), "inner");
            a0Var.T(builder, a0Var.z().contains(q16.b0.f441245p) && descriptor.t0(), com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            a0Var.T(builder, a0Var.z().contains(q16.b0.f441246q) && descriptor.mo9618xe19a9463(), "inline");
            a0Var.T(builder, a0Var.z().contains(q16.b0.f441252w) && descriptor.k0(), "value");
            a0Var.T(builder, a0Var.z().contains(q16.b0.f441251v) && descriptor.h0(), "fun");
            if (descriptor instanceof o06.d2) {
                str = "typealias";
            } else if (descriptor.g0()) {
                str = "companion object";
            } else {
                int ordinal = descriptor.j().ordinal();
                if (ordinal == 0) {
                    str = "class";
                } else if (ordinal == 1) {
                    str = "interface";
                } else if (ordinal == 2) {
                    str = "enum class";
                } else if (ordinal == 3) {
                    str = "enum entry";
                } else if (ordinal == 4) {
                    str = "annotation class";
                } else {
                    if (ordinal != 5) {
                        throw new jz5.j();
                    }
                    str = "object";
                }
            }
            builder.append(a0Var.O(str));
        }
        boolean m17 = r16.i.m(descriptor);
        q16.g0 g0Var = a0Var.f441234d;
        if (m17) {
            if (((java.lang.Boolean) ((b06.b) g0Var.G).b(g0Var, q16.g0.X[31])).booleanValue()) {
                if (a0Var.A()) {
                    builder.append("companion object");
                }
                a0Var.c0(builder);
                o06.m e17 = descriptor.e();
                if (e17 != null) {
                    builder.append("of ");
                    n16.g mo132800xfb82e301 = e17.mo132800xfb82e301();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
                    builder.append(a0Var.u(mo132800xfb82e301, false));
                }
            }
            if (a0Var.D() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(descriptor.mo132800xfb82e301(), n16.i.f415707b)) {
                if (!a0Var.A()) {
                    a0Var.c0(builder);
                }
                n16.g mo132800xfb82e3012 = descriptor.mo132800xfb82e301();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e3012, "getName(...)");
                builder.append(a0Var.u(mo132800xfb82e3012, true));
            }
        } else {
            if (!a0Var.A()) {
                a0Var.c0(builder);
            }
            a0Var.U(descriptor, builder, true);
        }
        if (!z17) {
            java.util.List m18 = descriptor.m();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m18, "getDeclaredTypeParameters(...)");
            a0Var.h0(m18, builder, false);
            a0Var.H(descriptor, builder);
            if (!descriptor.j().h()) {
                if (((java.lang.Boolean) ((b06.b) g0Var.f441271i).b(g0Var, q16.g0.X[7])).booleanValue() && (s17 = descriptor.s()) != null) {
                    builder.append(" ");
                    a0Var.F(builder, s17, null);
                    r06.j0 j0Var = (r06.j0) s17;
                    o06.g0 mo9617x61f71b082 = j0Var.mo9617x61f71b08();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9617x61f71b082, "getVisibility(...)");
                    a0Var.l0(mo9617x61f71b082, builder);
                    builder.append(a0Var.O("constructor"));
                    java.util.Collection W = j0Var.W();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
                    a0Var.k0(W, s17.i0(), builder);
                }
            }
            if (!((java.lang.Boolean) ((b06.b) g0Var.f441286x).b(g0Var, q16.g0.X[22])).booleanValue() && !l06.o.F(descriptor.k())) {
                java.util.Collection a17 = descriptor.g().a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSupertypes(...)");
                if (!a17.isEmpty() && (a17.size() != 1 || !l06.o.y((f26.o0) a17.iterator().next()))) {
                    a0Var.c0(builder);
                    builder.append(": ");
                    kz5.n0.f0(a17, builder, ", ", null, null, 0, null, new q16.y(a0Var), 60, null);
                }
            }
            a0Var.m0(m18, builder);
        }
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o06.o
    public java.lang.Object g(o06.r1 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        builder.append(((r06.v) descriptor).mo132800xfb82e301());
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object h(o06.e2 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f441316a.f0(descriptor, builder, true);
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object i(o06.p1 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        o(descriptor, builder, "getter");
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object j(o06.k1 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        q16.a0 a0Var = this.f441316a;
        a0Var.getClass();
        r06.o0 o0Var = (r06.o0) descriptor;
        a0Var.Y(o0Var.f450029g, "package", builder);
        if (a0Var.c()) {
            builder.append(" in context of ");
            a0Var.U(o0Var.f450028f, builder, false);
        }
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    @Override // o06.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(o06.l r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q16.t.k(o06.l, java.lang.Object):java.lang.Object");
    }

    @Override // o06.o
    public /* bridge */ /* synthetic */ java.lang.Object l(o06.n0 n0Var, java.lang.Object obj) {
        n(n0Var, (java.lang.StringBuilder) obj);
        return jz5.f0.f384359a;
    }

    @Override // o06.o
    public java.lang.Object m(o06.o1 descriptor, java.lang.Object obj) {
        java.lang.StringBuilder builder = (java.lang.StringBuilder) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        q16.a0.w(this.f441316a, descriptor, builder);
        return jz5.f0.f384359a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c4, code lost:
    
        if (((java.lang.Boolean) ((b06.b) r2.O).b(r2, q16.g0.X[39])).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        if (((java.lang.Boolean) ((b06.b) r2.O).b(r2, q16.g0.X[39])).booleanValue() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c5, code lost:
    
        if (l06.o.E(r1, l06.w.f396457e) == false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(o06.n0 r11, java.lang.StringBuilder r12) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q16.t.n(o06.n0, java.lang.StringBuilder):void");
    }

    public final void o(o06.n1 n1Var, java.lang.StringBuilder sb6, java.lang.String str) {
        q16.a0 a0Var = this.f441316a;
        q16.g0 g0Var = a0Var.f441234d;
        int ordinal = ((q16.l0) ((b06.b) g0Var.H).b(g0Var, q16.g0.X[32])).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            n(n1Var, sb6);
            return;
        }
        a0Var.Q(n1Var, sb6);
        sb6.append(str + " for ");
        o06.o1 s07 = ((r06.d1) n1Var).s0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s07, "getCorrespondingProperty(...)");
        q16.a0.w(a0Var, s07, sb6);
    }
}
