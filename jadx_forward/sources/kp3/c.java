package kp3;

/* loaded from: classes11.dex */
public final class c implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.f f392499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f392500e;

    public c(kp3.f fVar, long j17) {
        this.f392499d = fVar;
        this.f392500e = j17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        kp3.f fVar = this.f392499d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = fVar.f392516t;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmGuideDialog", "autoHideTimer reach " + this.f392500e + " ms, hide dialog!");
        fVar.E("timeOut");
        return true;
    }
}
