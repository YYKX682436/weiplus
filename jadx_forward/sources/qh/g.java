package qh;

/* loaded from: classes12.dex */
public class g implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh.u f444882a;

    public g(qh.t tVar, qh.u uVar) {
        this.f444882a = uVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        rh.b3 b3Var = (rh.b3) obj;
        qh.u uVar = this.f444882a;
        uVar.c("cpufreq_sampling");
        uVar.g(b3Var.f476844c + "(mls)\t" + b3Var.f476842a + "(itv)");
        uVar.h("max", java.lang.String.valueOf(b3Var.f476847f));
        uVar.h("min", java.lang.String.valueOf(b3Var.f476848g));
        uVar.h("avg", java.lang.String.valueOf(b3Var.f476849h));
        uVar.h("cnt", java.lang.String.valueOf(b3Var.f476843b));
    }
}
