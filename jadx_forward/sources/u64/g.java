package u64;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f506525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f506525d = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        u64.g gVar = new u64.g(this.f506525d, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("create", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        u64.g gVar = (u64.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gVar.mo150x989b7ca4(f0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", "tryPreloadResource !");
        u64.p pVar = u64.p.f506556a;
        jz5.l lVar = this.f506525d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        r45.g5 f17 = pVar.f(lVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAdPullObjOrNull", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        if (f17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        } else {
            r45.f76 f76Var = f17.f456418d;
            java.lang.String g17 = x51.j1.g(f76Var != null ? f76Var.f455610e : null);
            if (g17 == null) {
                g17 = "";
            }
            java.lang.String Username = f17.f456418d.f455609d.f38999xf403ecf6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Username, "Username");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Username)) {
                boolean W = ca4.m0.W(g17);
                boolean e07 = ca4.m0.e0(g17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUpdate contact:");
                sb6.append(Username);
                sb6.append(", isUsePreferedInfo=");
                sb6.append(W);
                sb6.append(", isForbidUpdateContact=");
                sb6.append(e07);
                sb6.append(", snsId=");
                r45.f76 f76Var2 = f17.f456418d;
                sb6.append(ca4.z0.s0((f76Var2 == null || (c19806x4c372b7 = f76Var2.f455609d) == null) ? 0L : c19806x4c372b7.Id));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPullRequestHelper", sb6.toString());
                if (!W && !e07) {
                    c01.n8.a().c(Username, 3);
                    ((ku5.t0) ku5.t0.f394148d).k(new u64.o(Username), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                }
            }
            n74.v1.e(f17, 1);
            za4.f1.b(f17, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$tryPreloadResource", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$2$2$3");
        return f0Var;
    }
}
