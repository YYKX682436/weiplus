package l06;

/* loaded from: classes15.dex */
public abstract class j {
    public static final int a(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        p06.c a17 = o0Var.mo9601xa083c1ee().a(l06.w.f396470r);
        if (a17 == null) {
            return 0;
        }
        t16.g gVar = (t16.g) kz5.c1.h(a17.c(), l06.x.f396483e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((java.lang.Number) ((t16.o) gVar).f496146a).intValue();
    }

    public static final f26.z0 b(l06.o builtIns, p06.k kVar, f26.o0 o0Var, java.util.List contextReceiverTypes, java.util.List parameterTypes, java.util.List list, f26.o0 returnType, boolean z17) {
        o06.g k17;
        n16.g gVar;
        p06.k annotations = kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builtIns, "builtIns");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextReceiverTypes, "contextReceiverTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameterTypes, "parameterTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(returnType, "returnType");
        java.util.ArrayList arrayList = new java.util.ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (o0Var != null ? 1 : 0) + 1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(contextReceiverTypes, 10));
        java.util.Iterator it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(j26.c.a((f26.o0) it.next()));
        }
        arrayList.addAll(arrayList2);
        o26.a.a(arrayList, o0Var != null ? j26.c.a(o0Var) : null);
        java.util.Iterator it6 = parameterTypes.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it6.hasNext();
            p06.k kVar2 = p06.i.f432298a;
            if (!hasNext) {
                arrayList.add(j26.c.a(returnType));
                int size = parameterTypes.size() + contextReceiverTypes.size() + (o0Var == null ? 0 : 1);
                if (z17) {
                    k17 = builtIns.w(size);
                } else {
                    n16.g gVar2 = l06.x.f396479a;
                    k17 = builtIns.k("Function" + size);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
                if (o0Var != null) {
                    n16.c cVar = l06.w.f396469q;
                    if (!annotations.I(cVar)) {
                        java.util.List s07 = kz5.n0.s0(annotations, new p06.o(builtIns, cVar, kz5.q0.f395534d, false));
                        annotations = ((java.util.ArrayList) s07).isEmpty() ? kVar2 : new p06.l(s07);
                    }
                }
                if (!contextReceiverTypes.isEmpty()) {
                    int size2 = contextReceiverTypes.size();
                    n16.c cVar2 = l06.w.f396470r;
                    if (annotations.I(cVar2)) {
                        kVar2 = annotations;
                    } else {
                        java.util.List s08 = kz5.n0.s0(annotations, new p06.o(builtIns, cVar2, kz5.b1.e(new jz5.l(l06.x.f396483e, new t16.o(size2))), false));
                        if (!((java.util.ArrayList) s08).isEmpty()) {
                            kVar2 = new p06.l(s08);
                        }
                    }
                    annotations = kVar2;
                }
                return f26.r0.c(f26.s1.b(annotations), k17, arrayList);
            }
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f26.o0 o0Var2 = (f26.o0) next;
            if (list == null || (gVar = (n16.g) list.get(i17)) == null || gVar.f415703e) {
                gVar = null;
            }
            if (gVar != null) {
                n16.c cVar3 = l06.w.f396471s;
                n16.g gVar3 = l06.x.f396482d;
                java.lang.String h17 = gVar.h();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
                java.util.List s09 = kz5.n0.s0(o0Var2.mo9601xa083c1ee(), new p06.o(builtIns, cVar3, kz5.b1.e(new jz5.l(gVar3, new t16.b0(h17))), false));
                if (!((java.util.ArrayList) s09).isEmpty()) {
                    kVar2 = new p06.l(s09);
                }
                o0Var2 = j26.c.k(o0Var2, kVar2);
            }
            arrayList.add(j26.c.a(o0Var2));
            i17 = i18;
        }
    }

    public static final n16.g c(f26.o0 o0Var) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        p06.c a17 = o0Var.mo9601xa083c1ee().a(l06.w.f396471s);
        if (a17 == null) {
            return null;
        }
        java.lang.Object A0 = kz5.n0.A0(a17.c().values());
        t16.b0 b0Var = A0 instanceof t16.b0 ? (t16.b0) A0 : null;
        if (b0Var != null && (str = (java.lang.String) b0Var.f496146a) != null) {
            if (!n16.g.l(str)) {
                str = null;
            }
            if (str != null) {
                return n16.g.k(str);
            }
        }
        return null;
    }

    public static final java.util.List d(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        h(o0Var);
        int a17 = a(o0Var);
        if (a17 == 0) {
            return kz5.p0.f395529d;
        }
        java.util.List subList = o0Var.u0().subList(0, a17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        java.util.Iterator it = subList.iterator();
        while (it.hasNext()) {
            f26.o0 mo128949xfb85f7b0 = ((f26.l2) it.next()).mo128949xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
            arrayList.add(mo128949xfb85f7b0);
        }
        return arrayList;
    }

    public static final m06.m e(o06.m mVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<this>");
        if (!(mVar instanceof o06.g) || !l06.o.L(mVar)) {
            return null;
        }
        n16.e h17 = v16.f.h(mVar);
        if (!h17.e() || h17.d()) {
            return null;
        }
        m06.o oVar = m06.o.f404144b;
        n16.c e17 = h17.h().e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "parent(...)");
        java.lang.String h18 = h17.g().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "asString(...)");
        oVar.getClass();
        m06.n a17 = oVar.a(e17, h18);
        if (a17 != null) {
            return a17.f404142a;
        }
        return null;
    }

    public static final f26.o0 f(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        h(o0Var);
        if (o0Var.mo9601xa083c1ee().a(l06.w.f396469q) != null) {
            return ((f26.l2) o0Var.u0().get(a(o0Var))).mo128949xfb85f7b0();
        }
        return null;
    }

    public static final java.util.List g(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        h(o0Var);
        java.util.List u07 = o0Var.u0();
        int a17 = a(o0Var);
        int i17 = 0;
        if (h(o0Var)) {
            if (o0Var.mo9601xa083c1ee().a(l06.w.f396469q) != null) {
                i17 = 1;
            }
        }
        return u07.subList(a17 + i17, u07.size() - 1);
    }

    public static final boolean h(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        if (i17 == null) {
            return false;
        }
        m06.m e17 = e(i17);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e17, m06.i.f404136c) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e17, m06.l.f404139c);
    }

    public static final boolean i(f26.o0 o0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o0Var, "<this>");
        o06.j i17 = o0Var.w0().i();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i17 != null ? e(i17) : null, m06.l.f404139c);
    }
}
