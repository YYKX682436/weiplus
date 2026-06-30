package t21;

/* loaded from: classes12.dex */
public class p1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f496394d;

    public p1(t21.w0 w0Var) {
        this.f496394d = w0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        t21.w0 w0Var = this.f496394d;
        if (w0Var.mo807x6c193ac1(w0Var.m47995xb7ba1aa7(), w0Var.f496564d) == -1) {
            w0Var.f496569i = 0 - (fp.k.a() + 10000);
            w0Var.f496564d.mo815x76e0bfae(3, -1, "doScene failed", w0Var);
        }
        return false;
    }
}
