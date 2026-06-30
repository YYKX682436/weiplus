package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f88582a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f88583b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.z f88584c;

    /* renamed from: d, reason: collision with root package name */
    public final long f88585d;

    public v0(java.lang.String posterTaskId, java.lang.String savePath, kotlinx.coroutines.z deferred, long j17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 8) != 0 ? java.lang.System.currentTimeMillis() : j17;
        kotlin.jvm.internal.o.g(posterTaskId, "posterTaskId");
        kotlin.jvm.internal.o.g(savePath, "savePath");
        kotlin.jvm.internal.o.g(deferred, "deferred");
        this.f88582a = posterTaskId;
        this.f88583b = savePath;
        this.f88584c = deferred;
        this.f88585d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.screenshot.v0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.screenshot.v0 v0Var = (com.tencent.mm.plugin.appbrand.screenshot.v0) obj;
        return kotlin.jvm.internal.o.b(this.f88582a, v0Var.f88582a) && kotlin.jvm.internal.o.b(this.f88583b, v0Var.f88583b) && kotlin.jvm.internal.o.b(this.f88584c, v0Var.f88584c) && this.f88585d == v0Var.f88585d;
    }

    public int hashCode() {
        return (((((this.f88582a.hashCode() * 31) + this.f88583b.hashCode()) * 31) + this.f88584c.hashCode()) * 31) + java.lang.Long.hashCode(this.f88585d);
    }

    public java.lang.String toString() {
        return "PosterTask(posterTaskId=" + this.f88582a + ", savePath=" + this.f88583b + ", deferred=" + this.f88584c + ", timestamp=" + this.f88585d + ')';
    }
}
