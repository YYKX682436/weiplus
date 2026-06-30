package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class x extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.y f9229a;

    public x(androidx.appcompat.app.y yVar) {
        this.f9229a = yVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        androidx.appcompat.app.y yVar = this.f9229a;
        yVar.f9236b.f9121s.setVisibility(8);
        androidx.appcompat.app.g0 g0Var = yVar.f9236b;
        android.widget.PopupWindow popupWindow = g0Var.f9122t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (g0Var.f9121s.getParent() instanceof android.view.View) {
            android.view.View view2 = (android.view.View) yVar.f9236b.f9121s.getParent();
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.y0.c(view2);
        }
        yVar.f9236b.f9121s.removeAllViews();
        yVar.f9236b.f9124v.d(null);
        yVar.f9236b.f9124v = null;
    }
}
