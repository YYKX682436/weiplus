package xc5;

/* loaded from: classes12.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f535118d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(xc5.y0 y0Var) {
        super(1);
        this.f535118d = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibilityState = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityState, "$this$visibilityState");
        xc5.y0 y0Var = this.f535118d;
        em.b2 b2Var = y0Var.f535126v;
        if (b2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c17 = b2Var.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnLive(...)");
        visibilityState.c(c17);
        em.b2 b2Var2 = y0Var.f535126v;
        if (b2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 f17 = b2Var2.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getBtnSave(...)");
        visibilityState.c(f17);
        em.b2 b2Var3 = y0Var.f535126v;
        if (b2Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 e17 = b2Var3.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getBtnMore(...)");
        visibilityState.c(e17);
        return jz5.f0.f384359a;
    }
}
