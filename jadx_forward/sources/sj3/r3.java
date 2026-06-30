package sj3;

/* loaded from: classes5.dex */
public final class r3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f490261d;

    public r3(sj3.d4 d4Var) {
        this.f490261d = d4Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkSmallWindow", "click small view and time is up we remove it..");
        sj3.d4 d4Var = this.f490261d;
        d4Var.e(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = d4Var.f490012h;
        if (b4Var == null) {
            return true;
        }
        b4Var.d();
        return true;
    }
}
