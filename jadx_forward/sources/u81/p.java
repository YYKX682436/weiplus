package u81;

/* loaded from: classes7.dex */
public class p extends u81.n0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f0 f506988h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u81.f0 f0Var, long j17, java.lang.Boolean bool) {
        super(j17, bool);
        this.f506988h = f0Var;
    }

    @Override // u81.n0
    public java.lang.Object b() {
        k75.a e17 = this.f506988h.e();
        u81.f0 f0Var = this.f506988h;
        u81.x xVar = f0Var.f506948m;
        if (e17 == xVar) {
            return java.lang.Boolean.valueOf((xVar.f506971f & 1) > 0);
        }
        k75.j jVar = f0Var.f386380e;
        if (jVar != null) {
            u81.u uVar = u81.u.NONE;
            if (jVar.hasMessages(23)) {
                r3 = true;
            }
        }
        return java.lang.Boolean.valueOf(r3);
    }
}
