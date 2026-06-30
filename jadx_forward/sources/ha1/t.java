package ha1;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ha1.t f361320d = new ha1.t();

    public t() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List k17 = kz5.c0.k(ha1.i.f361302c, ha1.q.f361317c, ha1.r.f361318c, ha1.n.f361314c, ha1.p.f361316c, ha1.s.f361319c, ha1.o.f361315c);
        k17.add(ha1.j.f361309c);
        java.util.Collection values = ha1.l.f361310f.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        k17.addAll(values);
        jz5.g gVar = ha1.v.f361322b;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            java.lang.String d17 = ((ha1.v) it.next()).d();
            if (d17 != null) {
                linkedHashSet.contains(d17);
                linkedHashSet.add(d17);
            }
        }
        return k17;
    }
}
