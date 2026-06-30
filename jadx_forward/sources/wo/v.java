package wo;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public int f529345a;

    /* renamed from: b, reason: collision with root package name */
    public long f529346b;

    /* renamed from: c, reason: collision with root package name */
    public long f529347c;

    /* renamed from: d, reason: collision with root package name */
    public final long f529348d;

    /* renamed from: e, reason: collision with root package name */
    public long f529349e;

    /* renamed from: f, reason: collision with root package name */
    public int f529350f;

    public v(wo.w wVar) {
        this.f529345a = 0;
        this.f529346b = 0L;
        this.f529347c = 0L;
        this.f529348d = 0L;
        this.f529349e = 0L;
        this.f529350f = 0;
    }

    public void a(java.lang.String[] strArr) {
        long parseLong = java.lang.Long.parseLong(strArr[4], 10);
        long j17 = 0;
        boolean z17 = true;
        for (java.lang.String str : strArr) {
            if (z17) {
                z17 = false;
            } else {
                j17 += java.lang.Long.parseLong(str, 10);
            }
        }
        long j18 = parseLong - this.f529347c;
        long j19 = j17 - this.f529346b;
        this.f529345a = (int) ((((float) (j19 - j18)) / ((float) j19)) * 100.0f);
        this.f529346b = j17;
        this.f529347c = parseLong;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(" MicroMsg.CpuUsage", "CpuUsageInfo(" + hashCode() + ") CPU total=" + j17 + "; idle=" + parseLong + "; usage=" + this.f529345a);
    }

    public v(wo.w wVar, long j17) {
        this.f529348d = j17;
    }
}
