package s63;

/* loaded from: classes8.dex */
public class b implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {

    /* renamed from: f, reason: collision with root package name */
    public static final s63.b f484945f = new s63.b();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f484946g = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f484948e = new s63.a(this);

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f484947d = new android.os.Handler(android.os.Looper.getMainLooper());

    public final java.lang.reflect.Method a(java.lang.Class cls, java.lang.Object... objArr) {
        java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("getDeclaredMethod", java.lang.String.class, java.lang.Class[].class);
        declaredMethod.setAccessible(true);
        return (java.lang.reflect.Method) declaredMethod.invoke(cls, objArr);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        this.f484947d.removeCallbacks(this.f484948e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DangerousRelease", "on foreground, processName = " + bm5.f1.a() + ", remove clear graphics task");
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        this.f484947d.postDelayed(this.f484948e, 30000L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DangerousRelease", "on background, processName = " + bm5.f1.a() + ", postDelay clear graphics task, delay = 30000");
    }
}
