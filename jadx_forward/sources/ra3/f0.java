package ra3;

/* loaded from: classes8.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f475029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f475030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ra3.g0 f475031g;

    public f0(ra3.g0 g0Var, android.content.Context context, java.lang.String str, long j17, long j18) {
        this.f475031g = g0Var;
        this.f475028d = str;
        this.f475029e = j17;
        this.f475030f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f475028d;
        ra3.g0 g0Var = this.f475031g;
        g0Var.getClass();
        long j17 = this.f475030f;
        long j18 = this.f475029e;
        try {
            if (java.lang.Math.abs(j17 - j18) > 10 || j17 - g0Var.f475033a <= 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (!(str.toLowerCase().contains("screenshot") || str.contains("截屏") || str.contains("截图")) || str.equals(g0Var.f475034b))) {
                str = null;
                j18 = 0;
            } else {
                g0Var.f475033a = j17;
                g0Var.f475034b = str;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppUtils", "summerscreenshot added path: " + str + ", time: " + j18);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.f7) g0Var.f475036d.get()).z0(str, j18, false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppUtils", "summerscreenshot fail e:" + th6.getMessage());
        }
    }
}
