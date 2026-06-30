package y65;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f541198a = jz5.h.b(y65.a.f541196d);

    public final java.util.concurrent.PriorityBlockingQueue a() {
        return (java.util.concurrent.PriorityBlockingQueue) ((jz5.n) this.f541198a).mo141623x754a37bb();
    }

    public w65.m b(java.lang.String id6) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.util.Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((w65.m) obj).id(), id6)) {
                break;
            }
        }
        return (w65.m) obj;
    }

    public boolean c(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        return a().removeIf(new y65.b(id6));
    }
}
