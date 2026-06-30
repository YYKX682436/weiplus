package ts0;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.u f503098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f503099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f503100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f503101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f503102h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.Looper f503103i;

    public t(ts0.u uVar, long j17, long j18, android.content.Context context, int i17, android.os.Looper looper) {
        this.f503098d = uVar;
        this.f503099e = j17;
        this.f503100f = j18;
        this.f503101g = context;
        this.f503102h = i17;
        this.f503103i = looper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f503098d.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f503099e);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCamera.OpenCameraThread", "Start Open Camera thread[parent:%d this:%d] time:%d", valueOf, valueOf2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f503100f));
        ts0.u uVar = this.f503098d;
        java.lang.Object obj = uVar.f503104a;
        android.content.Context context = this.f503101g;
        int i17 = this.f503102h;
        android.os.Looper looper = this.f503103i;
        long j17 = this.f503100f;
        synchronized (obj) {
            try {
                uVar.f503106c = wo.i.d(context, i17, looper);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "openCamera failed e:%s", e17.getMessage());
                uVar.f503106c = null;
            }
            if (uVar.f503105b && uVar.f503106c != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "thread time out now, release camera :%d ", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                try {
                    wo.h hVar = uVar.f503106c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
                    wo.d1 d1Var = hVar.f529246a;
                    d1Var.g(null);
                    d1Var.l();
                    d1Var.d();
                    uVar.f503106c = null;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCamera.OpenCameraThread", "realease Camera failed e:%s", e18.getMessage());
                }
            }
            uVar.f503104a.notify();
        }
    }
}
