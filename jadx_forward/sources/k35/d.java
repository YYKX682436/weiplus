package k35;

/* loaded from: classes11.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        bm5.p1 p1Var = k35.c.f385431e;
        int i17 = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501) abstractC20979x809547d1).f135626g.f88169a;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "do init start");
            k35.c.f385435i = true;
        } else if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "do init end");
            k35.c.f385435i = false;
        }
        return false;
    }
}
