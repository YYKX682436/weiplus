package aa3;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.e0 f2508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(aa3.e0 e0Var) {
        super(0);
        this.f2508d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aa3.e0 e0Var = this.f2508d;
        aa3.x0 x0Var = e0Var.f2518g;
        if (x0Var != null) {
            x0Var.setVisibility(8);
            x0Var.setActivitySecure(false);
        }
        e0Var.f2515d.clearFocus();
        aa3.o oVar = (aa3.o) e0Var.f2517f;
        oVar.getClass();
        oVar.f2567a.e(android.graphics.Insets.of(0, 0, 0, 0));
        aa3.x0 x0Var2 = e0Var.f2518g;
        if (x0Var2 != null) {
            x0Var2.post(new aa3.a0(e0Var));
        }
        return jz5.f0.f302826a;
    }
}
