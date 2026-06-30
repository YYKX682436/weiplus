package b92;

/* loaded from: classes10.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.v1 f18500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(b92.v1 v1Var) {
        super(0);
        this.f18500d = v1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        b92.v1 v1Var = this.f18500d;
        if (v1Var.f18527i.compareAndSet(false, true)) {
            v1Var.Zi("processBackground");
        }
        return jz5.f0.f302826a;
    }
}
