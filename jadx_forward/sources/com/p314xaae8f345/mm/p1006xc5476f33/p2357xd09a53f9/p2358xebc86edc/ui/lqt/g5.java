package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes3.dex */
public class g5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae f259718d;

    public g5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae activityC19019x2a980aae) {
        this.f259718d = activityC19019x2a980aae;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae activityC19019x2a980aae = this.f259718d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchFinishUI", "url type is %s", java.lang.Integer.valueOf(activityC19019x2a980aae.f259576h.f454285h));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtSaveFetchFinishUI", "url is %s", activityC19019x2a980aae.f259576h.f454283f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(29559, "8", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        r45.du4 du4Var = activityC19019x2a980aae.f259576h;
        int i17 = du4Var.f454285h;
        if (i17 == 1) {
            if ("wxpay://lqt/planindex".equals(du4Var.f454283f)) {
                android.content.Intent intent = new android.content.Intent(activityC19019x2a980aae.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19015x36b35eb1.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae activityC19019x2a980aae2 = this.f259718d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activityC19019x2a980aae2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC19019x2a980aae2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activityC19019x2a980aae2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("wxpay://lqt/preaddplan".equals(activityC19019x2a980aae.f259576h.f454283f)) {
                android.content.Intent intent2 = new android.content.Intent(activityC19019x2a980aae.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.class);
                intent2.putExtra("key_mode", 3);
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae activityC19019x2a980aae3 = this.f259718d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(activityC19019x2a980aae3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityC19019x2a980aae3.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(activityC19019x2a980aae3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("wxpay://lqt/fixeddeposit/makeplan".equals(activityC19019x2a980aae.f259576h.f454283f)) {
                g0Var.d(22449, 2);
                ((h45.q) i95.n0.c(h45.q.class)).mo24817xf6e2c929(activityC19019x2a980aae.mo55332x76847179(), new android.os.Bundle());
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            } else if ("wxpay://lqt/fixeddeposit/planlist".equals(activityC19019x2a980aae.f259576h.f454283f)) {
                g0Var.d(22449, 2);
                ((h45.q) i95.n0.c(h45.q.class)).mo24818x58c4fdf9(activityC19019x2a980aae.mo55332x76847179(), new android.os.Bundle());
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
        } else if (i17 == 2) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454283f)) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("rawUrl", activityC19019x2a980aae.f259576h.f454283f);
                intent3.putExtra("showShare", true);
                intent3.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19019x2a980aae.mo55332x76847179(), intent3);
            }
        } else if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(du4Var.f454286i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19019x2a980aae.f259576h.f454283f)) {
            l81.b1 b1Var = new l81.b1();
            r45.du4 du4Var2 = activityC19019x2a980aae.f259576h;
            b1Var.f398545a = du4Var2.f454286i;
            b1Var.f398555f = du4Var2.f454283f;
            b1Var.f398565k = 1061;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activityC19019x2a980aae.mo55332x76847179(), b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
