package x06;

/* loaded from: classes15.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final x06.c1 f532775a = new x06.c1(null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f532776b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f532777c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f532778d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f532779e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f532780f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f532781g;

    /* renamed from: h, reason: collision with root package name */
    public static final x06.b1 f532782h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f532783i;

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.Map f532784j;

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.List f532785k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.Map f532786l;

    static {
        java.util.Set<java.lang.String> D0 = kz5.z.D0(new java.lang.String[]{"containsAll", "removeAll", "retainAll"});
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(D0, 10));
        for (java.lang.String str : D0) {
            x06.c1 c1Var = f532775a;
            java.lang.String h17 = w16.e.BOOLEAN.h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getDesc(...)");
            arrayList.add(x06.c1.a(c1Var, "java/util/Collection", str, "Ljava/util/Collection;", h17));
        }
        f532776b = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x06.b1) it.next()).f532743e);
        }
        f532777c = arrayList2;
        java.util.List list = f532776b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList3.add(((x06.b1) it6.next()).f532740b.h());
        }
        g16.a1 a1Var = g16.a1.f349124a;
        x06.c1 c1Var2 = f532775a;
        java.lang.String g17 = a1Var.g("Collection");
        w16.e eVar = w16.e.BOOLEAN;
        java.lang.String h18 = eVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h18, "getDesc(...)");
        x06.b1 a17 = x06.c1.a(c1Var2, g17, "contains", "Ljava/lang/Object;", h18);
        x06.f1 f1Var = x06.f1.f532770g;
        jz5.l lVar = new jz5.l(a17, f1Var);
        java.lang.String g18 = a1Var.g("Collection");
        java.lang.String h19 = eVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h19, "getDesc(...)");
        jz5.l lVar2 = new jz5.l(x06.c1.a(c1Var2, g18, "remove", "Ljava/lang/Object;", h19), f1Var);
        java.lang.String g19 = a1Var.g("Map");
        java.lang.String h27 = eVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h27, "getDesc(...)");
        jz5.l lVar3 = new jz5.l(x06.c1.a(c1Var2, g19, "containsKey", "Ljava/lang/Object;", h27), f1Var);
        java.lang.String g27 = a1Var.g("Map");
        java.lang.String h28 = eVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h28, "getDesc(...)");
        jz5.l lVar4 = new jz5.l(x06.c1.a(c1Var2, g27, "containsValue", "Ljava/lang/Object;", h28), f1Var);
        java.lang.String g28 = a1Var.g("Map");
        java.lang.String h29 = eVar.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h29, "getDesc(...)");
        jz5.l lVar5 = new jz5.l(x06.c1.a(c1Var2, g28, "remove", "Ljava/lang/Object;Ljava/lang/Object;", h29), f1Var);
        jz5.l lVar6 = new jz5.l(x06.c1.a(c1Var2, a1Var.g("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), x06.f1.f532771h);
        x06.b1 a18 = x06.c1.a(c1Var2, a1Var.g("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        x06.f1 f1Var2 = x06.f1.f532768e;
        jz5.l lVar7 = new jz5.l(a18, f1Var2);
        jz5.l lVar8 = new jz5.l(x06.c1.a(c1Var2, a1Var.g("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), f1Var2);
        java.lang.String g29 = a1Var.g("List");
        w16.e eVar2 = w16.e.INT;
        java.lang.String h37 = eVar2.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h37, "getDesc(...)");
        x06.b1 a19 = x06.c1.a(c1Var2, g29, "indexOf", "Ljava/lang/Object;", h37);
        x06.f1 f1Var3 = x06.f1.f532769f;
        jz5.l lVar9 = new jz5.l(a19, f1Var3);
        java.lang.String g37 = a1Var.g("List");
        java.lang.String h38 = eVar2.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h38, "getDesc(...)");
        java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, new jz5.l(x06.c1.a(c1Var2, g37, "lastIndexOf", "Ljava/lang/Object;", h38), f1Var3));
        f532778d = k17;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(k17.size()));
        for (java.util.Map.Entry entry : k17.entrySet()) {
            linkedHashMap.put(((x06.b1) entry.getKey()).f532743e, entry.getValue());
        }
        f532779e = linkedHashMap;
        java.util.Set i17 = kz5.q1.i(f532778d.keySet(), f532776b);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it7 = i17.iterator();
        while (it7.hasNext()) {
            arrayList4.add(((x06.b1) it7.next()).f532740b);
        }
        f532780f = kz5.n0.X0(arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it8 = i17.iterator();
        while (it8.hasNext()) {
            arrayList5.add(((x06.b1) it8.next()).f532743e);
        }
        f532781g = kz5.n0.X0(arrayList5);
        x06.c1 c1Var3 = f532775a;
        w16.e eVar3 = w16.e.INT;
        java.lang.String h39 = eVar3.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h39, "getDesc(...)");
        x06.b1 a27 = x06.c1.a(c1Var3, "java/util/List", "removeAt", h39, "Ljava/lang/Object;");
        f532782h = a27;
        java.lang.String f17 = a1Var.f("Number");
        java.lang.String h47 = w16.e.BYTE.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h47, "getDesc(...)");
        jz5.l lVar10 = new jz5.l(x06.c1.a(c1Var3, f17, "toByte", "", h47), n16.g.k("byteValue"));
        java.lang.String f18 = a1Var.f("Number");
        java.lang.String h48 = w16.e.SHORT.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h48, "getDesc(...)");
        jz5.l lVar11 = new jz5.l(x06.c1.a(c1Var3, f18, "toShort", "", h48), n16.g.k("shortValue"));
        java.lang.String f19 = a1Var.f("Number");
        java.lang.String h49 = eVar3.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h49, "getDesc(...)");
        jz5.l lVar12 = new jz5.l(x06.c1.a(c1Var3, f19, "toInt", "", h49), n16.g.k("intValue"));
        java.lang.String f27 = a1Var.f("Number");
        java.lang.String h57 = w16.e.LONG.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h57, "getDesc(...)");
        jz5.l lVar13 = new jz5.l(x06.c1.a(c1Var3, f27, "toLong", "", h57), n16.g.k("longValue"));
        java.lang.String f28 = a1Var.f("Number");
        java.lang.String h58 = w16.e.FLOAT.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h58, "getDesc(...)");
        jz5.l lVar14 = new jz5.l(x06.c1.a(c1Var3, f28, "toFloat", "", h58), n16.g.k("floatValue"));
        java.lang.String f29 = a1Var.f("Number");
        java.lang.String h59 = w16.e.DOUBLE.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h59, "getDesc(...)");
        jz5.l lVar15 = new jz5.l(x06.c1.a(c1Var3, f29, "toDouble", "", h59), n16.g.k("doubleValue"));
        jz5.l lVar16 = new jz5.l(a27, n16.g.k("remove"));
        java.lang.String f37 = a1Var.f("CharSequence");
        java.lang.String h66 = eVar3.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h66, "getDesc(...)");
        java.lang.String h67 = w16.e.CHAR.h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h67, "getDesc(...)");
        java.util.Map k18 = kz5.c1.k(lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, new jz5.l(x06.c1.a(c1Var3, f37, "get", h66, h67), n16.g.k("charAt")));
        f532783i = k18;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kz5.b1.d(k18.size()));
        for (java.util.Map.Entry entry2 : k18.entrySet()) {
            linkedHashMap2.put(((x06.b1) entry2.getKey()).f532743e, entry2.getValue());
        }
        f532784j = linkedHashMap2;
        java.util.Map map = f532783i;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.util.Map.Entry entry3 : map.entrySet()) {
            x06.b1 b1Var = (x06.b1) entry3.getKey();
            n16.g name = (n16.g) entry3.getValue();
            java.lang.String classInternalName = b1Var.f532739a;
            java.lang.String parameters = b1Var.f532741c;
            java.lang.String returnType = b1Var.f532742d;
            b1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classInternalName, "classInternalName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameters, "parameters");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(returnType, "returnType");
            java.lang.String jvmDescriptor = name + '(' + parameters + ')' + returnType;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(classInternalName + '.' + jvmDescriptor);
        }
        java.util.Set keySet = f532783i.keySet();
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(keySet, 10));
        java.util.Iterator it9 = keySet.iterator();
        while (it9.hasNext()) {
            arrayList6.add(((x06.b1) it9.next()).f532740b);
        }
        f532785k = arrayList6;
        java.util.Set<java.util.Map.Entry> entrySet = f532783i.entrySet();
        java.util.ArrayList<jz5.l> arrayList7 = new java.util.ArrayList(kz5.d0.q(entrySet, 10));
        for (java.util.Map.Entry entry4 : entrySet) {
            arrayList7.add(new jz5.l(((x06.b1) entry4.getKey()).f532740b, entry4.getValue()));
        }
        int d17 = kz5.b1.d(kz5.d0.q(arrayList7, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(d17);
        for (jz5.l lVar17 : arrayList7) {
            linkedHashMap3.put((n16.g) lVar17.f384367e, (n16.g) lVar17.f384366d);
        }
        f532786l = linkedHashMap3;
    }
}
