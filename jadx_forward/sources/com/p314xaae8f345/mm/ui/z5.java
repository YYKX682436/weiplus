package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class z5 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21363x65d29512 f294134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.b6 f294135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f294136f;

    public z5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512, zy2.b6 b6Var) {
        this.f294136f = c21357x5e7365bb;
        this.f294134d = c21363x65d29512;
        this.f294135e = b6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.f03 f03Var;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        int Di = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Di();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged] result=%s testMode:%s", aVar, java.lang.Integer.valueOf(Di));
            zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
            boolean wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = aVar.f186862c;
            com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d29512 = this.f294134d;
            if (!wi6 || jbVar == null || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.f3.a(java.lang.Integer.valueOf(jbVar.m55856xfb85f7b0()))) {
                l40.e eVar = (l40.e) i95.n0.c(l40.e.class);
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f294136f;
                java.lang.String Ui = ((k40.f) eVar).Ui(c21357x5e7365bb.mo78409x676b27cd());
                boolean equals = "FinderEntrance".equals(aVar.f186864e);
                r45.f03 f03Var2 = aVar.f186861b;
                boolean z28 = aVar.f186860a;
                if (equals) {
                    r45.f03 I0 = nk6.I0("FinderMentionEntrance");
                    z17 = I0 != null && I0.f455421e > 0;
                    f03Var = f03Var2;
                    f03Var2 = I0;
                } else if ("FinderMentionEntrance".equals(aVar.f186864e)) {
                    if (!z28 || f03Var2 == null) {
                        f03Var2 = null;
                    } else if (f03Var2.f455421e > 0) {
                        z17 = true;
                        r45.f03 I02 = nk6.I0("FinderEntrance");
                        z28 = I02 == null && I02.f455420d > 0;
                        f03Var = I02;
                    }
                    z17 = false;
                    r45.f03 I022 = nk6.I0("FinderEntrance");
                    if (I022 == null) {
                    }
                    f03Var = I022;
                } else {
                    f03Var2 = null;
                    f03Var = null;
                    z28 = false;
                    z17 = false;
                }
                if (z28) {
                    if (jbVar != null) {
                        int i17 = jbVar.f65875xb5fc3ab6;
                        boolean z29 = i17 == 14 || i17 == 10;
                        r45.xs2 xs2Var = jbVar.N;
                        z19 = z29;
                        z27 = xs2Var != null && xs2Var.m75939xb282bd08(19) == 1;
                    } else {
                        z19 = false;
                        z27 = false;
                    }
                    if (Di == 0) {
                        this.f294136f.z0(f03Var, this.f294134d, z19, ((c61.l7) this.f294135e).nk().f0(), z27, f03Var2);
                    }
                } else if (z17) {
                    r45.pm6 pm6Var = new r45.pm6();
                    pm6Var.f464719d = f03Var2.f455421e;
                    c21363x65d29512.Z3(true, pm6Var);
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username not match finderEntry username: ");
                    java.lang.String str = aVar.f186863d;
                    sb6.append(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", sb6.toString());
                    if ("FinderMentionEntrance".equals(aVar.f186864e) && str.equals(Ui)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "FINDER_MENTION_ENTRANCE showCounter false");
                        z18 = false;
                        c21363x65d29512.Z3(false, new r45.pm6());
                    } else {
                        z18 = false;
                    }
                    if ("FinderEntrance".equals(aVar.f186864e)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "FINDER_ENTRANCE showRedPoint false");
                        c21363x65d29512.y(z18);
                    }
                    c21357x5e7365bb.b1("find_friends_by_finder", z18);
                }
                if (Di > 0) {
                    com.p314xaae8f345.mm.ui.C21363x65d29512 c21363x65d295122 = this.f294134d;
                    java.util.List list = com.p314xaae8f345.mm.ui.C21357x5e7365bb.R1;
                    if (Di < 5 || Di > 8) {
                        c21357x5e7365bb.Z0(c21363x65d295122, 3, false, 0L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 3, false, 1500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 1, false, 3000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 1, false, 4500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 7, false, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
                        c21357x5e7365bb.Z0(c21363x65d295122, 7, false, 7500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 11, false, 9000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 11, false, 10500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 2, false, 12000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 2, false, 13500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 22, false, 15000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 22, false, 16500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 13, false, 18000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 13, false, 19500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 14, false, 21000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 14, false, 22500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 12, false, 24000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 12, false, 25500L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 24, false, 37000L);
                        c21357x5e7365bb.Z0(c21363x65d295122, 24, false, 38500L);
                    } else {
                        c21357x5e7365bb.Z0(c21363x65d295122, 22, false, 0L);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[onChanged] result=%s, 青少年模式且只看关注的模式下只允许关注的红点展示", aVar);
                if (c21363x65d29512 != null) {
                    c21363x65d29512.y(false);
                }
            }
        }
        return f0Var;
    }
}
