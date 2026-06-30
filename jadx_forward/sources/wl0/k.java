package wl0;

/* loaded from: classes13.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f528545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.l f528548g;

    public k(wl0.l lVar, long j17, boolean z17, java.lang.String str) {
        this.f528548g = lVar;
        this.f528545d = j17;
        this.f528546e = z17;
        this.f528547f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.f65967x297eb8d7 = this.f528545d;
        b2Var.f65969x9de75411 = currentTimeMillis;
        b2Var.f65964x6f12d422 = i17;
        b2Var.f65965xd557edbc = i18;
        b2Var.f65966xff84aeb9 = this.f528546e ? 1 : 0;
        b2Var.f65970x2262335f = 2;
        b2Var.f65963xf102ad1b = 2;
        b2Var.f65968x114ef53e = this.f528547f;
        this.f528548g.f528549a.f528551a.z0(b2Var);
    }
}
