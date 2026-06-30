package u64;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final u64.p f506556a = new u64.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f506557b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f506558c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f506559d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f506560e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f506561f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.r0 f506562g;

    static {
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        f506562g = new u64.n(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    public static final /* synthetic */ java.util.Map a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPullAdReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        java.util.Map map = f506558c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPullAdReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return map;
    }

    public static final /* synthetic */ java.util.Map b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTimelineReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        java.util.Map map = f506557b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTimelineReqStateMap$p", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return map;
    }

    public static final void c(java.lang.String str, jz5.l state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emitAdPullReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "emitAdPullReqState() called with: uuid = " + str + ", state = " + ((java.lang.Boolean) state.f384366d).booleanValue());
        if (str == null) {
            str = "";
        }
        java.util.Map map = f506558c;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) map).get(str);
                    if (j2Var != null) {
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(state);
                    }
                } else {
                    map.put(str, p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(state));
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emitAdPullReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            }
        }
    }

    public static final void d(java.lang.String str, jz5.l state) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emitTimelineReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "emitTimelineRequestState() called with: uuid = " + str + ", state = " + ((java.lang.Boolean) state.f384366d).booleanValue());
        if (str == null) {
            str = "";
        }
        java.util.Map map = f506557b;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j2) ((java.util.LinkedHashMap) map).get(str);
                    if (j2Var != null) {
                        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(state);
                    }
                } else {
                    map.put(str, p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(state));
                }
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emitTimelineReqState", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            }
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 e(r45.g5 g5Var) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g5Var, "<this>");
        r45.du5 du5Var = g5Var.f456419e;
        if (du5Var == null || (str = du5Var.f454289d) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "adinfoStr len = " + str.length());
        java.util.Map map = f506561f;
        synchronized (map) {
            try {
                c17902x72cc1771 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771) ((java.util.LinkedHashMap) map).get(str);
                if (c17902x72cc1771 == null) {
                    c17902x72cc1771 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771(str);
                    map.put(str, c17902x72cc1771);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return c17902x72cc1771;
    }

    public final r45.g5 f(jz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.n76 n76Var = (r45.n76) lVar.f384367e;
        java.util.LinkedList linkedList = n76Var != null ? n76Var.f462674d : null;
        if (linkedList == null || linkedList.size() < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "AdPullReq  has no adobj!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        r45.g5 g5Var = (r45.g5) linkedList.get(0);
        if (g5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "adPull adobj is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "adPull has adobj~");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return g5Var;
    }

    public final java.lang.String g(r45.g5 g5Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.f76 f76Var = g5Var.f456418d;
        java.lang.String t07 = ca4.z0.t0((f76Var == null || (c19806x4c372b7 = f76Var.f455609d) == null) ? 0L : c19806x4c372b7.Id);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "AdvertiseList getSnsId = " + t07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "also(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return t07;
    }

    public final r45.g5 h(jz5.l lVar) {
        r45.f76 f76Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.ua6 ua6Var = (r45.ua6) lVar.f384367e;
        java.util.LinkedList linkedList = ua6Var != null ? ua6Var.f468709o : null;
        if (linkedList == null || linkedList.size() < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "tlResult has no adobj!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        r45.g5 g5Var = (r45.g5) linkedList.get(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tlResult orgAd Id is ");
        sb6.append((g5Var == null || (f76Var = g5Var.f456418d) == null || (c19806x4c372b7 = f76Var.f455609d) == null) ? null : java.lang.Long.valueOf(c19806x4c372b7.Id));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", sb6.toString());
        if (g5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "tlResult adObj is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "tlResult has obj~");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTlObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return g5Var;
    }

    public final boolean i(java.lang.String str) {
        boolean b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullRequestHelper", "this is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            return false;
        }
        java.util.Map map = f506559d;
        synchronized (map) {
            try {
                b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.LinkedHashMap) map).get(str), java.lang.Boolean.TRUE);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "isExposed " + str + " = " + b17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExposed", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return b17;
    }

    public final java.lang.String j(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("urlEncode", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        java.lang.String b17 = fp.s0.b(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "encode(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("urlEncode", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        return b17;
    }
}
