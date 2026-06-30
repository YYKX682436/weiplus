package bs2;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(bs2.n1 n1Var, java.lang.String str) {
        super(0);
        this.f23984d = n1Var;
        this.f23985e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bs2.n1 n1Var = this.f23984d;
        db2.c3 c3Var = n1Var.f23925s.f23806b;
        if (kotlin.jvm.internal.o.b(c3Var != null ? c3Var.f227925p : null, this.f23985e)) {
            n1Var.d("preloadVideoWorker");
        }
        return jz5.f0.f302826a;
    }
}
