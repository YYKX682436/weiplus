package c1;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f37724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f37725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n0.v2 v2Var, yz5.l lVar) {
        super(1);
        this.f37724d = v2Var;
        this.f37725e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        c1.i0 it = (c1.i0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        n0.v2 v2Var = this.f37724d;
        if (!kotlin.jvm.internal.o.b(v2Var.getValue(), it)) {
            v2Var.setValue(it);
            this.f37725e.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
