package kd2;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f388247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f388248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f388249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f388250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f388251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f388252i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f388253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f388254n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f388255o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f388256p;

    public d(kd2.q qVar, boolean z17, int i17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38) {
        this.f388247d = qVar;
        this.f388248e = z17;
        this.f388249f = i17;
        this.f388250g = z18;
        this.f388251h = z19;
        this.f388252i = z27;
        this.f388253m = z28;
        this.f388254n = z29;
        this.f388255o = z37;
        this.f388256p = z38;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kd2.q qVar = this.f388247d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMegaVideoMiniViewHelper", "addMiniView, no ball, ball: %s, view:%s", qVar.f174665d, qVar.k0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = qVar.f174665d;
        c12886x91aa2b6d.I = true;
        c12886x91aa2b6d.f174578J = false;
        c12886x91aa2b6d.H = this.f388248e ? 4 : 2048;
        c12886x91aa2b6d.f174583h = qVar.k0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = qVar.f174665d;
        c12886x91aa2b6d2.F = true;
        c12886x91aa2b6d2.f174586n = this.f388249f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d2.f174587o;
        ballButtonInfo.f174604f = this.f388250g;
        ballButtonInfo.f174603e = this.f388251h;
        ballButtonInfo.f174606h = this.f388252i;
        ballButtonInfo.f174609n = this.f388253m;
        ballButtonInfo.f174611p = this.f388254n;
        ballButtonInfo.f174613r = this.f388255o;
        ballButtonInfo.f174602d = this.f388256p;
        qVar.w0();
        qVar.f388327r.mo48813x58998cd();
        qVar.f388328s.mo48813x58998cd();
        qVar.f388329t.mo48813x58998cd();
        qVar.f388330u.mo48813x58998cd();
        qVar.f388331v.mo48813x58998cd();
        qVar.j();
    }
}
