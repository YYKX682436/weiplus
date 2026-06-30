package xc;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {
    public i(xc.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (((km0.c) gm0.j1.p().a()).a() && ((h45.q) i95.n0.c(h45.q.class)).mo24775x5d907d7e()) {
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
                sb6.append(com.p314xaae8f345.mm.app.w.INSTANCE.f135422n ? 1 : 0);
                m27539xaf65a0fc.mo27566xe4673800("foreground", sb6.toString());
                m27539xaf65a0fc.mo27566xe4673800(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "lowMemory");
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27478xa70f4ea8(m27539xaf65a0fc);
            }
        } catch (java.lang.Exception | java.lang.UnsatisfiedLinkError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KindaAppStatusCallback", e17, "", new java.lang.Object[0]);
        }
    }
}
