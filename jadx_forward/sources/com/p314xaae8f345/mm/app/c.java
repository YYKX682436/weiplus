package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f134879a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134880b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134881c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.b f134882d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.a f134883e;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f134886h;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f134884f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.concurrent.Callable f134885g = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f134887i = false;

    public c(java.util.List list, java.lang.String str, boolean z17, boolean z18, com.p314xaae8f345.mm.app.b bVar, com.p314xaae8f345.mm.app.a aVar) {
        this.f134886h = false;
        if (list != null) {
            list.add(this);
        }
        this.f134879a = str;
        this.f134880b = z17;
        this.f134881c = z18;
        this.f134882d = bVar;
        this.f134883e = aVar;
        if (bVar == null && aVar == null) {
            return;
        }
        this.f134886h = true;
    }

    public final void a(java.lang.StringBuilder sb6) {
        boolean z17;
        synchronized (this) {
            z17 = this.f134886h;
        }
        if (z17) {
            try {
                com.p314xaae8f345.mm.app.b bVar = this.f134882d;
                java.lang.String str = this.f134879a;
                if (bVar != null) {
                    bVar.a(this, sb6, str);
                    return;
                }
                if (str != null && !str.isEmpty()) {
                    sb6.append(str);
                }
                sb6.append(c(true));
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final void b(org.json.JSONObject jSONObject, boolean z17, boolean z18) {
        boolean z19;
        java.lang.Object c17;
        boolean z27;
        synchronized (this) {
            z19 = this.f134886h;
        }
        if (z19) {
            if (z17 || !this.f134880b) {
                if (z18) {
                    synchronized (this) {
                        z27 = this.f134881c;
                    }
                    if (z27) {
                        return;
                    }
                }
                try {
                    com.p314xaae8f345.mm.app.a aVar = this.f134883e;
                    java.lang.String str = this.f134879a;
                    if (aVar != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        this.f134883e.a(this, jSONObject2, this.f134879a, z17, z18);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(str, jSONObject2);
                            return;
                        }
                        return;
                    }
                    com.p314xaae8f345.mm.app.b bVar = this.f134882d;
                    if (bVar == null) {
                        if (str == null || (c17 = c(true)) == null) {
                            return;
                        }
                        jSONObject.put(str, c17);
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    bVar.a(this, sb6, str);
                    if (sb6.length() > 0) {
                        jSONObject.put(str, sb6.toString());
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    public final synchronized java.lang.Object c(boolean z17) {
        try {
            if (this.f134886h && this.f134885g != null && (!z17 || !this.f134887i)) {
                this.f134884f = this.f134885g.call();
                this.f134887i = true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return this.f134884f;
    }

    public final synchronized java.lang.Object d(boolean z17, java.lang.Object obj) {
        java.lang.Object c17 = c(z17);
        if (c17 != null) {
            obj = c17;
        }
        return obj;
    }

    public final synchronized com.p314xaae8f345.mm.app.c e(java.lang.Object obj) {
        this.f134884f = obj;
        this.f134885g = null;
        this.f134886h = true;
        return this;
    }

    public final synchronized com.p314xaae8f345.mm.app.c f(java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(callable);
        this.f134884f = null;
        this.f134885g = callable;
        this.f134886h = true;
        return this;
    }
}
