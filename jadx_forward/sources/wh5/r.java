package wh5;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f527621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wh5.s sVar) {
        super(1);
        this.f527621d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pf3.b visibilityState = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityState, "$this$visibilityState");
        wh5.s sVar = this.f527621d;
        em.n1 n1Var = sVar.f527622v;
        if (n1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c17 = n1Var.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnLive(...)");
        visibilityState.c(c17);
        em.n1 n1Var2 = sVar.f527622v;
        if (n1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 e17 = n1Var2.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getBtnSave(...)");
        visibilityState.c(e17);
        em.n1 n1Var3 = sVar.f527622v;
        if (n1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 d17 = n1Var3.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getBtnMore(...)");
        visibilityState.c(d17);
        em.n1 n1Var4 = sVar.f527622v;
        if (n1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        n1Var4.g().setAlpha(0.15f);
        em.n1 n1Var5 = sVar.f527622v;
        if (n1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 a17 = n1Var5.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getBtnGrid(...)");
        visibilityState.c(a17);
        em.n1 n1Var6 = sVar.f527622v;
        if (n1Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 a18 = n1Var6.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getBtnGrid(...)");
        visibilityState.f435348d.add(a18);
        return jz5.f0.f384359a;
    }
}
