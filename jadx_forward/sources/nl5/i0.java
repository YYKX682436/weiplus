package nl5;

/* loaded from: classes5.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl5.s0 f419826d;

    public i0(nl5.s0 s0Var) {
        this.f419826d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nl5.s0 s0Var = this.f419826d;
        if (s0Var.f419908z) {
            com.p314xaae8f345.mm.ui.yk.c("SelectableEditTextHelper", "onClick", new java.lang.Object[0]);
            s0Var.i(true);
        }
        android.view.View.OnClickListener onClickListener = s0Var.f419900r;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/edittext/SelectableEditTextHelper$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
