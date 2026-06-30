package g06;

/* loaded from: classes15.dex */
public final /* synthetic */ class d extends p3321xbce91901.jvm.p3324x21ffc6bd.z {

    /* renamed from: e, reason: collision with root package name */
    public static final g06.d f349030e = new g06.d();

    @Override // f06.u
    public java.lang.Object get(java.lang.Object obj) {
        f06.d dVar = (f06.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        java.util.List a17 = dVar.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            f06.e i17 = ((i06.w3) ((f06.w) it.next())).i();
            f06.d dVar2 = i17 instanceof f06.d ? (f06.d) i17 : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e, f06.c
    /* renamed from: getName */
    public java.lang.String mo9624xfb82e301() {
        return "superclasses";
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getOwner */
    public f06.f mo9625x74f198fd() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.b(g06.f.class, "kotlin-reflection");
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: getSignature */
    public java.lang.String mo9626x3f6b0a02() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
