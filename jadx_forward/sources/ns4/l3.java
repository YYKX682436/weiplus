package ns4;

/* loaded from: classes8.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421120d;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421120d = activityC19068x49d5e62b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateRechargeButtonState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = os4.h.f429812a;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 600) {
            z17 = true;
        } else {
            os4.h.f429812a = android.os.SystemClock.elapsedRealtime();
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421120d;
            ms4.o0 o0Var = activityC19068x49d5e62b.f260718d;
            if (o0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            o0Var.O6(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.T6(activityC19068x49d5e62b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView$updateRechargeButtonState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
