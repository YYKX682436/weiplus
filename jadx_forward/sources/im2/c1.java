package im2;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373806d;

    public c1(im2.z3 z3Var) {
        this.f373806d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f373806d;
        z3Var.d7().requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) z3Var.m158354x19263085().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(z3Var.d7(), 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
