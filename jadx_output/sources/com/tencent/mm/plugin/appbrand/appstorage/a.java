package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f76133a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76135c;

    public a(long j17, long j18, int i17) {
        this.f76133a = j17;
        this.f76134b = j18;
        this.f76135c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appstorage.a)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appstorage.a aVar = (com.tencent.mm.plugin.appbrand.appstorage.a) obj;
        return this.f76133a == aVar.f76133a && this.f76134b == aVar.f76134b && this.f76135c == aVar.f76135c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f76133a) * 31) + java.lang.Long.hashCode(this.f76134b)) * 31) + java.lang.Integer.hashCode(this.f76135c);
    }

    public java.lang.String toString() {
        return "Result(readTime=" + this.f76133a + ", writeTime=" + this.f76134b + ", size=" + this.f76135c + ')';
    }
}
