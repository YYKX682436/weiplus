package bm2;

/* loaded from: classes5.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final bm2.g6 f21946a;

    /* renamed from: b, reason: collision with root package name */
    public final hn2.d f21947b;

    public h6(bm2.g6 type, hn2.d dVar) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f21946a = type;
        this.f21947b = dVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.h6)) {
            return false;
        }
        bm2.h6 h6Var = (bm2.h6) obj;
        return this.f21946a == h6Var.f21946a && kotlin.jvm.internal.o.b(this.f21947b, h6Var.f21947b);
    }

    public int hashCode() {
        int hashCode = this.f21946a.hashCode() * 31;
        hn2.d dVar = this.f21947b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public java.lang.String toString() {
        return "RequestSongListItem(type=" + this.f21946a + ", song=" + this.f21947b + ')';
    }
}
