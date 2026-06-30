package x63;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f533799a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f533800b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f533801c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f533802d = new java.util.concurrent.ConcurrentHashMap();

    public void a(long j17, y63.a aVar, y63.a aVar2, boolean z17, int i17) {
        if (j17 < 0 || aVar == null) {
            return;
        }
        this.f533799a.put(java.lang.Long.valueOf(j17), new android.util.Pair(aVar.f66142xdec927b, aVar.f66138x4b6e619a));
        this.f533800b.put(java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
        this.f533802d.put(java.lang.Long.valueOf(j17), new x63.o(this, aVar, aVar2, i17));
    }

    public void b(y63.a aVar, java.lang.String str, java.lang.String str2) {
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() groupSolitatire == null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str2, aVar.f66137xae937411);
        if (aVar.f66140xd09be28e == 0) {
            aVar.f66140xd09be28e = Li.I0();
            ((t63.e) i95.n0.c(t63.e.class)).Bi().W0(aVar, true);
        }
        c(aVar, true, str, aVar.f66140xd09be28e);
    }

    public final void c(y63.a aVar, boolean z17, java.lang.String str, long j17) {
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() MsgSvrId==0 key:%s", aVar.f66138x4b6e619a);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireReportManager", "reportSolitaireActive() MsgSvrId==%s key:%s", java.lang.Long.valueOf(j17), aVar.f66138x4b6e619a);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6917xd5eb8f11 c6917xd5eb8f11 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6917xd5eb8f11();
        c6917xd5eb8f11.f142362l = c6917xd5eb8f11.b("Identifier", aVar.f66138x4b6e619a, true);
        c6917xd5eb8f11.f142354d = c6917xd5eb8f11.b("ChatName", aVar.f66142xdec927b, true);
        c6917xd5eb8f11.f142355e = c6917xd5eb8f11.b("LaunchUserName", aVar.f66136xb1e12de7, true);
        if (z17) {
            c6917xd5eb8f11.f142356f = c6917xd5eb8f11.b("MsgUserName", str, true);
        } else {
            c6917xd5eb8f11.f142356f = c6917xd5eb8f11.b("MsgUserName", aVar.f66136xb1e12de7, true);
        }
        c6917xd5eb8f11.f142357g = j17;
        if (aVar.L == 1) {
            c6917xd5eb8f11.f142358h = aVar.H.length();
        }
        c6917xd5eb8f11.f142359i = aVar.f541184J.length();
        c6917xd5eb8f11.f142360j = aVar.I.length();
        if (z17) {
            c6917xd5eb8f11.f142361k = 1L;
        } else {
            c6917xd5eb8f11.f142361k = 2L;
        }
        c6917xd5eb8f11.k();
    }

    public void d(y63.a aVar, int i17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6918xe10c1cfb c6918xe10c1cfb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6918xe10c1cfb();
        c6918xe10c1cfb.f142367h = c6918xe10c1cfb.b("Identifier", aVar.f66138x4b6e619a, true);
        c6918xe10c1cfb.f142363d = c6918xe10c1cfb.b("ChatName", aVar.f66142xdec927b, true);
        c6918xe10c1cfb.f142364e = aVar.f66140xd09be28e;
        c6918xe10c1cfb.f142365f = i17;
        c6918xe10c1cfb.f142366g = i18;
        c6918xe10c1cfb.k();
    }

    public void e(java.util.List list, int i17) {
        if (list == null && list.size() == 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f((y63.a) it.next(), i17);
        }
    }

    public void f(y63.a aVar, int i17) {
        if (aVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6919x2f4ee44e c6919x2f4ee44e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6919x2f4ee44e();
        c6919x2f4ee44e.f142372h = c6919x2f4ee44e.b("Identifier", aVar.f66138x4b6e619a, true);
        c6919x2f4ee44e.f142368d = c6919x2f4ee44e.b("ChatName", aVar.f66142xdec927b, true);
        c6919x2f4ee44e.f142369e = c6919x2f4ee44e.b("LaunchUserName", aVar.f66136xb1e12de7, true);
        c6919x2f4ee44e.f142370f = aVar.f66140xd09be28e;
        c6919x2f4ee44e.f142371g = i17;
        c6919x2f4ee44e.k();
    }

    public void g(y63.a aVar, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6920x30febe4 c6920x30febe4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6920x30febe4();
        c6920x30febe4.f142378i = c6920x30febe4.b("Identifier", aVar.f66138x4b6e619a, true);
        c6920x30febe4.f142373d = c6920x30febe4.b("ChatName", aVar.f66142xdec927b, true);
        c6920x30febe4.f142374e = aVar.f66140xd09be28e;
        c6920x30febe4.f142375f = i17;
        c6920x30febe4.f142376g = i18;
        if (z17) {
            c6920x30febe4.f142377h = 2L;
        } else {
            c6920x30febe4.f142377h = 1L;
        }
        c6920x30febe4.k();
    }

    public void h(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6922xa7f857b4 c6922xa7f857b4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6922xa7f857b4();
        c6922xa7f857b4.f142384d = c6922xa7f857b4.b("ChatName", str, true);
        c6922xa7f857b4.f142385e = i17;
        c6922xa7f857b4.k();
    }

    public void i(y63.a aVar, y63.a aVar2, int i17) {
        if (aVar == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new x63.l(this, aVar2, aVar, i17));
    }
}
