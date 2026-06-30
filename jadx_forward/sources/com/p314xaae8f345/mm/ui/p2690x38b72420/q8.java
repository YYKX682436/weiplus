package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes.dex */
public final class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.s8 f288672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f288673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.v8 f288674f;

    public q8(com.p314xaae8f345.mm.ui.p2690x38b72420.s8 s8Var, int i17, com.p314xaae8f345.mm.ui.p2690x38b72420.v8 v8Var) {
        this.f288672d = s8Var;
        this.f288673e = i17;
        this.f288674f = v8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2690x38b72420.u8 u8Var = this.f288672d.f288708e;
        if (u8Var != null) {
            u8Var.a(this.f288673e, this.f288674f.f288753d.f288764a);
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/RecentForwardConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
