package wl0;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f528530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.f f528533g;

    public e(wl0.f fVar, long j17, boolean z17, java.lang.String str) {
        this.f528533g = fVar;
        this.f528530d = j17;
        this.f528531e = z17;
        this.f528532f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.f65967x297eb8d7 = this.f528530d;
        b2Var.f65969x9de75411 = currentTimeMillis;
        b2Var.f65964x6f12d422 = i17;
        b2Var.f65965xd557edbc = i18;
        boolean z17 = this.f528531e;
        b2Var.f65966xff84aeb9 = z17 ? 1 : 0;
        b2Var.f65970x2262335f = 1;
        b2Var.f65963xf102ad1b = 1;
        b2Var.f65968x114ef53e = this.f528532f;
        if (z17) {
            this.f528533g.f528534a.f528551a.z0(b2Var);
        }
    }
}
