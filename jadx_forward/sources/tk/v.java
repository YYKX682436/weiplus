package tk;

/* loaded from: classes7.dex */
public final class v {
    public v(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final tk.w a(java.lang.String str) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        java.util.Iterator<E> it = tk.w.f501414h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((tk.w) obj).f501415d, str)) {
                break;
            }
        }
        tk.w wVar = (tk.w) obj;
        return wVar == null ? tk.w.f501412f : wVar;
    }
}
