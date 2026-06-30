package nj1;

/* loaded from: classes7.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f419335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f419336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f419337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419339i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419340m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sh1.f f419341n;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, android.view.View view, java.lang.String str, sh1.f fVar) {
        this.f419334d = h0Var;
        this.f419335e = surfaceTexture;
        this.f419336f = i17;
        this.f419337g = i18;
        this.f419338h = h0Var2;
        this.f419339i = view;
        this.f419340m = str;
        this.f419341n = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.graphics.SurfaceTexture surfaceTexture = this.f419335e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l(context, surfaceTexture);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f419334d;
        h0Var.f391656d = lVar;
        java.lang.Object obj = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) obj;
        int i17 = this.f419336f;
        lVar2.f170444h = i17;
        int i18 = this.f419337g;
        lVar2.f170445i = i18;
        android.graphics.SurfaceTexture surfaceTexture2 = lVar2.f170446m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setDefaultBufferSize(i17, i18);
        }
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        wl1.h hVar = new wl1.h(context2, new nj1.a(this.f419341n));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f419338h;
        h0Var2.f391656d = hVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18);
        java.lang.Object obj2 = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) obj2).m52738x183e6d2(layoutParams);
        java.lang.Object obj3 = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
        java.lang.Object obj4 = h0Var2.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = ((wl1.h) obj4).f528576c;
        c22633x83752a59.setImportantForAccessibility(4);
        c22633x83752a59.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) obj3).addView(c22633x83752a59);
        android.view.View view = this.f419339i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) view).addView((android.view.View) h0Var.f391656d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", "create params:" + this.f419340m + " done");
    }
}
