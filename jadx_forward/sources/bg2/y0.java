package bg2;

/* loaded from: classes3.dex */
public final class y0 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102192e = "LiveConvertExptReportController";
    }

    public final void Y6(long j17, long j18, java.lang.String componentExtra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(componentExtra, "componentExtra");
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        if (s0Var == null || abstractC14490x69736cb5 == null) {
            return;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216913n) : null);
        zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        java.lang.String str = Sj2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj2).f216915p : null;
        java.lang.String u17 = pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        java.lang.String u18 = pm0.v.u(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L);
        long c17 = c01.id.c();
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        long j19 = (c17 - (d2Var != null ? d2Var.f101555u : 0L)) - j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102192e, "reportUIExposeCostTime componentType:" + j17 + ", totalDelay:" + j18 + ", cost:" + j19 + ", componentExtra:" + componentExtra);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6538xb7fd38e7 c6538xb7fd38e7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6538xb7fd38e7();
        c6538xb7fd38e7.f138937d = c6538xb7fd38e7.b("CommentScene", valueOf, true);
        c6538xb7fd38e7.f138938e = c6538xb7fd38e7.b("ContextID", str, true);
        c6538xb7fd38e7.f138939f = c6538xb7fd38e7.b("FeedID", u17, true);
        c6538xb7fd38e7.f138940g = c6538xb7fd38e7.b("LiveID", u18, true);
        c6538xb7fd38e7.f138941h = j17;
        c6538xb7fd38e7.f138942i = j19;
        c6538xb7fd38e7.f138943j = c6538xb7fd38e7.b("ComponentExtra", componentExtra, true);
        c6538xb7fd38e7.k();
    }
}
