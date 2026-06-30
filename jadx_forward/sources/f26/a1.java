package f26;

/* loaded from: classes16.dex */
public final class a1 extends f26.z0 {

    /* renamed from: e, reason: collision with root package name */
    public final f26.c2 f340656e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f340657f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340658g;

    /* renamed from: h, reason: collision with root package name */
    public final y16.s f340659h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f340660i;

    public a1(f26.c2 constructor, java.util.List arguments, boolean z17, y16.s memberScope, yz5.l refinedTypeFactory) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberScope, "memberScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refinedTypeFactory, "refinedTypeFactory");
        this.f340656e = constructor;
        this.f340657f = arguments;
        this.f340658g = z17;
        this.f340659h = memberScope;
        this.f340660i = refinedTypeFactory;
        if (!(memberScope instanceof h26.h) || (memberScope instanceof h26.n)) {
            return;
        }
        throw new java.lang.IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + '\n' + constructor);
    }

    @Override // f26.c3
    /* renamed from: B0 */
    public f26.c3 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.z0 z0Var = (f26.z0) this.f340660i.mo146xb9724478(kotlinTypeRefiner);
        return z0Var == null ? this : z0Var;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return z17 == this.f340658g ? this : z17 ? new f26.x0(this) : new f26.v0(this);
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return newAttributes.m144937x7aab3243() ? this : new f26.b1(this, newAttributes);
    }

    @Override // f26.o0
    public y16.s V() {
        return this.f340659h;
    }

    @Override // f26.o0
    public java.util.List u0() {
        return this.f340657f;
    }

    @Override // f26.o0
    public f26.r1 v0() {
        f26.r1.f340747e.getClass();
        return f26.r1.f340748f;
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return this.f340656e;
    }

    @Override // f26.o0
    public boolean x0() {
        return this.f340658g;
    }

    @Override // f26.o0
    public f26.o0 y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        f26.z0 z0Var = (f26.z0) this.f340660i.mo146xb9724478(kotlinTypeRefiner);
        return z0Var == null ? this : z0Var;
    }
}
