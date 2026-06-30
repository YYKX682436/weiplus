package ry5;

/* loaded from: classes13.dex */
public final class b extends l36.g1 implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final l36.q0 f483228a;

    /* renamed from: b, reason: collision with root package name */
    public l36.f1 f483229b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f483230c;

    /* renamed from: d, reason: collision with root package name */
    public ry5.a f483231d;

    /* renamed from: e, reason: collision with root package name */
    public int f483232e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f483233f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f483234g;

    public b() {
        l36.p0 p0Var = new l36.p0();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        byte[] bArr = m36.e.f404919a;
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(30L);
        if (millis > 2147483647L) {
            throw new java.lang.IllegalArgumentException("interval too large.");
        }
        if (millis == 0) {
            throw new java.lang.IllegalArgumentException("interval too small.");
        }
        p0Var.B = (int) millis;
        this.f483228a = new l36.q0(p0Var);
        this.f483229b = null;
    }

    @Override // l36.g1
    public final void a(l36.f1 f1Var, int i17, java.lang.String str) {
        this.f483234g = false;
        xy5.b.a("enricwu.SentinelConnectMgr", "[onClosed] code : " + i17 + ", reason : " + str);
    }

    public final void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals("test")) {
            this.f483234g = true;
        } else {
            this.f483233f = true;
        }
        ry5.a aVar = this.f483231d;
        if (aVar != null) {
            int i17 = this.f483232e;
            ry5.c cVar = (ry5.c) aVar;
            if (i17 != 1) {
                if (i17 == 2) {
                    cVar.e();
                    cVar.c();
                    return;
                }
                return;
            }
            if (android.text.TextUtils.isEmpty(cVar.f483236a)) {
                return;
            }
            java.lang.String b17 = a.b.c().b();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(ry5.d.a());
            sb6.append(";");
            sb6.append(ry5.d.j());
            sb6.append(";2;");
            ((my1.c) a.b.c().f81582f).getClass();
            sb6.append(o45.wf.f424562g);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str2 = cVar.f483236a + ":" + a.b.c().b();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("action", 1);
                jSONObject.put("uin", b17);
                jSONObject.put("startTime", currentTimeMillis);
                jSONObject.put("pageName", "");
                jSONObject.put("clientInfo", sb7);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2);
            } catch (org.json.JSONException unused) {
            }
            cVar.f483237b.c(jSONObject.toString());
        }
    }

    public final void c(java.lang.String str) {
        mk.f fVar;
        l36.f1 f1Var;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f483234g && (f1Var = this.f483229b) != null) {
            w36.h hVar = (w36.h) f1Var;
            if (str == null) {
                throw new java.lang.NullPointerException("text == null");
            }
            x36.o a17 = x36.o.f533229h.a(str);
            synchronized (hVar) {
                if (!hVar.f524334s && !hVar.f524330o) {
                    long j17 = hVar.f524329n;
                    byte[] bArr = a17.f533232f;
                    if (bArr.length + j17 > 16777216) {
                        hVar.b(1001, null);
                    } else {
                        hVar.f524329n = j17 + bArr.length;
                        hVar.f524328m.add(new w36.e(1, a17));
                        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = hVar.f524325j;
                        if (scheduledExecutorService != null) {
                            ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(hVar.f524322g);
                        }
                    }
                }
            }
        }
        if (!this.f483233f || (fVar = a.b.c().f81583g) == null) {
            return;
        }
        my1.j jVar = (my1.j) fVar;
        if (u46.l.e(str)) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) jVar.f414226b).mo141623x754a37bb(), null, new my1.i(jVar, str, null), 1, null);
        } else {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) jVar.f414226b).mo141623x754a37bb(), null, new my1.h(str, jVar, null), 1, null);
        }
    }

    public final void d(java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.Object obj = null;
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        try {
            obj = jSONObject.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        } catch (org.json.JSONException unused2) {
        }
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        java.lang.String str2 = (java.lang.String) obj;
        ry5.c cVar = (ry5.c) this.f483231d;
        cVar.getClass();
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        cVar.f483238c.post(new ry5.RunnableC30154x2d8ca1(cVar, str2));
    }
}
