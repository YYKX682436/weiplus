package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes8.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f295718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tw4 f295719e;

    public g2(com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d, r45.tw4 tw4Var) {
        this.f295718d = c22905xef04d72d;
        this.f295719e = tw4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WcPayBannerView$setBannerData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f295718d.getContext();
        r45.tw4 tw4Var = this.f295719e;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, tw4Var.f468367g, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24273, tw4Var.f468368h, 2);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WcPayBannerView$setBannerData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
