package f26;

/* loaded from: classes16.dex */
public final class c1 extends f26.x implements f26.a3 {

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f340671e;

    /* renamed from: f, reason: collision with root package name */
    public final f26.o0 f340672f;

    public c1(f26.z0 delegate, f26.o0 enhancement) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enhancement, "enhancement");
        this.f340671e = delegate;
        this.f340672f = enhancement;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        f26.c3 c17 = f26.b3.c(this.f340671e.A0(z17), this.f340672f.z0().A0(z17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (f26.z0) c17;
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        f26.c3 c17 = f26.b3.c(this.f340671e.C0(newAttributes), this.f340672f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (f26.z0) c17;
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f340671e;
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        return new f26.c1(delegate, this.f340672f);
    }

    @Override // f26.x, f26.o0
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public f26.c1 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.c1((f26.z0) kotlinTypeRefiner.a(this.f340671e), kotlinTypeRefiner.a(this.f340672f));
    }

    @Override // f26.a3
    public f26.c3 P() {
        return this.f340671e;
    }

    @Override // f26.a3
    public f26.o0 j0() {
        return this.f340672f;
    }

    @Override // f26.z0
    /* renamed from: toString */
    public java.lang.String mo128943x9616526c() {
        return "[@EnhancedForWarnings(" + this.f340672f + ")] " + this.f340671e;
    }
}
