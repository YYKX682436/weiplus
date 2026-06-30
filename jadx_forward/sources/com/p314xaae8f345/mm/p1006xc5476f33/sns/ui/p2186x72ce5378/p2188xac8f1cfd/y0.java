package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class y0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e f250591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f250592f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e, int i17) {
        this.f250591e = c18232x7592f55e;
        this.f250592f = i17;
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        android.view.View a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e.f250227t.a(this.f250591e.m80379x76847179(), this.f250592f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        return a17;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        zc4.b item = (zc4.b) cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (holder.f3639x46306858 instanceof tc4.s0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = this.f250591e;
            boolean b76 = c18232x7592f55e.b7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            if (!b76) {
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindViewParams", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                xc4.p n17 = item.n();
                try {
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    jz5.l[] lVarArr = new jz5.l[20];
                    lVarArr[0] = new jz5.l("sns_feed_id", n17.a1());
                    java.lang.String m125483x6bf53a6c = n17.m125483x6bf53a6c();
                    if (m125483x6bf53a6c == null) {
                        m125483x6bf53a6c = "";
                    }
                    lVarArr[1] = new jz5.l("sns_feed_username", m125483x6bf53a6c);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = n17.h1();
                    java.lang.String str = h17 != null ? h17.f39018xf3f56116 : null;
                    if (str == null) {
                        str = "";
                    }
                    lVarArr[2] = new jz5.l("sns_feed_share_name", str);
                    java.lang.String Q0 = n17.Q0();
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    lVarArr[3] = new jz5.l("sns_nick_name", Q0);
                    lVarArr[4] = new jz5.l("sns_feed_is_ad", java.lang.Integer.valueOf(n17.mo133058x3172ed() ? 1 : 0));
                    lVarArr[5] = new jz5.l("sns_feed_screen_height", java.lang.Integer.valueOf(c18232x7592f55e.m70935xe946cf29()));
                    lVarArr[6] = new jz5.l("sns_feed_virtual_key_height", java.lang.Integer.valueOf(c18232x7592f55e.m70932x92c6830()));
                    lVarArr[7] = new jz5.l("sns_feed_status_bar_height", java.lang.Integer.valueOf(c18232x7592f55e.m70936xe5345112()));
                    lVarArr[8] = new jz5.l("sns_feed_action_bar_height", java.lang.Integer.valueOf(c18232x7592f55e.m70928xb0586f4e()));
                    lVarArr[9] = new jz5.l("sns_feed_position", java.lang.Integer.valueOf(i17));
                    lVarArr[10] = new jz5.l("sns_feed_like_count", java.lang.Integer.valueOf(n17.T0().b()));
                    lVarArr[11] = new jz5.l("sns_feed_comment_count", java.lang.Integer.valueOf(n17.m175342x57341267().size()));
                    lVarArr[12] = new jz5.l("sns_feed_type", java.lang.Integer.valueOf(item.n().c1().f68895x2262335f));
                    lVarArr[13] = new jz5.l("sns_is_live", java.lang.Integer.valueOf((item.n().c1().f68895x2262335f == 54 && pc4.e.f434959a.a()) ? 1 : 0));
                    lVarArr[14] = new jz5.l("sns_is_ws", java.lang.Integer.valueOf(n17.m175348xf9b3b2c7() ? 1 : 0));
                    lVarArr[15] = new jz5.l("sns_is_ws_block", java.lang.Integer.valueOf(n17.m175348xf9b3b2c7() ? 1 : 0));
                    if (item.n().h1().f39014x86965dde.F != null) {
                        i19 = 4;
                    } else {
                        if (item.h() != 6 && item.h() != 5) {
                            i19 = 0;
                        }
                        i19 = 1;
                    }
                    lVarArr[16] = new jz5.l("sns_feed_tail_type", java.lang.Integer.valueOf(i19));
                    lVarArr[17] = new jz5.l("sns_emo_cmt_cnt", java.lang.Integer.valueOf(n17.G0()));
                    lVarArr[18] = new jz5.l("sns_img_cmt_cnt", java.lang.Integer.valueOf(n17.k1()));
                    lVarArr[19] = new jz5.l("sns_yb_retouch", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e.f250227t.b(item));
                    ((cy1.a) rVar).gk(itemView, kz5.c1.k(lVarArr));
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindViewParams", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                android.view.KeyEvent.Callback callback = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.item.IImproveItemInterface");
                tc4.s0 s0Var = (tc4.s0) callback;
                int i27 = i17 + 1;
                boolean f17 = s0Var.f(holder, item, i27);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e.O6(c18232x7592f55e).P6(s0Var);
                p3325xe03a0797.p3326xc267989b.l.d(c18232x7592f55e.m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.w0(this.f250591e, s0Var, holder, item, i27, f17, null), 3, null);
                sb4.z.c(item.n().c1());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.MainUIC", "invalid onBindViewHolder " + holder.f3639x46306858);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.KeyEvent.Callback callback = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.item.IImproveItemInterface");
        tc4.s0 s0Var = (tc4.s0) callback;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e c18232x7592f55e = this.f250591e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18232x7592f55e.O6(c18232x7592f55e).Q6(s0Var);
        s0Var.d();
        p3325xe03a0797.p3326xc267989b.l.d(c18232x7592f55e.m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.x0(s0Var, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
    }
}
