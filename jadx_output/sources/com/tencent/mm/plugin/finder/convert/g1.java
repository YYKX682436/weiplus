package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class g1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.x1 f103436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f103438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f103439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f103440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f103441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103443h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103444i;

    public g1(com.tencent.mm.plugin.finder.convert.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f103436a = x1Var;
        this.f103437b = s0Var;
        this.f103438c = j17;
        this.f103439d = j18;
        this.f103440e = j60Var;
        this.f103441f = viewGroup;
        this.f103442g = view;
        this.f103443h = view2;
        this.f103444i = view3;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.finder.convert.x1.n(this.f103436a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
        sb6.append(bitmap != null);
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", sb6.toString());
        com.tencent.mm.plugin.finder.convert.x1 x1Var = this.f103436a;
        in5.s0 s0Var = this.f103437b;
        long j17 = this.f103438c;
        long j18 = this.f103439d;
        r45.j60 j60Var = this.f103440e;
        android.view.ViewGroup loadLayout = this.f103441f;
        kotlin.jvm.internal.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f103442g;
        kotlin.jvm.internal.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f103443h;
        kotlin.jvm.internal.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f103444i;
        kotlin.jvm.internal.o.f(loadFailText, "$loadFailText");
        com.tencent.mm.plugin.finder.convert.x1.o(x1Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, bitmap != null);
    }
}
