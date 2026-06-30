package gl5;

/* loaded from: classes5.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354637d;

    public v0(gl5.d1 d1Var) {
        this.f354637d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gl5.d1 d1Var = this.f354637d;
        d1Var.f354458b.k();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((jz5.n) d1Var.f354468l).mo141623x754a37bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenEditHelper", "fulledt container click called " + (inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(d1Var.f354458b.j(), 0)) : null));
        yj0.a.h(this, "com/tencent/mm/ui/widget/cedit/edit/FullScreenEditHelperHalfScreen$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
