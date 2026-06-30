package tn0;

/* loaded from: classes3.dex */
public final class h1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.j1 f502212d;

    public h1(tn0.j1 j1Var) {
        this.f502212d = j1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        tn0.j1 j1Var = this.f502212d;
        if (!j1Var.f502231a.D.f391122i) {
            return false;
        }
        pm0.v.X(new tn0.g1(j1Var));
        return true;
    }
}
