package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f183837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f183838e;

    public k1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, android.content.DialogInterface.OnClickListener onClickListener) {
        this.f183837d = k0Var;
        this.f183838e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/assist/FinderBottomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f183837d.u();
        android.content.DialogInterface.OnClickListener onClickListener = this.f183838e;
        if (onClickListener != null) {
            onClickListener.onClick(null, -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/assist/FinderBottomDialogHelper$Companion$showConfirmDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
