package uc5;

/* loaded from: classes10.dex */
public final class b implements uc5.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f508004a;

    public b(boolean z17) {
        this.f508004a = z17;
    }

    /* renamed from: equals */
    public boolean m167837xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uc5.b) && this.f508004a == ((uc5.b) obj).f508004a;
    }

    /* renamed from: hashCode */
    public int m167838x8cdac1b() {
        return java.lang.Boolean.hashCode(this.f508004a);
    }

    /* renamed from: toString */
    public java.lang.String m167839x9616526c() {
        return "SELECTING(isSelected=" + this.f508004a + ')';
    }
}
