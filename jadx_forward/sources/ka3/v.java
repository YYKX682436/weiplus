package ka3;

/* loaded from: classes15.dex */
public final class v {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final ka3.w a(java.lang.String value) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.util.Iterator<E> it = ka3.w.f387644m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ka3.w) obj).f387645d, value)) {
                break;
            }
        }
        return (ka3.w) obj;
    }
}
