package if3;

/* loaded from: classes.dex */
public class h0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public h0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (gm0.j1.a()) {
            if3.k0.Bi().getClass();
            if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(102409, null), 0L) > 900000) {
                if3.k0.Bi().a();
                if3.a0 Bi = if3.k0.Bi();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                Bi.getClass();
                c01.d9.b().p().w(102409, java.lang.Long.valueOf(currentTimeMillis));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PostTaskMassSendListener", "has not set uin");
        }
        return false;
    }
}
