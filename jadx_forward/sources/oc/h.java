package oc;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public kc.c f425637c;

    /* renamed from: d, reason: collision with root package name */
    public volatile oc.c f425638d;

    /* renamed from: e, reason: collision with root package name */
    public mc.r f425639e;

    /* renamed from: h, reason: collision with root package name */
    public volatile android.os.HandlerThread f425642h;

    /* renamed from: i, reason: collision with root package name */
    public volatile oc.f f425643i;

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f425635a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f425636b = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f425640f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f425641g = false;

    /* renamed from: j, reason: collision with root package name */
    public long f425644j = 5000;

    public static void b(oc.h hVar) {
        if (hVar.f425637c != null) {
            int i17 = ic.d.f371814k;
            ic.d dVar = ic.c.f371813a;
            if (!dVar.f371822h) {
                dVar.b(213, "startLivenessConfig is null");
                return;
            }
            java.lang.String m21741x8b8572bc = com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21741x8b8572bc();
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p332xf5bc2045.InterfaceC2916x7b7d8c75 interfaceC2916x7b7d8c75 = dVar.f371821g;
            if (interfaceC2916x7b7d8c75 != null) {
                interfaceC2916x7b7d8c75.m21767xeee333c8(m21741x8b8572bc);
            }
        }
    }

    public final synchronized void a() {
        try {
        } catch (java.lang.Exception e17) {
            mc.p.f407064a.e("TuringSdkHelper", "quitHandlerThread error: " + e17.getLocalizedMessage());
        }
        if (this.f425643i == null) {
            return;
        }
        this.f425643i.removeMessages(3);
        this.f425643i.removeMessages(2);
        this.f425643i.removeMessages(3);
        this.f425643i.removeMessages(4);
        this.f425643i = null;
        if (this.f425642h != null && this.f425642h.isAlive()) {
            this.f425642h.quitSafely();
        }
    }

    public final void c() {
        this.f425638d = (oc.c) oc.b.class.newInstance();
        this.f425640f = true;
        mc.q qVar = mc.p.f407064a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("real init turing: ");
        sb6.append(this.f425640f);
        sb6.append(", ");
        sb6.append(this.f425638d == null);
        sb6.append(", [turing version]: ");
        if (!this.f425640f || this.f425638d == null) {
            qVar.e("TuringSdkHelper", "get version, turing is not create!");
        } else {
            this.f425638d.getClass();
        }
        sb6.append("");
        qVar.b("TuringSdkHelper", sb6.toString());
    }
}
