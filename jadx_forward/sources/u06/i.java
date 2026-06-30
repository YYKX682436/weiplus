package u06;

/* loaded from: classes15.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f505038a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f505039b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f505040c;

    static {
        int i17 = 0;
        java.util.List<f06.d> i18 = kz5.c0.i(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Boolean.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Byte.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Character.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Double.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Float.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Integer.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Long.TYPE), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(java.lang.Short.TYPE));
        f505038a = i18;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i18, 10));
        for (f06.d dVar : i18) {
            arrayList.add(new jz5.l(xz5.a.c(dVar), xz5.a.d(dVar)));
        }
        f505039b = kz5.c1.q(arrayList);
        java.util.List<f06.d> list = f505038a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (f06.d dVar2 : list) {
            arrayList2.add(new jz5.l(xz5.a.d(dVar2), xz5.a.c(dVar2)));
        }
        f505040c = kz5.c1.q(arrayList2);
        java.util.List i19 = kz5.c0.i(yz5.a.class, yz5.l.class, yz5.p.class, yz5.q.class, yz5.r.class, yz5.s.class, yz5.t.class, yz5.u.class, yz5.v.class, yz5.w.class, yz5.b.class, yz5.c.class, yz5.d.class, yz5.e.class, yz5.f.class, yz5.g.class, yz5.h.class, yz5.i.class, yz5.j.class, yz5.k.class, yz5.m.class, yz5.n.class, yz5.o.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(i19, 10));
        for (java.lang.Object obj : i19) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList3.add(new jz5.l((java.lang.Class) obj, java.lang.Integer.valueOf(i17)));
            i17 = i27;
        }
        kz5.c1.q(arrayList3);
    }

    public static final n16.b a(java.lang.Class cls) {
        n16.b a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            if (!(cls.getSimpleName().length() == 0)) {
                java.lang.Class<?> declaringClass = cls.getDeclaringClass();
                return (declaringClass == null || (a17 = a(declaringClass)) == null) ? n16.b.l(new n16.c(cls.getName())) : a17.d(n16.g.k(cls.getSimpleName()));
            }
        }
        n16.c cVar = new n16.c(cls.getName());
        return new n16.b(cVar.e(), n16.c.j(cVar.f()), true);
    }

    public static final java.lang.String b(java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return r26.i0.u(cls.getName(), '.', '/', false, 4, null);
            }
            return "L" + r26.i0.u(cls.getName(), '.', '/', false, 4, null) + ';';
        }
        java.lang.String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a;
                }
                break;
            case 64711720:
                if (name.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a;
                }
                break;
        }
        throw new java.lang.IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final java.util.List c(java.lang.reflect.Type type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "<this>");
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            return kz5.p0.f395529d;
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return q26.h0.y(q26.h0.m(q26.y.d(type, u06.g.f505034d), u06.h.f505036d));
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(actualTypeArguments, "getActualTypeArguments(...)");
        return kz5.z.z0(actualTypeArguments);
    }

    public static final java.lang.ClassLoader d(java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "<this>");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final boolean e(java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "<this>");
        return java.lang.Enum.class.isAssignableFrom(cls);
    }
}
