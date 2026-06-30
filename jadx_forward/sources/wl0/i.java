package wl0;

/* loaded from: classes13.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f528540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.j f528543g;

    public i(wl0.j jVar, long j17, boolean z17, java.lang.String str) {
        this.f528543g = jVar;
        this.f528540d = j17;
        this.f528541e = z17;
        this.f528542f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.f65967x297eb8d7 = this.f528540d;
        b2Var.f65969x9de75411 = currentTimeMillis;
        b2Var.f65964x6f12d422 = i17;
        b2Var.f65965xd557edbc = i18;
        b2Var.f65966xff84aeb9 = this.f528541e ? 1 : 0;
        b2Var.f65970x2262335f = 2;
        b2Var.f65963xf102ad1b = 1;
        b2Var.f65968x114ef53e = this.f528542f;
        this.f528543g.f528544a.f528551a.z0(b2Var);
    }
}
