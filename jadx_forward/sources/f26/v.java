package f26;

/* loaded from: classes16.dex */
public final class v extends f26.x implements f26.s, i26.e {

    /* renamed from: g, reason: collision with root package name */
    public static final f26.u f340760g = new f26.u(null);

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f340761e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f340762f;

    public v(f26.z0 z0Var, boolean z17) {
        this.f340761e = z0Var;
        this.f340762f = z17;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return z17 ? this.f340761e.A0(z17) : this;
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return new f26.v(this.f340761e.C0(newAttributes), this.f340762f);
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f340761e;
    }

    @Override // f26.s
    public f26.o0 G(f26.o0 replacement) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replacement, "replacement");
        return f26.d1.a(replacement.z0(), this.f340762f);
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        return new f26.v(delegate, this.f340762f);
    }

    @Override // f26.s
    public boolean s0() {
        f26.z0 z0Var = this.f340761e;
        z0Var.w0();
        return z0Var.w0().i() instanceof o06.e2;
    }

    @Override // f26.z0
    /* renamed from: toString */
    public java.lang.String mo128943x9616526c() {
        return this.f340761e + " & Any";
    }

    @Override // f26.x, f26.o0
    public boolean x0() {
        return false;
    }
}
