package zb3;

/* loaded from: classes9.dex */
public class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b f552827d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b) {
        this.f552827d = activityC16343x55c0d8b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        long D0;
        long j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.sns.ActivityC16343x55c0d8b activityC16343x55c0d8b = this.f552827d;
        g0Var.d(11701, 4, 0, 0, java.lang.Integer.valueOf(activityC16343x55c0d8b.W6()), 4);
        if (activityC16343x55c0d8b.f227290h.c() != 0) {
            db5.t7.m123882x26a183b(activityC16343x55c0d8b.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.kfm, 0).show();
        } else {
            int m66199x7498fe14 = activityC16343x55c0d8b.f227289g.m66199x7498fe14();
            double m66174x7498fe14 = activityC16343x55c0d8b.f227290h.m66174x7498fe14();
            if (activityC16343x55c0d8b.f227305z == 1) {
                long D02 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D0(m66174x7498fe14);
                gm0.j1.i();
                gm0.j1.u().c().w(356354, java.lang.Integer.valueOf(m66199x7498fe14));
                j17 = 0;
                D0 = D02;
            } else {
                D0 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D0(m66199x7498fe14 * m66174x7498fe14);
                long D03 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.D0(m66174x7498fe14);
                gm0.j1.i();
                gm0.j1.u().c().w(356353, java.lang.Integer.valueOf(m66199x7498fe14));
                j17 = D03;
            }
            java.lang.String m66211x7498fe14 = activityC16343x55c0d8b.f227291i.m66211x7498fe14();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m66211x7498fe14)) {
                m66211x7498fe14 = activityC16343x55c0d8b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjq);
            }
            java.lang.String str = m66211x7498fe14;
            java.lang.String stringExtra = activityC16343x55c0d8b.getIntent().getStringExtra("key_username");
            activityC16343x55c0d8b.m66165x5406100e((!activityC16343x55c0d8b.D || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) ? new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6(m66199x7498fe14, D0, j17, activityC16343x55c0d8b.f227305z, str, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.l(), null, null, c01.z1.r(), c01.z1.l(), activityC16343x55c0d8b.A, "") : new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h6(m66199x7498fe14, D0, j17, activityC16343x55c0d8b.f227305z, str, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.l(), stringExtra, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.m(stringExtra), c01.z1.r(), c01.z1.l(), activityC16343x55c0d8b.A, ""), false);
            android.app.Dialog dialog = activityC16343x55c0d8b.f227298s;
            if (dialog != null) {
                dialog.show();
            } else {
                activityC16343x55c0d8b.f227298s = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(activityC16343x55c0d8b.mo55332x76847179(), true, new zb3.u(this));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
