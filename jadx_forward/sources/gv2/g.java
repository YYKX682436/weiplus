package gv2;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f357546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gv2.k f357547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jv2.d f357548g;

    public g(android.view.View view, android.view.View view2, gv2.k kVar, jv2.d dVar) {
        this.f357545d = view;
        this.f357546e = view2;
        this.f357547f = kVar;
        this.f357548g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f357545d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f357546e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$8", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) this.f357547f.f357566e).i(this.f357548g, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uniComments/convert/TextStatusFeedCommentConvert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
