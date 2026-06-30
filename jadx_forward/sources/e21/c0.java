package e21;

/* loaded from: classes11.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f328026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f328027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e21.x f328028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f328029h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f328030i;

    public c0(xg3.q0 q0Var, e21.e0 e0Var, long j17, e21.x xVar, java.lang.Integer num, int i17) {
        this.f328025d = q0Var;
        this.f328026e = e0Var;
        this.f328027f = j17;
        this.f328028g = xVar;
        this.f328029h = num;
        this.f328030i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.q0 q0Var = this.f328025d;
        int i17 = q0Var.f535956b;
        e21.e0 e0Var = this.f328026e;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) e0Var.f328045b).get(java.lang.Integer.valueOf(i17));
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) e0Var.f328044a).get(java.lang.Integer.valueOf(i17));
        long j17 = q0Var.f535957c;
        long j18 = this.f328027f;
        long j19 = j18 - j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportRemoveFromDBByRemake: reason: ");
        e21.x xVar = this.f328028g;
        sb6.append(xVar);
        sb6.append(" currentTime: ");
        sb6.append(j18);
        sb6.append(" delay: ");
        sb6.append(j19);
        sb6.append("ms op: ");
        sb6.append(e21.a1.a(q0Var));
        sb6.append(", failRecord: ");
        sb6.append(arrayList);
        sb6.append(", failedCountInRecentDown: ");
        sb6.append(this.f328029h);
        sb6.append(", pendingSize:");
        int i18 = this.f328030i;
        sb6.append(i18);
        sb6.append(" source:");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogReportHelper", sb6.toString());
        if (xVar != e21.x.f328127d || (((java.lang.Boolean) ((jz5.n) e0Var.f328046c).mo141623x754a37bb()).booleanValue() && q0Var.f535957c > 0)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6302x298b94fd c6302x298b94fd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6302x298b94fd();
            c6302x298b94fd.f136603d = 36L;
            c6302x298b94fd.f136604e = q0Var.b();
            c6302x298b94fd.f136605f = xVar.ordinal();
            c6302x298b94fd.f136609j = i18;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
            sb7.append(arrayList != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(arrayList, ";") : null);
            sb7.append(']');
            c6302x298b94fd.f136606g = c6302x298b94fd.b("ResultList", sb7.toString(), true);
            c6302x298b94fd.f136607h = j19;
            c6302x298b94fd.f136608i = c6302x298b94fd.b("FromScene", e21.a1.a(q0Var) + str, true);
            c6302x298b94fd.k();
        }
        ((ku5.t0) ku5.t0.f394148d).r(new e21.y(q0Var, e0Var), "oplog_reporter_serial_tag");
    }
}
