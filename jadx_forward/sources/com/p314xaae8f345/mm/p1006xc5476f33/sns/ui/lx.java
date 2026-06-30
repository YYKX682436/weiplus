package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class lx implements android.view.View.OnClickListener {
    public lx(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw kwVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null && view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y5)) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y5) view.getTag()).f253142a;
            java.lang.ref.WeakReference weakReference = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y5) view.getTag()).f253143b;
            if (c19807x593d1720 != null && (a90Var = c19807x593d1720.f39014x86965dde) != null && a90Var.f451379q != null && weakReference != null && weakReference.get() != null) {
                android.view.View view2 = (android.view.View) weakReference.get();
                android.graphics.Rect rect = new android.graphics.Rect();
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                rect.set(i17, iArr[1], view2.getMeasuredWidth() + i17, iArr[1] + view2.getMeasuredHeight());
                m21.q.b(view.getContext(), c19807x593d1720.f39014x86965dde.f451379q, rect);
            }
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.y5) view.getTag()).f253144c;
            java.lang.String str2 = c19807x593d1720.f39018xf3f56116;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.J(str2, str, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$3");
    }
}
