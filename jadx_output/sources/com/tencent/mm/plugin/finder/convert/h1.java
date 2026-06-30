package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class h1 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x1 f103534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f103536c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f103537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f103538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f103539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103542i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f103543j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f103544k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103545l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f103546m;

    public h1(com.tencent.mm.plugin.finder.convert.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, long j19, kotlin.jvm.internal.h0 h0Var, java.lang.String str, kotlin.jvm.internal.g0 g0Var) {
        this.f103534a = x1Var;
        this.f103535b = s0Var;
        this.f103536c = j17;
        this.f103537d = j18;
        this.f103538e = j60Var;
        this.f103539f = viewGroup;
        this.f103540g = view;
        this.f103541h = view2;
        this.f103542i = view3;
        this.f103543j = j19;
        this.f103544k = h0Var;
        this.f103545l = str;
        this.f103546m = g0Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.finder.convert.x1.n(this.f103534a);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "imageLoader: download:" + z17);
        com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct finderCommentResourceLoadingStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct();
        finderCommentResourceLoadingStruct.q(pm0.v.u(this.f103537d));
        finderCommentResourceLoadingStruct.p(pm0.v.u(this.f103536c));
        finderCommentResourceLoadingStruct.f56686f = 2L;
        finderCommentResourceLoadingStruct.f56687g = !z17 ? 1L : 0L;
        finderCommentResourceLoadingStruct.f56688h = java.lang.System.currentTimeMillis() - this.f103543j;
        finderCommentResourceLoadingStruct.f56689i = finderCommentResourceLoadingStruct.b("Url", (java.lang.String) this.f103544k.f310123d, true);
        finderCommentResourceLoadingStruct.f56692l = finderCommentResourceLoadingStruct.b("Token", this.f103545l, true);
        finderCommentResourceLoadingStruct.f56690j = this.f103546m.f310121d;
        finderCommentResourceLoadingStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2091L, z17 ? 2L : 3L, 1L, false);
        com.tencent.mm.plugin.finder.convert.x1 x1Var = this.f103534a;
        in5.s0 s0Var = this.f103535b;
        long j17 = this.f103536c;
        long j18 = this.f103537d;
        r45.j60 j60Var = this.f103538e;
        android.view.ViewGroup loadLayout = this.f103539f;
        kotlin.jvm.internal.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f103540g;
        kotlin.jvm.internal.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f103541h;
        kotlin.jvm.internal.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f103542i;
        kotlin.jvm.internal.o.f(loadFailText, "$loadFailText");
        com.tencent.mm.plugin.finder.convert.x1.o(x1Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, z17);
    }
}
