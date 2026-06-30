package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class t1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 f168642d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var) {
        this.f168642d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var = this.f168642d;
        android.content.DialogInterface.OnClickListener m52247x6a4a5b81 = x1Var.m52247x6a4a5b81();
        if (m52247x6a4a5b81 != null) {
            m52247x6a4a5b81.onClick(x1Var, -1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
