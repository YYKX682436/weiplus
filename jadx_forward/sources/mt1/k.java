package mt1;

/* loaded from: classes12.dex */
public final class k implements uq3.f {

    /* renamed from: a, reason: collision with root package name */
    public static final mt1.k f412765a = new mt1.k();

    @Override // uq3.f
    public final java.util.Map a(java.lang.String str, int i17, java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Set b17 = mt1.b0.b(mt1.b0.f412724a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.Number) next).intValue() > 0) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            java.lang.Object first = ri.j.b(((java.lang.Number) kz5.n0.i0(arrayList)).intValue(), true).f404625a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
            linkedHashMap.put("leak-stack", first);
        }
        return linkedHashMap;
    }
}
