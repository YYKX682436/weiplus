package xx5;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f539574a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f539575b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f539576c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f539577d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f539578e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f539579f = 1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f539580g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f539581h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f539582i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f539583j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f539584k = 0;

    public void a(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f539582i = currentTimeMillis;
        this.f539583j = currentTimeMillis - this.f539581h;
        this.f539584k = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(this.f539574a ? "1" : "0");
        sb6.append(",");
        sb6.append(this.f539575b);
        sb6.append(",");
        sb6.append(this.f539576c);
        sb6.append(",");
        sb6.append(this.f539581h);
        sb6.append(",");
        sb6.append(this.f539582i);
        sb6.append(",");
        sb6.append(this.f539583j);
        sb6.append(",");
        sb6.append(this.f539584k);
        sb6.append(",");
        sb6.append(this.f539577d);
        sb6.append(",");
        sb6.append(this.f539578e);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156975x966e5ddb());
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getPackageName());
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        sb6.append(this.f539579f != 1 ? "2" : "1");
        sb6.append(",");
        com.p314xaae8f345.p3210x3857dc.b.m().getClass();
        sb6.append(com.p314xaae8f345.p3210x3857dc.b.f301741b);
        sb6.append(",");
        sb6.append(this.f539580g);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForInstallRuntime", "report:" + sb7);
        by5.s0.t(24763, sb7);
    }

    public void b(zx5.f fVar) {
        java.lang.String str;
        this.f539574a = fVar.f558764d;
        this.f539575b = fVar.f558765e;
        this.f539576c = fVar.f558768h;
        this.f539577d = fVar.f558767g;
        this.f539579f = fVar.f558772l;
        try {
            str = fVar.b();
        } catch (java.lang.Exception unused) {
            str = "";
        }
        this.f539580g = str;
    }
}
