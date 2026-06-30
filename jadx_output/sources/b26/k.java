package b26;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f17456a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.i f17457b;

    public k(n16.b classId, b26.i iVar) {
        kotlin.jvm.internal.o.g(classId, "classId");
        this.f17456a = classId;
        this.f17457b = iVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof b26.k) {
            if (kotlin.jvm.internal.o.b(this.f17456a, ((b26.k) obj).f17456a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17456a.hashCode();
    }
}
