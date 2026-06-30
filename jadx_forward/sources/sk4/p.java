package sk4;

/* loaded from: classes15.dex */
public final class p extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.t0 {

    /* renamed from: g, reason: collision with root package name */
    public boolean f490525g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f490526h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f490527i;

    /* renamed from: m, reason: collision with root package name */
    public long f490528m;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f490530o;

    /* renamed from: q, reason: collision with root package name */
    public tl.w f490532q;

    /* renamed from: r, reason: collision with root package name */
    public int f490533r;

    /* renamed from: d, reason: collision with root package name */
    public final int f490522d = 16000;

    /* renamed from: e, reason: collision with root package name */
    public final int f490523e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f490524f = -1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f490529n = new java.util.LinkedHashSet();

    /* renamed from: p, reason: collision with root package name */
    public final sk4.l f490531p = new sk4.l(this);

    @Override // jm4.t0
    public jm4.u0[] H9(long j17) {
        return new jm4.u0[0];
    }

    @Override // jm4.t0
    public void L0(jm4.y0 y0Var) {
        ((ku5.t0) ku5.t0.f394148d).h(new sk4.d(y0Var, this), "MicroMsg.AudioRecorderImpl");
    }

    @Override // jm4.t0
    public void Sh(yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", "start");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.app.w.INSTANCE.f135419h;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (!(activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (b3.l.m9698x3fed0563(context, "android.permission.RECORD_AUDIO") == 0) {
                pm0.v.X(new sk4.g(lVar, this));
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            pm0.v.X(new sk4.j(context));
            if (lVar != null) {
                lVar.mo146xb9724478("permission_denied");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", "startWithActivity");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a(activityC21401x6ce6f73f, "android.permission.RECORD_AUDIO", 80, "", "")) {
            pm0.v.X(new sk4.g(lVar, this));
            return;
        }
        activityC21401x6ce6f73f.m78748xe414e1d4(new sk4.n(activityC21401x6ce6f73f, this));
        if (lVar != null) {
            lVar.mo146xb9724478("permission_denied");
        }
    }

    @Override // jm4.t0
    public void Vb(yz5.l lVar) {
        this.f490530o = lVar;
    }

    @Override // jm4.t0
    public void Xe(jm4.y0 y0Var) {
        ((ku5.t0) ku5.t0.f394148d).h(new sk4.m(y0Var, this), "MicroMsg.AudioRecorderImpl");
    }

    @Override // jm4.t0
    /* renamed from: prepare */
    public void mo141134xed060d07() {
    }

    @Override // jm4.t0
    public double s9() {
        return 0.0d;
    }

    @Override // jm4.t0
    /* renamed from: stop */
    public void mo141135x360802() {
        ((ku5.t0) ku5.t0.f394148d).h(new sk4.o(this), "MicroMsg.AudioRecorderImpl");
    }
}
