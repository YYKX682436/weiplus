package m16;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f404418a = kz5.n0.g0(kz5.c0.i('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f404419b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List i17 = kz5.c0.i("Boolean", "Z", "Char", "C", "Byte", "B", "Short", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int a17 = sz5.b.a(0, i17.size() - 1, 2);
        if (a17 >= 0) {
            int i18 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = f404418a;
                sb6.append(str);
                sb6.append('/');
                sb6.append((java.lang.String) i17.get(i18));
                int i19 = i18 + 1;
                linkedHashMap.put(sb6.toString(), i17.get(i19));
                linkedHashMap.put(str + '/' + ((java.lang.String) i17.get(i18)) + "Array", "[" + ((java.lang.String) i17.get(i19)));
                if (i18 == a17) {
                    break;
                } else {
                    i18 += 2;
                }
            }
        }
        linkedHashMap.put(f404418a + "/Unit", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a);
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (java.lang.String str2 : kz5.c0.i("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (java.lang.String str3 : kz5.c0.i("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i27 = 0; i27 < 23; i27++) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.String str4 = f404418a;
            sb7.append(str4);
            sb7.append("/jvm/functions/Function");
            sb7.append(i27);
            a(linkedHashMap, "Function" + i27, sb7.toString());
            a(linkedHashMap, "reflect/KFunction" + i27, str4 + "/reflect/KFunction");
        }
        for (java.lang.String str5 : kz5.c0.i("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f404418a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f404419b = linkedHashMap;
    }

    public static final void a(java.util.Map map, java.lang.String str, java.lang.String str2) {
        map.put(f404418a + '/' + str, "L" + str2 + ';');
    }

    public static final java.lang.String b(java.lang.String classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) f404419b).get(classId);
        if (str != null) {
            return str;
        }
        return "L" + r26.i0.u(classId, '.', '$', false, 4, null) + ';';
    }
}
