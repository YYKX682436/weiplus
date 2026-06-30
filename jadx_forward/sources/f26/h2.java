package f26;

/* loaded from: classes16.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final o06.e2 f340703a;

    /* renamed from: b, reason: collision with root package name */
    public final f26.c0 f340704b;

    public h2(o06.e2 typeParameter, f26.c0 typeAttr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameter, "typeParameter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAttr, "typeAttr");
        this.f340703a = typeParameter;
        this.f340704b = typeAttr;
    }

    /* renamed from: equals */
    public boolean m128953xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof f26.h2)) {
            return false;
        }
        f26.h2 h2Var = (f26.h2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h2Var.f340703a, this.f340703a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h2Var.f340704b, this.f340704b);
    }

    /* renamed from: hashCode */
    public int m128954x8cdac1b() {
        int hashCode = this.f340703a.hashCode();
        return hashCode + (hashCode * 31) + this.f340704b.mo14035x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m128955x9616526c() {
        return "DataToEraseUpperBound(typeParameter=" + this.f340703a + ", typeAttr=" + this.f340704b + ')';
    }
}
