package s16;

/* loaded from: classes16.dex */
public final class a extends f26.z0 implements i26.d {

    /* renamed from: e, reason: collision with root package name */
    public final f26.l2 f483719e;

    /* renamed from: f, reason: collision with root package name */
    public final s16.b f483720f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f483721g;

    /* renamed from: h, reason: collision with root package name */
    public final f26.r1 f483722h;

    public a(f26.l2 typeProjection, s16.b constructor, boolean z17, f26.r1 attributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeProjection, "typeProjection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributes, "attributes");
        this.f483719e = typeProjection;
        this.f483720f = constructor;
        this.f483721g = z17;
        this.f483722h = attributes;
    }

    @Override // f26.z0, f26.c3
    public f26.c3 A0(boolean z17) {
        if (z17 == this.f483721g) {
            return this;
        }
        return new s16.a(this.f483719e, this.f483720f, z17, this.f483722h);
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.l2 a17 = this.f483719e.a(kotlinTypeRefiner);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "refine(...)");
        return new s16.a(a17, this.f483720f, this.f483721g, this.f483722h);
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        if (z17 == this.f483721g) {
            return this;
        }
        return new s16.a(this.f483719e, this.f483720f, z17, this.f483722h);
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return new s16.a(this.f483719e, this.f483720f, this.f483721g, newAttributes);
    }

    @Override // f26.o0
    public y16.s V() {
        return h26.m.a(h26.i.f359869e, true, new java.lang.String[0]);
    }

    @Override // f26.z0
    /* renamed from: toString */
    public java.lang.String mo128943x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Captured(");
        sb6.append(this.f483719e);
        sb6.append(')');
        sb6.append(this.f483721g ? "?" : "");
        return sb6.toString();
    }

    @Override // f26.o0
    public java.util.List u0() {
        return kz5.p0.f395529d;
    }

    @Override // f26.o0
    public f26.r1 v0() {
        return this.f483722h;
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return this.f483720f;
    }

    @Override // f26.o0
    public boolean x0() {
        return this.f483721g;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.l2 a17 = this.f483719e.a(kotlinTypeRefiner);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "refine(...)");
        return new s16.a(a17, this.f483720f, this.f483721g, this.f483722h);
    }
}
