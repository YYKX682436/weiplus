package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f84129a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f84130b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f84131c = new java.util.HashMap();

    public static java.util.List a(java.lang.Class cls, java.lang.String str) {
        java.lang.String str2 = cls.getName() + "_" + str;
        java.util.Map map = f84130b;
        if (((java.util.HashMap) map).containsKey(str2)) {
            return (java.util.List) ((java.util.HashMap) map).get(str2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kg1.m.e(c(cls, str), new com.tencent.mm.plugin.appbrand.keylogger.a0(arrayList));
        ((java.util.HashMap) map).put(str2, arrayList);
        return arrayList;
    }

    public static java.lang.String b(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        java.util.Map map = f84129a;
        if (((java.util.HashMap) map).containsKey(name)) {
            return (java.lang.String) ((java.util.HashMap) map).get(name);
        }
        try {
            java.lang.String str = (java.lang.String) cls.getDeclaredField("NAME").get(null);
            ((java.util.HashMap) map).put(name, str);
            return str;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
            return null;
        }
    }

    public static kg1.m c(java.lang.Class cls, java.lang.String str) {
        java.lang.String str2 = cls.getName() + "—" + str;
        java.util.Map map = f84131c;
        if (((java.util.HashMap) map).containsKey(str2)) {
            return (kg1.m) ((java.util.HashMap) map).get(str2);
        }
        try {
            java.util.List list = (java.util.List) new d56.b(cls, cls).f("sStepNodes");
            if (list == null) {
                return null;
            }
            kg1.m c17 = kg1.m.c(list, str);
            ((java.util.HashMap) map).put(str2, c17);
            return c17;
        } catch (d56.c unused) {
            return null;
        }
    }
}
