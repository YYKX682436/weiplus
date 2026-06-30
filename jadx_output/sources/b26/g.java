package b26;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final o06.v0 f17438a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.c1 f17439b;

    public g(o06.v0 module, o06.c1 notFoundClasses) {
        kotlin.jvm.internal.o.g(module, "module");
        kotlin.jvm.internal.o.g(notFoundClasses, "notFoundClasses");
        this.f17438a = module;
        this.f17439b = notFoundClasses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [jz5.l] */
    public final p06.c a(i16.k proto, k16.g nameResolver) {
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        o06.g c17 = o06.l0.c(this.f17438a, b26.t0.a(nameResolver, proto.f287557f), this.f17439b);
        java.util.Map map = kz5.q0.f314001d;
        if (proto.f287558g.size() != 0 && !h26.m.f(c17)) {
            int i17 = r16.i.f368658a;
            if (r16.i.o(c17, o06.h.f341964h)) {
                java.util.Collection S = c17.S();
                kotlin.jvm.internal.o.f(S, "getConstructors(...)");
                o06.p pVar = (o06.f) kz5.n0.A0(S);
                if (pVar != null) {
                    java.util.List W = ((r06.j0) pVar).W();
                    kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
                    int d17 = kz5.b1.d(kz5.d0.q(W, 10));
                    if (d17 < 16) {
                        d17 = 16;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                    for (java.lang.Object obj : W) {
                        linkedHashMap.put(((r06.v) ((o06.l2) obj)).getName(), obj);
                    }
                    java.util.List<i16.i> list = proto.f287558g;
                    kotlin.jvm.internal.o.f(list, "getArgumentList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (i16.i iVar : list) {
                        kotlin.jvm.internal.o.d(iVar);
                        o06.p pVar2 = (o06.l2) linkedHashMap.get(b26.t0.b(nameResolver, iVar.f287497f));
                        if (pVar2 != null) {
                            n16.g b17 = b26.t0.b(nameResolver, iVar.f287497f);
                            f26.o0 type = ((r06.t1) pVar2).getType();
                            kotlin.jvm.internal.o.f(type, "getType(...)");
                            i16.h hVar = iVar.f287498g;
                            kotlin.jvm.internal.o.f(hVar, "getValue(...)");
                            t16.g c18 = c(type, hVar, nameResolver);
                            r5 = b(c18, type, hVar) ? c18 : null;
                            if (r5 == null) {
                                java.lang.String message = "Unexpected argument value: actual type " + hVar.f287474f + " != expected type " + type;
                                kotlin.jvm.internal.o.g(message, "message");
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
        return new p06.d(c17.k(), map, o06.x1.f342004a);
    }

    public final boolean b(t16.g gVar, f26.o0 o0Var, i16.h hVar) {
        i16.g gVar2 = hVar.f287474f;
        int i17 = gVar2 == null ? -1 : b26.f.f17430a[gVar2.ordinal()];
        if (i17 != 10) {
            o06.v0 v0Var = this.f17438a;
            if (i17 != 13) {
                return kotlin.jvm.internal.o.b(gVar.a(v0Var), o0Var);
            }
            if (!((gVar instanceof t16.b) && ((java.util.List) ((t16.b) gVar).f414613a).size() == hVar.f287482q.size())) {
                throw new java.lang.IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            f26.o0 g17 = v0Var.h().g(o0Var);
            kotlin.jvm.internal.o.f(g17, "getArrayElementType(...)");
            t16.b bVar = (t16.b) gVar;
            java.lang.Iterable g18 = kz5.c0.g((java.util.Collection) bVar.f414613a);
            if (!(g18 instanceof java.util.Collection) || !((java.util.Collection) g18).isEmpty()) {
                kz5.x0 it = g18.iterator();
                while (((e06.j) it).f246214f) {
                    int b17 = it.b();
                    t16.g gVar3 = (t16.g) ((java.util.List) bVar.f414613a).get(b17);
                    i16.h hVar2 = (i16.h) hVar.f287482q.get(b17);
                    kotlin.jvm.internal.o.f(hVar2, "getArrayElement(...)");
                    if (!b(gVar3, g17, hVar2)) {
                        return false;
                    }
                }
            }
        } else {
            o06.j i18 = o0Var.w0().i();
            o06.g gVar4 = i18 instanceof o06.g ? (o06.g) i18 : null;
            if (gVar4 != null) {
                n16.g gVar5 = l06.o.f314888e;
                if (!l06.o.c(gVar4, l06.w.Q)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final t16.g c(f26.o0 expectedType, i16.h value, k16.g nameResolver) {
        t16.g eVar;
        kotlin.jvm.internal.o.g(expectedType, "expectedType");
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        java.lang.Boolean c17 = k16.f.N.c(value.f287484s);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        boolean booleanValue = c17.booleanValue();
        i16.g gVar = value.f287474f;
        switch (gVar == null ? -1 : b26.f.f17430a[gVar.ordinal()]) {
            case 1:
                byte b17 = (byte) value.f287475g;
                return booleanValue ? new t16.e0(b17) : new t16.d(b17);
            case 2:
                eVar = new t16.e((char) value.f287475g);
                break;
            case 3:
                short s17 = (short) value.f287475g;
                return booleanValue ? new t16.h0(s17) : new t16.a0(s17);
            case 4:
                int i17 = (int) value.f287475g;
                return booleanValue ? new t16.f0(i17) : new t16.o(i17);
            case 5:
                long j17 = value.f287475g;
                return booleanValue ? new t16.g0(j17) : new t16.y(j17);
            case 6:
                eVar = new t16.n(value.f287476h);
                break;
            case 7:
                eVar = new t16.j(value.f287477i);
                break;
            case 8:
                eVar = new t16.c(value.f287475g != 0);
                break;
            case 9:
                eVar = new t16.b0(nameResolver.getString(value.f287478m));
                break;
            case 10:
                eVar = new t16.x(b26.t0.a(nameResolver, value.f287479n), value.f287483r);
                break;
            case 11:
                eVar = new t16.k(b26.t0.a(nameResolver, value.f287479n), b26.t0.b(nameResolver, value.f287480o));
                break;
            case 12:
                i16.k kVar = value.f287481p;
                kotlin.jvm.internal.o.f(kVar, "getAnnotation(...)");
                eVar = new t16.a(a(kVar, nameResolver));
                break;
            case 13:
                java.util.List<i16.h> list = value.f287482q;
                kotlin.jvm.internal.o.f(list, "getArrayElementList(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (i16.h hVar : list) {
                    f26.z0 f17 = this.f17438a.h().f();
                    kotlin.jvm.internal.o.d(hVar);
                    arrayList.add(c(f17, hVar, nameResolver));
                }
                return new t16.d0(arrayList, expectedType);
            default:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Unsupported annotation argument type: ");
                sb6.append(value.f287474f);
                sb6.append(" (expected ");
                sb6.append(expectedType);
                sb6.append(')');
                throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        return eVar;
    }
}
