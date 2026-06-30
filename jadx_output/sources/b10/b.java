package b10;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f17014a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17017d;

    public b(int i17, int i18, int i19, int i27) {
        this.f17014a = i17;
        this.f17015b = i18;
        this.f17016c = i19;
        this.f17017d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10.b)) {
            return false;
        }
        b10.b bVar = (b10.b) obj;
        return this.f17014a == bVar.f17014a && this.f17015b == bVar.f17015b && this.f17016c == bVar.f17016c && this.f17017d == bVar.f17017d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f17014a) * 31) + java.lang.Integer.hashCode(this.f17015b)) * 31) + java.lang.Integer.hashCode(this.f17016c)) * 31) + java.lang.Integer.hashCode(this.f17017d);
    }

    public java.lang.String toString() {
        return "RenderStats(reusedInPlace=" + this.f17014a + ", fromPool=" + this.f17015b + ", newlyCreated=" + this.f17016c + ", poolSize=" + this.f17017d + ')';
    }
}
