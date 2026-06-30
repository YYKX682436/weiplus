package o72;

/* loaded from: classes12.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f425048a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("fav_api_params");

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f425049b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f425050c;

    /* renamed from: d, reason: collision with root package name */
    public static long f425051d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f425052e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f425053f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f425054g;

    static {
        f425049b = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20248x9ad5dc65()) == 1;
        f425050c = new java.util.HashMap();
        f425051d = 0L;
        f425052e = 12;
        f425053f = 13;
        f425054g = -1;
    }

    public static java.lang.String A(r45.bq0 bq0Var) {
        java.util.LinkedList linkedList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (bq0Var != null && (linkedList = bq0Var.f452497f) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb6.append(((r45.gp0) it.next()).T);
                sb6.append(";");
            }
        }
        return sb6.toString();
    }

    public static void A0(o72.r2 r2Var, r45.gp0 gp0Var, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
            return;
        }
        java.lang.String W = W(gp0Var.T);
        o72.s2.g("MicroMsg.Fav.FavApiLogic", o72.s2.f(r2Var.f67645x88be67a1), "restartCdnThumbDownLoad: localId=%d, favId=%d, dataId=%s, thumbDataId=%s, force=%b", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), gp0Var.T, W, java.lang.Boolean.valueOf(z17));
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(W);
        if (Xf != null && Xf.f67093x10a0fed7 == 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9951xb06685ab(Xf, "dataId");
            Xf = null;
        }
        if (Xf != null && Xf.f67095x2262335f == 1) {
            Xf.f67093x10a0fed7 = 1;
            Xf.f67089x15b870c = c01.id.c();
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf, "dataId");
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
            }
            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(X(gp0Var));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456953m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        e0(gp0Var, r2Var, 1);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
        }
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
    }

    public static o72.r2 B(java.lang.String str, int i17) {
        o72.r2 r2Var = new o72.r2();
        r2Var.f67645x88be67a1 = -1L;
        r2Var.f67643xc8a07680 = -1;
        r2Var.f67660x4b6e9352 = str;
        r2Var.f67657x2262335f = i17;
        r2Var.U0(str);
        return r2Var;
    }

    public static void B0(r45.gp0 gp0Var, boolean z17, int i17, long j17) {
        int i18;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456953m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h)) {
            return;
        }
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(W(gp0Var.T));
        if (Xf != null && ((i18 = Xf.f67093x10a0fed7) == 3 || i18 == 4)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9951xb06685ab(Xf, "dataId");
            Xf = null;
        }
        if (Xf != null && Xf.f67095x2262335f == 1) {
            Xf.f67093x10a0fed7 = 1;
            Xf.f67089x15b870c = c01.id.c();
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf, "dataId");
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
            }
            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(X(gp0Var));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456953m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        o72.r2 r2Var = new o72.r2();
        r2Var.f67645x88be67a1 = j17;
        r2Var.f67643xc8a07680 = -1;
        r2Var.f67657x2262335f = i17;
        e0(gp0Var, r2Var, 1);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
        }
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
    }

    public static java.lang.String C() {
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("favorite");
        java.lang.String str = gm0.j1.u().d() + "favorite";
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20252x14028895()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "getFavRoot, favRootSwitch:" + z17 + ", ret1:" + c17 + ", ret2:" + str);
        return z17 ? c17 : str;
    }

    public static void C0(o72.r2 r2Var, boolean z17) {
        if (r2Var == null) {
            return;
        }
        java.lang.String f17 = o72.s2.f(r2Var.f67645x88be67a1);
        int i17 = r2Var.f67644x3059914a;
        if (i17 != 8 && i17 != 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "status not download failed or done!");
            o72.s2.p("MicroMsg.Fav.FavApiLogic", f17, "restartItemDownload: invalid status, localId=%d, favId=%d, itemStatus=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Integer.valueOf(r2Var.f67644x3059914a));
            return;
        }
        r2Var.f67644x3059914a = 7;
        java.util.LinkedList<r45.gp0> linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList.size() == 0) {
            return;
        }
        o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "restartItemDownload: localId=%d, favId=%d, force=%b, dataItemCount=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(linkedList.size()));
        for (r45.gp0 gp0Var : linkedList) {
            y0(r2Var, gp0Var, z17);
            A0(r2Var, gp0Var, z17);
        }
    }

    public static java.lang.String D() {
        return C() + "/music/";
    }

    public static void D0(o72.r2 r2Var, boolean z17) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        if (!r2Var.P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.Fav.FavApiLogic", "restartItemUpload status not upload failed!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "restartItemUpload, localId:%s, force:%b, itemStatus:%d, item_xml:%s", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(r2Var.f67644x3059914a), !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o72.r2.G0(r2Var)) ? o72.r2.G0(r2Var) : "");
        java.lang.String e17 = o72.s2.e(r2Var.f67645x88be67a1, java.lang.System.currentTimeMillis());
        o72.s2.a(r2Var.f67645x88be67a1, e17);
        o72.s2.g("MicroMsg.Fav.FavApiLogic", e17, "restartItemUpload: localId=%d, favId=%d, force=%b, itemStatus=%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(r2Var.f67644x3059914a));
        int i17 = r2Var.f67644x3059914a;
        if (i17 == 3) {
            r2Var.f67644x3059914a = 1;
            a82.y0 y0Var = a82.y0.f83768a;
            a82.y0.f83769b.add(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
            a82.j1.f83578a.h(r2Var, false, true, 0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
            ((a82.o0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
            return;
        }
        if (i17 == 6) {
            java.util.List d37 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().d3(r2Var.f67645x88be67a1);
            if (d37 == null || d37.size() == 0) {
                r2Var.f67644x3059914a = 9;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
                gm0.j1.d().g(new o72.h5(r2Var));
                return;
            }
            a82.j1.f83578a.h(r2Var, false, true, 0);
            r2Var.f67644x3059914a = 4;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ke(r2Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
            if (z17) {
                for (o72.e2 e2Var : ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().d3(r2Var.f67645x88be67a1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), e2Var.f67085xf604e54a, java.lang.Integer.valueOf(e2Var.f67086x886617a9), java.lang.Integer.valueOf(e2Var.f67094xeb1a61d6));
                    if (!com.p314xaae8f345.mm.vfs.w6.j(e2Var.f67091x2260084a)) {
                        java.lang.String str = e2Var.f67091x2260084a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "cdnInfo.field_path (%s) not exists, exportPath:%s", str, com.p314xaae8f345.mm.vfs.w6.i(str, false));
                        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                        if (bq0Var != null && (linkedList = bq0Var.f452497f) != null) {
                            java.util.Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                r45.gp0 gp0Var = (r45.gp0) it.next();
                                java.lang.String x17 = x(gp0Var);
                                java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(x17, false);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "toPath:%s, trueDataPath:%s", x17, i18);
                                if (x17.equals(e2Var.f67091x2260084a) || i18.equals(e2Var.f67091x2260084a)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "copy ret:%s", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(gp0Var.V, e2Var.f67091x2260084a, false)));
                                }
                            }
                        }
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
                }
            }
            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            return;
        }
        if (i17 == 11) {
            a82.j1.f83578a.h(r2Var, false, true, 0);
            r2Var.f67644x3059914a = 9;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
            ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
            return;
        }
        if (i17 == 14) {
            a82.j1.f83578a.h(r2Var, false, true, 0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(12, r2Var.f67645x88be67a1);
            ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
            return;
        }
        if (i17 != 16) {
            if (i17 != 18) {
                return;
            }
            a82.j1.f83578a.h(r2Var, true, true, 0);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(17, r2Var.f67645x88be67a1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).yj().b();
            return;
        }
        a82.j1.f83578a.h(r2Var, true, true, 0);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(15, r2Var.f67645x88be67a1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ke(r2Var);
        if (z17) {
            for (o72.e2 e2Var2 : ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().d3(r2Var.f67645x88be67a1)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "force upload favItem[last mod failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), e2Var2.f67085xf604e54a, java.lang.Integer.valueOf(e2Var2.f67086x886617a9), java.lang.Integer.valueOf(e2Var2.f67094xeb1a61d6));
                if (!com.p314xaae8f345.mm.vfs.w6.j(e2Var2.f67091x2260084a)) {
                    java.lang.String str2 = e2Var2.f67091x2260084a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "cdnInfo.field_path (%s) not exists, exportPath:%s", str2, com.p314xaae8f345.mm.vfs.w6.i(str2, false));
                    r45.bq0 bq0Var2 = r2Var.f67640x5ab01132;
                    if (bq0Var2 != null && (linkedList2 = bq0Var2.f452497f) != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.gp0 gp0Var2 = (r45.gp0) it6.next();
                            java.lang.String x18 = x(gp0Var2);
                            java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(x18, false);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "toPath:%s, trueDataPath:%s", x18, i19);
                            if (x18.equals(e2Var2.f67091x2260084a) || i19.equals(e2Var2.f67091x2260084a)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "copy ret:%s", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.d(gp0Var2.V, e2Var2.f67091x2260084a, false)));
                            }
                        }
                    }
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
            }
        }
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
    }

    public static int E(o72.r2 r2Var) {
        java.util.LinkedList linkedList;
        r45.gp0 gp0Var;
        r45.hp0 hp0Var;
        r45.xs4 xs4Var;
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        int i17 = f425054g;
        return (bq0Var == null || (linkedList = bq0Var.f452497f) == null || linkedList.size() <= 0 || (gp0Var = (r45.gp0) r2Var.f67640x5ab01132.f452497f.get(0)) == null || (hp0Var = gp0Var.J1) == null || (xs4Var = hp0Var.C) == null) ? i17 : il4.l.g(xs4Var.m75939xb282bd08(18)) ? f425053f : f425052e;
    }

    public static void E0(java.util.List list) {
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "setDeleted list null");
            return;
        }
        java.util.Set Q = Q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "setDeleted before del:%s", Q.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "setDeleted id:%d, ret:%b", num, java.lang.Boolean.valueOf(((java.util.HashSet) Q).remove(num.toString())));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "setDeleted after del:%s", Q.toString());
        F0(Q);
    }

    public static boolean F() {
        boolean z17 = f425048a.getBoolean("fav_api_music", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "[getFavUseMusicList] result = " + z17);
        return z17;
    }

    public static void F0(java.util.Set set) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            stringBuffer.append((java.lang.String) it.next());
            stringBuffer.append(",");
        }
        java.lang.String substring = stringBuffer.length() > 0 ? stringBuffer.substring(0, stringBuffer.length() - 1) : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "set need del IDs: %s", substring);
        gm0.j1.u().c().w(225282, substring);
    }

    public static boolean G() {
        o72.d3 d3Var = o72.d3.f424854a;
        boolean z17 = o72.d3.f424856c;
        boolean z18 = false;
        boolean z19 = f425048a.getBoolean("fav_api_tag", false);
        if (z19 && z17) {
            z18 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "[getFavUseNewTag] result = " + z19 + ", xSwitch = " + z17 + ", open = " + z18);
        return z18;
    }

    public static void G0(o72.r2 r2Var, boolean z17) {
        r45.sp0 sp0Var = new r45.sp0();
        if (!z17) {
            sp0Var.f467424d = c01.z1.r();
        }
        sp0Var.f467425e = c01.z1.r();
        r2Var.f67640x5ab01132.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        r2Var.f67640x5ab01132.l(sp0Var);
    }

    public static java.lang.String H() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        sb6.append(lp0.b.h0("fav_video_transfer").o());
        sb6.append("/");
        return sb6.toString();
    }

    public static void H0(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "setTotalCapacity:%d", java.lang.Long.valueOf(j17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_FAV_TOTAL_CAPACITY_LONG, java.lang.Long.valueOf(j17));
    }

    public static java.lang.String I() {
        return C() + "/web/";
    }

    public static void I0(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "setUsedCapacity:%d", java.lang.Long.valueOf(j17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_FAV_USED_CAPACITY_LONG, java.lang.Long.valueOf(j17));
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5431x20c53acc().e();
    }

    public static r45.gp0 J(z30.v vVar) {
        o72.r2 r2Var;
        r45.bq0 bq0Var;
        return (vVar == null || (bq0Var = (r2Var = (o72.r2) vVar).f67640x5ab01132) == null) ? new r45.gp0() : bq0Var.f452497f.size() == 0 ? new r45.gp0() : (r45.gp0) r2Var.f67640x5ab01132.f452497f.get(0);
    }

    public static void J0(java.lang.String str, android.content.Context context, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "share image to friend fail, imgPath is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_File_Name", str);
        intent.putExtra("Retr_Compress_Type", 0);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("msg_uuid", str2);
        j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
    }

    public static long K() {
        long a07 = a0() - b0();
        if (a07 < 0) {
            return 1024L;
        }
        return a07;
    }

    public static void K0(java.lang.String str, android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "share image to timeline fail, filePath is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str2 = "fav_" + c01.z1.r() + "_0";
        java.lang.String a17 = c01.n2.a(str2);
        c01.n2.d().c(a17, true).i("prePublishId", str2);
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        j45.l.j(context, "sns", ".ui.SnsUploadUI", intent, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x004f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.lp0 L(int r6, r45.bq0 r7, r45.rq0 r8) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.x1.L(int, r45.bq0, r45.rq0):r45.lp0");
    }

    public static void L0(android.content.Context context, java.lang.String str, android.content.Intent intent, android.os.Bundle bundle) {
        if (intent == null) {
            try {
                intent = new android.content.Intent();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", e17);
                return;
            }
        }
        if (str.startsWith(".")) {
            str = "com.tencent.mm.plugin.fav".concat(str);
        }
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, str);
        if (context == null) {
            return;
        }
        java.lang.Class.forName(str, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
            yj0.a.f(context, "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(bundle);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(context, "com/tencent/mm/plugin/fav/api/FavApiLogic", "startFavActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r1 != 18) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String M(o72.r2 r9) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r9.f67657x2262335f
            r2 = 1
            if (r1 == r2) goto Lb4
            r3 = 2
            if (r1 == r3) goto L94
            r4 = 3
            if (r1 == r4) goto L8a
            r4 = 4
            if (r1 == r4) goto L8a
            r5 = 5
            if (r1 == r5) goto L7d
            r5 = 8
            if (r1 == r5) goto L94
            r5 = 14
            if (r1 == r5) goto L28
            r5 = 16
            if (r1 == r5) goto L8a
            r5 = 18
            if (r1 == r5) goto L28
            goto Lca
        L28:
            r45.bq0 r9 = r9.f67640x5ab01132
            java.util.LinkedList r9 = r9.f452497f
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
            r1 = r0
            r5 = r1
            r6 = r5
        L34:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L62
            java.lang.Object r7 = r9.next()
            r45.gp0 r7 = (r45.gp0) r7
            int r8 = r7.I
            if (r8 == r2) goto L51
            if (r8 == r3) goto L4e
            if (r8 == r4) goto L4b
            int r6 = r6 + 1
            goto L34
        L4b:
            int r5 = r5 + 1
            goto L34
        L4e:
            int r1 = r1 + 1
            goto L34
        L51:
            java.lang.String r8 = r7.f456941f
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r8 != 0) goto L34
            java.lang.String r7 = r7.f456941f
            byte[] r7 = r7.getBytes()
            int r7 = r7.length
            int r0 = r0 + r7
            goto L34
        L62:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r0, r1, r2}
            java.lang.String r0 = "%d:%d:%d:%d"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            return r9
        L7d:
            r45.bq0 r9 = r9.f67640x5ab01132     // Catch: java.lang.Exception -> L84
            r45.tq0 r9 = r9.f452501m     // Catch: java.lang.Exception -> L84
            java.lang.String r9 = r9.f468201h     // Catch: java.lang.Exception -> L84
            goto L86
        L84:
            java.lang.String r9 = ""
        L86:
            r0.append(r9)
            goto Lca
        L8a:
            r45.gp0 r9 = J(r9)
            int r9 = r9.f456981y
            r0.append(r9)
            goto Lca
        L94:
            r45.bq0 r9 = r9.f67640x5ab01132
            java.util.LinkedList r9 = r9.f452497f
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
        L9e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r9.next()
            r45.gp0 r3 = (r45.gp0) r3
            if (r3 == 0) goto L9e
            long r3 = r3.R
            long r1 = r1 + r3
            goto L9e
        Lb0:
            r0.append(r1)
            goto Lca
        Lb4:
            r45.bq0 r1 = r9.f67640x5ab01132
            java.lang.String r1 = r1.f452507s
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            if (r1 != 0) goto Lca
            r45.bq0 r9 = r9.f67640x5ab01132
            java.lang.String r9 = r9.f452507s
            byte[] r9 = r9.getBytes()
            int r9 = r9.length
            r0.append(r9)
        Lca:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.x1.M(o72.r2):java.lang.String");
    }

    public static void M0(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        if (intent == null) {
            try {
                intent = new android.content.Intent();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "Class Not Found when startActivity %s", e17);
                return;
            }
        }
        if (str.startsWith(".")) {
            str = "com.tencent.mm.plugin.fav".concat(str);
        }
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, str);
        java.lang.Class.forName(str, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).startActivityForResult(intent, i17, bundle);
        }
    }

    public static long N(o72.r2 r2Var) {
        r45.bq0 bq0Var;
        if (r2Var == null || (bq0Var = r2Var.f67640x5ab01132) == null) {
            return 0L;
        }
        java.util.Iterator it = bq0Var.f452497f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 = (int) (i17 + ((r45.gp0) it.next()).R);
        }
        return i17;
    }

    public static void N0(long j17, o72.r2 r2Var, r45.pp0 pp0Var, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, android.content.Context context, boolean z17, boolean z18) {
        o72.r2 r2Var2;
        if (pp0Var == null || context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("map_view_type", 2);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("kFavInfoLocalId", j17);
        intent.putExtra("kwebmap_slat", pp0Var.f464801f);
        intent.putExtra("kwebmap_lng", pp0Var.f464799d);
        intent.putExtra("kPoiName", pp0Var.f464807o);
        intent.putExtra("Kwebmap_locaion", pp0Var.f464805m);
        int i17 = pp0Var.f464803h;
        if (i17 >= 0) {
            intent.putExtra("kwebmap_scale", i17);
        }
        intent.putExtra("kPoiid", pp0Var.f464809q);
        intent.putExtra("KIsFromPoiList", pp0Var.A);
        intent.putExtra("KPoiCategoryTips", pp0Var.f464811s);
        intent.putExtra("kPoiBusinessHour", pp0Var.f464813u);
        intent.putExtra("KPoiPhone", pp0Var.f464815w);
        intent.putExtra("KPoiPriceTips", pp0Var.f464817y);
        intent.putExtra("kBuildingID", pp0Var.C);
        intent.putExtra("kFloorName", pp0Var.E);
        intent.putExtra("kisUsername", str);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("kRemark", str2);
        intent.putExtra("kTags", arrayList);
        intent.putExtra("kFavCanDel", z17);
        intent.putExtra("kFavCanRemark", z18);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        if (r2Var.B1 && (r2Var2 = r2Var.C1) != null) {
            int i18 = r2Var2.f67657x2262335f;
            int i19 = i18 != 18 ? i18 == 14 ? 2 : 0 : 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "[startRedirectUI] icon type = " + i19);
            intent.putExtra("kFavShowIconType", i19);
            intent.putExtra("kFavOriginFavInfoLocalId", r2Var.C1.f67645x88be67a1);
            intent.putExtra("KFavOriginDataId", r2Var.E1);
        }
        r45.fq0 fq0Var = (r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 17, r45.fq0.class);
        if (fq0Var != null) {
            try {
                intent.putExtra("key_fav_search_report_obj", fq0Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "fav report search obj to byte array error");
            }
        }
        j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }

    public static java.lang.String O(float f17) {
        return f17 < 1024.0f ? java.lang.String.format("%.1fB", java.lang.Float.valueOf(f17)) : f17 < 1048576.0f ? java.lang.String.format("%.1fKB", java.lang.Float.valueOf(f17 / 1024.0f)) : f17 < 1.0737418E9f ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((f17 / 1024.0f) / 1024.0f)) : java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((f17 / 1024.0f) / 1024.0f) / 1024.0f));
    }

    public static long O0(long j17, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "tryStartBatchGet...");
        long Z0 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Z0(j17, i18, i17);
        long X = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().X(j17, i18, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, minBatGetTime:%d, itemMinTime:%d, updateTime:%d, mayReturnTime:%s", java.lang.Long.valueOf(Z0), java.lang.Long.valueOf(X), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.Math.min(Z0, X)));
        if (Z0 == 0) {
            return X;
        }
        if (o72.d3.f424858e) {
            s72.j0 j0Var = (s72.j0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj();
            v65.i.b(j0Var.X6(), null, new s72.p(j0Var, Z0, new o72.C29263x6b1d688(), null), 1, null);
        } else {
            java.util.LinkedList vh6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().vh(Z0, i17);
            if (vh6 != null && vh6.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", java.lang.Long.valueOf(Z0), java.lang.Long.valueOf(X), java.lang.Long.valueOf(j17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem, tryStartBatchGet, need batch get idList size:%d", java.lang.Integer.valueOf(vh6.size()));
                java.util.concurrent.atomic.AtomicInteger atomicInteger = o72.j5.f424904m;
                if (atomicInteger.get() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "now %d batch-get scene is doing", java.lang.Integer.valueOf(atomicInteger.get()));
                    gm0.j1.n().f354821b.c(402);
                }
                if (!gm0.j1.d().h(new o72.j5(vh6), 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "do scene BatchGetFav fail");
                    o72.j5.H();
                }
            }
        }
        return X;
    }

    public static int P(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals("speex")) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals("silk")) ? -2 : -4;
        }
        return -3;
    }

    public static void P0(o72.e2 e2Var) {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, getFavCdnStorage null");
            return;
        }
        int Nd = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Nd(e2Var.f67088x958756b0, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, download data status:%d, favlocalId:%d", java.lang.Integer.valueOf(Nd), java.lang.Long.valueOf(e2Var.f67088x958756b0));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus getFavItemInfoStorage null");
            return;
        }
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var.f67088x958756b0);
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
            return;
        }
        if (F.R0() || F.Q0() || F.P0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, status upload, skip. isWaitServerUpload:%b  isUploadding:%b  isUploadFailed:%b", java.lang.Boolean.valueOf(F.R0()), java.lang.Boolean.valueOf(F.Q0()), java.lang.Boolean.valueOf(F.P0()));
            return;
        }
        if (Nd == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus init, favLocalId:%d, favId:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(10, e2Var.f67088x958756b0);
            return;
        }
        if (Nd == 1) {
            long j17 = F.f67645x88be67a1;
            java.util.HashMap hashMap = (java.util.HashMap) o72.v2.f425036b;
            if (!hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(7, e2Var.f67088x958756b0);
            return;
        }
        if (Nd == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(8, e2Var.f67088x958756b0);
        } else if (Nd == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus finish, favLocalId:%d, favId:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10659, 1, java.lang.Integer.valueOf(F.f67657x2262335f), 0, java.lang.Long.valueOf(N(F)), java.lang.Long.valueOf(o72.v2.a(F.f67645x88be67a1)));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(10, e2Var.f67088x958756b0);
        } else {
            if (Nd != 4) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10659, 1, java.lang.Integer.valueOf(F.f67657x2262335f), -5, java.lang.Long.valueOf(N(F)), java.lang.Long.valueOf(o72.v2.a(F.f67645x88be67a1)));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(8, e2Var.f67088x958756b0);
        }
    }

    public static java.util.Set Q() {
        java.lang.String[] split;
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(225282, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "get need del IDs: %s", str);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (split = str.split(",")) != null && split.length != 0) {
            for (java.lang.String str2 : split) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    public static void Q0(o72.r2 r2Var) {
        boolean z17;
        o72.a3 a3Var = (o72.a3) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().F(r2Var.f67645x88be67a1);
        if (a3Var == null) {
            a3Var = new o72.a3();
            a3Var.f67888x88be67a1 = r2Var.f67645x88be67a1;
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String str = r2Var.f67640x5ab01132.f452505q;
        if (str != null) {
            stringBuffer.append(str);
        }
        java.lang.String str2 = r2Var.f67640x5ab01132.f452507s;
        if (str2 != null) {
            stringBuffer.append(str2);
        }
        r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
        if (jq0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.f459569f)) {
            stringBuffer.append(jq0Var.f459569f);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(jq0Var.f459569f, true);
            if (n17 != null) {
                stringBuffer.append(n17.P0());
                stringBuffer.append(n17.w0());
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(jq0Var.f459571h, true);
            if (n18 != null) {
                stringBuffer.append(n18.P0());
                stringBuffer.append(n18.w0());
            }
            stringBuffer.append(jq0Var.f459575o);
        }
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        a3Var.f67889x541db35 = 0;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            java.lang.String str3 = gp0Var.f456941f;
            if (str3 != null) {
                stringBuffer.append(str3);
            }
            java.lang.String str4 = gp0Var.f456937d;
            if (str4 != null) {
                stringBuffer.append(str4);
            }
            a3Var.f67889x541db35 = (1 << gp0Var.I) | a3Var.f67889x541db35;
        }
        r45.tq0 tq0Var = r2Var.f67640x5ab01132.f452501m;
        if (tq0Var != null) {
            java.lang.String str5 = tq0Var.f468199f;
            if (str5 != null) {
                stringBuffer.append(str5);
            }
            java.lang.String str6 = r2Var.f67640x5ab01132.f452501m.f468197d;
            if (str6 != null) {
                stringBuffer.append(str6);
            }
        }
        r45.aq0 aq0Var = r2Var.f67640x5ab01132.f452513y;
        if (aq0Var != null) {
            java.lang.String str7 = aq0Var.f451723f;
            if (str7 != null) {
                stringBuffer.append(str7);
            }
            java.lang.String str8 = r2Var.f67640x5ab01132.f452513y.f451721d;
            if (str8 != null) {
                stringBuffer.append(str8);
            }
        }
        r45.kv2 kv2Var = r2Var.f67640x5ab01132.M;
        if (kv2Var != null) {
            if (kv2Var.m75945x2fec8307(2) != null) {
                java.lang.String m75945x2fec8307 = r2Var.f67640x5ab01132.M.m75945x2fec8307(2);
                if (r2Var.f67640x5ab01132.M.m75945x2fec8307(15) != null && !r2Var.f67640x5ab01132.M.m75945x2fec8307(15).isEmpty()) {
                    m75945x2fec8307 = r2Var.f67640x5ab01132.M.m75945x2fec8307(15);
                }
                stringBuffer.append(m75945x2fec8307);
            }
            if (r2Var.f67640x5ab01132.M.m75945x2fec8307(4) != null) {
                stringBuffer.append(r2Var.f67640x5ab01132.M.m75945x2fec8307(4));
            }
        }
        a3Var.f67890xffe55fe4 = "";
        for (java.lang.String str9 : r2Var.f67653xef67d413.f466628d) {
            a3Var.f67890xffe55fe4 += " " + str9;
            stringBuffer.append(str9);
        }
        for (java.lang.String str10 : r2Var.f67653xef67d413.f466629e) {
            a3Var.f67890xffe55fe4 += " " + str10;
            stringBuffer.append(str10);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().a(str10);
        }
        a3Var.f67887xad49e234 = stringBuffer.toString();
        a3Var.f67891x2261f6f2 = r2Var.f67659xa783a79b;
        a3Var.f67892x2262335f = r2Var.f67657x2262335f;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().Md(a3Var);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().q7(a3Var, dm.i4.f66867x2a5c95c7);
        }
    }

    public static java.util.ArrayList R(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.Set set, o72.i4 i4Var) {
        boolean z17;
        java.util.List I7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(list, list2, list3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (I7 == null || I7.size() == 0) {
            return arrayList;
        }
        int i17 = 0;
        while (true) {
            int i18 = i17 + 20;
            if (i18 >= I7.size()) {
                i18 = I7.size();
            }
            I7.size();
            java.util.ArrayList wa6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().wa(I7.subList(i17, i18), list4, set, i4Var, o25.x.b(list3));
            if (wa6 != null && wa6.size() > 0) {
                if (list3.contains(8)) {
                    java.util.Iterator it = wa6.iterator();
                    while (it.hasNext()) {
                        o72.r2 r2Var = (o72.r2) it.next();
                        if (r2Var.f67657x2262335f == 18) {
                            try {
                                java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
                                z17 = true;
                                for (int i19 = 1; i19 < linkedList.size(); i19++) {
                                    int i27 = ((r45.gp0) linkedList.get(i19)).I;
                                    if (i27 == 8 || i27 == 10130) {
                                        break;
                                    }
                                }
                            } catch (java.lang.Exception unused) {
                            }
                            z17 = false;
                            if (z17) {
                                arrayList.add(r2Var);
                            }
                        } else {
                            arrayList.add(r2Var);
                        }
                    }
                } else {
                    arrayList.addAll(wa6);
                }
            }
            if (i18 >= I7.size()) {
                return arrayList;
            }
            i17 = i18;
        }
    }

    public static void R0(o72.r2 r2Var) {
        boolean z17;
        o72.a3 a3Var = (o72.a3) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().F(r2Var.f67645x88be67a1);
        if (a3Var == null) {
            a3Var = new o72.a3();
            a3Var.f67888x88be67a1 = r2Var.f67645x88be67a1;
            z17 = true;
        } else {
            z17 = false;
        }
        a3Var.f67890xffe55fe4 = "";
        java.util.Iterator it = r2Var.f67653xef67d413.f466628d.iterator();
        while (it.hasNext()) {
            a3Var.f67890xffe55fe4 += " " + ((java.lang.String) it.next());
        }
        for (java.lang.String str : r2Var.f67653xef67d413.f466629e) {
            a3Var.f67890xffe55fe4 += " " + str;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().a(str);
        }
        a3Var.f67891x2261f6f2 = r2Var.f67659xa783a79b;
        a3Var.f67892x2262335f = r2Var.f67657x2262335f;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().Md(a3Var);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().q7(a3Var, dm.i4.f66867x2a5c95c7);
        }
    }

    public static java.util.ArrayList S(java.util.List list, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(1);
        arrayList4.add(java.lang.Integer.valueOf(i17));
        java.util.ArrayList wa6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().wa(list, arrayList2, null, null, o25.x.b(arrayList4));
        if (wa6 != null && wa6.size() > 0) {
            if (i17 == 8) {
                arrayList.addAll(t(arrayList3, wa6, 8, 8));
            } else if (i17 == 5) {
                arrayList.addAll(t(arrayList3, wa6, 5, 5));
            } else if (i17 == 7) {
                arrayList.addAll(t(arrayList3, wa6, 7, 7));
            } else if (i17 == 6) {
                arrayList.addAll(t(arrayList3, wa6, 6, 6));
            } else if (i17 == 3) {
                arrayList.addAll(t(arrayList3, wa6, 3, 3));
            } else {
                arrayList.addAll(wa6);
            }
        }
        return arrayList;
    }

    public static void S0(o72.e2 e2Var) {
        o72.e2 Xf;
        int Nd = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Nd(e2Var.f67088x958756b0, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, upload data status:%d, favlocalId:%d", java.lang.Integer.valueOf(Nd), java.lang.Long.valueOf(e2Var.f67088x958756b0));
        java.lang.String f17 = o72.s2.f(e2Var.f67088x958756b0);
        o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: localId=%d, dataId=%s, cdnStatus=%d, allStatus=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), e2Var.f67085xf604e54a, java.lang.Integer.valueOf(e2Var.f67093x10a0fed7), java.lang.Integer.valueOf(Nd));
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var.f67088x958756b0);
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "klem updateDownloadStatus iteminfo null");
            o72.s2.p("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: itemInfo is null, localId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0));
            return;
        }
        if (F.R0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus waiting server upload skip.");
            o72.s2.d(f17, "updateUploadStatus: skip waiting server upload, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
            return;
        }
        int i17 = e2Var.f67093x10a0fed7;
        if (i17 == 3 && Nd != i17 && F.f67657x2262335f == 18 && (Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(e2Var.f67085xf604e54a)) != null && Xf.f67093x10a0fed7 == 3) {
            o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: note CDN finished, check update, localId=%d, favId=%d, dataId=%s", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), e2Var.f67085xf604e54a);
            g(e2Var, F);
            return;
        }
        if (Nd == 1) {
            if (F.L0()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(15, e2Var.f67088x958756b0);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(4, e2Var.f67088x958756b0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, continue upload data, favlocalId:%d, favId:%d, itemStatus:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a));
            o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: STATUS_TRANING, continue upload, localId=%d, favId=%d, itemStatus=%d, isNeedModUpload=%b", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a), java.lang.Boolean.valueOf(F.L0()));
            return;
        }
        if (Nd == 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(6, e2Var.f67088x958756b0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus pause, favLocalId:%d, favId:%d, itemStatus:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a));
            o72.s2.p("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: STATUS_PAUSE, upload paused, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            return;
        }
        if (Nd != 3) {
            if (Nd != 4) {
                return;
            }
            if (F.L0()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(16, e2Var.f67088x958756b0);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(6, e2Var.f67088x958756b0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10659, 0, java.lang.Integer.valueOf(F.f67657x2262335f), -5, java.lang.Long.valueOf(N(F)), java.lang.Long.valueOf(o72.v2.a(F.f67645x88be67a1)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus, error, favLocalId:%d, favId:%d, itemStatus:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a));
            long j17 = e2Var.f67088x958756b0;
            o72.s2.j("MicroMsg.Fav.FavApiLogic", f17, "ERR_CDN_UPLOAD_FAILED", "updateUploadStatus", j17, 0, "STATUS_ERROR: CDN upload failed, localId=%d, favId=%d, dataId=%s, isNeedModUpload=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(F.f67643xc8a07680), e2Var.f67085xf604e54a, java.lang.Boolean.valueOf(F.L0()));
            return;
        }
        if (F.f67657x2262335f == 18) {
            o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: STATUS_FINISH, note type, check update, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            g(e2Var, F);
        } else {
            if (F.L0()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(17, e2Var.f67088x958756b0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start mod faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a));
                o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: STATUS_FINISH, start ModService, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).yj().b();
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(9, e2Var.f67088x958756b0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem updateUploadStatus start send faviteminfo, favLocalId:%d, favId:%d, itemStatus:%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67644x3059914a));
            o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "updateUploadStatus: STATUS_FINISH, start SendService, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
            ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
        }
    }

    public static java.lang.String T(long j17) {
        return U(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17));
    }

    public static java.lang.String U(o72.r2 r2Var) {
        r45.bq0 bq0Var;
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<noteinfo><noteauthor>");
        java.lang.String str2 = "";
        if (r2Var == null || (bq0Var = r2Var.f67640x5ab01132) == null || bq0Var.f452497f.size() <= 1) {
            return "";
        }
        r45.sp0 sp0Var = r2Var.f67640x5ab01132.G;
        if (sp0Var != null) {
            java.lang.String str3 = sp0Var.f467425e;
            java.lang.String str4 = sp0Var.f467424d;
            str = str3;
            str2 = str4;
        } else {
            str = "";
        }
        o72.d3 d3Var = o72.d3.f424854a;
        if (!o72.d3.f424855b) {
            sb6.append(str2);
            sb6.append("</noteauthor><noteeditor>");
            sb6.append(str);
            sb6.append("</noteeditor><edittime>");
            sb6.append(r2Var.f67640x5ab01132.A);
            sb6.append("</edittime><editusr>");
            sb6.append(str2);
            sb6.append("</editusr><favlocalid>");
            sb6.append(r2Var.f67645x88be67a1);
            sb6.append("</favlocalid>");
            sb6.append(q72.a.f(r2Var.f67640x5ab01132.f452497f).replace("cdn_dataurl", "cdndataurl").replace("cdn_datakey", "cdndatakey").replace("cdn_thumburl", "cdnthumburl").replace("cdn_thumbkey", "cdnthumbkey").replace("thumbfullsize", "thumbsize").replace("fullsize", "datasize").replace("datasrcname", "sourcename").replace("datasrctime", "sourcetime").replace("stream_lowbandurl", "streamlowbandurl").replace("stream_dataurl", "streamdataurl").replace("stream_weburl", "streamweburl"));
            sb6.append("</noteinfo>");
            return sb6.toString();
        }
        r72.c0 c0Var = new r72.c0();
        c0Var.s(str2);
        c0Var.t(str);
        c0Var.p(r2Var.f67640x5ab01132.A);
        c0Var.q(str2);
        c0Var.r(java.lang.String.valueOf(r2Var.f67645x88be67a1));
        java.util.LinkedList favDataList = r2Var.f67640x5ab01132.f452497f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favDataList, "favDataList");
        c0Var.j().clear();
        java.util.Iterator it = favDataList.iterator();
        while (it.hasNext()) {
            c0Var.j().add(r72.e.b((r45.gp0) it.next()));
        }
        java.lang.String processXml = c0Var.m126747x696739c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processXml, "processXml");
        return r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(processXml, "cdn_dataurl", "cdndataurl", false), "cdn_datakey", "cdndatakey", false), "cdn_thumburl", "cdnthumburl", false), "cdn_thumbkey", "cdnthumbkey", false), "fullsize", "datasize", false), "thumbfullsize", "thumbsize", false), "datasrcname", "sourcename", false), "datasrctime", "sourcetime", false), "stream_lowbandurl", "streamlowbandurl", false), "stream_dataurl", "streamdataurl", false), "stream_weburl", "streamweburl", false), "datasrcheadurl", "sourceheadurl", false);
    }

    public static java.lang.String V(long j17) {
        if (j17 == 0) {
            return "0KB";
        }
        double d17 = j17 * 1.0d;
        double d18 = d17 / 1048576.0d;
        if (d18 >= 1.0d) {
            return java.lang.String.format("%dMB", java.lang.Integer.valueOf((int) d18));
        }
        double d19 = d17 / 1024.0d;
        return d19 >= 1.0d ? java.lang.String.format("%dKB", java.lang.Integer.valueOf((int) d19)) : "1KB";
    }

    public static java.lang.String W(java.lang.String str) {
        return str + "_t";
    }

    public static java.lang.String X(r45.gp0 gp0Var) {
        if (gp0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
            return "";
        }
        java.lang.String W = W(gp0Var.T);
        return new com.p314xaae8f345.mm.vfs.r6(r(W), W).o();
    }

    public static float Y(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static bw5.lp0 Z(r45.gp0 gp0Var, java.lang.String str, java.lang.Boolean bool) {
        r45.hp0 hp0Var = gp0Var.J1;
        r45.xs4 xs4Var = hp0Var != null ? hp0Var.C : null;
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.g(gp0Var.T);
        if (xs4Var == null || xs4Var.m75939xb282bd08(18) <= 0) {
            bw5.v70 v70Var = new bw5.v70();
            v70Var.y(1);
            bw5.z90 z90Var = new bw5.z90();
            java.lang.String str2 = gp0Var.f456937d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            z90Var.E(str2);
            java.lang.String str3 = gp0Var.f456941f;
            if (str3 == null) {
                str3 = "";
            }
            z90Var.C(str3);
            java.lang.String str4 = gp0Var.A;
            if (str4 == null) {
                str4 = "";
            }
            z90Var.B(str4);
            java.lang.String str5 = gp0Var.C;
            if (str5 == null) {
                str5 = "";
            }
            z90Var.z(str5);
            if (str == null) {
                str = "";
            }
            z90Var.y(str);
            java.lang.String str6 = gp0Var.f456954m2;
            java.lang.String str7 = gp0Var.G;
            if (str7 == null) {
                str7 = "";
            }
            if (str6 == null) {
                str6 = str7;
            }
            z90Var.r(str6);
            java.lang.String str8 = gp0Var.f456958o2;
            if (str8 == null) {
                str8 = "";
            }
            z90Var.x(str8);
            if (xs4Var != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(16))) {
                    z90Var.r(xs4Var.m75945x2fec8307(16));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(15))) {
                    z90Var.x(xs4Var.m75945x2fec8307(15));
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(4))) {
                    z90Var.C(xs4Var.m75945x2fec8307(4));
                }
                java.lang.String m75945x2fec8307 = xs4Var.m75945x2fec8307(11);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                z90Var.A(m75945x2fec8307);
                java.lang.String m75945x2fec83072 = xs4Var.m75945x2fec8307(9);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                z90Var.w(m75945x2fec83072);
                java.lang.String m75945x2fec83073 = xs4Var.m75945x2fec8307(6);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                z90Var.t(m75945x2fec83073);
                java.lang.String m75945x2fec83074 = xs4Var.m75945x2fec8307(5);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                z90Var.q(m75945x2fec83074);
                z90Var.s(xs4Var.m75939xb282bd08(10));
                java.lang.String m75945x2fec83075 = xs4Var.m75945x2fec8307(7);
                if (m75945x2fec83075 == null) {
                    m75945x2fec83075 = "";
                }
                z90Var.u(m75945x2fec83075);
            }
            java.lang.String o17 = z90Var.o();
            if (o17 == null) {
                o17 = "";
            }
            v70Var.p(o17);
            java.lang.String l17 = z90Var.l();
            if (l17 == null) {
                l17 = "";
            }
            v70Var.x(l17);
            java.lang.String c17 = z90Var.c();
            v70Var.q(c17 != null ? c17 : "");
            v70Var.w(z90Var);
            lp0Var.j(v70Var);
        } else {
            bw5.v70 c18 = rk4.l5.c(xs4Var.m75945x2fec8307(19));
            if (c18 != null) {
                lp0Var.j(c18);
            }
        }
        return lp0Var;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str2;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str;
        }
        return str + "\u200b" + str2;
    }

    public static long a0() {
        return ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_FAV_TOTAL_CAPACITY_LONG, 0L)).longValue();
    }

    public static long b(o72.r2 r2Var) {
        int[] iArr = o72.a.f424835a;
        int i17 = 0;
        while (true) {
            long j17 = 0;
            if (i17 >= 7) {
                return 0L;
            }
            if (iArr[i17] == r2Var.f67657x2262335f) {
                r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                if (bq0Var != null) {
                    java.util.Iterator it = bq0Var.f452497f.iterator();
                    while (it.hasNext()) {
                        j17 += ((r45.gp0) it.next()).R;
                    }
                }
                r2Var.f67637x73e2be56 = j17;
                return j17;
            }
            i17++;
        }
    }

    public static long b0() {
        return ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_FAV_USED_CAPACITY_LONG, 0L)).longValue();
    }

    public static boolean c(r45.gp0 gp0Var, int i17, o72.e2 e2Var) {
        if (e2Var == null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], type:%d, cdnType:%d", gp0Var.T, java.lang.Integer.valueOf(gp0Var.I), java.lang.Integer.valueOf(i17));
        if (e2Var.f67095x2262335f == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "cdn info exist, return 1");
            return false;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "cdn info exist, return 2");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "cdn info exist, delete");
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9951xb06685ab(e2Var, "dataId");
        return true;
    }

    public static int c0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals("speex")) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals("silk")) ? 0 : 2;
        }
        return 1;
    }

    public static boolean d(o72.r2 r2Var) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.f67645x88be67a1) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d0(r45.gp0 r9, o72.r2 r10, int r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.x1.d0(r45.gp0, o72.r2, int, boolean):void");
    }

    public static void e(o72.r2 r2Var) {
        if (r2Var == null) {
            return;
        }
        r45.sp0 sp0Var = r2Var.f67640x5ab01132.G;
        if ((sp0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sp0Var.f467425e)) && r2Var.f67657x2262335f == 18) {
            if (r2Var.f67640x5ab01132.f452495d.f459567d == 6) {
                G0(r2Var, false);
            } else {
                G0(r2Var, true);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
        }
    }

    public static void e0(r45.gp0 gp0Var, o72.r2 r2Var, int i17) {
        if (i17 == 1 && (gp0Var.f456951l1 <= 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456953m) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456945h))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type recv, cdndataurl must not be null!");
            return;
        }
        if (i17 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X(gp0Var))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo, type send, path must not be null!");
            return;
        }
        java.lang.String W = W(gp0Var.T);
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(W);
        if (f425049b) {
            if (!c(gp0Var, i17, Xf)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "insertCdnThumbInfo cdn info exist, return");
                return;
            }
        } else if (Xf != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "cdn info exist, id[%s], return", W);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "insert cdn thumb info, fav local id[%d] fav id[%d] dataId:[%s]", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), gp0Var.T);
        o72.e2 e2Var = new o72.e2();
        e2Var.f67083xf47749d7 = gp0Var.f456953m;
        e2Var.f67084xf47770e7 = gp0Var.f456945h;
        e2Var.f67085xf604e54a = W;
        e2Var.f67088x958756b0 = r2Var.f67645x88be67a1;
        e2Var.f67094xeb1a61d6 = (int) gp0Var.f456951l1;
        e2Var.f67095x2262335f = i17;
        e2Var.f67093x10a0fed7 = 1;
        e2Var.f67091x2260084a = X(gp0Var);
        e2Var.f67089x15b870c = c01.id.c();
        e2Var.f67082x3ec1f6a2 |= 1;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo880xb970c2b9(e2Var);
        if (i17 == 1) {
            P0(e2Var);
        } else {
            S0(e2Var);
        }
    }

    public static synchronized void f(o72.r2 r2Var) {
        synchronized (o72.x1.class) {
            if (q(r2Var)) {
                java.lang.String T = T(r2Var.f67645x88be67a1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "checkUpdateSnsNotePostXml, resend favlocal id:%d,xml:%s", java.lang.Long.valueOf(r2Var.f67645x88be67a1), T);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5934xfda57620 c5934xfda57620 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5934xfda57620();
                am.ur urVar = c5934xfda57620.f136238g;
                java.util.HashMap hashMap = f425050c;
                urVar.f89661a = (java.util.ArrayList) hashMap.get(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                c5934xfda57620.f136238g.f89662b = T;
                c5934xfda57620.e();
                hashMap.remove(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
            }
        }
    }

    public static boolean f0(o72.r2 r2Var) {
        boolean z17 = false;
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "isAllSourceUploaded: false itemInfo null");
            return false;
        }
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i17 = gp0Var.I;
            if (i17 == 8 || i17 == 10130 || i17 == 4 || i17 == 2 || i17 == 3) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "isAllSourceUploaded: false, cdnDataUrl:%s, cdnDataKey:%s, localId:%d, dataType:%d, dataId:%s", gp0Var.f456967s, gp0Var.f456971u, java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(gp0Var.I), gp0Var.T);
                    break;
                }
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "isAllSourceUploaded: canPost:%b, localId:%d, dataItemCount:%d", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(linkedList.size()));
        return z17;
    }

    public static void g(o72.e2 e2Var, o72.r2 r2Var) {
        java.lang.String f17 = o72.s2.f(e2Var.f67088x958756b0);
        java.util.Iterator it = r2Var.f67640x5ab01132.f452497f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            int i18 = gp0Var.I;
            if (i18 != 1 && i18 != 6 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s)) {
                i17++;
            }
        }
        o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "checkUpdateWNNoteFav: localId=%d, favId=%d, totalDataItems=%d, notUploadCount=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Integer.valueOf(r2Var.f67640x5ab01132.f452497f.size()), java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            o72.s2.d(f17, "checkUpdateWNNoteFav: waiting for upload, localId=%d, favId=%d, remainCount=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Integer.valueOf(i17));
            return;
        }
        o72.d3 d3Var = o72.d3.f424854a;
        if (o72.d3.f424858e) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var.f67088x958756b0);
            if (F.f67643xc8a07680 > 0 && F.f67644x3059914a == 10) {
                o72.s2.p("MicroMsg.Fav.FavApiLogic", f17, "checkUpdateWNNoteFav: item is done, do not need mod, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(F.f67643xc8a07680));
                return;
            }
        }
        if (r2Var.f67643xc8a07680 > 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(17, e2Var.f67088x958756b0);
            o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "checkUpdateWNNoteFav: all uploaded, start ModService, localId=%d, favId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).yj().b();
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().d5(9, e2Var.f67088x958756b0);
            o72.s2.g("MicroMsg.Fav.FavApiLogic", f17, "checkUpdateWNNoteFav: all uploaded, start SendService, localId=%d", java.lang.Long.valueOf(e2Var.f67088x958756b0));
            ((a82.h2) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).b();
        }
    }

    public static boolean g0() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20235x47cff037()) == 1;
    }

    public static java.lang.String h(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(I() + kk.k.g(str.getBytes()));
        if (r6Var.m()) {
            return r6Var.o();
        }
        return null;
    }

    public static boolean h0(int i17) {
        return i17 == 17 || i17 == 21 || i17 == 35;
    }

    public static void i(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f) {
        java.util.LinkedList linkedList;
        r45.bq0 bq0Var;
        am.z9 z9Var = c5432x35bb364f.f135776g;
        int i17 = z9Var.f90073m;
        java.lang.String str = "";
        am.z9 z9Var2 = c5432x35bb364f.f135776g;
        am.aa aaVar = c5432x35bb364f.f135777h;
        if (i17 == 1) {
            aaVar.f87669c = T(z9Var.f90065e);
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var2.f90065e);
            if (F != null && (bq0Var = F.f67640x5ab01132) != null && (F.f67657x2262335f != 18 || bq0Var.f452497f.size() > 1)) {
                java.util.Iterator it = F.f67640x5ab01132.f452497f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r45.gp0 gp0Var = (r45.gp0) it.next();
                    if (gp0Var.I == 2) {
                        java.lang.String X = X(gp0Var);
                        if (!com.p314xaae8f345.mm.vfs.w6.j(X)) {
                            java.lang.String x17 = x(gp0Var);
                            if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(x17, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, X, true);
                                str = X(gp0Var);
                            } else if (gp0Var.f456947i) {
                                A0(F, gp0Var, true);
                            } else if (gp0Var.f456969t) {
                                y0(F, gp0Var, true);
                                str = x17;
                            }
                        }
                        str = X;
                    }
                }
            }
            aaVar.f87670d = str;
            long j17 = z9Var2.f90065e;
            java.lang.String str2 = aaVar.f87669c;
            return;
        }
        if (i17 == 2) {
            o72.r2 r2Var = new o72.r2();
            r2Var.f67657x2262335f = 2;
            r45.gp0 gp0Var2 = new r45.gp0();
            gp0Var2.e0(o72.d2.d(gp0Var2.toString(), 2));
            java.lang.String x18 = x(gp0Var2);
            gp0Var2.A0(x18);
            gp0Var2.h0(2);
            r2Var.f67640x5ab01132.f452497f.add(gp0Var2);
            aaVar.f87669c = o72.r2.G0(r2Var);
            aaVar.f87670d = x18;
            return;
        }
        if (i17 == 3) {
            o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var2.f90065e);
            if (F2 != null) {
                aaVar.f87669c = c01.z1.r() + ";" + F2.f67642xd3939c3a + ";" + F2.f67659xa783a79b;
                return;
            }
            return;
        }
        if (i17 == 4) {
            o72.r2 r07 = r0(z9Var.f90063c);
            if (r07 == null) {
                return;
            }
            r45.bq0 bq0Var2 = r07.f67640x5ab01132;
            if (bq0Var2 != null && (linkedList = bq0Var2.f452497f) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.gp0 gp0Var3 = (r45.gp0) it6.next();
                    if (gp0Var3.I == 20) {
                        gp0Var3.z0(true);
                        gp0Var3.x0(true);
                        gp0Var3.A0("");
                        gp0Var3.b0("");
                        gp0Var3.a0("");
                        gp0Var3.d0("");
                        gp0Var3.c0("");
                    }
                }
            }
            z9Var2.f90064d = r07.f67640x5ab01132;
            return;
        }
        if (i17 != 5) {
            if (i17 != 6) {
                o72.r2 r2Var2 = new o72.r2();
                r2Var2.f67657x2262335f = 18;
                r2Var2.f67640x5ab01132 = z9Var2.f90064d;
                aaVar.f87669c = o72.r2.G0(r2Var2);
                return;
            }
            o72.r2 F3 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var2.f90065e);
            if (F3 == null) {
                aaVar.f87667a = 0;
                return;
            } else {
                aaVar.f87667a = F3.f67643xc8a07680 > 0 ? 1 : 0;
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z9Var.f90063c)) {
            aaVar.f87667a = -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: -1, xml null");
            return;
        }
        o72.r2 r08 = r0(z9Var2.f90063c);
        if (r08 == null || r08.f67645x88be67a1 <= 0) {
            aaVar.f87667a = -1;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(r08 == null);
            objArr[1] = java.lang.Long.valueOf(r08 == null ? -1L : r08.f67645x88be67a1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: -1, itemInfoFromXml null[%b], localId [%s]", objArr);
            return;
        }
        boolean f07 = f0(r08);
        java.lang.String str3 = z9Var2.f90072l;
        java.util.HashMap hashMap = f425050c;
        if (f07) {
            aaVar.f87667a = 1;
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(java.lang.Long.valueOf(r08.f67645x88be67a1));
            if (arrayList != null) {
                if (arrayList.contains(str3)) {
                    arrayList.remove(str3);
                }
                if (arrayList.size() == 0) {
                    hashMap.remove(java.lang.Long.valueOf(r08.f67645x88be67a1));
                }
            }
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Long.valueOf(r08.f67645x88be67a1);
            objArr2[1] = str3;
            objArr2[2] = java.lang.Integer.valueOf(hashMap.get(java.lang.Long.valueOf(r08.f67645x88be67a1)) != null ? ((java.util.ArrayList) hashMap.get(java.lang.Long.valueOf(r08.f67645x88be67a1))).size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: 1, isReadyToPost, localId:%d, snsId:%s, idListCount:%d", objArr2);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: -1, snsId empty");
            aaVar.f87667a = -1;
            return;
        }
        long j18 = r08.f67645x88be67a1;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) hashMap.get(java.lang.Long.valueOf(j18));
        if (arrayList2 == null) {
            arrayList2 = new java.util.ArrayList();
        }
        arrayList2.add(str3);
        hashMap.put(java.lang.Long.valueOf(j18), arrayList2);
        o72.r2 F4 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j18);
        if (F4 == null || F4.f67645x88be67a1 <= 0) {
            aaVar.f87667a = -1;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            objArr3[0] = java.lang.Long.valueOf(F4 == null ? -1L : F4.f67645x88be67a1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: -1, itemInfo err localId=%s", objArr3);
            return;
        }
        boolean f08 = f0(F4);
        if (!f08 && F4.f67644x3059914a != 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: -1, default, favLocalId:%s", java.lang.Long.valueOf(r08.f67645x88be67a1));
            aaVar.f87667a = -1;
            return;
        }
        if (!((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi() || !q(F4)) {
            aaVar.f87667a = -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: -1 isReadyToPost:%b, favLocalId:%d, itemStatus:%d", java.lang.Boolean.valueOf(f08), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(F4.f67644x3059914a));
            gm0.j1.e().k(new o72.y1(F4), 500L);
            return;
        }
        aaVar.f87667a = 2;
        aaVar.f87669c = T(F4.f67645x88be67a1);
        java.lang.Object[] objArr4 = new java.lang.Object[4];
        objArr4[0] = java.lang.Boolean.valueOf(f08);
        objArr4[1] = java.lang.Long.valueOf(F4.f67645x88be67a1);
        objArr4[2] = str3;
        objArr4[3] = java.lang.Integer.valueOf(hashMap.get(java.lang.Long.valueOf(F4.f67645x88be67a1)) != null ? ((java.util.ArrayList) hashMap.get(java.lang.Long.valueOf(F4.f67645x88be67a1))).size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "checkSnsNoteCanPost: 2, isReadyToPost:%b, localId:%d, snsId:%s, idListCount:%d", objArr4);
    }

    public static boolean i0(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(x(gp0Var));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public static void j(dm.n3 n3Var) {
        java.util.Set set = o72.p5.f424974b;
        java.util.LinkedList linkedList = n3Var.f67640x5ab01132.f452497f;
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            java.lang.String X = X((r45.gp0) linkedList.get(i17));
            if (set == null || !((java.util.HashSet) set).contains(X)) {
                com.p314xaae8f345.mm.vfs.w6.h(X);
            }
            java.lang.String x17 = x((r45.gp0) linkedList.get(i17));
            if (set == null || !((java.util.HashSet) set).contains(x17)) {
                com.p314xaae8f345.mm.vfs.w6.h(x17);
            }
            r45.gp0 gp0Var = (r45.gp0) linkedList.get(i17);
            r45.hp0 hp0Var = gp0Var.J1;
            if (hp0Var != null && hp0Var.f457903x != null) {
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String str = gp0Var.T;
                ((vf0.y1) x1Var).getClass();
                t21.d3.e(str);
            }
        }
    }

    public static boolean j0() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_entry, 0) != 1) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_no_support_share_switch, 0) == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(dm.n3 n3Var, java.lang.Runnable runnable, int i17) {
        return l(n3Var, true, runnable, i17, null);
    }

    public static boolean k0(r45.gp0 gp0Var) {
        java.lang.String str = gp0Var.T;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        bw5.lp0 Z = Z(gp0Var, "", java.lang.Boolean.TRUE);
        return str.equals(((rk4.a) ((qk.k6) i95.n0.c(qk.k6.class))).Ni(6, null, Z.d().m13170xcc16feb8(), null, null));
    }

    public static boolean l(dm.n3 n3Var, boolean z17, java.lang.Runnable runnable, int i17, o72.t2 t2Var) {
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            return false;
        }
        boolean z18 = android.os.Looper.myLooper() != android.os.Looper.getMainLooper();
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "deleteFavItem execute favid:%d, localId:%d, needBatchDel:%B, isInWorkerThread:%s" + b17, java.lang.Integer.valueOf(n3Var.f67643xc8a07680), java.lang.Long.valueOf(n3Var.f67645x88be67a1), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z18) {
            m(n3Var, z17, b17, i17);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            o(n3Var);
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new o72.z1(n3Var, z17, b17, i17, runnable));
        }
        if (i17 != 2 && i17 != 4 && i17 != 30 && i17 != 31) {
            x0(n3Var, t2Var);
        }
        return true;
    }

    public static boolean l0(o72.r2 r2Var) {
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "[isReceiveStatus] item == null, isReceiveStatus = false");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "[isReceiveStatus] item.field_itemStatus = " + r2Var.f67644x3059914a);
        int i17 = r2Var.f67644x3059914a;
        return i17 == 8 || i17 == 10 || i17 == 7;
    }

    public static void m(dm.n3 n3Var, boolean z17, java.lang.String str, int i17) {
        j(n3Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().m3(n3Var.f67645x88be67a1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Re(n3Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().fg(n3Var.f67645x88be67a1);
        o72.r2 r2Var = (o72.r2) n3Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().f(r2Var);
        if (z17) {
            java.util.Set Q = Q();
            ((java.util.HashSet) Q).add(n3Var.f67643xc8a07680 + "");
            F0(Q);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(java.lang.Integer.valueOf(n3Var.f67643xc8a07680), n3Var.f67656xf4031e77);
            p(hashMap);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).ij().c(r2Var, str, i17, z17 ? 3 : 2);
        if (n3Var.f67657x2262335f == 18) {
            long j17 = n3Var.f67645x88be67a1;
            if (j17 <= 0) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5295x2e8a4bd7 c5295x2e8a4bd7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5295x2e8a4bd7();
            c5295x2e8a4bd7.f135616g.f89702a = j17;
            c5295x2e8a4bd7.e();
        }
    }

    public static boolean m0() {
        return a0() != 0 && K() < 52428800;
    }

    public static boolean n(java.util.List list, int i17, java.util.Map map) {
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "delete fav item fail, item is null");
            return false;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "deleteFavItems execute items:%s" + b17, java.lang.Integer.valueOf(list.size()));
        java.util.Set Q = Q();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            j(r2Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().m3(r2Var.f67645x88be67a1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Re(r2Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().fg(r2Var.f67645x88be67a1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().f(r2Var);
            ((java.util.HashSet) Q).add(r2Var.f67643xc8a07680 + "");
            if (i17 != 2 && i17 != 4 && i17 != 30 && i17 != 31) {
                x0(r2Var, map != null ? (o72.t2) map.get(java.lang.Long.valueOf(r2Var.f67645x88be67a1)) : null);
            }
        }
        F0(Q);
        p(new java.util.HashMap());
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).ij().b(list, b17, i17, 3);
        return true;
    }

    public static boolean n0() {
        return a0() != 0 && K() < 10485760;
    }

    public static void o(dm.n3 n3Var) {
        if (n3Var != null && 5 == n3Var.f67657x2262335f) {
            r45.bq0 bq0Var = n3Var.f67640x5ab01132;
            r45.tq0 tq0Var = bq0Var.f452501m;
            java.lang.String str = tq0Var != null ? tq0Var.f468201h : "";
            if (bq0Var.f452495d != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = n3Var.f67640x5ab01132.f452495d.f459585y;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5424xcd4b49b4 c5424xcd4b49b4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5424xcd4b49b4();
            c5424xcd4b49b4.f135768g.f89335a = str;
            c5424xcd4b49b4.e();
        }
    }

    public static void o0(o72.r2 r2Var, int i17) {
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "modeTag, item info is null");
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.bo4 bo4Var = new r45.bo4();
        bo4Var.f452451d = 4;
        bo4Var.f452452e = 0;
        linkedList.add(bo4Var);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.eo4 eo4Var = new r45.eo4();
        eo4Var.f455155d = "favitem.taglist";
        boolean z17 = true;
        eo4Var.f455158g = 1;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int size = r2Var.f67653xef67d413.f466629e.size();
        for (int i18 = 0; i18 < size; i18++) {
            stringBuffer.append("<tag>");
            stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p((java.lang.String) r2Var.f67653xef67d413.f466629e.get(i18)));
            stringBuffer.append("</tag>");
        }
        eo4Var.f455157f = stringBuffer.toString();
        linkedList2.add(eo4Var);
        if (r2Var.f67643xc8a07680 > 0) {
            gm0.j1.d().g(new o72.l5(r2Var, linkedList, linkedList2));
            o72.v2.f(r2Var.f67643xc8a07680, size, i17);
            return;
        }
        a82.w0 bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).bj();
        long j17 = r2Var.f67645x88be67a1;
        bj6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavEditService", "addTag %d", java.lang.Long.valueOf(j17));
        o72.m2 c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().c1(j17, 0);
        if (c17 == null) {
            c17 = new o72.m2();
        } else {
            z17 = false;
        }
        c17.f67419x88be67a1 = j17;
        r45.kp0 kp0Var = new r45.kp0();
        kp0Var.f460421d = linkedList;
        kp0Var.f460422e = linkedList2;
        c17.f67420xbda7f2f0 = kp0Var;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c17.f67422x2261f6f2 = java.lang.System.currentTimeMillis();
        c17.f67423x2262335f = 0;
        c17.f67421x29cbf907 = i17;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().M1(c17);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).nj().i7(c17, dm.i4.f66867x2a5c95c7);
        }
        gm0.j1.e().j(new a82.t0(bj6));
    }

    public static void p(java.util.Map map) {
        java.util.Set Q = Q();
        java.util.HashSet hashSet = (java.util.HashSet) Q;
        if (hashSet.size() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "doBatchDel idList:%s", Q.toString());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                linkedList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) it.next(), 0)));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.FavApiLogic", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "doBatchDel parseInt error:%s", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "doBatchDel after parse, total size %d", java.lang.Integer.valueOf(linkedList.size()));
        if (linkedList.size() > 0) {
            gm0.j1.d().g(new o72.i5(linkedList, map));
        }
    }

    public static boolean p0(bw5.ar0 ar0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "playLocalFileWithTing title: %s, fileExt: %s, filePath: %s", str2, str, str3);
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str3, false);
        if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "playLocalFileWithTing filePath not exist: %s", i17);
            return false;
        }
        if (!((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(str)) {
            return false;
        }
        bw5.l80 wi6 = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).wi(str3, str, str2, null);
        il4.e eVar = new il4.e();
        eVar.f373639c = ar0Var.f106955d;
        eVar.f373640d = false;
        return ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ni(wi6, eVar);
    }

    public static synchronized boolean q(o72.r2 r2Var) {
        synchronized (o72.x1.class) {
            if (r2Var != null) {
                if (r2Var.f67657x2262335f == 18) {
                    java.util.HashMap hashMap = f425050c;
                    if (!hashMap.containsKey(java.lang.Long.valueOf(r2Var.f67645x88be67a1))) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "enableUpdateSnsNotePostXml: err favLocalId %s, mLocalIdToSnsId size %d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(hashMap.size()));
                        return false;
                    }
                    if (hashMap.get(java.lang.Long.valueOf(r2Var.f67645x88be67a1)) != null && !((java.util.ArrayList) hashMap.get(java.lang.Long.valueOf(r2Var.f67645x88be67a1))).isEmpty()) {
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "enableUpdateSnsNotePostXml: err mLocalIdToSnsId null or size 0, localId:%d", java.lang.Long.valueOf(r2Var.f67645x88be67a1));
                    return false;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "enableUpdateSnsNotePostXml: err not note ");
            return false;
        }
    }

    public static void q0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Intent intent) {
        o72.r2 r07 = r0(str);
        if (r07 == null) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        am.zl zlVar = c5773x64e6b625.f136087g;
        zlVar.f90111a = 2;
        zlVar.f56x88be67a1 = -1L;
        zlVar.f90114d = context;
        zlVar.f90121k = 4;
        zlVar.f90122l = true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("noteauthor", r07.f67640x5ab01132.G.f467424d);
        bundle.putString("noteeditor", r07.f67640x5ab01132.G.f467425e);
        bundle.putLong("edittime", r07.f67640x5ab01132.A);
        bundle.putString("notexml", o72.r2.G0(r07));
        bundle.putString("snslocalid", str2);
        bundle.putString("snsthumbpath", str3);
        bundle.putString("snsnotelinkxml", str);
        if (intent != null) {
            bundle.putString("serverMsgID", intent.getStringExtra("serverMsgID"));
            bundle.putString("geta8key_username", intent.getStringExtra("geta8key_username"));
        }
        am.zl zlVar2 = c5773x64e6b625.f136087g;
        zlVar2.f90118h = bundle;
        zlVar2.f55x5ab01132 = r07.f67640x5ab01132;
        c5773x64e6b625.e();
    }

    public static com.p314xaae8f345.mm.vfs.r6 r(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s/%d/", C(), java.lang.Integer.valueOf(str.hashCode() & 255)));
        if (!r6Var.m() || !r6Var.y()) {
            r6Var.J();
        }
        return r6Var;
    }

    public static o72.r2 r0(java.lang.String str) {
        java.lang.String str2;
        o72.r2 r2Var;
        java.lang.String str3;
        java.util.LinkedList linkedList;
        o72.d3 d3Var = o72.d3.f424854a;
        if (o72.d3.f424855b) {
            if (str == null || str.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml but xml is null");
                return null;
            }
            java.lang.String t17 = r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(r26.i0.t(str, "cdndataurl", "cdn_dataurl", false), "cdndatakey", "cdn_datakey", false), "cdnthumburl", "cdn_thumburl", false), "cdnthumbkey", "cdn_thumbkey", false), "datasize", "fullsize", false), "thumbsize", "thumbfullsize", false), "sourcename", "datasrcname", false), "sourcetime", "datasrctime", false), "streamlowbandurl", "stream_lowbandurl", false), "streamdataurl", "stream_dataurl", false), "streamweburl", "stream_weburl", false), "sourceheadurl", "datasrcheadurl", false);
            r72.c0 c0Var = new r72.c0();
            c0Var.m126728xdc93280d(t17);
            o72.r2 r2Var2 = new o72.r2();
            r2Var2.W0();
            r45.bq0 bq0Var = r2Var2.f67640x5ab01132;
            if (c0Var.j().size() != 0 && (linkedList = bq0Var.f452497f) != null) {
                linkedList.clear();
                java.util.Iterator it = c0Var.j().iterator();
                while (it.hasNext()) {
                    r72.d dVar = (r72.d) it.next();
                    java.util.LinkedList linkedList2 = bq0Var.f452497f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                    linkedList2.add(r72.e.a(dVar));
                }
            }
            r45.sp0 sp0Var = new r45.sp0();
            java.lang.String o17 = c0Var.o();
            if (o17 == null) {
                o17 = "";
            }
            sp0Var.f467425e = o17;
            java.lang.String n17 = c0Var.n();
            if (n17 == null) {
                n17 = "";
            }
            sp0Var.f467424d = n17;
            r2Var2.f67640x5ab01132.l(sp0Var);
            r2Var2.f67640x5ab01132.g(c0Var.k());
            r2Var2.f67657x2262335f = 18;
            r2Var2.f67645x88be67a1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(c0Var.l(), java.lang.System.currentTimeMillis());
            return r2Var2;
        }
        if (str == null) {
            str2 = "MicroMsg.Fav.FavApiLogic";
            r2Var = null;
            str3 = "parseSnsNoteInfoXml but xml is null";
        } else {
            if (!str.equals("")) {
                java.lang.String replace = str.replace("cdndataurl", "cdn_dataurl").replace("cdndatakey", "cdn_datakey").replace("cdnthumburl", "cdn_thumburl").replace("cdnthumbkey", "cdn_thumbkey").replace("datasize", "fullsize").replace("thumbsize", "thumbfullsize").replace("sourcename", "datasrcname").replace("sourcetime", "datasrctime").replace("streamlowbandurl", "stream_lowbandurl").replace("streamdataurl", "stream_dataurl").replace("streamweburl", "stream_weburl");
                if (!replace.startsWith("<noteinfo>")) {
                    replace = "<noteinfo>" + replace + "</noteinfo>";
                }
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(replace, "noteinfo", null);
                if (d17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml, FavItemInfo maps null");
                    return null;
                }
                o72.r2 r2Var3 = new o72.r2();
                try {
                    r2Var3.f67640x5ab01132 = new r45.bq0();
                    r2Var3.f67657x2262335f = 18;
                    r2Var3.f67640x5ab01132.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".noteinfo.edittime"), 0L));
                    r45.sp0 sp0Var2 = new r45.sp0();
                    sp0Var2.f467425e = (java.lang.String) d17.get(".noteinfo.noteeditor");
                    sp0Var2.f467424d = (java.lang.String) d17.get(".noteinfo.noteauthor");
                    r2Var3.f67640x5ab01132.l(sp0Var2);
                    r2Var3.f67645x88be67a1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".noteinfo.favlocalid"), java.lang.System.currentTimeMillis());
                    q72.c.b(replace, r2Var3.f67640x5ab01132);
                    return r2Var3;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.FavApiLogic", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "parseSnsNoteInfoXml , FavItemInfo exception:+%s", e17.toString());
                    return null;
                }
            }
            str2 = "MicroMsg.Fav.FavApiLogic";
            str3 = "parseSnsNoteInfoXml but xml is null";
            r2Var = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, str3);
        return r2Var;
    }

    public static java.lang.String s(r45.gp0 gp0Var) {
        r45.hp0 hp0Var = gp0Var.J1;
        int i17 = gp0Var.I;
        if (i17 == 10130) {
            i17 = 8;
        }
        if (i17 == 1) {
            return a("", gp0Var.f456941f);
        }
        if (i17 == 8) {
            return a("", hp0Var.f457892m);
        }
        if (i17 == 33) {
            java.lang.String a17 = a("", hp0Var.f457892m);
            r45.km6 km6Var = hp0Var.G;
            if (km6Var == null) {
                return a17;
            }
            java.lang.String n17 = il4.d.n(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, km6Var);
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17) ? a(a17, n17) : a17;
        }
        if (i17 == 4) {
            r45.mq0 mq0Var = hp0Var.f457890h;
            return mq0Var != null ? a("", mq0Var.f462268d) : "";
        }
        if (i17 == 5) {
            r45.tq0 tq0Var = hp0Var.f457888f;
            return tq0Var != null ? a("", tq0Var.f468197d) : "";
        }
        if (i17 == 6) {
            java.lang.String a18 = a("", hp0Var.f457891i);
            r45.pp0 pp0Var = hp0Var.f457887e;
            return pp0Var != null ? a(a(a18, pp0Var.f464807o), hp0Var.f457887e.f464805m) : a18;
        }
        if (i17 != 10 && i17 != 11) {
            return a(a("", hp0Var.f457892m), hp0Var.f457893n);
        }
        r45.aq0 aq0Var = hp0Var.f457889g;
        return aq0Var != null ? a(a("", aq0Var.f451721d), hp0Var.f457889g.f451723f) : "";
    }

    public static void s0(android.content.Context context, r45.gp0 gp0Var, java.lang.String str, java.lang.Boolean bool, boolean z17, bw5.ar0 ar0Var, java.lang.String str2, java.lang.Boolean bool2, java.lang.String str3, java.lang.String str4) {
        bw5.o50 o50Var;
        bw5.lp0 Z = Z(gp0Var, str, bool);
        boolean booleanValue = bool.booleanValue();
        int i17 = ar0Var.f106955d;
        il4.e eVar = new il4.e();
        eVar.f373639c = i17;
        eVar.f373640d = booleanValue;
        eVar.f373660x = bw5.x2.BizAudioEnterScene_CollectionListen;
        eVar.f373647k = str2 == null ? "" : str2;
        boolean booleanValue2 = bool2.booleanValue();
        il4.f fVar = eVar.f373655s;
        if (booleanValue2) {
            fVar.f373665d.put("chat", eVar.f373647k);
        } else {
            fVar.f373665d.put("favid", eVar.f373647k);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            fVar.f373665d.put("msgid", str3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            fVar.f373665d.put("sourceuser", str4);
        }
        if (bool2.booleanValue() || !F()) {
            o50Var = null;
        } else if (il4.l.g(Z.d().f115722e)) {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            o50Var = new bw5.o50();
            o50Var.i("1025");
            o50Var.k(16);
            o50Var.j(1);
        } else {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            o50Var = new bw5.o50();
            o50Var.i("1024");
            o50Var.k(0);
            o50Var.j(1);
        }
        ((rk4.a) ((qk.k6) i95.n0.c(qk.k6.class))).Ri(context, z17, Z, eVar, o50Var, null, ar0Var, null, java.lang.Boolean.FALSE, null, null);
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ri(Z, ar0Var);
    }

    public static java.util.ArrayList t(java.util.List list, java.util.ArrayList arrayList, int i17, int i18) {
        boolean z17;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            int i19 = r2Var.f67657x2262335f;
            if (i19 == 18 || i19 == 14) {
                try {
                    java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
                    for (int i27 = i19 == 18 ? 1 : 0; i27 < linkedList.size(); i27++) {
                        r45.gp0 gp0Var = (r45.gp0) linkedList.get(i27);
                        int i28 = gp0Var.I;
                        if (i28 == i17 || (i17 == 8 && i28 == 10130)) {
                            java.lang.String str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456937d) ? gp0Var.f456937d : gp0Var.f456941f;
                            if (list != null && !list.isEmpty() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                java.util.Iterator it6 = list.iterator();
                                while (true) {
                                    if (!it6.hasNext()) {
                                        z17 = false;
                                        break;
                                    }
                                    if (str.contains((java.lang.String) it6.next())) {
                                        z17 = true;
                                        break;
                                    }
                                }
                                if (!z17) {
                                }
                            }
                            o72.r2 m150781x5a5dd5d = r2Var.m150781x5a5dd5d();
                            m150781x5a5dd5d.f67657x2262335f = i18;
                            m150781x5a5dd5d.B1 = true;
                            m150781x5a5dd5d.C1 = r2Var;
                            m150781x5a5dd5d.D1 = r2Var.f67645x88be67a1 + "_" + gp0Var.T;
                            m150781x5a5dd5d.E1 = gp0Var.T;
                            r45.bq0 a17 = q72.c.a(r2Var.f67640x5ab01132);
                            m150781x5a5dd5d.f67640x5ab01132 = a17;
                            a17.f452497f = new java.util.LinkedList();
                            m150781x5a5dd5d.f67640x5ab01132.f452497f.add(gp0Var);
                            m150781x5a5dd5d.f67640x5ab01132.p(gp0Var.f456937d);
                            r45.hp0 hp0Var = gp0Var.J1;
                            if (hp0Var != null) {
                                if (i17 == 6) {
                                    m150781x5a5dd5d.f67640x5ab01132.j(hp0Var.f457887e);
                                } else if (i17 == 5) {
                                    m150781x5a5dd5d.f67640x5ab01132.r(hp0Var.f457888f);
                                }
                            }
                            arrayList2.add(m150781x5a5dd5d);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogic", "getSearchList() [%s] Exception:%s %s", java.lang.Integer.valueOf(i17), e17.getClass().getSimpleName(), e17.getMessage());
                }
            } else {
                arrayList2.add(r2Var);
            }
        }
        return arrayList2;
    }

    public static boolean t0(bw5.ar0 ar0Var, r45.gp0 gp0Var, java.lang.String str) {
        if (gp0Var == null) {
            return false;
        }
        return p0(ar0Var, gp0Var.K, gp0Var.f456937d, str);
    }

    public static java.util.List u() {
        java.util.List I7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().I7(new java.util.ArrayList(1), new java.util.ArrayList(1), new java.util.ArrayList(1));
        return I7 == null ? new java.util.ArrayList() : I7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u0(r45.gp0 r4, java.lang.String r5, java.lang.Boolean r6, int r7, java.lang.String r8, java.lang.Boolean r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ""
            if (r4 == 0) goto La
            java.lang.String r1 = r4.T
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r1 != 0) goto Lb
        La:
            r1 = r0
        Lb:
            java.lang.Class<qk.g9> r2 = qk.g9.class
            i95.m r3 = i95.n0.c(r2)
            qk.g9 r3 = (qk.g9) r3
            rk4.z8 r3 = (rk4.z8) r3
            boolean r3 = r3.mj(r1)
            if (r3 == 0) goto L27
            i95.m r4 = i95.n0.c(r2)
            qk.g9 r4 = (qk.g9) r4
            rk4.z8 r4 = (rk4.z8) r4
            r4.wj()
            goto L97
        L27:
            i95.m r2 = i95.n0.c(r2)
            qk.g9 r2 = (qk.g9) r2
            rk4.z8 r2 = (rk4.z8) r2
            boolean r1 = r2.oj(r1)
            if (r1 != 0) goto L97
            bw5.lp0 r4 = Z(r4, r5, r6)
            boolean r5 = r6.booleanValue()
            il4.e r6 = new il4.e
            r6.<init>()
            r6.f373639c = r7
            r6.f373640d = r5
            if (r8 != 0) goto L49
            r8 = r0
        L49:
            r6.f373647k = r8
            bw5.x2 r5 = bw5.x2.BizAudioEnterScene_CollectionListen
            r6.f373660x = r5
            boolean r5 = r9.booleanValue()
            il4.f r7 = r6.f373655s
            if (r5 == 0) goto L61
            java.util.Map r5 = r7.f373665d
            java.lang.String r8 = r6.f373647k
            java.lang.String r9 = "chat"
            r5.put(r9, r8)
            goto L6a
        L61:
            java.util.Map r5 = r7.f373665d
            java.lang.String r8 = r6.f373647k
            java.lang.String r9 = "favid"
            r5.put(r9, r8)
        L6a:
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            if (r5 != 0) goto L78
            java.util.Map r5 = r7.f373665d
            java.lang.String r8 = "msgid"
            r5.put(r8, r10)
        L78:
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            if (r5 != 0) goto L86
            java.util.Map r5 = r7.f373665d
            java.lang.String r7 = "sourceuser"
            r5.put(r7, r11)
        L86:
            java.lang.Class<qk.k6> r5 = qk.k6.class
            i95.m r5 = i95.n0.c(r5)
            qk.k6 r5 = (qk.k6) r5
            java.lang.String r7 = r4.b()
            rk4.a r5 = (rk4.a) r5
            r5.Ui(r7, r4, r6)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.x1.u0(r45.gp0, java.lang.String, java.lang.Boolean, int, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void");
    }

    public static java.lang.String v(android.content.Context context, java.lang.String str) {
        return ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, str);
    }

    public static void v0(r45.gp0 gp0Var, java.lang.String str, java.lang.Boolean bool, int i17, java.lang.String str2, int i18) {
        bw5.o50 o50Var;
        if (i18 == f425054g) {
            return;
        }
        bw5.lp0 Z = Z(gp0Var, str, bool);
        if (i18 == f425053f) {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            o50Var = new bw5.o50();
            o50Var.i("1025");
            o50Var.k(16);
            o50Var.j(1);
        } else {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            o50Var = new bw5.o50();
            o50Var.i("1024");
            o50Var.k(0);
            o50Var.j(1);
        }
        boolean booleanValue = bool.booleanValue();
        il4.e eVar = new il4.e();
        eVar.f373639c = i17;
        eVar.f373640d = booleanValue;
        if (str2 == null) {
            str2 = "";
        }
        eVar.f373647k = str2;
        eVar.f373655s.f373665d.put("favid", str2);
        ((rk4.a) ((qk.k6) i95.n0.c(qk.k6.class))).Vi(Z, null, o50Var, null, eVar);
    }

    public static java.lang.String w(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        return n17 != null ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0()) ? n17.w0() : !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0()) ? n17.P0() : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? c01.v1.k() : n17.d1() : str;
    }

    public static boolean w0(o72.r2 r2Var) {
        r45.gp0 J2;
        boolean z17;
        int i17;
        int i18 = 0;
        boolean mo9952xce0038c9 = false;
        if (r2Var == null || (J2 = J(r2Var)) == null) {
            return false;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String x17 = x(J2);
        ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(x17, true);
        if (d17 != null) {
            i17 = d17.a();
            int i19 = J2.f456981y;
            if (i19 <= 0 || java.lang.Math.abs(i19 - i17) >= 2) {
                J2.n0(i17);
                mo9952xce0038c9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().mo9952xce0038c9(r2Var, dm.i4.f66867x2a5c95c7);
            }
            z17 = mo9952xce0038c9;
            i18 = i19;
        } else {
            z17 = false;
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "repair video duration[%d TO %d] %b cost time %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return z17;
    }

    public static java.lang.String x(r45.gp0 gp0Var) {
        boolean z17;
        if (gp0Var == null) {
            return "";
        }
        java.lang.String str = gp0Var.T;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !gm0.j1.a()) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 r17 = r(str);
        int i17 = gp0Var.I;
        if ((i17 == 8 || i17 == 10130) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456937d)) {
            str = gp0Var.f456937d;
            r17 = r(gp0Var.T);
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String str2 = gp0Var.K;
        if (str2 != null && str2.trim().length() > 0 && !z17) {
            str = str + "." + gp0Var.K;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(r17, str);
        if (r6Var.m() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.M)) {
            return r6Var.o();
        }
        java.lang.String g17 = kk.k.g((gp0Var.M + gp0Var.T).getBytes());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
            return r6Var.o();
        }
        java.lang.String str3 = gp0Var.K;
        if (str3 != null && str3.trim().length() > 0) {
            g17 = g17 + "." + gp0Var.K;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r17, g17);
        if (r6Var2.m()) {
            return r6Var2.o();
        }
        java.lang.String str4 = gp0Var.T;
        java.lang.String str5 = gp0Var.K;
        if (str5 != null && str5.trim().length() > 0) {
            str4 = str4 + "." + gp0Var.K;
        }
        return new com.p314xaae8f345.mm.vfs.r6(r17, str4).o();
    }

    public static void x0(dm.n3 n3Var, o72.t2 t2Var) {
        if (t2Var == null) {
            t2Var = new o72.t2(n3Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(17105, t2Var.m150791x9616526c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "report fav delete, reportObject:%s", java.lang.String.format("type[%s],favId[%s],favSoruce[%s],scene[%s],generalMsgType[%s],createTime[%s],isSearch[%s],searchIndex[%s],origindex[%s]", java.lang.Integer.valueOf(t2Var.f424996a), java.lang.Long.valueOf(t2Var.f424997b), java.lang.Integer.valueOf(t2Var.f424998c), java.lang.Integer.valueOf(t2Var.f424999d), java.lang.Integer.valueOf(t2Var.f425000e), java.lang.Long.valueOf(t2Var.f425001f), java.lang.Integer.valueOf(t2Var.f425002g), java.lang.Integer.valueOf(t2Var.f425003h), java.lang.Integer.valueOf(t2Var.f425004i)));
    }

    public static java.lang.String y(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "get contact null, username %s", str);
            return "";
        }
        java.lang.String g27 = n17.g2();
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g27)) {
            return g27;
        }
        java.util.List m17 = c01.v1.m(str);
        java.lang.String r17 = c01.z1.r();
        if (m17 == null || m17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "get members from username error, content empty");
            return g27;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) m17;
        linkedList.remove(r17);
        linkedList.add(0, r17);
        return c01.v1.i(m17, 3, "");
    }

    public static void y0(o72.r2 r2Var, r45.gp0 gp0Var, boolean z17) {
        if (r2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, favId %d, favLocalId %d, dataId %s", java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(r2Var.f67645x88be67a1), gp0Var.T);
        o72.s2.g("MicroMsg.Fav.FavApiLogic", o72.s2.f(r2Var.f67645x88be67a1), "restartCdnDataDownload: localId=%d, favId=%d, dataId=%s, force=%b", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), gp0Var.T, java.lang.Boolean.valueOf(z17));
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(gp0Var.T);
        if (Xf != null && Xf.f67093x10a0fed7 == 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9951xb06685ab(Xf, "dataId");
            Xf = null;
        }
        if (Xf != null && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Xf.f67084xf47770e7) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Xf.f67083xf47749d7) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Xf.f67085xf604e54a) || !Xf.f67084xf47770e7.equals(gp0Var.f456967s) || !Xf.f67083xf47749d7.equals(gp0Var.f456971u) || !Xf.f67085xf604e54a.equals(gp0Var.T))) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9951xb06685ab(Xf, "dataId");
            Xf = null;
        }
        if (Xf != null && Xf.f67095x2262335f == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
            Xf.f67093x10a0fed7 = 1;
            Xf.f67091x2260084a = x(gp0Var);
            Xf.f67089x15b870c = c01.id.c();
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf, "dataId");
            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(x(gp0Var));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        d0(gp0Var, r2Var, 1, true);
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static java.lang.String z() {
        return gm0.j1.u().d() + "favorite/imagetransfer/";
    }

    public static void z0(r45.gp0 gp0Var, boolean z17, int i17, long j17) {
        int i18;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.T)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "restart cdndata download, dataId %s", gp0Var.T);
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(gp0Var.T);
        if (Xf != null && ((i18 = Xf.f67093x10a0fed7) == 3 || i18 == 4)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9951xb06685ab(Xf, "dataId");
            Xf = null;
        }
        if (Xf != null && Xf.f67095x2262335f == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem data not download completed.");
            Xf.f67093x10a0fed7 = 1;
            Xf.f67089x15b870c = c01.id.c();
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().mo9952xce0038c9(Xf, "dataId");
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
            }
            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(x(gp0Var));
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456971u) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.f456967s)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "klem big img not exist, start download.");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        o72.r2 r2Var = new o72.r2();
        r2Var.f67645x88be67a1 = j17;
        r2Var.f67643xc8a07680 = -1;
        r2Var.f67657x2262335f = i17;
        d0(gp0Var, r2Var, 1, true);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj();
        }
        ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "insert cdn item use %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
