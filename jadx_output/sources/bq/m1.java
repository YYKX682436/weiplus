package bq;

/* loaded from: classes2.dex */
public final class m1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23494o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f23495p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(int i17, java.util.List extStats, r45.qt2 qt2Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(extStats, "extStats");
        this.f23494o = i17;
        this.f23495p = extStats;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6681;
        r45.m21 m21Var = new r45.m21();
        db2.t4 t4Var = db2.t4.f228171a;
        m21Var.set(4, t4Var.a(6681));
        java.lang.String string = qt2Var != null ? qt2Var.getString(18) : null;
        if (string == null || string.length() == 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            string = xy2.c.e(context);
        }
        m21Var.set(1, string);
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.getList(3).addAll(extStats);
        r45.kv0 kv0Var = (r45.kv0) m21Var.getCustom(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(jn0Var.getLong(0)), jn0Var.getString(12)));
        }
        t4Var.h(kv0Var, null, arrayList);
        lVar.f70664a = m21Var;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f70665b = n21Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = this.f23495p.iterator();
        while (it6.hasNext()) {
            sb6.append(pm0.v.u(((r45.jn0) it6.next()).getLong(0)));
            sb6.append(",");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderReportScreenShotCGI", "FinderReportScreenShotCGI start " + this.f23494o + ", " + ((java.lang.Object) sb6));
    }
}
