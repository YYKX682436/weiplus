package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f229875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f229876e;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e, android.widget.LinearLayout linearLayout) {
        this.f229876e = activityC16480xce80140e;
        this.f229875d = linearLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.LinearLayout linearLayout = this.f229875d;
        int width = linearLayout.getWidth();
        int height = linearLayout.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f229876e;
        activityC16480xce80140e.L = height;
        int b17 = (width - (i65.a.b(activityC16480xce80140e.mo55332x76847179(), 8) * 3)) / 2;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) activityC16480xce80140e.f229798r.findViewById(com.p314xaae8f345.mm.R.id.jkk);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        int width2 = linearLayout2.getWidth();
        int height2 = linearLayout2.getHeight();
        if (width2 > b17) {
            layoutParams.width = b17;
            width2 = b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "headContentLayoutWidth:%s,itemLayoutMaxWidth ：%s,walletLayoutWidth:%s", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(width2));
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) activityC16480xce80140e.f229798r.findViewById(com.p314xaae8f345.mm.R.id.jkg);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
        layoutParams2.width = width2;
        layoutParams2.height = height2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_HEADER_ITEM_WIDTH_INT_SYNC, java.lang.Integer.valueOf(width2));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_HEADER_ITEM_HEIGHT_INT_SYNC, java.lang.Integer.valueOf(height2));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
        int i17 = (width - (width2 * 2)) / 3;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.m1 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.WALLET_MALL_HEADER_INTERVAL_INT_SYNC;
        int intValue = ((java.lang.Integer) wi6.i(u3Var, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexUIv2", "caculate interval:%s lastInterval:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(intValue));
        if (intValue != i17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(u3Var, java.lang.Integer.valueOf(i17));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
            layoutParams2.leftMargin = i17;
            layoutParams.rightMargin = i17;
        }
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout2.setLayoutParams(layoutParams);
    }
}
