package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ph implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd f228852d;

    public ph(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd) {
        this.f228852d = activityC16384xb66222dd;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd activityC16384xb66222dd = this.f228852d;
        if (id6 == com.p314xaae8f345.mm.R.id.f567335j43 || view.getId() == com.p314xaae8f345.mm.R.id.j4_) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
            activityC16384xb66222dd.h7(5);
            if (activityC16384xb66222dd.f227957q2 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "mSendBtn click, but need wait upload voice result");
                activityC16384xb66222dd.f227965u2 = true;
                activityC16384xb66222dd.n7();
                android.view.View view2 = activityC16384xb66222dd.f227938h;
                if (view2 != null) {
                    view2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.oh(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "mSendBtn click!");
                activityC16384xb66222dd.a7(0);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f567338j46) {
            activityC16384xb66222dd.finish();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
            activityC16384xb66222dd.h7(6);
            activityC16384xb66222dd.Y1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a67 = activityC16384xb66222dd.Y1;
            c6646xbe932a67.f139948d = 11L;
            c6646xbe932a67.k();
            activityC16384xb66222dd.j7(2);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.j3g || view.getId() == com.p314xaae8f345.mm.R.id.j3o || view.getId() == com.p314xaae8f345.mm.R.id.j3v) {
            activityC16384xb66222dd.Y1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a672 = activityC16384xb66222dd.Y1;
            c6646xbe932a672.f139948d = 3L;
            c6646xbe932a672.k();
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.W6(activityC16384xb66222dd);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.j3k || view.getId() == com.p314xaae8f345.mm.R.id.j3l) {
            activityC16384xb66222dd.W1 = null;
            activityC16384xb66222dd.X1 = null;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_NEW_STRING, "");
            activityC16384xb66222dd.c7();
            activityC16384xb66222dd.h7(3);
            activityC16384xb66222dd.Y1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a673 = activityC16384xb66222dd.Y1;
            c6646xbe932a673.f139948d = 5L;
            c6646xbe932a673.k();
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f567332j40 || view.getId() == com.p314xaae8f345.mm.R.id.f567286iy0 || view.getId() == com.p314xaae8f345.mm.R.id.j4b) {
            activityC16384xb66222dd.F.b();
            activityC16384xb66222dd.b7();
            activityC16384xb66222dd.c7();
            activityC16384xb66222dd.h7(4);
            activityC16384xb66222dd.Y1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6646xbe932a67 c6646xbe932a674 = activityC16384xb66222dd.Y1;
            c6646xbe932a674.f139948d = 2L;
            c6646xbe932a674.k();
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f567333j41) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.i6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.i6.class))).wi(activityC16384xb66222dd.f227939h2);
            activityC16384xb66222dd.p7(false);
            activityC16384xb66222dd.d7(3);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.j3f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.W6(activityC16384xb66222dd);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.r3p) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16384xb66222dd.M2;
            activityC16384xb66222dd.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "showVoiceOperateSheet");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC16384xb66222dd, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qh(activityC16384xb66222dd);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rh(activityC16384xb66222dd);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
