package kc2;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.c0 f388026d;

    public u(kc2.c0 c0Var) {
        this.f388026d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.c0 c0Var = this.f388026d;
        c0Var.c().f();
        c0Var.e().f();
        c0Var.j().f();
        r45.us2 a17 = kc2.h1.f387938a.a(c0Var.g());
        c0Var.f387879p = a17.m75939xb282bd08(2);
        c0Var.f387880q = a17.m75939xb282bd08(1);
        c0Var.f387881r = a17.m75939xb282bd08(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.m(), "init leftEntrancePath=" + c0Var.f387867d + " rightEntrancePath=" + c0Var.f387868e + " tabKey=" + c0Var.f387869f + " lastExistTime=" + c0Var.f387879p + '(' + c0Var.g() + "),lastClickWithRedDotTime=" + c0Var.f387880q + ",lastRedDotExposeTime=" + c0Var.f387881r + ",clickWithRedDot=" + c0Var.c().d() + ",clickWithoutRedDot=" + c0Var.e().d() + ",redDotExposeSeq=" + c0Var.j().d());
    }
}
