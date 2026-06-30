package js1;

/* loaded from: classes7.dex */
public final class f implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f383016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f383017b;

    public f(zq1.g0 g0Var, boolean z17, long j17) {
        this.f383016a = g0Var;
        this.f383017b = z17;
    }

    @Override // zq1.g0
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        zq1.g0 g0Var = this.f383016a;
        if (g0Var != null) {
            return g0Var.a(c12965xc9712d2);
        }
        return false;
    }

    @Override // zq1.g0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        result.f175462g = !this.f383017b;
        java.lang.System.currentTimeMillis();
        result.m54299x9616526c();
        zq1.g0 g0Var = this.f383016a;
        if (g0Var != null) {
            g0Var.b(result);
        }
    }
}
