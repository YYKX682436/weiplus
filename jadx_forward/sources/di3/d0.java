package di3;

/* loaded from: classes10.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f314225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f314227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ di3.e0 f314228h;

    public d0(di3.e0 e0Var, long j17, long j18, android.content.Context context, int i17) {
        this.f314228h = e0Var;
        this.f314224d = j17;
        this.f314225e = j18;
        this.f314226f = context;
        this.f314227g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f314224d);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Start Open Camera thread[parent:%d this:%d] time:%d", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f314225e));
        synchronized (this.f314228h.f314229a) {
            try {
                this.f314228h.f314231c = wo.i.d(this.f314226f, this.f314227g, android.os.Looper.getMainLooper());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "openCamera failed e:%s", e17.getMessage());
                this.f314228h.f314231c = null;
            }
            di3.e0 e0Var = this.f314228h;
            if (e0Var.f314230b && e0Var.f314231c != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "thread time out now, release camera :%d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f314225e));
                try {
                    wo.d1 d1Var = this.f314228h.f314231c.f529246a;
                    d1Var.g(null);
                    d1Var.l();
                    d1Var.d();
                    this.f314228h.f314231c = null;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "realease Camera failed e:%s", e18.getMessage());
                }
            }
            this.f314228h.f314229a.notify();
        }
    }
}
