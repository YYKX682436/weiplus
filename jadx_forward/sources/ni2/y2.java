package ni2;

/* loaded from: classes3.dex */
public class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419044a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f419045b;

    /* renamed from: c, reason: collision with root package name */
    public final qo0.c f419046c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f419047d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f419048e;

    /* renamed from: f, reason: collision with root package name */
    public int f419049f;

    /* renamed from: g, reason: collision with root package name */
    public int f419050g;

    public y2(java.lang.String TAG, android.content.Context context, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin, yz5.a closeBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeBlock, "closeBlock");
        this.f419044a = TAG;
        this.f419045b = context;
        this.f419046c = statusMonitor;
        this.f419047d = basePlugin;
        this.f419048e = closeBlock;
        this.f419050g = 1;
    }

    public void a(android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
    }

    public final void b() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = this.f419045b;
        gk2.e S0 = this.f419047d.S0();
        android.content.Context context2 = this.f419045b;
        java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ec6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573358ec4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        if (r4Var.B(context, S0, string, string2, new ni2.x2(this))) {
            this.f419048e.mo152xb9724478();
        } else {
            c();
        }
    }

    public final void c() {
        java.lang.String str = this.f419044a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "SHEET_MORE_ACTION_AUDIO_LINK");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f419047d;
        boolean z17 = false;
        if (!((mm2.o4) lVar.P0(mm2.o4.class)).k7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "skip apply mic, disable mic");
            android.content.Context context = this.f419045b;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573139dn2), 0).show();
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f419049f);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", this.f419050g);
        a(bundle);
        qo0.b bVar = qo0.b.F3;
        qo0.c cVar = this.f419046c;
        cVar.mo46557x60d69242(bVar, bundle);
        this.f419048e.mo152xb9724478();
        if (cVar.mo11219xd0598cf8() == 0) {
            if (this.f419050g != 2) {
                dk2.u4 u4Var = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
                if (u4Var != null && u4Var.k()) {
                    z17 = true;
                }
                if (!z17) {
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0.ik((ml2.r0) c17, ml2.n4.f409273g, null, 0, 6, null);
                    return;
                } else {
                    ml2.n4 n4Var = ml2.n4.f409270J;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 33");
                    i95.m c18 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    ml2.r0.ik((ml2.r0) c18, n4Var, null, 0, 6, null);
                    return;
                }
            }
            dk2.u4 u4Var2 = ((mm2.o4) lVar.S0().a(mm2.o4.class)).Z;
            if (u4Var2 != null && u4Var2.k()) {
                z17 = true;
            }
            if (z17) {
                ml2.n4 n4Var2 = ml2.n4.L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 35");
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.ik((ml2.r0) c19, n4Var2, null, 0, 6, null);
                return;
            }
            ml2.n4 n4Var3 = ml2.n4.A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 24");
            i95.m c27 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            ml2.r0.ik((ml2.r0) c27, n4Var3, null, 0, 6, null);
        }
    }
}
