package fl1;

/* loaded from: classes14.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f345411d;

    public v(fl1.c0 c0Var) {
        this.f345411d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fl1.c0 c0Var = this.f345411d;
        if (view == c0Var) {
            fl1.b2 b2Var = (fl1.b2) c0Var.f345249h.peekLast();
            if (b2Var == null) {
                c0Var.setVisibility(8);
            } else if (b2Var.d()) {
                b2Var.mo123830x3d6f0539();
                c0Var.a(b2Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
