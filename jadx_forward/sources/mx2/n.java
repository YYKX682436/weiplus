package mx2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f414040a;

    /* renamed from: b, reason: collision with root package name */
    public final int f414041b;

    /* renamed from: c, reason: collision with root package name */
    public final int f414042c;

    /* renamed from: d, reason: collision with root package name */
    public final int f414043d;

    public n(int i17, int i18, int i19, int i27) {
        this.f414040a = i17;
        this.f414041b = i18;
        this.f414042c = i19;
        this.f414043d = i27;
    }

    /* renamed from: equals */
    public boolean m148547xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx2.n)) {
            return false;
        }
        mx2.n nVar = (mx2.n) obj;
        return this.f414040a == nVar.f414040a && this.f414041b == nVar.f414041b && this.f414042c == nVar.f414042c && this.f414043d == nVar.f414043d;
    }

    /* renamed from: hashCode */
    public int m148548x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f414040a) * 31) + java.lang.Integer.hashCode(this.f414041b)) * 31) + java.lang.Integer.hashCode(this.f414042c)) * 31) + java.lang.Integer.hashCode(this.f414043d);
    }

    /* renamed from: toString */
    public java.lang.String m148549x9616526c() {
        return "CalcContext(itemViewTopInWindow=" + this.f414040a + ", footerChildTopInItem=" + this.f414041b + ", defaultMargin=" + this.f414042c + ", safeSpacing=" + this.f414043d + ')';
    }
}
