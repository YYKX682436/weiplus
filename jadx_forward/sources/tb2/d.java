package tb2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f498495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f498496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tb2.f f498497f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 s0Var, tb2.f fVar) {
        this.f498495d = abstractC14490x69736cb5;
        this.f498496e = s0Var;
        this.f498497f = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        in5.s0 s0Var = this.f498496e;
        long m8183xf806b362 = s0Var.m8183xf806b362();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498495d;
        ((ml2.j0) zbVar).tj(abstractC14490x69736cb5, m8183xf806b362, "94");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (qe2.a.h(feedObject, context)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f498497f.f498504i.mo149xb9724478(abstractC14490x69736cb5, abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/live/FinderLiveSquareLiveFeedConvert$bindUserInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
