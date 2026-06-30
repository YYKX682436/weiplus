package m32;

/* loaded from: classes13.dex */
public class u extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public u() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10) abstractC20979x809547d1;
        if (!(c5691xc916fb10 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RtosLogoutEvent", "Logout Event callback. reason:%d ", java.lang.Integer.valueOf(c5691xc916fb10.f136017g.f88369a));
        int i18 = c5691xc916fb10.f136017g.f88369a;
        if (i18 != 0 && i18 != 1 && i18 != 3) {
            return false;
        }
        my3.q qVar = (my3.q) ((fy3.e) i95.n0.c(fy3.e.class));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f414355e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f414354d) && ((i17 = qVar.f414357g.f395150d) == 1 || i17 == 10)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "logout");
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274590e, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.v.class);
            qVar.oj();
        }
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).Vi();
        return false;
    }
}
