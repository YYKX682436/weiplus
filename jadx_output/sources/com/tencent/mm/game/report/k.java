package com.tencent.mm.game.report;

/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f68203b;

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f68202a = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f68204c = "log_id";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f68205d = "log_ext";

    public static void a(jj0.b bVar) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(f68204c, bVar.f299962a);
            bundle.putString(f68205d, bVar.f299963b);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.game.report.j.class, null);
            return;
        }
        synchronized (com.tencent.mm.game.report.k.class) {
            if (!gm0.j1.b().m() || gm0.m.r()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ReportService", "report, account not ready");
            } else if (bVar != null) {
                f68202a.add(bVar);
                b();
            }
        }
    }

    public static synchronized void b() {
        synchronized (com.tencent.mm.game.report.k.class) {
            if (f68203b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportService", "tryDoScene isBusy");
                return;
            }
            java.util.LinkedList linkedList = f68202a;
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ReportService", "waitingList is null");
                return;
            }
            jj0.b bVar = (jj0.b) linkedList.remove(0);
            if (bVar != null) {
                f68203b = true;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70666c = "/cgi-bin/micromsg-bin/gamereportkv";
                lVar.f70667d = com.tencent.wxmm.v2helper.EMethodPcMicLevel;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                mj0.c cVar = new mj0.c();
                cVar.f326985d = o45.wf.f343025c;
                cVar.f326986e = o45.wf.f343024b;
                cVar.f326987f = o45.wf.f343027e;
                cVar.f326988g = wo.q.f447785f;
                cVar.f326989h = com.tencent.mm.sdk.platformtools.m2.d();
                cVar.f326990i = bVar.f299962a;
                cVar.f326991m = bVar.f299963b;
                lVar.f70664a = cVar;
                lVar.f70665b = new mj0.d();
                com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.game.report.i(), false);
            } else {
                b();
            }
        }
    }
}
