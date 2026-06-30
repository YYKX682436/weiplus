package a16;

/* loaded from: classes16.dex */
public final class n implements a16.r {

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f655a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.m f656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f657c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f658d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.w f659e;

    public n(a16.l c17, o06.m containingDeclaration, e16.w typeParameterOwner, int i17) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.o.g(typeParameterOwner, "typeParameterOwner");
        this.f655a = c17;
        this.f656b = containingDeclaration;
        this.f657c = i17;
        java.util.List typeParameters = typeParameterOwner.getTypeParameters();
        kotlin.jvm.internal.o.g(typeParameters, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = typeParameters.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i18));
            i18++;
        }
        this.f658d = linkedHashMap;
        this.f659e = ((e26.u) this.f655a.f649a.f615a).d(new a16.m(this));
    }

    @Override // a16.r
    public o06.e2 a(e16.v javaTypeParameter) {
        kotlin.jvm.internal.o.g(javaTypeParameter, "javaTypeParameter");
        b16.o1 o1Var = (b16.o1) ((e26.q) this.f659e).invoke(javaTypeParameter);
        return o1Var != null ? o1Var : this.f655a.f650b.a(javaTypeParameter);
    }
}
