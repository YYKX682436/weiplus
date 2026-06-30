package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f76309a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76310b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76311c;

    public r(long j17, long j18, int i17) {
        this.f76309a = j17;
        this.f76310b = j18;
        this.f76311c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.appstorage.r)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.appstorage.r rVar = (com.tencent.mm.plugin.appbrand.appstorage.r) obj;
        return this.f76309a == rVar.f76309a && this.f76310b == rVar.f76310b && this.f76311c == rVar.f76311c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f76309a) * 31) + java.lang.Long.hashCode(this.f76310b)) * 31) + java.lang.Integer.hashCode(this.f76311c);
    }

    public java.lang.String toString() {
        return "Result(readTime=" + this.f76309a + ", writeTime=" + this.f76310b + ", size=" + this.f76311c + ')';
    }
}
