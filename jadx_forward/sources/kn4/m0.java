package kn4;

/* loaded from: classes12.dex */
public class m0 implements kn4.w {

    /* renamed from: j, reason: collision with root package name */
    public static final int f391253j = android.os.Process.myUid();

    /* renamed from: a, reason: collision with root package name */
    public final kn4.c f391254a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f391255b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f391256c;

    /* renamed from: d, reason: collision with root package name */
    public long f391257d;

    /* renamed from: e, reason: collision with root package name */
    public long f391258e;

    /* renamed from: f, reason: collision with root package name */
    public long f391259f;

    /* renamed from: g, reason: collision with root package name */
    public long f391260g;

    /* renamed from: h, reason: collision with root package name */
    public long f391261h;

    /* renamed from: i, reason: collision with root package name */
    public long f391262i;

    public m0() {
        this.f391255b = false;
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.f391255b = true;
            this.f391254a = new kn4.z();
        }
        try {
            int i17 = f391253j;
            this.f391257d = android.net.TrafficStats.getUidRxBytes(i17);
            this.f391258e = android.net.TrafficStats.getUidTxBytes(i17);
            long mobileRxBytes = android.net.TrafficStats.getMobileRxBytes();
            long mobileTxBytes = android.net.TrafficStats.getMobileTxBytes();
            this.f391259f = android.net.TrafficStats.getTotalRxBytes() - mobileRxBytes;
            this.f391260g = android.net.TrafficStats.getTotalTxBytes() - mobileTxBytes;
            if (this.f391257d == -1 || this.f391258e == -1) {
                z17 = false;
            }
            this.f391256c = z17;
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TrafficStatsWrapper", e17.toString());
            this.f391256c = false;
        }
    }
}
