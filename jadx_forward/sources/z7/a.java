package z7;

/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final z7.l f551996a = new z7.d("null");

    /* renamed from: b, reason: collision with root package name */
    public static final z7.l f551997b = new z7.d("true");

    /* renamed from: c, reason: collision with root package name */
    public static final z7.l f551998c = new z7.d("false");

    public static z7.l a(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("string is null");
        }
        try {
            z7.j jVar = new z7.j(str);
            jVar.d();
            jVar.j();
            z7.l i17 = jVar.i();
            jVar.j();
            if (jVar.f552018h == -1) {
                return i17;
            }
            throw jVar.b("Unexpected character");
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static z7.l b(java.lang.String str) {
        return str == null ? f551996a : new z7.k(str);
    }
}
