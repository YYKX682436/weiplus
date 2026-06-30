package cd;

/* loaded from: classes9.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final cd.j a(java.lang.String value) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(value, "value");
        java.util.Iterator<E> it = cd.j.f40517i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((cd.j) obj).f40518d, value)) {
                break;
            }
        }
        cd.j jVar = (cd.j) obj;
        return jVar == null ? cd.j.f40514f : jVar;
    }
}
