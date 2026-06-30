package c40;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        b40.f fVar = (b40.f) i95.n0.c(b40.f.class);
        fVar.getClass();
        if (!gm0.j1.a()) {
            return false;
        }
        boolean Bi = fVar.Bi();
        com.tencent.mars.xlog.Log.i("MicroMsg.FCM.FCMFeatureService", "fcmRegisterEventListener callback loadFCM=" + Bi);
        if (!Bi) {
            return false;
        }
        fVar.wi();
        return false;
    }
}
