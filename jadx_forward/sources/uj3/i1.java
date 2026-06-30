package uj3;

/* loaded from: classes14.dex */
public final class i1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.j1 f509820d;

    public i1(uj3.j1 j1Var) {
        this.f509820d = j1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        uj3.j1 j1Var = this.f509820d;
        int i17 = j1Var.f509832i;
        if (i17 > j1Var.f509828e) {
            j1Var.f509832i = i17 - 1;
            j1Var.a();
            return true;
        }
        uj3.b.a(j1Var.f509825b, uj3.a.f509738s, null, 2, null);
        return false;
    }
}
