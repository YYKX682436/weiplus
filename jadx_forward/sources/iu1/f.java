package iu1;

/* loaded from: classes9.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu1.m f376400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f376401h;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, r45.wt wtVar, r45.wt wtVar2, iu1.m mVar, int i17) {
        this.f376397d = activityC13064xaf775f76;
        this.f376398e = wtVar;
        this.f376399f = wtVar2;
        this.f376400g = mVar;
        this.f376401h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "click header");
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376397d;
        activityC13064xaf775f76.B = true;
        activityC13064xaf775f76.C = 0;
        activityC13064xaf775f76.f176715J = this.f376398e;
        r45.wt wtVar = this.f376399f;
        int i17 = wtVar.f470965i;
        if (i17 == 1) {
            android.content.Context context = this.f376400g.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, wtVar.f470966m, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = wtVar.f470967n;
            lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16324, 1, wtVar.f470960d, 0, 0, 1, java.lang.Integer.valueOf(this.f376401h), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$setModel$1$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
