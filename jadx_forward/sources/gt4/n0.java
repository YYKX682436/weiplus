package gt4;

/* loaded from: classes14.dex */
public final class n0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.s0 f357009d;

    public n0(gt4.s0 s0Var) {
        this.f357009d = s0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        gt4.s0 s0Var = this.f357009d;
        if (s0Var.f357066J != null) {
            if (s0Var.I <= 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                int w17 = c1162x665295de.w();
                java.util.List list = s0Var.E;
                gt4.j1 j1Var = (gt4.j1) ((java.util.ArrayList) list).get(w17);
                int i19 = s0Var.H;
                boolean z17 = false;
                if (i19 == 0 || i19 != j1Var.f356992d) {
                    s0Var.H = j1Var.f356992d;
                    android.widget.FrameLayout frameLayout = s0Var.C;
                    if (frameLayout == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
                        throw null;
                    }
                    frameLayout.setVisibility(0);
                    s0Var.m();
                }
                if (j1Var.f356989a != 1) {
                    int i27 = j1Var.f356990b;
                    if (i27 < 0) {
                        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                        return;
                    }
                    gt4.j1 j1Var2 = (gt4.j1) ((java.util.ArrayList) list).get(i27);
                    int size = ((java.util.ArrayList) list).size();
                    int i28 = j1Var2.f356991c;
                    if (size <= i28 || i28 <= 0) {
                        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                        return;
                    }
                    j1Var = (gt4.j1) ((java.util.ArrayList) list).get(i28);
                }
                android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(j1Var.f356990b);
                if (mo7935xa188593e == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                    return;
                }
                int i29 = s0Var.I;
                int top = mo7935xa188593e.getTop();
                if (1 <= top && top <= i29) {
                    z17 = true;
                }
                if (z17) {
                    android.widget.FrameLayout frameLayout2 = s0Var.C;
                    if (frameLayout2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
                        throw null;
                    }
                    frameLayout2.setY(mo7935xa188593e.getTop() - s0Var.I);
                } else {
                    android.widget.FrameLayout frameLayout3 = s0Var.C;
                    if (frameLayout3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
                        throw null;
                    }
                    frameLayout3.setY(0.0f);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletComplexDatePicker$listScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
