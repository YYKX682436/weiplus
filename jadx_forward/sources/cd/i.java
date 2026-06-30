package cd;

/* loaded from: classes9.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final cd.j a(java.lang.String value) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.util.Iterator<E> it = cd.j.f122050i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((cd.j) obj).f122051d, value)) {
                break;
            }
        }
        cd.j jVar = (cd.j) obj;
        return jVar == null ? cd.j.f122047f : jVar;
    }
}
