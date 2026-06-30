package b23;

/* loaded from: classes.dex */
public final class d extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17387b;

    public d(boolean z17) {
        this.f17387b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b23.d) && this.f17387b == ((b23.d) obj).f17387b;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f17387b);
    }

    public java.lang.String toString() {
        return "SearchEditTextFocusChangeAction(hasFocus=" + this.f17387b + ')';
    }
}
