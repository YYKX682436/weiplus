package ka4;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static ka4.f f387670b;

    /* renamed from: f, reason: collision with root package name */
    public static int f387674f;

    /* renamed from: g, reason: collision with root package name */
    public static int f387675g;

    /* renamed from: h, reason: collision with root package name */
    public static int f387676h;

    /* renamed from: i, reason: collision with root package name */
    public static int f387677i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f387678j;

    /* renamed from: a, reason: collision with root package name */
    public static final ka4.m f387669a = new ka4.m();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f387671c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f387672d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f387673e = new java.util.HashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final gl0.a f387679k = new ka4.i();

    public static final /* synthetic */ int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        int i17 = f387674f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMaxKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return i17;
    }

    public static final /* synthetic */ int b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        int i17 = f387675g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMinKaraTimeStamp$p", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return i17;
    }

    public static final void c(ka4.m mVar, java.util.ArrayList arrayList, boolean z17, ka4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        mVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + arrayList.size());
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_small_win_video_enable_v2, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + fj6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + arrayList2.size() + ", " + fj6 + ", " + z17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("after check ");
            sb6.append(arrayList2.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                boolean z18 = false;
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f387671c;
                if (z17 && concurrentHashMap.containsKey(c17933xe8d1b226.m70367x7525eefd())) {
                    z18 = true;
                }
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "isPredicted >> " + c17933xe8d1b226.m70367x7525eefd());
                } else {
                    ka4.m mVar2 = f387669a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b226);
                    if (mVar2.d(c17933xe8d1b226, fj6)) {
                        java.lang.String m70367x7525eefd = c17933xe8d1b226.m70367x7525eefd();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70367x7525eefd, "getSnsId(...)");
                        concurrentHashMap.put(m70367x7525eefd, new ka4.a(ka4.b.f387649e, 0L, 0L));
                        arrayList3.add(c17933xe8d1b226);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> after deal targetList size : " + arrayList3.size());
            ka4.f fVar = f387670b;
            if (fVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> but callback is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            } else {
                java.util.ArrayList a17 = ((rl0.a) fVar).a(arrayList3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> " + java.lang.Integer.valueOf(a17.size()));
                if (!arrayList3.isEmpty()) {
                    int m142320xfb85f7b0 = cVar.m142320xfb85f7b0();
                    if (m142320xfb85f7b0 == ka4.c.f387655e.m142320xfb85f7b0()) {
                        f387676h = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.X(arrayList3)).m70357x3fdd41df();
                        f387677i = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.i0(arrayList3)).m70357x3fdd41df();
                    } else if (m142320xfb85f7b0 == ka4.c.f387656f.m142320xfb85f7b0()) {
                        f387674f = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.X(arrayList3)).m70357x3fdd41df();
                    } else if (m142320xfb85f7b0 == ka4.c.f387657g.m142320xfb85f7b0()) {
                        f387675g = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) kz5.n0.i0(arrayList3)).m70357x3fdd41df();
                    }
                }
                if (!(a17.isEmpty())) {
                    gl0.c.a(a17, f387679k);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> " + snsInfo.m70367x7525eefd() + ", wsConfig: " + z17);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = snsInfo.m70371x485d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        java.util.LinkedList linkedList = a90Var != null ? a90Var.f451373h : null;
        r45.jj4 jj4Var = linkedList == null || linkedList.isEmpty() ? null : (r45.jj4) linkedList.get(0);
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        if (snsInfo.m70377x3172ed() || jj4Var.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.m70367x7525eefd() + " is ad");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        if (jj4Var.R * 1000 <= ck4.a.f124066g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.m70367x7525eefd() + " is toLow");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        if (snsInfo.m70374x6bf53a6c().equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.m70367x7525eefd() + " is self");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
            return false;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(snsInfo.f68881x4c58c87d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) mo11468x92b714fd).f39004xccad6686 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_small_win_video_enable_v2, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoOptionConfig", "getWsExptConfig >> " + fj6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsExptConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoOptionConfig");
            if (fj6) {
                jj4Var.U = "V4";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "checkIsNeedToPredict >> snsId:" + snsInfo.m70367x7525eefd() + " mediaId:" + jj4Var.f459388d + " no to predict for weiShang");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                return false;
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f387672d;
        java.lang.String Id = jj4Var.f459388d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
        java.lang.String m70367x7525eefd = snsInfo.m70367x7525eefd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70367x7525eefd, "getSnsId(...)");
        concurrentHashMap.put(Id, m70367x7525eefd);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsNeedToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return true;
    }

    public final ka4.a e(java.lang.String snsId) {
        ka4.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPredictTypeBySnsId", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsId, "snsId");
        ka4.a aVar = (ka4.a) f387671c.get(snsId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPredictTypeBySnsId >> ");
        sb6.append(snsId);
        sb6.append(", ");
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
            bVar = aVar.f387646a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPredictType", "com.tencent.mm.plugin.sns.model.config.KaraPredictItem");
        } else {
            bVar = null;
        }
        sb6.append(bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPredictTypeBySnsId", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        return aVar;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        ka4.o oVar = ka4.o.f387682a;
        if (oVar.a()) {
            boolean z17 = true;
            if (oVar.c() == 1) {
                boolean d17 = oVar.d();
                boolean d18 = d(snsInfo, d17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setPreSnsInfoToPredict >> " + d17 + ", " + snsInfo.m70367x7525eefd() + ", " + d18);
                if (d18) {
                    ka4.f fVar = f387670b;
                    if (fVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsKaraOptionConfig", "setSnsInfoToPredict >> but callback is null");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                        return;
                    }
                    if (fVar != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(snsInfo);
                        arrayList = ((rl0.a) fVar).a(arrayList2);
                    } else {
                        arrayList = null;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSnsInfoToPredict >> ");
                    sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", sb6.toString());
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z17 = false;
                    }
                    if (!z17) {
                        gl0.c.a(arrayList, f387679k);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsKaraOptionConfig", "setPreSnsInfoToPredict >> is no to predict");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setNetSceneSnsInfoToPredict", "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig");
    }
}
