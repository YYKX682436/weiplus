package zx5;

/* loaded from: classes13.dex */
public class i implements java.lang.Runnable {
    public i(zx5.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        by5.a4.d();
        if ("true".equalsIgnoreCase(com.p314xaae8f345.p3210x3857dc.b.m().g("dis_refresh_main_cmd", "tools"))) {
            by5.c4.f("XWebBroadcastListener", "onMainCfgUpdated, dis_refresh_main_cmd false");
            return;
        }
        synchronized (com.p314xaae8f345.p3210x3857dc.b.class) {
            by5.c4.f("CommandCfg", "resetCommandCfg, module: " + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m(""));
            com.p314xaae8f345.p3210x3857dc.b.f301742c = null;
            com.p314xaae8f345.p3210x3857dc.b.m();
        }
        java.util.List list = com.p314xaae8f345.p3210x3857dc.n0.f301877a;
        synchronized (com.p314xaae8f345.p3210x3857dc.n0.class) {
            com.p314xaae8f345.p3210x3857dc.n0.f301880d = false;
            com.p314xaae8f345.p3210x3857dc.n0.f301877a = new java.util.ArrayList();
            com.p314xaae8f345.p3210x3857dc.n0.f301878b = new java.util.ArrayList();
            com.p314xaae8f345.p3210x3857dc.n0.f301879c = new java.util.ArrayList();
            com.p314xaae8f345.p3210x3857dc.n0.b();
        }
        synchronized (zx5.h.class) {
            by5.c4.f("XWebAutoUpdater", "resetAutoCheckUpdatePeriod, sEnableAutoCheckUpdate:" + zx5.h.f558778c + ", sAutoCheckUpdateWorkerStarted:" + zx5.h.f558777b);
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = zx5.h.f558778c;
            if ((atomicBoolean != null && atomicBoolean.get()) && zx5.h.f558777b) {
                zx5.h.b();
            }
        }
        tx5.h b17 = tx5.j.b(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
        if (b17 != null) {
            b17.mo120205xb04520a3(80036, new java.lang.Object[0]);
        }
    }
}
