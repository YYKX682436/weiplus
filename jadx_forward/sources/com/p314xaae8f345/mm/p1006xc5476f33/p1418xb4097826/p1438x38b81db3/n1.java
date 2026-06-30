package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f185594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f185595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 f185596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185597g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185598h;

    public n1(java.lang.Object obj, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var, in5.s0 s0Var, android.view.View view) {
        this.f185594d = obj;
        this.f185595e = z17;
        this.f185596f = x1Var;
        this.f185597g = s0Var;
        this.f185598h = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f185594d, 2) && this.f185595e) {
            android.content.Context context = this.f185597g.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.view.View recommendContainer = this.f185598h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recommendContainer, "$recommendContainer");
            this.f185596f.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COMMENT_RECOMMEND_TEACH_COUNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_COMMENT_RECOMMEND_TEACH_TIME_LONG_SYNC;
            long t17 = c18.t(u3Var2, 0L);
            if (r17 >= 3 || java.lang.System.currentTimeMillis() - t17 <= 60000) {
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
            gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm rmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rm(context, null);
            rmVar.setContentView(com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570321e64, (android.view.ViewGroup) null, false));
            if (((android.widget.TextView) rmVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.o5r)) != null) {
                rmVar.f214507m = 5000L;
                rmVar.f214505k = -context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                rmVar.c(recommendContainer);
            }
        }
    }
}
