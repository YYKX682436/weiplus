package db2;

/* loaded from: classes2.dex */
public final class i6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final int f309551g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f309552h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309553i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309554m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309555n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(int i17, java.util.List extStats, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        this.f309551g = i17;
        this.f309552h = extStats;
        this.f309553i = "Finder.NetSceneReportScreenShot";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6681;
        r45.m21 m21Var = new r45.m21();
        db2.t4 t4Var = db2.t4.f309704a;
        m21Var.set(4, t4Var.a(6681));
        m21Var.set(1, xy2.c.f(qt2Var));
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.m75941xfb821914(3).addAll(extStats);
        r45.kv0 kv0Var = (r45.kv0) m21Var.m75936x14adae67(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(jn0Var.m75942xfb822ef2(0)), jn0Var.m75945x2fec8307(12)));
        }
        t4Var.h(kv0Var, null, arrayList);
        lVar.f152197a = m21Var;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f152198b = n21Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        this.f309554m = lVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = this.f309552h.iterator();
        while (it6.hasNext()) {
            sb6.append(pm0.v.u(((r45.jn0) it6.next()).m75942xfb822ef2(0)));
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309553i, "NetSceneReportScreenShot start " + this.f309551g + ", " + ((java.lang.Object) sb6));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309553i, "onGYNetEnd " + i17 + ' ' + i18 + ' ' + i19 + ' ' + str + ' ');
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309555n;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309555n = u0Var;
        return mo9409x10f9447a(sVar, this.f309554m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6681;
    }
}
