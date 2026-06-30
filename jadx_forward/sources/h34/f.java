package h34;

/* loaded from: classes15.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public tl.w f360047p;

    /* renamed from: t, reason: collision with root package name */
    public int f360051t;

    /* renamed from: v, reason: collision with root package name */
    public long f360053v;

    /* renamed from: w, reason: collision with root package name */
    public int f360054w;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f360038d = new byte[com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb];

    /* renamed from: e, reason: collision with root package name */
    public int f360039e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f360040f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f360041g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f360042h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f360043i = false;

    /* renamed from: m, reason: collision with root package name */
    public h34.j f360044m = null;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f360045n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public h34.s f360046o = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f360048q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f360049r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f360050s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f360052u = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f360055x = false;

    /* renamed from: y, reason: collision with root package name */
    public final tl.v f360056y = new h34.c(this);

    public static void a(h34.f fVar, r45.js5 js5Var, long j17, boolean z17) {
        synchronized (fVar) {
            if (fVar.f360055x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicFingerPrintRecorder", "hy: already call backed to UI");
            } else {
                fVar.f360046o.a(js5Var, j17, z17);
                fVar.f360055x = true;
            }
        }
    }

    public final void b() {
        tl.w wVar = this.f360047p;
        if (wVar != null) {
            wVar.l();
            this.f360047p = null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h34.d(this, false, false));
    }

    public boolean c() {
        c01.d9.e().q(367, this);
        c01.d9.e().q(408, this);
        synchronized (this.f360038d) {
            this.f360039e = 0;
        }
        tl.w wVar = this.f360047p;
        if (wVar == null) {
            return true;
        }
        wVar.l();
        this.f360047p = null;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 367 || m1Var.mo808xfb85f7b0() == 408) {
            this.f360048q = false;
            h34.j jVar = (h34.j) m1Var;
            if (jVar.f360077d) {
                c();
                this.f360044m = jVar;
                this.f360043i = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h34.d(this, false, false));
                return;
            }
            if (this.f360039e != 0 || !this.f360049r) {
                gm0.j1.e().j(new h34.e(this));
                return;
            }
            this.f360044m = null;
            this.f360043i = true;
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h34.d(this, false, false));
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new h34.d(this, false, true));
            }
            c01.d9.e().q(367, this);
            c01.d9.e().q(408, this);
        }
    }
}
