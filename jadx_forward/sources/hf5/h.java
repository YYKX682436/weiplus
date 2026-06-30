package hf5;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f362776a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f362777b;

    public h(java.util.Collection values) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(values, "values");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.List Q = kz5.n0.Q(arrayList);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : Q) {
            java.lang.Character valueOf = java.lang.Character.valueOf(r26.p0.A0((java.lang.String) obj2));
            java.lang.Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new java.util.ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((java.util.List) obj3).add(obj2);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), kz5.n0.F0((java.util.List) entry.getValue(), new hf5.g()));
        }
        this.f362776a = linkedHashMap2;
        this.f362777b = linkedHashMap2.keySet();
    }

    public final java.lang.String a(java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        boolean z17 = false;
        if (i17 >= 0 && i17 < text.length()) {
            z17 = true;
        }
        java.lang.Object obj = null;
        if (!z17) {
            return null;
        }
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) this.f362776a).get(java.lang.Character.valueOf(text.charAt(i17)));
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (r26.i0.z(text, (java.lang.String) next, i17, false, 4, null)) {
                obj = next;
                break;
            }
        }
        return (java.lang.String) obj;
    }
}
