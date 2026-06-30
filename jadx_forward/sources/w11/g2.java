package w11;

/* loaded from: classes12.dex */
public final class g2 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.h2 f523569d;

    public g2(w11.h2 h2Var) {
        this.f523569d = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.bj6 bj6Var;
        r45.jj6 jj6Var;
        jz5.f0 f0Var;
        r45.bj6 bj6Var2;
        boolean z17;
        java.util.LinkedList linkedList;
        w11.u uVar;
        java.util.LinkedList linkedList2;
        r45.c50 c50Var;
        java.util.LinkedList linkedList3;
        r45.c50 c50Var2;
        java.util.LinkedList linkedList4;
        java.util.LinkedList linkedList5;
        if (!gm0.j1.a() || gm0.m.r() || gm0.j1.u() == null || gm0.j1.u().c() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncServiceHandler", "processResp accready:%s hold:%s accstg:%s ", java.lang.Boolean.valueOf(gm0.j1.a()), java.lang.Boolean.valueOf(gm0.m.r()), gm0.j1.u());
            return;
        }
        int mo46127x5f00c26e = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45913x78aaedd2(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45912x5ea92b54(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45911x3d5e2fb9(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45914xc82c54d5(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45915x3d5e728f() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45916xae528ef2(), 201, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45910x71454685(), "MicroMsg.SyncServiceHandler");
        long c17 = c01.id.c();
        synchronized (this.f523569d.f523587d) {
            byte[] j17 = w11.c2.f523524a.b().j("process_data_list");
            if (j17 != null) {
                bj6Var = new r45.bj6();
                try {
                    bj6Var.mo11468x92b714fd(j17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncServiceHandler", e17, "process parse data queue 1", new java.lang.Object[0]);
                }
            } else {
                bj6Var = null;
            }
            jj6Var = (bj6Var == null || (linkedList5 = bj6Var.f452345d) == null) ? null : (r45.jj6) kz5.n0.Z(linkedList5);
        }
        if (jj6Var != null) {
            w11.h2 h2Var = this.f523569d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "ProcessSyncData syncData");
            com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1();
            a1Var.b(new w11.v(jj6Var));
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r45.ew4 ew4Var = jj6Var.f459416d;
            int size = (ew4Var == null || (c50Var2 = ew4Var.f455292e) == null || (linkedList4 = c50Var2.f452828e) == null) ? 0 : linkedList4.size();
            r45.ew4 ew4Var2 = jj6Var.f459416d;
            if (ew4Var2 != null && (c50Var = ew4Var2.f455292e) != null && (linkedList3 = c50Var.f452828e) != null) {
                int i17 = 0;
                for (java.lang.Object obj : linkedList3) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.b50 b50Var = (r45.b50) obj;
                    mm.w.h("SyncServiceHandler", b50Var);
                    mm.h hVar = mm.h.f410018a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jj6Var.f459416d);
                    java.lang.System.currentTimeMillis();
                    w11.v vVar = new w11.v(jj6Var);
                    r45.cx4 cx4Var = jj6Var.f459426q;
                    if (cx4Var == null) {
                        cx4Var = com.p314xaae8f345.mm.p642xad8b531f.x1.e();
                    }
                    if (!a1Var.d(vVar, i17, size, b50Var, false, cx4Var, 2)) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(99L, 46L, 1L, false);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "processResp Single Cmd NetSync[%s] time:%s size:%s index:%s", java.lang.Integer.valueOf(jj6Var.f459421i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
                    i17 = i18;
                }
            }
            java.lang.Integer num = null;
            a1Var.a(new w11.v(jj6Var));
            synchronized (h2Var.f523587d) {
                byte[] j18 = w11.c2.f523524a.b().j("process_data_list");
                if (j18 != null) {
                    bj6Var2 = new r45.bj6();
                    try {
                        bj6Var2.mo11468x92b714fd(j18);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncServiceHandler", e18, "process parse data queue 2", new java.lang.Object[0]);
                    }
                } else {
                    bj6Var2 = null;
                }
                r45.jj6 jj6Var2 = (bj6Var2 == null || (linkedList2 = bj6Var2.f452345d) == null) ? null : (r45.jj6) kz5.h0.C(linkedList2);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jj6Var2 != null ? jj6Var2.f459422m : null, jj6Var.f459422m)) {
                    try {
                        z17 = w11.c2.f523524a.b().H("process_data_list", bj6Var2 != null ? bj6Var2.mo14344x5f01b1f6() : null);
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncServiceHandler", e19, "process save data queue", new java.lang.Object[0]);
                        z17 = false;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("process save data queue saveResult:");
                    sb6.append(z17);
                    sb6.append(" QueueSize: ");
                    if (bj6Var2 != null && (linkedList = bj6Var2.f452345d) != null) {
                        num = java.lang.Integer.valueOf(linkedList.size());
                    }
                    sb6.append(num);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", sb6.toString());
                }
                uVar = (w11.u) h2Var.f523586c.remove(java.lang.Integer.valueOf(jj6Var.f459421i));
            }
            h2Var.c(jj6Var);
            if (jj6Var.f459423n == 1) {
                jx3.f.INSTANCE.mo68477x336bdfd8(99L, 104L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(99L, 105L, 1L, false);
            }
            ((w11.f2) h2Var.f523584a).b(jj6Var, uVar);
            int mo46128x89c4face = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45913x78aaedd2(), mo46127x5f00c26e);
            ((ku5.t0) ku5.t0.f394148d).h(new w11.g2(h2Var), w11.h2.f523583f);
            h2Var.a(jj6Var, w11.f.f523552h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "sync data process finish costTime:" + (c01.id.c() - c17) + " startPerformance:" + mo46127x5f00c26e + " stopPerformance:" + mo46128x89c4face);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncServiceHandler", "no sync data process");
        }
    }
}
