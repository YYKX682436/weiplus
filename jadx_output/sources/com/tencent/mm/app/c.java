package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f53346a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f53347b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f53348c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.app.b f53349d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.app.a f53350e;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f53353h;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f53351f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile java.util.concurrent.Callable f53352g = null;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f53354i = false;

    public c(java.util.List list, java.lang.String str, boolean z17, boolean z18, com.tencent.mm.app.b bVar, com.tencent.mm.app.a aVar) {
        this.f53353h = false;
        if (list != null) {
            list.add(this);
        }
        this.f53346a = str;
        this.f53347b = z17;
        this.f53348c = z18;
        this.f53349d = bVar;
        this.f53350e = aVar;
        if (bVar == null && aVar == null) {
            return;
        }
        this.f53353h = true;
    }

    public final void a(java.lang.StringBuilder sb6) {
        boolean z17;
        synchronized (this) {
            z17 = this.f53353h;
        }
        if (z17) {
            try {
                com.tencent.mm.app.b bVar = this.f53349d;
                java.lang.String str = this.f53346a;
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
            z19 = this.f53353h;
        }
        if (z19) {
            if (z17 || !this.f53347b) {
                if (z18) {
                    synchronized (this) {
                        z27 = this.f53348c;
                    }
                    if (z27) {
                        return;
                    }
                }
                try {
                    com.tencent.mm.app.a aVar = this.f53350e;
                    java.lang.String str = this.f53346a;
                    if (aVar != null) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        this.f53350e.a(this, jSONObject2, this.f53346a, z17, z18);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(str, jSONObject2);
                            return;
                        }
                        return;
                    }
                    com.tencent.mm.app.b bVar = this.f53349d;
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
            if (this.f53353h && this.f53352g != null && (!z17 || !this.f53354i)) {
                this.f53351f = this.f53352g.call();
                this.f53354i = true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return this.f53351f;
    }

    public final synchronized java.lang.Object d(boolean z17, java.lang.Object obj) {
        java.lang.Object c17 = c(z17);
        if (c17 != null) {
            obj = c17;
        }
        return obj;
    }

    public final synchronized com.tencent.mm.app.c e(java.lang.Object obj) {
        this.f53351f = obj;
        this.f53352g = null;
        this.f53353h = true;
        return this;
    }

    public final synchronized com.tencent.mm.app.c f(java.util.concurrent.Callable callable) {
        java.util.Objects.requireNonNull(callable);
        this.f53351f = null;
        this.f53352g = callable;
        this.f53353h = true;
        return this;
    }
}
