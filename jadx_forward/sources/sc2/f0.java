package sc2;

/* loaded from: classes2.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f487405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f487406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f487407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f487408i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f487409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487410n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487411o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(sc2.h1 h1Var, in5.s0 s0Var, int i17, int i18, r45.t01 t01Var, int i19, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, android.view.View view, xc2.p0 p0Var) {
        super(1);
        this.f487403d = h1Var;
        this.f487404e = s0Var;
        this.f487405f = i17;
        this.f487406g = i18;
        this.f487407h = t01Var;
        this.f487408i = i19;
        this.f487409m = c22801x87cbdc00;
        this.f487410n = view;
        this.f487411o = p0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lw2.m videoScaleCleanHelper;
        ey2.j1 info = (ey2.j1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        sc2.h1 h1Var = this.f487403d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h1Var.f487461w, "onPlayInfoUpdate");
        if (!la5.b.f399133a.g(true)) {
            in5.s0 s0Var = this.f487404e;
            if (s0Var.f374654e.getResources().getConfiguration().orientation == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = h1Var.Y;
                if (!((c15196x85976f5f == null || (videoScaleCleanHelper = c15196x85976f5f.getVideoScaleCleanHelper()) == null || !videoScaleCleanHelper.f403111c) ? false : true) && info.f338936b / 1000 > this.f487405f && info.f338937c > this.f487406g && (java.lang.System.currentTimeMillis() - info.f338938d) / 1000 >= this.f487407h.m75939xb282bd08(15) && info.f338935a - info.f338937c > this.f487408i) {
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f487409m;
                    if (!(c22801x87cbdc00 != null && c22801x87cbdc00.isRefreshing)) {
                        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.trm);
                        if (!(p17 != null && p17.getVisibility() == 0)) {
                            android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.trk);
                            if (!(p18 != null && p18.getVisibility() == 0)) {
                                pm0.v.X(new sc2.e0(h1Var, s0Var, this.f487410n, this.f487411o));
                                android.content.Context context = s0Var.f374654e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                pf5.z zVar = pf5.z.f435481a;
                                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                ((ey2.k1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(ey2.k1.class)).f338951e.remove(java.lang.Long.valueOf(h1Var.f84678f));
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
