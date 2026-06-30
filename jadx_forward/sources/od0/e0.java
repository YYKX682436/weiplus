package od0;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f426069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f426071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ od0.v f426072h;

    public e0(od0.v vVar, java.lang.String str, long j17, java.lang.String str2, int i17) {
        this.f426072h = vVar;
        this.f426068d = str;
        this.f426069e = j17;
        this.f426070f = str2;
        this.f426071g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] d17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.d(this.f426068d, this.f426069e, this.f426070f, this.f426071g);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "get cssi failed");
                return;
            }
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(d17);
            k57Var.f459939s = cu5Var;
            this.f426072h.Ai(540999707, k57Var.mo14344x5f01b1f6(), false);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecInfoReporterImpl", "report cssi error: %s", th6.toString());
        }
    }
}
