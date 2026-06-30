package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLikeContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer */
/* loaded from: classes10.dex */
public final class C14330xf9b5e578 extends p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 {
    public static final int N;
    public qo0.c A;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B;
    public boolean C;
    public boolean D;
    public java.lang.String E;
    public boolean F;
    public final android.os.Handler G;
    public java.lang.Runnable H;
    public java.lang.Runnable I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f197526J;
    public int[] K;
    public int L;
    public final android.os.Vibrator M;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f197527v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f197528w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f197529x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.l f197530y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f197531z;

    static {
        ae2.in inVar = ae2.in.f85221a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f85444w5).mo141623x754a37bb()).r();
        if (!(((java.lang.Number) r17).intValue() > 0)) {
            r17 = null;
        }
        java.lang.Integer num = (java.lang.Integer) r17;
        N = num != null ? num.intValue() : 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14330xf9b5e578(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197527v = "FinderLiveLikeContainer";
        this.G = new android.os.Handler(android.os.Looper.getMainLooper());
        this.K = new int[]{0, 0};
        java.lang.Object systemService = context.getSystemService("vibrator");
        this.M = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570445ea2, (android.view.ViewGroup) this, true);
        this.B = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.tk_);
    }

    public static final void A(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578, boolean z17) {
        if (c14330xf9b5e578.f197531z == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c14330xf9b5e578.f197527v, "postLike: sessionId is null");
            return;
        }
        int i17 = c14330xf9b5e578.L + 1;
        c14330xf9b5e578.L = i17;
        boolean z18 = (c14330xf9b5e578.D || z17 || i17 % N != 0) ? false : true;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_LIVE_SESSION_ID", c14330xf9b5e578.f197531z);
        if (!z18) {
            bundle.putBoolean("PARAM_LIVE_LIKE_CONFETTI_FROM_SCREEN", z17);
            qo0.c cVar = c14330xf9b5e578.A;
            if (cVar != null) {
                cVar.mo46557x60d69242(qo0.b.B3, bundle);
            }
            yz5.a aVar = c14330xf9b5e578.f197528w;
            if (aVar != null) {
                return;
            }
            return;
        }
        java.lang.String str = c14330xf9b5e578.E;
        if (str == null) {
            str = c01.z1.r();
        }
        bundle.putString("PARAM_FINDER_LIVE_HEAD_URL", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14330xf9b5e578.f197527v, "postLike,postHighLightLike,headUrl:" + str);
        qo0.c cVar2 = c14330xf9b5e578.A;
        if (cVar2 != null) {
            cVar2.mo46557x60d69242(qo0.b.C3, bundle);
        }
        yz5.a aVar2 = c14330xf9b5e578.f197529x;
        if (aVar2 != null) {
        }
    }

    public final void B() {
        android.os.Bundle bundle = new android.os.Bundle();
        int[] iArr = {0, 0};
        getLocationInWindow(iArr);
        if (getWidth() == 0 || getHeight() == 0 || iArr[0] == 0 || iArr[1] == 0) {
            return;
        }
        yz5.l lVar = this.f197530y;
        if (lVar != null) {
        }
        if (this.f197531z == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f197527v, "setConfettiPosition: sessionId is null");
            return;
        }
        int a17 = com.p314xaae8f345.mm.ui.zk.a(getContext(), 40);
        if (a17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f197527v, "setConfettiPosition: anchorLikeContainerSize <= 0");
            return;
        }
        int width = iArr[0] + (getWidth() / 2);
        int i17 = iArr[1];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197527v, "onLayoutChange,update confetti,sessionId=" + this.f197531z + " position=" + width + '=' + i17);
        bundle.putFloat("PARAM_LIVE_LIKE_CONFETTI_DISPLAY_SCALE", (getWidth() * 1.0f) / a17);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", width);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", i17);
        bundle.putString("PARAM_LIVE_SESSION_ID", this.f197531z);
        qo0.c cVar = this.A;
        if (cVar != null) {
            cVar.mo46557x60d69242(qo0.b.D3, bundle);
        }
    }

    public final void C() {
        android.view.ViewPropertyAnimator animate;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f197527v, "unBindData");
        animate().cancel();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.B;
        if (c22699x3dcdb352 != null && (animate = c22699x3dcdb352.animate()) != null) {
            animate.cancel();
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        java.lang.Runnable runnable = this.I;
        android.os.Handler handler = this.G;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.I = null;
        this.F = false;
        java.lang.Runnable runnable2 = this.H;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        if (this.f197531z == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f197527v, "removeConfetti: sessionId is null");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_LIVE_SESSION_ID", this.f197531z);
            qo0.c cVar = this.A;
            if (cVar != null) {
                cVar.mo46557x60d69242(qo0.b.E3, bundle);
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f197526J);
        }
        this.f197526J = null;
        this.K = new int[]{0, 0};
        this.f197528w = null;
        this.f197529x = null;
        this.f197530y = null;
        this.f197531z = null;
        this.A = null;
        this.C = false;
        this.D = false;
        this.E = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator animate2;
        if (!this.C) {
            return false;
        }
        java.lang.Runnable runnable = this.I;
        android.os.Handler handler = this.G;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.I = null;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.B;
        if (valueOf != null && valueOf.intValue() == 0) {
            pf5.u uVar = pf5.u.f435469a;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (((pl2.x) uVar.b(context).a(pl2.x.class)).f438216f) {
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pl2.s sVar = ((pl2.x) uVar.b(context2).a(pl2.x.class)).f438217g;
                if (sVar != null) {
                    pl2.s.e(sVar, 0L, null, 3, null);
                }
                android.content.Context context3 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                ((pl2.x) uVar.b(context3).a(pl2.x.class)).f438220m.f438211h = 3;
            } else {
                animate().cancel();
                if (c22699x3dcdb352 != null && (animate2 = c22699x3dcdb352.animate()) != null) {
                    animate2.cancel();
                }
                setScaleX(1.5f);
                setScaleY(1.5f);
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setAlpha(0.3f);
                }
                if (this.F) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f197527v, "onStartPostLike:hasStartPostLike is true");
                } else {
                    this.F = true;
                    this.L = 0;
                    java.lang.Runnable runnable2 = this.H;
                    if (runnable2 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v5) runnable2).run();
                    }
                }
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                animate().setDuration(100L).scaleX(1.0f).scaleY(1.0f).start();
                if (c22699x3dcdb352 != null && (animate = c22699x3dcdb352.animate()) != null && (duration = animate.setDuration(100L)) != null && (alpha = duration.alpha(1.0f)) != null) {
                    alpha.start();
                }
                this.F = false;
                java.lang.Runnable runnable3 = this.H;
                if (runnable3 != null) {
                    handler.removeCallbacks(runnable3);
                }
            }
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14330xf9b5e578(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
