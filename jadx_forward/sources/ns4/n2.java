package ns4;

/* loaded from: classes8.dex */
public final class n2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421131d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421131d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.r74 r74Var;
        r45.la7 la7Var = (r45.la7) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421131d;
        if (la7Var != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
            activityC19068x49d5e62b.getClass();
            r74Var = la7Var.f460816e;
        } else {
            r74Var = null;
        }
        if (r74Var == null) {
            android.view.View view = activityC19068x49d5e62b.f260731t;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wecoin_subscription_list");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = activityC19068x49d5e62b.f260731t;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wecoin_subscription_list");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateSubscriptionListEntrance", "(Lcom/tencent/mm/protocal/protobuf/WecoinSubscriptionListEntrance;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = activityC19068x49d5e62b.f260732u;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wecoin_subscription_list_title");
            throw null;
        }
        textView.setText(la7Var.f460815d);
        android.view.View view3 = activityC19068x49d5e62b.f260731t;
        if (view3 != null) {
            view3.setOnClickListener(new ns4.p3(la7Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wecoin_subscription_list");
            throw null;
        }
    }
}
