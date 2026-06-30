package bg2;

/* loaded from: classes12.dex */
public final class v6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f102115d;

    public v6(bg2.j7 j7Var) {
        this.f102115d = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.qt2 qt2Var;
        bg2.j7 j7Var = this.f102115d;
        if (j7Var.f101750g) {
            return;
        }
        if (j7Var.f101751h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "doPollingRequestRunnable liveContext is null, cancel:".concat(j7Var.c()));
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.LinkedList<bg2.r6> linkedList = new java.util.LinkedList();
        java.util.Iterator it = j7Var.f101744a.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (it.hasNext()) {
            bg2.r6 r6Var = (bg2.r6) it.next();
            if (r6Var.f102006h > (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85276f4).mo141623x754a37bb()).r()).intValue() * 1000) + uptimeMillis) {
                break;
            }
            if (!r6Var.f102004f) {
                linkedList.add(r6Var);
                sb6.append(r6Var.m10423x9616526c());
                sb6.append(",");
                it.remove();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "doPollingRequest mergeGap:" + ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85276f4).mo141623x754a37bb()).r()).intValue() + ", " + ((java.lang.Object) sb6) + ' ' + j7Var.c());
        bg2.t6 t6Var = j7Var.f101751h;
        if (t6Var != null) {
            java.util.Map map = j7Var.f101745b;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bg2.r6 r6Var2 : linkedList) {
                arrayList.add(new jz5.l(java.lang.Integer.valueOf(r6Var2.f102002d), r6Var2));
            }
            kz5.c1.o(map, arrayList);
            boolean z17 = g92.b.f351302e.k2().m75939xb282bd08(4) == 3;
            bg2.t6 t6Var2 = j7Var.f101751h;
            if (t6Var2 == null || (qt2Var = t6Var2.f102062f) == null) {
                qt2Var = new r45.qt2();
                qt2Var.set(7, 0);
                qt2Var.set(5, 0);
            }
            r45.qt2 qt2Var2 = qt2Var;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bg2.r6 r6Var3 : linkedList) {
                r45.hj6 hj6Var = new r45.hj6();
                hj6Var.set(0, java.lang.Integer.valueOf(r6Var3.f102002d));
                hj6Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r6Var3.f102003e.mo14344x5f01b1f6()));
                hj6Var.set(2, (com.p314xaae8f345.mm.p2495xc50a8b8b.g) ((java.util.concurrent.ConcurrentHashMap) j7Var.f101746c).get(java.lang.Integer.valueOf(r6Var3.f102002d)));
                arrayList2.add(hj6Var);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "doPollingRequestRunnable request, cmdId to lastBuffer:".concat(kz5.n0.g0(linkedList2, null, null, null, 0, null, bg2.u6.f102088d, 31, null)));
            if (j7Var.f101750g) {
                return;
            }
            long j17 = t6Var.f102057a;
            long j18 = t6Var.f102058b;
            java.lang.String str = t6Var.f102059c;
            java.lang.String str2 = t6Var.f102060d;
            java.lang.String f17 = z17 ? xy2.c.f(qt2Var2) : null;
            yz5.a aVar = t6Var.f102061e;
            ek2.o2 o2Var = new ek2.o2(j17, j18, str, str2, f17, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(aVar != null ? (byte[]) aVar.mo152xb9724478() : null), linkedList2, null, j7Var, qt2Var2);
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((bg2.r6) it6.next()).f102007i = o2Var;
            }
            o2Var.l();
        }
        bg2.j7.b(j7Var);
    }
}
