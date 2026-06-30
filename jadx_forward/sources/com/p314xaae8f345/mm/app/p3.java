package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public final class p3 extends com.p314xaae8f345.mm.app.n3 {

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135104k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135105l;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135106m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135107n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135108o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135109p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135110q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135111r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135112s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135113t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.m3 f135114u;

    public p3() {
        super(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede);
        this.f135104k = new com.p314xaae8f345.mm.app.m3(this.f135062j, "crash_time", false, true, null, null, null);
        this.f135105l = new com.p314xaae8f345.mm.app.m3(this.f135062j, "hook_extra", false, true, null, null, null);
        com.p314xaae8f345.mm.app.m3 m3Var = new com.p314xaae8f345.mm.app.m3(this.f135062j, "patchid", false, false, null, null, null);
        m3Var.e(com.p314xaae8f345.mm.app.C5000x71a2fa35.f134769b);
        this.f135106m = m3Var;
        this.f135107n = new com.p314xaae8f345.mm.app.m3(this.f135062j, "signal", false, false, null, null, null);
        this.f135108o = new com.p314xaae8f345.mm.app.m3(this.f135062j, "native_backtrace", false, false, null, new com.p314xaae8f345.mm.app.C5078x642033e(), null);
        this.f135109p = new com.p314xaae8f345.mm.app.m3(this.f135062j, "java_backtrace", false, false, null, new com.p314xaae8f345.mm.app.C5079x642033f(), null);
        this.f135110q = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135111r = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135112s = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135113t = new com.p314xaae8f345.mm.app.m3(null, null, false, false, null, null, null);
        this.f135114u = new com.p314xaae8f345.mm.app.m3(this.f135062j, "flutter_backtrace", false, false, null, new com.p314xaae8f345.mm.app.a() { // from class: com.tencent.mm.app.p3$$c
            @Override // com.p314xaae8f345.mm.app.a
            public final void a(java.lang.Object obj, org.json.JSONObject jSONObject, java.lang.String str, boolean z17, boolean z18) {
                com.p314xaae8f345.mm.app.p3 p3Var = com.p314xaae8f345.mm.app.p3.this;
                p3Var.getClass();
                java.lang.String str2 = (java.lang.String) ((com.p314xaae8f345.mm.app.m3) obj).c(true);
                if (str2 == null) {
                    return;
                }
                try {
                    java.lang.String str3 = (java.lang.String) p3Var.f135110q.c(true);
                    if (str3 != null && !str3.isEmpty()) {
                        jSONObject.put("subHeader", str3);
                    }
                    java.lang.String str4 = (java.lang.String) p3Var.f135111r.c(true);
                    if (str4 != null && !str4.isEmpty()) {
                        jSONObject.put("plugin_name", str4);
                    }
                    java.lang.Object obj2 = (java.lang.Boolean) p3Var.f135112s.c(true);
                    if (obj2 != null) {
                        jSONObject.put("kill_self", obj2);
                    }
                    java.lang.String str5 = (java.lang.String) p3Var.f135113t.c(true);
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
