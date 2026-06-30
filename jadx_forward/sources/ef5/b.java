package ef5;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ef5.b f334025a = new ef5.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f334026b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f334027c = jz5.h.b(ef5.a.f334024d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f334028d = new java.util.LinkedHashMap();

    static {
        java.util.Iterator it = kz5.c0.i("kotlin", "java", "python", "javascript", "json", "xml", "html", "sql").iterator();
        while (it.hasNext()) {
            f334025a.a((java.lang.String) it.next());
        }
    }

    public final gf5.n a(java.lang.String languageName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(languageName, "languageName");
        java.util.Map map = f334026b;
        if (map.containsKey(languageName)) {
            return (gf5.n) map.get(languageName);
        }
        ff5.b bVar = ff5.b.f343248a;
        java.util.Map map2 = ff5.b.f343253f;
        java.lang.String lowerCase = r26.n0.u0(languageName).toString().toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        gf5.n nVar = (gf5.n) ((lz5.m) map2).get(lowerCase);
        if (nVar != null) {
            map.put(languageName, nVar);
            f334028d.put(languageName, new hf5.a(nVar));
        }
        return nVar;
    }
}
