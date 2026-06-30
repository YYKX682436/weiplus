package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public abstract class n3 {
    public static int a(androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.w1 w1Var, android.view.View view, android.view.View view2, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, boolean z17) {
        if (layoutManager.getChildCount() == 0 || h3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z17) {
            return java.lang.Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1;
        }
        return java.lang.Math.min(w1Var.l(), w1Var.b(view2) - w1Var.e(view));
    }

    public static int b(androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.w1 w1Var, android.view.View view, android.view.View view2, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, boolean z17, boolean z18) {
        if (layoutManager.getChildCount() == 0 || h3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z18 ? java.lang.Math.max(0, (h3Var.b() - java.lang.Math.max(layoutManager.getPosition(view), layoutManager.getPosition(view2))) - 1) : java.lang.Math.max(0, java.lang.Math.min(layoutManager.getPosition(view), layoutManager.getPosition(view2)));
        if (z17) {
            return java.lang.Math.round((max * (java.lang.Math.abs(w1Var.b(view2) - w1Var.e(view)) / (java.lang.Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1))) + (w1Var.k() - w1Var.e(view)));
        }
        return max;
    }

    public static int c(androidx.recyclerview.widget.h3 h3Var, androidx.recyclerview.widget.w1 w1Var, android.view.View view, android.view.View view2, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, boolean z17) {
        if (layoutManager.getChildCount() == 0 || h3Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z17) {
            return h3Var.b();
        }
        return (int) (((w1Var.b(view2) - w1Var.e(view)) / (java.lang.Math.abs(layoutManager.getPosition(view) - layoutManager.getPosition(view2)) + 1)) * h3Var.b());
    }
}
