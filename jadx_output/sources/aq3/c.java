package aq3;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f13165a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Thread f13166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13167c;

    /* renamed from: d, reason: collision with root package name */
    public int f13168d;

    public c(long j17, java.lang.Thread thread, int i17) {
        this.f13165a = j17;
        this.f13166b = thread;
        this.f13167c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3.c)) {
            return false;
        }
        aq3.c cVar = (aq3.c) obj;
        return this.f13165a == cVar.f13165a && kotlin.jvm.internal.o.b(this.f13166b, cVar.f13166b) && this.f13167c == cVar.f13167c;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f13165a) * 31;
        java.lang.Thread thread = this.f13166b;
        return ((hashCode + (thread == null ? 0 : thread.hashCode())) * 31) + java.lang.Integer.hashCode(this.f13167c);
    }

    public java.lang.String toString() {
        return "CheckInfo(time=" + this.f13165a + ", thread=" + this.f13166b + ", type=" + this.f13167c + ')';
    }
}
