package v60;

/* loaded from: classes5.dex */
public final class e0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5257x89865775) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.t2 t2Var = event.f135588g;
        int i17 = t2Var.f89499a;
        if (i17 != 216) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayWPHKUrlResUpdateOperationListener", "get notify res type:%d subType:%d operation:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(t2Var.f89500b), java.lang.Integer.valueOf(t2Var.f89501c));
        if (t2Var.f89501c != 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayWPHKUrlResUpdateOperationListener", "report get res update");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1882, 113);
        return false;
    }
}
