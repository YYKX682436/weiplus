package db2;

/* loaded from: classes2.dex */
public final class e1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final db2.d1 f309485t;

    /* renamed from: u, reason: collision with root package name */
    public final int f309486u;

    /* renamed from: v, reason: collision with root package name */
    public final db2.v3 f309487v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, db2.d1 callback, int i17, db2.v3 v3Var, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f309485t = callback;
        this.f309486u = i17;
        this.f309487v = v3Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 375;
        r45.y81 y81Var = new r45.y81();
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        y81Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        y81Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        y81Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f309704a;
        y81Var.set(1, t4Var.a(375));
        y81Var.set(5, t4Var.n());
        lVar.f152197a = y81Var;
        lVar.f152198b = new r45.z81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetnearbylist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetNearbyList", "CgiFinderGetNearbyList lat.lng:" + y81Var.m75938x746dc8a6(4) + ", " + y81Var.m75938x746dc8a6(3) + ' ' + i17 + ' ' + gVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a, 2, i17, qt2Var, 10L, false, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        ?? r27;
        r45.z81 resp = (r45.z81) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        int i27 = 2;
        v1Var.h(2, false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] pullType=");
        int i28 = this.f309486u;
        sb6.append(i28);
        sb6.append(" errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetNearbyList", sb6.toString());
        db2.v3 v3Var = this.f309487v;
        if (v3Var != null && v3Var.a(i17, i18, str, resp)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CgiFinderGetNearbyList", "has consume.");
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<r45.gk2> m75941xfb821914 = resp.m75941xfb821914(1);
            if (m75941xfb821914 != null) {
                for (r45.gk2 gk2Var : m75941xfb821914) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[onCgiBack] pullType=");
                    sb7.append(i28);
                    sb7.append(" type:");
                    r45.xu2 xu2Var = (r45.xu2) gk2Var.m75936x14adae67(0);
                    sb7.append(xu2Var != null ? java.lang.Integer.valueOf(xu2Var.m75939xb282bd08(8)) : null);
                    sb7.append(" t:");
                    r45.xu2 xu2Var2 = (r45.xu2) gk2Var.m75936x14adae67(0);
                    sb7.append(xu2Var2 != null ? xu2Var2.m75945x2fec8307(0) : null);
                    sb7.append(" desc:");
                    r45.xu2 xu2Var3 = (r45.xu2) gk2Var.m75936x14adae67(0);
                    sb7.append(xu2Var3 != null ? xu2Var3.m75945x2fec8307(2) : null);
                    sb7.append(' ');
                    sb7.append(hc2.o0.k(gk2Var.m75941xfb821914(1)));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetNearbyList", sb7.toString());
                    i27 = 2;
                }
            }
            i19 = i27;
        } else {
            i19 = 2;
            v1Var.w(2, this.f97668n);
        }
        eb2.x xVar = (eb2.x) this.f309485t;
        xVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2 n2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.n2(i17, i18, str);
        if (i17 == 0 && i18 == 0) {
            eb2.b0 b0Var = xVar.f332394a;
            b0Var.f332250i.f332391b = resp.m75934xbce7f2f(i19);
            java.util.LinkedList<r45.gk2> m75941xfb8219142 = resp.m75941xfb821914(1);
            if (m75941xfb8219142 != null) {
                r27 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                for (r45.gk2 gk2Var2 : m75941xfb8219142) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.im imVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.im.f188579a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gk2Var2);
                    r27.add(imVar.a(gk2Var2));
                }
            } else {
                r27 = kz5.p0.f395529d;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.a(b0Var.f332248g, r27.size());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("incrementList size: ");
            java.util.List m56409x97891cf7 = n2Var.m56409x97891cf7();
            sb8.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsFeedFetcher", sb8.toString());
            n2Var.m56420x2a5f836b(r27);
            n2Var.m56423xd4b4a5a1(i28);
            n2Var.m56421x73095078(resp.m75934xbce7f2f(2));
            n2Var.m56419xdac5ee4d(resp.m75939xb282bd08(3) == 1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p2) xVar.f332395b).a(n2Var);
        } else {
            n2Var.m56419xdac5ee4d(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetNearbyList", "[onCgiBack] Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
    }

    @Override // az2.j, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a, 2, true, null, false, 0L, false, 60, null);
        return super.l();
    }
}
