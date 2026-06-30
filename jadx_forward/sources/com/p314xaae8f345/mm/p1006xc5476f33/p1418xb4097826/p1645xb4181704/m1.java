package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f211837d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b) {
        this.f211837d = c15147x19964f7b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int C2 = t70Var.C2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = this.f211837d;
        if (C2 > 0) {
            t70Var.c3(0);
            android.view.View m61042x6d7448b9 = c15147x19964f7b.m61042x6d7448b9();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m61042x6d7448b9, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m61042x6d7448b9.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m61042x6d7448b9, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(c15147x19964f7b.getContext());
            e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0f);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.fsz)).getPaint(), 0.8f);
            android.view.View findViewById = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.fsx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b.a(c15147x19964f7b, findViewById, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.k1(c15147x19964f7b, e3Var));
            android.view.View findViewById2 = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.fsy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b.a(c15147x19964f7b, findViewById2, 2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.l1(c15147x19964f7b, e3Var));
            e3Var.i();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b.b(c15147x19964f7b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
