package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class c3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static wa4.i f245647i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245649d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f245650e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f245651f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3 f245652g = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3(this);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f245646h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public static boolean f245648m = true;

    public c3(int i17) {
        this.f245649d = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "NetSceneSnsSync %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ka6();
        lVar.f152198b = new r45.la6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnssync";
        lVar.f152200d = 214;
        lVar.f152201e = 102;
        lVar.f152202f = 1000000102;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f245650e = a17;
        ((r45.ka6) a17.f152243a.f152217a).f460099d = i17;
        this.f245649d = c01.z1.r();
        if (f245648m) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.i();
            sb6.append(gm0.j1.u().h());
            sb6.append("ad_1100007");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "filepath to list  " + sb7);
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(sb7, 0, -1);
            if (N == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            } else {
                try {
                    f245647i = (wa4.i) new wa4.i().mo11468x92b714fd(N);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "fileToList " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    if (f245647i == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId parser error");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "igNoreAbTestId size " + f245647i.f525776d.size());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.vfs.w6.h(sb7);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fileToList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                }
            }
            f245648m = false;
        }
    }

    public static void H(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3 c3Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        c3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSyncDataCache", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        gm0.j1.u().c().w(68377, c19806x4c372b7.f38999xf403ecf6);
        gm0.j1.u().c().w(68400, java.lang.Integer.valueOf(c19806x4c372b7.f38965xc86e6609));
        gm0.j1.u().c().w(68418, ca4.z0.t0(c19806x4c372b7.Id));
        gm0.j1.u().c().w(68419, 0);
        gm0.j1.u().c().w(68420, 0);
        gm0.j1.u().c().w(68421, java.lang.Integer.valueOf(c19806x4c372b7.f39002x36ea9d02));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.t0.a(1, ca4.z0.t0(c19806x4c372b7.Id), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSyncDataCache", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    public static void I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        for (c01.x8 x8Var : f245646h) {
            if (x8Var != null) {
                com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = (com.p314xaae8f345.mm.ui.C21357x5e7365bb) x8Var;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "notify comment change");
                if ((c01.z1.n() & 32768) == 0) {
                    if (p94.w0.a() != null) {
                        c21357x5e7365bb.f278193y = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1) p94.w0.a()).L0();
                    }
                    c21357x5e7365bb.C1();
                    c21357x5e7365bb.f278189w.notifyDataSetChanged();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0177 A[Catch: Exception -> 0x0224, TryCatch #3 {Exception -> 0x0224, blocks: (B:26:0x0132, B:28:0x0177, B:31:0x01ab, B:36:0x01d0, B:41:0x0208, B:44:0x01df, B:46:0x01e9), top: B:25:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0220  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean O(r45.l76 r33) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.O(r45.l76):boolean");
    }

    public final boolean J(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().D0(j17, k76Var.f460003s, k76Var.f459995h);
        if (D0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        }
        D0.u0();
        boolean mo11261xce0038c9 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo11261xce0038c9(D0.f72763xa3c65b86, D0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.n(j17, l76Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", " setdel ad flag  " + mo11261xce0038c9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processAdCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public final boolean K(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processAdSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        java.lang.String str2 = k76Var.f459991d;
        Aj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentDeleted", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" update SnsComment set commentflag = 1 where snsID = ");
        sb6.append(j17);
        sb6.append(" and talker = '");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str2);
        sb6.append(str2);
        sb6.append("'");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentStorage", "set sns del  by username " + sb7);
        boolean A = Aj.f247689d.A("SnsComment", sb7);
        if (A) {
            Aj.m145262xf35bbb4();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentDeleted", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processAdSnsDelAction " + A);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.n(j17, l76Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processAdSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public final boolean L(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().D0(j17, k76Var.f460000p, k76Var.f459995h);
        if (D0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
        D0.u0();
        boolean mo11261xce0038c9 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo11261xce0038c9(D0.f72763xa3c65b86, D0);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "deleteComment");
        r45.k76 k76Var2 = l76Var.f460738f;
        if (k76Var2.f459995h != 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
            if (W0 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                try {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W0.f68881x4c58c87d);
                    c19806x4c372b7.Id = j17;
                    java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r45.e86 next = it.next();
                        if (next.f454665m == k76Var2.f460000p && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(next.f454659d)) {
                            if (!next.f454659d.equals(k76Var2.f459991d) && next.f454659d.equals(c01.z1.r())) {
                                if (next.f454659d.equals(c01.z1.r())) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "commentUsername:%s, actionUsername:%s, markDeleteFlag:%s", next.f454659d, k76Var2.f459991d, java.lang.Integer.valueOf(next.f454665m));
                                    next.f454671s = 1;
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "commentUsername:%s, actionUsername:%s, removeComment:%s", next.f454659d, k76Var2.f459991d, java.lang.Integer.valueOf(next.f454665m));
                            c19806x4c372b7.f38963x20c46e68.remove(next);
                        }
                    }
                    W0.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().Y2(c19806x4c372b7.Id, W0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsInfoStorageLogic", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteComment", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", " setdel flag  " + mo11261xce0038c9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processCommentDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    public final boolean M(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processGrabHbAction clientId " + str + " snsId: " + j17 + " " + k76Var.f460003s + " " + k76Var.f460000p);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().n1(j17, k76Var.f459991d, k76Var.f459997m, str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            r45.k76 k76Var2 = l76Var.f460739g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1();
            v1Var.f67469x29d1290e = j17;
            v1Var.f67467x63ce98ea = j18;
            v1Var.f67460xac3be4e = k76Var.f459997m;
            v1Var.f67471x114ef53e = k76Var.f459991d;
            v1Var.f67472x2262335f = k76Var.f459995h;
            v1Var.f67461x5e5c2922 = k76Var.mo14344x5f01b1f6();
            v1Var.f67468x1008602f = k76Var2.mo14344x5f01b1f6();
            v1Var.f67457x53e83feb = str;
            v1Var.f67458x3aefdbd0 = k76Var.f460000p;
            v1Var.f67466xa9a2f4d7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.g(k76Var, k76Var2);
            r45.vv3 vv3Var = new r45.vv3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + k76Var.f460004t);
            vv3Var.mo11468x92b714fd(x51.j1.d(k76Var.f460004t));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "hbbuffer  " + vv3Var.f470137d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo880xb970c2b9(v1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processGrabHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
    }

    public final boolean N(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processHbAction clientId " + str + " snsId: " + j17 + " " + k76Var.f460003s + " " + k76Var.f460000p);
            if (!ha4.h.c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "passed because close lucky");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().n1(j17, k76Var.f459991d, k76Var.f459997m, str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
                return false;
            }
            r45.k76 k76Var2 = l76Var.f460739g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1();
            v1Var.f67469x29d1290e = j17;
            v1Var.f67467x63ce98ea = j18;
            v1Var.f67460xac3be4e = k76Var.f459997m;
            v1Var.f67471x114ef53e = k76Var.f459991d;
            v1Var.f67472x2262335f = k76Var.f459995h;
            v1Var.f67461x5e5c2922 = k76Var.mo14344x5f01b1f6();
            v1Var.f67468x1008602f = k76Var2.mo14344x5f01b1f6();
            v1Var.f67457x53e83feb = str;
            v1Var.f67458x3aefdbd0 = k76Var.f460000p;
            v1Var.f67466xa9a2f4d7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.g(k76Var, k76Var2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "curAction.HBBuffer " + k76Var.f460004t);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.u(j17, l76Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyHbReward", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            for (c01.x8 x8Var : f245646h) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyHbReward", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo880xb970c2b9(v1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneNewSyncAlbum", "error processHbAction " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneNewSyncAlbum", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processHbAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return false;
        }
    }

    public final void P(long j17, r45.mo5 mo5Var, r45.l76 l76Var) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        int i18;
        java.lang.Object[] objArr;
        long j18;
        long j19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processSnsAdAtCommentAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2.H(j17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2 k2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k2(j17, 2, mo5Var);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(k2Var);
        }
        try {
            r45.k76 k76Var = l76Var.f460738f;
            java.lang.String str4 = l76Var.f460740h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str4 == null) {
                str4 = "";
            }
            try {
                long j27 = l76Var.f460737e;
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdNotifyLimit"), 0);
                int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdNotifyLikeTimeLimit"), 0);
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsAdNotifyCommentTimeLimit"), 0);
                if (mo5Var != null) {
                    try {
                        objArr = new java.lang.Object[6];
                        i18 = 0;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        i18 = 0;
                    }
                    try {
                        objArr[0] = str4;
                        objArr[1] = java.lang.Long.valueOf(j17);
                        j18 = j27;
                        objArr[2] = java.lang.Long.valueOf(mo5Var.f462251i);
                        objArr[3] = java.lang.Integer.valueOf(mo5Var.f462246d);
                        objArr[4] = java.lang.Integer.valueOf(k76Var.f460000p);
                        objArr[5] = java.lang.Integer.valueOf(P);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processAdAtAction clientId %s, snsId %s, aid64 %s, aid %s, commentId %s, actionLimit %s", objArr);
                        if (mo5Var.f462251i == 0 && mo5Var.f462246d == 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 4);
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        i17 = i18;
                        str = "";
                        str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneNewSyncAlbum", e, str, new java.lang.Object[i17]);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAdAtCommentAction", str2);
                    }
                } else {
                    j18 = j27;
                    i18 = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "remindFriendsInfo is null!");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(nd1.j0.f72943x366c91de, 3);
                }
                java.lang.String str5 = str4;
                long j28 = j18;
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().n1(j17, k76Var.f459991d, k76Var.f459997m, str5)) {
                    str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                } else {
                    r45.k76 k76Var2 = l76Var.f460739g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1();
                    v1Var2.f67469x29d1290e = j17;
                    v1Var2.f67467x63ce98ea = j28;
                    v1Var2.f67460xac3be4e = k76Var.f459997m;
                    v1Var2.f67471x114ef53e = k76Var.f459991d;
                    v1Var2.f67472x2262335f = k76Var.f459995h;
                    v1Var2.f67461x5e5c2922 = k76Var.mo14344x5f01b1f6();
                    v1Var2.f67468x1008602f = k76Var2.mo14344x5f01b1f6();
                    v1Var2.f67457x53e83feb = str5;
                    v1Var2.f67465xf4ca6712 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(k76Var.f460005u, 2) ? 1 : 0;
                    v1Var2.f67458x3aefdbd0 = k76Var.f460003s;
                    v1Var2.f67466xa9a2f4d7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.g(k76Var, k76Var2);
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().P0(j17)) {
                        if (P > 0 || P2 > 0 || P3 > 0) {
                            v1Var = v1Var2;
                            str3 = " ";
                            str = "";
                            str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                            try {
                                if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.b(j17, l76Var, P, P2, P3, true)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "check comment fail, pass comment ID " + v1Var.f67469x29d1290e + str3 + v1Var.f67458x3aefdbd0);
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAdAtCommentAction", str2);
                                    return;
                                }
                                j19 = j17;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                i17 = 0;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneNewSyncAlbum", e, str, new java.lang.Object[i17]);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAdAtCommentAction", str2);
                            }
                        } else {
                            j19 = j17;
                            v1Var = v1Var2;
                            str3 = " ";
                            str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                        }
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.s(j19, l76Var)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "pass comment ID " + v1Var.f67469x29d1290e + str3 + v1Var.f67458x3aefdbd0);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAdAtCommentAction", str2);
                            return;
                        }
                    } else {
                        j19 = j17;
                        v1Var = v1Var2;
                        str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
                    }
                    if (j62.e.g().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2157xaf3f8342.C17833x135cc83e()) == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(k76Var.f460007w) && k76Var.f460007w.get(0) != null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.b((r45.l86) k76Var.f460007w.get(0));
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(b17.f68671x4b6e68b9) == null) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().mo880xb970c2b9(b17);
                            zq.h.f556505a.e(b17, null);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo880xb970c2b9(v1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().o1(j19, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(k76Var.f460005u, 2));
                }
            } catch (java.lang.Exception e27) {
                e = e27;
                str = "";
                str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            str = "";
            str2 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsAdAtCommentAction", str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:20:0x0090, B:22:0x0095), top: B:19:0x0090 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(long r14) {
        /*
            r13 = this;
            java.lang.String r0 = ", snsId="
            java.lang.String r1 = "MicroMsg.NetSceneNewSyncAlbum"
            java.lang.String r2 = "processSnsAdFeedsForceDelAction snsId="
            java.lang.String r3 = "processSnsAdFeedsForceDelAction"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r4)
            r5 = 0
            r6 = 0
            java.lang.String r7 = ca4.z0.t0(r14)     // Catch: java.lang.Throwable -> L6e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            r8.append(r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r8)     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.storage.z0 r8 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi()     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r8 = r8.y0(r14)     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L3f
            com.tencent.mm.plugin.sns.storage.ADInfo r9 = r8.m70299x10413e67()     // Catch: java.lang.Throwable -> L6c
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r8.m70300x74235b3e()     // Catch: java.lang.Throwable -> L3a
            r12 = r9
            r9 = r5
            r5 = r12
            goto L40
        L3a:
            r2 = move-exception
            r12 = r9
            r9 = r5
            r5 = r12
            goto L72
        L3f:
            r9 = r5
        L40:
            boolean r10 = a84.n.e(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L67
            r11.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", delSucc="
            r11.append(r2)     // Catch: java.lang.Throwable -> L67
            r11.append(r10)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = ", adSnsInfo==null?"
            r11.append(r2)     // Catch: java.lang.Throwable -> L67
            if (r8 != 0) goto L5c
            r6 = 1
        L5c:
            r11.append(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L67
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)     // Catch: java.lang.Throwable -> L67
            goto L8f
        L67:
            r2 = move-exception
            r6 = r10
            goto L72
        L6a:
            r2 = move-exception
            goto L72
        L6c:
            r2 = move-exception
            goto L71
        L6e:
            r2 = move-exception
            java.lang.String r7 = ""
        L71:
            r9 = r5
        L72:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "processSnsAdFeedsForceDelAction exp="
            r8.<init>(r10)
            java.lang.String r2 = r2.toString()
            r8.append(r2)
            r8.append(r0)
            r8.append(r7)
            java.lang.String r2 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)
            r10 = r6
        L8f:
            r2 = 3
            ca4.c0.b(r2, r14, r5, r9)     // Catch: java.lang.Throwable -> L9a
            if (r10 == 0) goto Lb7
            r2 = 4
            ca4.c0.b(r2, r14, r5, r9)     // Catch: java.lang.Throwable -> L9a
            goto Lb7
        L9a:
            r14 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = "processSnsAdFeedsForceDelAction report exp="
            r15.<init>(r2)
            java.lang.String r14 = r14.toString()
            r15.append(r14)
            r15.append(r0)
            r15.append(r7)
            java.lang.String r14 = r15.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r14)
        Lb7:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c3.Q(long):void");
    }

    public final boolean R(r45.l76 l76Var, r45.k76 k76Var, long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
        Aj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSnsDel", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str2 = " update SnsComment set commentflag = 2 where snsID = " + j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentStorage", "set sns del " + str2);
        boolean A = Aj.f247689d.A("SnsComment", str2);
        if (A) {
            Aj.m145262xf35bbb4();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSnsDel", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        lc4.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.f250294r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addDelayDeleteFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_delete_feed_resource, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.DataUIC", "addDelayDeleteFeedId:" + ca4.z0.s0(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getDelayDeleteFeedList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.f250297u;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getDelayDeleteFeedList$cp", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            arrayList.add(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDelayDeleteFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addDelayDeleteFeedId", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneNewSyncAlbum", "processSnsDelAction cmtRet:%b snsid:%s", java.lang.Boolean.valueOf(A), ca4.z0.t0(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsDelAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        byte[] a17 = w11.c2.f523524a.a();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(a17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f245650e;
        ((r45.ka6) oVar.f152243a.f152217a).f460100e = cu5Var;
        this.f245651f = u0Var;
        int mo9409x10f9447a = mo9409x10f9447a(sVar, oVar, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return 214;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        if (i18 != 0 || i19 != 0) {
            this.f245651f.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.la6 la6Var = (r45.la6) oVar.f152244b.f152233a;
        java.util.LinkedList linkedList = la6Var.f460812d.f452828e;
        if (linkedList == null || linkedList.size() <= 0) {
            r45.cu5 cu5Var = la6Var.f460814f;
            if (cu5Var != null && (gVar = cu5Var.f453374f) != null) {
                byte[] c17 = o45.qi.c(((r45.ka6) oVar.f152243a.f152217a).f460100e.f453374f.g(), gVar.g());
                if (c17 != null && c17.length > 0) {
                    w11.c2.f523524a.d(c17, true);
                }
            }
            this.f245651f.mo815x76e0bfae(i18, i19, str, this);
        } else {
            linkedList.size();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.b3 b3Var = this.f245652g;
            b3Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("delaWithCmdList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler");
            b3Var.f245622a = linkedList;
            b3Var.f245623b.mo50305x3d8a09a2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("delaWithCmdList", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync$RespHandler");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return o1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uniqueInNetsceneQueue", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("uniqueInNetsceneQueue", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        return true;
    }
}
