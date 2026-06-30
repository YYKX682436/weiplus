package ni3;

/* loaded from: classes9.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f419264a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f419265b;

    /* renamed from: c, reason: collision with root package name */
    public int f419266c;

    /* renamed from: d, reason: collision with root package name */
    public final ni3.t0 f419267d;

    public s0(boolean z17, boolean z18, int i17, ni3.t0 loadParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadParams, "loadParams");
        this.f419264a = z17;
        this.f419265b = z18;
        this.f419266c = i17;
        this.f419267d = loadParams;
    }

    /* renamed from: equals */
    public boolean m149677xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.s0)) {
            return false;
        }
        ni3.s0 s0Var = (ni3.s0) obj;
        return this.f419264a == s0Var.f419264a && this.f419265b == s0Var.f419265b && this.f419266c == s0Var.f419266c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f419267d, s0Var.f419267d);
    }

    /* renamed from: hashCode */
    public int m149678x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f419264a) * 31) + java.lang.Boolean.hashCode(this.f419265b)) * 31) + java.lang.Integer.hashCode(this.f419266c)) * 31) + this.f419267d.m149681x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m149679x9616526c() {
        return "LoadLife(hitPreloadStart=" + this.f419264a + ", hitPreloadComplete=" + this.f419265b + ", loadFailReason=" + this.f419266c + ", loadParams=" + this.f419267d + ')';
    }
}
