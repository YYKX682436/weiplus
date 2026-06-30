package bq;

/* loaded from: classes2.dex */
public final class m1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105027o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f105028p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, java.util.List extStats, r45.qt2 qt2Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        this.f105027o = i17;
        this.f105028p = extStats;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6681;
        r45.m21 m21Var = new r45.m21();
        db2.t4 t4Var = db2.t4.f309704a;
        m21Var.set(4, t4Var.a(6681));
        java.lang.String m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(18) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            m75945x2fec8307 = xy2.c.e(context);
        }
        m21Var.set(1, m75945x2fec8307);
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
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = this.f105028p.iterator();
        while (it6.hasNext()) {
            sb6.append(pm0.v.u(((r45.jn0) it6.next()).m75942xfb822ef2(0)));
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportScreenShotCGI", "FinderReportScreenShotCGI start " + this.f105027o + ", " + ((java.lang.Object) sb6));
    }
}
