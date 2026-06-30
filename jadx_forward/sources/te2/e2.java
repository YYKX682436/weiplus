package te2;

/* loaded from: classes14.dex */
public final class e2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f499505d;

    public e2(te2.l2 l2Var) {
        this.f499505d = l2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        te2.l2 l2Var = this.f499505d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l2Var.f499725e, "search device times:" + l2Var.f499728h);
        int i17 = l2Var.f499728h;
        boolean z17 = false;
        if (i17 >= l2Var.f499727g) {
            l2Var.f499728h = 0;
            te2.c2 c2Var = l2Var.f499729i;
            if (c2Var == null) {
                return false;
            }
            pm0.v.X(new te2.w2((te2.a3) c2Var));
            return false;
        }
        l2Var.f499728h = i17 + 1;
        java.lang.String a17 = nf.s.a();
        java.lang.String b17 = nf.s.b();
        int i18 = y91.i0.f541814h;
        y91.i0 i0Var = y91.h0.f541810a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(a17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.a2.b(b17)) {
            z17 = true;
        }
        i0Var.f(z17);
        return true;
    }
}
