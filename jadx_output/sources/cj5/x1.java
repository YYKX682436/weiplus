package cj5;

/* loaded from: classes.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(cj5.l2 l2Var) {
        super(1);
        this.f42269d = l2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        xm3.t0 t0Var = this.f42269d.f42185h;
        if (t0Var != null) {
            in5.n0.U(t0Var, it, it.hashCode(), false, 4, null);
        }
        return jz5.f0.f302826a;
    }
}
