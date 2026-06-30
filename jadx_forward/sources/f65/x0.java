package f65;

/* loaded from: classes12.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f341540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f341541g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f341542h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f341543i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f341544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f341545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341546o;

    public x0(java.lang.String str, int i17, int i18, long j17, long j18, long j19, boolean z17, long j27, java.lang.String str2) {
        this.f341538d = str;
        this.f341539e = i17;
        this.f341540f = i18;
        this.f341541g = j17;
        this.f341542h = j18;
        this.f341543i = j19;
        this.f341544m = z17;
        this.f341545n = j27;
        this.f341546o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f341552a;
        f65.w0 w0Var = new f65.w0(this.f341541g, this.f341542h, this.f341543i, this.f341544m, this.f341545n, this.f341546o);
        java.lang.String str = this.f341538d;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79 a17 = f65.y0.a(y0Var, f65.y0.c(y0Var, str, w0Var));
        org.json.JSONObject jSONObject = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f143158m) ? new org.json.JSONObject() : new org.json.JSONObject(a17.f143158m);
        jSONObject.put("cdnErrorCode", this.f341539e);
        f65.y0.b(y0Var, str, jSONObject);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a17.f143158m = a17.b("ExtraInfo", r26.i0.u(jSONObject2, ',', ';', false, 4, null), true);
        a17.f143157l = this.f341540f;
        f65.w[] wVarArr = f65.w.f341530d;
        a17.f143156k = 3L;
        a17.k();
        ((q04.r) f65.y0.f341553b).Ri(19, str);
    }
}
