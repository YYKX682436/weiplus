package y16;

/* loaded from: classes16.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final y16.s a(java.lang.String debugName, java.lang.Iterable scopes) {
        y16.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(debugName, "debugName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopes, "scopes");
        o26.q qVar = new o26.q();
        java.util.Iterator it = scopes.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rVar = y16.r.f540506b;
            if (!hasNext) {
                break;
            }
            y16.s sVar = (y16.s) it.next();
            if (sVar != rVar) {
                if (sVar instanceof y16.c) {
                    kz5.h0.w(qVar, ((y16.c) sVar).f540461c);
                } else {
                    qVar.add(sVar);
                }
            }
        }
        int size = qVar.size();
        return size != 0 ? size != 1 ? new y16.c(debugName, (y16.s[]) qVar.toArray(new y16.s[0]), null) : (y16.s) qVar.get(0) : rVar;
    }
}
