package kh;

/* loaded from: classes12.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.p2 f389418a = new kh.p2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f389419b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f389420c;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f389419b = jz5.h.a(iVar, kh.n2.f389405d);
        f389420c = jz5.h.a(iVar, kh.o2.f389412d);
    }

    public final void a(kh.e2 taskStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskStats, "taskStats");
        jz5.g gVar = f389420c;
        ((java.util.List) gVar.mo141623x754a37bb()).contains(taskStats);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskTrackerGlobal", "init TaskStats: " + taskStats.getClass().getName() + '@' + taskStats.hashCode());
        ((java.util.List) gVar.mo141623x754a37bb()).add(taskStats);
    }
}
