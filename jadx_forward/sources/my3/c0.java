package my3;

/* loaded from: classes13.dex */
public final class c0 {

    /* renamed from: k, reason: collision with root package name */
    public static final my3.u f414317k = new my3.u(null);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f414318l = jz5.h.b(my3.t.f414377d);

    /* renamed from: a, reason: collision with root package name */
    public gy3.a f414319a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 f414320b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f414321c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f414322d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414323e;

    /* renamed from: f, reason: collision with root package name */
    public my3.x f414324f;

    /* renamed from: g, reason: collision with root package name */
    public my3.v f414325g;

    /* renamed from: h, reason: collision with root package name */
    public my3.w f414326h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f414327i = "";

    /* renamed from: j, reason: collision with root package name */
    public boolean f414328j;

    public c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "init service");
        java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getString("patch_id", ""));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "load so patchId".concat(valueOf));
        ly3.m mVar = ly3.m.f403806a;
        java.lang.String str = ly3.g.f403787a;
        fp.d0.c(mVar.b("wechat_rtos_service", valueOf));
        fp.d0.o("wechat_rtos_service");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "finish load so");
    }

    public final synchronized void a() {
        gy3.d dVar;
        android.content.BroadcastReceiver broadcastReceiver;
        if (!this.f414322d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "already close");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onClose");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f414321c;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f414321c = null;
        gy3.a aVar = this.f414319a;
        if (aVar != null) {
            gy3.d dVar2 = (gy3.d) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "close");
            dVar2.a();
            dVar2.f359091f = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosBCChannel", "uninit");
            gy3.j jVar = dVar2.f359088c;
            if (jVar != null) {
                jVar.a();
            }
        }
        gy3.a aVar2 = this.f414319a;
        if (aVar2 != null && (broadcastReceiver = (dVar = (gy3.d) aVar2).f359096k) != null) {
            dVar.f359086a.unregisterReceiver(broadcastReceiver);
            dVar.f359096k = null;
        }
        this.f414319a = null;
        this.f414324f = null;
        this.f414325g = null;
        this.f414326h = null;
        this.f414322d = false;
        this.f414323e = false;
        this.f414328j = false;
        g32.c.c(g32.b.RTOS_SERVICE_DESTROY);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onClose end");
    }

    public final synchronized void b() {
        if (this.f414322d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "already init");
            return;
        }
        this.f414322d = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onInit");
        g32.c.c(g32.b.RTOS_SERVICE_CREATE);
        d();
        c();
        this.f414321c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new my3.y(this), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "init done");
    }

    public final void c() {
        if (this.f414320b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "initAlita");
            com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = new com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4();
            this.f414320b = c27663xee5e94d4;
            c27663xee5e94d4.m119285x6c4ebec7(new my3.a0(this));
            java.lang.String concat = "RTOS_".concat(wo.w0.k());
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(concat);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "rtosDeviceId = " + concat + " hw_device_id = " + a17);
            com.p314xaae8f345.mm.p642xad8b531f.s b17 = com.p314xaae8f345.mm.p642xad8b531f.s.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17.d(".com.tencent.mm.debug.log.mmlog")) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m1(b17.a(".com.tencent.mm.debug.test.uploadLog"), false);
            java.lang.String g07 = lp0.b.g0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "xlog_path = " + g07);
            jy3.f fVar = new jy3.f();
            fVar.f384040e = "";
            fVar.f384039d = "";
            fVar.f384050r = "";
            fVar.f384051s = "";
            java.lang.String absolutePath = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getCacheDir().getAbsolutePath();
            java.lang.String absolutePath2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "alita dir " + absolutePath2 + ' ' + absolutePath);
            fVar.f384040e = absolutePath;
            fVar.f384039d = absolutePath2;
            java.lang.String externalStorageState = android.os.Environment.getExternalStorageState();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mounted", externalStorageState) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("mounted_ro", externalStorageState)) {
                java.io.File externalFilesDir = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalFilesDir("");
                java.io.File externalCacheDir = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalCacheDir();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "external " + externalFilesDir + ' ' + externalCacheDir);
                if (externalFilesDir != null && externalCacheDir != null) {
                    fVar.f384050r = externalFilesDir.getAbsolutePath();
                    fVar.f384051s = externalCacheDir.getAbsolutePath();
                }
            }
            fVar.f384052t = g07;
            fVar.f384041f = a17;
            fVar.f384042g = "RtosWatch";
            fVar.f384043h = android.os.Build.BRAND;
            fVar.f384044i = wo.w0.m();
            fVar.f384045m = android.os.Build.VERSION.RELEASE;
            fVar.f384046n = 0;
            fVar.f384047o = z17;
            fVar.f384048p = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "begin start alita, isLogcatOpen " + z17);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d42 = this.f414320b;
            if (c27663xee5e94d42 != null) {
                c27663xee5e94d42.m119287x68ac462(fVar.mo14344x5f01b1f6());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "initAlita end, consume " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public final void d() {
        if (this.f414319a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "initChannel");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            gy3.d dVar = new gy3.d(context);
            this.f414319a = dVar;
            dVar.f359090e = new my3.b0(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "initChannel end");
        }
    }
}
