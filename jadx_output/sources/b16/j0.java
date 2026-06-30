package b16;

/* loaded from: classes15.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final n16.g f17194a;

    /* renamed from: b, reason: collision with root package name */
    public final e16.g f17195b;

    public j0(n16.g name, e16.g gVar) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f17194a = name;
        this.f17195b = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof b16.j0) {
            if (kotlin.jvm.internal.o.b(this.f17194a, ((b16.j0) obj).f17194a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f17194a.hashCode();
    }
}
