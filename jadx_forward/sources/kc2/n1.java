package kc2;

/* loaded from: classes15.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f387996d;

    public n1(kc2.v1 v1Var) {
        this.f387996d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.v1 v1Var = this.f387996d;
        v1Var.a().f();
        v1Var.b().f();
        v1Var.c().f();
        r45.us2 a17 = kc2.h1.f387938a.a(v1Var.f388040i);
        v1Var.f388041j = a17.m75939xb282bd08(2);
        v1Var.f388042k = a17.m75939xb282bd08(1);
        v1Var.f388043l = a17.m75939xb282bd08(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f388036e, "init lastExistTime=" + v1Var.f388041j + ",lastClickWithRedDotTime=" + v1Var.f388042k + ",lastRedDotExposeTime=" + v1Var.f388043l + ",snsClickWithRedDot=" + v1Var.a().d() + ",snsClickWithoutRedDot=" + v1Var.b().d() + ",snsRedDotExposeSeq=" + v1Var.c().d());
    }
}
