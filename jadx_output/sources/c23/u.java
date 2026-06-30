package c23;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public boolean f38057a;

    public u(boolean z17) {
        this.f38057a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c23.u) && this.f38057a == ((c23.u) obj).f38057a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f38057a);
    }

    public java.lang.String toString() {
        return "BooleanBox(value=" + this.f38057a + ')';
    }
}
