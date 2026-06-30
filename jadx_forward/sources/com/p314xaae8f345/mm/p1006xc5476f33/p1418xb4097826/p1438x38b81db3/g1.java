package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class g1 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 f184969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f184971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f184972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j60 f184973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f184974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184977i;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f184969a = x1Var;
        this.f184970b = s0Var;
        this.f184971c = j17;
        this.f184972d = j18;
        this.f184973e = j60Var;
        this.f184974f = viewGroup;
        this.f184975g = view;
        this.f184976h = view2;
        this.f184977i = view3;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1.n(this.f184969a);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imageLoader: result:");
        sb6.append(bitmap != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var = this.f184969a;
        in5.s0 s0Var = this.f184970b;
        long j17 = this.f184971c;
        long j18 = this.f184972d;
        r45.j60 j60Var = this.f184973e;
        android.view.ViewGroup loadLayout = this.f184974f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadLayout, "$loadLayout");
        android.view.View loadProgress = this.f184975g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadProgress, "$loadProgress");
        android.view.View loadFailIcon = this.f184976h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailIcon, "$loadFailIcon");
        android.view.View loadFailText = this.f184977i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadFailText, "$loadFailText");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1.o(x1Var, s0Var, j17, j18, j60Var, loadLayout, loadProgress, loadFailIcon, loadFailText, bitmap != null);
    }
}
