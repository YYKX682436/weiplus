package dm;

/* loaded from: classes9.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public p75.m f320132a;

    public final p75.i a() {
        p75.n0 n0Var = dm.o0.f320375p;
        n0Var.getClass();
        p75.m condition = this.f320132a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(condition, "condition");
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        return new p75.i(n0Var.b(), condition.b(), condition.e());
    }

    public final dm.n0 b(long j17) {
        p75.m mVar = this.f320132a;
        if (mVar != null) {
            this.f320132a = mVar.c(dm.o0.f320376q.i(java.lang.Long.valueOf(j17)));
        } else {
            this.f320132a = dm.o0.f320376q.i(java.lang.Long.valueOf(j17));
        }
        return this;
    }
}
