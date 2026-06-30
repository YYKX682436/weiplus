package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.y f276634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f276636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f276637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f276638h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f276639i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f276640m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f276641n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f276642o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f276643p;

    public m0(com.p314xaae8f345.mm.p2621x8fb0427b.y yVar, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        this.f276634d = yVar;
        this.f276635e = i17;
        this.f276636f = i18;
        this.f276637g = i19;
        this.f276638h = i27;
        this.f276639i = i28;
        this.f276640m = i29;
        this.f276641n = i37;
        this.f276642o = i38;
        this.f276643p = i39;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        dw5.h m17 = a1Var.m();
        long j17 = m17 != null ? m17.f325894d : 0L;
        long i17 = a1Var.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report36986. boxActType:");
        com.p314xaae8f345.mm.p2621x8fb0427b.y yVar = this.f276634d;
        sb6.append(yVar);
        sb6.append(", reddotActType:");
        com.p314xaae8f345.mm.p2621x8fb0427b.d0.f275359e.getClass();
        java.util.Map map = com.p314xaae8f345.mm.p2621x8fb0427b.d0.f275360f;
        int i18 = this.f276635e;
        com.p314xaae8f345.mm.p2621x8fb0427b.d0 d0Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d0) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i18));
        if (d0Var == null) {
            d0Var = com.p314xaae8f345.mm.p2621x8fb0427b.d0.f275361g;
        }
        sb6.append(d0Var);
        sb6.append(", prePos:");
        int i19 = this.f276636f;
        sb6.append(i19);
        sb6.append(", newPos:");
        int i27 = this.f276637g;
        sb6.append(i27);
        sb6.append(", reddotReason:");
        com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275429e.getClass();
        java.util.Map map2 = com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275430f;
        int i28 = this.f276638h;
        com.p314xaae8f345.mm.p2621x8fb0427b.f0 f0Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f0) ((java.util.LinkedHashMap) map2).get(java.lang.Integer.valueOf(i28));
        if (f0Var == null) {
            f0Var = com.p314xaae8f345.mm.p2621x8fb0427b.f0.f275437p;
        }
        sb6.append(f0Var);
        sb6.append(", boxPositionChangeReason:");
        com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275239e.getClass();
        java.util.Map map3 = com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275240f;
        int i29 = this.f276639i;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a0) ((java.util.LinkedHashMap) map3).get(java.lang.Integer.valueOf(i29));
        if (a0Var == null) {
            a0Var = com.p314xaae8f345.mm.p2621x8fb0427b.a0.f275246o;
        }
        sb6.append(a0Var);
        sb6.append(", appStatus:");
        int i37 = this.f276640m;
        sb6.append(i37);
        sb6.append(", isBoxInScreen:");
        int i38 = this.f276641n;
        sb6.append(i38);
        sb6.append(", isInChat:");
        int i39 = this.f276642o;
        sb6.append(i39);
        sb6.append(", boxCntInScreen:");
        int i47 = this.f276643p;
        sb6.append(i47);
        sb6.append(", activeId:");
        sb6.append(j17);
        sb6.append(", msgRecordID:");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(36986, java.lang.Integer.valueOf(yVar.f277878d), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(i17));
    }
}
