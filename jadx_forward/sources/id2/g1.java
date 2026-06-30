package id2;

/* loaded from: classes3.dex */
public final class g1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372116a;

    public g1(id2.v1 v1Var) {
        this.f372116a = v1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        id2.v1 v1Var = this.f372116a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f372367d, "doGetGiftList errType:" + i17 + ", errCode:" + i18);
        if (i17 == 0 && i18 == 0) {
            r45.aw1 aw1Var = (r45.aw1) ((r45.d81) fVar.f152151d).m75936x14adae67(5);
            v1Var.L = (aw1Var != null ? aw1Var.m75939xb282bd08(0) : id2.v1.N) + 1;
            v1Var.W6(null);
        }
        id2.v1.R6(v1Var, "initView");
        return jz5.f0.f384359a;
    }
}
