package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92338a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f92339b;

    public x0(int i17, java.lang.String apiName) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        this.f92338a = i17;
        this.f92339b = apiName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.wxassistant.x0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.wxassistant.x0 x0Var = (com.tencent.mm.plugin.appbrand.wxassistant.x0) obj;
        return this.f92338a == x0Var.f92338a && kotlin.jvm.internal.o.b(this.f92339b, x0Var.f92339b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f92338a) * 31) + this.f92339b.hashCode();
    }

    public java.lang.String toString() {
        return this.f92339b;
    }
}
