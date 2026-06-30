package f16;

/* loaded from: classes16.dex */
public abstract class e {
    public final void a(java.lang.Object obj, java.util.List list, yz5.l lVar) {
        list.add(obj);
        java.lang.Iterable iterable = (java.lang.Iterable) lVar.mo146xb9724478(obj);
        if (iterable != null) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), list, lVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public final f16.o b(i26.n nVar) {
        boolean z17;
        boolean z18;
        boolean z19;
        ?? arrayList;
        boolean z27;
        g26.w wVar = g26.w.f349551a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nVar, "<this>");
        f16.o oVar = null;
        if (!(nVar instanceof b16.o1)) {
            return null;
        }
        java.util.List<i26.i> x17 = g26.b.x(wVar, nVar);
        if (!x17.isEmpty()) {
            java.util.Iterator it = x17.iterator();
            while (it.hasNext()) {
                if (!g26.b.H(wVar, (i26.i) it.next())) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            return null;
        }
        if (!x17.isEmpty()) {
            java.util.Iterator it6 = x17.iterator();
            while (it6.hasNext()) {
                if (c((i26.i) it6.next()) != null) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (!z18) {
            if (!x17.isEmpty()) {
                for (i26.i iVar : x17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
                    if (f26.b3.a((f26.o0) iVar) != null) {
                        z19 = true;
                        break;
                    }
                }
            }
            z19 = false;
            if (z19) {
                arrayList = new java.util.ArrayList();
                for (i26.i iVar2 : x17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar2, "<this>");
                    f26.o0 a17 = f26.b3.a((f26.o0) iVar2);
                    if (a17 != null) {
                        arrayList.add(a17);
                    }
                }
            }
            return oVar;
        }
        arrayList = x17;
        if (!arrayList.isEmpty()) {
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                if (!g26.b.N(wVar, (i26.i) it7.next())) {
                    z27 = false;
                    break;
                }
            }
        }
        z27 = true;
        oVar = new f16.o(z27 ? f16.n.f340289e : f16.n.f340290f, arrayList != x17);
        return oVar;
    }

    public final f16.n c(i26.i iVar) {
        g26.w wVar = g26.w.f349551a;
        if (g26.b.L(wVar, wVar.g0(iVar))) {
            return f16.n.f340289e;
        }
        if (g26.b.L(wVar, wVar.l0(iVar))) {
            return null;
        }
        return f16.n.f340290f;
    }

    public final java.util.List d(i26.i iVar) {
        g26.w wVar = g26.w.f349551a;
        a16.l lVar = ((f16.c1) this).f340243c;
        x06.l0 l0Var = (x06.l0) lVar.f82185d.mo141623x754a37bb();
        x06.e eVar = lVar.f82182a.f82164q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        f16.a aVar = new f16.a(iVar, eVar.b(l0Var, ((f26.o0) iVar).mo9601xa083c1ee()), null);
        f16.d dVar = new f16.d(this, wVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        a(aVar, arrayList, dVar);
        return arrayList;
    }
}
