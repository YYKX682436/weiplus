package yj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f544208a;

    /* renamed from: b, reason: collision with root package name */
    public int f544209b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f544210c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f544211d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.HandlerThread f544212e;

    /* renamed from: f, reason: collision with root package name */
    public os0.c f544213f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f544214g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.q f544215h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f544216i;

    /* renamed from: j, reason: collision with root package name */
    public rs0.h f544217j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f544218k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f544219l;

    public g(int i17, int i18, yz5.l init) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(init, "init");
        this.f544208a = i17;
        this.f544209b = i18;
        this.f544210c = init;
        java.lang.String str = "MicroMsg.ScreenProjectCanvasRendererMgr" + hashCode();
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, 10);
        this.f544212e = a17;
        this.f544219l = jz5.h.b(yj3.b.f544203d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectCanvasRendererMgr", "device height is " + this.f544208a + " and " + this.f544209b);
        a17.start();
        this.f544211d = new android.os.Handler(a17.getLooper());
        a(new yj3.a(this));
    }

    public final void a(final yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!this.f544212e.isAlive()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenProjectCanvasRendererMgr", "queue in error");
        } else {
            this.f544211d.post(new java.lang.Runnable(callback) { // from class: yj3.d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f544205d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "function");
                    this.f544205d = callback;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f544205d.mo152xb9724478();
                }
            });
        }
    }

    public final void b(int i17, int i18) {
        os0.c cVar = this.f544213f;
        if (cVar != null) {
            cVar.w(i17, i18);
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f544214g;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
        if (i17 < i18) {
            os0.c cVar2 = this.f544213f;
            if (cVar2 != null) {
                cVar2.f429538n = 270;
            }
            if (cVar2 != null) {
                cVar2.f429539o = false;
            }
            if (cVar2 != null) {
                cVar2.f429540p = false;
            }
            if (cVar2 != null) {
                cVar2.u(i18, i17);
            }
            os0.c cVar3 = this.f544213f;
            if (cVar3 != null) {
                cVar3.t(i18, i17);
            }
        } else {
            os0.c cVar4 = this.f544213f;
            if (cVar4 != null) {
                cVar4.f429538n = 0;
            }
            if (cVar4 != null) {
                cVar4.f429540p = true;
            }
            if (cVar4 != null) {
                cVar4.f429539o = true;
            }
            if (cVar4 != null) {
                cVar4.u(i17, i18);
            }
            os0.c cVar5 = this.f544213f;
            if (cVar5 != null) {
                cVar5.t(i17, i18);
            }
        }
        this.f544208a = i17;
        this.f544209b = i18;
        os0.c cVar6 = this.f544213f;
        if (cVar6 != null) {
            cVar6.f429546v = true;
        }
    }
}
