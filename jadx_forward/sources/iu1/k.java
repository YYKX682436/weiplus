package iu1;

/* loaded from: classes9.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.m f376420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f376421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376422f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376423g;

    public k(iu1.m mVar, int i17, r45.wt wtVar, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376420d = mVar;
        this.f376421e = i17;
        this.f376422f = wtVar;
        this.f376423g = activityC13064xaf775f76;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iu1.m mVar = this.f376420d;
        iu1.a aVar = mVar.f376452x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        r45.wt wtVar = aVar.f376364a;
        int childCount = mVar.k().getChildCount();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
        int i17 = wtVar.f470975v;
        int i18 = this.f376421e;
        if (childCount < i17) {
            mVar.j(wtVar.f470976w, -1, i18);
            if (wtVar.f470976w >= wtVar.f470975v) {
                mVar.o().setVisibility(8);
            } else {
                mVar.D(true, i18);
            }
        }
        iu1.a aVar2 = mVar.f376452x;
        if (aVar2 != null) {
            aVar2.f376368e = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        r45.wt wtVar2 = this.f376422f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar2);
        g0Var.d(16324, 1, wtVar2.f470960d, 0, 0, 4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f376423g.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
