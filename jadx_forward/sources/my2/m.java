package my2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f414288d;

    public m(my2.u uVar) {
        this.f414288d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo0.c.a(this.f414288d.f414297e, qo0.b.f446952u2, null, 2, null);
        r45.me2 me2Var = ((mm2.c1) this.f414288d.f414296d.a(mm2.c1.class)).f410317b6;
        int m75939xb282bd08 = me2Var != null ? me2Var.m75939xb282bd08(9) : 0;
        ((ku5.t0) ku5.t0.f394148d).A(this.f414288d.f414300h);
        ku5.u0 u0Var = ku5.t0.f394148d;
        my2.u uVar = this.f414288d;
        ((ku5.t0) u0Var).l(uVar.f414301i, m75939xb282bd08 * 1000, uVar.f414300h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f414288d.f414298f, "force show voteInfo clear task execute");
    }
}
