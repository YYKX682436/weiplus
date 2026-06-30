package db2;

/* loaded from: classes2.dex */
public final class g5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309522g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309523h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309524i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.m21 f309525m;

    /* renamed from: n, reason: collision with root package name */
    public cz2.f f309526n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g5(r45.qt2 qt2Var, int i17, r45.jn0 extStats, java.lang.String str) {
        this(qt2Var, i17, kz5.c0.d(extStats), str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309522g, "onGYNetEnd " + i17 + ' ' + i18 + ' ' + i19 + ' ' + str + ' ');
        if (i18 >= 4) {
            this.f309526n = cz2.f.f306535d;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309524i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309524i = u0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doExtStatsReport actionType=");
        r45.m21 m21Var = this.f309525m;
        sb6.append(m21Var.m75939xb282bd08(2));
        sb6.append(", scene=");
        r45.kv0 kv0Var = (r45.kv0) m21Var.m75936x14adae67(4);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(1)) : null);
        sb6.append(" extList=");
        java.util.LinkedList<r45.jn0> m75941xfb821914 = m21Var.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getExtStats(...)");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (r45.jn0 jn0Var : m75941xfb821914) {
            stringBuffer.append("[feedActionValue=" + jn0Var.m75945x2fec8307(3) + " objectId=" + pm0.v.u(jn0Var.m75942xfb822ef2(0)) + " func_msg_report_ext_info=" + jn0Var.m75945x2fec8307(10) + "];");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        sb6.append(stringBuffer2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309522g, sb6.toString());
        return mo9409x10f9447a(sVar, this.f309523h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6681;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return this.f309526n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(r45.qt2 qt2Var, int i17, java.util.List extStats, java.lang.String str) {
        super(qt2Var);
        r45.kv0 kv0Var;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        this.f309522g = "Finder.NetSceneExtStatsReport";
        this.f309526n = cz2.f.f306537f;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6681;
        r45.m21 m21Var = new r45.m21();
        m21Var.set(1, xy2.c.f(qt2Var));
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.m75941xfb821914(3).addAll(extStats);
        db2.t4 t4Var = db2.t4.f309704a;
        m21Var.set(4, t4Var.b(6681, qt2Var));
        this.f309525m = m21Var;
        r45.kv0 kv0Var2 = (r45.kv0) m21Var.m75936x14adae67(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(jn0Var.m75942xfb822ef2(0)), jn0Var.m75945x2fec8307(12)));
        }
        t4Var.h(kv0Var2, qt2Var, arrayList);
        if (!(str == null || str.length() == 0) && (kv0Var = (r45.kv0) this.f309525m.m75936x14adae67(4)) != null && (m75941xfb821914 = kv0Var.m75941xfb821914(7)) != null) {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (it6.hasNext()) {
                ((r45.fl2) it6.next()).set(1, str);
            }
        }
        lVar.f152197a = this.f309525m;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f152198b = n21Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        this.f309523h = lVar.a();
    }
}
