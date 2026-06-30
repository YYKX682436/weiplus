package od0;

/* loaded from: classes13.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f426063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ od0.v f426064e;

    public b0(od0.v vVar, android.content.Intent intent) {
        this.f426064e = vVar;
        this.f426063d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af;
        try {
            com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
            if (c17 == null || (binderC11173x1cfac0af = c17.f153526n) == null || !binderC11173x1cfac0af.mo9865x7b0e9c5f() || c01.e2.a0()) {
                return;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (od0.o0.c(8, 86400000L, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_new_install_app_max_report_count, 10))) {
                byte[] yb6 = fo3.s.INSTANCE.yb(this.f426063d);
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(yb6);
                k57Var.f459938r = cu5Var;
                this.f426064e.Ai(540999696, k57Var.mo14344x5f01b1f6(), false);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "report error: " + th6);
        }
    }
}
