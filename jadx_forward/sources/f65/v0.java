package f65;

/* loaded from: classes12.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f341523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f341525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f341526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f341527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f341528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f341529n;

    public v0(java.lang.String str, boolean z17, java.lang.String str2, long j17, long j18, long j19, boolean z18, long j27) {
        this.f341522d = str;
        this.f341523e = z17;
        this.f341524f = str2;
        this.f341525g = j17;
        this.f341526h = j18;
        this.f341527i = j19;
        this.f341528m = z18;
        this.f341529n = j27;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f341552a;
        f65.u0 u0Var = new f65.u0(this.f341523e, this.f341524f, this.f341525g, this.f341526h, this.f341527i, this.f341528m, this.f341529n);
        java.lang.String str = this.f341522d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79 a17 = f65.y0.a(y0Var, f65.y0.c(y0Var, str, u0Var));
        f65.w[] wVarArr = f65.w.f341530d;
        a17.f143156k = 1L;
        org.json.JSONObject jSONObject = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f143158m) ? new org.json.JSONObject() : new org.json.JSONObject(a17.f143158m);
        r45.pz6 d17 = y0Var.d(str);
        if (d17 != null) {
            jSONObject.put("isNewSend", d17.f465050t);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a17.f143158m = a17.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        a17.k();
    }
}
