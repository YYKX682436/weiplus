package u81;

/* loaded from: classes7.dex */
public class q extends u81.n0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u81.f0 f0Var, long j17, java.lang.Boolean bool) {
        super(j17, bool);
        this.f506989h = f0Var;
    }

    @Override // u81.n0
    public java.lang.Object b() {
        u81.f0 f0Var = this.f506989h;
        k75.a e17 = f0Var.e();
        u81.x xVar = f0Var.f506948m;
        return java.lang.Boolean.valueOf(e17 == xVar && xVar.f506971f > 0);
    }
}
