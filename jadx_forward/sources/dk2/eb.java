package dk2;

/* loaded from: classes12.dex */
public final class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.tb f314901d;

    public eb(dk2.tb tbVar) {
        this.f314901d = tbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km2.r rVar;
        km2.r rVar2;
        dk2.tb tbVar = this.f314901d;
        if (tbVar.f315659g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "doPollingRequestRunnable liveContext is null, cancel:".concat(tbVar.c()));
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.LinkedList<dk2.bb> linkedList = new java.util.LinkedList();
        java.util.Iterator it = tbVar.f315653a.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (it.hasNext()) {
            dk2.bb bbVar = (dk2.bb) it.next();
            if (bbVar.f314785h > (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85276f4).mo141623x754a37bb()).r()).intValue() * 1000) + uptimeMillis) {
                break;
            }
            if (!bbVar.f314783f) {
                linkedList.add(bbVar);
                sb6.append(bbVar.m124547x9616526c());
                sb6.append(",");
                it.remove();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "doPollingRequest mergeGap:" + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85276f4).mo141623x754a37bb()).r()).intValue() + ", " + ((java.lang.Object) sb6) + ' ' + tbVar.c());
        gk2.e eVar = tbVar.f315659g;
        if (eVar != null) {
            java.util.Map map = tbVar.f315654b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (dk2.bb bbVar2 : linkedList) {
                arrayList.add(new jz5.l(java.lang.Integer.valueOf(bbVar2.f314781d), bbVar2));
            }
            kz5.c1.o(map, arrayList);
            boolean z17 = g92.b.f351302e.k2().m75939xb282bd08(4) == 3;
            r45.qt2 qt2Var = new r45.qt2();
            km2.n nVar = dk2.ef.H;
            qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f390684c) == null) ? 0 : rVar2.f390739k));
            km2.n nVar2 = dk2.ef.H;
            qt2Var.set(5, java.lang.Integer.valueOf((nVar2 == null || (rVar = nVar2.f390684c) == null) ? 0 : rVar.f390739k));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (dk2.bb bbVar3 : linkedList) {
                r45.hj6 hj6Var = new r45.hj6();
                hj6Var.set(0, java.lang.Integer.valueOf(bbVar3.f314781d));
                hj6Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bbVar3.f314782e.mo14344x5f01b1f6()));
                hj6Var.set(2, (com.p314xaae8f345.mm.p2495xc50a8b8b.g) ((java.util.concurrent.ConcurrentHashMap) tbVar.f315655c).get(java.lang.Integer.valueOf(bbVar3.f314781d)));
                arrayList2.add(hj6Var);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLivePollingService", "doPollingRequestRunnable request, cmdId to lastBuffer:".concat(kz5.n0.g0(linkedList2, null, null, null, 0, null, dk2.db.f314859d, 31, null)));
            ek2.o2 o2Var = new ek2.o2(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o, z17 ? xy2.c.f(qt2Var) : null, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((mm2.e1) eVar.a(mm2.e1.class)).f410518o), linkedList2, ((mm2.c1) eVar.a(mm2.c1.class)).f410377m5, tbVar, qt2Var);
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((dk2.bb) it6.next()).f314786i = o2Var;
            }
            o2Var.l();
        }
        dk2.tb.b(tbVar);
    }
}
