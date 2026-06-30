package qh;

/* loaded from: classes12.dex */
public class f0 implements rh.r3, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.InterfaceC4634x2b4532bc, rh.t, rh.i3, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final qh.a0 f444868d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f444869e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f444870f;

    /* renamed from: g, reason: collision with root package name */
    public qh.d0 f444871g;

    /* renamed from: h, reason: collision with root package name */
    public qh.c0 f444872h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.Callable f444873i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f444874m = false;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f444875n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f444876o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f444877p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f444878q;

    /* renamed from: r, reason: collision with root package name */
    public final long f444879r;

    /* renamed from: s, reason: collision with root package name */
    public final long f444880s;

    /* renamed from: t, reason: collision with root package name */
    public final long f444881t;

    public f0(qh.a0 a0Var) {
        this.f444873i = new qh.b0(this);
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        this.f444876o = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u;
        this.f444868d = a0Var;
        qh.w wVar = a0Var.f444816b;
        if (wVar instanceof qh.v) {
            ((qh.v) wVar).i(this);
        }
        java.util.concurrent.Callable callable = a0Var.f444817c;
        if (callable != null) {
            this.f444873i = callable;
        }
        android.os.HandlerThread handlerThread = a0Var.f444815a;
        if (handlerThread != null) {
            this.f444869e = new android.os.Handler(handlerThread.getLooper(), this);
            this.f444870f = new android.os.Handler(handlerThread.getLooper(), this);
        } else {
            android.os.Handler handler = new android.os.Handler(oj.g.b().getLooper(), this);
            this.f444869e = handler;
            this.f444870f = handler;
        }
        boolean z17 = a0Var.f444826l;
        this.f444877p = z17;
        if (z17) {
            this.f444871g = new qh.d0(this, null);
        }
        this.f444878q = a0Var.f444827m;
        this.f444879r = a0Var.f444819e;
        this.f444880s = a0Var.f444820f;
        this.f444881t = a0Var.f444821g;
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f444839y).iterator();
        while (it.hasNext()) {
            ((rh.e3) it.next()).h(this);
        }
    }

    @Override // rh.i3
    public void a(rh.h3 h3Var) {
        this.f444868d.f444816b.a(h3Var);
    }

    @Override // rh.r3
    public void b(rh.w3 w3Var, long j17) {
        this.f444868d.f444816b.b(w3Var, j17);
    }

    public qh.a0 c() {
        return this.f444868d;
    }

    public android.content.Context d() {
        return ih.d.d().f373004b;
    }

    @Override // rh.t
    public void e(boolean z17, int i17, int i18, android.content.ComponentName componentName, long j17) {
        this.f444868d.f444816b.e(z17, i17, i18, componentName, j17);
    }

    @Override // rh.r3
    public void h(int i17, rh.w3 w3Var) {
        this.f444868d.f444816b.h(i17, w3Var);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            oj.j.a("Matrix.battery.BatteryMonitorCore", "#onTraceBegin", new java.lang.Object[0]);
            synchronized (qh.f0.class) {
                this.f444875n = true;
                this.f444868d.f444816b.d();
            }
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        boolean z17 = message.arg1 == 3;
        oj.j.a("Matrix.battery.BatteryMonitorCore", "#onTraceEnd", new java.lang.Object[0]);
        synchronized (qh.f0.class) {
            if (this.f444875n) {
                this.f444868d.f444816b.c(z17);
                this.f444875n = false;
            }
        }
        return true;
    }

    public rh.e3 i(java.lang.Class cls) {
        java.util.Iterator it = ((java.util.ArrayList) this.f444868d.f444839y).iterator();
        while (it.hasNext()) {
            rh.e3 e3Var = (rh.e3) it.next();
            if (cls.isAssignableFrom(e3Var.getClass())) {
                return e3Var;
            }
        }
        return null;
    }
}
