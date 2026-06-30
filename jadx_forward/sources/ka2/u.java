package ka2;

/* loaded from: classes10.dex */
public final class u implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 f387582a;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4) {
        this.f387582a = activityC13659x4f0951e4;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = this.f387582a;
        r45.gd1 gd1Var = activityC13659x4f0951e4.G;
        lVarArr[0] = new jz5.l("poiid", gd1Var != null ? gd1Var.m75945x2fec8307(4) : null);
        lVarArr[1] = new jz5.l("finder_post_sessionid", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.c7(activityC13659x4f0951e4));
        lVarArr[2] = new jz5.l("poi_search_type", java.lang.Integer.valueOf(activityC13659x4f0951e4.f7() ? 1 : 0));
        return kz5.c1.k(lVarArr);
    }
}
