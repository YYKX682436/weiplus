package rb2;

/* loaded from: classes10.dex */
public final class u1 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f475315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f475316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f475317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475319g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475320h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475321i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f475322j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f475323k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f475325m;

    public u1(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, long j19, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f475313a = z2Var;
        this.f475314b = s0Var;
        this.f475315c = j17;
        this.f475316d = j18;
        this.f475317e = j60Var;
        this.f475318f = viewGroup;
        this.f475319g = view;
        this.f475320h = view2;
        this.f475321i = view3;
        this.f475322j = j19;
        this.f475323k = h0Var;
        this.f475324l = str;
        this.f475325m = g0Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "imageLoader: download:" + z17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a c6478x668bc50a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a();
        c6478x668bc50a.q(pm0.v.u(this.f475316d));
        c6478x668bc50a.p(pm0.v.u(this.f475315c));
        c6478x668bc50a.f138219f = 2L;
        c6478x668bc50a.f138220g = !z17 ? 1L : 0L;
        c6478x668bc50a.f138221h = java.lang.System.currentTimeMillis() - this.f475322j;
        c6478x668bc50a.f138222i = c6478x668bc50a.b("Url", (java.lang.String) this.f475323k.f391656d, true);
        c6478x668bc50a.f138225l = c6478x668bc50a.b("Token", this.f475324l, true);
        c6478x668bc50a.f138223j = this.f475325m.f391654d;
        c6478x668bc50a.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2091L, z17 ? 2L : 3L, 1L, false);
        rb2.z2 z2Var = this.f475313a;
        in5.s0 s0Var = this.f475314b;
        long j17 = this.f475315c;
        long j18 = this.f475316d;
        r45.j60 j60Var = this.f475317e;
        android.view.ViewGroup loadLayout = this.f475318f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f475319g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f475320h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f475321i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailText, "$loadFailText");
        rb2.z2.B(z2Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, z17);
    }
}
