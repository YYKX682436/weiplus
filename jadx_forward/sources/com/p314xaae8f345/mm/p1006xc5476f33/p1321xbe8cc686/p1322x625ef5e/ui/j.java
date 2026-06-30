package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f177072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l f177073f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar, java.lang.String str, boolean z17) {
        this.f177073f = lVar;
        this.f177071d = str;
        this.f177072e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q v17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.l lVar = this.f177073f;
        android.database.Cursor b17 = cj6.b1(lVar.f177060a, 0, -1);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChooseMsgFileListUIController", "[loadData] cursor is null!");
            return;
        }
        java.util.List e17 = xv1.d.e(this.f177071d);
        long j17 = 0;
        while (b17.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(b17);
                java.lang.String j18 = f9Var.j();
                if (j18 != null && (v17 = ot0.q.v(j18)) != null) {
                    if (((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f430199i))) {
                        wv1.k kVar = new wv1.k(lVar.f177077d, f9Var, lVar.f177060a);
                        java.util.ArrayList arrayList = (java.util.ArrayList) e17;
                        boolean z17 = true;
                        if (arrayList.size() != 0) {
                            java.util.Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z17 = false;
                                    break;
                                } else if (kVar.d().endsWith((java.lang.String) it.next())) {
                                    break;
                                }
                            }
                        }
                        if (z17) {
                            long a17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(f9Var.mo78012x3fdd41df()));
                            if (j17 != a17) {
                                linkedList.add(new wv1.i(lVar.f177077d, f9Var.mo78012x3fdd41df()));
                            }
                            linkedList.add(kVar);
                            j17 = a17;
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                b17.close();
                throw th6;
            }
        }
        b17.close();
        ((java.util.ArrayList) lVar.f177078e).addAll(linkedList);
        linkedList.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChooseMsgFileListUIController", "[loadData] data:%s", java.lang.Integer.valueOf(((java.util.ArrayList) lVar.f177078e).size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.p1322x625ef5e.ui.i(this));
    }
}
