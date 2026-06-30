package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class hb implements java.util.concurrent.Callable, wu5.g, com.tencent.mm.plugin.appbrand.launching.b7 {

    /* renamed from: d, reason: collision with root package name */
    public volatile long f84647d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f84648e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f84649f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84650g = true;

    @Override // com.tencent.mm.plugin.appbrand.launching.b7
    public boolean d() {
        return this.f84650g;
    }

    public final java.lang.Object e() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f84647d = java.lang.System.currentTimeMillis();
        try {
            return call();
        } finally {
            this.f84648e = java.lang.System.currentTimeMillis();
            this.f84649f = this.f84648e - this.f84647d;
        }
    }

    public abstract java.lang.String f();

    public void g(boolean z17) {
        this.f84650g = z17;
    }

    @Override // wu5.g
    public final java.lang.String getKey() {
        return f();
    }

    public final java.util.concurrent.Future h() {
        return ((ku5.t0) ku5.t0.f312615d).c(new com.tencent.mm.plugin.appbrand.launching.gb(this));
    }
}
