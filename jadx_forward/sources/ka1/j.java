package ka1;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f387533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f387534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f387535c;

    /* renamed from: d, reason: collision with root package name */
    public int f387536d;

    /* renamed from: e, reason: collision with root package name */
    public int f387537e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 f387538f;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 t1Var) {
        this.f387533a = c12567x34ba321.f169668e;
        this.f387535c = c12567x34ba321.f169669f;
        this.f387534b = c12567x34ba321.f169672i;
        this.f387538f = t1Var;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 t1Var = this.f387538f;
        if (t1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p1 p1Var = t1Var.f169861c;
        if (p1Var != null) {
            this.f387536d = p1Var.ordinal();
        } else {
            this.f387536d = 0;
        }
        this.f387537e = t1Var.f169870l;
        int i17 = this.f387535c;
        int i18 = this.f387534b;
        if (z17) {
            if (t1Var != null) {
                int i19 = t1Var.f169869k;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String str = this.f387533a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f387536d);
                int i27 = t1Var.f169871m;
                g0Var.d(14959, str, valueOf, valueOf2, valueOf3, 2, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f387537e));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportCpu cpu = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f387537e), java.lang.Integer.valueOf(this.f387536d));
            }
            if (t1Var != null) {
                int i28 = t1Var.f169869k;
                int i29 = t1Var.f169867i;
                int i37 = t1Var.f169868j;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.d(14959, this.f387533a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f387536d), 3, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f387537e));
                java.lang.String str2 = this.f387533a;
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i18);
                java.lang.Integer valueOf5 = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf6 = java.lang.Integer.valueOf(this.f387536d);
                int i38 = t1Var.f169865g;
                g0Var2.d(14959, str2, valueOf4, valueOf5, valueOf6, 101, java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f387537e));
                java.lang.String str3 = this.f387533a;
                java.lang.Integer valueOf7 = java.lang.Integer.valueOf(i18);
                java.lang.Integer valueOf8 = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf9 = java.lang.Integer.valueOf(this.f387536d);
                int i39 = t1Var.f169866h;
                g0Var2.d(14959, str3, valueOf7, valueOf8, valueOf9, 102, java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f387537e));
                g0Var2.d(14959, this.f387533a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f387536d), 104, java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f387537e));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportMemory pid = [%d] native = [%d] dalvik = [%d] delta = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f387537e), java.lang.Integer.valueOf(this.f387536d));
            }
        }
        if (t1Var == null) {
            return;
        }
        int i47 = t1Var.f169869k;
        int i48 = t1Var.f169859a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var3.d(14959, this.f387533a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f387536d), 1, java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f387537e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportFps fps = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f387537e), java.lang.Integer.valueOf(this.f387536d));
        int i49 = (int) t1Var.f169860b;
        if (i49 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Kv_14959", "variance == -1!");
        } else {
            g0Var3.d(14959, this.f387533a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f387536d), 105, java.lang.Integer.valueOf(i49), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f387537e));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportFps variance fps = [%d] eventid: [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i49), 105, java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f387537e), java.lang.Integer.valueOf(this.f387536d));
        }
    }
}
