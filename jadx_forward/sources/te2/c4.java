package te2;

/* loaded from: classes3.dex */
public final class c4 implements te2.w3 {

    /* renamed from: n, reason: collision with root package name */
    public static final te2.y3 f499452n = new te2.y3(null);

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f499453d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f499454e;

    /* renamed from: f, reason: collision with root package name */
    public final km2.q f499455f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f499456g;

    /* renamed from: h, reason: collision with root package name */
    public te2.x3 f499457h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f499458i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.ResultReceiverC14188xdcc3e210 f499459m;

    public c4(gk2.e liveData, qo0.c statusMonitor, km2.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f499453d = liveData;
        this.f499454e = statusMonitor;
        this.f499455f = qVar;
        this.f499456g = "FinderLiveLuckyMoneyBubblePresenter_" + hashCode();
        this.f499458i = new java.util.concurrent.ConcurrentLinkedDeque();
    }

    public final java.util.Map c() {
        java.lang.String str;
        jz5.l[] lVarArr = new jz5.l[11];
        gk2.e eVar = this.f499453d;
        r45.nw1 nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r;
        if (nw1Var != null) {
            long m75942xfb822ef2 = nw1Var.m75942xfb822ef2(0);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            str = b52.b.q(m75942xfb822ef2);
        } else {
            str = null;
        }
        lVarArr[0] = new jz5.l("live_id", str);
        r45.nw1 nw1Var2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r;
        lVarArr[1] = new jz5.l("live_start_time", nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.m75939xb282bd08(4)) : null);
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f410516m;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("feed_id", b52.b.q(j17));
        lVarArr[3] = new jz5.l("live_time", ((mm2.e1) eVar.a(mm2.e1.class)).f410521r != null ? java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - (r3.m75939xb282bd08(4) * 1000)) : null);
        lVarArr[4] = new jz5.l("session_buffer", ((mm2.e1) eVar.a(mm2.e1.class)).f410526w);
        lVarArr[5] = new jz5.l("enter_session_id", java.lang.Long.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[6] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[7] = new jz5.l("finder_tab_context_id", b52.b.c());
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        lVarArr[8] = new jz5.l("comment_scene", a52.a.f83117l);
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        lVarArr[9] = new jz5.l("finder_username", c1Var != null ? c1Var.f410385o : null);
        lVarArr[10] = new jz5.l("behaviour_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        return kz5.c1.l(lVarArr);
    }

    public java.lang.String f() {
        te2.z3 z3Var;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f499458i;
        if (concurrentLinkedDeque.isEmpty() || (z3Var = (te2.z3) concurrentLinkedDeque.peekFirst()) == null) {
            return null;
        }
        return z3Var.f500091c;
    }

    public void g() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBubbleClick: current size:");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f499458i;
        sb6.append(concurrentLinkedDeque.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499456g, sb6.toString());
        te2.z3 z3Var = (te2.z3) concurrentLinkedDeque.peekFirst();
        java.lang.Object obj = this.f499457h;
        ie2.a aVar = obj instanceof ie2.a ? (ie2.a) obj : null;
        int i17 = aVar != null && aVar.x() ? 2 : 1;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c50.c1.ii((c50.c1) c17, ml2.f5.f408990e, android.text.TextUtils.isEmpty(z3Var != null ? z3Var.f500091c : null) ? ml2.e5.f408923f : ml2.e5.f408924g, false, i17, 4, null);
        te2.x3 x3Var = this.f499457h;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085 = x3Var != null ? x3Var.mo978x19263085() : null;
        if (z3Var == null || mo978x19263085 == null) {
            return;
        }
        if (this.f499459m == null) {
            android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77777x504cd8a2, "createFreeHandler(...)");
            this.f499459m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.ResultReceiverC14188xdcc3e210(this, m77777x504cd8a2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.ResultReceiverC14188xdcc3e210 resultReceiverC14188xdcc3e210 = this.f499459m;
        if (resultReceiverC14188xdcc3e210 != null) {
            resultReceiverC14188xdcc3e210.f193099f = new java.lang.ref.WeakReference(z3Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(resultReceiverC14188xdcc3e210.f193097d, "setLuckyMoneyShowInfo info:" + z3Var);
        }
        qo0.c cVar = this.f499454e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        dk2.xf m57666x7e07ad96 = k0Var != null ? k0Var.m57666x7e07ad96() : null;
        if (m57666x7e07ad96 != null) {
            ((dk2.r4) m57666x7e07ad96).W(mo978x19263085, z3Var.f500089a, this.f499459m, new te2.a4(this));
        }
    }

    public final void h(te2.z3 showInfo) {
        java.util.Set set;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showInfo, "showInfo");
        rl2.j jVar = (rl2.j) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148529t).mo141623x754a37bb();
        long m75942xfb822ef2 = ((mm2.e1) this.f499453d.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        jVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCache liveId:");
        sb6.append(m75942xfb822ef2);
        sb6.append(" sendId:");
        java.lang.String str = showInfo.f500090b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLuckyMoneyStorage", sb6.toString());
        if (str != null && (set = (java.util.Set) jVar.f478733f.get(java.lang.Long.valueOf(m75942xfb822ef2))) != null) {
            set.add(str);
        }
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f499458i;
        concurrentLinkedDeque.remove(showInfo);
        te2.x3 x3Var = this.f499457h;
        if (x3Var != null) {
            x3Var.p(concurrentLinkedDeque.size());
        }
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetach ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499456g, sb6.toString());
        te2.x3 x3Var = this.f499457h;
        if (x3Var != null) {
            x3Var.mo166307x5cd39ffa();
        }
        this.f499457h = null;
    }
}
