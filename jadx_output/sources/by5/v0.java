package by5;

/* loaded from: classes13.dex */
public class v0 extends by5.y0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by5.u0 f36608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(by5.u0 u0Var) {
        super(null);
        this.f36608e = u0Var;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        by5.u0 u0Var = this.f36608e;
        u0Var.f36601e.set(true);
        try {
            java.lang.Object d17 = u0Var.d(this.f36614d);
            yu5.c.b(new by5.u0$$a(u0Var, d17));
            return d17;
        } finally {
        }
    }
}
