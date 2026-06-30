package gd2;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f352097a;

    /* renamed from: b, reason: collision with root package name */
    public final gd2.p f352098b;

    /* renamed from: c, reason: collision with root package name */
    public final g04.h f352099c;

    /* renamed from: d, reason: collision with root package name */
    public final gd2.o f352100d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f352101e;

    /* renamed from: f, reason: collision with root package name */
    public g04.j f352102f;

    /* renamed from: g, reason: collision with root package name */
    public int f352103g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f352104h;

    /* renamed from: i, reason: collision with root package name */
    public int f352105i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f352106j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f352107k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f352108l;

    /* renamed from: m, reason: collision with root package name */
    public final android.animation.ValueAnimator f352109m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f352110n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.s0 f352111o;

    /* renamed from: p, reason: collision with root package name */
    public sy3.c f352112p;

    /* renamed from: q, reason: collision with root package name */
    public long f352113q;

    /* renamed from: r, reason: collision with root package name */
    public final sy3.e f352114r;

    public x(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, gd2.p callback, g04.h engineCallBack, gd2.o imageOCRCallback, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineCallBack, "engineCallBack");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageOCRCallback, "imageOCRCallback");
        this.f352097a = activity;
        this.f352098b = callback;
        this.f352099c = engineCallBack;
        this.f352100d = imageOCRCallback;
        this.f352101e = z17;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        this.f352109m = ofFloat;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.ui.commentimage.menu.FinderCommentImageTransAndOcrLogic$scanTranslationResultEventListener$1
            {
                this.f39173x3fe91575 = -1699517927;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 event = c5974x1d8a7409;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scanTranslationResult ");
                am.ct ctVar = event.f136272g;
                sb6.append(ctVar.f87933a);
                sb6.append(", ");
                sb6.append(ctVar.f87935c);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageTransAndOcrLogic", sb6.toString());
                pm0.v.X(new gd2.w(gd2.x.this, event));
                return true;
            }
        };
        this.f352110n = abstractC20980x9b9ad01d;
        this.f352111o = new gd2.v(this);
        this.f352114r = new gd2.q(this);
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.ma9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f352107k = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.ma7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f352108l = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = activity.findViewById(com.p314xaae8f345.mm.R.id.ma_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f352106j = (android.widget.ImageView) findViewById3;
        android.widget.ImageView imageView = this.f352108l;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += com.p314xaae8f345.mm.ui.bk.j(activity);
        android.widget.ImageView imageView2 = this.f352108l;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView2.setLayoutParams(layoutParams2);
        android.widget.ImageView imageView3 = this.f352108l;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView3.setOnClickListener(new gd2.s(this));
        ofFloat.setDuration(5000L);
        ofFloat.addListener(new gd2.r(this, this));
        ofFloat.addUpdateListener(new gd2.t(this, p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.InterfaceC1251x464cc9f5.INSTANCE.m8648x8dcda235().mo8645x297b8891(activity).m8638x12a519ab().height()));
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    public static final void a(gd2.x xVar) {
        android.widget.ImageView imageView = xVar.f352106j;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = xVar.f352107k;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanTransLayer");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = xVar.f352108l;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView3.setVisibility(8);
        android.animation.ValueAnimator valueAnimator = xVar.f352109m;
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(0);
        valueAnimator.end();
    }

    public final boolean b() {
        sy3.c cVar = this.f352112p;
        if (cVar == null) {
            return false;
        }
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageOCRHelper");
            throw null;
        }
        if (((kz3.l) cVar).c()) {
            return false;
        }
        ((gd2.j) this.f352100d).a();
        sy3.c cVar2 = this.f352112p;
        if (cVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageOCRHelper");
            throw null;
        }
        if (!((kz3.l) cVar2).b(this.f352113q)) {
            return false;
        }
        this.f352113q = 0L;
        return true;
    }

    public final void c() {
        this.f352105i = 0;
        android.widget.ImageView imageView = this.f352106j;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = this.f352107k;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanTransLayer");
            throw null;
        }
        imageView2.setVisibility(8);
        android.widget.ImageView imageView3 = this.f352108l;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
            throw null;
        }
        imageView3.setVisibility(8);
        android.animation.ValueAnimator valueAnimator = this.f352109m;
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(0);
        valueAnimator.end();
    }

    public final void d(java.lang.String imgPath) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f352097a;
        if (abstractActivityC21394xb3d2c0cf.isFinishing()) {
            return;
        }
        if (this.f352102f == null) {
            i95.m c17 = i95.n0.c(kd0.h2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            this.f352102f = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15(abstractActivityC21394xb3d2c0cf);
        }
        g04.j jVar = this.f352102f;
        if (jVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15) jVar).b(imgPath, this.f352099c);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentImageTransAndOcrLogic", "scanEngine is null!!");
        }
    }
}
