package sc2;

/* loaded from: classes2.dex */
public final class s3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f487764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.u3 f487765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f487767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f487768e;

    public s3(long j17, sc2.u3 u3Var, xc2.p0 p0Var, java.lang.Object obj, r45.qt2 qt2Var) {
        this.f487764a = j17;
        this.f487765b = u3Var;
        this.f487766c = p0Var;
        this.f487767d = obj;
        this.f487768e = qt2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(this.f487764a));
        android.util.ArrayMap arrayMap = this.f487765b.C;
        xc2.p0 p0Var = this.f487766c;
        lVarArr[1] = new jz5.l("getredbuttontype", java.lang.Integer.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(arrayMap.get(p0Var.f534767a.m76502xdae6f030()), java.lang.Boolean.TRUE) ? 2 : 1));
        lVarArr[2] = new jz5.l("feed_report_extra_data", this.f487767d);
        r45.qt2 qt2Var = this.f487768e;
        lVarArr[3] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[4] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[5] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        java.lang.String m76517xcb1f2fa3 = p0Var.f534767a.m76517xcb1f2fa3();
        if (m76517xcb1f2fa3 == null) {
            m76517xcb1f2fa3 = "";
        }
        lVarArr[6] = new jz5.l("component_report_info", m76517xcb1f2fa3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var.f534777f;
        lVarArr[7] = new jz5.l("session_buffer", abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.g0() : "");
        return kz5.c1.k(lVarArr);
    }
}
