package dw2;

/* loaded from: classes2.dex */
public final class q implements cw2.ea {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 f325690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f325691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f325692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f325693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f325694h;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 c15204x9dd9b8b0, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f325690d = c15204x9dd9b8b0;
        this.f325691e = j17;
        this.f325692f = c15196x85976f5f;
        this.f325693g = k3Var;
        this.f325694h = abstractC14490x69736cb5;
    }

    /* renamed from: equals */
    public boolean m126342xb2c87fbf(java.lang.Object obj) {
        return true;
    }

    /* renamed from: hashCode */
    public int m126343x8cdac1b() {
        return m126343x8cdac1b();
    }

    @Override // cw2.ea
    /* renamed from: onVideoPause */
    public void mo1057x65d3157a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0 a76;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.Long l17 = (java.lang.Long) this.f325690d.f212298o.remove(java.lang.Long.valueOf(this.f325691e));
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        if (longValue == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onVideoPause] autoplay_duration=");
        long j17 = currentTimeMillis - longValue;
        sb6.append(j17);
        sb6.append("ms ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f325692f;
        sb6.append(c15196x85976f5f.m61471xe56ce956());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MultiFlowVideoAutoPlayManager", sb6.toString());
        android.content.Context context = c15196x85976f5f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 qt2Var = (nyVar == null || (a76 = nyVar.a7(-1)) == null) ? null : a76.f206817h;
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = this.f325693g.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("view_id", "care_feed_card");
        lVarArr[1] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[2] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[3] = new jz5.l("behaviour_session_id", qt2Var != null ? qt2Var.m75945x2fec8307(0) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f325694h;
        lVarArr[5] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        lVarArr[6] = new jz5.l("autoplay_duration", java.lang.Long.valueOf(j17));
        ((cy1.a) rVar).Cj("exit_autoplay", view, kz5.c1.k(lVarArr), 25496);
    }

    @Override // cw2.ea
    /* renamed from: onVideoPlay */
    public void mo1058x4d9b9b30() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1653x55cdf963.C15204x9dd9b8b0 c15204x9dd9b8b0 = this.f325690d;
        java.util.HashMap hashMap = c15204x9dd9b8b0.f212298o;
        long j17 = this.f325691e;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MultiFlowVideoAutoPlayManager", "[onVideoPlay] " + this.f325692f.m61471xe56ce956());
        c15204x9dd9b8b0.f212298o.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    @Override // cw2.ea
    public void p4(long j17, long j18) {
    }
}
