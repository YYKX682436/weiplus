package vc;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {
    public x(vc.z zVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxKindaApiFeatureService", "kinda onAccountInitialized");
            if (((km0.c) gm0.j1.p().a()).a() && ((h45.q) i95.n0.c(h45.q.class)).mo24775x5d907d7e()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxKindaApiFeatureService", "kinda onAccountInitialized, restart begin");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27480x63bd969f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxKindaApiFeatureService", "kinda onAccountInitialized, restart done");
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxKindaApiFeatureService", e17, "", new java.lang.Object[0]);
        }
    }
}
