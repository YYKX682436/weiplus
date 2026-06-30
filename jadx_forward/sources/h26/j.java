package h26;

/* loaded from: classes16.dex */
public final class j extends f26.z0 {

    /* renamed from: e, reason: collision with root package name */
    public final f26.c2 f359876e;

    /* renamed from: f, reason: collision with root package name */
    public final y16.s f359877f;

    /* renamed from: g, reason: collision with root package name */
    public final h26.l f359878g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f359879h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f359880i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String[] f359881m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f359882n;

    public j(f26.c2 constructor, y16.s memberScope, h26.l kind, java.util.List arguments, boolean z17, java.lang.String... formatParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberScope, "memberScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatParams, "formatParams");
        this.f359876e = constructor;
        this.f359877f = memberScope;
        this.f359878g = kind;
        this.f359879h = arguments;
        this.f359880i = z17;
        this.f359881m = formatParams;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(formatParams, formatParams.length);
        java.lang.String format = java.lang.String.format(kind.f359905d, java.util.Arrays.copyOf(copyOf, copyOf.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        this.f359882n = format;
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // f26.z0, f26.c3
    public f26.c3 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return this;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        f26.c2 c2Var = this.f359876e;
        y16.s sVar = this.f359877f;
        h26.l lVar = this.f359878g;
        java.util.List list = this.f359879h;
        java.lang.String[] strArr = this.f359881m;
        return new h26.j(c2Var, sVar, lVar, list, z17, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return this;
    }

    @Override // f26.o0
    public y16.s V() {
        return this.f359877f;
    }

    @Override // f26.o0
    public java.util.List u0() {
        return this.f359879h;
    }

    @Override // f26.o0
    public f26.r1 v0() {
        f26.r1.f340747e.getClass();
        return f26.r1.f340748f;
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return this.f359876e;
    }

    @Override // f26.o0
    public boolean x0() {
        return this.f359880i;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
