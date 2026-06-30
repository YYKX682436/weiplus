package ym5;

/* loaded from: classes3.dex */
public final class p3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f544993d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f544994e = new android.graphics.Rect();

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f544995f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b f544996g;

    public p3(com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b) {
        this.f544996g = c22800xb2c6317b;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b = this.f544996g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22800xb2c6317b.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c22800xb2c6317b.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).y();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(w17);
        android.view.View view = p07 != null ? p07.f3639x46306858 : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08 = recyclerView.p0(y17);
        android.view.View view2 = p08 != null ? p08.f3639x46306858 : null;
        android.graphics.Rect rect = this.f544994e;
        if (view != null) {
            view.getLocalVisibleRect(rect);
        }
        android.graphics.Rect rect2 = this.f544995f;
        if (view2 != null) {
            view2.getLocalVisibleRect(rect2);
        }
        if (rect.width() <= rect2.width()) {
            w17 = y17;
        }
        if (w17 != this.f544993d && w17 != -1) {
            c22800xb2c6317b.post(new ym5.o3(c22800xb2c6317b, w17));
            this.f544993d = w17;
        }
        yj0.a.h(this, "com/tencent/mm/view/RecyclerHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
