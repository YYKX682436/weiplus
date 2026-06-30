package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class eh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah f280505e;

    public eh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah ahVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f280505e = ahVar;
        this.f280504d = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah ahVar = this.f280505e;
        ahVar.m0(this.f280504d, ahVar.f280113d.x());
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) this.f280505e.f280113d.f542241c.a(sb5.k0.class))).s0()) {
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) this.f280505e.f280113d.f542241c.a(sb5.k0.class))).q0(this.f280504d.m124847x74d37ac6())) {
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) this.f280505e.f280113d.f542241c.a(sb5.k0.class))).n0(this.f280504d.m124847x74d37ac6()) >= 0) {
                    java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) this.f280505e.f280113d.f542241c.a(sb5.k0.class))).o0(this.f280504d.m124847x74d37ac6())).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                        c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
                    }
                }
            }
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) ((sb5.g0) this.f280505e.f280113d.f542241c.a(sb5.g0.class))).u0() && te5.s1.f500280a.a()) {
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(com.p314xaae8f345.mm.p2621x8fb0427b.na.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(com.p314xaae8f345.mm.p2621x8fb0427b.na.class);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.ma maVar = (com.p314xaae8f345.mm.p2621x8fb0427b.ma) ((com.p314xaae8f345.mm.p2621x8fb0427b.na) a17).P6(com.p314xaae8f345.mm.p2621x8fb0427b.ma.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = this.f280504d;
            com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = f9Var2.f275460g2;
            if (a9Var instanceof com.p314xaae8f345.mm.p2621x8fb0427b.oa) {
                long j17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.oa) a9Var).f66276x861009b5;
                long m124847x74d37ac6 = f9Var2.m124847x74d37ac6();
                java.lang.String Q0 = this.f280504d.Q0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "deleteGroupItem groupId " + j17 + " msgId " + m124847x74d37ac6 + " talker " + Q0);
                p75.n0 n0Var = dm.da.f317956n;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                linkedList.add(dm.da.f317957o);
                p75.m0 i18 = dm.da.f317958p.i(java.lang.Long.valueOf(j17));
                p75.i0 g17 = dm.da.f317956n.g(linkedList);
                g17.f434190d = i18;
                g17.f434192f = linkedList2;
                g17.f434193g = linkedList3;
                p75.l0 a18 = g17.a();
                n75.b bVar = maVar.f274680g;
                java.util.List j18 = a18.j(bVar.Q4());
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) j18;
                    if (i19 >= arrayList.size()) {
                        break;
                    }
                    long longValue = ((java.lang.Long) arrayList.get(i19)).longValue();
                    if (longValue != m124847x74d37ac6) {
                        c01.w9.f(longValue, Q0);
                    }
                    i19++;
                }
                p75.m0 i27 = dm.da.f317958p.i(java.lang.Long.valueOf(j17));
                p75.n0 n0Var2 = dm.da.f317956n;
                n0Var2.getClass();
                if (n0Var2 instanceof p75.z) {
                    throw new java.lang.IllegalArgumentException("Not support multi table delete");
                }
                java.lang.String table = n0Var2.f434209a;
                p75.h hVar = (p75.h) i27;
                java.lang.String b17 = hVar.b();
                java.lang.String[] e17 = hVar.e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
                l75.k0 Q4 = bVar.Q4();
                if (Q4 != null) {
                    Q4.mo70514xb06685ab(table, b17, e17);
                    return;
                }
                return;
            }
            long m124847x74d37ac62 = f9Var2.m124847x74d37ac6();
            p75.n0 n0Var3 = dm.da.f317956n;
            p75.i0 i28 = n0Var3.i();
            p75.d dVar = dm.da.f317957o;
            i28.f434190d = dVar.i(java.lang.Long.valueOf(m124847x74d37ac62));
            i28.f434189c = "MicroMsg.SDK.BaseServiceNotifyAggregationMsg";
            p75.l0 a19 = i28.a();
            n75.b bVar2 = maVar.f274680g;
            com.p314xaae8f345.mm.p2621x8fb0427b.oa oaVar = (com.p314xaae8f345.mm.p2621x8fb0427b.oa) a19.o(bVar2.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.oa.class);
            if (oaVar == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "deleteSingleItem:" + oaVar.f66277x297eb4f7 + " foldCount: " + oaVar.f66275xb82ed889);
            p75.m0 i29 = dVar.i(java.lang.Long.valueOf(oaVar.f66277x297eb4f7));
            if (n0Var3 instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            java.lang.String table2 = n0Var3.f434209a;
            p75.h hVar2 = (p75.h) i29;
            java.lang.String b18 = hVar2.b();
            java.lang.String[] e18 = hVar2.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table2, "table");
            l75.k0 Q42 = bVar2.Q4();
            if (Q42 != null) {
                Q42.mo70514xb06685ab(table2, b18, e18);
            }
            if (!((oaVar.f66278xe7ccd9b4 & 1) == 1)) {
                java.util.LinkedList linkedList4 = new java.util.LinkedList();
                java.util.LinkedList linkedList5 = new java.util.LinkedList();
                java.util.LinkedList linkedList6 = new java.util.LinkedList();
                p75.m c17 = dm.da.f317958p.i(java.lang.Long.valueOf(oaVar.f66276x861009b5)).c(dm.da.f317959q.g(1, 1));
                p75.i0 g18 = n0Var3.g(linkedList4);
                g18.f434190d = c17;
                g18.f434192f = linkedList5;
                g18.f434193g = linkedList6;
                com.p314xaae8f345.mm.p2621x8fb0427b.oa oaVar2 = (com.p314xaae8f345.mm.p2621x8fb0427b.oa) g18.a().o(bVar2.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.oa.class);
                if (oaVar2 != null) {
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("foldCount", java.lang.Integer.valueOf(oaVar2.f66275xb82ed889 - 1));
                    contentValues.put("clusterNote", maVar.a7(oaVar2.f66274x27b20147, oaVar.f66280xae82c0e));
                    p75.m0 i37 = dVar.i(java.lang.Long.valueOf(oaVar2.f66277x297eb4f7));
                    p75.h1 j19 = n0Var3.j(contentValues);
                    j19.f434184c = i37;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "deleteSingleItem: update header" + j19.a().f(bVar2.Q4()) + " foldCount: " + oaVar2.f66275xb82ed889 + " head msgId: " + oaVar2.f66277x297eb4f7);
                    return;
                }
                return;
            }
            if (oaVar.f66275xb82ed889 < 2) {
                return;
            }
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            java.util.LinkedList linkedList8 = new java.util.LinkedList();
            java.util.LinkedList linkedList9 = new java.util.LinkedList();
            p75.m c18 = dm.da.f317958p.i(java.lang.Long.valueOf(oaVar.f66276x861009b5)).c(dVar.x(java.lang.Long.valueOf(oaVar.f66277x297eb4f7)));
            linkedList8.add(dVar.u());
            p75.i0 g19 = n0Var3.g(linkedList7);
            g19.f434190d = c18;
            g19.f434192f = linkedList8;
            g19.f434193g = linkedList9;
            g19.c(1, 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.oa oaVar3 = (com.p314xaae8f345.mm.p2621x8fb0427b.oa) g19.a().o(bVar2.Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.oa.class);
            if (oaVar3 != null) {
                android.content.ContentValues contentValues2 = new android.content.ContentValues();
                contentValues2.put("foldCount", java.lang.Integer.valueOf(oaVar.f66275xb82ed889 - 1));
                contentValues2.put("showStatus", java.lang.Integer.valueOf(oaVar.f66278xe7ccd9b4));
                contentValues2.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, oaVar.f66279x29dd02d3);
                contentValues2.put("clusterNote", maVar.a7(oaVar.f66274x27b20147, oaVar3.f66280xae82c0e));
                p75.m0 i38 = dVar.i(java.lang.Long.valueOf(oaVar3.f66277x297eb4f7));
                p75.h1 j27 = n0Var3.j(contentValues2);
                j27.f434184c = i38;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ServiceNotifyAggregationMsgStorage", "deleteSingleItem: update new header" + j27.a().f(bVar2.Q4()) + " msgId: " + oaVar3.f66277x297eb4f7);
            }
        }
    }
}
