package wl0;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f528535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.h f528538g;

    public g(wl0.h hVar, long j17, boolean z17, java.lang.String str) {
        this.f528538g = hVar;
        this.f528535d = j17;
        this.f528536e = z17;
        this.f528537f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.f65967x297eb8d7 = this.f528535d;
        b2Var.f65969x9de75411 = currentTimeMillis;
        b2Var.f65964x6f12d422 = i17;
        b2Var.f65965xd557edbc = i18;
        boolean z17 = this.f528536e;
        b2Var.f65966xff84aeb9 = z17 ? 1 : 0;
        b2Var.f65970x2262335f = 1;
        b2Var.f65963xf102ad1b = 2;
        b2Var.f65968x114ef53e = this.f528537f;
        if (z17) {
            this.f528538g.f528539a.f528551a.z0(b2Var);
        }
    }
}
