package u06;

/* loaded from: classes16.dex */
public abstract class k0 implements e16.u {
    @Override // e16.d
    public e16.a a(n16.c fqName) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.Iterator it = mo126781xa083c1ee().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u06.i.a(xz5.a.b(xz5.a.a(((u06.j) ((e16.a) obj)).f505043a))).b(), fqName)) {
                break;
            }
        }
        return (e16.a) obj;
    }

    public abstract java.lang.reflect.Type c();

    /* renamed from: equals */
    public boolean m167316xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof u06.k0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c(), ((u06.k0) obj).c());
    }

    /* renamed from: hashCode */
    public int m167317x8cdac1b() {
        return c().hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167318x9616526c() {
        return getClass().getName() + ": " + c();
    }
}
