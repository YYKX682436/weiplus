package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class yd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 f214924d;

    public yd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165) {
        this.f214924d = c15317x5870b165;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView$restrictIcon$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderLiveShoppingCouponView", "restrict action clicked too fast!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView$restrictIcon$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("coupon restrict clicked: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 c15317x5870b165 = this.f214924d;
        sb6.append(c15317x5870b165.f212768u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCouponView", sb6.toString());
        yz5.l restrictCallback = c15317x5870b165.getRestrictCallback();
        if (restrictCallback != null) {
            cm2.k0 k0Var = c15317x5870b165.f212768u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
            restrictCallback.mo146xb9724478(k0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderLiveShoppingCouponView$restrictIcon$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
