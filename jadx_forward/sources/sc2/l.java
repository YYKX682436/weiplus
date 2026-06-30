package sc2;

/* loaded from: classes2.dex */
public final class l implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f487562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f487563b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f487565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f487566e;

    public l(r45.qt2 qt2Var, long j17, xc2.p0 p0Var, java.lang.Object obj, boolean z17) {
        this.f487562a = qt2Var;
        this.f487563b = j17;
        this.f487564c = p0Var;
        this.f487565d = obj;
        this.f487566e = z17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[7];
        r45.qt2 qt2Var = this.f487562a;
        lVarArr[0] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[1] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(this.f487563b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487564c.f534777f;
        lVarArr[4] = new jz5.l("session_buffer", abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.g0() : null);
        lVarArr[5] = new jz5.l("biz_bypass_data", this.f487565d);
        lVarArr[6] = new jz5.l("button_status", java.lang.Boolean.valueOf(this.f487566e));
        return kz5.c1.k(lVarArr);
    }
}
