package zl2;

/* loaded from: classes13.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f555213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f555214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zl2.e f555216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f555217h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, long j17, java.lang.String str, zl2.e eVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(0);
        this.f555213d = c0Var;
        this.f555214e = j17;
        this.f555215f = str;
        this.f555216g = eVar;
        this.f555217h = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f555213d;
        if (!c0Var.f391645d && t17 <= this.f555214e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCoroutineUtil", "onQuickCheck");
            pm0.z.b(xy2.b.f539688b, this.f555215f + "_notshow_quickcheck", false, null, null, false, false, null, 124, null);
            ((sb0.f) ((tb0.i) i95.n0.c(tb0.i.class))).Vi(this.f555216g);
            zl2.f.a(c0Var, this.f555217h, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u0(null));
        }
        return jz5.f0.f384359a;
    }
}
