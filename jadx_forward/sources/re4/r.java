package re4;

/* loaded from: classes.dex */
public class r extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public r() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5608x14193b64 c5608x14193b64 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5608x14193b64) abstractC20979x809547d1;
        if (c5608x14193b64 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5608x14193b64) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSoterSupportEventListener", "hy: request is support soter");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSoterSupportEventListener", "isSupportSoter: %b", java.lang.Boolean.valueOf(re4.g0.c()));
            if (re4.g0.c()) {
                c5608x14193b64.f135934g.f87885a = 1;
            } else {
                c5608x14193b64.f135934g.f87885a = 0;
            }
        }
        return true;
    }
}
