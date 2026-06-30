package k26;

/* loaded from: classes16.dex */
public abstract class d {
    public static final k26.a a(f26.o0 type) {
        java.lang.Object b17;
        k26.e eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (f26.h0.b(type)) {
            k26.a a17 = a(f26.h0.c(type));
            k26.a a18 = a(f26.h0.d(type));
            return new k26.a(f26.b3.b(f26.r0.a(f26.h0.c((f26.o0) a17.f385300a), f26.h0.d((f26.o0) a18.f385300a)), type), f26.b3.b(f26.r0.a(f26.h0.c((f26.o0) a17.f385301b), f26.h0.d((f26.o0) a18.f385301b)), type));
        }
        f26.c2 w07 = type.w0();
        boolean z17 = true;
        if (type.w0() instanceof s16.b) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            f26.l2 mo130745x78d58245 = ((s16.b) w07).mo130745x78d58245();
            f26.o0 mo128949xfb85f7b0 = mo130745x78d58245.mo128949xfb85f7b0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b0, "getType(...)");
            f26.o0 j17 = f26.z2.j(mo128949xfb85f7b0, type.x0());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "makeNullableIfNeeded(...)");
            int ordinal = mo130745x78d58245.c().ordinal();
            if (ordinal == 1) {
                f26.z0 p17 = j26.c.e(type).p();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getNullableAnyType(...)");
                return new k26.a(j17, p17);
            }
            if (ordinal != 2) {
                throw new java.lang.AssertionError("Only nontrivial projections should have been captured, not: " + mo130745x78d58245);
            }
            f26.z0 o17 = j26.c.e(type).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getNothingType(...)");
            f26.o0 j18 = f26.z2.j(o17, type.x0());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j18, "makeNullableIfNeeded(...)");
            return new k26.a(j18, j17);
        }
        if (type.u0().isEmpty() || type.u0().size() != w07.mo9613x99879e0().size()) {
            return new k26.a(type, type);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List u07 = type.u0();
        java.util.List mo9613x99879e0 = w07.mo9613x99879e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.a1(u07, mo9613x99879e0)).iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            f26.l2 l2Var = (f26.l2) lVar.f384366d;
            o06.e2 e2Var = (o06.e2) lVar.f384367e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var);
            f26.d3 q17 = e2Var.q();
            if (q17 == null) {
                f26.v2.a(35);
                throw null;
            }
            if (l2Var == null) {
                f26.v2.a(36);
                throw null;
            }
            f26.v2 v2Var = f26.v2.f340764b;
            int ordinal2 = (l2Var.b() ? f26.d3.f340678h : f26.v2.b(q17, l2Var.c())).ordinal();
            if (ordinal2 == 0) {
                f26.o0 mo128949xfb85f7b02 = l2Var.mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b02, "getType(...)");
                f26.o0 mo128949xfb85f7b03 = l2Var.mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b03, "getType(...)");
                eVar = new k26.e(e2Var, mo128949xfb85f7b02, mo128949xfb85f7b03);
            } else if (ordinal2 == 1) {
                f26.o0 mo128949xfb85f7b04 = l2Var.mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b04, "getType(...)");
                f26.z0 p18 = v16.f.e(e2Var).p();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getNullableAnyType(...)");
                eVar = new k26.e(e2Var, mo128949xfb85f7b04, p18);
            } else {
                if (ordinal2 != 2) {
                    throw new jz5.j();
                }
                f26.z0 o18 = v16.f.e(e2Var).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getNothingType(...)");
                f26.o0 mo128949xfb85f7b05 = l2Var.mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo128949xfb85f7b05, "getType(...)");
                eVar = new k26.e(e2Var, o18, mo128949xfb85f7b05);
            }
            if (l2Var.b()) {
                arrayList.add(eVar);
                arrayList2.add(eVar);
            } else {
                k26.a a19 = a(eVar.f385304b);
                f26.o0 o0Var = (f26.o0) a19.f385300a;
                f26.o0 o0Var2 = (f26.o0) a19.f385301b;
                k26.a a27 = a(eVar.f385305c);
                f26.o0 o0Var3 = (f26.o0) a27.f385300a;
                f26.o0 o0Var4 = (f26.o0) a27.f385301b;
                o06.e2 e2Var2 = eVar.f385303a;
                k26.e eVar2 = new k26.e(e2Var2, o0Var2, o0Var3);
                k26.e eVar3 = new k26.e(e2Var2, o0Var, o0Var4);
                arrayList.add(eVar2);
                arrayList2.add(eVar3);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((k26.e) it6.next()).getClass();
                if (!((g26.v) g26.g.f349524a).b(r2.f385304b, r2.f385305c)) {
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            b17 = j26.c.e(type).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getNothingType(...)");
        } else {
            b17 = b(type, arrayList);
        }
        return new k26.a(b17, b(type, arrayList2));
    }

    public static final f26.o0 b(f26.o0 o0Var, java.util.List list) {
        f26.n2 n2Var;
        o0Var.u0().size();
        list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            k26.e eVar = (k26.e) it.next();
            eVar.getClass();
            ((g26.v) g26.g.f349524a).b(eVar.f385304b, eVar.f385305c);
            f26.o0 o0Var2 = eVar.f385304b;
            f26.o0 o0Var3 = eVar.f385305c;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o0Var2, o0Var3)) {
                o06.e2 e2Var = eVar.f385303a;
                f26.d3 q17 = e2Var.q();
                f26.d3 d3Var = f26.d3.f340677g;
                if (q17 != d3Var) {
                    if (l06.o.F(o0Var2) && e2Var.q() != d3Var) {
                        f26.d3 d3Var2 = f26.d3.f340678h;
                        if (d3Var2 == e2Var.q()) {
                            d3Var2 = f26.d3.f340676f;
                        }
                        n2Var = new f26.n2(d3Var2, o0Var3);
                    } else {
                        if (o0Var3 == null) {
                            l06.o.a(141);
                            throw null;
                        }
                        if (l06.o.y(o0Var3) && o0Var3.x0()) {
                            if (d3Var == e2Var.q()) {
                                d3Var = f26.d3.f340676f;
                            }
                            n2Var = new f26.n2(d3Var, o0Var2);
                        } else {
                            f26.d3 d3Var3 = f26.d3.f340678h;
                            if (d3Var3 == e2Var.q()) {
                                d3Var3 = f26.d3.f340676f;
                            }
                            n2Var = new f26.n2(d3Var3, o0Var3);
                        }
                    }
                    arrayList.add(n2Var);
                }
            }
            n2Var = new f26.n2(o0Var2);
            arrayList.add(n2Var);
        }
        return f26.r2.c(o0Var, arrayList, null, null, 6, null);
    }
}
