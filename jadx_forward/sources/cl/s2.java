package cl;

/* loaded from: classes7.dex */
public class s2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f124293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.t2 f124294e;

    public s2(cl.t2 t2Var, cl.w2 w2Var, cl.q0 q0Var) {
        this.f124294e = t2Var;
        this.f124293d = q0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        cl.t2 t2Var = this.f124294e;
        t2Var.f124304p = elapsedRealtimeNanos;
        ((cl.a) this.f124293d.f124257b).h(t2Var, false);
        return false;
    }
}
