package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260283d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260283d = activityC19036x32c728a3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean x17 = vr4.f1.wi().Ai().x();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260283d;
        if (x17) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = activityC19036x32c728a3.f260262u;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 6, "");
        }
        if (activityC19036x32c728a3.f260246e.P == 1) {
            if (vr4.f1.wi().Ai().x()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = activityC19036x32c728a3.f260262u;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d562 == null ? 0 : c19760x34448d562.f273642e, c19760x34448d562 == null ? "" : c19760x34448d562.f273647m, 5, "");
            }
            activityC19036x32c728a3.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 c19099x8d444f05 = activityC19036x32c728a3.f260246e;
            if (c19099x8d444f05 != null) {
                bundle.putString("key_reqKey", c19099x8d444f05.f261208e);
                java.util.List list = activityC19036x32c728a3.f260246e.M;
                if (list != null && ((java.util.ArrayList) list).size() > 0) {
                    bundle.putString("key_TransId", ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Commodity) ((java.util.ArrayList) activityC19036x32c728a3.f260246e.M).get(0)).f261247r);
                }
                bundle.putLong("key_SessionId", activityC19036x32c728a3.N);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d563 = activityC19036x32c728a3.f260262u;
            if (c19760x34448d563 != null) {
                bundle.putInt("key_scene", c19760x34448d563.f273642e);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d564 = activityC19036x32c728a3.f260262u;
            if (c19760x34448d564 == null || c19760x34448d564.f273642e != 11) {
                bundle.putInt("key_bind_scene", 0);
            } else {
                bundle.putInt("key_bind_scene", 13);
            }
            bundle.putBoolean("key_need_bind_response", true);
            bundle.putInt("key_req_bind_scene", 0);
            bundle.putBoolean("key_is_bind_bankcard", true);
            bundle.putBoolean("key_is_oversea", !activityC19036x32c728a3.j7());
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19036x32c728a3, yr4.a.class, bundle, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC19036x32c728a3.f260245d, "SimpleReg , assigned userinfo pay! payWithNewBankcard");
            if (vr4.f1.wi().Ai().x()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d565 = activityC19036x32c728a3.f260262u;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d565 == null ? 0 : c19760x34448d565.f273642e, c19760x34448d565 == null ? "" : c19760x34448d565.f273647m, 5, "");
            }
            activityC19036x32c728a3.n7(false, 0, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
