package b23;

/* loaded from: classes.dex */
public final class c extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final int f98919b;

    public c(int i17) {
        this.f98919b = i17;
    }

    /* renamed from: equals */
    public boolean m9639xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b23.c) && this.f98919b == ((b23.c) obj).f98919b;
    }

    /* renamed from: hashCode */
    public int m9640x8cdac1b() {
        return java.lang.Integer.hashCode(this.f98919b);
    }

    /* renamed from: toString */
    public java.lang.String m9641x9616526c() {
        return "KeyboardChangeAction(height=" + this.f98919b + ')';
    }
}
