package f26;

/* loaded from: classes16.dex */
public final class g0 extends f26.e0 implements f26.a3 {

    /* renamed from: g, reason: collision with root package name */
    public final f26.e0 f340696g;

    /* renamed from: h, reason: collision with root package name */
    public final f26.o0 f340697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f26.e0 origin, f26.o0 enhancement) {
        super(origin.f340686e, origin.f340687f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enhancement, "enhancement");
        this.f340696g = origin;
        this.f340697h = enhancement;
    }

    @Override // f26.c3
    public f26.c3 A0(boolean z17) {
        return f26.b3.c(this.f340696g.A0(z17), this.f340697h.z0().A0(z17));
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.g0((f26.e0) kotlinTypeRefiner.a(this.f340696g), kotlinTypeRefiner.a(this.f340697h));
    }

    @Override // f26.c3
    public f26.c3 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return f26.b3.c(this.f340696g.C0(newAttributes), this.f340697h);
    }

    @Override // f26.e0
    public f26.z0 D0() {
        return this.f340696g.D0();
    }

    @Override // f26.e0
    public java.lang.String E0(q16.s renderer, q16.c0 options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        return options.a() ? renderer.v(this.f340697h) : this.f340696g.E0(renderer, options);
    }

    @Override // f26.a3
    public f26.c3 P() {
        return this.f340696g;
    }

    @Override // f26.a3
    public f26.o0 j0() {
        return this.f340697h;
    }

    @Override // f26.e0
    /* renamed from: toString */
    public java.lang.String mo128948x9616526c() {
        return "[@EnhancedForWarnings(" + this.f340697h + ")] " + this.f340696g;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.g0((f26.e0) kotlinTypeRefiner.a(this.f340696g), kotlinTypeRefiner.a(this.f340697h));
    }
}
