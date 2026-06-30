package mz4;

/* loaded from: classes12.dex */
public class l0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.j0 f414850d;

    public l0(mz4.j0 j0Var) {
        this.f414850d = j0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        mz4.j0 j0Var = this.f414850d;
        if (-1 == j0Var.f414834i) {
            return false;
        }
        j0Var.a();
        return true;
    }
}
