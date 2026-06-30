package pb4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final pb4.e f434729a = new pb4.e();

    /* renamed from: b, reason: collision with root package name */
    public static int f434730b;

    public static void b(pb4.e eVar, java.lang.String userName, long j17, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (cc4.b.f122015a.c()) {
            l75.k0 f17 = eVar.f();
            p75.n0 n0Var = dm.ab.f317249y;
            n0Var.getClass();
            p75.m c17 = dm.ab.B.j(userName).c(dm.ab.A.i(java.lang.Long.valueOf(j17)));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            java.lang.String table = n0Var.b();
            p75.y yVar = (p75.y) c17;
            java.lang.String b17 = yVar.b();
            java.lang.String[] e17 = yVar.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
            int mo70514xb06685ab = f17.mo70514xb06685ab(table, b17, e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfo >> " + userName + ' ' + j17 + " result: " + mo70514xb06685ab);
            if (z17 && mo70514xb06685ab > 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e();
                java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", j17);
                am.yw ywVar = c6098x8f514c1e.f136375g;
                ywVar.f90019b = j18;
                ywVar.f90018a = 3;
                ywVar.f90020c = userName;
                c6098x8f514c1e.e();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6108x48c0353a c6108x48c0353a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6108x48c0353a();
                java.lang.String j19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", j17);
                am.hx hxVar = c6108x48c0353a.f136384g;
                hxVar.f88410b = j19;
                hxVar.f88409a = 2;
                c6108x48c0353a.e();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public static void i(pb4.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        if (cc4.b.f122015a.c()) {
            long a17 = dm.ab.t0(eVar.l(snsInfo), false).a(eVar.f());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insertStarSnsInfo >> " + snsInfo.m70367x7525eefd() + ' ' + a17);
            if (z17 && a17 > 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e();
                java.lang.String m70367x7525eefd = snsInfo.m70367x7525eefd();
                am.yw ywVar = c6098x8f514c1e.f136375g;
                ywVar.f90019b = m70367x7525eefd;
                ywVar.f90018a = 1;
                ywVar.f90020c = snsInfo.m70374x6bf53a6c();
                c6098x8f514c1e.e();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertStarSnsInfo$default", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void a(java.lang.String userName) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteAllStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f317249y;
        p75.m0 j17 = dm.ab.B.j(userName);
        p75.n0 n0Var2 = dm.ab.f317249y;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        java.lang.String b17 = j17.b();
        java.lang.String[] e17 = j17.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteAllStarSnsInfo >> " + userName + ", result: " + f17.mo70514xb06685ab(table, b17, e17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteAllStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void c(java.lang.String userName, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteStarSnsInfoAfterTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f317249y;
        n0Var.getClass();
        p75.m c17 = dm.ab.B.j(userName).c(dm.ab.C.n(java.lang.Integer.valueOf(i17)));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfoAfterTime >> " + userName + ", " + i17 + " result: " + new p75.i(n0Var.b(), c17.b(), c17.e()).f(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteStarSnsInfoAfterTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void d(java.lang.String userName, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteStarSnsInfoBeforeTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f317249y;
        n0Var.getClass();
        p75.m c17 = dm.ab.B.j(userName).c(dm.ab.C.w(java.lang.Integer.valueOf(i17)));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfoBeforeTime >> " + userName + ", " + i17 + ' ' + new p75.i(n0Var.b(), c17.b(), c17.e()).f(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteStarSnsInfoBeforeTime", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final void e(java.lang.String userName, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteStartInfoInRange", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f317249y;
        n0Var.getClass();
        p75.m0 j17 = dm.ab.B.j(userName);
        p75.d dVar = dm.ab.C;
        p75.y yVar = (p75.y) j17.c(dVar.x(java.lang.Integer.valueOf(i17)));
        yVar.f(dVar.n(java.lang.Integer.valueOf(i18)));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStartInfoInRange >> " + userName + ", " + i17 + ", " + i18 + ", " + new p75.i(n0Var.b(), yVar.b(), yVar.e()).f(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteStartInfoInRange", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final l75.k0 f() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        jm0.i iVar = jm0.k.f381802h;
        l75.k0 Q4 = ((pb4.a) iVar.a(pb4.a.class)).Q4();
        if (Q4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return Q4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        java.lang.String str = gm0.j1.u().h() + "sns_star_info.db";
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(pb4.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(pb4.a.class);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "init >> " + str + ' ' + ((pb4.a) a17).O6(str));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        l75.k0 Q42 = ((pb4.a) iVar.a(pb4.a.class)).Q4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Q42);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInitDB", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return Q42;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 g(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfoBySnsId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        l75.k0 f17 = f();
        p75.i0 i17 = dm.ab.f317249y.i();
        i17.f434190d = dm.ab.A.i(java.lang.Long.valueOf(j17));
        dm.ab abVar = (dm.ab) i17.a().o(f17, dm.ab.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsInfoBySnsId >> snsId: ");
        sb6.append(j17);
        sb6.append(", ");
        sb6.append(abVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 n17 = n(abVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoBySnsId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return n17;
    }

    public final java.util.ArrayList h(java.lang.String userName, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.i0 i18 = dm.ab.f317249y.i();
        i18.f434190d = dm.ab.B.j(userName);
        i18.f434192f = kz5.b0.c(dm.ab.C.u());
        i18.c(i17, 0);
        java.util.List k17 = i18.a().k(f17, dm.ab.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "getStarSnsInfoByLimit >> " + userName + ", " + i17 + ", " + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 n17 = f434729a.n((dm.ab) it.next());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
            arrayList.add(n17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarSnsInfoByLimit", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return arrayList;
    }

    public final int j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insetInfoToSnsInfoStorageReturnLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().O2(info.f68891x29d1292e)) {
            int t37 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().t3(info);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insetInfoToSnsInfoStorageReturnLocalId >> isNotExist " + ca4.z0.t0(info.f68891x29d1292e) + ' ' + t37);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insetInfoToSnsInfoStorageReturnLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return t37;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insetInfoToSnsInfoStorageReturnLocalId >> isExist " + ca4.z0.t0(info.f68891x29d1292e));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(info.f68891x29d1292e);
        info.f38324x142bbdc6 = W0.f38324x142bbdc6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(info.f68891x29d1292e, info);
        int i17 = W0.f38324x142bbdc6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insetInfoToSnsInfoStorageReturnLocalId", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return i17;
    }

    public final void k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        if (cc4.b.f122015a.c()) {
            dm.ab l17 = l(snsInfo);
            l75.k0 f17 = f();
            p75.n0 n0Var = dm.ab.f317249y;
            n0Var.getClass();
            android.content.ContentValues mo9763xeb27878e = l17.mo9763xeb27878e();
            p75.m0 i17 = dm.ab.A.i(java.lang.Long.valueOf(l17.f65930x29d1292e));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            int f18 = new p75.i1(n0Var.b(), mo9763xeb27878e, i17.b(), i17.e()).f(f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "replaceInfo >> " + snsInfo.m70367x7525eefd() + ", " + f18);
            if (z17 && f18 > 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e();
                java.lang.String m70367x7525eefd = snsInfo.m70367x7525eefd();
                am.yw ywVar = c6098x8f514c1e.f136375g;
                ywVar.f90019b = m70367x7525eefd;
                ywVar.f90018a = 2;
                ywVar.f90020c = snsInfo.m70374x6bf53a6c();
                c6098x8f514c1e.e();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }

    public final dm.ab l(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsInfoToSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        dm.ab abVar = new dm.ab();
        abVar.f65930x29d1292e = snsInfo.f68891x29d1292e;
        abVar.f65921xad49e234 = snsInfo.f68882xad49e234;
        abVar.f65923x225c7205 = snsInfo.f68884x225c7205;
        abVar.f65920x4c58c87d = snsInfo.f68881x4c58c87d;
        abVar.f65922xac3be4e = snsInfo.f68883xac3be4e;
        abVar.f65924x5f778948 = snsInfo.f68885x5f778948;
        abVar.f65925x52c1d072 = snsInfo.f68886x52c1d072;
        abVar.f65926xa4146ebd = snsInfo.f68887xa4146ebd;
        abVar.f65927x5d40d76e = snsInfo.f68888x5d40d76e;
        abVar.f65929x658b81e5 = snsInfo.f68890x658b81e5;
        abVar.f65936x16e1d0b8 = snsInfo.f68897x16e1d0b8;
        abVar.f65937xdc9f896e = snsInfo.f68898xdc9f896e;
        abVar.f65931x76e81a5a = snsInfo.f68892x76e81a5a;
        abVar.f65932x8f55c989 = snsInfo.f68893x8f55c989;
        abVar.f65934x2262335f = snsInfo.f68895x2262335f;
        abVar.f65933x5334f55 = snsInfo.f68894x5334f55;
        abVar.f65928xcb0372e6 = snsInfo.f68889xcb0372e6;
        abVar.f65935xdde069b = snsInfo.f68896xdde069b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsInfoToSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return abVar;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 snsObj, java.lang.String userName, int i17) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsObj, "snsObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "snsObjectToSnsInfo >> " + snsObj.Id + ", " + userName);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(snsObj.Id);
        if (W0 == null) {
            W0 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        }
        r45.cu5 cu5Var = snsObj.f38990xb6613a90;
        if (cu5Var == null || (gVar = cu5Var.f453374f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarSnsInfoStorage", "object desc is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        java.lang.String str = new java.lang.String(gVar.g(), r26.c.f450398a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        if (!W0.m70441xe9f5bdb7(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        snsObj.f38991x89eed8ab = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.l(snsObj.f38991x89eed8ab, W0.f68881x4c58c87d);
        boolean z17 = false;
        snsObj.f38990xb6613a90.d(new byte[0]);
        W0.m70468x66ad9b78(snsObj.f38999xf403ecf6);
        W0.m70443x6e018feb(snsObj.f38965xc86e6609);
        W0.m70448xb8471e25(snsObj.f38983x458ee3c3);
        W0.m70462x53b40971(snsObj.Id);
        W0.m70463x5078d04c(snsObj.Id);
        W0.f68890x658b81e5 = snsObj.f38967x15579d0d;
        W0.m70338xbeec15a8(i17);
        try {
            if (!W0.m70377x3172ed()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.a(W0, snsObj);
            }
            W0.m70440x8904a400(snsObj.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.m(W0, snsObj);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsStarSnsInfoStorage", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = W0.m70371x485d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
        m70371x485d7.f39018xf3f56116 = snsObj.f38999xf403ecf6;
        int i18 = m70371x485d7.f39017xbebdef61;
        W0.m70460x23d307c3(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "ext flag %s  extflag %s", java.lang.Long.valueOf(snsObj.Id), java.lang.Integer.valueOf(snsObj.f38967x15579d0d));
        int i19 = snsObj.f38967x15579d0d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        boolean z18 = (i19 & 1) > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isBIDIRFRIEND", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        if (z18) {
            W0.m70445x635d8e6b();
        } else {
            W0.m70473x58a4cde4();
        }
        if (snsObj.f39002x36ea9d02 != 0) {
            W0.m70470xd989cf82();
        } else {
            W0.m70343xacb0922d();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.j(snsObj.f38967x15579d0d)) {
            W0.m70338xbeec15a8(128);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Qj().y0(snsObj.Id);
            if (y07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(y07.f69423x99016a0b)) {
                r45.qb6 qb6Var = new r45.qb6();
                try {
                    qb6Var.mo11468x92b714fd(y07.f69423x99016a0b);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qb6Var.f465343d)) {
                        z17 = true;
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsStarSnsInfoStorage", "parse SnsWsGroupStruct fail:%s", e18.getMessage());
                }
            }
            if (y07 == null || !z17) {
                W0.m70341xbcb87932();
            } else {
                W0.m70471x5a9a740b();
            }
        } else {
            W0.m70341xbcb87932();
        }
        if (i18 == 1 && i17 != 4 && i17 != 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarSnsInfoStorage", "svr error push me the private pic in timelnie or others");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        if (i18 == 1 || (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, snsObj.f38999xf403ecf6) && i17 == 4)) {
            W0.m70451x2f244d1a();
        }
        W0.m70466xfabce6e3(m70371x485d7);
        W0.m70467x4e3c7448(m70371x485d7.f39014x86965dde.f451370e);
        W0.m70465x963f7264(m70371x485d7.f39014x86965dde.f451374i);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17833x135cc83e()) == 1) {
            java.util.Iterator<r45.e86> it = snsObj.f38963x20c46e68.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = it.next().f454673u.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.b((r45.l86) it6.next());
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(b17.f68671x4b6e68b9) == null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(b17);
                        zq.h.f556505a.e(b17, null);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsObjectToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return W0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 n(dm.ab abVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsStarInfoToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        if (abVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsStarInfoToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        c17933xe8d1b226.f68891x29d1292e = abVar.f65930x29d1292e;
        c17933xe8d1b226.f68882xad49e234 = abVar.f65921xad49e234;
        c17933xe8d1b226.f68884x225c7205 = abVar.f65923x225c7205;
        c17933xe8d1b226.f68881x4c58c87d = abVar.f65920x4c58c87d;
        c17933xe8d1b226.f68883xac3be4e = abVar.f65922xac3be4e;
        c17933xe8d1b226.f68885x5f778948 = abVar.f65924x5f778948;
        c17933xe8d1b226.f68886x52c1d072 = abVar.f65925x52c1d072;
        c17933xe8d1b226.f68887xa4146ebd = abVar.f65926xa4146ebd;
        c17933xe8d1b226.f68888x5d40d76e = abVar.f65927x5d40d76e;
        c17933xe8d1b226.f68890x658b81e5 = abVar.f65929x658b81e5;
        c17933xe8d1b226.f68897x16e1d0b8 = abVar.f65936x16e1d0b8;
        c17933xe8d1b226.f68898xdc9f896e = abVar.f65937xdc9f896e;
        c17933xe8d1b226.f68892x76e81a5a = abVar.f65931x76e81a5a;
        c17933xe8d1b226.f68893x8f55c989 = abVar.f65932x8f55c989;
        c17933xe8d1b226.f68895x2262335f = abVar.f65934x2262335f;
        c17933xe8d1b226.f68894x5334f55 = abVar.f65933x5334f55;
        c17933xe8d1b226.f68889xcb0372e6 = abVar.f65928xcb0372e6;
        c17933xe8d1b226.f68896xdde069b = abVar.f65935xdde069b;
        c17933xe8d1b226.f38324x142bbdc6 = (int) abVar.f72763xa3c65b86;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsStarInfoToSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        return c17933xe8d1b226;
    }

    public final void o(dm.ab snsStarInfo, java.lang.String userName) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOrInsetSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsStarInfo, "snsStarInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        l75.k0 f17 = f();
        p75.n0 n0Var = dm.ab.f317249y;
        n0Var.getClass();
        android.content.ContentValues mo9763xeb27878e = snsStarInfo.mo9763xeb27878e();
        p75.m c17 = dm.ab.A.i(java.lang.Long.valueOf(snsStarInfo.f65930x29d1292e)).c(dm.ab.B.j(userName));
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        int f18 = new p75.i1(n0Var.b(), mo9763xeb27878e, c17.b(), c17.e()).f(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "updateOrInsetSnsStarInfo >> " + f18 + ' ' + snsStarInfo.f65930x29d1292e);
        if (f18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "data is no in db go to inset");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "insetSnsStarInfo >> " + dm.ab.t0(snsStarInfo, false).a(f17) + ' ' + snsStarInfo.f65930x29d1292e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateOrInsetSnsStarInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
    }
}
