package zg3;

/* loaded from: classes.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17 = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501) abstractC20979x809547d1).f135626g.f88169a;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAG", "do init start");
            c01.e2.f118651b = true;
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TAG", "do init end");
            c01.e2.f118651b = false;
        }
        return false;
    }
}
