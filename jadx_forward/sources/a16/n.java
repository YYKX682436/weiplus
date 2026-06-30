package a16;

/* loaded from: classes16.dex */
public final class n implements a16.r {

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f82188a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.m f82189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82190c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f82191d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.w f82192e;

    public n(a16.l c17, o06.m containingDeclaration, e16.w typeParameterOwner, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameterOwner, "typeParameterOwner");
        this.f82188a = c17;
        this.f82189b = containingDeclaration;
        this.f82190c = i17;
        java.util.List mo126782xb121b9ba = typeParameterOwner.mo126782xb121b9ba();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mo126782xb121b9ba, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = mo126782xb121b9ba.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i18));
            i18++;
        }
        this.f82191d = linkedHashMap;
        this.f82192e = ((e26.u) this.f82188a.f82182a.f82148a).d(new a16.m(this));
    }

    @Override // a16.r
    public o06.e2 a(e16.v javaTypeParameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaTypeParameter, "javaTypeParameter");
        b16.o1 o1Var = (b16.o1) ((e26.q) this.f82192e).mo146xb9724478(javaTypeParameter);
        return o1Var != null ? o1Var : this.f82188a.f82183b.a(javaTypeParameter);
    }
}
