package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.z3 f11957a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.y3 f11958b = new androidx.recyclerview.widget.y3();

    public a4(androidx.recyclerview.widget.z3 z3Var) {
        this.f11957a = z3Var;
    }

    public android.view.View a(int i17, int i18, int i19, int i27) {
        androidx.recyclerview.widget.z3 z3Var = this.f11957a;
        int a17 = z3Var.a();
        int b17 = z3Var.b();
        int i28 = i18 > i17 ? 1 : -1;
        android.view.View view = null;
        while (i17 != i18) {
            android.view.View childAt = z3Var.getChildAt(i17);
            int c17 = z3Var.c(childAt);
            int d17 = z3Var.d(childAt);
            androidx.recyclerview.widget.y3 y3Var = this.f11958b;
            y3Var.f12292b = a17;
            y3Var.f12293c = b17;
            y3Var.f12294d = c17;
            y3Var.f12295e = d17;
            if (i19 != 0) {
                y3Var.f12291a = i19 | 0;
                if (y3Var.a()) {
                    return childAt;
                }
            }
            if (i27 != 0) {
                y3Var.f12291a = i27 | 0;
                if (y3Var.a()) {
                    view = childAt;
                }
            }
            i17 += i28;
        }
        return view;
    }

    public boolean b(android.view.View view, int i17) {
        androidx.recyclerview.widget.z3 z3Var = this.f11957a;
        int a17 = z3Var.a();
        int b17 = z3Var.b();
        int c17 = z3Var.c(view);
        int d17 = z3Var.d(view);
        androidx.recyclerview.widget.y3 y3Var = this.f11958b;
        y3Var.f12292b = a17;
        y3Var.f12293c = b17;
        y3Var.f12294d = c17;
        y3Var.f12295e = d17;
        if (i17 == 0) {
            return false;
        }
        y3Var.f12291a = 0 | i17;
        return y3Var.a();
    }
}
