package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public abstract class h0 {
    public static final boolean a(y1.y yVar) {
        return y1.m.a(yVar.f(), y1.i0.f540260i) == null;
    }

    public static final boolean b(y1.y yVar) {
        y1.l c17;
        if (e(yVar)) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y1.m.a(yVar.f540332e, y1.i0.f540262k), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        u1.w p17 = yVar.f540334g.p();
        while (true) {
            if (p17 == null) {
                p17 = null;
                break;
            }
            y1.n d17 = y1.z.d(p17);
            y1.l c18 = d17 != null ? d17.c() : null;
            if (java.lang.Boolean.valueOf((c18 != null && c18.f540300e) && c18.d(y1.k.f540289h)).booleanValue()) {
                break;
            }
            p17 = p17.p();
        }
        if (p17 != null) {
            y1.n d18 = y1.z.d(p17);
            if (!((d18 == null || (c17 = d18.c()) == null) ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y1.m.a(c17, y1.i0.f540262k), java.lang.Boolean.TRUE))) {
                return true;
            }
        }
        return false;
    }

    public static final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.y3 c(java.util.List list, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            if (((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.y3) list.get(i18)).f92354d == i17) {
                return (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.y3) list.get(i18);
            }
        }
        return null;
    }

    public static final void d(android.graphics.Region region, y1.y yVar, java.util.Map map, y1.y yVar2) {
        y1.n nVar;
        u1.w wVar;
        u1.w wVar2 = yVar2.f540334g;
        boolean z17 = false;
        boolean z18 = (wVar2.A && wVar2.x()) ? false : true;
        boolean isEmpty = region.isEmpty();
        int i17 = yVar2.f540333f;
        if (!isEmpty || i17 == yVar.f540333f) {
            if (!z18 || yVar2.f540330c) {
                if (!yVar2.f540332e.f540300e || (nVar = y1.z.c(yVar2.f540334g)) == null) {
                    nVar = yVar2.f540328a;
                }
                boolean z19 = nVar.f505190g;
                d1.g gVar = d1.g.f307161e;
                if (z19) {
                    boolean z27 = y1.m.a(((y1.q) ((y1.o) nVar.f505188e)).f540320e, y1.k.f540283b) != null;
                    u1.c1 c1Var = nVar.f505187d;
                    if (!z27) {
                        gVar = s1.a0.b(c1Var);
                    } else if (c1Var.p0()) {
                        s1.z c17 = s1.a0.c(c1Var);
                        d1.d dVar = c1Var.f505100x;
                        if (dVar == null) {
                            dVar = new d1.d(0.0f, 0.0f, 0.0f, 0.0f);
                            c1Var.f505100x = dVar;
                        }
                        long X = c1Var.X(c1Var.g0());
                        dVar.f307152a = -d1.k.d(X);
                        dVar.f307153b = -d1.k.b(X);
                        dVar.f307154c = c1Var.y() + d1.k.d(X);
                        dVar.f307155d = c1Var.x() + d1.k.b(X);
                        while (true) {
                            if (c1Var == c17) {
                                gVar = new d1.g(dVar.f307152a, dVar.f307153b, dVar.f307154c, dVar.f307155d);
                                break;
                            }
                            c1Var.z0(dVar, false, true);
                            if (dVar.b()) {
                                break;
                            }
                            c1Var = c1Var.f505088i;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var);
                        }
                    }
                }
                android.graphics.Rect a17 = e1.t0.a(gVar);
                android.graphics.Region region2 = new android.graphics.Region();
                region2.set(a17);
                if (i17 == yVar.f540333f) {
                    i17 = -1;
                }
                if (region2.op(region, region2, android.graphics.Region.Op.INTERSECT)) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                    android.graphics.Rect bounds = region2.getBounds();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "region.bounds");
                    map.put(valueOf, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z3(yVar2, bounds));
                    java.util.List h17 = yVar2.h();
                    for (int size = h17.size() - 1; -1 < size; size--) {
                        d(region, yVar, map, (y1.y) h17.get(size));
                    }
                    region.op(a17, region, android.graphics.Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (yVar2.f540330c) {
                    y1.y g17 = yVar2.g();
                    if (g17 != null && (wVar = g17.f540334g) != null && wVar.A) {
                        z17 = true;
                    }
                    map.put(java.lang.Integer.valueOf(i17), new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z3(yVar2, e1.t0.a(z17 ? g17.d() : new d1.g(0.0f, 0.0f, 10.0f, 10.0f))));
                    return;
                }
                if (i17 == -1) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                    android.graphics.Rect bounds2 = region2.getBounds();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds2, "region.bounds");
                    map.put(valueOf2, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.z3(yVar2, bounds2));
                }
            }
        }
    }

    public static final boolean e(y1.y yVar) {
        y1.l lVar = yVar.f540332e;
        y1.o0 o0Var = y1.k.f540282a;
        return lVar.d(y1.k.f540289h);
    }
}
