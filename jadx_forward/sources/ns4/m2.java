package ns4;

/* loaded from: classes8.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.i50 f421125e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de, r45.i50 i50Var) {
        this.f421124d = activityC19067xb53aa1de;
        this.f421125e = i50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f421124d;
        ms4.t tVar = activityC19067xb53aa1de.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        tVar.R6(9);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f421125e.f458272e);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19067xb53aa1de, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateTopBannerView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
