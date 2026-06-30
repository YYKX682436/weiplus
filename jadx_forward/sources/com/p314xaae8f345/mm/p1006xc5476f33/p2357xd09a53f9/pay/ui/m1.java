package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260320a;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260320a = activityC19036x32c728a3;
    }

    public void a() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260320a;
        activityC19036x32c728a3.I.removeAllViews();
        int i18 = activityC19036x32c728a3.f260248g;
        if (i18 == 0) {
            i18 = 0;
        } else if (!activityC19036x32c728a3.f260263v) {
            i18 = 1;
        }
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -2);
        for (int i19 = 0; i19 < i18; i19++) {
            android.view.View inflate = ((android.view.LayoutInflater) activityC19036x32c728a3.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d7s, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pdg);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569203pe3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity commodity = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) activityC19036x32c728a3.f260246e.M).get(i19);
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = activityC19036x32c728a3.f260262u;
            java.lang.String str = "";
            if (c19760x34448d56 != null && ((i17 = c19760x34448d56.f273642e) == 32 || i17 == 33 || i17 == 31 || i17 == 48)) {
                java.lang.String string = c19760x34448d56.f273655u.getString("extinfo_key_1", "");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC19036x32c728a3.f260245d, "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                } else {
                    gm0.j1.i();
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(string);
                    if (q17 != null) {
                        str = q17.g2();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC19036x32c728a3.f260245d, "can not found contact for user::" + string + "");
                    }
                }
            }
            if (commodity != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    textView2.setText(str);
                    textView2.setVisibility(0);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569204pe4)).setVisibility(0);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commodity.f261239g)) {
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569204pe4)).setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(commodity.f261239g);
                    textView2.setVisibility(0);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569204pe4)).setVisibility(0);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commodity.f261240h)) {
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pdi)).setVisibility(8);
                    textView.setVisibility(8);
                } else {
                    textView.setText(commodity.f261240h);
                    textView.setVisibility(8);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pdi)).setVisibility(8);
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(commodity.f261239g)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(inflate, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(inflate, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            inflate.setLayoutParams(layoutParams);
            inflate.measure(-2, -2);
            activityC19036x32c728a3.I.addView(inflate);
        }
    }
}
