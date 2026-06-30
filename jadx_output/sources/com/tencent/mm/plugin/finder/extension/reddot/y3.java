package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class y3 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f106027d;

    /* renamed from: e, reason: collision with root package name */
    public final long f106028e;

    /* renamed from: f, reason: collision with root package name */
    public long f106029f;

    /* renamed from: g, reason: collision with root package name */
    public long f106030g;

    /* renamed from: h, reason: collision with root package name */
    public long f106031h;

    public y3(java.lang.String uuid, long j17, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(uuid, "uuid");
        this.f106027d = uuid;
        this.f106028e = j17;
        this.f106029f = j18;
        this.f106030g = j19;
        this.f106031h = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.y3)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.y3 y3Var = (com.tencent.mm.plugin.finder.extension.reddot.y3) obj;
        return kotlin.jvm.internal.o.b(this.f106027d, y3Var.f106027d) && this.f106028e == y3Var.f106028e && this.f106029f == y3Var.f106029f && this.f106030g == y3Var.f106030g && this.f106031h == y3Var.f106031h;
    }

    public int hashCode() {
        return (((((((this.f106027d.hashCode() * 31) + java.lang.Long.hashCode(this.f106028e)) * 31) + java.lang.Long.hashCode(this.f106029f)) * 31) + java.lang.Long.hashCode(this.f106030g)) * 31) + java.lang.Long.hashCode(this.f106031h);
    }

    public java.lang.String toString() {
        return "ExposeTimeInfo(uuid=" + this.f106027d + ", firstExposeTime=" + this.f106028e + ", lastExposeTime=" + this.f106029f + ", lastUnExposeTime=" + this.f106030g + ", accumulateExposureDurationMs=" + this.f106031h + ')';
    }
}
