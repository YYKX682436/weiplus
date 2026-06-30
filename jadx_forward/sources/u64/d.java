package u64;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f506515d;

    /* renamed from: e, reason: collision with root package name */
    public int f506516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ta6 f506517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f506518g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.ta6 ta6Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f506517f = ta6Var;
        this.f506518g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        u64.d dVar = new u64.d(this.f506517f, this.f506518g, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        java.lang.Object mo150x989b7ca4 = ((u64.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        return mo150x989b7ca4;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f506516e;
        r45.n76 n76Var = null;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1920, 0);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            u64.p pVar = u64.p.f506556a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toSnsAdPullReq", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            r45.ta6 ta6Var = this.f506517f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ta6Var, "<this>");
            r45.m76 m76Var = new r45.m76();
            m76Var.mo11509x3ab820bc(ta6Var.mo11508xa452ad48());
            m76Var.f461738d = ta6Var.f467772d;
            m76Var.f461739e = ta6Var.f467773e;
            m76Var.f461740f = ta6Var.f467774f;
            m76Var.f461741g = ta6Var.f467775g;
            m76Var.f461742h = ta6Var.f467776h;
            m76Var.f461743i = ta6Var.f467777i;
            m76Var.f461744m = ta6Var.f467778m;
            m76Var.f461745n = ta6Var.f467779n;
            m76Var.f461746o = ta6Var.f467780o;
            m76Var.f461747p = ta6Var.f467781p;
            m76Var.f461748q = ta6Var.f467782q;
            m76Var.f461749r = ta6Var.f467783r;
            m76Var.f461750s = ta6Var.f467784s;
            m76Var.f461751t = ta6Var.f467785t;
            m76Var.f461752u = ta6Var.f467786u;
            m76Var.f461753v = ta6Var.f467787v;
            m76Var.f461754w = ta6Var.f467788w;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toSnsAdPullReq", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
            u64.c cVar = new u64.c(m76Var, 25444, "/cgi-bin/mmoc-bin/adplayinfo/sns_pull_request_adobject", null);
            this.f506515d = currentTimeMillis;
            this.f506516e = 1;
            obj = p3325xe03a0797.p3326xc267989b.a4.c(30000L, cVar, this);
            if (obj == aVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
                return aVar;
            }
            j17 = currentTimeMillis;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
                throw illegalStateException;
            }
            j17 = this.f506515d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        k64.b bVar = (k64.b) obj;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
        if ((bVar != null && bVar.a() == 0) && bVar.b() == 0) {
            n76Var = (r45.n76) bVar.c();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adpull result not ok ! ");
            sb6.append(bVar != null ? new java.lang.Integer(bVar.a()) : null);
            sb6.append(", ");
            sb6.append(bVar != null ? new java.lang.Integer(bVar.b()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullRequestHelper", sb6.toString());
        }
        jz5.l lVar = new jz5.l(java.lang.Boolean.TRUE, n76Var);
        u64.p pVar2 = u64.p.f506556a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.g5 f17 = pVar2.f(lVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        boolean v17 = f17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.x.v(f17) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "adDynamic, updateSuccess=" + v17);
        if (v17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1802, 9);
        }
        if (f17 != null) {
            java.lang.String g17 = x51.j1.g(f17.f456419e);
            java.lang.String g18 = x51.j1.g(f17.f456418d.f455610e);
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(g17, g18)) {
                    r45.f76 f76Var = f17.f456418d;
                    ca4.c0.d((f76Var == null || (c19806x4c372b7 = f76Var.f455609d) == null) ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1(new java.lang.Long(c19806x4c372b7.Id)), g17, g18);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPullRequestHelper", "reportAdPullException: " + th6);
            }
            y74.e eVar = y74.e.f541317a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            ((ku5.t0) ku5.t0.f394148d).g(new y74.b(currentTimeMillis2, 1));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
        } else {
            y74.e eVar2 = y74.e.f541317a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            ((ku5.t0) ku5.t0.f394148d).g(new y74.b(currentTimeMillis2, 0));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAdPullRequestCost", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
        }
        u64.p.c(this.f506518g, lVar);
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1");
        return f0Var;
    }
}
