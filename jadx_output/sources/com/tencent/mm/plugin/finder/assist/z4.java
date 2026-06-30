package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f102748a;

    /* renamed from: b, reason: collision with root package name */
    public final long f102749b;

    public z4(long j17, long j18) {
        this.f102748a = j17;
        this.f102749b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.z4)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.z4 z4Var = (com.tencent.mm.plugin.finder.assist.z4) obj;
        return this.f102748a == z4Var.f102748a && this.f102749b == z4Var.f102749b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f102748a) * 31) + java.lang.Long.hashCode(this.f102749b);
    }

    public java.lang.String toString() {
        return "ObjectStatusReqState(lastReqTime=" + this.f102748a + ", waitTime=" + this.f102749b + ')';
    }
}
