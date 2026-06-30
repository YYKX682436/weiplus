package o30;

/* loaded from: classes.dex */
public class g implements gm0.i2 {
    @Override // gm0.i2
    public void kh(int i17) {
        h62.d vj6 = h62.d.vj();
        vj6.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExptService", "client upgrade now, reset last update time. previous version [%d]", java.lang.Integer.valueOf(i17));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0);
            vj6.wi(3);
            vj6.Cj(false);
            vj6.Hj(3);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExptService", e17, "onAccountInitialized error[%s]", e17.toString());
        }
    }
}
