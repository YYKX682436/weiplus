package iu1;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu1.m f376390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.tt f376391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f376392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f376393i;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, r45.wt wtVar, iu1.m mVar, r45.tt ttVar, int i17, int i18) {
        this.f376388d = activityC13064xaf775f76;
        this.f376389e = wtVar;
        this.f376390f = mVar;
        this.f376391g = ttVar;
        this.f376392h = i17;
        this.f376393i = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376388d;
        activityC13064xaf775f76.B = true;
        activityC13064xaf775f76.C = 0;
        r45.wt wtVar = this.f376389e;
        activityC13064xaf775f76.f176715J = wtVar;
        r45.tt ttVar = this.f376391g;
        java.lang.String user_card_id = ttVar.f468298d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
        this.f376390f.w(user_card_id);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16324, 1, wtVar.f470960d, java.lang.Integer.valueOf(this.f376392h), ttVar.f468298d, 2, java.lang.Integer.valueOf(this.f376393i), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$appendCouponView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
