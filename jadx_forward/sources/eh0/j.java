package eh0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f334420a = new java.util.concurrent.ConcurrentHashMap();

    public final eh0.i a(java.lang.String talker, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f334420a.get(talker);
        if (copyOnWriteArrayList == null) {
            return null;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            eh0.i iVar = (eh0.i) it.next();
            if (iVar.f334411a == j17 && iVar.f334419i == z17) {
                return iVar;
            }
        }
        return null;
    }
}
