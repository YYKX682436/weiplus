package ee5;

/* loaded from: classes9.dex */
public final class q2 implements ot0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f333537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.t2 f333538e;

    public q2(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ee5.t2 t2Var) {
        this.f333537d = f9Var;
        this.f333538e = t2Var;
    }

    @Override // ot0.f3
    public boolean G3() {
        return false;
    }

    @Override // ot0.f3
    public boolean I6() {
        return true;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 job) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
    }

    @Override // ot0.f3
    public void f2(ot0.e3 job) {
        zd5.n P6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
        ee5.t2 t2Var = this.f333538e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t2Var.f333581d, "[requestExitSelectedMode] %s del ", java.lang.Thread.currentThread(), job);
        if (job != ot0.e3.del || (P6 = t2Var.P6()) == null) {
            return;
        }
        P6.m8146xced61ae5();
    }

    @Override // ot0.f3
    public void k6(ot0.e3 job) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(job, "job");
        if (job == ot0.e3.del) {
            ee5.p2 p2Var = new ee5.p2();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f333537d;
            p2Var.f85933d = f9Var.m124847x74d37ac6();
            p2Var.f85938i = f9Var.Q0();
            ee5.t2 t2Var = this.f333538e;
            t2Var.f333587m.remove(p2Var);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = t2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((ee5.h0) pf5.z.f435481a.a(activity).a(ee5.h0.class)).P6(new ae5.j(null, null, null, null, null, null, null, null, f9Var.m124847x74d37ac6(), null, null, 0L, 3839, null));
        }
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
    }
}
