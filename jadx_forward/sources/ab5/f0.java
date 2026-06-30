package ab5;

/* loaded from: classes9.dex */
public class f0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.i0 f84463d;

    public f0(ab5.i0 i0Var) {
        this.f84463d = i0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        db5.d5 d5Var = this.f84463d.f84486f;
        if (d5Var == null) {
            return false;
        }
        d5Var.dismiss();
        return false;
    }
}
