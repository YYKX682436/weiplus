package y16;

/* loaded from: classes16.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y16.l f540495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y16.l lVar) {
        super(0);
        this.f540495d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Collection collection;
        y16.l lVar = this.f540495d;
        java.util.List h17 = lVar.h();
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.Collection a17 = lVar.f540499b.g().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSupertypes(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList2, y16.v.a(((f26.o0) it.next()).V(), null, null, 3, null));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (next instanceof o06.d) {
                arrayList3.add(next);
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            java.lang.Object next2 = it7.next();
            n16.g mo132800xfb82e301 = ((o06.d) next2).mo132800xfb82e301();
            java.lang.Object obj = linkedHashMap.get(mo132800xfb82e301);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(mo132800xfb82e301, obj);
            }
            ((java.util.List) obj).add(next2);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            n16.g gVar = (n16.g) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            for (java.lang.Object obj2 : list) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((o06.d) obj2) instanceof o06.n0);
                java.lang.Object obj3 = linkedHashMap2.get(valueOf);
                if (obj3 == null) {
                    obj3 = new java.util.ArrayList();
                    linkedHashMap2.put(valueOf, obj3);
                }
                ((java.util.List) obj3).add(obj2);
            }
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((java.lang.Boolean) entry2.getKey()).booleanValue();
                java.util.List list2 = (java.util.List) entry2.getValue();
                r16.x xVar = r16.x.f450212d;
                if (booleanValue) {
                    collection = new java.util.ArrayList();
                    for (java.lang.Object obj4 : h17) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.v) ((o06.n0) obj4)).mo132800xfb82e301(), gVar)) {
                            collection.add(obj4);
                        }
                    }
                } else {
                    collection = kz5.p0.f395529d;
                }
                xVar.h(gVar, list2, collection, lVar.f540499b, new y16.k(arrayList, lVar));
            }
        }
        return kz5.n0.t0(h17, o26.a.b(arrayList));
    }
}
