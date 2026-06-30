package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f102340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f102341e;

    public l1(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f102340d = k0Var;
        this.f102341e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/assist/FinderBottomDialogHelper$Companion$showConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f102340d.u();
        android.content.DialogInterface.OnClickListener onClickListener = this.f102341e;
        if (onClickListener != null) {
            onClickListener.onClick(null, -2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/assist/FinderBottomDialogHelper$Companion$showConfirmDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
