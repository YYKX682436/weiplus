package kh;

/* loaded from: classes12.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.q3 f389430a = new kh.q3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f389431b = jz5.h.a(jz5.i.f384362d, kh.p3.f389421d);

    public final java.util.Map a() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) ph.a.a(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class);
        if (cVar == null) {
            return kz5.q0.f395534d;
        }
        java.util.List<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot> list = cVar.k(true).f134095h.f477093a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot : list) {
            kh.q3 q3Var = f389430a;
            java.lang.String name = threadJiffiesSnapshot.f134099c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
            int i17 = threadJiffiesSnapshot.f134098b;
            java.lang.String b17 = q3Var.b(name, i17);
            arrayList.add(b17 != null ? new kh.f3(b17, i17) : new kh.f3(name, i17));
        }
        kh.e3 e3Var = kh.e3.f389320a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            java.lang.String str3 = "Miss";
            if (!it.hasNext()) {
                break;
            }
            kh.f3 f3Var = (kh.f3) it.next();
            jz5.o a17 = kh.e3.f389320a.a(f3Var);
            if (a17 != null && (str2 = (java.lang.String) a17.f384374d) != null) {
                str3 = str2;
            }
            if (a17 == null || (str = (java.lang.String) a17.f384375e) == null) {
                str = "";
            }
            arrayList2.add(new jz5.l(str3, new jz5.l(f3Var, str)));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            java.lang.String str4 = (java.lang.String) ((jz5.l) next).f384366d;
            java.lang.Object obj = linkedHashMap.get(str4);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(str4, obj);
            }
            ((java.util.List) obj).add(next);
        }
        java.util.Set<java.util.Map.Entry> entrySet = linkedHashMap.entrySet();
        int d17 = kz5.b1.d(kz5.d0.q(entrySet, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it7 = iterable.iterator();
            while (it7.hasNext()) {
                arrayList3.add((jz5.l) ((jz5.l) it7.next()).f384367e);
            }
            linkedHashMap2.put(key, arrayList3);
        }
        java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap2.entrySet(), new kh.d3(new kh.c3("Bad", "Miss")));
        int d18 = kz5.b1.d(kz5.d0.q(F0, 10));
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(d18 >= 16 ? d18 : 16);
        for (java.util.Map.Entry entry2 : F0) {
            linkedHashMap3.put(entry2.getKey(), entry2.getValue());
        }
        int i18 = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a.f149056m0;
        return linkedHashMap3;
    }

    public final java.lang.String b(java.lang.String name, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        jz5.g gVar = f389431b;
        java.util.Iterator it = ((java.util.List) gVar.mo141623x754a37bb()).iterator();
        java.lang.String str = null;
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            kh.o3 o3Var = (kh.o3) it.next();
            java.lang.String a17 = o3Var.a(name, i17);
            if (a17 != null) {
                z17 = o3Var instanceof kh.n3;
                str = a17;
                break;
            }
            str = a17;
        }
        if (str == null || !z17) {
            return str;
        }
        java.util.Iterator it6 = ((java.util.List) gVar.mo141623x754a37bb()).iterator();
        while (it6.hasNext()) {
            java.lang.String a18 = ((kh.o3) it6.next()).a(str, i17);
            if (a18 != null) {
                return a18;
            }
        }
        return str;
    }
}
