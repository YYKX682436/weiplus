package mz2;

/* loaded from: classes9.dex */
public class j1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5 c5900xd57eabf5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReleaseFingerPrintAuthEventListener", "ReleaseFingerPrintAuthEventListener account is not ready");
            return false;
        }
        if (!(c5900xd57eabf5 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5900xd57eabf5)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReleaseFingerPrintAuthEventListener", "handle ReleaseFingerPrintAuthEventListener");
        if (c5900xd57eabf5.f136206g.f89105a) {
            ((nz2.o) gm0.j1.s(nz2.o.class)).mo150320xae7a2e7a();
        } else {
            ((nz2.o) gm0.j1.s(nz2.o.class)).mo150319xae7a2e7a(false);
        }
        return true;
    }
}
