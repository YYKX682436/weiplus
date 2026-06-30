package lx;

/* loaded from: classes4.dex */
public final class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f403277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f403280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f403281h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f403282i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403283m;

    public e5(lx.m5 m5Var, java.lang.String str, java.lang.String str2, long j17, long j18, long j19, yz5.l lVar) {
        this.f403277d = m5Var;
        this.f403278e = str;
        this.f403279f = str2;
        this.f403280g = j17;
        this.f403281h = j18;
        this.f403282i = j19;
        this.f403283m = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        long j17 = this.f403282i;
        long j18 = this.f403281h;
        long j19 = this.f403280g;
        java.lang.String str = this.f403279f;
        java.lang.String str2 = this.f403278e;
        lx.m5 m5Var = this.f403277d;
        try {
            lx.m5.a(m5Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "compressPublishImage: " + str2 + ", " + str + ", " + j19 + ", " + j18 + ", " + j17);
            z17 = lx.b6.a(str2, str, (int) j19, (int) j18, (int) j17);
        } catch (java.lang.Throwable th6) {
            lx.m5.a(m5Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizPublishPlugin", "compressPublishImage error: " + th6);
            z17 = false;
        }
        lx.m5.a(m5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizPublishPlugin", "compressPublishImage finish: " + str2 + ", " + str + ", " + j19 + ", " + j18 + ", " + j17);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f403283m.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17))));
    }
}
