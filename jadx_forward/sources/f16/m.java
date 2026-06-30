package f16;

/* loaded from: classes16.dex */
public final class m extends f26.x implements f26.w0 {

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f340286e;

    public m(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f340286e = delegate;
    }

    @Override // f26.z0, f26.c3
    public f26.c3 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return new f16.m(this.f340286e.C0(newAttributes));
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return z17 ? this.f340286e.A0(true) : this;
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return new f16.m(this.f340286e.C0(newAttributes));
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f340286e;
    }

    @Override // f26.s
    public f26.o0 G(f26.o0 replacement) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replacement, "replacement");
        f26.c3 z07 = replacement.z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(z07, "<this>");
        if (!f26.z2.g(z07) && !f26.z2.f(z07)) {
            return z07;
        }
        if (z07 instanceof f26.z0) {
            return I0((f26.z0) z07);
        }
        if (z07 instanceof f26.e0) {
            f26.e0 e0Var = (f26.e0) z07;
            return f26.b3.c(f26.r0.a(I0(e0Var.f340686e), I0(e0Var.f340687f)), f26.b3.a(z07));
        }
        throw new java.lang.IllegalStateException(("Incorrect type: " + z07).toString());
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        return new f16.m(delegate);
    }

    public final f26.z0 I0(f26.z0 z0Var) {
        f26.z0 A0 = z0Var.A0(false);
        return !f26.z2.g(z0Var) ? A0 : new f16.m(A0);
    }

    @Override // f26.s
    public boolean s0() {
        return true;
    }

    @Override // f26.x, f26.o0
    public boolean x0() {
        return false;
    }
}
