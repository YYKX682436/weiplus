package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public final class p8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.s8 f288630d;

    public p8(com.p314xaae8f345.mm.ui.p2690x38b72420.s8 s8Var) {
        this.f288630d = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.u8 u8Var = this.f288630d.f288708e;
        if (u8Var != null) {
            u8Var.mo80426x42fe6352();
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
