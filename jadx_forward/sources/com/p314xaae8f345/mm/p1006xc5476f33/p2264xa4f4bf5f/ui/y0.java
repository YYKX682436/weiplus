package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 f255974d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var) {
        this.f255974d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$handleNotifyV3WithStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ai4.m0.f86706a.n();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var = this.f255974d;
        android.view.View view2 = h1Var.C;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$handleNotifyV3WithStatus$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$handleNotifyV3WithStatus$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h1Var.F = false;
        qj4.s sVar = qj4.s.f445491a;
        android.content.Context context = h1Var.f255459i;
        java.lang.String h17 = h1Var.h();
        mj4.h hVar = h1Var.f255480z;
        java.lang.Object obj = h1Var.T;
        qj4.s.m(sVar, context, 28L, h17, hVar, 0L, 0L, 0L, ((cj4.i1) obj).y(6), null, null, 0L, 1904, null);
        ((cj4.a0) obj).e0(h1Var.f255459i);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$handleNotifyV3WithStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
