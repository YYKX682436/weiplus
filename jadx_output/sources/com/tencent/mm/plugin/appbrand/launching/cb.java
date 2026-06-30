package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84552a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f84553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84554c;

    public cb(java.lang.String jsapiName, java.lang.String scope, int i17) {
        kotlin.jvm.internal.o.g(jsapiName, "jsapiName");
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f84552a = jsapiName;
        this.f84553b = scope;
        this.f84554c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.cb)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.cb cbVar = (com.tencent.mm.plugin.appbrand.launching.cb) obj;
        return kotlin.jvm.internal.o.b(this.f84552a, cbVar.f84552a) && kotlin.jvm.internal.o.b(this.f84553b, cbVar.f84553b) && this.f84554c == cbVar.f84554c;
    }

    public int hashCode() {
        return (((this.f84552a.hashCode() * 31) + this.f84553b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f84554c);
    }

    public java.lang.String toString() {
        return "AuthItem(jsapiName=" + this.f84552a + ", scope=" + this.f84553b + ", authStatus=" + this.f84554c + ')';
    }
}
