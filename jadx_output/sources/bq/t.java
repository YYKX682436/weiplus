package bq;

/* loaded from: classes2.dex */
public final class t extends bq.e {

    /* renamed from: s, reason: collision with root package name */
    public static final bq.s f23523s = new bq.s(null);

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f23524t = jz5.h.b(bq.r.f23521d);

    /* renamed from: o, reason: collision with root package name */
    public final int f23525o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f23526p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f23527q;

    /* renamed from: r, reason: collision with root package name */
    public cz2.f f23528r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.qt2 qt2Var, int i17, java.util.List extStats, java.lang.String str) {
        super(qt2Var);
        java.lang.String e17;
        r45.kv0 kv0Var;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(extStats, "extStats");
        this.f23525o = i17;
        this.f23526p = extStats;
        this.f23527q = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6681;
        r45.m21 m21Var = new r45.m21();
        if (qt2Var == null || (e17 = qt2Var.getString(18)) == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e17 = xy2.c.e(context);
        }
        m21Var.set(1, e17);
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.getList(3).addAll(extStats);
        db2.t4 t4Var = db2.t4.f228171a;
        m21Var.set(4, t4Var.b(6681, qt2Var));
        r45.kv0 kv0Var2 = (r45.kv0) m21Var.getCustom(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(jn0Var.getLong(0)), jn0Var.getString(12)));
        }
        t4Var.h(kv0Var2, qt2Var, arrayList);
        java.lang.String str2 = this.f23527q;
        if (!(str2 == null || str2.length() == 0) && (kv0Var = (r45.kv0) m21Var.getCustom(4)) != null && (list = kv0Var.getList(7)) != null) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                ((r45.fl2) it6.next()).set(1, this.f23527q);
            }
        }
        lVar.f70664a = m21Var;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f70665b = n21Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderExtStatsReportCGI start actionType=");
        sb6.append(this.f23525o);
        sb6.append(", extList=");
        java.util.List<r45.jn0> list2 = this.f23526p;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (r45.jn0 jn0Var2 : list2) {
            sb7.append("[feedActionValue=" + jn0Var2.getString(3) + " objectId=" + pm0.v.u(jn0Var2.getLong(0)) + " func_msg_report_ext_info=" + jn0Var2.getString(10) + "];");
        }
        java.lang.String sb8 = sb7.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        sb6.append(sb8);
        com.tencent.mars.xlog.Log.i("Finder.FinderExtStatsReportCGI", sb6.toString());
        this.f23528r = cz2.f.f225004f;
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.n21 resp = (r45.n21) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderExtStatsReportCGI", "onGYNetEnd  " + i17 + ' ' + i18 + ' ' + str + ' ');
        if (i17 >= 4) {
            this.f23528r = cz2.f.f225002d;
        }
    }

    @Override // bq.e, cz2.j
    public cz2.f v() {
        return this.f23528r;
    }
}
