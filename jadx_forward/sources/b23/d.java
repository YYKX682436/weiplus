package b23;

/* loaded from: classes.dex */
public final class d extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98920b;

    public d(boolean z17) {
        this.f98920b = z17;
    }

    /* renamed from: equals */
    public boolean m9642xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b23.d) && this.f98920b == ((b23.d) obj).f98920b;
    }

    /* renamed from: hashCode */
    public int m9643x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f98920b);
    }

    /* renamed from: toString */
    public java.lang.String m9644x9616526c() {
        return "SearchEditTextFocusChangeAction(hasFocus=" + this.f98920b + ')';
    }
}
