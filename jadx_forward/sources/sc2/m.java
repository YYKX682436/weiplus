package sc2;

/* loaded from: classes2.dex */
public final class m implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.n f487593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f487594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f487595c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f487596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f487597e;

    public m(sc2.n nVar, long j17, boolean z17, java.lang.Object obj, r45.qt2 qt2Var) {
        this.f487593a = nVar;
        this.f487594b = j17;
        this.f487595c = z17;
        this.f487596d = obj;
        this.f487597e = qt2Var;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        sc2.n nVar = this.f487593a;
        xc2.p0 p0Var = nVar.f84680h;
        boolean z17 = (p0Var == null || (c19786x6a1e28622 = p0Var.f534767a) == null || c19786x6a1e28622.m76516x2a6227ad() != 1) ? false : true;
        java.lang.Object obj = this.f487596d;
        long j18 = this.f487594b;
        if (z17) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j18));
            lVarArr[1] = new jz5.l("get_red_button_type", java.lang.Integer.valueOf(this.f487595c ? 2 : 1));
            lVarArr[2] = new jz5.l("report_extra_data", obj);
            ((cy1.a) rVar).Cj("get_red_button", str, kz5.c1.k(lVarArr), 25496);
            return;
        }
        xc2.p0 p0Var2 = nVar.f84680h;
        if ((p0Var2 == null || (c19786x6a1e2862 = p0Var2.f534767a) == null || (m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0()) == null || m76506x42318aa0.m77224x4236b52c() != 50) ? false : true) {
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr2 = new jz5.l[5];
            r45.qt2 qt2Var = this.f487597e;
            lVarArr2[0] = new jz5.l("finder_tab_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(2) : null);
            lVarArr2[1] = new jz5.l("finder_context_id", qt2Var != null ? qt2Var.m75945x2fec8307(1) : null);
            lVarArr2[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null);
            lVarArr2[3] = new jz5.l("feed_id", pm0.v.u(j18));
            lVarArr2[4] = new jz5.l("report_extra_data", obj);
            ((cy1.a) rVar2).Cj("finder_set_state", str, kz5.c1.k(lVarArr2), 25496);
        }
    }
}
