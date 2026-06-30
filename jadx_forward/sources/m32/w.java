package m32;

/* loaded from: classes13.dex */
public class w extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273 c5160x33ad8273 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5160x33ad8273) abstractC20979x809547d1;
        if (!gm0.j1.b().m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RtosOnForegroundListener", "account not ready");
            return false;
        }
        fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c5160x33ad8273.f135510g.f89217a);
        my3.q qVar = (my3.q) eVar;
        qVar.getClass();
        boolean booleanValue = valueOf.booleanValue();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f414355e) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f414354d)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onForegroundChange isForeground:%b errorcode:%d", java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(qVar.f414357g.f395150d));
        int i17 = qVar.f414357g.f395150d;
        if (i17 != 1 && i17 != 10) {
            return false;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(booleanValue), iy3.m.class);
        return false;
    }
}
