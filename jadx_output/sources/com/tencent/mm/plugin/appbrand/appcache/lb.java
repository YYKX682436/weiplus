package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f75660a;

    public lb(java.lang.String provider) {
        kotlin.jvm.internal.o.g(provider, "provider");
        this.f75660a = provider;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.lb lbVar = obj instanceof com.tencent.mm.plugin.appbrand.appcache.lb ? (com.tencent.mm.plugin.appbrand.appcache.lb) obj : null;
        return kotlin.jvm.internal.o.b(lbVar != null ? lbVar.f75660a : null, this.f75660a);
    }

    public int hashCode() {
        return this.f75660a.hashCode();
    }

    public java.lang.String toString() {
        return "PLUGIN(provider=" + this.f75660a + ')';
    }
}
