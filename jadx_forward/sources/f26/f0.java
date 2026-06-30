package f26;

/* loaded from: classes16.dex */
public final class f0 extends f26.e0 implements f26.s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f26.z0 lowerBound, f26.z0 upperBound) {
        super(lowerBound, upperBound);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowerBound, "lowerBound");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upperBound, "upperBound");
    }

    @Override // f26.c3
    public f26.c3 A0(boolean z17) {
        return f26.r0.a(this.f340686e.A0(z17), this.f340687f.A0(z17));
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.f0((f26.z0) kotlinTypeRefiner.a(this.f340686e), (f26.z0) kotlinTypeRefiner.a(this.f340687f));
    }

    @Override // f26.c3
    public f26.c3 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return f26.r0.a(this.f340686e.C0(newAttributes), this.f340687f.C0(newAttributes));
    }

    @Override // f26.e0
    public f26.z0 D0() {
        return this.f340686e;
    }

    @Override // f26.e0
    public java.lang.String E0(q16.s renderer, q16.c0 options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        boolean c17 = options.c();
        f26.z0 z0Var = this.f340687f;
        f26.z0 z0Var2 = this.f340686e;
        if (!c17) {
            return renderer.s(renderer.v(z0Var2), renderer.v(z0Var), j26.c.e(this));
        }
        return "(" + renderer.v(z0Var2) + ".." + renderer.v(z0Var) + ')';
    }

    @Override // f26.s
    public f26.o0 G(f26.o0 replacement) {
        f26.c3 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replacement, "replacement");
        f26.c3 z07 = replacement.z0();
        if (z07 instanceof f26.e0) {
            a17 = z07;
        } else {
            if (!(z07 instanceof f26.z0)) {
                throw new jz5.j();
            }
            f26.z0 z0Var = (f26.z0) z07;
            a17 = f26.r0.a(z0Var, z0Var.A0(true));
        }
        return f26.b3.b(a17, z07);
    }

    @Override // f26.s
    public boolean s0() {
        f26.z0 z0Var = this.f340686e;
        return (z0Var.w0().i() instanceof o06.e2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var.w0(), this.f340687f.w0());
    }

    @Override // f26.e0
    /* renamed from: toString */
    public java.lang.String mo128948x9616526c() {
        return "(" + this.f340686e + ".." + this.f340687f + ')';
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.f0((f26.z0) kotlinTypeRefiner.a(this.f340686e), (f26.z0) kotlinTypeRefiner.a(this.f340687f));
    }
}
