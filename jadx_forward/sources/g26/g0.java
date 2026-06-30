package g26;

/* loaded from: classes16.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g26.g0 f349525a = new g26.g0();

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:1: B:7:0x0026->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection a(java.util.Collection r7, yz5.p r8) {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.Iterator r7 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r1)
        Le:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r7.next()
            f26.z0 r1 = (f26.z0) r1
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L22
            goto L4d
        L22:
            java.util.Iterator r2 = r0.iterator()
        L26:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r2.next()
            f26.z0 r4 = (f26.z0) r4
            r5 = 1
            if (r4 == r1) goto L49
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            java.lang.Object r4 = r8.mo149xb9724478(r4, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L49
            r4 = r5
            goto L4a
        L49:
            r4 = r3
        L4a:
            if (r4 == 0) goto L26
            r3 = r5
        L4d:
            if (r3 == 0) goto Le
            r7.remove()
            goto Le
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g26.g0.a(java.util.Collection, yz5.p):java.util.Collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [g26.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [f26.r1] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [l26.g, java.lang.Object, f26.r1, l26.b] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [f26.z0, java.lang.Object, f26.o0] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20, types: [f26.z0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Set] */
    public final f26.z0 b(java.util.List types) {
        f26.z0 z0Var;
        f26.z0 b17;
        f26.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        types.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = types.iterator();
        while (it.hasNext()) {
            f26.z0 z0Var2 = (f26.z0) it.next();
            if (z0Var2.w0() instanceof f26.n0) {
                java.util.Collection a17 = z0Var2.w0().a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSupertypes(...)");
                java.util.Collection<f26.o0> collection = a17;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(collection, 10));
                for (f26.o0 o0Var : collection) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
                    f26.z0 d17 = f26.h0.d(o0Var);
                    if (z0Var2.x0()) {
                        d17 = d17.A0(true);
                    }
                    arrayList2.add(d17);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(z0Var2);
            }
        }
        g26.d0 d0Var = g26.d0.f349519d;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            d0Var = d0Var.a((f26.c3) it6.next());
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            f26.z0 z0Var3 = (f26.z0) it7.next();
            if (d0Var == g26.d0.f349522g) {
                if (z0Var3 instanceof g26.n) {
                    g26.n nVar = (g26.n) z0Var3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
                    z0Var3 = new g26.n(nVar.f349529e, nVar.f349530f, nVar.f349531g, nVar.f349532h, nVar.f349533i, true);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z0Var3, "<this>");
                f26.z0 a18 = f26.u.a(f26.v.f340760g, z0Var3, false, false, 4, null);
                z0Var3 = (a18 == null && (a18 = f26.d1.b(z0Var3)) == null) ? z0Var3.A0(false) : a18;
            }
            linkedHashSet.add(z0Var3);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(types, 10));
        java.util.Iterator it8 = types.iterator();
        while (it8.hasNext()) {
            arrayList3.add(((f26.z0) it8.next()).v0());
        }
        java.util.Iterator it9 = arrayList3.iterator();
        if (!it9.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it9.next();
        while (true) {
            z0Var = null;
            if (!it9.hasNext()) {
                break;
            }
            f26.r1 other = (f26.r1) it9.next();
            next = (f26.r1) next;
            next.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
            if (!next.m144937x7aab3243() || !other.m144937x7aab3243()) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                f26.q1 q1Var = f26.r1.f340747e;
                java.util.Collection values = q1Var.f396802a.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Iterator it10 = values.iterator();
                while (it10.hasNext()) {
                    int intValue = ((java.lang.Number) it10.next()).intValue();
                    f26.o1 o1Var = (f26.o1) next.f396760d.get(intValue);
                    f26.o1 o1Var2 = (f26.o1) other.f396760d.get(intValue);
                    if (o1Var == null) {
                        if (o1Var2 != null) {
                            oVar = (f26.o) o1Var2;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((f26.o) o1Var, oVar)) {
                            }
                        }
                        oVar = null;
                    } else {
                        f26.o oVar2 = (f26.o) o1Var;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((f26.o) o1Var2, oVar2)) {
                            oVar = oVar2;
                        }
                        oVar = null;
                    }
                    o26.a.a(arrayList4, oVar);
                }
                next = q1Var.b(arrayList4);
            }
        }
        f26.r1 r1Var = (f26.r1) next;
        if (linkedHashSet.size() == 1) {
            b17 = (f26.z0) kz5.n0.y0(linkedHashSet);
        } else {
            java.util.Collection a19 = a(linkedHashSet, new g26.e0(this));
            java.util.ArrayList arrayList5 = (java.util.ArrayList) a19;
            arrayList5.isEmpty();
            t16.p[] pVarArr = t16.p.f496152d;
            if (!arrayList5.isEmpty()) {
                java.util.Iterator it11 = arrayList5.iterator();
                if (!it11.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                f26.z0 next2 = it11.next();
                while (it11.hasNext()) {
                    f26.z0 z0Var4 = (f26.z0) it11.next();
                    next2 = next2;
                    if (next2 != 0 && z0Var4 != null) {
                        f26.c2 w07 = next2.w0();
                        f26.c2 w08 = z0Var4.w0();
                        boolean z17 = w07 instanceof t16.s;
                        if (z17 && (w08 instanceof t16.s)) {
                            t16.s sVar = (t16.s) w07;
                            t16.s sVar2 = new t16.s(sVar.f496155a, sVar.f496156b, kz5.n0.Y0(sVar.f496157c, ((t16.s) w08).f496157c), null);
                            f26.r1.f340747e.getClass();
                            next2 = f26.r0.b(f26.r1.f340748f, sVar2, false);
                        } else if (z17) {
                            if (((t16.s) w07).f496157c.contains(z0Var4)) {
                                next2 = z0Var4;
                            }
                        } else if ((w08 instanceof t16.s) && ((t16.s) w08).f496157c.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                z0Var = next2;
            }
            if (z0Var != null) {
                b17 = z0Var;
            } else {
                g26.u.f349547b.getClass();
                java.util.Collection a27 = a(a19, new g26.f0(g26.t.f349546b));
                java.util.ArrayList arrayList6 = (java.util.ArrayList) a27;
                arrayList6.isEmpty();
                b17 = arrayList6.size() < 2 ? (f26.z0) kz5.n0.y0(a27) : new f26.n0(linkedHashSet).b();
            }
        }
        return b17.C0(r1Var);
    }
}
