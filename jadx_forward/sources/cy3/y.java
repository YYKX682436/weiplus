package cy3;

/* loaded from: classes10.dex */
public final class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cy3.a0 f306389a;

    public y(cy3.a0 a0Var) {
        this.f306389a = a0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        cy3.a0 a0Var = this.f306389a;
        if (a0Var.f306283g != -1 || (c1163xf1deaba4 = a0Var.f306286j) == null) {
            return;
        }
        c1163xf1deaba4.post(new cy3.w(a0Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        cy3.a0 a0Var = this.f306389a;
        if (a0Var.f306283g != -1 || (c1163xf1deaba4 = a0Var.f306286j) == null) {
            return;
        }
        c1163xf1deaba4.post(new cy3.x(a0Var));
    }
}
