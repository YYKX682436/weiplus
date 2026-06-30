package lx;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f403306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f403307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f403308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lx.i5 f403309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403310h;

    public g5(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, lx.m5 m5Var, java.lang.String str, lx.i5 i5Var, yz5.l lVar) {
        this.f403306d = c0Var;
        this.f403307e = m5Var;
        this.f403308f = str;
        this.f403309g = i5Var;
        this.f403310h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f403306d.f391645d) {
            return;
        }
        lx.m5.a(this.f403307e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback: timeout, removing callback");
        ft.q4 q4Var = (ft.q4) i95.n0.c(ft.q4.class);
        ((xc1.t) q4Var).Bi(this.f403308f, this.f403309g);
        this.f403310h.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("")));
    }
}
