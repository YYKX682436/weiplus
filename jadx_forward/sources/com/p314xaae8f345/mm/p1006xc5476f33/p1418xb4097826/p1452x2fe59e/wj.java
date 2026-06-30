package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class wj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f192521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f192522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f192523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f192524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f192525h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(so2.u1 u1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, in5.s0 s0Var, yz5.a aVar) {
        super(0);
        this.f192521d = u1Var;
        this.f192522e = xjVar;
        this.f192523f = c14989xf862ae88;
        this.f192524g = s0Var;
        this.f192525h = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        r45.rz0 rz0Var;
        r45.dm2 m76806xdef68064 = this.f192521d.getFeedObject().m59240x7c94657b().m76806xdef68064();
        int m75939xb282bd08 = (m76806xdef68064 == null || (rz0Var = (r45.rz0) m76806xdef68064.m75936x14adae67(38)) == null) ? 0 : rz0Var.m75939xb282bd08(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar = this.f192522e;
        int i17 = xjVar.f192605a.getResources().getConfiguration().orientation == 2 ? 2 : 1;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = xjVar.f192605a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        long mo2128x1ed62e84 = ((so2.j5) this.f192524g.f374658i).mo2128x1ed62e84();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 feedData = this.f192523f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedData, "feedData");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[8];
        if (V6 == null || (str = V6.m75945x2fec8307(2)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (V6 == null || (str2 = V6.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : "");
        lVarArr[3] = new jz5.l("feedid", pm0.v.u(feedData.m59127x5db1b11()));
        lVarArr[4] = new jz5.l("screen_type", java.lang.Integer.valueOf(i17));
        lVarArr[5] = new jz5.l("last_completed_feedid", pm0.v.u(mo2128x1ed62e84));
        lVarArr[6] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(m75939xb282bd08));
        java.lang.String sessionBuffer = feedData.getSessionBuffer();
        lVarArr[7] = new jz5.l("session_buffer", sessionBuffer != null ? sessionBuffer : "");
        ((cy1.a) rVar).yj("autoplay_next_feed", null, kz5.c1.k(lVarArr), 1, true);
        this.f192525h.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
