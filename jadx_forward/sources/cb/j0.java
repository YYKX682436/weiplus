package cb;

/* loaded from: classes13.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static cb.j0 f121664e;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f121665a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f121666b;

    /* renamed from: c, reason: collision with root package name */
    public cb.l0 f121667c = new cb.l0(this, null);

    /* renamed from: d, reason: collision with root package name */
    public int f121668d = 1;

    public j0(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.f121666b = scheduledExecutorService;
        this.f121665a = context.getApplicationContext();
    }

    public final synchronized com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5 a(cb.c cVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(cVar).length() + 9);
        }
        if (!this.f121667c.b(cVar)) {
            cb.l0 l0Var = new cb.l0(this, null);
            this.f121667c = l0Var;
            l0Var.b(cVar);
        }
        return cVar.f121640b.m19602xfb859dfb();
    }
}
