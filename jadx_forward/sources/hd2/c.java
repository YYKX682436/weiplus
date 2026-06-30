package hd2;

/* loaded from: classes10.dex */
public final class c implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f361986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f361987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f361988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f361989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f361990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f361991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f361992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361994i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f361995j;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.ViewGroup viewGroup, android.widget.ProgressBar progressBar, android.widget.ImageView imageView, long j17, long j18, long j19, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f361986a = c14133xabc4217e;
        this.f361987b = viewGroup;
        this.f361988c = progressBar;
        this.f361989d = imageView;
        this.f361990e = j17;
        this.f361991f = j18;
        this.f361992g = j19;
        this.f361993h = str;
        this.f361994i = str2;
        this.f361995j = g0Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentShareDialogFragment", "imageLoader: download:" + z17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a c6478x668bc50a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a();
        c6478x668bc50a.q(pm0.v.u(this.f361990e));
        c6478x668bc50a.p(pm0.v.u(this.f361991f));
        c6478x668bc50a.f138219f = 2L;
        c6478x668bc50a.f138220g = !z17 ? 1L : 0L;
        c6478x668bc50a.f138221h = java.lang.System.currentTimeMillis() - this.f361992g;
        c6478x668bc50a.f138222i = c6478x668bc50a.b("Url", this.f361993h, true);
        c6478x668bc50a.f138225l = c6478x668bc50a.b("Token", this.f361994i, true);
        c6478x668bc50a.f138223j = this.f361995j.f391654d;
        c6478x668bc50a.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2091L, z17 ? 2L : 3L, 1L, false);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n;
        this.f361986a.getClass();
        pm0.v.X(new hd2.a(z17, this.f361987b, this.f361989d, this.f361988c));
    }
}
