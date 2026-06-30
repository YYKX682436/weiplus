package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class h1 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 f185067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f185069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f185070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f185071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185074h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185075i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f185076j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f185077k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185078l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f185079m;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, long j19, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        this.f185067a = x1Var;
        this.f185068b = s0Var;
        this.f185069c = j17;
        this.f185070d = j18;
        this.f185071e = j60Var;
        this.f185072f = viewGroup;
        this.f185073g = view;
        this.f185074h = view2;
        this.f185075i = view3;
        this.f185076j = j19;
        this.f185077k = h0Var;
        this.f185078l = str;
        this.f185079m = g0Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1.n(this.f185067a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "imageLoader: download:" + z17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a c6478x668bc50a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a();
        c6478x668bc50a.q(pm0.v.u(this.f185070d));
        c6478x668bc50a.p(pm0.v.u(this.f185069c));
        c6478x668bc50a.f138219f = 2L;
        c6478x668bc50a.f138220g = !z17 ? 1L : 0L;
        c6478x668bc50a.f138221h = java.lang.System.currentTimeMillis() - this.f185076j;
        c6478x668bc50a.f138222i = c6478x668bc50a.b("Url", (java.lang.String) this.f185077k.f391656d, true);
        c6478x668bc50a.f138225l = c6478x668bc50a.b("Token", this.f185078l, true);
        c6478x668bc50a.f138223j = this.f185079m.f391654d;
        c6478x668bc50a.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2091L, z17 ? 2L : 3L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var = this.f185067a;
        in5.s0 s0Var = this.f185068b;
        long j17 = this.f185069c;
        long j18 = this.f185070d;
        r45.j60 j60Var = this.f185071e;
        android.view.ViewGroup loadLayout = this.f185072f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f185073g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f185074h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f185075i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailText, "$loadFailText");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1.o(x1Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, z17);
    }
}
