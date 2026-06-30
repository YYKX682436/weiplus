package k31;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final k31.o f385383a = new k31.o();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f385384b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f385385c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f385386d = new java.util.HashMap();

    public final void a(l31.b task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (task.f396847b) {
            ((ku5.t0) ku5.t0.f394148d).h(new k31.k(task), "manager_thread");
        }
        ((ku5.t0) ku5.t0.f394148d).h(new k31.l(task), "manager_thread");
    }

    public final void b(k31.a storageManager, l31.b task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgStorageTaskManager", "runTask storageManager: %s, task className: %s, async: %b", java.lang.Integer.valueOf(storageManager.hashCode()), task.getClass().getSimpleName(), java.lang.Boolean.valueOf(task.f396847b));
        if (task.f396847b) {
            ((ku5.t0) ku5.t0.f394148d).h(new k31.n(storageManager, task), "manager_thread");
        } else {
            task.run();
            ((ku5.t0) ku5.t0.f394148d).h(new k31.i(task), "manager_thread");
        }
    }
}
