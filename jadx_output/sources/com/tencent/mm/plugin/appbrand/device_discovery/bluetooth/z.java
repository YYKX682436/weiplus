package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f77979a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77980b;

    public z(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f77979a = appId;
        this.f77980b = i17;
    }

    public final boolean a() {
        java.lang.String i17;
        com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
        int i18 = this.f77980b;
        java.lang.String str = this.f77979a;
        com.tencent.luggage.sdk.processes.s c17 = a17.c(str, i18);
        if (c17 != null && (i17 = ((com.tencent.mm.plugin.appbrand.task.k) a17.f(c17)).i()) != null) {
            com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.f.b(i17, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.x.f77973a);
            java.lang.Boolean valueOf = iPCBoolean != null ? java.lang.Boolean.valueOf(iPCBoolean.f68400d) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z zVar = (com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.z) obj;
        return kotlin.jvm.internal.o.b(this.f77979a, zVar.f77979a) && this.f77980b == zVar.f77980b;
    }

    public int hashCode() {
        return (this.f77979a.hashCode() * 31) + java.lang.Integer.hashCode(this.f77980b);
    }

    public java.lang.String toString() {
        return "WeApp(appId=" + this.f77979a + ", versionType=" + this.f77980b + ')';
    }
}
