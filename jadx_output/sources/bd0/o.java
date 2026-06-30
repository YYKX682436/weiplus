package bd0;

@j95.b
/* loaded from: classes8.dex */
public class o extends i95.w implements bd0.m {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f19229d = false;

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            e42.c0 c0Var = e42.c0.clicfg_mb_reward_ad_log_max_length_android;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (ih.a.h("clicfg_report_ipc_to_mm", z65.c.a() || ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ui())) {
                this.f19229d = true;
                ((ku5.t0) ku5.t0.f312615d).g(new bd0.o$$a());
            }
        }
        jx3.f fVar = jx3.f.INSTANCE;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        fVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportService", "instance set %s", g0Var);
        fVar.f302448d = g0Var;
    }
}
