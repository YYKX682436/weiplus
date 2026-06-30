package xc5;

/* loaded from: classes12.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f535113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(xc5.y0 y0Var) {
        super(1);
        this.f535113d = y0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 a17;
        java.lang.String str;
        pf3.b visibilityState = (pf3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibilityState, "$this$visibilityState");
        xc5.y0 y0Var = this.f535113d;
        em.b2 b2Var = y0Var.f535126v;
        if (b2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 g17 = b2Var.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getBtnShare(...)");
        visibilityState.c(g17);
        em.b2 b2Var2 = y0Var.f535126v;
        if (b2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 f17 = b2Var2.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getBtnSave(...)");
        visibilityState.c(f17);
        if (y0Var.j0()) {
            em.b2 b2Var3 = y0Var.f535126v;
            if (b2Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            a17 = b2Var3.d();
            str = "getBtnLocate(...)";
        } else {
            em.b2 b2Var4 = y0Var.f535126v;
            if (b2Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            a17 = b2Var4.a();
            str = "getBtnGrid(...)";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, str);
        visibilityState.c(a17);
        em.b2 b2Var5 = y0Var.f535126v;
        if (b2Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16497x8d9d36e2 e17 = b2Var5.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getBtnMore(...)");
        visibilityState.c(e17);
        em.b2 b2Var6 = y0Var.f535126v;
        if (b2Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1857x32b0ec.C16492xe3ef89b2 c17 = b2Var6.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getBtnLive(...)");
        visibilityState.c(c17);
        if (y0Var.h0() && !y0Var.i0()) {
            em.b2 b2Var7 = y0Var.f535126v;
            if (b2Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9 b17 = b2Var7.b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getBtnHd(...)");
            visibilityState.c(b17);
        }
        return jz5.f0.f384359a;
    }
}
