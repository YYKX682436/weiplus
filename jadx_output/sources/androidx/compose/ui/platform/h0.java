package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class h0 {
    public static final boolean a(y1.y yVar) {
        return y1.m.a(yVar.f(), y1.i0.f458727i) == null;
    }

    public static final boolean b(y1.y yVar) {
        y1.l c17;
        if (e(yVar)) {
            if (!kotlin.jvm.internal.o.b(y1.m.a(yVar.f458799e, y1.i0.f458729k), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        u1.w p17 = yVar.f458801g.p();
        while (true) {
            if (p17 == null) {
                p17 = null;
                break;
            }
            y1.n d17 = y1.z.d(p17);
            y1.l c18 = d17 != null ? d17.c() : null;
            if (java.lang.Boolean.valueOf((c18 != null && c18.f458767e) && c18.d(y1.k.f458756h)).booleanValue()) {
                break;
            }
            p17 = p17.p();
        }
        if (p17 != null) {
            y1.n d18 = y1.z.d(p17);
            if (!((d18 == null || (c17 = d18.c()) == null) ? false : kotlin.jvm.internal.o.b(y1.m.a(c17, y1.i0.f458729k), java.lang.Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.compose.ui.platform.y3 c(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "<this>");
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            if (((androidx.compose.ui.platform.y3) list.get(i18)).f10821d == i17) {
                return (androidx.compose.ui.platform.y3) list.get(i18);
            }
        }
        return null;
    }

    public static final void d(android.graphics.Region region, y1.y yVar, java.util.Map map, y1.y yVar2) {
        y1.n nVar;
        u1.w wVar;
        u1.w wVar2 = yVar2.f458801g;
        boolean z17 = false;
        boolean z18 = (wVar2.A && wVar2.x()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i17 = yVar2.f458800f;
        if (!isEmpty || i17 == yVar.f458800f) {
            if (!z18 || yVar2.f458797c) {
                if (!yVar2.f458799e.f458767e || (nVar = y1.z.c(yVar2.f458801g)) == null) {
                    nVar = yVar2.f458795a;
                }
                boolean z19 = nVar.f423657g;
                d1.g gVar = d1.g.f225628e;
                if (z19) {
                    boolean z27 = y1.m.a(((y1.q) ((y1.o) nVar.f423655e)).f458787e, y1.k.f458750b) != null;
                    u1.c1 c1Var = nVar.f423654d;
                    if (!z27) {
                        gVar = s1.a0.b(c1Var);
                    } else if (c1Var.p0()) {
                        s1.z c17 = s1.a0.c(c1Var);
                        d1.d dVar = c1Var.f423567x;
                        if (dVar == null) {
                            dVar = new d1.d(0.0f, 0.0f, 0.0f, 0.0f);
                            c1Var.f423567x = dVar;
                        }
                        long X = c1Var.X(c1Var.g0());
                        dVar.f225619a = -d1.k.d(X);
                        dVar.f225620b = -d1.k.b(X);
                        dVar.f225621c = c1Var.y() + d1.k.d(X);
                        dVar.f225622d = c1Var.x() + d1.k.b(X);
                        while (true) {
                            if (c1Var == c17) {
                                gVar = new d1.g(dVar.f225619a, dVar.f225620b, dVar.f225621c, dVar.f225622d);
                                break;
                            }
                            c1Var.z0(dVar, false, true);
                            if (dVar.b()) {
                                break;
                            }
                            c1Var = c1Var.f423555i;
                            kotlin.jvm.internal.o.d(c1Var);
                        }
                    }
                }
                android.graphics.Rect a17 = e1.t0.a(gVar);
                android.graphics.Region region2 = new android.graphics.Region();
                region2.set(a17);
                if (i17 == yVar.f458800f) {
                    i17 = -1;
                }
                if (region2.op(region, region2, android.graphics.Region.Op.INTERSECT)) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    android.graphics.Rect bounds = region2.getBounds();
                    kotlin.jvm.internal.o.f(bounds, "region.bounds");
                    map.put(valueOf, new androidx.compose.ui.platform.z3(yVar2, bounds));
                    java.util.List h17 = yVar2.h();
                    for (int size = h17.size() - 1; -1 < size; size--) {
                        d(region, yVar, map, (y1.y) h17.get(size));
                    }
                    region.op(a17, region, android.graphics.Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (yVar2.f458797c) {
                    y1.y g17 = yVar2.g();
                    if (g17 != null && (wVar = g17.f458801g) != null && wVar.A) {
                        z17 = true;
                    }
                    map.put(java.lang.Integer.valueOf(i17), new androidx.compose.ui.platform.z3(yVar2, e1.t0.a(z17 ? g17.d() : new d1.g(0.0f, 0.0f, 10.0f, 10.0f))));
                    return;
                }
                if (i17 == -1) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                    android.graphics.Rect bounds2 = region2.getBounds();
                    kotlin.jvm.internal.o.f(bounds2, "region.bounds");
                    map.put(valueOf2, new androidx.compose.ui.platform.z3(yVar2, bounds2));
                }
            }
        }
    }

    public static final boolean e(y1.y yVar) {
        y1.l lVar = yVar.f458799e;
        y1.o0 o0Var = y1.k.f458749a;
        return lVar.d(y1.k.f458756h);
    }
}
