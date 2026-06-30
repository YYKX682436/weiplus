package kc2;

/* loaded from: classes15.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f388024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388025e;

    public t1(kc2.v1 v1Var, java.lang.String str) {
        this.f388024d = v1Var;
        this.f388025e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.v1 v1Var = this.f388024d;
        v1Var.f388043l = e17;
        kc2.h1.f387938a.b(v1Var.f388040i, v1Var.f388041j, e17, v1Var.f388042k);
        if (((java.lang.Boolean) ((jz5.n) v1Var.f388035d).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f388036e, "onRedDotExpose " + this.f388025e + " add lastRedDotExposeTime=" + v1Var.f388043l);
        }
        kc2.a2.a(v1Var.c(), v1Var.f388043l, false, 2, null);
    }
}
