package at4;

/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14016a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14017b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14018c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f14019d;

    public y1(int i17, boolean z17, boolean z18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f14016a = i17;
        this.f14017b = z17;
        this.f14018c = z18;
        this.f14019d = callback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at4.y1)) {
            return false;
        }
        at4.y1 y1Var = (at4.y1) obj;
        return this.f14016a == y1Var.f14016a && this.f14017b == y1Var.f14017b && this.f14018c == y1Var.f14018c && kotlin.jvm.internal.o.b(this.f14019d, y1Var.f14019d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f14016a) * 31) + java.lang.Boolean.hashCode(this.f14017b)) * 31) + java.lang.Boolean.hashCode(this.f14018c)) * 31) + this.f14019d.hashCode();
    }

    public java.lang.String toString() {
        return "Request(scene=" + this.f14016a + ", useCache=" + this.f14017b + ", alwaysDoScene=" + this.f14018c + ", callback=" + this.f14019d + ')';
    }
}
