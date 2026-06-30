package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class i7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f271932d;

    public i7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f271932d = c8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f271932d;
        c8Var.f271754c.k();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((jz5.n) c8Var.f271761j).mo141623x754a37bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatFooterKt", "fulledt container click called " + (inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(c8Var.f271754c.j(), 0)) : null));
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
