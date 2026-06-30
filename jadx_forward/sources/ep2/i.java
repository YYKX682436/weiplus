package ep2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ep2.k f337251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f337253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f337254g;

    public i(ep2.k kVar, java.lang.String str, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f337251d = kVar;
        this.f337252e = str;
        this.f337253f = obj;
        this.f337254g = abstractC14490x69736cb5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert$bindLive$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String valueOf = java.lang.String.valueOf(this.f337251d.f337257m);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        ml2.u1 u1Var = ml2.u1.f409573e;
        a4Var.b(valueOf, b17, "square_card_friend_like_word", this.f337252e);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        ((c61.p2) ybVar).Aj(this.f337253f, this.f337254g.getFeedObject());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert$bindLive$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
