package d40;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d40.m f307897d = new d40.m();

    public m() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20161xb87086c8());
        java.util.HashSet hashSet = new java.util.HashSet();
        if (f17 != null) {
            for (java.lang.String str : r26.n0.f0(f17, new java.lang.String[]{"/"}, false, 0, 6, null)) {
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                java.lang.String lowerCase = str.toLowerCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                hashSet.add(lowerCase);
            }
        }
        return hashSet;
    }
}
