package wi5;

/* loaded from: classes.dex */
public final class t0 extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f527874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f527875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f527876d;

    public t0(ri5.j item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f527874b = item;
        this.f527875c = i17;
        this.f527876d = i18;
    }

    /* renamed from: equals */
    public boolean m173854xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.t0)) {
            return false;
        }
        wi5.t0 t0Var = (wi5.t0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527874b, t0Var.f527874b) && this.f527875c == t0Var.f527875c && this.f527876d == t0Var.f527876d;
    }

    /* renamed from: hashCode */
    public int m173855x8cdac1b() {
        return (((this.f527874b.mo148315x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f527875c)) * 31) + java.lang.Integer.hashCode(this.f527876d);
    }

    /* renamed from: toString */
    public java.lang.String m173856x9616526c() {
        return "SelectUserAction(item=" + this.f527874b + ", position=" + this.f527875c + ", from=" + this.f527876d + ')';
    }
}
