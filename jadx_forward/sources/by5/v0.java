package by5;

/* loaded from: classes13.dex */
public class v0 extends by5.y0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by5.u0 f118141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(by5.u0 u0Var) {
        super(null);
        this.f118141e = u0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        by5.u0 u0Var = this.f118141e;
        u0Var.f118134e.set(true);
        try {
            java.lang.Object d17 = u0Var.d(this.f118147d);
            yu5.c.b(new by5.RunnableC1359x6871ba6(u0Var, d17));
            return d17;
        } finally {
        }
    }
}
