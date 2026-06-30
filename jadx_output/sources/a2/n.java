package a2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final a2.o f784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f786c;

    public n(a2.o intrinsics, int i17, int i18) {
        kotlin.jvm.internal.o.g(intrinsics, "intrinsics");
        this.f784a = intrinsics;
        this.f785b = i17;
        this.f786c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.n)) {
            return false;
        }
        a2.n nVar = (a2.n) obj;
        return kotlin.jvm.internal.o.b(this.f784a, nVar.f784a) && this.f785b == nVar.f785b && this.f786c == nVar.f786c;
    }

    public int hashCode() {
        return (((this.f784a.hashCode() * 31) + java.lang.Integer.hashCode(this.f785b)) * 31) + java.lang.Integer.hashCode(this.f786c);
    }

    public java.lang.String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f784a + ", startIndex=" + this.f785b + ", endIndex=" + this.f786c + ')';
    }
}
