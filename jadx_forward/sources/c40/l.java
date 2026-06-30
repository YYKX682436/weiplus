package c40;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        b40.f fVar = (b40.f) i95.n0.c(b40.f.class);
        boolean Bi = fVar.Bi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FCM.FCMFeatureService", "fcmUnRegisterEventListener callback loadFCM=" + Bi);
        if (!Bi) {
            return false;
        }
        fVar.Ai();
        return false;
    }
}
