package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class vd implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.hr2 f186314c;

    public vd(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.hr2 hr2Var) {
        this.f186312a = s0Var;
        this.f186313b = abstractC14490x69736cb5;
        this.f186314c = hr2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        in5.s0 s0Var = this.f186312a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        cw2.da videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.qt2 d17 = xy2.c.d(context);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("video_progress", java.lang.Long.valueOf(c15188xd8bd4bd != null ? c15188xd8bd4bd.mo56685x3d7f3f1d() : 0L));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f186313b;
        lVarArr[1] = new jz5.l("videodurations", c15188xd8bd4bd != null ? java.lang.Long.valueOf(c15188xd8bd4bd.mo56695x7723e6ff()) : java.lang.Integer.valueOf(abstractC14490x69736cb5.getFeedObject().m59300x36bbd779() * 1000));
        r45.hr2 hr2Var = this.f186314c;
        lVarArr[2] = new jz5.l("keyword", hr2Var != null ? hr2Var.m75945x2fec8307(0) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", d17 != null ? d17.m75945x2fec8307(2) : null);
        lVarArr[4] = new jz5.l("finder_context_id", d17 != null ? d17.m75945x2fec8307(1) : null);
        lVarArr[5] = new jz5.l("comment_scene", d17 != null ? java.lang.Integer.valueOf(d17.m75939xb282bd08(5)) : null);
        lVarArr[6] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[7] = new jz5.l("jump_progress", java.lang.Integer.valueOf((hr2Var != null ? hr2Var.m75939xb282bd08(1) : 0) * 1000));
        return kz5.c1.k(lVarArr);
    }
}
