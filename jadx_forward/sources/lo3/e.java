package lo3;

/* loaded from: classes8.dex */
public class e implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo3.f f401717d;

    public e(lo3.f fVar) {
        this.f401717d = fVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        lo3.g gVar = this.f401717d.f401718d;
        lo3.g gVar2 = lo3.g.INSTANCE;
        gVar.getClass();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.vivo.intent.action.SECURE_FRAUD_DETECT");
            intent.setPackage("com.iqoo.secure");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.bindService(intent, gVar.f401723f, 1)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VAFM", "connect to vivo service failed");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VAFM", "connect to vivo service error: " + th6);
        }
    }
}
