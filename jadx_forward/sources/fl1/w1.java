package fl1;

/* loaded from: classes7.dex */
public final class w1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.z1 f345420d;

    public w1(fl1.z1 z1Var) {
        this.f345420d = z1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int abs = java.lang.Math.abs(i27 - i18);
        fl1.z1 z1Var = this.f345420d;
        int i39 = z1Var.f345437i;
        if (abs <= i39 || i39 < z1Var.f345436h) {
            return;
        }
        z1Var.f345439n.post(new fl1.v1(z1Var));
    }
}
