package vn2;

/* loaded from: classes2.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static java.lang.Object b(vn2.k kVar, java.lang.String str, r45.l03 l03Var, im5.c cVar, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        long j18 = (i17 & 8) != 0 ? 0L : j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = (i17 & 16) != 0 ? null : jbVar;
        kVar.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        vn2.u0 u0Var = vn2.u0.f519920a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchImpl （lifeCycleKeeper=");
        sb6.append(cVar);
        sb6.append(") id=");
        r45.kv0 kv0Var = (r45.kv0) l03Var.m75936x14adae67(1);
        sb6.append(kv0Var != null ? new java.lang.Long(kv0Var.m75942xfb822ef2(5)) : null);
        sb6.append(",tabTYpe=");
        sb6.append(l03Var.m75939xb282bd08(10));
        sb6.append(", pullType=");
        sb6.append(l03Var.m75939xb282bd08(5));
        sb6.append(",reddot objectId=");
        sb6.append(pm0.v.u(l03Var.m75942xfb822ef2(7)));
        sb6.append("(bypass null=");
        sb6.append(l03Var.m75934xbce7f2f(8) == null);
        sb6.append("),delayLoading=");
        sb6.append(j18);
        u0Var.m(str, sb6.toString());
        az2.j jVar = (az2.j) l03Var.d();
        if (j18 > 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            az2.j.u(jVar, context, null, j18, 2, null);
        }
        pq5.g l17 = jVar.l();
        if (cVar != null) {
            l17.f(cVar);
        }
        l17.K(new vn2.j(str, l03Var, nVar, jbVar2));
        java.lang.Object j19 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j19;
    }

    public static /* synthetic */ r45.l03 d(vn2.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18, r45.hn6 hn6Var, int i19, java.lang.Object obj) {
        if ((i19 & 32) != 0) {
            hn6Var = null;
        }
        return kVar.c(jbVar, qt2Var, gVar, i17, i18, hn6Var);
    }

    public final int a(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 9;
                if (i17 != 9) {
                    return i17;
                }
            }
        }
        return i18;
    }

    public final r45.l03 c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.qt2 qt2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18, r45.hn6 hn6Var) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = null;
        if (i17 != 28) {
            boolean z17 = false;
            if (!(jbVar != null && jbVar.m55856xfb85f7b0() == 400000) || i17 != 23) {
                if (jbVar != null && jbVar.m55856xfb85f7b0() == 400001) {
                    z17 = true;
                }
                if (!z17 || i17 != 24) {
                    jbVar = null;
                }
            }
        }
        r45.l03 l03Var = new r45.l03();
        db2.t4 t4Var = db2.t4.f309704a;
        l03Var.set(1, t4Var.b(7017, qt2Var));
        l03Var.set(2, gVar);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        l03Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        l03Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        l03Var.set(5, java.lang.Integer.valueOf(i18));
        l03Var.set(6, t4Var.n());
        l03Var.set(7, java.lang.Long.valueOf((jbVar == null || (xs2Var2 = jbVar.N) == null) ? 0L : xs2Var2.m75942xfb822ef2(3)));
        if (jbVar != null && (xs2Var = jbVar.N) != null) {
            gVar2 = xs2Var.m75934xbce7f2f(7);
        }
        l03Var.set(8, gVar2);
        l03Var.set(9, java.lang.Long.valueOf(c01.id.c()));
        l03Var.set(10, java.lang.Integer.valueOf(i17));
        l03Var.set(11, hn6Var);
        return l03Var;
    }
}
