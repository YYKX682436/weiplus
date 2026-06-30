package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 f273540d;

    public y1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var) {
        this.f273540d = a2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 a2Var = this.f273540d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a2Var.f273035d, "FolderViewHolder: selectorWrapper clicked");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        a2Var.l(view);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorUI$FileSelectorAdapter$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
