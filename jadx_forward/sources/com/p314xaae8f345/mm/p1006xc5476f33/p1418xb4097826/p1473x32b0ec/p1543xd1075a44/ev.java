package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class ev extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f199815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f199816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f199817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f199818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f199819h;

    public ev(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, yz5.l lVar2) {
        this.f199815d = c1163xf1deaba4;
        this.f199816e = f0Var;
        this.f199817f = lVar;
        this.f199818g = f0Var2;
        this.f199819h = lVar2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f199815d;
        if (i18 > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de != null) {
                int y17 = c1162x665295de.y();
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f199816e;
                if (y17 != f0Var.f391649d) {
                    f0Var.f391649d = y17;
                    this.f199817f.mo146xb9724478(java.lang.Integer.valueOf(y17));
                }
            }
        } else if (i18 < 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba4.getLayoutManager();
            c1162x665295de = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
            if (c1162x665295de != null) {
                int w17 = c1162x665295de.w();
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f199818g;
                if (w17 != f0Var2.f391649d) {
                    f0Var2.f391649d = w17;
                    this.f199819h.mo146xb9724478(java.lang.Integer.valueOf(w17));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSongRvWidgetKt$onScrollToCheckLoadMore$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
