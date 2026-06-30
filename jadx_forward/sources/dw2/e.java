package dw2;

/* loaded from: classes2.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f325650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dw2.o f325651e;

    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, dw2.o oVar) {
        this.f325650d = c1163xf1deaba4;
        this.f325651e = oVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f325650d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        int w17 = c1162x665295de != null ? c1162x665295de.w() : -1;
        if (i17 == 0) {
            dw2.o oVar = this.f325651e;
            if (((java.lang.Boolean) ((jz5.n) oVar.f325680l).mo141623x754a37bb()).booleanValue() && !((java.lang.Boolean) ((jz5.n) oVar.f325681m).mo141623x754a37bb()).booleanValue()) {
                int a17 = dw2.o.f325667t.a(w17, oVar.f325676h);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = c1163xf1deaba4.q0(a17, false);
                in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                if ((s0Var != null ? s0Var.f374658i : null) instanceof so2.h1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f325669a, "onScrollStateChanged: pre render live feed, curPos=" + w17 + ", nextPos=" + a17);
                    oVar.c("NextLiveIdle", w17, true);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
                    return;
                }
            }
            oVar.c("ScrollIdle", w17, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/autoplay/FinderFeedSelectorAdapter$bindPrepareFeedListener$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
