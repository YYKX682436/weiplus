package com.tencent.mm.plugin.appbrand;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f84214a;

    /* renamed from: b, reason: collision with root package name */
    public final long f84215b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84216c;

    public l1(long j17, long j18, int i17) {
        this.f84214a = j17;
        this.f84215b = j18;
        this.f84216c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.l1)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.l1 l1Var = (com.tencent.mm.plugin.appbrand.l1) obj;
        return this.f84214a == l1Var.f84214a && this.f84215b == l1Var.f84215b && this.f84216c == l1Var.f84216c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f84214a) * 31) + java.lang.Long.hashCode(this.f84215b)) * 31) + java.lang.Integer.hashCode(this.f84216c);
    }

    public java.lang.String toString() {
        return "Result(responseTick=" + this.f84214a + ", cacheMilliseconds=" + this.f84215b + ", code=" + this.f84216c + ')';
    }
}
