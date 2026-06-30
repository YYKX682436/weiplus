package n16;

/* loaded from: classes15.dex */
public abstract class k {
    static {
        new n16.c("java.lang").c(n16.g.k("annotation"));
    }

    public static final n16.b a(java.lang.String str) {
        n16.j.f415713a.getClass();
        return new n16.b(n16.j.f415714b, n16.g.k(str));
    }

    public static final n16.b b(java.lang.String str) {
        n16.j.f415713a.getClass();
        return new n16.b(n16.j.f415716d, n16.g.k(str));
    }

    public static final java.util.Map c(java.util.Map map) {
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        int d17 = kz5.b1.d(kz5.d0.q(entrySet, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : entrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        return linkedHashMap;
    }

    public static final n16.b d(n16.g gVar) {
        n16.j.f415713a.getClass();
        n16.b bVar = n16.j.f415721i;
        return new n16.b(bVar.h(), n16.g.k(gVar.i() + bVar.j().i()));
    }

    public static final n16.b e(java.lang.String str) {
        n16.j.f415713a.getClass();
        return new n16.b(n16.j.f415717e, n16.g.k(str));
    }

    public static final n16.b f(java.lang.String str) {
        n16.j.f415713a.getClass();
        return new n16.b(n16.j.f415715c, n16.g.k(str));
    }

    public static final n16.b g(n16.b bVar) {
        n16.j.f415713a.getClass();
        return new n16.b(n16.j.f415714b, n16.g.k("U" + bVar.j().i()));
    }
}
