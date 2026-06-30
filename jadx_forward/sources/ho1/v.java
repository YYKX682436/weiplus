package ho1;

/* loaded from: classes15.dex */
public final class v implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u0 {

    /* renamed from: c, reason: collision with root package name */
    public ro1.g f364364c;

    /* renamed from: d, reason: collision with root package name */
    public po1.d f364365d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f364366e;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 f364369h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f364370i;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f364362a = "MicroMsg.CustomRoamDiskImpl";

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f364363b = "Roam-Custom-Pool";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364367f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364368g = new java.util.concurrent.ConcurrentHashMap();

    public final boolean a(java.lang.Runnable runnable) {
        try {
            java.util.concurrent.ExecutorService executorService = this.f364366e;
            if (executorService == null) {
                return true;
            }
            executorService.execute(runnable);
            return true;
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f364362a, e17, java.lang.String.valueOf(runnable), new java.lang.Object[0]);
            return false;
        }
    }
}
