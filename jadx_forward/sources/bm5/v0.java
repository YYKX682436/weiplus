package bm5;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.v0 f104287a = new bm5.v0();

    public final void a(java.util.ArrayList customData, java.util.ArrayList customListData) {
        aq.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customData, "customData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customListData, "customListData");
        if ((!customListData.isEmpty()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((aq.d) kz5.n0.i0(customListData)).f94382a, "BOTTOM")) {
            fp.l.b(customListData);
        }
        java.util.Iterator it = customData.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = (com.p314xaae8f345.mm.api.C4988x89c61bdd) it.next();
            java.lang.String d17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(c4988x89c61bdd.f134737e), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (d17 == null) {
                d17 = "";
            }
            java.util.Iterator it6 = customListData.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    dVar = null;
                    break;
                } else {
                    dVar = (aq.d) it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f94382a, d17)) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                java.util.ArrayList arrayList = dVar.f94383b;
                if (arrayList.size() > 0) {
                    int indexOf = customListData.indexOf(dVar);
                    customListData.remove(indexOf);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.addAll(arrayList);
                    arrayList2.add(c4988x89c61bdd);
                    customListData.add(indexOf, new aq.d(dVar.f94382a, arrayList2));
                }
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(c4988x89c61bdd);
                customListData.add(new aq.d(d17, arrayList3));
            }
        }
    }
}
