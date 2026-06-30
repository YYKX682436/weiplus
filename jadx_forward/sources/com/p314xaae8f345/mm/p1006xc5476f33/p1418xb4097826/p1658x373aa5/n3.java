package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class n3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15257x1dd522b3 f214224d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15257x1dd522b3 c15257x1dd522b3) {
        this.f214224d = c15257x1dd522b3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ?? r152;
        r45.yn2 yn2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15257x1dd522b3 c15257x1dd522b3 = this.f214224d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(c15257x1dd522b3.getContext());
        e3Var.f(com.p314xaae8f345.mm.R.C30864xbddafb2a.b4s);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmo)).getPaint(), 0.8f);
        android.view.View findViewById = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmp);
        android.view.View findViewById2 = e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmn);
        if (c15257x1dd522b3.getFlag() == 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            r152 = 0;
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            r152 = 0;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5 n5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183935a;
        m92.b I1 = g92.a.I1(g92.b.f351302e, r152, 1, null);
        int m75939xb282bd08 = (I1 == null || (yn2Var = I1.f68713x8b95c144) == 0) ? 1 : yn2Var.m75939xb282bd08(r152);
        int i17 = m75939xb282bd08 < 0 ? r152 : m75939xb282bd08;
        ((android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kc9)).setText(c15257x1dd522b3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.et9, java.lang.String.valueOf(i17)));
        if (i17 > 0) {
            e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmb).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.j3(c15257x1dd522b3, e3Var));
        } else {
            e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmb).setClickable(r152);
            ((android.widget.TextView) e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kc_)).setTextColor(c15257x1dd522b3.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703));
        }
        e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmq).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.k3(c15257x1dd522b3, e3Var));
        e3Var.f213492f.findViewById(com.p314xaae8f345.mm.R.id.kmm).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.m3(c15257x1dd522b3, e3Var));
        e3Var.i();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderChooseOriginalView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
