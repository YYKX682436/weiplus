package bm5;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.v0 f22754a = new bm5.v0();

    public final void a(java.util.ArrayList customData, java.util.ArrayList customListData) {
        aq.d dVar;
        kotlin.jvm.internal.o.g(customData, "customData");
        kotlin.jvm.internal.o.g(customListData, "customListData");
        if ((!customListData.isEmpty()) && kotlin.jvm.internal.o.b(((aq.d) kz5.n0.i0(customListData)).f12849a, "BOTTOM")) {
            fp.l.b(customListData);
        }
        java.util.Iterator it = customData.iterator();
        while (it.hasNext()) {
            com.tencent.mm.api.QueryImageData queryImageData = (com.tencent.mm.api.QueryImageData) it.next();
            java.lang.String d17 = com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(queryImageData.f53204e), com.tencent.mm.sdk.platformtools.x2.f193071a);
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
                    if (kotlin.jvm.internal.o.b(dVar.f12849a, d17)) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                java.util.ArrayList arrayList = dVar.f12850b;
                if (arrayList.size() > 0) {
                    int indexOf = customListData.indexOf(dVar);
                    customListData.remove(indexOf);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.addAll(arrayList);
                    arrayList2.add(queryImageData);
                    customListData.add(indexOf, new aq.d(dVar.f12849a, arrayList2));
                }
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(queryImageData);
                customListData.add(new aq.d(d17, arrayList3));
            }
        }
    }
}
