package aq3;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f13162a;

    /* renamed from: b, reason: collision with root package name */
    public int f13163b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f13164c;

    public b(long j17, int i17, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f13162a = j17;
        this.f13163b = i17;
        this.f13164c = name;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq3.b)) {
            return false;
        }
        aq3.b bVar = (aq3.b) obj;
        return this.f13162a == bVar.f13162a && this.f13163b == bVar.f13163b && kotlin.jvm.internal.o.b(this.f13164c, bVar.f13164c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f13162a) * 31) + java.lang.Integer.hashCode(this.f13163b)) * 31) + this.f13164c.hashCode();
    }

    public java.lang.String toString() {
        return "{name=" + this.f13164c + " threadTime=" + this.f13162a + " count=" + this.f13163b + '}';
    }
}
