package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wt f176851d;

    public f0(r45.wt wtVar) {
        this.f176851d = wtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wt wtVar = this.f176851d;
        r45.iu iuVar = wtVar.f470972s;
        if (iuVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(iuVar != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", objArr);
            r45.iu iuVar2 = wtVar.f470972s;
            lu1.d.f(iuVar2.f458861d, iuVar2.f458862e, iuVar2.f458863f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
