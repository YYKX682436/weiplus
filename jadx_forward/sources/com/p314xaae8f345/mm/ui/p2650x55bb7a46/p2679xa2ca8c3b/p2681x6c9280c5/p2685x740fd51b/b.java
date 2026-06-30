package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa f286305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f286306e;

    public b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa abstractC22098xdb6634aa, android.view.View.OnClickListener onClickListener) {
        this.f286305d = abstractC22098xdb6634aa;
        this.f286306e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView$setClickOnlyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f286305d.isTopView) {
            this.f286306e.onClick(view);
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView$setClickOnlyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMediaGroupBaseItemMvvmView", "clickOnlyListener, not topView, skip");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/mediagroup/ChattingMediaGroupBaseItemMvvmView$setClickOnlyListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
