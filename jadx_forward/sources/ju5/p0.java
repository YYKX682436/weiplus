package ju5;

/* loaded from: classes15.dex */
public class p0 implements iu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zt5.r f383672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju5.q0 f383673b;

    public p0(ju5.q0 q0Var, zt5.r rVar) {
        this.f383673b = q0Var;
        this.f383672a = rVar;
    }

    @Override // iu5.b
    public void a(java.lang.Object obj) {
        java.lang.String str = zt5.j.a().f557137a;
        ju5.q0 q0Var = this.f383673b;
        q0Var.h(str, 0);
        boolean z17 = ((iu5.d) obj).f376586a;
        zt5.h.c("Soter.TaskPrepareAppSecureKey", "soter: ask upload result: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            q0Var.b(new eu5.c(0, this.f383672a));
        } else {
            wt5.a.r();
            q0Var.b(new eu5.c(1003, "upload app secure key failed"));
        }
    }
}
