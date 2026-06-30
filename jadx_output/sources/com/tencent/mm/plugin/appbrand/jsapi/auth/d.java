package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.plugin.appbrand.utils.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.n0 f79428d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.ff f79429e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f79430f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.n f79431g;

    public d(com.tencent.mm.plugin.appbrand.jsapi.auth.n0 api, com.tencent.mm.plugin.appbrand.jsapi.ff context, java.lang.String key, com.tencent.mm.plugin.appbrand.jsapi.auth.n authWithTimeoutListener) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(authWithTimeoutListener, "authWithTimeoutListener");
        this.f79428d = api;
        this.f79429e = context;
        this.f79430f = key;
        this.f79431g = authWithTimeoutListener;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.d)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.d dVar = (com.tencent.mm.plugin.appbrand.jsapi.auth.d) obj;
        return kotlin.jvm.internal.o.b(this.f79428d, dVar.f79428d) && kotlin.jvm.internal.o.b(this.f79429e, dVar.f79429e) && kotlin.jvm.internal.o.b(this.f79430f, dVar.f79430f) && kotlin.jvm.internal.o.b(this.f79431g, dVar.f79431g);
    }

    public int hashCode() {
        return (((((this.f79428d.hashCode() * 31) + this.f79429e.hashCode()) * 31) + this.f79430f.hashCode()) * 31) + this.f79431g.hashCode();
    }

    public java.lang.String toString() {
        return "Task(api=" + this.f79428d + ", context=" + this.f79429e + ", key=" + this.f79430f + ", authWithTimeoutListener=" + this.f79431g + ')';
    }
}
