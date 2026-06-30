package lm4;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm4.c0 f401095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm4.i0 f401096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(lm4.c0 c0Var, lm4.i0 i0Var) {
        super(0);
        this.f401095d = c0Var;
        this.f401096e = i0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        lm4.c0 c0Var = lm4.c0.f401077d;
        lm4.c0 c0Var2 = this.f401095d;
        lm4.i0 i0Var = this.f401096e;
        if (c0Var2 == c0Var) {
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83 = i0Var.f401101d;
            java.lang.Object obj = c22584xf7d97e83 != null ? c22584xf7d97e83.f292654p : null;
            m40.p0 p0Var = obj instanceof m40.p0 ? (m40.p0) obj : null;
            if (p0Var != null) {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) p0Var).d7();
            }
            z17 = true;
        } else {
            if (i0Var.f401107m != 0) {
                z17 = false;
            }
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
