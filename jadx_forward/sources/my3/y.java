package my3;

/* loaded from: classes13.dex */
public final class y implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.c0 f414378d;

    public y(my3.c0 c0Var) {
        this.f414378d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "require login but expire time");
        my3.v vVar = this.f414378d.f414325g;
        if (vVar == null) {
            return false;
        }
        ((iy3.e) vVar).a("", "");
        return false;
    }
}
