package sm1;

/* loaded from: classes10.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 f490847d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7) {
        this.f490847d = c12827x691a1aa7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        m40.k0 m53826x3f358f57;
        m40.k0 m53826x3f358f572;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = this.f490847d;
        m53826x3f358f57 = c12827x691a1aa7.m53826x3f358f57();
        if (((c61.p7) m53826x3f358f57).aj() > 0) {
            m53826x3f358f572 = c12827x691a1aa7.m53826x3f358f57();
            ((c61.p7) m53826x3f358f572).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.c3(0);
            android.view.View m53856x6d7448b9 = c12827x691a1aa7.m53856x6d7448b9();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m53856x6d7448b9, arrayList2.toArray(), "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m53856x6d7448b9.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m53856x6d7448b9, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(c12827x691a1aa7.getContext());
            y1Var.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569761e00);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.fsz)).getPaint(), 0.8f);
            android.view.View findViewById = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.fsx);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7.b(c12827x691a1aa7, findViewById, 1, new sm1.y(c12827x691a1aa7, y1Var));
            android.view.View findViewById2 = y1Var.f293560f.findViewById(com.p314xaae8f345.mm.R.id.fsy);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7.b(c12827x691a1aa7, findViewById2, 2, new sm1.z(c12827x691a1aa7, y1Var));
            y1Var.s();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7.c(c12827x691a1aa7);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/audio/comment/view/BizCommentFooter$refreshSwitchSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
