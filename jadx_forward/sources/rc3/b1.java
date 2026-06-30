package rc3;

/* loaded from: classes7.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.f1 f475485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f475489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f475490i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f475491m;

    public b1(rc3.f1 f1Var, int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f475485d = f1Var;
        this.f475486e = i17;
        this.f475487f = i18;
        this.f475488g = i19;
        this.f475489h = i27;
        this.f475490i = i28;
        this.f475491m = i29;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        rc3.f1 f1Var = this.f475485d;
        java.lang.String str = (java.lang.String) f1Var.f475526n.get(java.lang.Integer.valueOf(this.f475486e));
        if (str == null) {
            return;
        }
        sc3.k1 k1Var = (sc3.k1) f1Var.f475521f.mo146xb9724478(str);
        if (k1Var != null) {
            k1Var.H0().C3(this.f475486e, this.f475487f, this.f475488g, this.f475489h, this.f475490i, this.f475491m);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushPublicService", "onCanvasViewCreated ipc cost: " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
