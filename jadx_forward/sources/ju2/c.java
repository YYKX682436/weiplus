package ju2;

/* loaded from: classes2.dex */
public final class c implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f383342a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f383342a = abstractC14490x69736cb5;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f383342a;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76793xbd916e4b = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76793xbd916e4b();
        java.lang.String g07 = m76793xbd916e4b != null ? kz5.n0.g0(m76793xbd916e4b, "#", null, null, 0, null, ju2.b.f383341d, 30, null) : null;
        jz5.l[] lVarArr = new jz5.l[4];
        nv2.o oVar = nv2.o.f422091e;
        lVarArr[0] = new jz5.l("finger_like_cnt", java.lang.Integer.valueOf(nv2.o.f422091e.b(abstractC14490x69736cb5.getFeedObject().getFeedObject())));
        nv2.h1 h1Var = nv2.n1.f422083g;
        lVarArr[1] = new jz5.l("like_cnt", java.lang.Integer.valueOf(nv2.n1.f422084h.l(abstractC14490x69736cb5.getFeedObject().getFeedObject())));
        if (g07 == null) {
            g07 = "";
        }
        lVarArr[2] = new jz5.l("thx_to_uin", g07);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        return kz5.c1.l(lVarArr);
    }
}
