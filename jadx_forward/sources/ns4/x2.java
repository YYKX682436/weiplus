package ns4;

/* loaded from: classes4.dex */
public final class x2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421210d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421210d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421210d;
        android.view.View findViewById = activityC19068x49d5e62b.findViewById(com.p314xaae8f345.mm.R.id.j7s);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) activityC19068x49d5e62b.findViewById(com.p314xaae8f345.mm.R.id.pk7);
        android.widget.TextView textView = (android.widget.TextView) activityC19068x49d5e62b.findViewById(com.p314xaae8f345.mm.R.id.pk8);
        if (booleanValue && (!r26.i0.p("CN", gm0.j1.u().c().u(274436, "CN"), true))) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(0);
            textView.setVisibility(0);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateCloseAuthBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
