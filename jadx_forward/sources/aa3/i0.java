package aa3;

/* loaded from: classes7.dex */
public class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa3.k0 f84070d;

    public i0(aa3.k0 k0Var) {
        this.f84070d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        aa3.k0 k0Var = this.f84070d;
        k0Var.v();
        k0Var.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/lite/keyboard/LiteAppNumberKeyboardPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
