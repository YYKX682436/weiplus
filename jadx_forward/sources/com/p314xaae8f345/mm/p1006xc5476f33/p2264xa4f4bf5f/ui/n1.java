package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 f255645d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var) {
        this.f255645d = w1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 m71898xc195e76b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView$initIndicator$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var = this.f255645d;
        m71898xc195e76b = w1Var.m71898xc195e76b();
        if (m71898xc195e76b != null) {
            int i17 = m71898xc195e76b.f255314o + 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.f255923i, "click indicator,scrollToPosition:" + i17);
            w1Var.i(i17, false, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MultipleStatusCardView$initIndicator$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
