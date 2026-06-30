package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

@j95.b
/* loaded from: classes2.dex */
public final class l2 extends i95.w implements zy2.a7 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f207650h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f207652m;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c0 f207646d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c0(200);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b2 f207647e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b2();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f207648f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f207649g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f207651i = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f207653n = new java.util.concurrent.CopyOnWriteArraySet();

    public void Ai(java.util.List feedList, int i17, int i18, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        if (z17) {
            if (i18 != 0) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f207649g;
                java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(java.lang.Integer.valueOf(i18));
                if (l17 == null) {
                    l17 = 0L;
                }
                long longValue = l17.longValue();
                java.lang.Integer num = (java.lang.Integer) this.f207648f.get(java.lang.Integer.valueOf(i18));
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                if (longValue > 0 && c01.id.c() - longValue < intValue) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedDetailService", "preloadEncryptedFeedList skip, lastFetchTime:" + longValue + " intervalMs:" + intValue);
                    return;
                }
                concurrentHashMap.put(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c01.id.c()));
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = feedList.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                r45.rv0 rv0Var = new r45.rv0();
                rv0Var.set(1, (java.lang.String) lVar.f384366d);
                rv0Var.set(2, (java.lang.String) lVar.f384367e);
                linkedList.add(rv0Var);
            }
            Di(i17, i18, linkedList, 1, z18);
        }
    }

    public void Bi(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedDetailService", "preloadFeed " + pm0.v.u(feed.m76784x5db1b11()) + ", commentScene:" + i17 + ", preloadStage:" + i18);
        this.f207647e.a(i17, kz5.b0.c(feed), i18);
    }

    public final void Di(int i17, int i18, java.util.LinkedList objectIds, int i19, boolean z17) {
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Rf).mo141623x754a37bb()).r()).booleanValue()) {
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, java.lang.Integer.valueOf(i17));
            new az2.a(objectIds, qt2Var, i18).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.d2(i17, objectIds, z17, i18, this, i19));
            return;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        r45.qt2 qt2Var2 = new r45.qt2();
        qt2Var2.set(5, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.e2(i17, objectIds, z17, i18, this, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.f2 f2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.f2(i17, objectIds);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectIds, "objectIds");
        new bq.f(objectIds, qt2Var2, i18, -1).l().q(new cq.r(e2Var, f2Var, kVar, qt2Var2));
    }

    public void wi(int i17, java.lang.String encryptedObjectId, boolean z17, java.lang.String str, yz5.p call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptedObjectId, "encryptedObjectId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = z17 ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) this.f207646d.b(encryptedObjectId) : null;
        if (c19792x256d2725 != null) {
            call.mo149xb9724478(encryptedObjectId, c19792x256d2725);
            return;
        }
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(i17));
        qt2Var.set(11, str);
        new db2.g4(0L, "", 0, 2, "", true, null, null, 0L, null, false, false, encryptedObjectId, qt2Var, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536858560, null).l().H(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.c2(this, encryptedObjectId, call));
    }
}
