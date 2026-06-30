package k5;

/* loaded from: classes13.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l5.m f385693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f385694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a5.o f385695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f385696g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.t f385697h;

    public s(k5.t tVar, l5.m mVar, java.util.UUID uuid, a5.o oVar, android.content.Context context) {
        this.f385697h = tVar;
        this.f385693d = mVar;
        this.f385694e = uuid;
        this.f385695f = oVar;
        this.f385696g = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!(this.f385693d.f398067d instanceof l5.c)) {
                java.lang.String uuid = this.f385694e.toString();
                a5.q0 f17 = ((j5.g0) this.f385697h.f385700c).f(uuid);
                if (f17 == null || f17.h()) {
                    throw new java.lang.IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((b5.e) this.f385697h.f385699b).e(uuid, this.f385695f);
                this.f385696g.startService(i5.d.b(this.f385696g, uuid, this.f385695f));
            }
            this.f385693d.i(null);
        } catch (java.lang.Throwable th6) {
            this.f385693d.j(th6);
        }
    }
}
