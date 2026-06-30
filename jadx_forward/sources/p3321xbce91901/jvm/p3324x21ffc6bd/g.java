package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes15.dex */
public final class g implements f06.d, p3321xbce91901.jvm.p3324x21ffc6bd.f {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f391650e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f391651f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f391652g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f391653d;

    static {
        int i17 = 0;
        java.util.List i18 = kz5.c0.i(yz5.a.class, yz5.l.class, yz5.p.class, yz5.q.class, yz5.r.class, yz5.s.class, yz5.t.class, yz5.u.class, yz5.v.class, yz5.w.class, yz5.b.class, yz5.c.class, yz5.d.class, yz5.e.class, yz5.f.class, yz5.g.class, yz5.h.class, yz5.i.class, yz5.j.class, yz5.k.class, yz5.m.class, yz5.n.class, yz5.o.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i18, 10));
        for (java.lang.Object obj : i18) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new jz5.l((java.lang.Class) obj, java.lang.Integer.valueOf(i17)));
            i17 = i19;
        }
        f391650e = kz5.c1.q(arrayList);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        java.util.Collection<java.lang.String> values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (java.lang.String str : values) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kotlin.jvm.internal.");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            sb6.append(r26.n0.o0(str, '.', str));
            sb6.append("CompanionObject");
            hashMap3.put(sb6.toString(), str.concat(".Companion"));
        }
        for (java.util.Map.Entry entry : f391650e.entrySet()) {
            java.lang.Class cls = (java.lang.Class) entry.getKey();
            int intValue = ((java.lang.Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f391651f = hashMap3;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(hashMap3.size()));
        for (java.util.Map.Entry entry2 : hashMap3.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.String str2 = (java.lang.String) entry2.getValue();
            linkedHashMap.put(key, r26.n0.o0(str2, '.', str2));
        }
        f391652g = linkedHashMap;
    }

    public g(java.lang.Class jClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        this.f391653d = jClass;
    }

    @Override // f06.d
    public java.util.List a() {
        throw new xz5.b();
    }

    @Override // f06.d
    public java.lang.String d() {
        java.lang.String str;
        java.lang.Class jClass = this.f391653d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        java.lang.String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean isArray = jClass.isArray();
        java.util.HashMap hashMap = f391651f;
        if (!isArray) {
            java.lang.String str3 = (java.lang.String) hashMap.get(jClass.getName());
            return str3 == null ? jClass.getCanonicalName() : str3;
        }
        java.lang.Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (java.lang.String) hashMap.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    @Override // f06.d
    public java.util.Collection e() {
        throw new xz5.b();
    }

    /* renamed from: equals */
    public boolean m143947xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof p3321xbce91901.jvm.p3324x21ffc6bd.g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xz5.a.c(this), xz5.a.c((f06.d) obj));
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.f
    public java.lang.Class f() {
        return this.f391653d;
    }

    @Override // f06.d
    public java.lang.String g() {
        java.lang.Class jClass = this.f391653d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        java.lang.String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            java.util.Map map = f391652g;
            if (!isArray) {
                java.lang.String str2 = (java.lang.String) ((java.util.LinkedHashMap) map).get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            java.lang.Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive()) {
                java.lang.String str3 = (java.lang.String) ((java.util.LinkedHashMap) map).get(componentType.getName());
                if (str3 != null) {
                    str = str3.concat("Array");
                }
            }
            return str == null ? "Array" : str;
        }
        java.lang.String simpleName = jClass.getSimpleName();
        java.lang.reflect.Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return r26.n0.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        java.lang.reflect.Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return r26.n0.n0(simpleName, '$', null, 2, null);
        }
        return r26.n0.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    /* renamed from: hashCode */
    public int m143948x8cdac1b() {
        return xz5.a.c(this).hashCode();
    }

    @Override // f06.d
    /* renamed from: isAbstract */
    public boolean mo128644x3801976c() {
        throw new xz5.b();
    }

    /* renamed from: toString */
    public java.lang.String m143949x9616526c() {
        return this.f391653d.toString() + " (Kotlin reflection is not available)";
    }
}
