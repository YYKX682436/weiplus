package zf4;

/* loaded from: classes13.dex */
public class z implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.a0 f554240d;

    public z(zf4.a0 a0Var) {
        this.f554240d = a0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        try {
            zf4.a0.a(this.f554240d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceRemindService", e17, "", new java.lang.Object[0]);
        }
        return false;
    }
}
