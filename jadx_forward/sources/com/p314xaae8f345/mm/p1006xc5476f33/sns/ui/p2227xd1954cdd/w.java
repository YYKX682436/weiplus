package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd;

/* loaded from: classes4.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f252979d;

    /* renamed from: e, reason: collision with root package name */
    public long f252980e;

    /* renamed from: f, reason: collision with root package name */
    public volatile r45.qb6 f252981f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f252982g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f252983h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f252984i;

    /* renamed from: m, reason: collision with root package name */
    public int f252985m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f252986n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f252987o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f252979d = new java.util.ArrayList();
        this.f252986n = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.t.f252968d);
        this.f252987o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.j(this, activity));
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.g1 P6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w wVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        wVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = wVar.f252979d;
        int indexOf = arrayList2.indexOf(java.lang.Long.valueOf(wVar.f252980e)) + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        int intValue = ((java.lang.Number) ((jz5.n) wVar.f252986n).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.List subList = arrayList2.subList(indexOf, java.lang.Math.min(intValue + indexOf, arrayList2.size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
        java.util.List S0 = kz5.n0.S0(subList);
        arrayList.addAll(S0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "request list:".concat(kz5.n0.g0(S0, ";", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.c.f252875d, 30, null)));
        wVar.f252980e = ((java.lang.Number) kz5.n0.i0(arrayList)).longValue();
        long longExtra = wVar.m158359x1e885992().getLongExtra("key_ws_feed_id", 0L);
        boolean V6 = wVar.V6();
        int i17 = wVar.f252985m;
        wVar.f252985m = i17 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.g1 g1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.g1(V6, arrayList, i17, longExtra, arrayList2.size());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$buildCurrentRequestKey", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return g1Var;
    }

    public static final /* synthetic */ java.util.ArrayList Q6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w wVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTotalFeedList$p", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.ArrayList arrayList = wVar.f252979d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTotalFeedList$p", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x013c, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.l.g(r0, r1, r6) == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTotalList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if ((r1.length == 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r8 = r23;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        if (p3325xe03a0797.p3326xc267989b.l.g(r8, r11, r6) == r7) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w.R6(com.tencent.mm.plugin.sns.ui.wsfold.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object S6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        wVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        wVar.T6().d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.u(rVar));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$syncGetSnapshotList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return j17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLiveList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = (com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) ((jz5.n) this.f252987o).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLiveList", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return c16718x7059cefe;
    }

    public final void U6(o75.c cVar) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleDBEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("db id:");
        sb6.append(cVar.f425120a);
        sb6.append(" info:");
        sb6.append(cVar.f425123d);
        sb6.append(" size:");
        java.util.HashMap hashMap2 = cVar.f425124e;
        sb6.append(hashMap2 != null ? java.lang.Integer.valueOf(hashMap2.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", sb6.toString());
        o75.b bVar = o75.b.f425114b;
        o75.b bVar2 = o75.b.f425116d;
        o75.b bVar3 = cVar.f425120a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar3, bVar2)) {
            xc4.p pVar = (xc4.p) cVar.f425123d;
            if (pVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "handleDBEvent update id:" + bVar3 + " info:" + pVar.W0());
                xc4.p pVar2 = new xc4.p();
                pVar2.mo9762xbf5d97fd(pVar.t0(), false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(T6(), new zc4.b(pVar2, false), false, 2, null);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar3, o75.b.f425118f) && (hashMap = cVar.f425124e) != null) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                U6((o75.c) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleDBEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
    }

    public final boolean V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasMoreData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        java.util.ArrayList arrayList = this.f252979d;
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMoreData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            return false;
        }
        boolean z17 = ((java.lang.Number) kz5.n0.i0(arrayList)).longValue() != this.f252980e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasMoreData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return z17;
    }

    public final p3325xe03a0797.p3326xc267989b.r2 W6(yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchAfterJobFinish", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.i(this, h0Var, lVar, null), 2, null);
        h0Var.f391656d = d17;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchAfterJobFinish", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        return r2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        long longExtra = m158359x1e885992().getLongExtra("key_ws_feed_id", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDataUIC", "onCreate feed id:" + ca4.z0.t0(longExtra));
        if (longExtra == 0) {
            m158354x19263085().finish();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).Q6(m158354x19263085(), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.l(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observeDBChangeEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("observerLiveListEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.r(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("observerLiveListEvent", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f252982g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f252982g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
    }
}
