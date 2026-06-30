package vi1;

/* loaded from: classes7.dex */
public final class n3 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f518947d;

    public n3(vi1.z3 z3Var) {
        this.f518947d = z3Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int abs = java.lang.Math.abs(i27 - i18);
        vi1.z3 z3Var = this.f518947d;
        int i39 = z3Var.f519058o;
        if (abs <= i39 || i39 < z3Var.f519057n) {
            return;
        }
        z3Var.f519060q.post(new vi1.m3(z3Var));
    }
}
