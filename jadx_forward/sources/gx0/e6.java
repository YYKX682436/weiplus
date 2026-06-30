package gx0;

/* loaded from: classes5.dex */
public final class e6 implements du0.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357896a;

    public e6(gx0.w8 w8Var) {
        this.f357896a = w8Var;
    }

    public void a(boolean z17) {
        gx0.w8 w8Var = this.f357896a;
        if (!z17) {
            w8Var.L7(true);
            w8Var.M7(true);
            w8Var.N7(true);
            w8Var.X6().f7(w8Var.f358657y0);
            return;
        }
        w8Var.L7(false);
        w8Var.M7(false);
        w8Var.N7(false);
        w8Var.f358657y0 = w8Var.X6().B;
        w8Var.X6().f7(new ou0.w(false));
    }
}
