package na3;

/* loaded from: classes7.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final na3.b a(java.lang.String webApiName) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webApiName, "webApiName");
        java.util.Iterator<E> it = na3.b.f417515h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((na3.b) obj).f417517e, webApiName)) {
                break;
            }
        }
        return (na3.b) obj;
    }
}
