package gv2;

/* loaded from: classes8.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gv2.w f357572f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.d f357573g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f357574h;

    public l(android.view.View view, android.view.View view2, gv2.w wVar, jv2.d dVar, boolean z17) {
        this.f357570d = view;
        this.f357571e = view2;
        this.f357572f = wVar;
        this.f357573g = dVar;
        this.f357574h = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f357570d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f357571e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d dVar = this.f357572f.f357620e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar).i(this.f357573g, this.f357574h);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
