package k14;

/* loaded from: classes15.dex */
public class k implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final k14.u f384876d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f384877e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f384878f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f384879g;

    /* renamed from: h, reason: collision with root package name */
    public final int f384880h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f384881i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f384882m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f384883n;

    /* renamed from: o, reason: collision with root package name */
    public final int f384884o;

    /* renamed from: p, reason: collision with root package name */
    public final long f384885p;

    /* renamed from: q, reason: collision with root package name */
    public final long f384886q;

    /* renamed from: r, reason: collision with root package name */
    public final long f384887r;

    /* renamed from: s, reason: collision with root package name */
    public final long f384888s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f384889t;

    public k(android.content.Context context, int i17, int i18, long j17, long j18, k14.u uVar) {
        this.f384883n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f384889t = false;
        this.f384877e = context;
        this.f384876d = uVar;
        this.f384878f = null;
        this.f384880h = i17;
        this.f384884o = i18;
        this.f384886q = j17;
        this.f384885p = j18;
    }

    public final void a() {
        if (this.f384879g) {
            java.lang.Runnable runnable = this.f384882m;
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f384878f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f384878f = null;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f384881i);
        gm0.j1.n().f354821b.q(4071, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (!(m1Var instanceof k14.x) || m1Var.mo808xfb85f7b0() != 4071) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CheckFinderManagerSwithFun", "not expected scene,  type = " + m1Var.mo808xfb85f7b0());
            return;
        }
        a();
        k14.u uVar = this.f384876d;
        android.content.Context context = this.f384877e;
        if (i17 == 0 && i18 == 0) {
            r45.en0 en0Var = (r45.en0) ((k14.x) m1Var).f384934e.f152244b.f152233a;
            if (uVar != null) {
                uVar.a(context, true, en0Var);
                return;
            }
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.s(context, str, "");
        }
        if (uVar != null) {
            uVar.a(context, false, null);
        }
    }

    public k(android.content.Context context, int i17, int i18, long j17, long j18, k14.u uVar, boolean z17) {
        this.f384883n = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f384889t = false;
        this.f384877e = context;
        this.f384876d = uVar;
        this.f384878f = null;
        this.f384880h = i17;
        this.f384884o = i18;
        this.f384888s = j17;
        this.f384887r = j18;
        this.f384889t = z17;
    }
}
