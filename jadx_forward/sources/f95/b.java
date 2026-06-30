package f95;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f95.e f342069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f342070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f342071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f95.a f342072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342073h;

    public b(f95.e eVar, int i17, long j17, f95.a aVar, java.lang.String str) {
        this.f342069d = eVar;
        this.f342070e = i17;
        this.f342071f = j17;
        this.f342072g = aVar;
        this.f342073h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f342069d.getClass();
        int i17 = this.f342070e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        long j17 = this.f342071f;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j17);
        f95.a aVar = this.f342072g;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(aVar.f342067b);
        java.lang.String str = aVar.f342066a;
        java.lang.String str2 = this.f342073h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MessageTableSQLTracer", "Message SQL Executed, type:%d, time:%d, isMainThread:%b, sql:%s, stack:%s", valueOf, valueOf2, valueOf3, str, str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
        c6754x4f2fd58c.p("msg_sql_trace");
        c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
        c6754x4f2fd58c.u(str2);
        c6754x4f2fd58c.r(r26.i0.u(aVar.f342066a, ',', ' ', false, 4, null));
        c6754x4f2fd58c.f140818n = i17;
        c6754x4f2fd58c.f140819o = (int) j17;
        c6754x4f2fd58c.f140820p = aVar.f342067b ? 1 : 0;
        c6754x4f2fd58c.k();
    }
}
