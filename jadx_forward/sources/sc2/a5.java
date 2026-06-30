package sc2;

/* loaded from: classes2.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b5 f487286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487289g;

    public a5(sc2.b5 b5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.view.View view, java.lang.String str) {
        this.f487286d = b5Var;
        this.f487287e = abstractC14490x69736cb5;
        this.f487288f = view;
        this.f487289g = str;
    }

    public static final void a(sc2.b5 b5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, android.view.View view) {
        java.util.Map map = sc2.b5.f487314y;
        int i17 = !b5Var.H(abstractC14490x69736cb5) ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b5Var.f487315w, "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(str, 2, i17, null, 9, abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11());
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        Ni.t(context, view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        Ni.l().K(new sc2.z4(i17, b5Var, abstractC14490x69736cb5, view, str));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FeedJumperNextLiveNoticeObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sc2.b5 b5Var = this.f487286d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = b5Var.f487316x;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487287e;
        boolean H = b5Var.H(abstractC14490x69736cb5);
        java.lang.String str = this.f487289g;
        android.view.View view2 = this.f487288f;
        if (H) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view2.getContext(), 1, true);
            k0Var.X1 = true;
            k0Var.f293405n = new sc2.w4(view2);
            k0Var.f293414s = new sc2.x4(b5Var, abstractC14490x69736cb5, str, view2);
            k0Var.v();
        } else {
            a(b5Var, abstractC14490x69736cb5, str, view2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperNextLiveNoticeObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
