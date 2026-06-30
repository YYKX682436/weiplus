package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes2.dex */
public final class i2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f207609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 f207610f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207611g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f207612h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(int i17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var, int i18, int i19) {
        super(0);
        this.f207608d = i17;
        this.f207609e = j17;
        this.f207610f = l2Var;
        this.f207611g = i18;
        this.f207612h = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject;
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed commentScene:");
        int i17 = this.f207608d;
        sb6.append(i17);
        sb6.append(' ');
        long j17 = this.f207609e;
        sb6.append(pm0.v.u(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedDetailService", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j17);
        boolean z17 = h17 == null || !h17.m59347x965c8f17();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        int i18 = this.f207612h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2 l2Var = this.f207610f;
        if (z17) {
            java.lang.Runnable runnable = l2Var.f207650h;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = l2Var.f207651i;
            if (runnable != null) {
                copyOnWriteArraySet.add(java.lang.Long.valueOf(j17));
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recordPreloadFeed 聚合 commentScene:");
                sb7.append(i17);
                sb7.append(" feedId:");
                sb7.append(pm0.v.u(j17));
                sb7.append(" list:");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArraySet, 10));
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    java.lang.Long l17 = (java.lang.Long) it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                    arrayList.add(pm0.v.u(l17.longValue()));
                }
                sb7.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedDetailService", sb7.toString());
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                copyOnWriteArraySet.add(java.lang.Long.valueOf(j17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.h2(l2Var, i17, this.f207611g, i18);
                l2Var.f207650h = h2Var;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(h2Var, 300L);
            }
        } else if (h17 != null && (feedObject = h17.getFeedObject()) != null) {
            l2Var.f207647e.a(i17, kz5.b0.c(feedObject), i18);
        }
        return f0Var2;
    }
}
