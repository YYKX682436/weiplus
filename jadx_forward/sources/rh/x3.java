package rh;

/* loaded from: classes12.dex */
public class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.IBinder f477086a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.w3 f477087b;

    /* renamed from: c, reason: collision with root package name */
    public int f477088c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f477089d;

    /* renamed from: e, reason: collision with root package name */
    public rh.v3 f477090e;

    public x3(android.os.IBinder iBinder, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f477086a = iBinder;
        this.f477087b = new rh.w3(str, i17, str2, str3);
    }

    public void a(android.os.Handler handler) {
        java.lang.Runnable runnable = this.f477089d;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.f477089d = null;
        }
        rh.w3 w3Var = this.f477087b;
        w3Var.getClass();
        w3Var.f477077f = android.os.SystemClock.uptimeMillis();
    }

    /* renamed from: equals */
    public boolean m162381xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof rh.x3) {
            return this.f477086a.equals(obj);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m162382x8cdac1b() {
        return this.f477086a.hashCode();
    }
}
