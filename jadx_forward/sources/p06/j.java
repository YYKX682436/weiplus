package p06;

/* loaded from: classes16.dex */
public abstract class j {
    public static p06.c a(p06.k kVar, n16.c fqName) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        java.util.Iterator it = kVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p06.c) obj).a(), fqName)) {
                break;
            }
        }
        return (p06.c) obj;
    }

    public static boolean b(p06.k kVar, n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return kVar.a(fqName) != null;
    }
}
