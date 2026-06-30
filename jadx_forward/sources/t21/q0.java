package t21;

/* loaded from: classes12.dex */
public class q0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.r0 f496416d;

    public q0(t21.r0 r0Var) {
        this.f496416d = r0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        t21.r0 r0Var = this.f496416d;
        if (r0Var.mo807x6c193ac1(r0Var.m47995xb7ba1aa7(), r0Var.f496436d) != -1) {
            return false;
        }
        r0Var.f496436d.mo815x76e0bfae(3, -1, "doScene failed", r0Var);
        return false;
    }
}
