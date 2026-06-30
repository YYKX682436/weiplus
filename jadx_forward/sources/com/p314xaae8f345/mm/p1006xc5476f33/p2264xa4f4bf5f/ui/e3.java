package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 f255359d;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var) {
        this.f255359d = q3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusCardView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bi4.m0 m0Var = this.f255359d.D1;
        if (m0Var != null) {
            m0Var.a(1, view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/StatusCardView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
