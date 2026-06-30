package ns4;

/* loaded from: classes8.dex */
public final class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421091e;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b, java.lang.String str) {
        this.f421090d = activityC19068x49d5e62b;
        this.f421091e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateFaqView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421090d;
        ms4.o0 o0Var = activityC19068x49d5e62b.f260718d;
        if (o0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(5);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f421091e);
        intent.putExtra("showShare", false);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19068x49d5e62b.mo55332x76847179(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateFaqView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
