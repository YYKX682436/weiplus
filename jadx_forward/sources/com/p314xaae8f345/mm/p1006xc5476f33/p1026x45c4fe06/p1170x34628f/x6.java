package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class x6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f168780d = true;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f168781e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u6(this);

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f168782f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v6(this);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f168783g;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f168783g = v5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f168780d) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f168783g;
        v5Var.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w6(this), nf.o.a(v5Var.mo50352x76847179()) ? 100 : 0);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
