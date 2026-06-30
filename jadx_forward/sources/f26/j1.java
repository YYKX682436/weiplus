package f26;

/* loaded from: classes16.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.n1 f340712a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f340713b;

    static {
        new f26.j1(f26.m1.f340729a, false);
    }

    public j1(f26.n1 reportStrategy, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportStrategy, "reportStrategy");
        this.f340712a = reportStrategy;
        this.f340713b = z17;
    }

    public final void a(p06.k kVar, p06.k kVar2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = kVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((p06.c) it.next()).a());
        }
        java.util.Iterator it6 = kVar2.iterator();
        while (it6.hasNext()) {
            if (hashSet.contains(((p06.c) it6.next()).a())) {
                ((f26.m1) this.f340712a).getClass();
            }
        }
    }

    public final f26.z0 b(f26.l1 l1Var, f26.r1 r1Var, boolean z17, int i17, boolean z18) {
        f26.r1 b17;
        f26.o oVar;
        f26.o oVar2;
        f26.l2 c17 = c(new f26.n2(f26.d3.f340676f, ((d26.p0) l1Var.f340725b).v0()), l1Var, null, i17);
        f26.o0 mo128949xfb85f7b0 = c17.mo128949xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
        f26.z0 a17 = f26.r2.a(mo128949xfb85f7b0);
        if (f26.s0.a(a17)) {
            return a17;
        }
        c17.c();
        a(a17.mo9601xa083c1ee(), f26.p.a(r1Var));
        if (!f26.s0.a(a17)) {
            if (f26.s0.a(a17)) {
                b17 = a17.v0();
            } else {
                f26.r1 other = a17.v0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
                if (r1Var.m144937x7aab3243() && other.m144937x7aab3243()) {
                    b17 = r1Var;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    f26.q1 q1Var = f26.r1.f340747e;
                    java.util.Collection values = q1Var.f396802a.values();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                    java.util.Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        f26.o1 o1Var = (f26.o1) r1Var.f396760d.get(intValue);
                        f26.o1 o1Var2 = (f26.o1) other.f396760d.get(intValue);
                        if (o1Var == null) {
                            if (o1Var2 != null) {
                                oVar2 = (f26.o) o1Var2;
                                f26.o oVar3 = (f26.o) o1Var;
                                if (oVar3 != null) {
                                    oVar = new f26.o(p06.m.a(oVar2.f340735a, oVar3.f340735a));
                                    oVar2 = oVar;
                                }
                            } else {
                                oVar2 = null;
                            }
                            o26.a.a(arrayList, oVar2);
                        } else {
                            f26.o oVar4 = (f26.o) o1Var;
                            f26.o oVar5 = (f26.o) o1Var2;
                            if (oVar5 == null) {
                                oVar2 = oVar4;
                                o26.a.a(arrayList, oVar2);
                            } else {
                                oVar = new f26.o(p06.m.a(oVar4.f340735a, oVar5.f340735a));
                                oVar2 = oVar;
                                o26.a.a(arrayList, oVar2);
                            }
                        }
                    }
                    b17 = q1Var.b(arrayList);
                }
            }
            a17 = f26.r2.d(a17, null, b17, 1, null);
        }
        f26.z0 k17 = f26.z2.k(a17, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "let(...)");
        if (!z18) {
            return k17;
        }
        r06.k kVar = ((r06.l) l1Var.f340725b).f450015n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(kVar, "getTypeConstructor(...)");
        return f26.d1.c(k17, f26.r0.f(r1Var, kVar, l1Var.f340726c, z17, y16.r.f540506b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f26.l2 c(f26.l2 l2Var, f26.l1 l1Var, o06.e2 e2Var, int i17) {
        f26.d3 d3Var;
        f26.o oVar;
        f26.o oVar2;
        f26.d3 d3Var2;
        f26.d3 d3Var3;
        f26.n2 n2Var;
        o06.x0 x0Var = l1Var.f340725b;
        if (i17 > 100) {
            throw new java.lang.AssertionError("Too deep recursion while expanding type alias " + ((r06.v) x0Var).mo132800xfb82e301());
        }
        if (l2Var.b()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var);
            return f26.z2.l(e2Var);
        }
        f26.o0 mo128949xfb85f7b0 = l2Var.mo128949xfb85f7b0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
        f26.c2 constructor = mo128949xfb85f7b0.w0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        o06.j i18 = constructor.i();
        f26.l2 l2Var2 = i18 instanceof o06.e2 ? (f26.l2) l1Var.f340727d.get(i18) : null;
        f26.n1 n1Var = this.f340712a;
        if (l2Var2 == null) {
            f26.c3 z07 = l2Var.mo128949xfb85f7b0().z0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z07, "<this>");
            f26.z0 a17 = f26.r2.a(z07);
            if (f26.s0.a(a17) || !f26.z2.c(a17, j26.b.f378863d)) {
                return l2Var;
            }
            f26.c2 w07 = a17.w0();
            o06.j i19 = w07.i();
            w07.mo9613x99879e0().size();
            a17.u0().size();
            if (i19 instanceof o06.e2) {
                return l2Var;
            }
            int i27 = 0;
            if (i19 instanceof o06.d2) {
                o06.d2 d2Var = (o06.d2) i19;
                if (l1Var.a(d2Var)) {
                    ((f26.m1) n1Var).getClass();
                    f26.d3 d3Var4 = f26.d3.f340676f;
                    h26.l lVar = h26.l.f359890i;
                    java.lang.String str = ((r06.v) d2Var).mo132800xfb82e301().f415702d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
                    return new f26.n2(d3Var4, h26.m.c(lVar, str));
                }
                java.util.List u07 = a17.u0();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
                for (java.lang.Object obj : u07) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    arrayList.add(c((f26.l2) obj, l1Var, (o06.e2) w07.mo9613x99879e0().get(i27), i17 + 1));
                    i27 = i28;
                }
                n2Var = new f26.n2(l2Var.c(), f26.d1.c(b(f26.l1.f340723e.a(l1Var, d2Var, arrayList), a17.v0(), a17.x0(), i17 + 1, false), d(a17, l1Var, i17)));
            } else {
                f26.z0 d17 = d(a17, l1Var, i17);
                f26.v2.d(d17);
                for (java.lang.Object obj2 : d17.u0()) {
                    int i29 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    f26.l2 l2Var3 = (f26.l2) obj2;
                    if (!l2Var3.b()) {
                        f26.o0 mo128949xfb85f7b02 = l2Var3.mo128949xfb85f7b0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b02, "getType(...)");
                        if (!f26.z2.c(mo128949xfb85f7b02, j26.a.f378862d)) {
                            f26.l2 l2Var4 = (f26.l2) a17.u0().get(i27);
                            o06.e2 e2Var2 = (o06.e2) a17.w0().mo9613x99879e0().get(i27);
                            if (this.f340713b) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l2Var4.mo128949xfb85f7b0(), "getType(...)");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l2Var3.mo128949xfb85f7b0(), "getType(...)");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var2);
                                ((f26.m1) n1Var).getClass();
                            }
                        }
                    }
                    i27 = i29;
                }
                n2Var = new f26.n2(l2Var.c(), d17);
            }
            return n2Var;
        }
        if (l2Var2.b()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var);
            return f26.z2.l(e2Var);
        }
        f26.c3 substitutedArgument = l2Var2.mo128949xfb85f7b0().z0();
        f26.d3 c17 = l2Var2.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getProjectionKind(...)");
        f26.d3 c18 = l2Var.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getProjectionKind(...)");
        o06.d2 typeAlias = l1Var.f340725b;
        if (c18 != c17 && c18 != (d3Var3 = f26.d3.f340676f)) {
            if (c17 == d3Var3) {
                c17 = c18;
            } else {
                ((f26.m1) n1Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAlias, "typeAlias");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(substitutedArgument, "substitutedArgument");
            }
        }
        if (e2Var == null || (d3Var = e2Var.q()) == null) {
            d3Var = f26.d3.f340676f;
        }
        if (d3Var != c17 && d3Var != (d3Var2 = f26.d3.f340676f)) {
            if (c17 == d3Var2) {
                c17 = d3Var2;
            } else {
                ((f26.m1) n1Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAlias, "typeAlias");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(substitutedArgument, "substitutedArgument");
            }
        }
        a(mo128949xfb85f7b0.mo9601xa083c1ee(), substitutedArgument.mo9601xa083c1ee());
        f26.z0 k17 = f26.z2.k(f26.r2.a(substitutedArgument), mo128949xfb85f7b0.x0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "makeNullableIfNeeded(...)");
        f26.r1 v07 = mo128949xfb85f7b0.v0();
        if (!f26.s0.a(k17)) {
            if (f26.s0.a(k17)) {
                v07 = k17.v0();
            } else {
                f26.r1 other = k17.v0();
                v07.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
                if (!v07.m144937x7aab3243() || !other.m144937x7aab3243()) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    f26.q1 q1Var = f26.r1.f340747e;
                    java.util.Collection values = q1Var.f396802a.values();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                    java.util.Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((java.lang.Number) it.next()).intValue();
                        f26.o1 o1Var = (f26.o1) v07.f396760d.get(intValue);
                        f26.o1 o1Var2 = (f26.o1) other.f396760d.get(intValue);
                        if (o1Var == null) {
                            if (o1Var2 != null) {
                                oVar2 = (f26.o) o1Var2;
                                f26.o oVar3 = (f26.o) o1Var;
                                if (oVar3 != null) {
                                    oVar = new f26.o(p06.m.a(oVar2.f340735a, oVar3.f340735a));
                                    oVar2 = oVar;
                                }
                            } else {
                                oVar2 = null;
                            }
                            o26.a.a(arrayList2, oVar2);
                        } else {
                            f26.o oVar4 = (f26.o) o1Var;
                            f26.o oVar5 = (f26.o) o1Var2;
                            if (oVar5 == null) {
                                oVar2 = oVar4;
                                o26.a.a(arrayList2, oVar2);
                            } else {
                                oVar = new f26.o(p06.m.a(oVar4.f340735a, oVar5.f340735a));
                                oVar2 = oVar;
                                o26.a.a(arrayList2, oVar2);
                            }
                        }
                    }
                    v07 = q1Var.b(arrayList2);
                }
            }
            k17 = f26.r2.d(k17, null, v07, 1, null);
        }
        return new f26.n2(c17, k17);
    }

    public final f26.z0 d(f26.z0 z0Var, f26.l1 l1Var, int i17) {
        f26.c2 w07 = z0Var.w0();
        java.util.List u07 = z0Var.u0();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(u07, 10));
        int i18 = 0;
        for (java.lang.Object obj : u07) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            f26.l2 l2Var = (f26.l2) obj;
            f26.l2 c17 = c(l2Var, l1Var, (o06.e2) w07.mo9613x99879e0().get(i18), i17 + 1);
            if (!c17.b()) {
                c17 = new f26.n2(c17.c(), f26.z2.j(c17.mo128949xfb85f7b0(), l2Var.mo128949xfb85f7b0().x0()));
            }
            arrayList.add(c17);
            i18 = i19;
        }
        return f26.r2.d(z0Var, arrayList, null, 2, null);
    }
}
