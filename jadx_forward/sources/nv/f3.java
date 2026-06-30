package nv;

/* loaded from: classes11.dex */
public class f3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7 c5714xc4ebffe7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7) abstractC20979x809547d1;
        if (c5714xc4ebffe7 == null || c5714xc4ebffe7.f136035g == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent.");
        gm0.j1.e().j(new nv.e3(this, c5714xc4ebffe7));
        return false;
    }
}
