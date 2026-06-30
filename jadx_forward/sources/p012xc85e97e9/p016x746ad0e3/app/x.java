package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes15.dex */
public class x extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.y f90762a;

    public x(p012xc85e97e9.p016x746ad0e3.app.y yVar) {
        this.f90762a = yVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.app.y yVar = this.f90762a;
        yVar.f90769b.f90654s.setVisibility(8);
        p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = yVar.f90769b;
        android.widget.PopupWindow popupWindow = g0Var.f90655t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (g0Var.f90654s.getParent() instanceof android.view.View) {
            android.view.View view2 = (android.view.View) yVar.f90769b.f90654s.getParent();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.y0.c(view2);
        }
        yVar.f90769b.f90654s.removeAllViews();
        yVar.f90769b.f90657v.d(null);
        yVar.f90769b.f90657v = null;
    }
}
