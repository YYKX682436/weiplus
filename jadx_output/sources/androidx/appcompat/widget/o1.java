package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class o1 extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.m1 {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.reflect.Method f9665J;
    public androidx.appcompat.widget.m1 I;

    static {
        try {
            f9665J = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    @Override // androidx.appcompat.widget.m1
    public void a(o.r rVar, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.m1 m1Var = this.I;
        if (m1Var != null) {
            m1Var.a(rVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.m1
    public void b(o.r rVar, android.view.MenuItem menuItem) {
        androidx.appcompat.widget.m1 m1Var = this.I;
        if (m1Var != null) {
            m1Var.b(rVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public androidx.appcompat.widget.b1 c(android.content.Context context, boolean z17) {
        androidx.appcompat.widget.n1 n1Var = new androidx.appcompat.widget.n1(context, z17);
        n1Var.setHoverListener(this);
        return n1Var;
    }
}
