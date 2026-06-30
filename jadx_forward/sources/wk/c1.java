package wk;

/* loaded from: classes6.dex */
public class c1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RequestAccountSyncEventListener", "requestAccountSync()");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RequestAccountSyncEventListener", "MMApplicationContext.getContext() == null");
        return false;
    }
}
