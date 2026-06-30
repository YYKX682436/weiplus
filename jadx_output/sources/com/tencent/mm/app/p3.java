package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class p3 extends com.tencent.mm.app.n3 {

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53571k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53572l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53573m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53574n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53575o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53576p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53577q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53578r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53579s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53580t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.app.m3 f53581u;

    public p3() {
        super(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN);
        this.f53571k = new com.tencent.mm.app.m3(this.f53529j, "crash_time", false, true, null, null, null);
        this.f53572l = new com.tencent.mm.app.m3(this.f53529j, "hook_extra", false, true, null, null, null);
        com.tencent.mm.app.m3 m3Var = new com.tencent.mm.app.m3(this.f53529j, "patchid", false, false, null, null, null);
        m3Var.e(com.tencent.mm.app.MMCrashReportContents.f53236b);
        this.f53573m = m3Var;
        this.f53574n = new com.tencent.mm.app.m3(this.f53529j, "signal", false, false, null, null, null);
        this.f53575o = new com.tencent.mm.app.m3(this.f53529j, "native_backtrace", false, false, null, new com.tencent.mm.app.p3$$a(), null);
        this.f53576p = new com.tencent.mm.app.m3(this.f53529j, "java_backtrace", false, false, null, new com.tencent.mm.app.p3$$b(), null);
        this.f53577q = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53578r = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53579s = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53580t = new com.tencent.mm.app.m3(null, null, false, false, null, null, null);
        this.f53581u = new com.tencent.mm.app.m3(this.f53529j, "flutter_backtrace", false, false, null, new com.tencent.mm.app.a() { // from class: com.tencent.mm.app.p3$$c
            @Override // com.tencent.mm.app.a
            public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
                com.tencent.mm.app.p3 p3Var = com.tencent.mm.app.p3.this;
                p3Var.getClass();
                java.lang.String str2 = (java.lang.String) ((com.tencent.mm.app.m3) obj).c(true);
                if (str2 == null) {
                    return;
                }
                try {
                    java.lang.String str3 = (java.lang.String) p3Var.f53577q.c(true);
                    if (str3 != null && !str3.isEmpty()) {
                        jSONObject.put("subHeader", str3);
                    }
                    java.lang.String str4 = (java.lang.String) p3Var.f53578r.c(true);
                    if (str4 != null && !str4.isEmpty()) {
                        jSONObject.put("plugin_name", str4);
                    }
                    java.lang.Object obj2 = (java.lang.Boolean) p3Var.f53579s.c(true);
                    if (obj2 != null) {
                        jSONObject.put("kill_self", obj2);
                    }
                    java.lang.String str5 = (java.lang.String) p3Var.f53580t.c(true);
                    if (str5 != null && !str5.isEmpty()) {
                        jSONObject.put("err_msg", str5);
                    }
                } catch (org.json.JSONException unused) {
                }
                try {
                    jSONObject.put("contents", org.json.JSONObject.wrap(str2.split("\n")));
                } catch (org.json.JSONException unused2) {
                }
            }
        }, null);
    }
}
