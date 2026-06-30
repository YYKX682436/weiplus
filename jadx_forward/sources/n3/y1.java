package n3;

/* loaded from: classes14.dex */
public abstract class y1 {
    public static boolean a(android.view.ViewParent viewParent, android.view.View view, float f17, float f18, boolean z17) {
        return viewParent.onNestedFling(view, f17, f18, z17);
    }

    public static boolean b(android.view.ViewParent viewParent, android.view.View view, float f17, float f18) {
        return viewParent.onNestedPreFling(view, f17, f18);
    }

    public static void c(android.view.ViewParent viewParent, android.view.View view, int i17, int i18, int[] iArr) {
        viewParent.onNestedPreScroll(view, i17, i18, iArr);
    }

    public static void d(android.view.ViewParent viewParent, android.view.View view, int i17, int i18, int i19, int i27) {
        viewParent.onNestedScroll(view, i17, i18, i19, i27);
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i17) {
        viewParent.onNestedScrollAccepted(view, view2, i17);
    }

    public static boolean f(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i17) {
        return viewParent.onStartNestedScroll(view, view2, i17);
    }

    public static void g(android.view.ViewParent viewParent, android.view.View view) {
        viewParent.onStopNestedScroll(view);
    }
}
