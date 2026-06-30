package hd4;

/* loaded from: classes4.dex */
public abstract class g extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public final d94.a A;
    public final w64.l B;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f362106o;

    /* renamed from: p, reason: collision with root package name */
    public final u74.d f362107p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f362108q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f362109r;

    /* renamed from: s, reason: collision with root package name */
    public final int f362110s;

    /* renamed from: t, reason: collision with root package name */
    public d94.g f362111t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f362112u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f362113v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f362114w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f362115x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 f362116y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f362117z;

    public g(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, u74.d dVar, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, int i17) {
        super(str, yVar, view);
        this.f362106o = view;
        this.f362107p = dVar;
        this.f362108q = b1Var;
        this.f362109r = iVar;
        this.f362110s = i17;
        this.f362113v = jz5.h.b(hd4.a.f362097d);
        this.f362114w = jz5.h.b(hd4.c.f362099d);
        this.f362115x = jz5.h.b(new hd4.f(this));
        this.A = new hd4.b(this);
        this.B = new hd4.e(this);
    }

    public static final android.graphics.Rect y(hd4.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        android.graphics.Rect rect = (android.graphics.Rect) ((jz5.n) gVar.f362113v).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        return rect;
    }

    public static final android.graphics.Point z(hd4.g gVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        gVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        android.graphics.Point point = (android.graphics.Point) ((jz5.n) gVar.f362114w).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        return point;
    }

    public final void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb791 = this.f362116y;
        if (c18294x51ffb791 != null) {
            c18294x51ffb791.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb7912 = this.f362116y;
        if (c18294x51ffb7912 != null) {
            c18294x51ffb7912.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb7913 = this.f362116y;
        if (c18294x51ffb7913 != null) {
            c18294x51ffb7913.m71062x672610fc(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }

    public final u74.d B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        return this.f362107p;
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        android.view.View view = this.f362106o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            return;
        }
        if (c17933xe8d1b226 == null || !c17933xe8d1b226.m70381xf5d0b9b4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "onPlayProgress, is not breakFrameGestureAd");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = c17933xe8d1b226.m70354x74235b3e().f38182x86831750;
        s34.l0 l0Var = nVar != null ? nVar.f247605g : null;
        if (l0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            return;
        }
        if (l0Var.f484232a <= j17 && j17 <= l0Var.f484233b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "onPlayProgress, milliseconds is " + j17 + ", enable");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb791 = this.f362116y;
            if ((c18294x51ffb791 != null ? c18294x51ffb791.m71061x71d5fee7() : null) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb7912 = this.f362116y;
                if (c18294x51ffb7912 != null) {
                    c18294x51ffb7912.a();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb7913 = this.f362116y;
                if (c18294x51ffb7913 != null) {
                    c18294x51ffb7913.setVisibility(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb7914 = this.f362116y;
                if (c18294x51ffb7914 != null) {
                    c18294x51ffb7914.m71062x672610fc(new hd4.d(this, c17933xe8d1b226, l0Var, context));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "onPlayProgress, milliseconds is " + j17 + ", disable");
            A();
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19899xf4ead4f4()) == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            u74.d dVar = this.f362107p;
            if (dVar != null && (c18401x8b62a617 = dVar.f506689q) != null) {
                android.view.View view2 = dVar.f506698z;
                if (view2 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                } else {
                    float e17 = l44.n5.e(l0Var, view2.getHeight());
                    java.util.List d17 = l44.n5.d(l0Var, dVar.f506698z.getWidth(), dVar.f506698z.getHeight());
                    int[] iArr = new int[2];
                    dVar.f506698z.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    c18401x8b62a617.getLocationOnScreen(iArr2);
                    float f17 = iArr[0] - iArr2[0];
                    float f18 = iArr[1] - iArr2[1];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDebugInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                    s34.k0 k0Var = c18401x8b62a617.gestureDebugInfo;
                    k0Var.f484221a = d17;
                    k0Var.f484223c = f17;
                    k0Var.f484224d = f18;
                    k0Var.f484222b = e17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDebugInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                    c18401x8b62a617.setWillNotDraw(false);
                    android.view.View m71214x14d2a238 = c18401x8b62a617.m71214x14d2a238();
                    if (m71214x14d2a238 != null) {
                        m71214x14d2a238.bringToFront();
                    }
                    c18401x8b62a617.postInvalidate();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        android.widget.FrameLayout frameLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        android.view.View view = this.f362106o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        } else {
            if (!this.f362117z) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMSnsAdGestureContainerStub", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f362115x).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMSnsAdGestureContainerStub", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                android.view.View h17 = a84.y0.h(viewStub);
                this.f362116y = h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791) h17 : null;
                this.f362117z = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.f68891x29d1292e) + ", isSame is " + z17);
            A();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchParticleAnimConfig", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            java.lang.String j17 = j();
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = model.m70354x74235b3e();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70354x74235b3e, "getAdXml(...)");
                if (m70354x74235b3e.f38275x3163e578 != null) {
                    if (this.f362112u == null) {
                        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
                        this.f362112u = frameLayout2;
                        u74.d dVar = this.f362107p;
                        if (dVar != null && (c18401x8b62a617 = dVar.f506689q) != null) {
                            c18401x8b62a617.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        }
                    }
                    if (this.f362111t == null && (frameLayout = this.f362112u) != null) {
                        this.f362111t = new d94.g(context, frameLayout, this.A, this.f362110s);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb791 = this.f362116y;
                    if (c18294x51ffb791 != null) {
                        c18294x51ffb791.m71063xeaf65bd1(this.f362111t);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb7912 = this.f362116y;
                    if (c18294x51ffb7912 != null) {
                        c18294x51ffb7912.m71063xeaf65bd1(null);
                    }
                }
                d94.g gVar = this.f362111t;
                if (gVar != null) {
                    gVar.b(m70354x74235b3e.f38275x3163e578);
                }
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchParticleAnimConfig", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "resetComponentState");
        A();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p2200x4f5cbe1f.p2201xbba4bfc0.p2202xd3988fde.C18294x51ffb791 c18294x51ffb791 = this.f362116y;
        if (c18294x51ffb791 != null) {
            c18294x51ffb791.m71063xeaf65bd1(null);
        }
        d94.g gVar = this.f362111t;
        if (gVar != null) {
            gVar.b(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }
}
