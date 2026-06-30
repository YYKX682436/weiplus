package iu1;

/* loaded from: classes9.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iu1.m f376414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f376415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wt f376416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376417g;

    public j(iu1.m mVar, int i17, r45.wt wtVar, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376414d = mVar;
        this.f376415e = i17;
        this.f376416f = wtVar;
        this.f376417g = activityC13064xaf775f76;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        iu1.m mVar = this.f376414d;
        iu1.a aVar = mVar.f376452x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        r45.wt wtVar = aVar.f376364a;
        int childCount = mVar.k().getChildCount();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar);
        if (childCount > wtVar.f470976w) {
            mVar.k().getChildCount();
            int childCount2 = mVar.k().getChildCount() - 1;
            int i17 = wtVar.f470976w;
            if (i17 <= childCount2) {
                while (true) {
                    mVar.k().removeViewAt(childCount2);
                    if (childCount2 == i17) {
                        break;
                    } else {
                        childCount2--;
                    }
                }
            }
        }
        int i18 = this.f376415e;
        mVar.D(false, i18);
        iu1.a aVar2 = mVar.f376452x;
        if (aVar2 != null) {
            aVar2.f376368e = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        r45.wt wtVar2 = this.f376416f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wtVar2);
        g0Var.d(16324, 1, wtVar2.f470960d, 0, 0, 5, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f376417g.E));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageVH$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
