package b92;

/* loaded from: classes10.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(b92.v1 v1Var) {
        super(0);
        this.f18498d = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b92.v1 v1Var = this.f18498d;
        if (v1Var.f18527i.compareAndSet(true, false)) {
            v1Var.Zi("processForeground");
        }
        return jz5.f0.f302826a;
    }
}
