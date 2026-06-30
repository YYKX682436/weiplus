package re4;

/* loaded from: classes.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5606x62766eb5 c5606x62766eb5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5606x62766eb5) abstractC20979x809547d1;
        int i17 = c5606x62766eb5.f135931g.f90093a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsEnrolledListener", "hy: check mode: %d", java.lang.Integer.valueOf(i17));
        am.ag agVar = c5606x62766eb5.f135932h;
        if (i17 != 1 || !re4.g0.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetIsEnrolledListener", "hy: not support");
            agVar.f87686a = -1;
            return false;
        }
        boolean p17 = wt5.a.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsEnrolledListener", "hy: has enrolled fingerprint: %b", java.lang.Boolean.valueOf(p17));
        agVar.f87686a = p17 ? 1 : 0;
        return false;
    }
}
