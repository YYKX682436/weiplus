package sc2;

/* loaded from: classes2.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487884f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(sc2.h1 h1Var, in5.s0 s0Var, r45.t01 t01Var) {
        super(0);
        this.f487882d = h1Var;
        this.f487883e = s0Var;
        this.f487884f = t01Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ((cq.k) i95.n0.c(cq.k.class)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.V5).mo141623x754a37bb()).r()).booleanValue()) {
            sc2.h1 h1Var = this.f487882d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var = h1Var.Z;
            boolean z17 = s2Var != null && s2Var.isShowing();
            r45.t01 t01Var = this.f487884f;
            in5.s0 s0Var = this.f487883e;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var2 = h1Var.Z;
                if (s2Var2 != null) {
                    s2Var2.setOnDismissListener(new sc2.w0(h1Var, s0Var, t01Var));
                }
            } else {
                h1Var.A1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.g3.f206579f;
                h1Var.P(s0Var, true, true, t01Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
