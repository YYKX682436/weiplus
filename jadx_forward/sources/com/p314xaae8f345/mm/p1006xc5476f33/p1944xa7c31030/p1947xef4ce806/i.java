package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes11.dex */
public final class i implements ob0.s2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f234587a;

    /* renamed from: b, reason: collision with root package name */
    public final long f234588b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f234589c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f234590d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f234591e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b f234592f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f234593g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b f234594h;

    /* renamed from: i, reason: collision with root package name */
    public wu5.c f234595i;

    public i(java.lang.String bizTag, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizTag, "bizTag");
        this.f234587a = bizTag;
        this.f234588b = j17;
        this.f234589c = "MicroMsg.BizStat_" + bizTag;
        this.f234590d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.c.f234566d);
        this.f234591e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.d(this));
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f234589c, "stat start");
        if (this.f234592f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f234589c, "duplicated start!!!");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                throw new java.lang.RuntimeException("duplicated start!!!");
            }
            return;
        }
        this.f234592f = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b();
        this.f234593g = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.f(this), 1000L, 30000L);
        if (((java.lang.Boolean) ((jz5.n) this.f234590d).mo141623x754a37bb()).booleanValue()) {
            this.f234594h = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b();
            ku5.u0 u0Var = ku5.t0.f394148d;
            this.f234595i = ((ku5.t0) u0Var).d(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.h(this), 1000L, java.util.concurrent.TimeUnit.MINUTES.toMillis(1L));
        }
    }

    public void b() {
        java.lang.String str = this.f234589c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stat stop");
        wu5.c cVar = this.f234593g;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f234593g = null;
        wu5.c cVar2 = this.f234595i;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        this.f234595i = null;
        if (((java.lang.Boolean) ((jz5.n) this.f234591e).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b bVar = this.f234592f;
            if ((bVar != null ? bVar.f234542b : 0L) > 10) {
                ri.i0 i0Var = ri.k0.f477453a;
                long j17 = bVar != null ? (long) bVar.f234543c : 0L;
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b bVar2 = this.f234594h;
                int i17 = bVar2 != null ? (int) bVar2.f234543c : 0;
                java.lang.String str2 = this.f234587a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b bVar3 = this.f234592f;
                if (bVar3 != null) {
                    jSONObject.put("rss-max", bVar3.f234544d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b bVar4 = this.f234594h;
                if (bVar4 != null) {
                    jSONObject.put("pss-max", bVar4.f234544d);
                }
                ri.j0 j0Var = new ri.j0(3000, null, 0, 0, 0L, 0L, 0L, i17, null, 0, null, 0, null, j17, 0L, 0L, str2, null, 0, 0, 0, 0, 0, 0L, null, null, ri.l0.b(jSONObject), 0, 0, null, null, 0, 0, -67182722, 1, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stat report " + j0Var);
                i0Var.a(j0Var);
            }
        }
        this.f234592f = null;
        this.f234594h = null;
    }
}
