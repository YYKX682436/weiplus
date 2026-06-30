package x06;

/* loaded from: classes16.dex */
public final class e extends x06.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x06.k0 javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    @Override // x06.b
    public java.lang.Iterable a(java.lang.Object obj, boolean z17) {
        p06.c cVar = (p06.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        java.util.Map c17 = cVar.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : c17.entrySet()) {
            kz5.h0.u(arrayList, (!z17 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b((n16.g) entry.getKey(), x06.p0.f532818b)) ? k((t16.g) entry.getValue()) : kz5.p0.f395529d);
        }
        return arrayList;
    }

    @Override // x06.b
    public n16.c e(java.lang.Object obj) {
        p06.c cVar = (p06.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        return cVar.a();
    }

    @Override // x06.b
    public java.lang.Iterable f(java.lang.Object obj) {
        p06.k mo9601xa083c1ee;
        p06.c cVar = (p06.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        o06.g d17 = v16.f.d(cVar);
        return (d17 == null || (mo9601xa083c1ee = d17.mo9601xa083c1ee()) == null) ? kz5.p0.f395529d : mo9601xa083c1ee;
    }

    public final java.util.List k(t16.g gVar) {
        if (!(gVar instanceof t16.b)) {
            return gVar instanceof t16.k ? kz5.b0.c(((t16.k) gVar).f496150c.i()) : kz5.p0.f395529d;
        }
        java.lang.Iterable iterable = (java.lang.Iterable) ((t16.b) gVar).f496146a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, k((t16.g) it.next()));
        }
        return arrayList;
    }
}
