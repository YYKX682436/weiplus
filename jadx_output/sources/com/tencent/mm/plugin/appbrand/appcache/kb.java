package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f75638a;

    public kb(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        name = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME.equals(name) ? name : com.tencent.mm.plugin.appbrand.appstorage.l1.b(name, false);
        kotlin.jvm.internal.o.d(name);
        this.f75638a = name;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.kb kbVar = obj instanceof com.tencent.mm.plugin.appbrand.appcache.kb ? (com.tencent.mm.plugin.appbrand.appcache.kb) obj : null;
        return kotlin.jvm.internal.o.b(kbVar != null ? kbVar.f75638a : null, this.f75638a);
    }

    public int hashCode() {
        return this.f75638a.hashCode();
    }
}
