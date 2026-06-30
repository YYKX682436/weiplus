package xx5;

/* loaded from: classes13.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f539644a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f539645b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f539646c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f539647d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f539648e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f539649f = 1;

    public void a(boolean z17, int i17, java.lang.String str) {
        java.lang.String string;
        java.lang.String str2;
        this.f539644a = str;
        this.f539645b = i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f539647d = currentTimeMillis;
        this.f539648e = currentTimeMillis - this.f539646c;
        this.f539649f = z17 ? 1 : 2;
        int d17 = this.f539645b == 3 ? by5.e.d() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("20260502,");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d());
        sb6.append(",");
        sb6.append(this.f539644a);
        sb6.append(",");
        sb6.append(this.f539645b);
        sb6.append(",");
        sb6.append(this.f539646c);
        sb6.append(",");
        sb6.append(this.f539647d);
        sb6.append(",");
        sb6.append(this.f539648e);
        sb6.append(",");
        sb6.append(this.f539649f);
        sb6.append(",");
        sb6.append(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getPackageName());
        sb6.append(",");
        sb6.append(android.os.Looper.myLooper() != android.os.Looper.getMainLooper() ? 0 : 1);
        sb6.append(",");
        sb6.append(by5.a4.b());
        sb6.append(",");
        com.p314xaae8f345.p3210x3857dc.b.m().getClass();
        sb6.append(com.p314xaae8f345.p3210x3857dc.b.f301741b);
        sb6.append(",");
        if (android.text.TextUtils.isEmpty(by5.d.f117961d)) {
            android.os.Bundle bundle = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429514n;
            synchronized (bundle) {
                string = bundle.getString(com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25618xca866da5.f47003xb618721a, "");
            }
            by5.d.f117961d = string;
            if (android.text.TextUtils.isEmpty(string)) {
                by5.d.f117961d = android.os.Build.FINGERPRINT;
            }
            str2 = by5.d.f117961d;
        } else {
            str2 = by5.d.f117961d;
        }
        sb6.append(str2.replaceAll(",", " "));
        sb6.append(",");
        sb6.append(d17);
        java.lang.String sb7 = sb6.toString();
        by5.c4.f("KVReportForWebViewCore", "report:" + sb7);
        by5.s0.t(24761, sb7);
    }
}
