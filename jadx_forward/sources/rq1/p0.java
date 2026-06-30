package rq1;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq1.m0 f480308d;

    public p0(rq1.m0 m0Var) {
        this.f480308d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        rq1.m0 m0Var = this.f480308d;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
                if (m0Var.f480298f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.PluginBox", "flight number is loading");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.PluginBox", "start to load flight number");
                    m0Var.f480298f = true;
                    if (!com.p314xaae8f345.mm.vfs.w6.j(rq1.m0.Di())) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.PluginBox", "flight number file not exist");
                        m0Var.f480298f = false;
                        return;
                    }
                    java.lang.String[] split = new java.lang.String(com.p314xaae8f345.mm.vfs.w6.N(rq1.m0.Di(), 0, -1)).split("\n");
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m mVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m.f272799d;
                    mVar.f272802c = null;
                    mVar.f272800a = 0;
                    mVar.f272801b = 0;
                    for (int i17 = 0; i17 < split.length; i17++) {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[i17])) {
                            mVar.a(split[i17]);
                        }
                    }
                    m0Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.PluginBox", "load flight number success NodeCount：%d CharacterCount：%d useTime: %d", java.lang.Integer.valueOf(mVar.f272801b), java.lang.Integer.valueOf(mVar.f272800a), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (java.lang.Exception e17) {
                sq1.a.a(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Box.PluginBox", e17, e17.getMessage(), new java.lang.Object[0]);
            }
            m0Var.f480298f = false;
        } catch (java.lang.Throwable th6) {
            m0Var.f480298f = false;
            throw th6;
        }
    }
}
