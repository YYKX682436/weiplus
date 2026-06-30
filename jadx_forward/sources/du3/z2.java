package du3;

/* loaded from: classes3.dex */
public final class z2 implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325312a;

    public z2(du3.t3 t3Var) {
        this.f325312a = t3Var;
    }

    @Override // l45.m
    public boolean a(xk0.p item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", item.E);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR", item.A);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", item.B);
        this.f325312a.f546865d.w(ju3.c0.P, bundle);
        return true;
    }

    @Override // l45.m
    public void b() {
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        du3.t3 t3Var = this.f325312a;
        if (booleanValue) {
            t3Var.E().h7(1, false);
            return;
        }
        t3Var.E().h7(1, true);
        hk0.o oVar = t3Var.E().f363354o;
        if ((oVar != null ? oVar.f363315a : 0) == 1) {
            t3Var.E().b7(t3Var.E().T6());
            return;
        }
        hk0.o oVar2 = t3Var.E().f363354o;
        if ((oVar2 != null ? oVar2.f363315a : 0) == 5) {
            t3Var.E().g7(t3Var.E().S6(), false);
        }
    }
}
