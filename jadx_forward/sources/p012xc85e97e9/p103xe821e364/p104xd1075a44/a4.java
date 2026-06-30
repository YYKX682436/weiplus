package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 f93490a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.y3 f93491b = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y3();

    public a4(p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 z3Var) {
        this.f93490a = z3Var;
    }

    public android.view.View a(int i17, int i18, int i19, int i27) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 z3Var = this.f93490a;
        int a17 = z3Var.a();
        int b17 = z3Var.b();
        int i28 = i18 > i17 ? 1 : -1;
        android.view.View view = null;
        while (i17 != i18) {
            android.view.View mo8220x6a486239 = z3Var.mo8220x6a486239(i17);
            int c17 = z3Var.c(mo8220x6a486239);
            int d17 = z3Var.d(mo8220x6a486239);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.y3 y3Var = this.f93491b;
            y3Var.f93825b = a17;
            y3Var.f93826c = b17;
            y3Var.f93827d = c17;
            y3Var.f93828e = d17;
            if (i19 != 0) {
                y3Var.f93824a = i19 | 0;
                if (y3Var.a()) {
                    return mo8220x6a486239;
                }
            }
            if (i27 != 0) {
                y3Var.f93824a = i27 | 0;
                if (y3Var.a()) {
                    view = mo8220x6a486239;
                }
            }
            i17 += i28;
        }
        return view;
    }

    public boolean b(android.view.View view, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z3 z3Var = this.f93490a;
        int a17 = z3Var.a();
        int b17 = z3Var.b();
        int c17 = z3Var.c(view);
        int d17 = z3Var.d(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y3 y3Var = this.f93491b;
        y3Var.f93825b = a17;
        y3Var.f93826c = b17;
        y3Var.f93827d = c17;
        y3Var.f93828e = d17;
        if (i17 == 0) {
            return false;
        }
        y3Var.f93824a = 0 | i17;
        return y3Var.a();
    }
}
