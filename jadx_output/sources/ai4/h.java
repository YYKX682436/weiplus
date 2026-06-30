package ai4;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f5145a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5146b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5147c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5148d;

    public h(int i17, java.lang.String statusId, java.lang.String userName, long j17) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f5145a = i17;
        this.f5146b = statusId;
        this.f5147c = userName;
        this.f5148d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.h)) {
            return false;
        }
        ai4.h hVar = (ai4.h) obj;
        return this.f5145a == hVar.f5145a && kotlin.jvm.internal.o.b(this.f5146b, hVar.f5146b) && kotlin.jvm.internal.o.b(this.f5147c, hVar.f5147c) && this.f5148d == hVar.f5148d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f5145a) * 31) + this.f5146b.hashCode()) * 31) + this.f5147c.hashCode()) * 31) + java.lang.Long.hashCode(this.f5148d);
    }

    public java.lang.String toString() {
        return "Fingerprint(eventId=" + this.f5145a + ", statusId=" + this.f5146b + ", userName=" + this.f5147c + ", createTimeMs=" + this.f5148d + ')';
    }
}
