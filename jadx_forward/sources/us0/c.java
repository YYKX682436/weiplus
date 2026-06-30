package us0;

/* loaded from: classes10.dex */
public final class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f511979n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ts0.r f511980a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f511981b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f511982c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f511983d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f511984e;

    /* renamed from: f, reason: collision with root package name */
    public vs0.l f511985f;

    /* renamed from: g, reason: collision with root package name */
    public float f511986g;

    /* renamed from: h, reason: collision with root package name */
    public float f511987h;

    /* renamed from: i, reason: collision with root package name */
    public int f511988i;

    /* renamed from: j, reason: collision with root package name */
    public int f511989j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f511990k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f511991l;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.ImageReader.OnImageAvailableListener f511992m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.os.Looper looper, android.content.Context mContext, ts0.r camera) {
        super(looper);
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(looper, "looper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(camera, "camera");
        this.f511980a = camera;
        this.f511981b = "MicroMsg.BaseCameraHandler";
        this.f511990k = true;
        this.f511991l = "auto";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCameraHandler", "init camera handler");
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraHandler");
        this.f511983d = handlerThread;
        handlerThread.start();
        this.f511982c = new android.os.Handler(handlerThread.getLooper());
        int[] iArr = it0.c.f376019a;
        wo.g1 g1Var = wo.v1.f529362i;
        if ((g1Var == null || (i17 = g1Var.f529242w) == -1 || i17 != 1) ? false : true) {
            this.f511985f = new vs0.l(mContext);
        }
        this.f511992m = new us0.b(this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what == 4354) {
            int i17 = this.f511988i;
            java.lang.String str = this.f511981b;
            ts0.r rVar = this.f511980a;
            if (i17 == 0 || this.f511989j == 0 || fp.h.a(14)) {
                this.f511990k = false;
                this.f511991l = rVar.n();
                this.f511990k = !rVar.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "triggerAutoFocus ret " + this.f511990k);
                return;
            }
            float f17 = this.f511986g;
            float f18 = this.f511987h;
            int i18 = this.f511988i;
            int i19 = this.f511989j;
            if (rVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "want to auto focus, but camera is null, do nothing");
            } else {
                if (!this.f511990k) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "auto focus not back");
                    return;
                }
                this.f511990k = false;
                this.f511991l = rVar.n();
                this.f511990k = rVar.y(this.f511980a.m(f17, f18, 1.25f, i18, i19), this.f511980a.m(f17, f18, 1.0f, i18, i19));
            }
        }
    }
}
