package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wt f95318d;

    public f0(r45.wt wtVar) {
        this.f95318d = wtVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wt wtVar = this.f95318d;
        r45.iu iuVar = wtVar.f389439s;
        if (iuVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(iuVar != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "detail goto mini app %s", objArr);
            r45.iu iuVar2 = wtVar.f389439s;
            lu1.d.f(iuVar2.f377328d, iuVar2.f377329e, iuVar2.f377330f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showMiniAppLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
