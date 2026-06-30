package nm;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final bm5.p1 f419969g = new nm.d();

    /* renamed from: a, reason: collision with root package name */
    public final nm.h f419970a = new nm.h(this, null);

    /* renamed from: b, reason: collision with root package name */
    public final nm.g f419971b = new nm.g(this);

    /* renamed from: c, reason: collision with root package name */
    public final android.app.Application[] f419972c = {null};

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean[] f419973d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f419974e = new java.util.ArrayList(32);

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f419975f = false;

    public static void a(nm.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] performAndCleanPendingActionsLocked: pending action count: %s.", java.lang.Integer.valueOf(((java.util.ArrayList) iVar.f419974e).size()));
        java.util.Iterator it = ((java.util.ArrayList) iVar.f419974e).iterator();
        while (it.hasNext()) {
            ((ku5.t0) ku5.t0.f394148d).h((java.lang.Runnable) it.next(), "FirstScreenArrangedTasks");
        }
        ((java.util.ArrayList) iVar.f419974e).clear();
    }
}
