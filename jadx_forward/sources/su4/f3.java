package su4;

/* loaded from: classes8.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f494414a;

    /* renamed from: b, reason: collision with root package name */
    public int f494415b;

    /* renamed from: c, reason: collision with root package name */
    public int f494416c;

    /* renamed from: d, reason: collision with root package name */
    public long f494417d;

    /* renamed from: e, reason: collision with root package name */
    public int f494418e;

    /* renamed from: f, reason: collision with root package name */
    public int f494419f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f494420g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f494421h;

    /* renamed from: i, reason: collision with root package name */
    public long f494422i;

    /* renamed from: j, reason: collision with root package name */
    public int f494423j;

    /* renamed from: k, reason: collision with root package name */
    public long f494424k = java.lang.System.currentTimeMillis();

    /* renamed from: l, reason: collision with root package name */
    public int f494425l;

    /* renamed from: m, reason: collision with root package name */
    public int f494426m;

    public boolean a() {
        if (this.f494426m == 1) {
            return false;
        }
        int i17 = this.f494416c;
        if (i17 > o45.wf.f424562g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s clientVersion %d invalid ,curVer is %d", this.f494414a, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(o45.wf.f424562g));
            return false;
        }
        if (java.lang.System.currentTimeMillis() > this.f494424k + (this.f494417d * 1000)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s expired", this.f494414a);
            return false;
        }
        java.lang.String str = this.f494415b + "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d";
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) >= this.f494418e);
        objArr[1] = java.lang.Integer.valueOf(this.f494418e);
        objArr[2] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0));
        objArr[3] = java.lang.Long.valueOf(this.f494422i);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SEARCH_REDDOT_LONG;
        java.lang.Object m17 = c17.m(u3Var, null);
        objArr[4] = java.lang.Long.valueOf(m17 == null ? 0L : ((java.lang.Long) m17).longValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchRedPointMgr", str, objArr);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0) < this.f494418e) {
            return false;
        }
        long j17 = this.f494422i;
        java.lang.Object m18 = gm0.j1.u().c().m(u3Var, null);
        return j17 > (m18 != null ? ((java.lang.Long) m18).longValue() : 0L);
    }
}
