package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f102304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f102305e;

    public k1(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f102304d = k0Var;
        this.f102305e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/assist/FinderBottomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f102304d.u();
        android.content.DialogInterface.OnClickListener onClickListener = this.f102305e;
        if (onClickListener != null) {
            onClickListener.onClick(null, -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/assist/FinderBottomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
