package b16;

/* loaded from: classes15.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f98777a;

    /* renamed from: b, reason: collision with root package name */
    public final f26.o0 f98778b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f98779c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f98780d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98781e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f98782f;

    public r0(f26.o0 returnType, f26.o0 o0Var, java.util.List valueParameters, java.util.List typeParameters, boolean z17, java.util.List errors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(returnType, "returnType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueParameters, "valueParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameters, "typeParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errors, "errors");
        this.f98777a = returnType;
        this.f98778b = o0Var;
        this.f98779c = valueParameters;
        this.f98780d = typeParameters;
        this.f98781e = z17;
        this.f98782f = errors;
    }

    /* renamed from: equals */
    public boolean m9620xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b16.r0)) {
            return false;
        }
        b16.r0 r0Var = (b16.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98777a, r0Var.f98777a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98778b, r0Var.f98778b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98779c, r0Var.f98779c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98780d, r0Var.f98780d) && this.f98781e == r0Var.f98781e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f98782f, r0Var.f98782f);
    }

    /* renamed from: hashCode */
    public int m9621x8cdac1b() {
        int m128970x8cdac1b = this.f98777a.m128970x8cdac1b() * 31;
        f26.o0 o0Var = this.f98778b;
        return ((((((((m128970x8cdac1b + (o0Var == null ? 0 : o0Var.m128970x8cdac1b())) * 31) + this.f98779c.hashCode()) * 31) + this.f98780d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f98781e)) * 31) + this.f98782f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m9622x9616526c() {
        return "MethodSignatureData(returnType=" + this.f98777a + ", receiverType=" + this.f98778b + ", valueParameters=" + this.f98779c + ", typeParameters=" + this.f98780d + ", hasStableParameterNames=" + this.f98781e + ", errors=" + this.f98782f + ')';
    }
}
