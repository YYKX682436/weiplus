package qs1;

/* loaded from: classes8.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {
    public a(qs1.m mVar) {
    }

    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        b(recyclerView);
    }

    public final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        db5.g4 g4Var;
        int childCount;
        int u07;
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        qs1.c cVar = mo7946xf939df19 instanceof qs1.c ? (qs1.c) mo7946xf939df19 : null;
        if (cVar == null || (g4Var = cVar.f447745d) == null || (childCount = c1163xf1deaba4.getChildCount()) <= 0) {
            return;
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
            if (childAt != null && (u07 = c1163xf1deaba4.u0(childAt)) != -1) {
                android.view.MenuItem item = g4Var.getItem(u07);
                db5.h4 h4Var = item instanceof db5.h4 ? (db5.h4) item : null;
                if (h4Var != null) {
                    db5.v4 v4Var = h4Var.f309895J;
                    android.graphics.Rect rect = new android.graphics.Rect();
                    boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    boolean globalVisibleRect2 = c1163xf1deaba4.getGlobalVisibleRect(rect2);
                    if (globalVisibleRect && globalVisibleRect2) {
                        android.graphics.Rect rect3 = new android.graphics.Rect();
                        if (rect3.setIntersect(rect, rect2) && rect3.height() >= childAt.getHeight() / 2) {
                            z17 = true;
                            if (z17 && v4Var != null) {
                                v4Var.a(h4Var, childAt);
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        v4Var.a(h4Var, childAt);
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        b(recyclerView);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        b(recyclerView);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/util/BizCustomBottomSheet$MenuItemExposeHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
