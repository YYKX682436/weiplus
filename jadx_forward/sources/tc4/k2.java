package tc4;

/* loaded from: classes4.dex */
public abstract class k2 extends uc4.f1 implements tc4.v3, tc4.u3, tc4.w3, tc4.e, tc4.d, tc4.k3, tc4.s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    private final void O(java.lang.String str) {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        if (!r26.n0.B(str, n17.a1(), false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.k(str, 2);
        int L = L(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.Notify", "unTranslateComment, id:" + str + " position:" + L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18270xf7becf64 m166186x57389c6e = m166186x57389c6e();
        if (m166186x57389c6e != null) {
            m166186x57389c6e.i(L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslateComment", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
    }

    private final void P(java.lang.String str) {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n17.e1(), str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.Notify", "unTranslatePostDesc, id:" + str + '-' + n17.a1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.k(str, 2);
        m166218xc2a45010().j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslatePostDesc", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
    }

    public final int L(java.lang.String str) {
        xc4.p n17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        zc4.b m166188xfb7e5820 = m166188xfb7e5820();
        if (m166188xfb7e5820 == null || (n17 = m166188xfb7e5820.n()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
            return -1;
        }
        java.lang.String str2 = (java.lang.String) r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null).get(1);
        int i17 = 0;
        for (java.lang.Object obj : n17.m175342x57341267()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.e86 e86Var = (r45.e86) obj;
            int i19 = e86Var.f454665m;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((i19 != 0 ? java.lang.Integer.valueOf(i19) : java.lang.Long.valueOf(e86Var.f454670r)).toString(), str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                return i17;
            }
            i17 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateCommentPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return -1;
    }

    public boolean M(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5234x14788364 event) {
        zc4.b m166188xfb7e5820;
        xc4.p n17;
        r45.e86 e86Var;
        xc4.p n18;
        xc4.p n19;
        xc4.p n27;
        xc4.p n28;
        xc4.p n29;
        xc4.p n37;
        xc4.p n38;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeTransCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTranslateListener >> ");
        am.z1 z1Var = event.f135568g;
        sb6.append(z1Var.f90035a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.Notify", sb6.toString());
        java.lang.String str = z1Var.f90035a;
        if (!(str == null || str.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = null;
            if (r26.i0.y(str, "sns_content_", false)) {
                java.lang.String t17 = r26.i0.t(str, "sns_content_", "", false);
                zc4.b m166188xfb7e58202 = m166188xfb7e5820();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((m166188xfb7e58202 == null || (n38 = m166188xfb7e58202.n()) == null || (c17 = n38.c1()) == null) ? null : c17.m70367x7525eefd(), t17)) {
                    P(t17);
                    zc4.b m166188xfb7e58203 = m166188xfb7e5820();
                    if (m166188xfb7e58203 != null && (n37 = m166188xfb7e58203.n()) != null) {
                        c17933xe8d1b226 = n37.c1();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.m(c17933xe8d1b226);
                }
            } else if (r26.i0.y(str, "sns_comment_", false) && (m166188xfb7e5820 = m166188xfb7e5820()) != null && (n17 = m166188xfb7e5820.n()) != null && r26.n0.B(str, n17.a1(), false)) {
                java.lang.String t18 = r26.i0.t(str, "sns_comment_", "", false);
                O(t18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                zc4.b m166188xfb7e58204 = m166188xfb7e5820();
                if (m166188xfb7e58204 == null || (n29 = m166188xfb7e58204.n()) == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                } else {
                    java.lang.String str2 = (java.lang.String) r26.n0.f0(t18, new java.lang.String[]{";"}, false, 0, 6, null).get(1);
                    int i17 = 0;
                    for (java.lang.Object obj : n29.m175342x57341267()) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.e86 e86Var2 = (r45.e86) obj;
                        int i19 = e86Var2.f454665m;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((i19 != 0 ? java.lang.Integer.valueOf(i19) : java.lang.Long.valueOf(e86Var2.f454670r)).toString(), str2)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            e86Var = e86Var2;
                            break;
                        }
                        i17 = i18;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentInfoByStoreId", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                }
                e86Var = null;
                if (e86Var != null) {
                    zc4.b m166188xfb7e58205 = m166188xfb7e5820();
                    if (((m166188xfb7e58205 == null || (n28 = m166188xfb7e58205.n()) == null) ? null : n28.c1()) != null) {
                        zc4.b m166188xfb7e58206 = m166188xfb7e5820();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c18 = (m166188xfb7e58206 == null || (n27 = m166188xfb7e58206.n()) == null) ? null : n27.c1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
                        java.lang.String t07 = ca4.z0.t0(c18.f68891x29d1292e);
                        java.lang.String str3 = e86Var.f454663h;
                        zc4.b m166188xfb7e58207 = m166188xfb7e5820();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c19 = (m166188xfb7e58207 == null || (n19 = m166188xfb7e58207.n()) == null) ? null : n19.c1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19);
                        java.lang.String str4 = c19.f68896xdde069b;
                        zc4.b m166188xfb7e58208 = m166188xfb7e5820();
                        if (m166188xfb7e58208 != null && (n18 = m166188xfb7e58208.n()) != null) {
                            c17933xe8d1b226 = n18.c1();
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17933xe8d1b226);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.l(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1(null, t07, e86Var, null, str3, null, 1, str4, c17933xe8d1b226.m70371x485d7().Id));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeTransCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return false;
    }

    public boolean N(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6106x6983e65d event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unTansCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.gx gxVar = event.f136383g;
        java.lang.String str = gxVar.f88330b;
        int i17 = gxVar.f88329a;
        if (i17 == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            P(str);
        } else if (i17 == 2) {
            O(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTansCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
        return false;
    }
}
