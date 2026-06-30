package aa3;

/* loaded from: classes9.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.e0 f84041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(aa3.e0 e0Var) {
        super(0);
        this.f84041d = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        aa3.e0 e0Var = this.f84041d;
        aa3.x0 x0Var = e0Var.f84051g;
        if (x0Var != null) {
            x0Var.setVisibility(8);
            x0Var.m934x26b5a868(false);
        }
        e0Var.f84048d.clearFocus();
        aa3.o oVar = (aa3.o) e0Var.f84050f;
        oVar.getClass();
        oVar.f84100a.e(android.graphics.Insets.of(0, 0, 0, 0));
        aa3.x0 x0Var2 = e0Var.f84051g;
        if (x0Var2 != null) {
            x0Var2.post(new aa3.a0(e0Var));
        }
        return jz5.f0.f384359a;
    }
}
