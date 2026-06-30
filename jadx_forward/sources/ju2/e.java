package ju2;

/* loaded from: classes2.dex */
public final class e implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f383346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f383347b;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        this.f383346a = abstractC14490x69736cb5;
        this.f383347b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f383346a;
        lVarArr[0] = new jz5.l("like_cnt", java.lang.Integer.valueOf(n1Var.l(abstractC14490x69736cb5.getFeedObject().getFeedObject())));
        java.lang.String str2 = this.f383347b;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("recom_uin", str2);
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        return kz5.c1.l(lVarArr);
    }
}
