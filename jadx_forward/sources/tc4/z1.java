package tc4;

/* loaded from: classes4.dex */
public abstract class z1 extends tc4.m2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ym5.a1.h(this, new tc4.y1(this));
    }

    @Override // tc4.i2, tc4.s0
    public boolean f(in5.s0 holder, zc4.b item, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("measure", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        xc4.p n17 = item.n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 i18 = n17.i1();
        r45.qb6 j17 = n17.j1();
        java.lang.String m125483x6bf53a6c = n17.m125483x6bf53a6c();
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addWsFoldExposeStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (i18 != null && j17 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6910x5b7ce9c c6910x5b7ce9c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6910x5b7ce9c();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            c6910x5b7ce9c.f142272d = c6910x5b7ce9c.b("SessionId", v52.c.g().d(), true);
            c6910x5b7ce9c.f142273e = c6910x5b7ce9c.b("FoldedBlockId", ca4.z0.s0(i18.f69422x861009b5), true);
            c6910x5b7ce9c.f142276h = 2;
            c6910x5b7ce9c.f142277i = 2;
            c6910x5b7ce9c.f142274f = c6910x5b7ce9c.b("UserName", m125483x6bf53a6c, true);
            c6910x5b7ce9c.f142280l = pc4.d.f434943a.F() ? 2L : 1L;
            if (j17.f465343d != null) {
                c6910x5b7ce9c.f142275g = r2.size();
            }
            ((java.util.concurrent.ConcurrentHashMap) s0Var.Y).put(java.lang.Long.valueOf(i18.f69422x861009b5), c6910x5b7ce9c);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addWsFoldExposeStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        boolean f17 = super.f(holder, item, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("measure", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemExpose");
        return f17;
    }
}
