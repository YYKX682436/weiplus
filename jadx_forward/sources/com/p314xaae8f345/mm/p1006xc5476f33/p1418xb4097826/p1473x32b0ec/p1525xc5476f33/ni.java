package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ni extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f195167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi f195168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(ya2.b2 b2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi oiVar) {
        super(0);
        this.f195167d = b2Var;
        this.f195168e = oiVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.u74 u74Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oi oiVar = this.f195168e;
        ya2.b2 b2Var = this.f195167d;
        if (b2Var != null) {
            boolean f17 = hc2.s.f(b2Var);
            boolean a17 = hc2.s.a(b2Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFollowGuidePlugin", "liveFollowGuideQuitBtnTv click, nickName:" + b2Var.w0() + ", isPrivate:" + f17 + " , isBlock" + a17);
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.yb ybVar = (c61.yb) c17;
            android.content.Context context = oiVar.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
            java.lang.String D0 = b2Var.D0();
            long j17 = ((mm2.e1) oiVar.P0(mm2.e1.class)).f410516m;
            dk2.xf W0 = oiVar.W0();
            r45.o72 K = W0 != null ? ((dk2.r4) W0).K(((mm2.e1) oiVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0)) : null;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g h17 = pm0.b0.h(((mm2.e1) oiVar.P0(mm2.e1.class)).f410518o);
            r45.v74 v74Var = ((mm2.e1) oiVar.P0(mm2.e1.class)).f410513g;
            c61.yb.R8(ybVar, V6, D0, 1, j17, f17, null, K, 3, null, h17, (v74Var == null || (u74Var = (r45.u74) v74Var.m75936x14adae67(2)) == null) ? null : u74Var.m75934xbce7f2f(0), null, null, 6432, null);
            android.view.ViewGroup viewGroup = oiVar.f446856d;
            db5.t7.h(viewGroup.getContext(), viewGroup.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573807fw4));
            if (a17) {
                java.lang.String D02 = b2Var.D0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFollowGuidePlugin", "[doBlockOpLog] ");
                oiVar.f195290q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ei();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.j9.b(ya2.r.f542058a, D02, false, null, null, oiVar.f195290q, 12, null);
            }
        }
        oiVar.K0(8);
        oiVar.f195289p.mo46557x60d69242(qo0.b.E4, null);
        i95.m c18 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.T8((zy2.zb) c18, ml2.t1.f409484h, null, null, null, null, null, false, 126, null);
        return jz5.f0.f384359a;
    }
}
