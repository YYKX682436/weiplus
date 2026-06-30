package iu1;

/* loaded from: classes9.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu1.m f376429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f376430g;

    public l(r45.wt wtVar, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, iu1.m mVar, int i17) {
        this.f376427d = wtVar;
        this.f376428e = activityC13064xaf775f76;
        this.f376429f = mVar;
        this.f376430g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wt wtVar = this.f376427d;
        r45.iu iuVar = wtVar.f470972s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376428e;
        if (iuVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(iuVar != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", objArr);
            activityC13064xaf775f76.B = true;
            activityC13064xaf775f76.C = 0;
            activityC13064xaf775f76.f176715J = wtVar;
            r45.iu iuVar2 = wtVar.f470972s;
            lu1.d.f(iuVar2.f458861d, iuVar2.f458862e, iuVar2.f458863f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        iu1.a aVar = this.f376429f.f376452x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        r45.wt wtVar2 = aVar.f376364a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar2);
        g0Var.d(16324, 1, wtVar2.f470960d, 0, 0, 6, java.lang.Integer.valueOf(this.f376430g), java.lang.Integer.valueOf(activityC13064xaf775f76.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
