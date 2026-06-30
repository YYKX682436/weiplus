package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f168991d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f168991d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168991d.f169051a, "onClick, mIsPipVideoRelatedPagePushed: " + this.f168991d.f169065o + ", mPipVideoRelatedPage: " + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0.k(this.f168991d.f169064n));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var2 = this.f168991d;
        if (o0Var2.f169071u) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var2.f169051a, "onClick when mIsTransfering, return");
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!o0Var2.f169068r && (w2Var = (o0Var = this.f168991d).f169064n) != null) {
            if (o0Var.f169065o) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var = o0Var.f169054d;
                i3Var.getClass();
                i3Var.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m3(i3Var, w2Var, "scene_other"));
            } else {
                java.lang.String mo14683xad58292c = w2Var.mo14683xad58292c();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var2 = this.f168991d.f169054d;
                i3Var2.getClass();
                i3Var2.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k4(i3Var2, mo14683xad58292c, null, null));
            }
            this.f168991d.f169068r = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/pip/AppBrandPipManager$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
