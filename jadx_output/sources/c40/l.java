package c40;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        b40.f fVar = (b40.f) i95.n0.c(b40.f.class);
        boolean Bi = fVar.Bi();
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FCMFeatureService", "fcmUnRegisterEventListener callback loadFCM=" + Bi);
        if (!Bi) {
            return false;
        }
        fVar.Ai();
        return false;
    }
}
