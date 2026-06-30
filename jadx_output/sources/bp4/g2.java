package bp4;

/* loaded from: classes10.dex */
public final class g2 implements l45.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.k2 f23178a;

    public g2(bp4.k2 k2Var) {
        this.f23178a = k2Var;
    }

    @Override // l45.m
    public boolean a(xk0.p item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", item.E);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR", item.A);
        bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", item.B);
        this.f23178a.f465332d.w(ju3.c0.P, bundle);
        return true;
    }

    @Override // l45.m
    public void b() {
    }

    @Override // l45.m
    public void c(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        bp4.k2 k2Var = this.f23178a;
        if (booleanValue) {
            ju3.d0.k(k2Var.f465332d, ju3.c0.V, null, 2, null);
        } else {
            ju3.d0.k(k2Var.f465332d, ju3.c0.W, null, 2, null);
        }
    }
}
