package vo4;

/* loaded from: classes10.dex */
public class p extends vo4.t {

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f520198e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f520199f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f520200g;

    /* renamed from: h, reason: collision with root package name */
    public final int f520201h;

    /* renamed from: i, reason: collision with root package name */
    public final int f520202i;

    public p(int i17, int i18) {
        super(i17, i18);
        int i19 = pu5.i.f440006b;
        this.f520199f = pu5.f.a("VLogRemuxSurface_EncodeThread", -4);
    }

    @Override // vo4.t
    public void a(android.view.Surface surface) {
        this.f520223d = surface;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpenGL] init egl environment before, surface: ");
        sb6.append(surface);
        sb6.append(", eglEnv: ");
        rs0.h hVar = this.f520198e;
        sb6.append(hVar != null ? hVar.f480827c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", "initGL");
        android.os.HandlerThread handlerThread = this.f520199f;
        handlerThread.start();
        this.f520200g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
        b(new vo4.m(this));
    }

    @Override // vo4.t
    public void b(final yz5.a task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f520200g;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new java.lang.Runnable(task) { // from class: vo4.o

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f520197d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "function");
                    this.f520197d = task;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f520197d.mo152xb9724478();
                }
            });
        }
    }

    public p(int i17, int i18, int i19, int i27) {
        this(i17, i18);
        this.f520201h = i19;
        this.f520202i = i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLog.VLogRemuxSurface", "create VLogRemuxSurface, surface:[" + i17 + ", " + i18 + "], texture:[" + i19 + ", " + i27 + ']');
    }
}
