package com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534;

/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f149736b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f149735a = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f149737c = "log_id";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f149738d = "log_ext";

    public static void a(jj0.b bVar) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(f149737c, bVar.f381495a);
            bundle.putString(f149738d, bVar.f381496b);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.j.class, null);
            return;
        }
        synchronized (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.class) {
            if (!gm0.j1.b().m() || gm0.m.r()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportService", "report, account not ready");
            } else if (bVar != null) {
                f149735a.add(bVar);
                b();
            }
        }
    }

    public static synchronized void b() {
        synchronized (com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.k.class) {
            if (f149736b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportService", "tryDoScene isBusy");
                return;
            }
            java.util.LinkedList linkedList = f149735a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportService", "waitingList is null");
                return;
            }
            jj0.b bVar = (jj0.b) linkedList.remove(0);
            if (bVar != null) {
                f149736b = true;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152199c = "/cgi-bin/micromsg-bin/gamereportkv";
                lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60865x13318ab6;
                lVar.f152201e = 0;
                lVar.f152202f = 0;
                mj0.c cVar = new mj0.c();
                cVar.f408518d = o45.wf.f424558c;
                cVar.f408519e = o45.wf.f424557b;
                cVar.f408520f = o45.wf.f424560e;
                cVar.f408521g = wo.q.f529318f;
                cVar.f408522h = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                cVar.f408523i = bVar.f381495a;
                cVar.f408524m = bVar.f381496b;
                lVar.f152197a = cVar;
                lVar.f152198b = new mj0.d();
                com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.i(), false);
            } else {
                b();
            }
        }
    }
}
