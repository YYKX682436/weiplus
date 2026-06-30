package zt1;

/* loaded from: classes8.dex */
public class s extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public s() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCard.ResetCardRetryCounter", "deal with reset card retry counter event");
        xt1.t0.hj().f538100d.A("PendingCardId", "update PendingCardId set retryCount = 0 where retryCount >= 10");
        return false;
    }
}
