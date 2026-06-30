package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f84890a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84891b;

    public p5(long j17, java.lang.String versionDesc) {
        kotlin.jvm.internal.o.g(versionDesc, "versionDesc");
        this.f84890a = j17;
        this.f84891b = versionDesc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.p5)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.p5 p5Var = (com.tencent.mm.plugin.appbrand.launching.p5) obj;
        return this.f84890a == p5Var.f84890a && kotlin.jvm.internal.o.b(this.f84891b, p5Var.f84891b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f84890a) * 31) + this.f84891b.hashCode();
    }

    public java.lang.String toString() {
        return "ForcedPluginInfo(devUin=" + this.f84890a + ", versionDesc=" + this.f84891b + ')';
    }
}
