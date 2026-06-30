package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f75748a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.p6 f75749b;

    /* renamed from: c, reason: collision with root package name */
    public cf.d f75750c;

    public c0(java.lang.String localRequestKey, com.tencent.mm.plugin.appbrand.service.p6 callback) {
        kotlin.jvm.internal.o.g(localRequestKey, "localRequestKey");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f75748a = localRequestKey;
        this.f75749b = callback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appcache.predownload.c0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appcache.predownload.c0 c0Var = (com.tencent.mm.plugin.appbrand.appcache.predownload.c0) obj;
        return kotlin.jvm.internal.o.b(this.f75748a, c0Var.f75748a) && kotlin.jvm.internal.o.b(this.f75749b, c0Var.f75749b);
    }

    public int hashCode() {
        return (this.f75748a.hashCode() * 31) + this.f75749b.hashCode();
    }

    public java.lang.String toString() {
        return "CallbackContext(localRequestKey=" + this.f75748a + ", callback=" + this.f75749b + ')';
    }
}
