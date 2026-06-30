package bh2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f20850a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f20851b;

    public a(int i17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f20850a = i17;
        this.f20851b = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh2.a)) {
            return false;
        }
        bh2.a aVar = (bh2.a) obj;
        return this.f20850a == aVar.f20850a && kotlin.jvm.internal.o.b(this.f20851b, aVar.f20851b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f20850a) * 31) + this.f20851b.hashCode();
    }

    public java.lang.String toString() {
        return "BGMData(id=" + this.f20850a + ", path=" + this.f20851b + ')';
    }
}
