package ty2;

/* loaded from: classes9.dex */
public final class g extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final ty2.o f504599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f504640g, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f504599d = new ty2.o(context, a());
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ty2.c cVar = this.f504593c.f504664f;
        ty2.f fVar = cVar instanceof ty2.f ? (ty2.f) cVar : null;
        if (fVar == null) {
            fVar = new ty2.f(ty2.e.f504597d);
        }
        java.util.LinkedList linkedList = item.A;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getShowBoxItems(...)");
        java.util.List list = (java.util.List) fVar.f504598a.mo146xb9724478(linkedList);
        boolean isEmpty = list.isEmpty();
        ty2.o oVar = this.f504599d;
        if (isEmpty) {
            oVar.c();
            return null;
        }
        int i17 = this.f504593c.f504663e;
        oVar.getClass();
        oVar.c();
        oVar.f504628f = i17;
        java.util.List list2 = oVar.f504629g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((bw5.o5) obj).f112482d == 6) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ty2.k((bw5.o5) it.next(), oVar.f504627e.getAndIncrement(), null, null));
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
        arrayList3.addAll(arrayList2);
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ty2.k kVar = (ty2.k) it6.next();
            oVar.f504630h.put(java.lang.Integer.valueOf(kVar.f504607b), p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(oVar), null, null, new ty2.n(oVar, kVar, null), 3, null));
        }
        return oVar;
    }
}
