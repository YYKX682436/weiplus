package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 f284585d;

    public p2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 r2Var) {
        this.f284585d = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/view/QuoteTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r2 r2Var = this.f284585d;
        android.view.View.OnClickListener onClickListener = r2Var.f284612j;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        r2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/view/QuoteTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
