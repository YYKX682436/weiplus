package qu2;

/* loaded from: classes12.dex */
public final class b implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f448282a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f448283b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f448284c;

    /* renamed from: d, reason: collision with root package name */
    public final us5.b f448285d;

    /* renamed from: e, reason: collision with root package name */
    public long f448286e;

    /* renamed from: f, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f448287f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f448288g;

    /* renamed from: h, reason: collision with root package name */
    public float f448289h;

    /* renamed from: i, reason: collision with root package name */
    public final int f448290i;

    public b(ts5.a collectWhat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        this.f448282a = collectWhat;
        this.f448285d = new us5.b("memory");
        this.f448287f = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f448290i = 10;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        if (this.f448283b && !this.f448284c) {
            this.f448284c = true;
            this.f448283b = false;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f448288g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            c();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y / 1024.0f;
            java.lang.Long valueOf = java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f448286e) / 1000);
            java.lang.Long l17 = valueOf.longValue() > 0 ? valueOf : null;
            long longValue = l17 != null ? l17.longValue() : 1L;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("start_memory", java.lang.Float.valueOf(this.f448289h));
            jSONObject.put("stop_memory", java.lang.Float.valueOf(f17));
            jSONObject.put("record_time", longValue);
            us5.b bVar = this.f448285d;
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(bVar.f512112c - this.f448289h)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            jSONObject.put("avg_offest_memory", java.lang.Float.valueOf(java.lang.Float.parseFloat(format)));
            java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(bVar.f512112c)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            jSONObject.put("avg_memory", java.lang.Float.valueOf(java.lang.Float.parseFloat(format2)));
            b(jSONObject, map);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AvgMemoryConsumeCollector", "#compositor done. json=" + jSONObject);
            ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).Ai(this.f448282a, jSONObject);
        }
    }

    public final void c() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        this.f448285d.a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y / 1024.0f);
    }

    @Override // ts5.d
    /* renamed from: cancel */
    public void mo149995xae7a2e7a() {
        this.f448284c = true;
        this.f448283b = false;
    }

    @Override // ts5.d
    /* renamed from: start */
    public void mo149996x68ac462() {
        if (this.f448283b) {
            return;
        }
        us5.b bVar = this.f448285d;
        bVar.f512111b = 0;
        bVar.f512112c = 0.0d;
        this.f448283b = true;
        this.f448284c = false;
        this.f448286e = java.lang.System.currentTimeMillis();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f448288g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        this.f448289h = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y / 1024.0f;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f448287f;
        this.f448288g = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qu2.a(this, null), 2, null) : null;
    }
}
