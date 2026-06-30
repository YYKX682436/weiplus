package sj0;

/* loaded from: classes13.dex */
public class c implements sj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f489872a;

    /* renamed from: d, reason: collision with root package name */
    public double f489875d;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f489873b = new java.util.ArrayList(100);

    /* renamed from: c, reason: collision with root package name */
    public int f489874c = 0;

    /* renamed from: e, reason: collision with root package name */
    public double f489876e = 0.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f489877f = 2.147483647E9d;

    /* renamed from: g, reason: collision with root package name */
    public double f489878g = 0.0d;

    /* renamed from: h, reason: collision with root package name */
    public double f489879h = 0.0d;

    public c(android.content.Context context) {
        this.f489875d = 0.0d;
        this.f489872a = context;
        ((android.app.ActivityManager) context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        this.f489875d = ((r0.totalMem - r0.availMem) / 1024.0d) / 1024.0d;
    }

    public void a() {
        java.util.List list = this.f489873b;
        int size = ((java.util.ArrayList) list).size();
        this.f489874c = size;
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MemoryRecord", "hy: check frames 0!");
            return;
        }
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            java.lang.Double d17 = (java.lang.Double) it.next();
            valueOf = java.lang.Double.valueOf(valueOf.doubleValue() + d17.doubleValue());
            this.f489876e = java.lang.Math.max(this.f489876e, d17.doubleValue());
            this.f489877f = java.lang.Math.min(this.f489877f, d17.doubleValue());
        }
        java.lang.Double valueOf2 = java.lang.Double.valueOf(valueOf.doubleValue() / this.f489874c);
        double doubleValue = valueOf2.doubleValue();
        double d18 = this.f489875d;
        this.f489879h = doubleValue - d18;
        this.f489876e -= d18;
        this.f489877f -= d18;
        java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
        long j17 = 0;
        while (it6.hasNext()) {
            j17 = (long) (j17 + java.lang.Math.pow(((java.lang.Double) it6.next()).doubleValue() - valueOf2.doubleValue(), 2.0d));
        }
        this.f489878g = java.lang.Math.sqrt(j17 / this.f489874c);
    }
}
