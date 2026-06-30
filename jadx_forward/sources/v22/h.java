package v22;

/* loaded from: classes10.dex */
public final class h implements fp0.p {
    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        v22.g gVar;
        v22.m task = (v22.m) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.util.List<v22.g> list = v22.j.f514361e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getMixTasks$p(...)");
        synchronized (list) {
            gVar = null;
            for (v22.g gVar2 : list) {
                if (gVar2.f514347b == task.f514367h) {
                    gVar = gVar2;
                }
            }
        }
        if (gVar != null) {
            v22.j.f514361e.remove(gVar);
        }
        java.util.List list2 = v22.j.f514361e;
        if (list2.isEmpty()) {
            pm0.v.V(1000L, v22.j.f514360d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixManager", "onLoaderFin: " + status + ", " + list2.size());
    }
}
