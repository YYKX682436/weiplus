package vr4;

/* loaded from: classes9.dex */
public final class x0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public x0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5877x25850d40 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5877x25850d40) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ReceiveCommonPayAppMsgEvent: ");
        am.tp tpVar = event.f136185g;
        sb6.append(tpVar.f89562b);
        sb6.append(", ");
        sb6.append(tpVar.f89561a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReceiveCommonPayAppMsgEventListener", sb6.toString());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tpVar.f89562b) && tpVar.f89561a >= 0) {
            try {
                jz5.g gVar = rb3.g.f475391a;
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) rb3.g.f475393c).mo141623x754a37bb();
                up5.a0 a0Var = new up5.a0();
                a0Var.f511421a = tpVar.f89562b;
                a0Var.f511422b = java.lang.Long.valueOf(tpVar.f89561a);
                a0Var.f511423c = tpVar.f89563c;
                c26924x4cd4bae.m107158x7beb81f7(a0Var);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReceiveCommonPayAppMsgEventListener", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
