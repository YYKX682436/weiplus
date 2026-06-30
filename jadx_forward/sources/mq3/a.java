package mq3;

/* loaded from: classes12.dex */
public class a extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f412303d;

    /* renamed from: e, reason: collision with root package name */
    public final int f412304e;

    /* renamed from: f, reason: collision with root package name */
    public final long f412305f;

    /* renamed from: g, reason: collision with root package name */
    public int f412306g;

    /* renamed from: h, reason: collision with root package name */
    public final int f412307h;

    public a(mq3.b bVar, java.lang.String str, int i17) {
        this.f412303d = str;
        this.f412304e = i17;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return java.lang.String.format("Priority.UpdateTask[%s][%d][%d][%d][%d]", this.f412303d, java.lang.Integer.valueOf(this.f412304e), java.lang.Long.valueOf(this.f412305f), java.lang.Integer.valueOf(this.f412306g), java.lang.Integer.valueOf(this.f412307h));
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f412303d;
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.endsWith("@stranger") && !str.endsWith("@qqim") && !str.endsWith("@app") && !str.startsWith("fake_") && !c01.e2.G(str)) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CChatUsageLogic", "filterByUsername %s", str);
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).u2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CChatUsageLogic", "Hidden %s", str);
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            this.f412306g = 2;
        } else {
            this.f412306g = 3;
        }
        int i17 = this.f412304e;
        if (i17 == 0) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.m134976x2690a4ac();
            mq3.d dVar = nVar.f347067s;
            java.lang.String str2 = this.f412303d;
            long j17 = this.f412306g;
            dVar.getClass();
            long a17 = hq3.a.a();
            boolean a18 = dVar.a(str2, a17, j17);
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = dVar.f412311c;
            c26970x63d6eaa3.m107799x37fbf859(1, this.f412305f);
            c26970x63d6eaa3.m107801x35198eae(2, str2);
            c26970x63d6eaa3.m107799x37fbf859(3, a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CChatUsageStorage", "updateOpen chat %s insert %b update %b", str2, java.lang.Boolean.valueOf(a18), java.lang.Integer.valueOf(c26970x63d6eaa3.m107871x91d1f3e9()));
            return;
        }
        if (i17 == 1) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.m134976x2690a4ac();
            mq3.d dVar2 = nVar2.f347067s;
            java.lang.String str3 = this.f412303d;
            long j18 = this.f412306g;
            dVar2.getClass();
            long a19 = hq3.a.a();
            boolean a27 = dVar2.a(str3, a19, j18);
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa32 = dVar2.f412312d;
            c26970x63d6eaa32.m107801x35198eae(1, str3);
            c26970x63d6eaa32.m107799x37fbf859(2, a19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CChatUsageStorage", "%s chat %s insert %b update %b", "updateSendMsg", str3, java.lang.Boolean.valueOf(a27), java.lang.Integer.valueOf(c26970x63d6eaa32.m107871x91d1f3e9()));
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.m134976x2690a4ac();
            nVar3.f347067s.a(this.f412303d, hq3.a.a(), this.f412306g);
            return;
        }
        fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar4.m134976x2690a4ac();
        mq3.d dVar3 = nVar4.f347067s;
        long j19 = this.f412306g;
        dVar3.getClass();
        dVar3.f412309a.d(java.lang.String.format("UPDATE %s SET consumemsgcount = consumemsgcount + ? WHERE chat = ? AND date = ?", "C2CChatUsage"), new java.lang.String[]{java.lang.String.valueOf(this.f412307h), str, java.lang.String.valueOf(j19)});
    }

    public a(mq3.b bVar, java.lang.String str, int i17, int i18) {
        this.f412303d = str;
        this.f412304e = i17;
        this.f412307h = i18;
    }

    public a(mq3.b bVar, java.lang.String str, int i17, long j17) {
        this.f412303d = str;
        this.f412304e = i17;
        this.f412307h = this.f412307h;
        this.f412305f = j17;
    }
}
