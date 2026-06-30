package b26;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o06.v0 f98971a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.c1 f98972b;

    public g(o06.v0 module, o06.c1 notFoundClasses) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notFoundClasses, "notFoundClasses");
        this.f98971a = module;
        this.f98972b = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [jz5.l] */
    public final p06.c a(i16.k proto, k16.g nameResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        o06.g c17 = o06.l0.c(this.f98971a, b26.t0.a(nameResolver, proto.f369090f), this.f98972b);
        java.util.Map map = kz5.q0.f395534d;
        if (proto.f369091g.size() != 0 && !h26.m.f(c17)) {
            int i17 = r16.i.f450191a;
            if (r16.i.o(c17, o06.h.f423497h)) {
                java.util.Collection S = c17.S();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(S, "getConstructors(...)");
                o06.p pVar = (o06.f) kz5.n0.A0(S);
                if (pVar != null) {
                    java.util.List W = ((r06.j0) pVar).W();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
                    int d17 = kz5.b1.d(kz5.d0.q(W, 10));
                    if (d17 < 16) {
                        d17 = 16;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                    for (java.lang.Object obj : W) {
                        linkedHashMap.put(((r06.v) ((o06.l2) obj)).mo132800xfb82e301(), obj);
                    }
                    java.util.List<i16.i> list = proto.f369091g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getArgumentList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (i16.i iVar : list) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                        o06.p pVar2 = (o06.l2) linkedHashMap.get(b26.t0.b(nameResolver, iVar.f369030f));
                        if (pVar2 != null) {
                            n16.g b17 = b26.t0.b(nameResolver, iVar.f369030f);
                            f26.o0 mo132802xfb85f7b0 = ((r06.t1) pVar2).mo132802xfb85f7b0();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132802xfb85f7b0, "getType(...)");
                            i16.h hVar = iVar.f369031g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar, "getValue(...)");
                            t16.g c18 = c(mo132802xfb85f7b0, hVar, nameResolver);
                            r5 = b(c18, mo132802xfb85f7b0, hVar) ? c18 : null;
                            if (r5 == null) {
                                java.lang.String message = "Unexpected argument value: actual type " + hVar.f369007f + " != expected type " + mo132802xfb85f7b0;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
                                r5 = new t16.l(message);
                            }
                            r5 = new jz5.l(b17, r5);
                        }
                        if (r5 != null) {
                            arrayList.add(r5);
                        }
                    }
                    map = kz5.c1.q(arrayList);
                }
            }
        }
        return new p06.d(c17.k(), map, o06.x1.f423537a);
    }

    public final boolean b(t16.g gVar, f26.o0 o0Var, i16.h hVar) {
        i16.g gVar2 = hVar.f369007f;
        int i17 = gVar2 == null ? -1 : b26.f.f98963a[gVar2.ordinal()];
        if (i17 != 10) {
            o06.v0 v0Var = this.f98971a;
            if (i17 != 13) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.a(v0Var), o0Var);
            }
            if (!((gVar instanceof t16.b) && ((java.util.List) ((t16.b) gVar).f496146a).size() == hVar.f369015q.size())) {
                throw new java.lang.IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            f26.o0 g17 = v0Var.h().g(o0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getArrayElementType(...)");
            t16.b bVar = (t16.b) gVar;
            java.lang.Iterable g18 = kz5.c0.g((java.util.Collection) bVar.f496146a);
            if (!(g18 instanceof java.util.Collection) || !((java.util.Collection) g18).isEmpty()) {
                kz5.x0 it = g18.iterator();
                while (((e06.j) it).f327747f) {
                    int b17 = it.b();
                    t16.g gVar3 = (t16.g) ((java.util.List) bVar.f496146a).get(b17);
                    i16.h hVar2 = (i16.h) hVar.f369015q.get(b17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hVar2, "getArrayElement(...)");
                    if (!b(gVar3, g17, hVar2)) {
                        return false;
                    }
                }
            }
        } else {
            o06.j i18 = o0Var.w0().i();
            o06.g gVar4 = i18 instanceof o06.g ? (o06.g) i18 : null;
            if (gVar4 != null) {
                n16.g gVar5 = l06.o.f396421e;
                if (!l06.o.c(gVar4, l06.w.Q)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final t16.g c(f26.o0 expectedType, i16.h value, k16.g nameResolver) {
        t16.g eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expectedType, "expectedType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        java.lang.Boolean c17 = k16.f.N.c(value.f369017s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        boolean booleanValue = c17.booleanValue();
        i16.g gVar = value.f369007f;
        switch (gVar == null ? -1 : b26.f.f98963a[gVar.ordinal()]) {
            case 1:
                byte b17 = (byte) value.f369008g;
                return booleanValue ? new t16.e0(b17) : new t16.d(b17);
            case 2:
                eVar = new t16.e((char) value.f369008g);
                break;
            case 3:
                short s17 = (short) value.f369008g;
                return booleanValue ? new t16.h0(s17) : new t16.a0(s17);
            case 4:
                int i17 = (int) value.f369008g;
                return booleanValue ? new t16.f0(i17) : new t16.o(i17);
            case 5:
                long j17 = value.f369008g;
                return booleanValue ? new t16.g0(j17) : new t16.y(j17);
            case 6:
                eVar = new t16.n(value.f369009h);
                break;
            case 7:
                eVar = new t16.j(value.f369010i);
                break;
            case 8:
                eVar = new t16.c(value.f369008g != 0);
                break;
            case 9:
                eVar = new t16.b0(nameResolver.mo141776x2fec8307(value.f369011m));
                break;
            case 10:
                eVar = new t16.x(b26.t0.a(nameResolver, value.f369012n), value.f369016r);
                break;
            case 11:
                eVar = new t16.k(b26.t0.a(nameResolver, value.f369012n), b26.t0.b(nameResolver, value.f369013o));
                break;
            case 12:
                i16.k kVar = value.f369014p;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(kVar, "getAnnotation(...)");
                eVar = new t16.a(a(kVar, nameResolver));
                break;
            case 13:
                java.util.List<i16.h> list = value.f369015q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getArrayElementList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (i16.h hVar : list) {
                    f26.z0 f17 = this.f98971a.h().f();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
                    arrayList.add(c(f17, hVar, nameResolver));
                }
                return new t16.d0(arrayList, expectedType);
            default:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Unsupported annotation argument type: ");
                sb6.append(value.f369007f);
                sb6.append(" (expected ");
                sb6.append(expectedType);
                sb6.append(')');
                throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        return eVar;
    }
}
