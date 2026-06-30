package gi;

/* loaded from: classes12.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f353612a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f353613b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Runnable f353614c = gi.m0.f353603d;

    public static void a(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ThreadWatch", "removeCallStackSampling");
        android.os.Handler a17 = gi.k0.a();
        if (a17 != null) {
            a17.removeCallbacks(f353614c);
        }
        java.util.List list = f353613b;
        synchronized (list) {
            kz5.h0.B(list, new gi.o0(z17));
        }
    }
}
