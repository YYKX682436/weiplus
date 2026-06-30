package tc4;

/* loaded from: classes4.dex */
public final class m0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f498939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f498940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc4.p f498941c;

    public m0(tc4.n0 n0Var, r45.kv2 kv2Var, xc4.p pVar) {
        this.f498939a = n0Var;
        this.f498940b = kv2Var;
        this.f498941c = pVar;
    }

    @Override // ym5.n0
    /* renamed from: getExposedId */
    public long mo55681x18a217a5(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        long hashCode = java.lang.Long.hashCode(this.f498941c.y0()) + view.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getExposedId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        return hashCode;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        java.lang.String str;
        xc4.p n17;
        xc4.p n18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        str = "";
        xc4.p pVar = this.f498941c;
        r45.kv2 kv2Var = this.f498940b;
        tc4.n0 n0Var = this.f498939a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isVideoPlayStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            boolean z18 = n0Var.G1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isVideoPlayStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            if (!z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var.K1 = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                tc4.n0.Z(n0Var, 0L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var.I1 = 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                long c17 = c01.id.c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                n0Var.H1 = c17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.F1 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            ((vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class))).Bi(pm0.v.Z(kv2Var.m75945x2fec8307(0)), kv2Var.m75945x2fec8307(8), 37, null, n0Var.getContext(), false, null);
            java.lang.String m125483x6bf53a6c = pVar.m125483x6bf53a6c();
            zc4.b m166188xfb7e5820 = n0Var.m166188xfb7e5820();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = (m166188xfb7e5820 == null || (n18 = m166188xfb7e5820.n()) == null) ? null : n18.h1();
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.m0.f206653d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m125483x6bf53a6c);
            java.lang.String m75945x2fec8307 = kv2Var.m75945x2fec8307(0);
            java.lang.String str2 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
            int m75939xb282bd08 = kv2Var.m75939xb282bd08(29);
            long j19 = h17 != null ? h17.f39015xc86e6609 : 0L;
            fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
            zc4.b m166188xfb7e58202 = n0Var.m166188xfb7e5820();
            if (m166188xfb7e58202 != null && (n17 = m166188xfb7e58202.n()) != null) {
                str = n17.W0();
            }
            java.lang.String Di = ((ee0.v4) o4Var).Di(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Di, "getSnsPublishId(...)");
            m0Var.c(3, 1, m125483x6bf53a6c, null, str2, m75939xb282bd08, m125483x6bf53a6c, null, j19, Di);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("expose end ");
            zy2.g5 V = tc4.n0.V(n0Var);
            sb6.append(V != null ? java.lang.Boolean.valueOf(V.mo58787xc00617a4()) : null);
            n0Var.x("MicroMsg.Improve.FinderMediaTimelineItem", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            n0Var.F1 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setExposeStart$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            if (tc4.n0.V(n0Var) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                long j27 = n0Var.K1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                if (j27 != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    long j28 = n0Var.J1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    long c18 = c01.id.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    long j29 = n0Var.K1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getStartPlayMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                    tc4.n0.Z(n0Var, j28 + (c18 - j29));
                }
            }
            long c19 = c01.id.c();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[11];
            lVarArr[0] = new jz5.l("view_id", "sns_finder_feed_card");
            lVarArr[1] = new jz5.l("enter_publishid", tc4.n0.W(n0Var));
            java.lang.String m75945x2fec83072 = kv2Var.m75945x2fec8307(0);
            lVarArr[2] = new jz5.l("feed_id", m75945x2fec83072 != null ? m75945x2fec83072 : "");
            lVarArr[3] = new jz5.l("source_username", pVar.m125483x6bf53a6c());
            lVarArr[4] = new jz5.l("source_commentscene", java.lang.Integer.valueOf(kv2Var.m75939xb282bd08(29)));
            lVarArr[5] = new jz5.l("share_username", pVar.m125483x6bf53a6c());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j37 = n0Var.J1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[6] = new jz5.l("play_time", java.lang.Long.valueOf(j37));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j38 = n0Var.H1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[7] = new jz5.l("expose_time_ms", java.lang.Long.valueOf(c19 - j38));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j39 = n0Var.I1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getClickTimeStampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[8] = new jz5.l("click_timestamp", java.lang.Long.valueOf(j39));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            long j47 = n0Var.H1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getBeginTimestampMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            lVarArr[9] = new jz5.l("begin_timestamp", java.lang.Long.valueOf(j47));
            lVarArr[10] = new jz5.l("end_timestamp", java.lang.Long.valueOf(c19));
            ((cy1.a) rVar).Cj("view_unexp", view, kz5.c1.k(lVarArr), 25496);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$viewExposeReport$1");
    }
}
