package a0;

/* loaded from: classes14.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.o3 f241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(a0.o3 o3Var, int i17, s1.o1 o1Var) {
        super(1);
        this.f241d = o3Var;
        this.f242e = i17;
        this.f243f = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        kotlin.jvm.internal.o.g(layout, "$this$layout");
        a0.o3 o3Var = this.f241d;
        a0.m3 m3Var = o3Var.f258d;
        n0.v2 v2Var = m3Var.f229c;
        int i17 = this.f242e;
        ((n0.q4) v2Var).setValue(java.lang.Integer.valueOf(i17));
        if (m3Var.d() > i17) {
            ((n0.q4) m3Var.f227a).setValue(java.lang.Integer.valueOf(i17));
        }
        int f17 = e06.p.f(o3Var.f258d.d(), 0, i17);
        int i18 = o3Var.f259e ? f17 - i17 : -f17;
        boolean z17 = o3Var.f260f;
        s1.n1.f(layout, this.f243f, z17 ? 0 : i18, z17 ? i18 : 0, 0.0f, null, 12, null);
        return jz5.f0.f302826a;
    }
}
