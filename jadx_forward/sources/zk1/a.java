package zk1;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (view instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) view).setDescendantFocusability(131072);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AccessibilityExt", "doAccessibilityFocus, focused: " + view.requestFocus());
    }
}
