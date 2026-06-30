package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class v1 implements sz3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 f240613a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 w1Var) {
        this.f240613a = w1Var;
    }

    @Override // sz3.q
    public void a(sz3.x0 result, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 w1Var = this.f240613a;
        long j17 = w1Var.f240620c;
        long j18 = result.f495681b;
        if (j17 == j18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t1 t1Var = w1Var.f240619b;
            if (t1Var != null) {
                t1Var.b(result, result.f495680a, j18, i17, str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) w1Var.f240618a).f240677e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf m68704xc3ad4fc4 = c17310x947f6bba != null ? c17310x947f6bba.m68704xc3ad4fc4() : null;
            if (m68704xc3ad4fc4 != null) {
                m68704xc3ad4fc4.t(false, null);
            }
        }
    }

    @Override // sz3.q
    public void b(sz3.x0 result, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
    }

    @Override // sz3.q
    public void c(sz3.x0 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
    }

    @Override // sz3.q
    public boolean d(sz3.c1 scanProductResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        return false;
    }

    @Override // sz3.q
    public boolean e(sz3.c1 scanProductResult, sz3.x0 x0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanProductResult, "scanProductResult");
        return false;
    }

    @Override // sz3.q
    public void f(sz3.x0 result) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t1 t1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w1 w1Var = this.f240613a;
        if (w1Var.f240620c != result.f495681b || (t1Var = w1Var.f240619b) == null) {
            return;
        }
        t1Var.a(result);
    }
}
