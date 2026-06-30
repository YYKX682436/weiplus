package ns4;

/* loaded from: classes8.dex */
public final class v2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b f421200d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b) {
        this.f421200d = activityC19068x49d5e62b;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.i50 i50Var = (r45.i50) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b.f260717w;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19068x49d5e62b activityC19068x49d5e62b = this.f421200d;
        activityC19068x49d5e62b.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinRechargeView", "bannerContent: [bannerContent] " + i50Var);
        android.view.View view = activityC19068x49d5e62b.f260721g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBannerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i50Var == null || android.text.TextUtils.isEmpty(i50Var.f458271d)) {
            return;
        }
        ms4.o0 o0Var = activityC19068x49d5e62b.f260718d;
        if (o0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(2);
        android.view.View view2 = activityC19068x49d5e62b.f260721g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBannerView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinRechargeView", "updateTopBannerView", "(Lcom/tencent/mm/protocal/protobuf/CoinBanner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = activityC19068x49d5e62b.f260721g;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBannerView");
            throw null;
        }
        ((android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.pkj)).setText(i50Var.f458271d);
        android.view.View view4 = activityC19068x49d5e62b.f260721g;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBannerView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.pki);
        java.lang.String str = i50Var.f458272e;
        if (str == null || str.length() == 0) {
            c22699x3dcdb352.setVisibility(8);
            return;
        }
        c22699x3dcdb352.setVisibility(0);
        android.view.View view5 = activityC19068x49d5e62b.f260721g;
        if (view5 != null) {
            view5.setOnClickListener(new ns4.q3(activityC19068x49d5e62b, i50Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBannerView");
            throw null;
        }
    }
}
