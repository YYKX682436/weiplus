package iu1;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu1.m f376382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.tt f376383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f376384h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f376385i;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, r45.wt wtVar, iu1.m mVar, r45.tt ttVar, int i17, int i18) {
        this.f376380d = activityC13064xaf775f76;
        this.f376381e = wtVar;
        this.f376382f = mVar;
        this.f376383g = ttVar;
        this.f376384h = i17;
        this.f376385i = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376380d;
        activityC13064xaf775f76.B = true;
        activityC13064xaf775f76.C = 0;
        r45.wt wtVar = this.f376381e;
        activityC13064xaf775f76.f176715J = wtVar;
        r45.tt ttVar = this.f376383g;
        java.lang.String user_card_id = ttVar.f468298d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        this.f376382f.w(user_card_id);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16324, 1, wtVar.f470960d, java.lang.Integer.valueOf(this.f376384h), ttVar.f468298d, 2, java.lang.Integer.valueOf(this.f376385i), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
