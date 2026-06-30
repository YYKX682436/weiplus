package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {
    public i(com.p314xaae8f345.mm.p815xbe0af3c9.app.j jVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.i().f354741a.f354832d) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DefaultBootStep", "Kernel has not startup done!");
        try {
            com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p587xcc6637cd.C4713xf13e442a.j();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DefaultBootStep", "printTrace error, message = %s", th6.getMessage());
        }
    }
}
