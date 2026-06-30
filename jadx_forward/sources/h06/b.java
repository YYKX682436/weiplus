package h06;

/* loaded from: classes15.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final f06.d a(f06.e eVar) {
        o06.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        if (eVar instanceof f06.d) {
            return (f06.d) eVar;
        }
        if (!(eVar instanceof f06.x)) {
            throw new i06.a4("Cannot calculate JVM erasure for type: " + eVar);
        }
        f06.v vVar = i06.y3.f368334g[0];
        java.lang.Object mo152xb9724478 = ((i06.y3) ((f06.x) eVar)).f368336e.mo152xb9724478();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo152xb9724478, "getValue(...)");
        java.util.List list = (java.util.List) mo152xb9724478;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            f06.w wVar = (f06.w) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(wVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            o06.j i17 = ((i06.w3) wVar).f368313d.w0().i();
            gVar = i17 instanceof o06.g ? (o06.g) i17 : null;
            if ((gVar == null || gVar.j() == o06.h.f423494e || gVar.j() == o06.h.f423497h) ? false : true) {
                gVar = next;
                break;
            }
        }
        f06.w wVar2 = (f06.w) gVar;
        if (wVar2 == null) {
            wVar2 = (f06.w) kz5.n0.Z(list);
        }
        return wVar2 != null ? b(wVar2) : p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Object.class);
    }

    public static final f06.d b(f06.w wVar) {
        f06.d a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wVar, "<this>");
        f06.e i17 = ((i06.w3) wVar).i();
        if (i17 != null && (a17 = a(i17)) != null) {
            return a17;
        }
        throw new i06.a4("Cannot calculate JVM erasure for type: " + wVar);
    }
}
