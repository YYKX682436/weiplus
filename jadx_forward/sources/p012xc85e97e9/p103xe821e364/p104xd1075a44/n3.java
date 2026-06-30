package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public abstract class n3 {
    public static int a(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var, android.view.View view, android.view.View view2, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, boolean z17) {
        if (layoutManager.m8008x3d79f549() == 0 || h3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z17) {
            return java.lang.Math.abs(layoutManager.m8032xa86cd69f(view) - layoutManager.m8032xa86cd69f(view2)) + 1;
        }
        return java.lang.Math.min(w1Var.l(), w1Var.b(view2) - w1Var.e(view));
    }

    public static int b(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var, android.view.View view, android.view.View view2, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, boolean z17, boolean z18) {
        if (layoutManager.m8008x3d79f549() == 0 || h3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z18 ? java.lang.Math.max(0, (h3Var.b() - java.lang.Math.max(layoutManager.m8032xa86cd69f(view), layoutManager.m8032xa86cd69f(view2))) - 1) : java.lang.Math.max(0, java.lang.Math.min(layoutManager.m8032xa86cd69f(view), layoutManager.m8032xa86cd69f(view2)));
        if (z17) {
            return java.lang.Math.round((max * (java.lang.Math.abs(w1Var.b(view2) - w1Var.e(view)) / (java.lang.Math.abs(layoutManager.m8032xa86cd69f(view) - layoutManager.m8032xa86cd69f(view2)) + 1))) + (w1Var.k() - w1Var.e(view)));
        }
        return max;
    }

    public static int c(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.w1 w1Var, android.view.View view, android.view.View view2, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, boolean z17) {
        if (layoutManager.m8008x3d79f549() == 0 || h3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z17) {
            return h3Var.b();
        }
        return (int) (((w1Var.b(view2) - w1Var.e(view)) / (java.lang.Math.abs(layoutManager.m8032xa86cd69f(view) - layoutManager.m8032xa86cd69f(view2)) + 1)) * h3Var.b());
    }
}
