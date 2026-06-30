package oj5;

/* loaded from: classes14.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public int f427392d;

    /* renamed from: e, reason: collision with root package name */
    public int f427393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oj5.o f427394f;

    public n(oj5.o oVar) {
        this.f427394f = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f427392d += i18;
        if (this.f427393e == 0) {
            android.view.View view = (android.view.View) q26.h0.l(q26.h0.v(new n3.r1(recyclerView), new oj5.m()));
            int height = view != null ? view.getHeight() : 0;
            if (20 >= height) {
                height = 20;
            }
            this.f427393e = height;
        }
        if (java.lang.Math.abs(this.f427392d) >= this.f427393e) {
            oj5.o.b(this.f427394f, i18 > 0, "onScrolled", 0L, 4, null);
            this.f427392d = 0;
        }
        yj0.a.h(this, "com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
