package vb5;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb5.l f516385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e f516386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f516387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vb5.l lVar, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e eVar, boolean z17) {
        super(0);
        this.f516385d = lVar;
        this.f516386e = eVar;
        this.f516387f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vb5.l lVar = this.f516385d;
        lVar.f280113d.b0();
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.e eVar = this.f516386e;
        boolean z17 = this.f516387f;
        java.lang.String x17 = lVar.f280113d.x();
        long j17 = lVar.f516391g;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.T4(x17) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(x17)) {
            boolean z18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ej) ((sb5.p1) lVar.f280113d.f542241c.a(sb5.p1.class))).f280510e;
            java.lang.String str = lVar.f516389e;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pauseTipsBar in RecordSelect");
                lVar.q0();
            } else {
                try {
                    if (lVar.f280113d.i() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "prepareDataAndCommit getDataScope == null err");
                    } else {
                        yb5.q v17 = lVar.f280113d.v();
                        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a i17 = lVar.f280113d.i();
                        if (i17 != null) {
                            v65.i.b(i17, null, new vb5.f(lVar, v17, j17, eVar, z17, null), 1, null);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "", new java.lang.Object[0]);
                }
            }
        } else {
            lVar.n0();
            lVar.p0(z17);
        }
        return jz5.f0.f384359a;
    }
}
