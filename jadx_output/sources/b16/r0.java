package b16;

/* loaded from: classes15.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f17244a;

    /* renamed from: b, reason: collision with root package name */
    public final f26.o0 f17245b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f17246c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f17247d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17248e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f17249f;

    public r0(f26.o0 returnType, f26.o0 o0Var, java.util.List valueParameters, java.util.List typeParameters, boolean z17, java.util.List errors) {
        kotlin.jvm.internal.o.g(returnType, "returnType");
        kotlin.jvm.internal.o.g(valueParameters, "valueParameters");
        kotlin.jvm.internal.o.g(typeParameters, "typeParameters");
        kotlin.jvm.internal.o.g(errors, "errors");
        this.f17244a = returnType;
        this.f17245b = o0Var;
        this.f17246c = valueParameters;
        this.f17247d = typeParameters;
        this.f17248e = z17;
        this.f17249f = errors;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b16.r0)) {
            return false;
        }
        b16.r0 r0Var = (b16.r0) obj;
        return kotlin.jvm.internal.o.b(this.f17244a, r0Var.f17244a) && kotlin.jvm.internal.o.b(this.f17245b, r0Var.f17245b) && kotlin.jvm.internal.o.b(this.f17246c, r0Var.f17246c) && kotlin.jvm.internal.o.b(this.f17247d, r0Var.f17247d) && this.f17248e == r0Var.f17248e && kotlin.jvm.internal.o.b(this.f17249f, r0Var.f17249f);
    }

    public int hashCode() {
        int hashCode = this.f17244a.hashCode() * 31;
        f26.o0 o0Var = this.f17245b;
        return ((((((((hashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31) + this.f17246c.hashCode()) * 31) + this.f17247d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f17248e)) * 31) + this.f17249f.hashCode();
    }

    public java.lang.String toString() {
        return "MethodSignatureData(returnType=" + this.f17244a + ", receiverType=" + this.f17245b + ", valueParameters=" + this.f17246c + ", typeParameters=" + this.f17247d + ", hasStableParameterNames=" + this.f17248e + ", errors=" + this.f17249f + ')';
    }
}
