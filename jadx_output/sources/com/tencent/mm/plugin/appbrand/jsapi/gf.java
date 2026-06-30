package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes5.dex */
public final class gf {

    /* renamed from: a, reason: collision with root package name */
    public int f81262a;

    /* renamed from: b, reason: collision with root package name */
    public long f81263b;

    public gf(int i17, long j17) {
        this.f81262a = i17;
        this.f81263b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.gf)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.gf gfVar = (com.tencent.mm.plugin.appbrand.jsapi.gf) obj;
        return this.f81262a == gfVar.f81262a && this.f81263b == gfVar.f81263b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f81262a) * 31) + java.lang.Long.hashCode(this.f81263b);
    }

    public java.lang.String toString() {
        return "InvokeData(count=" + this.f81262a + ", totalCost=" + this.f81263b + ')';
    }
}
