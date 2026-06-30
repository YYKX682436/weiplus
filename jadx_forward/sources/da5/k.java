package da5;

/* loaded from: classes11.dex */
public final class k extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (!event.f135497g.f87945a) {
            return false;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UDRAffCheckerListener", "callback fail. account not ready.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRAffCheckerListener", "call udr listener");
        ((ku5.t0) ku5.t0.f394148d).l(new da5.i(this), 2000L, "UDRUpdate");
        ((ku5.t0) ku5.t0.f394148d).h(new da5.j(this), "UDRClean");
        return false;
    }
}
