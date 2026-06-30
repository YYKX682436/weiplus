package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class x1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1 f204021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f204022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 f204023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f204024d;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1 y1Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var, int i17) {
        this.f204021a = y1Var;
        this.f204022b = s0Var;
        this.f204023c = z1Var;
        this.f204024d = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.vx0 vx0Var;
        r45.do2 do2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.y1 y1Var = this.f204021a;
        y1Var.getClass();
        android.content.Context context = this.f204022b.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        lz5.m mVar = new lz5.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.z1 z1Var = this.f204023c;
        mVar.put("source_feedid", pm0.v.u(z1Var.f204042e));
        mVar.put("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(z1Var.getFeedObject().getFeedObject().m76784x5db1b11(), z1Var.w(), V6.m75939xb282bd08(5)));
        mVar.put("finder_tab_context_id", V6.m75945x2fec8307(2));
        mVar.put("finder_context_id", V6.m75945x2fec8307(1));
        mVar.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(this.f204024d));
        mVar.put("feed_id", pm0.v.u(z1Var.getFeedObject().getFeedObject().m76784x5db1b11()));
        mVar.put("author_finder_username", z1Var.getFeedObject().m59299x6bf53a6c());
        r45.dm2 m76806xdef68064 = z1Var.getFeedObject().getFeedObject().m76806xdef68064();
        boolean z17 = y1Var.f204034h;
        if (m76806xdef68064 != null && (do2Var = (r45.do2) m76806xdef68064.m75936x14adae67(39)) != null) {
            nr2.m mVar2 = new nr2.m(do2Var);
            mVar.put("comment_scene", java.lang.Integer.valueOf(z17 ? 345 : 344));
            mVar.put("collection_feed_num", java.lang.Integer.valueOf(mVar2.f()));
            mVar.put("is_intelligent_collection", 0);
            mVar.put("collection_id", pm0.v.u(mVar2.l()));
            return mVar;
        }
        r45.dm2 m76806xdef680642 = z1Var.getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef680642 == null || (vx0Var = (r45.vx0) m76806xdef680642.m75936x14adae67(0)) == null) {
            kz5.b1.b(mVar);
            return null;
        }
        mVar.put("comment_scene", java.lang.Integer.valueOf(z17 ? yc1.p.f77525x366c91de : yc1.a0.f77515x366c91de));
        mVar.put("collection_feed_num", java.lang.Integer.valueOf(vx0Var.m75939xb282bd08(4)));
        mVar.put("is_intelligent_collection", java.lang.Integer.valueOf(hc2.q.b(vx0Var) ? 1 : 0));
        mVar.put("collection_id", pm0.v.u(vx0Var.m75942xfb822ef2(0)));
        return mVar;
    }
}
