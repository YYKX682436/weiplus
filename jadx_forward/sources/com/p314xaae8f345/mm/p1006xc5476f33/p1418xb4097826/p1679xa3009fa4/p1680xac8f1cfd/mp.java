package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class mp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f216726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f216727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f216729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp f216730h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216731i;

    public mp(int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp qpVar, in5.s0 s0Var) {
        this.f216726d = i17;
        this.f216727e = c22628xfde5d61d;
        this.f216728f = abstractC14490x69736cb5;
        this.f216729g = c19781xd1c47b87;
        this.f216730h = qpVar;
        this.f216731i = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC$bindData$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("image_comment_carousel imageView clicked, idx=");
        int i18 = this.f216726d;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", sb6.toString());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f216727e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f216728f;
        jz5.l lVar = new jz5.l("feedid", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f216729g;
        jz5.l lVar2 = new jz5.l("comment_id", pm0.v.u(c19781xd1c47b87.m76058xa6514d24()));
        jz5.l lVar3 = new jz5.l("comment_cnt", java.lang.Integer.valueOf(abstractC14490x69736cb5.getFeedObject().m59216x8ed22866()));
        boolean z18 = true;
        hc2.v0.d(c22628xfde5d61d, "image_comment_carousel", "view_clk", false, kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("card_idex", java.lang.Integer.valueOf(i18 + 1))), null, 20, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f216728f;
        long m76058xa6514d24 = c19781xd1c47b87.m76058xa6514d24();
        this.f216730h.getClass();
        in5.s0 s0Var = this.f216731i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
        in5.r w07 = c22848x6ddd90cf != null ? c22848x6ddd90cf.w0(s0Var.m8185xcdaf1228()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMultiImageDescCommentUIC", "jumpFinderComment commentId=" + pm0.v.u(m76058xa6514d24) + ",fullConvert=" + w07);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = w07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe) w07 : null;
            if (qeVar != null) {
                android.content.Context context = s0Var.f374654e;
                int c17 = com.p314xaae8f345.mm.ui.bl.c(context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context);
                android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                int i19 = b17.x;
                int i27 = b17.y;
                java.lang.System.nanoTime();
                if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
                    z18 = false;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                if (z18) {
                    i17 = i27 - c17;
                } else {
                    if (i27 >= i19) {
                        i19 = i27;
                    }
                    i17 = i19 - c17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.E0(qeVar, s0Var, abstractC14490x69736cb52, false, m76058xa6514d24, null, 0, 5, false, 1500L, (int) (i17 * kx2.a.f394811a.a(context)), 1, 180, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC$bindData$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
