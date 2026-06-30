package f26;

/* loaded from: classes16.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.l f340715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f26.l lVar) {
        super(1);
        this.f340715d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f26.h supertypes = (f26.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supertypes, "supertypes");
        f26.l lVar = this.f340715d;
        ((o06.b2) lVar.e()).getClass();
        java.util.Collection superTypes = supertypes.f340700a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(superTypes, "superTypes");
        boolean isEmpty = superTypes.isEmpty();
        java.util.Collection collection = superTypes;
        if (isEmpty) {
            f26.o0 d17 = lVar.d();
            java.util.Collection c17 = d17 != null ? kz5.b0.c(d17) : null;
            if (c17 == null) {
                c17 = kz5.p0.f395529d;
            }
            collection = c17;
        }
        java.util.List list = collection instanceof java.util.List ? (java.util.List) collection : null;
        if (list == null) {
            list = kz5.n0.S0(collection);
        }
        java.util.List g17 = lVar.g(list);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g17, "<set-?>");
        supertypes.f340701b = g17;
        return jz5.f0.f384359a;
    }
}
