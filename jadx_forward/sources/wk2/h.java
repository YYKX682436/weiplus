package wk2;

/* loaded from: classes3.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk2.j f528476d;

    public h(wk2.j jVar) {
        this.f528476d = jVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAutoPlay", "onScrollStateChanged newState:" + i17);
        if (i17 == 0) {
            wk2.j jVar = this.f528476d;
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAutoPlay", "checkAutoPlay");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = jVar.f528486i;
            java.lang.Runnable runnable = jVar.f528487j;
            n3Var.mo50300x3fa464aa(runnable);
            n3Var.mo50297x7c4d7ca2(runnable, 0L);
        } else if (i17 == 2) {
            pm0.v.V(100L, new wk2.g(recyclerView));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        wk2.j jVar = this.f528476d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = jVar.f528480c.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        c15416x1f1f78b7.u(iArr);
        c15416x1f1f78b7.v(iArr2);
        for (int i19 = 0; i19 < 2; i19++) {
            jVar.b(iArr[i19]);
        }
        for (int i27 = 0; i27 < 2; i27++) {
            jVar.b(iArr2[i27]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamAutoPlayerManager$onScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
