package nu0;

/* loaded from: classes5.dex */
public final class b2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f421405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 f421406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f421407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421408g;

    public b2(p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, nu0.b4 b4Var) {
        this.f421406e = y1Var;
        this.f421407f = c1162x665295de;
        this.f421408g = b4Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y1 y1Var = this.f421406e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f421407f;
        android.view.View f17 = y1Var.f(c1162x665295de);
        int i18 = this.f421405d;
        if (f17 != null) {
            i18 = c1162x665295de.m8032xa86cd69f(f17);
        }
        int i19 = this.f421405d;
        nu0.b4 b4Var = this.f421408g;
        if (i18 != i19) {
            b4Var.D7(i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "[onScrollStateChanged] state:" + i17 + " newPosition:" + i18);
        if (i17 != 0) {
            if (i17 == 1) {
                b4Var.f421413p0 = true;
                b4Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageComp.MainComposingUIC", "[showContentImageView]");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 k76 = b4Var.k7();
                android.view.ViewGroup.LayoutParams layoutParams = k76.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                layoutParams2.height = b4Var.t7().getHeight();
                k76.setLayoutParams(layoutParams2);
                android.view.ViewGroup m76 = b4Var.m7();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(m76, arrayList2.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList2.get(0)).intValue();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(m76, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "showContentImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m76.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(m76, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC", "showContentImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(m76, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (i18 != this.f421405d) {
                this.f421405d = i18;
                b4Var.getClass();
                b4Var.A7("scroll", i18, new nu0.l3(b4Var));
                b4Var.q7().W6(1);
                yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                return;
            }
            nu0.b4.a7(b4Var);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initContentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
