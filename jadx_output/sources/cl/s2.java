package cl;

/* loaded from: classes7.dex */
public class s2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl.q0 f42760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl.t2 f42761e;

    public s2(cl.t2 t2Var, cl.w2 w2Var, cl.q0 q0Var) {
        this.f42761e = t2Var;
        this.f42760d = q0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
        cl.t2 t2Var = this.f42761e;
        t2Var.f42771p = elapsedRealtimeNanos;
        ((cl.a) this.f42760d.f42724b).h(t2Var, false);
        return false;
    }
}
