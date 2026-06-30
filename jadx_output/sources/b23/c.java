package b23;

/* loaded from: classes.dex */
public final class c extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final int f17386b;

    public c(int i17) {
        this.f17386b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b23.c) && this.f17386b == ((b23.c) obj).f17386b;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f17386b);
    }

    public java.lang.String toString() {
        return "KeyboardChangeAction(height=" + this.f17386b + ')';
    }
}
