package sc2;

/* loaded from: classes.dex */
public final class q implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f487688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f487689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f487690c;

    public q(long j17, java.lang.Object obj, r45.qt2 qt2Var) {
        this.f487688a = j17;
        this.f487689b = obj;
        this.f487690c = qt2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(this.f487688a));
        lVarArr[1] = new jz5.l("report_extra_data", this.f487689b);
        r45.qt2 qt2Var = this.f487690c;
        lVarArr[2] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
        lVarArr[3] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
        lVarArr[4] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
        return kz5.c1.k(lVarArr);
    }
}
