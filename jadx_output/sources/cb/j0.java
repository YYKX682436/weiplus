package cb;

/* loaded from: classes13.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static cb.j0 f40131e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f40132a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f40133b;

    /* renamed from: c, reason: collision with root package name */
    public cb.l0 f40134c = new cb.l0(this, null);

    /* renamed from: d, reason: collision with root package name */
    public int f40135d = 1;

    public j0(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f40133b = scheduledExecutorService;
        this.f40132a = context.getApplicationContext();
    }

    public final synchronized com.google.android.gms.tasks.Task a(cb.c cVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(cVar).length() + 9);
        }
        if (!this.f40134c.b(cVar)) {
            cb.l0 l0Var = new cb.l0(this, null);
            this.f40134c = l0Var;
            l0Var.b(cVar);
        }
        return cVar.f40107b.getTask();
    }
}
