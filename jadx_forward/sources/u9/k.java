package u9;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u9.j f507292a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f507293b;

    /* renamed from: c, reason: collision with root package name */
    public final long f507294c;

    /* renamed from: d, reason: collision with root package name */
    public final long f507295d;

    /* renamed from: e, reason: collision with root package name */
    public long f507296e;

    /* renamed from: f, reason: collision with root package name */
    public long f507297f;

    /* renamed from: g, reason: collision with root package name */
    public long f507298g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f507299h;

    /* renamed from: i, reason: collision with root package name */
    public long f507300i;

    /* renamed from: j, reason: collision with root package name */
    public long f507301j;

    /* renamed from: k, reason: collision with root package name */
    public long f507302k;

    public k(android.content.Context context) {
        double refreshRate = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay() != null ? r6.getDefaultDisplay().getRefreshRate() : -1.0d;
        boolean z17 = refreshRate != -1.0d;
        this.f507293b = z17;
        if (!z17) {
            this.f507292a = null;
            this.f507294c = -1L;
            this.f507295d = -1L;
        } else {
            this.f507292a = u9.j.f507287h;
            long j17 = (long) (1.0E9d / refreshRate);
            this.f507294c = j17;
            this.f507295d = (j17 * 80) / 100;
        }
    }
}
