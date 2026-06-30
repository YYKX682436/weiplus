package bq;

/* loaded from: classes2.dex */
public final class t extends bq.e {

    /* renamed from: s, reason: collision with root package name */
    public static final bq.s f105056s = new bq.s(null);

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f105057t = jz5.h.b(bq.r.f105054d);

    /* renamed from: o, reason: collision with root package name */
    public final int f105058o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f105059p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f105060q;

    /* renamed from: r, reason: collision with root package name */
    public cz2.f f105061r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.qt2 qt2Var, int i17, java.util.List extStats, java.lang.String str) {
        super(qt2Var);
        java.lang.String e17;
        r45.kv0 kv0Var;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extStats, "extStats");
        this.f105058o = i17;
        this.f105059p = extStats;
        this.f105060q = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6681;
        r45.m21 m21Var = new r45.m21();
        if (qt2Var == null || (e17 = qt2Var.m75945x2fec8307(18)) == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e17 = xy2.c.e(context);
        }
        m21Var.set(1, e17);
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.m75941xfb821914(3).addAll(extStats);
        db2.t4 t4Var = db2.t4.f309704a;
        m21Var.set(4, t4Var.b(6681, qt2Var));
        r45.kv0 kv0Var2 = (r45.kv0) m21Var.m75936x14adae67(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0), java.lang.Long.valueOf(jn0Var.m75942xfb822ef2(0)), jn0Var.m75945x2fec8307(12)));
        }
        t4Var.h(kv0Var2, qt2Var, arrayList);
        java.lang.String str2 = this.f105060q;
        if (!(str2 == null || str2.length() == 0) && (kv0Var = (r45.kv0) m21Var.m75936x14adae67(4)) != null && (m75941xfb821914 = kv0Var.m75941xfb821914(7)) != null) {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            while (it6.hasNext()) {
                ((r45.fl2) it6.next()).set(1, this.f105060q);
            }
        }
        lVar.f152197a = m21Var;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f152198b = n21Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderExtStatsReportCGI start actionType=");
        sb6.append(this.f105058o);
        sb6.append(", extList=");
        java.util.List<r45.jn0> list = this.f105059p;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (r45.jn0 jn0Var2 : list) {
            sb7.append("[feedActionValue=" + jn0Var2.m75945x2fec8307(3) + " objectId=" + pm0.v.u(jn0Var2.m75942xfb822ef2(0)) + " func_msg_report_ext_info=" + jn0Var2.m75945x2fec8307(10) + "];");
        }
        java.lang.String sb8 = sb7.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        sb6.append(sb8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderExtStatsReportCGI", sb6.toString());
        this.f105061r = cz2.f.f306537f;
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.n21 resp = (r45.n21) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderExtStatsReportCGI", "onGYNetEnd  " + i17 + ' ' + i18 + ' ' + str + ' ');
        if (i17 >= 4) {
            this.f105061r = cz2.f.f306535d;
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return this.f105061r;
    }
}
