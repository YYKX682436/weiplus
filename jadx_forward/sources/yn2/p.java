package yn2;

/* loaded from: classes2.dex */
public final class p implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn2.r f545535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn2.c f545536b;

    public p(yn2.r rVar, zn2.c cVar) {
        this.f545535a = rVar;
        this.f545536b = cVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        jz5.l[] lVarArr = new jz5.l[4];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = this.f545535a.f545541e;
        if (eVar == null || (str2 = ((xn2.p0) eVar).f537077b) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        lVarArr[1] = new jz5.l("comment_scene", 281);
        zn2.c cVar = this.f545536b;
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(cVar.mo2128x1ed62e84()));
        lVarArr[3] = new jz5.l("session_buffer", cVar.getFeedObject().getFeedObject().m76829x97edf6c0());
        return kz5.c1.k(lVarArr);
    }
}
