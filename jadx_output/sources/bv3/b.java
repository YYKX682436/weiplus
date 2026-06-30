package bv3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f24724a;

    /* renamed from: b, reason: collision with root package name */
    public long f24725b;

    public b(java.lang.String path, long j17, int i17, kotlin.jvm.internal.i iVar) {
        path = (i17 & 1) != 0 ? "" : path;
        j17 = (i17 & 2) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(path, "path");
        this.f24724a = path;
        this.f24725b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv3.b)) {
            return false;
        }
        bv3.b bVar = (bv3.b) obj;
        return kotlin.jvm.internal.o.b(this.f24724a, bVar.f24724a) && this.f24725b == bVar.f24725b;
    }

    public int hashCode() {
        return (this.f24724a.hashCode() * 31) + java.lang.Long.hashCode(this.f24725b);
    }

    public java.lang.String toString() {
        return "TTSInfo(path=" + this.f24724a + ", durationMs=" + this.f24725b + ')';
    }
}
