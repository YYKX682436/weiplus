package ro2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f479616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f479617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f479619g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f479616d = qeVar;
        this.f479617e = s0Var;
        this.f479618f = context;
        this.f479619g = abstractC14490x69736cb5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f479617e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f479616d;
        ro2.r.c(qeVar, s0Var);
        ro2.t tVar = ro2.t.f479627e;
        android.content.Context context = this.f479618f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f479619g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item, "$item");
        ro2.r.h(qeVar, tVar, context, item);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt$showMileStoneCard$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
