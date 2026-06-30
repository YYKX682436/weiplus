package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class sj implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl f217439b;

    public sj(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar) {
        this.f217438a = view;
        this.f217439b = blVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Context context = this.f217438a.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6();
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = this.f217439b;
        in5.c Lj = ((c61.l7) b6Var).Lj(blVar.m158354x19263085());
        long mo2128x1ed62e84 = Lj != null ? Lj.mo2128x1ed62e84() : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = java.lang.Long.valueOf(mo2128x1ed62e84) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) java.lang.Long.valueOf(mo2128x1ed62e84) : null;
        java.lang.String w17 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
        android.app.Activity context2 = blVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(mo2128x1ed62e84, w17, m75939xb282bd08);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionBarUIC", "[personalCenter] refFeedId:" + pm0.v.u(mo2128x1ed62e84) + " refCommentScene:" + m75939xb282bd08);
        return kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("behaviour_session_id", V6.m75945x2fec8307(0)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("extra_info", V6.m75945x2fec8307(11)), new jz5.l("enter_source_info", V6.m75945x2fec8307(12)), new jz5.l("source_feedid", pm0.v.u(mo2128x1ed62e84)), new jz5.l("source_feed_commentScene", java.lang.Integer.valueOf(m75939xb282bd08)), new jz5.l("source_feed_sessionbuffer", ek6));
    }
}
