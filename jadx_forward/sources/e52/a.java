package e52;

/* loaded from: classes12.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.ArrayList a(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        b(cls, linkedHashSet);
        return new java.util.ArrayList(linkedHashSet);
    }

    public final void b(java.lang.Class cls, java.util.HashSet hashSet) {
        while (cls != null) {
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaces);
            for (java.lang.Class<?> cls2 : interfaces) {
                if (hashSet.add(cls2)) {
                    b(cls2, hashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
