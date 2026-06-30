package o25;

/* loaded from: classes11.dex */
public class n2 {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f424098c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f424099a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f424100b;

    public n2(java.lang.String str) {
        this.f424100b = "";
        this.f424100b = str;
    }

    public final boolean a(java.lang.String str) {
        boolean z17 = f424098c;
        java.lang.String str2 = this.f424100b;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SplashOptimizing", "[%s], check cancel", str2);
            return false;
        }
        if (!this.f424099a) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SplashOptimizing", "[%s], recreate activity, skip this %s", str2, str);
        return true;
    }
}
