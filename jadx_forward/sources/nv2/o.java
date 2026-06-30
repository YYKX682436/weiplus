package nv2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final nv2.o f422091e = new nv2.o();

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f422092a = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finder_action_fav_post_quene"));

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f422093b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f422094c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f422095d = new nv2.n(this);

    public static void a(nv2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feed, boolean z17, int i17, nv2.i1 i1Var, r45.qt2 contextObj, int i18, java.lang.String str, r45.t21 t21Var, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        nv2.i1 i1Var2 = (i19 & 8) != 0 ? null : i1Var;
        int i27 = (i19 & 32) != 0 ? 0 : i18;
        java.lang.String str2 = (i19 & 64) != 0 ? null : str;
        r45.t21 newLifeReportInfo = (i19 & 128) != 0 ? new r45.t21() : t21Var;
        r45.bc1 bc1Var2 = (i19 & 256) != 0 ? null : bc1Var;
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newLifeReportInfo, "newLifeReportInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavActionMgr", "dolike " + feed.m59299x6bf53a6c() + ' ' + z17);
        long j17 = feed.f66939xc8a07680;
        nv2.l lVar = new nv2.l(feed, j17, feed.m59276x6c285d75(), z17, i17, i1Var2, contextObj, i27, str2, newLifeReportInfo, bc1Var2);
        oVar.f422094c.put(java.lang.Long.valueOf(j17), lVar);
        oVar.f422092a.b(new nv2.q(lVar), new nv2.m(oVar, lVar));
    }

    public final int b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "f");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) t70Var.d2().r()).booleanValue()) {
            return f17.m76768xb80ecc2a();
        }
        if (f17.m76784x5db1b11() == 0) {
            return f17.m76791xf4204902();
        }
        if ((((java.lang.Number) t70Var.w0().r()).intValue() == 1) && (h17 = bu2.j.f106067a.h(f17.m76784x5db1b11())) != null && (feedObject = h17.getFeedObject()) != null) {
            f17 = feedObject;
        }
        boolean z17 = f17.m76769xfdaf34f1() == 1;
        nv2.l lVar = (nv2.l) this.f422094c.get(java.lang.Long.valueOf(f17.m76784x5db1b11()));
        boolean z18 = lVar != null ? lVar.f422055g : z17;
        return (!z17 || z17 == z18) ? (z17 || z17 == z18) ? f17.m76768xb80ecc2a() : f17.m76768xb80ecc2a() + 1 : f17.m76768xb80ecc2a() - 1;
    }

    public final boolean c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d2().r()).booleanValue()) {
            return feed.m76769xfdaf34f1() == 1;
        }
        if (feed.m76784x5db1b11() == 0) {
            return feed.m76769xfdaf34f1() == 1;
        }
        boolean z17 = feed.m76769xfdaf34f1() == 1;
        nv2.l lVar = (nv2.l) this.f422094c.get(java.lang.Long.valueOf(feed.m76784x5db1b11()));
        if (lVar != null) {
            z17 = lVar.f422055g;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z17;
    }

    public final void d(nv2.l action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f422094c;
        long j17 = action.f422053e;
        nv2.l lVar = (nv2.l) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (lVar != null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (action.f422108c >= lVar.f422108c) {
                concurrentHashMap.remove(java.lang.Long.valueOf(j17));
            }
        }
    }

    public final void e() {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f422093b;
        if (concurrentLinkedQueue.size() <= 0) {
            return;
        }
        nv2.r rVar = (nv2.r) concurrentLinkedQueue.poll();
        boolean b17 = rVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavActionMgr", "tryNext isValid:" + b17 + " action:" + rVar + " size:" + concurrentLinkedQueue.size());
        if (!b17) {
            e();
            return;
        }
        this.f422092a.b(new nv2.q(rVar), new nv2.m(this, rVar));
    }
}
