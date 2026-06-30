package f26;

/* loaded from: classes16.dex */
public final class a extends f26.x {

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f340652e;

    /* renamed from: f, reason: collision with root package name */
    public final f26.z0 f340653f;

    public a(f26.z0 delegate, f26.z0 abbreviation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abbreviation, "abbreviation");
        this.f340652e = delegate;
        this.f340653f = abbreviation;
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return new f26.a(this.f340652e.C0(newAttributes), this.f340653f);
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f340652e;
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        return new f26.a(delegate, this.f340653f);
    }

    @Override // f26.z0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public f26.a A0(boolean z17) {
        return new f26.a(this.f340652e.A0(z17), this.f340653f.A0(z17));
    }

    @Override // f26.x, f26.o0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public f26.a y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.a((f26.z0) kotlinTypeRefiner.a(this.f340652e), (f26.z0) kotlinTypeRefiner.a(this.f340653f));
    }
}
