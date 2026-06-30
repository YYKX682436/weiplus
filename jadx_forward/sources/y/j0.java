package y;

/* loaded from: classes14.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f539904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f539905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f539906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0.e5 e5Var, n0.e5 e5Var2, n0.e5 e5Var3) {
        super(1);
        this.f539904d = e5Var;
        this.f539905e = e5Var2;
        this.f539906f = e5Var3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e1.e0 graphicsLayer = (e1.e0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(graphicsLayer, "$this$graphicsLayer");
        e1.x0 x0Var = (e1.x0) graphicsLayer;
        x0Var.f327830f = ((java.lang.Number) this.f539904d.mo128745x754a37bb()).floatValue();
        n0.e5 e5Var = this.f539905e;
        x0Var.f327828d = ((java.lang.Number) e5Var.mo128745x754a37bb()).floatValue();
        x0Var.f327829e = ((java.lang.Number) e5Var.mo128745x754a37bb()).floatValue();
        x0Var.f327840s = ((e1.i1) this.f539906f.mo128745x754a37bb()).f327807a;
        return jz5.f0.f384359a;
    }
}
