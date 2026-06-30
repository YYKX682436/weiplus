package j26;

/* loaded from: classes16.dex */
public abstract class c {
    public static final f26.l2 a(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        return new f26.n2(o0Var);
    }

    public static final boolean b(f26.o0 o0Var, f26.c2 c2Var, java.util.Set set) {
        boolean z17;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var.w0(), c2Var)) {
            return true;
        }
        o06.j i17 = o0Var.w0().i();
        o06.k kVar = i17 instanceof o06.k ? (o06.k) i17 : null;
        java.util.List m17 = kVar != null ? kVar.m() : null;
        java.lang.Iterable Z0 = kz5.n0.Z0(o0Var.u0());
        if (!(Z0 instanceof java.util.Collection) || !((java.util.Collection) Z0).isEmpty()) {
            java.util.Iterator it = ((kz5.v0) Z0).iterator();
            while (it.hasNext()) {
                kz5.u0 u0Var = (kz5.u0) it.next();
                int i18 = u0Var.f395548a;
                f26.l2 l2Var = (f26.l2) u0Var.f395549b;
                o06.e2 e2Var = m17 != null ? (o06.e2) kz5.n0.a0(m17, i18) : null;
                if (((e2Var == null || set == null || !set.contains(e2Var)) ? false : true) || l2Var.b()) {
                    z17 = false;
                } else {
                    f26.o0 mo128949xfb85f7b0 = l2Var.mo128949xfb85f7b0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
                    z17 = b(mo128949xfb85f7b0, c2Var, set);
                }
                if (z17) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final f26.l2 c(f26.o0 type, f26.d3 projectionKind, o06.e2 e2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(projectionKind, "projectionKind");
        if ((e2Var != null ? e2Var.q() : null) == projectionKind) {
            projectionKind = f26.d3.f340676f;
        }
        return new f26.n2(projectionKind, type);
    }

    public static final void d(f26.o0 o0Var, f26.o0 o0Var2, java.util.Set set, java.util.Set set2) {
        o06.j i17 = o0Var.w0().i();
        if (i17 instanceof o06.e2) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var.w0(), o0Var2.w0())) {
                set.add(i17);
                return;
            }
            for (f26.o0 o0Var3 : ((o06.e2) i17).mo150356xa5be00c1()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var3);
                d(o0Var3, o0Var2, set, set2);
            }
            return;
        }
        o06.j i18 = o0Var.w0().i();
        o06.k kVar = i18 instanceof o06.k ? (o06.k) i18 : null;
        java.util.List m17 = kVar != null ? kVar.m() : null;
        int i19 = 0;
        for (f26.l2 l2Var : o0Var.u0()) {
            int i27 = i19 + 1;
            o06.e2 e2Var = m17 != null ? (o06.e2) kz5.n0.a0(m17, i19) : null;
            if (!((e2Var == null || set2 == null || !set2.contains(e2Var)) ? false : true) && !l2Var.b() && !kz5.n0.O(set, l2Var.mo128949xfb85f7b0().w0().i()) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l2Var.mo128949xfb85f7b0().w0(), o0Var2.w0())) {
                f26.o0 mo128949xfb85f7b0 = l2Var.mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
                d(mo128949xfb85f7b0, o0Var2, set, set2);
            }
            i19 = i27;
        }
    }

    public static final l06.o e(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        l06.o h17 = o0Var.w0().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getBuiltIns(...)");
        return h17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f26.o0 f(o06.e2 r7) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.util.List r0 = r7.mo150356xa5be00c1()
            java.lang.String r1 = "getUpperBounds(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r0.isEmpty()
            java.util.List r0 = r7.mo150356xa5be00c1()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r4 = r2
            f26.o0 r4 = (f26.o0) r4
            f26.c2 r4 = r4.w0()
            o06.j r4 = r4.i()
            boolean r5 = r4 instanceof o06.g
            if (r5 == 0) goto L39
            r3 = r4
            o06.g r3 = (o06.g) r3
        L39:
            r4 = 0
            if (r3 != 0) goto L3d
            goto L4e
        L3d:
            o06.h r5 = r3.j()
            o06.h r6 = o06.h.f423494e
            if (r5 == r6) goto L4e
            o06.h r3 = r3.j()
            o06.h r5 = o06.h.f423497h
            if (r3 == r5) goto L4e
            r4 = 1
        L4e:
            if (r4 == 0) goto L1c
            r3 = r2
        L51:
            f26.o0 r3 = (f26.o0) r3
            if (r3 != 0) goto L68
            java.util.List r7 = r7.mo150356xa5be00c1()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)
            java.lang.Object r7 = kz5.n0.X(r7)
            java.lang.String r0 = "first(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r0)
            r3 = r7
            f26.o0 r3 = (f26.o0) r3
        L68:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j26.c.f(o06.e2):f26.o0");
    }

    public static final boolean g(o06.e2 typeParameter, f26.c2 c2Var, java.util.Set set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameter, "typeParameter");
        java.util.List<f26.o0> mo150356xa5be00c1 = typeParameter.mo150356xa5be00c1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo150356xa5be00c1, "getUpperBounds(...)");
        if (mo150356xa5be00c1.isEmpty()) {
            return false;
        }
        for (f26.o0 o0Var : mo150356xa5be00c1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
            if (b(o0Var, typeParameter.k().w0(), set) && (c2Var == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var.w0(), c2Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean h(o06.e2 e2Var, f26.c2 c2Var, java.util.Set set, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            c2Var = null;
        }
        if ((i17 & 4) != 0) {
            set = null;
        }
        return g(e2Var, c2Var, set);
    }

    public static final boolean i(f26.o0 o0Var, f26.o0 superType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superType, "superType");
        return ((g26.v) g26.g.f349524a).b(o0Var, superType);
    }

    public static final f26.o0 j(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        f26.o0 i17 = f26.z2.i(o0Var, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "makeNullable(...)");
        return i17;
    }

    public static final f26.o0 k(f26.o0 o0Var, p06.k newAnnotations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAnnotations, "newAnnotations");
        return (o0Var.mo9601xa083c1ee().mo324x7aab3243() && newAnnotations.mo324x7aab3243()) ? o0Var : o0Var.z0().C0(f26.s1.a(o0Var.v0(), newAnnotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [f26.c3] */
    public static final f26.o0 l(f26.o0 o0Var) {
        f26.z0 z0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        f26.c3 z07 = o0Var.z0();
        if (z07 instanceof f26.e0) {
            f26.e0 e0Var = (f26.e0) z07;
            f26.z0 z0Var2 = e0Var.f340686e;
            if (!z0Var2.w0().mo9613x99879e0().isEmpty() && z0Var2.w0().i() != null) {
                java.util.List mo9613x99879e0 = z0Var2.w0().mo9613x99879e0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo9613x99879e0, 10));
                java.util.Iterator it = mo9613x99879e0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new f26.g1((o06.e2) it.next()));
                }
                z0Var2 = f26.r2.d(z0Var2, arrayList, null, 2, null);
            }
            f26.z0 z0Var3 = e0Var.f340687f;
            if (!z0Var3.w0().mo9613x99879e0().isEmpty() && z0Var3.w0().i() != null) {
                java.util.List mo9613x99879e02 = z0Var3.w0().mo9613x99879e0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e02, "getParameters(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(mo9613x99879e02, 10));
                java.util.Iterator it6 = mo9613x99879e02.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(new f26.g1((o06.e2) it6.next()));
                }
                z0Var3 = f26.r2.d(z0Var3, arrayList2, null, 2, null);
            }
            z0Var = f26.r0.a(z0Var2, z0Var3);
        } else {
            if (!(z07 instanceof f26.z0)) {
                throw new jz5.j();
            }
            f26.z0 z0Var4 = (f26.z0) z07;
            boolean isEmpty = z0Var4.w0().mo9613x99879e0().isEmpty();
            z0Var = z0Var4;
            if (!isEmpty) {
                o06.j i17 = z0Var4.w0().i();
                z0Var = z0Var4;
                if (i17 != null) {
                    java.util.List mo9613x99879e03 = z0Var4.w0().mo9613x99879e0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e03, "getParameters(...)");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(mo9613x99879e03, 10));
                    java.util.Iterator it7 = mo9613x99879e03.iterator();
                    while (it7.hasNext()) {
                        arrayList3.add(new f26.g1((o06.e2) it7.next()));
                    }
                    z0Var = f26.r2.d(z0Var4, arrayList3, null, 2, null);
                }
            }
        }
        return f26.b3.b(z0Var, z07);
    }
}
