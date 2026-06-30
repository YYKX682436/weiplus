package e21;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f328020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f328021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f328022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f328023h;

    public b0(xg3.q0 q0Var, long j17, e21.e0 e0Var, java.lang.Integer num, int i17) {
        this.f328019d = q0Var;
        this.f328020e = j17;
        this.f328021f = e0Var;
        this.f328022g = num;
        this.f328023h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.q0 q0Var = this.f328019d;
        int i17 = q0Var.f535956b;
        long j17 = q0Var.f535957c;
        long j18 = this.f328020e;
        long j19 = j18 - j17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordRemoveFromDB: currentTime: ");
        sb6.append(j18);
        sb6.append(" delay: ");
        sb6.append(j19);
        sb6.append("ms op: ");
        sb6.append(e21.a1.a(q0Var));
        sb6.append(", failRecord: ");
        e21.e0 e0Var = this.f328021f;
        sb6.append(((java.util.LinkedHashMap) e0Var.f328045b).get(java.lang.Integer.valueOf(i17)));
        sb6.append(", failedCountInRecentDown: ");
        sb6.append(this.f328022g);
        sb6.append(", pendingSize:");
        int i18 = this.f328023h;
        sb6.append(i18);
        sb6.append(" source:");
        sb6.append((java.lang.String) ((java.util.LinkedHashMap) e0Var.f328044a).get(java.lang.Integer.valueOf(i17)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogReportHelper", sb6.toString());
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) e0Var.f328045b).get(java.lang.Integer.valueOf(i17));
        if (arrayList != null) {
            java.lang.Integer num = (java.lang.Integer) arrayList.get(arrayList.size() - 1);
            boolean z17 = num != null && num.intValue() == 0;
            if (!z17 || (((java.lang.Boolean) ((jz5.n) e0Var.f328046c).mo141623x754a37bb()).booleanValue() && q0Var.f535957c > 0)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6302x298b94fd c6302x298b94fd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6302x298b94fd();
                c6302x298b94fd.f136603d = 36L;
                c6302x298b94fd.f136604e = q0Var.b();
                if (z17) {
                    e21.x xVar = e21.x.f328127d;
                    c6302x298b94fd.f136605f = 1;
                } else {
                    e21.x xVar2 = e21.x.f328127d;
                    c6302x298b94fd.f136605f = 0;
                }
                c6302x298b94fd.f136609j = i18;
                c6302x298b94fd.f136606g = c6302x298b94fd.b("ResultList", "[" + com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.a(arrayList, ";") + ']', true);
                c6302x298b94fd.f136607h = j19;
                c6302x298b94fd.f136608i = c6302x298b94fd.b("FromScene", e21.a1.a(q0Var) + ((java.lang.String) ((java.util.LinkedHashMap) e0Var.f328044a).get(java.lang.Integer.valueOf(q0Var.f535956b))), true);
                c6302x298b94fd.k();
            }
        }
        ((ku5.t0) ku5.t0.f394148d).r(new e21.y(q0Var, e0Var), "oplog_reporter_serial_tag");
    }
}
