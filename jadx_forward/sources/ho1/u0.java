package ho1;

/* loaded from: classes5.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f364357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f364359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f364360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364361h;

    public u0(ho1.a1 a1Var, long j17, int i17, int i18, java.lang.String str) {
        this.f364357d = a1Var;
        this.f364358e = j17;
        this.f364359f = i17;
        this.f364360g = i18;
        this.f364361h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a.f174155v;
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a.f174155v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a activityC12848x9fd7b69a = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a) weakReference2.get() : null;
        boolean z17 = (activityC12848x9fd7b69a == null || activityC12848x9fd7b69a.isFinishing() || activityC12848x9fd7b69a.isDestroyed()) ? false : true;
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134272u && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364357d.f364155a, "Skip force notify, because RoamUI on foreground. pkgId=" + this.f364358e);
            return;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364357d.f364155a, "[For delete] do force notify, packageId=" + this.f364358e + ", deleteType=" + this.f364359f + ", errorCode=" + this.f364360g + ", title=" + this.f364361h);
        java.lang.String string = this.f364359f == 0 ? this.f364360g == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574382mw4) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574381mw3) : this.f364360g == 0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mw6) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574383mw5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        i13.q qVar = new i13.q(uuid, this.f364361h, string, java.lang.System.currentTimeMillis(), new ho1.t0(this.f364357d, this.f364358e, this.f364359f, context));
        k13.l1 l1Var = (k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi();
        l1Var.f(qVar);
        l1Var.c();
        ((ku5.t0) ku5.t0.f394148d).k(new ho1.s0(l1Var, qVar), 5000L);
    }
}
