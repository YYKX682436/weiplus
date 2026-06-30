package com.tencent.mm.plugin.ball.view;

/* loaded from: classes14.dex */
public class FloatBallView extends android.widget.FrameLayout implements gp1.y {
    public static final int D2;
    public static final int E2;
    public static final int F2;
    public static final int G2;
    public com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout A;
    public final android.graphics.Point A1;
    public com.tencent.mm.view.shadow.layout.WxShadowLinearLayout B;
    public float B1;
    public android.widget.FrameLayout C;
    public int C1;
    public android.widget.ImageView D;
    public boolean D1;
    public android.widget.FrameLayout E;
    public boolean E1;
    public com.tencent.mm.plugin.ball.view.CircleAnimateView F;
    public boolean F1;
    public com.tencent.mm.plugin.ball.view.CircleAnimateView G;
    public boolean G1;
    public com.tencent.mm.plugin.ball.view.CircleAnimateView H;
    public boolean H1;
    public com.tencent.mm.plugin.ball.view.CircleAnimateView I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93520J;
    public int J1;
    public int K;
    public int K1;
    public com.tencent.mm.plugin.ball.view.FloatBallCollapseView L;
    public com.tencent.mm.plugin.ball.model.BallInfo L1;
    public boolean M;
    public com.tencent.mm.plugin.ball.model.BallInfo M1;
    public int N;
    public com.tencent.mm.plugin.ball.model.BallInfo N1;
    public android.graphics.Point O1;
    public int P;
    public final android.graphics.Point P1;
    public java.lang.String Q;
    public boolean Q1;
    public java.util.List R;
    public final int R1;
    public int S;
    public int S1;
    public int T;
    public int T1;
    public android.animation.LayoutTransition U;
    public int U1;
    public boolean V;
    public boolean V1;
    public boolean W;
    public float W1;
    public float X1;
    public boolean Y1;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final qp1.r f93521a2;

    /* renamed from: b2, reason: collision with root package name */
    public final qp1.l f93522b2;

    /* renamed from: c2, reason: collision with root package name */
    public final boolean f93523c2;

    /* renamed from: d, reason: collision with root package name */
    public int f93524d;

    /* renamed from: d2, reason: collision with root package name */
    public final rp1.v0 f93525d2;

    /* renamed from: e, reason: collision with root package name */
    public int f93526e;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f93527e2;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f93528f;

    /* renamed from: f2, reason: collision with root package name */
    public final android.os.Handler f93529f2;

    /* renamed from: g, reason: collision with root package name */
    public int f93530g;

    /* renamed from: g2, reason: collision with root package name */
    public gp1.k f93531g2;

    /* renamed from: h, reason: collision with root package name */
    public int f93532h;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f93533h2;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Vibrator f93534i;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f93535i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f93536j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f93537k2;

    /* renamed from: l1, reason: collision with root package name */
    public int f93538l1;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f93539l2;

    /* renamed from: m, reason: collision with root package name */
    public android.animation.ValueAnimator f93540m;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f93541m2;

    /* renamed from: n, reason: collision with root package name */
    public android.view.WindowManager f93542n;

    /* renamed from: n2, reason: collision with root package name */
    public final boolean f93543n2;

    /* renamed from: o, reason: collision with root package name */
    public ep1.x f93544o;

    /* renamed from: o2, reason: collision with root package name */
    public final android.os.Handler f93545o2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f93546p;

    /* renamed from: p0, reason: collision with root package name */
    public int f93547p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f93548p1;

    /* renamed from: p2, reason: collision with root package name */
    public final java.lang.Runnable f93549p2;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f93550q;

    /* renamed from: q2, reason: collision with root package name */
    public boolean f93551q2;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f93552r;

    /* renamed from: r2, reason: collision with root package name */
    public boolean f93553r2;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f93554s;

    /* renamed from: s2, reason: collision with root package name */
    public boolean f93555s2;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout f93556t;

    /* renamed from: t2, reason: collision with root package name */
    public int f93557t2;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f93558u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f93559v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f93560w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.view.shadow.layout.WxShadowLinearLayout f93561x;

    /* renamed from: x0, reason: collision with root package name */
    public int f93562x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f93563x1;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallBlurView f93564y;

    /* renamed from: y0, reason: collision with root package name */
    public long f93565y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Point f93566y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView f93567z;

    /* renamed from: z1, reason: collision with root package name */
    public final android.graphics.PointF f93568z1;

    /* renamed from: u2, reason: collision with root package name */
    public static final int f93514u2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480518a06);

    /* renamed from: v2, reason: collision with root package name */
    public static final int f93515v2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a07);

    /* renamed from: w2, reason: collision with root package name */
    public static final int f93516w2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0l);

    /* renamed from: x2, reason: collision with root package name */
    public static final int f93517x2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0m);

    /* renamed from: y2, reason: collision with root package name */
    public static final int f93518y2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479644bj);

    /* renamed from: z2, reason: collision with root package name */
    public static final int f93519z2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479646bl);
    public static final int A2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479648bn);
    public static final int B2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
    public static final int C2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479671c8);

    static {
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9);
        D2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479673ca);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479688cn);
        E2 = i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a0n);
        F2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480516a05);
        G2 = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479648bn);
    }

    public FloatBallView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, boolean z17) {
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator updateListener;
        android.view.ViewPropertyAnimator interpolator;
        boolean g17 = floatBallView.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "onIdleStateChange isIdle: %s, last: %s, canEnter: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(floatBallView.f93527e2), java.lang.Boolean.valueOf(g17));
        if (g17 && z17 && !floatBallView.f93527e2) {
            rp1.e1 e1Var = new rp1.e1(floatBallView);
            qp1.g0.a(floatBallView);
            android.view.ViewPropertyAnimator animate = floatBallView.animate();
            if (animate != null && (duration = animate.setDuration(100L)) != null && (updateListener = duration.setUpdateListener(new qp1.f0(e1Var))) != null && (interpolator = updateListener.setInterpolator(new android.view.animation.LinearInterpolator())) != null) {
                interpolator.start();
            }
        } else if (g17 && z17) {
            qp1.g0.a(floatBallView);
            floatBallView.H0(floatBallView.getIdleAlpha());
        } else if (floatBallView.Y1 && floatBallView.W()) {
            floatBallView.H0(1.0f);
        }
        floatBallView.f93527e2 = z17;
    }

    public static void d(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, int i17) {
        floatBallView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "switchVoipState state: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 16) {
            floatBallView.f93524d = (floatBallView.f93524d & (-9)) | 16;
        } else if (i17 == 1024) {
            floatBallView.f93524d = (((floatBallView.f93524d & (-17)) | 8) & (-2049)) | 1024;
        }
        floatBallView.f93526e = floatBallView.f93524d;
    }

    private int getAppBrandVoipBallInfoIndex() {
        if (qp1.w.a(this.R)) {
            for (int i17 = 0; i17 < this.R.size(); i17++) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) this.R.get(i17);
                if (ballInfo != null && ballInfo.f93046d == 17) {
                    return i17;
                }
            }
        }
        return 0;
    }

    private int getCurrentBallHeight() {
        return ((android.view.WindowManager.LayoutParams) getLayoutParams()).height;
    }

    private int getCurrentBallX() {
        return ((android.view.WindowManager.LayoutParams) getLayoutParams()).x;
    }

    private int getCurrentStateHeight() {
        int A;
        int w17;
        int i17;
        int i18 = this.f93524d;
        if (E(i18)) {
            A = r(i18);
            if (C(i18)) {
                w17 = q(true);
                i17 = f93519z2;
            } else {
                if (F(i18)) {
                    w17 = w(false, true);
                } else if (G(i18)) {
                    w17 = w(false, true);
                }
                i17 = A2;
            }
            A += w17 + (i17 * 2) + E2;
        } else {
            A = A(i18);
        }
        return qp1.e0.a(A + qp1.c0.f365704m + qp1.c0.f365706o);
    }

    private int getCurrentStateWidth() {
        int i17 = this.f93524d;
        boolean E = E(i17);
        android.graphics.Point point = this.P1;
        return qp1.e0.a(E ? qp1.e0.a(s(i17) + getHorizontalShadowSize() + point.x) + getExtendWidth() : qp1.e0.a(B(i17) + getHorizontalShadowSize() + point.x));
    }

    private float getCustomViewAlphaAnimationStartX() {
        if (this.f93563x1) {
            return -this.f93554s.getPaddingLeft();
        }
        int paddingLeft = (this.f93566y1.x + this.f93554s.getPaddingLeft()) - getLayoutParams().width;
        if (this.f93538l1 == 2 && !this.f93563x1) {
            paddingLeft -= this.J1;
        }
        return paddingLeft;
    }

    private int getExtendWidth() {
        if (!this.E1 || !this.D1) {
            return 0;
        }
        android.content.Context context = getContext();
        if (qp1.w.f365755a == null) {
            qp1.w.f365755a = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.u(context, false));
        }
        if (!qp1.w.f365755a.booleanValue()) {
            return 0;
        }
        int rotation = this.f93542n.getDefaultDisplay().getRotation();
        boolean z17 = this.f93563x1;
        if (!(z17 && rotation == 1) && (z17 || rotation != 3)) {
            return 0;
        }
        return qp1.w.n(getContext());
    }

    private android.graphics.Point getFloatBallSizeExceptShadow() {
        int i17;
        int w17;
        int i18;
        int i19 = 0;
        if (c0(this.f93524d)) {
            if (E(this.f93524d)) {
                int s17 = s(this.f93524d);
                int r17 = r(this.f93524d);
                boolean C = C(this.f93524d);
                int i27 = E2;
                if (C) {
                    i18 = q(true) + (f93519z2 * 2);
                } else {
                    boolean F = F(this.f93524d);
                    int i28 = A2;
                    if (F) {
                        w17 = w(false, true);
                    } else if (G(this.f93524d)) {
                        w17 = w(false, true);
                    } else {
                        i19 = s17;
                        i17 = r17;
                    }
                    i18 = w17 + (i28 * 2);
                }
                int i29 = i18 + i27 + r17;
                i19 = s17;
                i17 = i29;
            } else {
                i19 = B(this.f93524d);
                i17 = A(this.f93524d);
            }
        } else if (E(this.f93524d)) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.L1;
            if (ballInfo == null || !ballInfo.Q) {
                i19 = s(this.f93524d);
                i17 = r(this.f93524d);
            }
            i17 = 0;
        } else {
            if (D(this.f93524d)) {
                int i37 = B2;
                int i38 = f93517x2;
                i19 = (i37 * 2) + i38;
                i17 = (i37 * 2) + i38;
            }
            i17 = 0;
        }
        return new android.graphics.Point(i19, i17);
    }

    private android.graphics.Point getFloatBallViewSize() {
        android.graphics.Point floatBallSizeExceptShadow = getFloatBallSizeExceptShadow();
        int i17 = floatBallSizeExceptShadow.x;
        int i18 = floatBallSizeExceptShadow.y;
        int horizontalShadowSize = getHorizontalShadowSize();
        int verticalShadowSize = getVerticalShadowSize();
        if (i17 != 0 && i18 != 0) {
            int i19 = i17 + horizontalShadowSize;
            android.graphics.Point point = this.P1;
            i17 = qp1.e0.a(i19 + point.x) + getExtendWidth();
            i18 = qp1.e0.a(i18 + verticalShadowSize + point.y);
        }
        return new android.graphics.Point(i17, i18);
    }

    private static int getHorizontalShadowSize() {
        return qp1.c0.f365707p * 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getIdleAlpha() {
        if (W() && this.V1) {
            return 0.4f;
        }
        return S(this.f93524d) ? 0.6f : 1.0f;
    }

    private int getOtherContentViewHeight() {
        int w17;
        if (!c0(this.f93524d)) {
            if (!D(this.f93524d)) {
                return 0;
            }
            return f93517x2 + (B2 * 2);
        }
        if (!E(this.f93524d)) {
            return A(this.f93524d);
        }
        if (C(this.f93524d)) {
            return (f93519z2 * 2) + q(true);
        }
        boolean F = F(this.f93524d);
        int i17 = A2;
        if (F) {
            w17 = w(false, true);
        } else {
            if (!G(this.f93524d)) {
                return 0;
            }
            w17 = w(false, true);
        }
        return w17 + (i17 * 2);
    }

    private static int getVerticalShadowSize() {
        return qp1.c0.f365704m + qp1.c0.f365706o;
    }

    public static int q(boolean z17) {
        return z17 ? f93514u2 : f93515v2;
    }

    private void setBlurViewAlpha(float f17) {
        com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f93564y;
        if (floatBallBlurView == null || this.Y1) {
            return;
        }
        android.widget.ImageView imageView = floatBallBlurView.f93462f;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mBlurImageView");
            throw null;
        }
        if (imageView.getVisibility() != 0) {
            android.widget.ImageView imageView2 = floatBallBlurView.f93463g;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("mTopBlurMask");
                throw null;
            }
            imageView2.setAlpha(floatBallBlurView.f93467n != null ? 1.0f - f17 : 0.0f);
            android.widget.ImageView imageView3 = floatBallBlurView.f93464h;
            if (imageView3 != null) {
                imageView3.setAlpha(floatBallBlurView.f93467n == null ? 0.0f : 1.0f);
                return;
            } else {
                kotlin.jvm.internal.o.o("mBottomBlurMask");
                throw null;
            }
        }
        android.widget.ImageView imageView4 = floatBallBlurView.f93463g;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("mTopBlurMask");
            throw null;
        }
        imageView4.setAlpha(1.0f - f17);
        android.widget.ImageView imageView5 = floatBallBlurView.f93464h;
        if (imageView5 != null) {
            imageView5.setAlpha(f17);
        } else {
            kotlin.jvm.internal.o.o("mBottomBlurMask");
            throw null;
        }
    }

    private void setCollapseLayoutAlpha(float f17) {
        if (this.V1) {
            this.f93559v.setAlpha(f17);
        }
    }

    private void setCustomViewButtonLayoutAlpha(float f17) {
        com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView baseFloatBallButtonView = this.f93567z;
        if (baseFloatBallButtonView != null) {
            baseFloatBallButtonView.setAlpha(f17);
        }
    }

    private void setCustomViewLayoutAlpha(float f17) {
        android.view.View view = this.f93550q;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "setCustomViewLayoutAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatBallView", "setCustomViewLayoutAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatBallAlphaInternal(float f17) {
        setAlpha(f17);
        if (f17 == 0.0f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, GONE");
            setVisibility(8);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setFloatBallAlphaInternal, VISIBLE, alpha:%s", java.lang.Float.valueOf(f17));
            setVisibility(0);
        }
    }

    private void setOtherContentViewLayoutAlpha(float f17) {
        com.tencent.mm.view.shadow.layout.WxShadowLinearLayout wxShadowLinearLayout = this.B;
        if (wxShadowLinearLayout != null) {
            wxShadowLinearLayout.setAlpha(f17);
        }
    }

    public static int w(boolean z17, boolean z18) {
        return (z18 || z17) ? f93516w2 : f93517x2;
    }

    public final int A(int i17) {
        int w17;
        int i18;
        if (C(i17)) {
            w17 = q(false);
            i18 = f93519z2;
        } else {
            if (!G(i17)) {
                return 0;
            }
            w17 = w(false, false);
            i18 = B2;
        }
        return w17 + (i18 * 2);
    }

    public final void A0(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateBallRootViewLayout gravity: %d, isSettled: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f93554s.getLayoutParams();
        layoutParams.gravity = i17;
        this.f93554s.setLayoutParams(layoutParams);
        if (z17 || c0(this.f93524d) || this.A.getVisibility() != 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.A.getLayoutParams();
        layoutParams2.gravity = 17;
        this.A.setLayoutParams(layoutParams2);
    }

    public final int B(int i17) {
        int q17;
        int w17;
        int i18;
        boolean L = L(i17);
        int i19 = f93519z2;
        if (L) {
            return q(false) + (i19 * 2);
        }
        if (R(i17) || (!c0(i17) && D(i17))) {
            return w(false, false) + (B2 * 2);
        }
        boolean U = U(i17);
        int i27 = A2;
        if (U) {
            i18 = w(false, false) * 2;
        } else if (T(i17)) {
            i18 = w(false, false) * 3;
        } else {
            if (!Q(i17)) {
                if (K(i17)) {
                    q17 = q(false) + i19 + i27;
                    w17 = w(true, false);
                } else {
                    if (!N(i17) && !M(i17) && !J(i17)) {
                        return 0;
                    }
                    q17 = q(false) + i19 + i27;
                    w17 = w(true, false) * 2;
                }
                i18 = q17 + w17;
                return i18 + i27;
            }
            i18 = w(false, false) * 4;
        }
        i27 *= 2;
        return i18 + i27;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B0(boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.FloatBallView.B0(boolean, boolean):int");
    }

    public final boolean C(int i17) {
        return (i17 & 1) != 0;
    }

    public final void C0() {
        if (this.T1 == 0) {
            this.f93554s.setLayoutTransition(null);
            this.f93559v.setVisibility(8);
            return;
        }
        if (this.f93559v.getVisibility() != 0) {
            this.f93559v.setVisibility(0);
            this.f93559v.setAlpha(1.0f);
        }
        if (this.f93543n2) {
            return;
        }
        int i17 = this.T1;
        if (i17 == 3 || i17 == 1) {
            this.K = 0;
            this.f93520J.setRotation(0);
        } else if (i17 == 4 || i17 == 2) {
            this.K = 180;
            this.f93520J.setRotation(180);
        }
    }

    public final boolean D(int i17) {
        return ((i17 & 256) == 0 && (i17 & 512) == 0) ? false : true;
    }

    public final void D0(boolean z17) {
        C0();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f93559v.getLayoutParams();
        layoutParams.gravity = (z17 ? 8388613 : 8388611) | 16;
        this.f93559v.setLayoutParams(layoutParams);
    }

    public final boolean E(int i17) {
        if ((i17 & 8) != 0) {
            return true;
        }
        if ((i17 & 16) != 0) {
            return true;
        }
        return (i17 & 4096) != 0;
    }

    public final void E0(boolean z17) {
        C0();
        this.f93554s.setLayoutTransition(this.U);
        if (this.T1 == 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f93556t.getLayoutParams();
            layoutParams.gravity = z17 ? 8388611 : 8388613;
            this.f93556t.setLayoutParams(layoutParams);
        }
    }

    public final boolean F(int i17) {
        return (i17 & 2) != 0;
    }

    public final void F0(boolean z17, boolean z18, int i17, int i18) {
        int i19 = this.T1;
        if (z18) {
            if (this.f93563x1) {
                this.T1 = 1;
            } else {
                this.T1 = 2;
            }
            s0();
        } else {
            this.T1 = 0;
            this.f93554s.setLayoutTransition(null);
            this.f93559v.setVisibility(8);
        }
        int i27 = this.T1;
        if (i19 != i27) {
            e0(this.L1, i19, i27, i17, i18);
        }
        if (z18) {
            this.U1 = i17;
        } else {
            this.U1 = 0;
        }
    }

    public final boolean G(int i17) {
        if (F(i17)) {
            return true;
        }
        if ((i17 & 4) != 0) {
            return true;
        }
        if ((i17 & 64) != 0) {
            return true;
        }
        return (i17 & 128) != 0;
    }

    public final void G0(boolean z17) {
        if (!z17 || !this.Y1 || !W()) {
            p0(false);
        } else {
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
            I0(this.f93563x1, layoutParams.x, layoutParams.y, true, false);
        }
    }

    public void H(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Boolean.valueOf(z17));
        arrayList.add(animatorListenerAdapter);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "hide", "(ZLandroid/animation/AnimatorListenerAdapter;)V", this, array);
        G0(false);
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideFloatBallView already hide");
            yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "hide", "(ZLandroid/animation/AnimatorListenerAdapter;)V");
            return;
        }
        if (!z17 || this.f93544o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideFloatBallView without animation");
            setVisibility(8);
            android.graphics.Point point = this.P1;
            if (this.Q1) {
                try {
                    if (point.x != 0 || point.y != 0) {
                        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
                        int a17 = this.f93563x1 ? 0 : layoutParams.x + qp1.e0.a(point.x);
                        int a18 = layoutParams.y + qp1.e0.a(point.y);
                        point.x = 0;
                        point.y = 0;
                        T0();
                        y0(a17, a18, true, false);
                        I0(this.f93563x1, a17, a18, true, false);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallView", e17, "resetFloatBallViewSizeAndPosition", new java.lang.Object[0]);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideFloatBallView with animation");
            this.f93544o.e(animatorListenerAdapter);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "hide", "(ZLandroid/animation/AnimatorListenerAdapter;)V");
    }

    public final void H0(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateCollapseViewAlpha alpha: %s", java.lang.Float.valueOf(f17));
        com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = this.L;
        if (floatBallCollapseView != null) {
            floatBallCollapseView.setAlpha(f17);
        }
    }

    public void I(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideByTranslation");
        setNeedTranslateAnimation(false);
        if (getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "hideByTranslation float ball already hide");
            return;
        }
        if (this.f93544o != null) {
            boolean Z = Z(((android.view.WindowManager.LayoutParams) getLayoutParams()).x);
            ep1.x xVar = this.f93544o;
            int currentStateWidth = getCurrentStateWidth();
            android.view.View view = xVar.f255687a;
            if (view == null) {
                return;
            }
            if (xVar.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingHide");
                return;
            }
            if (xVar.d()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel show animator");
                xVar.f255688b.cancel();
            }
            android.animation.Animator a17 = xVar.a(false, currentStateWidth, Z, new ep1.v(xVar, view, animatorListenerAdapter));
            xVar.f255689c = a17;
            a17.start();
        }
    }

    public final void I0(boolean z17, int i17, int i18, boolean z18, boolean z19) {
        int y17 = y(z17, false);
        int y18 = y(z17, false);
        int i19 = G2;
        int a17 = z17 ? y18 - qp1.e0.a((s(this.f93524d) / 2) + i19) : y18 + qp1.e0.a((s(this.f93524d) / 2) + i19);
        float y19 = y(z17, true) - y17;
        float min = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((i17 - y17) * 1.0f) / y19));
        float min2 = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((a17 - y17) * 1.0f) / y19));
        float min3 = java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, ((i17 - a17) * 1.0f) / (r7 - a17)));
        this.X1 = 1.0f - ((1.0f - this.W1) * min3);
        if (min <= min2) {
            Y0(java.lang.Math.min(1.0f, java.lang.Math.max(0.0f, 1.0f - (min / min2))));
        } else {
            com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView = this.f93564y;
            if (floatBallBlurView != null) {
                android.widget.ImageView imageView = floatBallBlurView.f93462f;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("mBlurImageView");
                    throw null;
                }
                if (imageView.getVisibility() != 0) {
                    if (floatBallBlurView.f93467n != null) {
                        android.widget.ImageView imageView2 = floatBallBlurView.f93463g;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.o.o("mTopBlurMask");
                            throw null;
                        }
                        imageView2.setAlpha(1.0f - min3);
                        android.widget.ImageView imageView3 = floatBallBlurView.f93464h;
                        if (imageView3 == null) {
                            kotlin.jvm.internal.o.o("mBottomBlurMask");
                            throw null;
                        }
                        imageView3.setAlpha(1.0f);
                    } else {
                        android.widget.ImageView imageView4 = floatBallBlurView.f93463g;
                        if (imageView4 == null) {
                            kotlin.jvm.internal.o.o("mTopBlurMask");
                            throw null;
                        }
                        imageView4.setAlpha(0.0f);
                        android.widget.ImageView imageView5 = floatBallBlurView.f93464h;
                        if (imageView5 == null) {
                            kotlin.jvm.internal.o.o("mBottomBlurMask");
                            throw null;
                        }
                        imageView5.setAlpha(min3);
                    }
                    android.widget.ImageView imageView6 = floatBallBlurView.f93462f;
                    if (imageView6 == null) {
                        kotlin.jvm.internal.o.o("mBlurImageView");
                        throw null;
                    }
                    imageView6.setAlpha(0.0f);
                } else {
                    android.widget.ImageView imageView7 = floatBallBlurView.f93463g;
                    if (imageView7 == null) {
                        kotlin.jvm.internal.o.o("mTopBlurMask");
                        throw null;
                    }
                    imageView7.setAlpha(min3);
                    android.widget.ImageView imageView8 = floatBallBlurView.f93464h;
                    if (imageView8 == null) {
                        kotlin.jvm.internal.o.o("mBottomBlurMask");
                        throw null;
                    }
                    imageView8.setAlpha(0.0f);
                    android.widget.ImageView imageView9 = floatBallBlurView.f93462f;
                    if (imageView9 == null) {
                        kotlin.jvm.internal.o.o("mBlurImageView");
                        throw null;
                    }
                    imageView9.setAlpha(min3);
                }
            }
            android.widget.LinearLayout linearLayout = this.f93559v;
            if (linearLayout != null) {
                linearLayout.setAlpha(min3);
            }
        }
        if (min >= min2 + 0.1d) {
            super.setAlpha(0.0f);
        } else {
            super.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = this.L;
        if (floatBallCollapseView != null) {
            floatBallCollapseView.d(this.X1, i17, i18, z17);
            if (this.W1 == 1.0f) {
                p0(min > min2);
            } else {
                p0(this.X1 < 1.0f);
            }
        }
        N0(this.X1);
    }

    public final boolean J(int i17) {
        return ((i17 & 128) != 0) && C(i17) && !E(i17);
    }

    public final void J0(android.widget.FrameLayout.LayoutParams layoutParams) {
        int a17 = qp1.e0.a(q(E(this.f93524d)));
        layoutParams.width = a17;
        layoutParams.height = a17;
        android.widget.ImageView imageView = this.D;
        if (imageView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams2.width = a17;
            layoutParams2.height = a17;
            this.D.setLayoutParams(layoutParams2);
        }
    }

    public final boolean K(int i17) {
        return F(i17) && C(i17) && !E(i17);
    }

    public final void K0(int i17) {
        n0(true);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.C.getLayoutParams();
        J0(layoutParams);
        layoutParams.gravity = 8388627;
        int a17 = qp1.e0.a(f93519z2);
        layoutParams.setMargins(qp1.e0.a(i17), a17, a17, a17);
        this.C.setLayoutParams(layoutParams);
    }

    public final boolean L(int i17) {
        return (!C(i17) || E(i17) || G(i17)) ? false : true;
    }

    public final void L0(int i17) {
        n0(true);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.C.getLayoutParams();
        J0(layoutParams);
        layoutParams.gravity = 8388629;
        int a17 = qp1.e0.a(f93519z2);
        layoutParams.setMargins(a17, a17, qp1.e0.a(i17), a17);
        this.C.setLayoutParams(layoutParams);
    }

    public final boolean M(int i17) {
        return ((i17 & 64) != 0) && C(i17) && !E(i17);
    }

    public final void M0(boolean z17) {
        s(this.f93524d);
        r(this.f93524d);
        N0(this.X1);
        float a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a0s));
        this.f93561x.setBlurRadius(a17);
        this.B.setBlurRadius(a17);
    }

    public final boolean N(int i17) {
        return ((i17 & 4) != 0) && C(i17) && !E(i17);
    }

    public final void N0(float f17) {
        int a17 = qp1.e0.a(s(this.f93524d));
        int a18 = (int) (qp1.e0.a(r(this.f93524d)) * f17);
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f93560w.getLayoutParams();
        layoutParams.width = a17;
        layoutParams.height = a18;
        layoutParams.gravity = 16;
        this.f93560w.setLayoutParams(layoutParams);
        qp1.g0.e(this.f93558u, a17, a18);
    }

    public final boolean O(int i17) {
        return (!((i17 & 16) != 0) || C(i17) || G(i17)) ? false : true;
    }

    public final void O0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17;
        int i18;
        int i19;
        int i27;
        android.graphics.Point point;
        android.graphics.Point point2;
        com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = this.L;
        if (floatBallCollapseView != null && (point2 = ballInfo.f93051i) != null) {
            floatBallCollapseView.setCustomViewSize(point2);
        }
        android.graphics.Point point3 = ballInfo.f93051i;
        if (point3 == null || (point = this.O1) == null || point3.x != point.x || point3.y != point.y) {
            if (point3 == null) {
                this.O1 = null;
            } else {
                android.graphics.Point point4 = ballInfo.f93051i;
                this.O1 = new android.graphics.Point(point4.x, point4.y);
            }
            this.Q1 = true;
            this.V = true;
            android.graphics.Point point5 = this.P1;
            point5.x = 0;
            point5.y = 0;
            np1.c cVar = this.L1.P;
            if (cVar != null) {
                android.graphics.Point point6 = cVar.f338791a;
                android.graphics.Point point7 = cVar.f338792b;
                if (b0(point6) && b0(point7) && (i17 = point6.x) < (i18 = point7.x) && (i19 = point6.y) < (i27 = point7.y)) {
                    point5.x = i18 - i17;
                    point5.y = i27 - i19;
                    this.Q1 = false;
                }
            }
            if (this.f93563x1) {
                return;
            }
            this.W = true;
        }
    }

    public final boolean P(int i17) {
        return (!((i17 & 4096) != 0) || C(i17) || G(i17)) ? false : true;
    }

    public final void P0(boolean z17, boolean z18, boolean z19, int i17) {
        if (this.f93553r2 == z17 && this.f93555s2 == z18 && this.f93551q2 == z19 && this.f93557t2 == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateFloatBallBackground, isSettled:%s, isDockLeft:%s, isManual:%s, state:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Integer.valueOf(i17));
        this.f93557t2 = i17;
        this.f93551q2 = z19;
        this.f93553r2 = z17;
        this.f93555s2 = z18;
        if (z17) {
            this.A.setBackgroundColorMask(z19 ? this.N : this.P);
        } else {
            this.A.setBackgroundColorMask(this.P);
        }
    }

    public final boolean Q(int i17) {
        return (!((i17 & 128) != 0) || E(i17) || C(i17)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.FloatBallView.Q0(boolean, boolean, boolean, boolean):void");
    }

    public final boolean R(int i17) {
        return (!F(i17) || E(i17) || C(i17)) ? false : true;
    }

    public final void R0(boolean z17) {
        if (E(this.f93524d)) {
            android.view.View view = this.f93552r;
            int i17 = (C(this.f93524d) || G(this.f93524d)) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q0(true);
            M0(true);
            if (V(this.f93524d) || O(this.f93524d) || P(this.f93524d)) {
                android.view.View view2 = this.f93552r;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r0(false);
            } else {
                r0(true);
                V0(z17);
            }
        } else {
            android.view.View view3 = this.f93552r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockLeft", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q0(false);
            r0(true);
            V0(z17);
        }
        if (z17) {
            if (!E(this.f93526e) && E(this.f93524d)) {
                w0(true);
                return;
            }
            if (!E(this.f93526e) || (!(C(this.f93526e) || G(this.f93526e)) || E(this.f93524d))) {
                w0(true);
            } else {
                w0(true);
            }
        }
    }

    public final boolean S(int i17) {
        return R(i17) || U(i17) || T(i17) || Q(i17);
    }

    public final void S0(boolean z17) {
        if (E(this.f93524d)) {
            android.view.View view = this.f93552r;
            int i17 = (C(this.f93524d) || G(this.f93524d)) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q0(true);
            M0(false);
            if (V(this.f93524d) || O(this.f93524d) || P(this.f93524d)) {
                android.view.View view2 = this.f93552r;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r0(false);
            } else {
                r0(true);
                W0(z17);
            }
        } else {
            android.view.View view3 = this.f93552r;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateFloatBallViewLayoutWhenDockRight", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q0(false);
            r0(true);
            W0(z17);
        }
        if (z17) {
            v0();
        }
    }

    public final boolean T(int i17) {
        return (!((i17 & 64) != 0) || E(i17) || C(i17)) ? false : true;
    }

    public final void T0() {
        android.graphics.Point floatBallViewSize = getFloatBallViewSize();
        int i17 = floatBallViewSize.x;
        int i18 = floatBallViewSize.y;
        if (this.f93528f == null) {
            this.f93528f = new android.graphics.Point();
        }
        this.f93528f.set(i17, i18);
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        if (i17 == 0 || i18 == 0) {
            layoutParams.width = 0;
            layoutParams.height = 0;
        } else {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        try {
            this.f93542n.updateViewLayout(this, layoutParams);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallView", e17, "updateFloatBallViewSize exception", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateFloatBallViewSize, width:%s, height:%s, notify: %b", java.lang.Integer.valueOf(layoutParams.width), java.lang.Integer.valueOf(layoutParams.height), java.lang.Boolean.TRUE);
        for (gp1.b0 b0Var : this.f93546p) {
            int i19 = layoutParams.x;
            b0Var.a(i19, layoutParams.y, layoutParams.width, layoutParams.height, this.f93535i2, Z(i19), this.T1, 0, this.f93533h2, true);
        }
    }

    public final boolean U(int i17) {
        return (!((i17 & 4) != 0) || E(i17) || C(i17)) ? false : true;
    }

    public final void U0(boolean z17, boolean z18) {
        if (!z17) {
            this.A.setRoundCorner(true);
            return;
        }
        if (E(this.f93524d)) {
            this.A.setRoundCorner(true);
            return;
        }
        com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout floatBallRoundCornerFrameLayout = this.A;
        boolean z19 = !z18;
        floatBallRoundCornerFrameLayout.f93504n = false;
        if (floatBallRoundCornerFrameLayout.f93505o == z19 && floatBallRoundCornerFrameLayout.f93506p == z18) {
            return;
        }
        floatBallRoundCornerFrameLayout.f93505o = z19;
        floatBallRoundCornerFrameLayout.f93506p = z18;
        floatBallRoundCornerFrameLayout.c();
        floatBallRoundCornerFrameLayout.invalidate();
    }

    public final boolean V(int i17) {
        return (!((i17 & 8) != 0) || C(i17) || G(i17)) ? false : true;
    }

    public final void V0(boolean z17) {
        U0(z17, true);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.gravity = 8388627;
        this.B.setLayoutParams(layoutParams);
        X0();
        if (C(this.f93524d) && G(this.f93524d)) {
            K0(B0(true, true));
            return;
        }
        int i17 = this.f93524d;
        if ((C(i17) && E(i17) && !G(i17)) || L(this.f93524d)) {
            o0(false);
            K0(f93519z2);
        } else if (G(this.f93524d)) {
            n0(false);
            B0(true, true);
        }
    }

    public boolean W() {
        return gp1.i.a(this.T1);
    }

    public final void W0(boolean z17) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.B.getLayoutParams();
        layoutParams.gravity = 8388629;
        this.B.setLayoutParams(layoutParams);
        X0();
        U0(z17, false);
        if (C(this.f93524d) && G(this.f93524d)) {
            L0(B0(false, true));
            return;
        }
        int i17 = this.f93524d;
        if ((C(i17) && E(i17) && !G(i17)) || L(this.f93524d)) {
            o0(false);
            L0(f93519z2);
        } else if (G(this.f93524d)) {
            n0(false);
            B0(false, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x030f A[EDGE_INSN: B:212:0x030f->B:165:0x030f BREAK  A[LOOP:8: B:157:0x02f1->B:211:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0274 A[EDGE_INSN: B:220:0x0274->B:121:0x0274 BREAK  A[LOOP:5: B:115:0x0260->B:219:?], SYNTHETIC] */
    @Override // gp1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(java.util.List r22, com.tencent.mm.plugin.ball.model.BallInfo r23) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.FloatBallView.X(java.util.List, com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    public final void X0() {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.A.getLayoutParams();
        if (E(this.f93524d)) {
            layoutParams.width = -2;
        } else {
            layoutParams.width = qp1.e0.a(B(this.f93524d));
        }
        layoutParams.height = qp1.e0.a(getOtherContentViewHeight());
        this.A.setLayoutParams(layoutParams);
    }

    public final boolean Y() {
        return ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().f0();
    }

    public final void Y0(float f17) {
        setCustomViewLayoutAlpha(f17);
        setCollapseLayoutAlpha(1.0f - f17);
        setCustomViewButtonLayoutAlpha(f17);
        setBlurViewAlpha(f17);
        setOtherContentViewLayoutAlpha(f17);
    }

    public final boolean Z(int i17) {
        return i17 + (getCurrentStateWidth() / 2) <= this.f93566y1.x / 2;
    }

    public boolean a0() {
        com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView;
        if (getVisibility() == 0) {
            return true;
        }
        if (this.Y1 && W() && (floatBallCollapseView = this.L) != null) {
            if (floatBallCollapseView.getVisibility() == 0 && floatBallCollapseView.getAlpha() > 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final boolean b0(android.graphics.Point point) {
        return point != null && point.x > 0 && point.y > 0;
    }

    public final boolean c0(int i17) {
        return (i17 & 32) != 0;
    }

    public final void d0(float f17, float f18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis <= this.f93565y0 + 800) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallClickedIfNeed, you clicked too fast!");
            return;
        }
        this.f93565y0 = currentTimeMillis;
        boolean W = W();
        java.util.Set set = this.f93546p;
        if (W) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallClickedIfNeed, click collapseLayout");
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
            while (it.hasNext()) {
                ((gp1.b0) it.next()).c();
            }
            m(true, true, 1);
            return;
        }
        android.view.View view = this.f93550q;
        if (view != null && view.getVisibility() == 0 && l((int) f17, (int) f18)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallView", "notifyBallClickedIfNeed, click voip unexpectedly");
            return;
        }
        if (O(this.f93524d) || V(this.f93524d) || P(this.f93524d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallClickedIfNeed, ignore click");
            return;
        }
        if (c0(this.f93524d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallClickedIfNeed, wechat in foreground");
            k0();
            java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
            while (it6.hasNext()) {
                ((gp1.b0) it6.next()).h();
            }
            return;
        }
        if (this.N1 == null || ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallClickedIfNeed, you clicked appbrand voip");
        this.N1.M.f93090m = 3;
        k0();
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h0(this.N1);
    }

    public void e0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18, int i19, int i27) {
        if (this.V1) {
            if (gp1.i.a(i18)) {
                ballInfo.E = java.lang.System.currentTimeMillis();
            }
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93546p).iterator();
            while (it.hasNext()) {
                ((gp1.b0) it.next()).b(ballInfo, i17, i18);
            }
            boolean z17 = true;
            if (i17 == 3 || i17 == 4) {
                if (i18 != 3 && i18 != 4) {
                    z17 = false;
                }
                if (z17) {
                    return;
                }
            }
            com.tencent.mm.plugin.ball.service.s H0 = com.tencent.mm.plugin.ball.service.s.H0();
            H0.getClass();
            try {
                synchronized (H0.f93218d) {
                    java.util.Set set = (java.util.Set) H0.f93218d.get(ballInfo.f93046d);
                    if (qp1.w.a(set)) {
                        java.util.Iterator it6 = set.iterator();
                        while (it6.hasNext()) {
                            ((gp1.z) it6.next()).S(ballInfo, i17, i18, i19, i27);
                        }
                    }
                    fs.g.c(gp1.x.class, java.lang.Integer.valueOf(ballInfo.f93046d), new com.tencent.mm.plugin.ball.service.d0(H0, ballInfo, i17, i18, i19, i27));
                    java.util.Set set2 = (java.util.Set) H0.f93218d.get(0);
                    if (qp1.w.a(set2)) {
                        java.util.Iterator it7 = set2.iterator();
                        while (it7.hasNext()) {
                            ((gp1.z) it7.next()).S(ballInfo, i17, i18, i19, i27);
                        }
                    }
                    fs.g.c(gp1.x.class, 0, new com.tencent.mm.plugin.ball.service.e0(H0, ballInfo, i17, i18, i19, i27));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallService", e17, "notifyBallCollapseStateChanged exception", new java.lang.Object[0]);
            }
        }
    }

    public void f0(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        boolean Z = Z(i17);
        this.f93563x1 = Z;
        com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = this.L;
        if (floatBallCollapseView != null && !kotlin.jvm.internal.o.b(floatBallCollapseView.f93486i, java.lang.Boolean.valueOf(Z))) {
            floatBallCollapseView.f93486i = java.lang.Boolean.valueOf(Z);
            android.widget.LinearLayout linearLayout = floatBallCollapseView.f93484g;
            if (linearLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = null;
                } else if (layoutParams instanceof android.widget.FrameLayout.LayoutParams) {
                    if (Z) {
                        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 8388629;
                    } else {
                        ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = 8388627;
                    }
                }
                linearLayout.setLayoutParams(layoutParams);
            }
        }
        if (this.f93539l2) {
            boolean z27 = this.f93536j2;
            boolean z28 = this.f93563x1;
            if (z27 != z28) {
                int i19 = z28 ? 4 : 3;
                int i27 = this.T1;
                if (i27 != i19) {
                    e0(this.L1, i27, i19, -1, -1);
                }
                this.S1 = this.T1;
                this.T1 = i19;
                s0();
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "updateCollapseStateWhenPositionChanged last: %d, current: %d", java.lang.Integer.valueOf(this.S1), java.lang.Integer.valueOf(this.T1));
            }
        }
        P0(z17, this.f93563x1, z18, this.f93524d);
        Q0(z17, this.f93563x1, z18, false);
        if (z17) {
            this.B1 = i18 / this.f93566y1.y;
        }
        this.C1 = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "notifyBallPositionChanged-normal, x:%s, y:%s, isSettled:%s, isManual:%s, isDockLeft:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f93563x1));
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93546p).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).a(i17, i18, getCurrentStateWidth(), getCurrentStateHeight(), z17, this.f93563x1, this.T1, 0, z18, z19);
        }
    }

    public final boolean g() {
        return (this.L1 != null && W() && this.V1) || S(this.f93524d);
    }

    public void g0(android.content.res.Configuration configuration) {
        gp1.k kVar = this.f93531g2;
        java.lang.Integer f17 = kVar != null ? kVar.f() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "onConfigurationChanged, orientation:%d, lastOrientation: %s, otherOrientation: %s", java.lang.Integer.valueOf(configuration.orientation), java.lang.Integer.valueOf(this.f93538l1), f17);
        int i17 = configuration.orientation;
        h0(i17, f17 != null && i17 == f17.intValue());
        int i18 = configuration.orientation;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f93546p).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).onOrientationChange(i18);
        }
    }

    public android.graphics.Point getBallPosition() {
        int i17;
        int i18;
        int i19;
        int r17;
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallView", "getBallPosition layoutParams is null");
            return null;
        }
        boolean z17 = this.f93563x1;
        int i27 = E2;
        if (z17) {
            i17 = layoutParams.x + qp1.c0.f365707p;
            if (!E(this.f93524d)) {
                i18 = layoutParams.y;
                i27 = qp1.c0.f365704m;
                return new android.graphics.Point(i17, i18 + i27);
            }
            i19 = layoutParams.y + qp1.c0.f365704m;
            r17 = r(this.f93524d);
            i18 = i19 + r17;
            return new android.graphics.Point(i17, i18 + i27);
        }
        if (!E(this.f93524d)) {
            i17 = layoutParams.x + qp1.c0.f365707p;
            i18 = layoutParams.y;
            i27 = qp1.c0.f365704m;
            return new android.graphics.Point(i17, i18 + i27);
        }
        i17 = layoutParams.x + this.B.getLeft() + qp1.c0.f365707p;
        i19 = layoutParams.y + qp1.c0.f365704m;
        r17 = r(this.f93524d);
        i18 = i19 + r17;
        return new android.graphics.Point(i17, i18 + i27);
    }

    public int getCurrentCollapseState() {
        int i17 = this.T1;
        if (i17 == -1) {
            gp1.j[] jVarArr = gp1.j.f274185d;
            return -1;
        }
        if (i17 == 0) {
            gp1.j[] jVarArr2 = gp1.j.f274185d;
            return 0;
        }
        if (i17 == 1) {
            gp1.j[] jVarArr3 = gp1.j.f274185d;
            return 1;
        }
        if (i17 == 2) {
            gp1.j[] jVarArr4 = gp1.j.f274185d;
            return 2;
        }
        if (i17 == 3 || i17 == 4) {
            gp1.j[] jVarArr5 = gp1.j.f274185d;
            return 3;
        }
        gp1.j[] jVarArr6 = gp1.j.f274185d;
        return -1;
    }

    public android.graphics.Point getCurrentCustomBallSize() {
        android.graphics.Point point = this.O1;
        int a17 = qp1.e0.a(point != null ? point.x : 0);
        android.graphics.Point point2 = this.O1;
        return new android.graphics.Point(a17, qp1.e0.a(point2 != null ? point2.y : 0));
    }

    public android.graphics.Point getCurrentFloatBallPosition() {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        return new android.graphics.Point(layoutParams.x, layoutParams.y);
    }

    public int getCurrentOrientation() {
        return this.f93538l1;
    }

    public android.graphics.Point getFloatBallCurrentPositionExceptShadow() {
        int a17;
        int a18;
        int a19;
        int i17;
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        int i18 = layoutParams.x;
        int i19 = layoutParams.y;
        int i27 = qp1.c0.f365704m;
        int a27 = i19 + qp1.e0.a(i27);
        if (this.L == null || !this.Y1 || (!W() && !this.f93539l2)) {
            if (this.f93539l2) {
                a17 = qp1.e0.a(qp1.c0.f365707p);
            } else {
                if (this.f93563x1) {
                    a18 = qp1.e0.a(G2);
                    return new android.graphics.Point(a18, a27);
                }
                a17 = qp1.e0.a(qp1.c0.f365707p);
            }
            a18 = i18 + a17;
            return new android.graphics.Point(a18, a27);
        }
        int collapseViewPosY = this.L.getCollapseViewPosY();
        if (this.f93539l2) {
            a19 = qp1.e0.a(qp1.c0.f365707p);
        } else {
            if (this.f93563x1) {
                i17 = 0;
                return new android.graphics.Point(i17, collapseViewPosY + qp1.e0.a(i27));
            }
            a19 = qp1.e0.a(qp1.c0.f365707p);
        }
        i17 = i18 + a19;
        return new android.graphics.Point(i17, collapseViewPosY + qp1.e0.a(i27));
    }

    public android.graphics.Point getFloatBallCurrentSizeExceptShadow() {
        if (this.L != null && this.Y1 && (W() || this.f93539l2)) {
            return this.L.getCollapseViewSize();
        }
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        return new android.graphics.Point(layoutParams.width - qp1.e0.a(getHorizontalShadowSize()), layoutParams.height - qp1.e0.a(getVerticalShadowSize()));
    }

    public android.graphics.Point getFloatBallPosition() {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        if (!this.f93563x1) {
            return new android.graphics.Point(layoutParams.x + qp1.c0.f365707p, layoutParams.y + qp1.c0.f365704m);
        }
        return new android.graphics.Point(G2, layoutParams.y + qp1.c0.f365704m);
    }

    public int getMenuOffsetY() {
        return E(this.f93524d) ? qp1.e0.a(r(this.f93524d) + qp1.c0.f365704m + E2) : qp1.e0.a(D2);
    }

    public int getPositionY() {
        return this.C1;
    }

    public final void h() {
        android.graphics.Point point;
        if (this.V1 && this.f93543n2 && (point = this.O1) != null) {
            int i17 = point.y;
            int i18 = qp1.c0.f365696e;
            if (i17 >= i18) {
                this.W1 = (i18 * 1.0f) / qp1.e0.a(i17);
                this.Y1 = true;
            } else {
                this.W1 = 1.0f;
                this.Y1 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "checkCustomBallNeedScaleAnimation customBallCollapsedScale: %s, customView height: %s, needAnimateCustomBallScale: %s", java.lang.Float.valueOf(this.W1), java.lang.Boolean.valueOf(this.Y1), java.lang.Integer.valueOf(this.O1.y));
        }
    }

    public final void h0(int i17, boolean z17) {
        int i18;
        int a17;
        int a18;
        int z18;
        int i19;
        int i27;
        android.graphics.Point point = this.f93566y1;
        this.f93566y1 = com.tencent.mm.ui.bk.h(getContext());
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(getContext())) {
            this.f93566y1.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f93566y1.x = com.tencent.mm.ui.bk.f();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "processOrientationChanged, screenResolution: %s, lastResolution: %s, lastOrientation: %s, checkConflict: %s", this.f93566y1, point, java.lang.Integer.valueOf(this.f93538l1), java.lang.Boolean.valueOf(z17));
        if (this.f93538l1 == i17) {
            if (point == null) {
                return;
            }
            int i28 = point.x;
            android.graphics.Point point2 = this.f93566y1;
            if (i28 == point2.x && point.y == point2.y) {
                return;
            }
        }
        this.f93538l1 = i17;
        if (this.E1) {
            this.D1 = true;
        }
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        int i29 = layoutParams.x;
        int i37 = (int) (this.f93566y1.y * this.B1);
        boolean z19 = this.V1 && W();
        int max = java.lang.Math.max(java.lang.Math.min(i29, this.f93566y1.x), 0);
        int max2 = java.lang.Math.max(java.lang.Math.min(i37, this.f93566y1.y), 0);
        if (this.V1) {
            if (z19) {
                int s17 = s(this.f93524d);
                a18 = this.f93563x1 ? qp1.e0.a(((this.K1 + 0) - s17) - qp1.c0.f365707p) : (this.f93566y1.x + qp1.e0.a((s17 + qp1.c0.f365707p) - this.K1)) - getLayoutParams().width;
            } else {
                boolean z27 = this.f93563x1;
                int i38 = G2;
                if (z27) {
                    a18 = qp1.e0.a(i38 - qp1.c0.f365707p);
                } else {
                    i18 = this.f93566y1.x - getLayoutParams().width;
                    a17 = qp1.e0.a(qp1.c0.f365707p - i38);
                    a18 = i18 + a17;
                }
            }
        } else if (this.f93563x1) {
            a18 = 0 - (E(this.f93524d) ? qp1.e0.a(qp1.c0.f365707p) : qp1.e0.a(qp1.c0.f365707p));
        } else {
            i18 = this.f93566y1.x - getLayoutParams().width;
            a17 = E(this.f93524d) ? qp1.e0.a(qp1.c0.f365707p) : qp1.e0.a(qp1.c0.f365707p);
            a18 = i18 + a17;
        }
        int o17 = o(a18);
        int i39 = this.f93566y1.x;
        int i47 = getLayoutParams().width;
        if (z17) {
            android.graphics.Point point3 = new android.graphics.Point(max, max2);
            gp1.k kVar = this.f93531g2;
            android.graphics.Point point4 = null;
            if (kVar != null) {
                android.graphics.Point b17 = kVar.b();
                android.graphics.Point c17 = this.f93531g2.c();
                boolean equals = java.lang.Boolean.TRUE.equals(this.f93531g2.e());
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "getFixedPositionAfterConflictFix-normal otherBallViewSize: %s, otherBallViewPos: %s, otherBallViewDockLeft: %s", b17, c17, java.lang.Boolean.valueOf(equals));
                if (b17 != null && (i19 = b17.x) != 0 && (i27 = b17.y) != 0 && c17 != null) {
                    point4 = x(point3, c17.x, c17.y, i19, i27, equals);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "getFixedPositionAfterConflictFix-normal fixedPos: %s", point4);
                }
            }
            z18 = point4 != null ? point4.y : z(max2);
        } else {
            z18 = z(max2);
        }
        int i48 = z18;
        boolean z28 = o17 <= 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "processOrientationChanged, layoutParams.x: %s, layoutParams.y: %s, stickToLeft:%s, startSticky:[%s, %s]=>[%s, %s]", java.lang.Integer.valueOf(layoutParams.x), java.lang.Integer.valueOf(layoutParams.y), java.lang.Boolean.valueOf(z28), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(o17), java.lang.Integer.valueOf(i48));
        com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = this.L;
        if (floatBallCollapseView != null) {
            floatBallCollapseView.setExtendWidth(getExtendWidth());
        }
        u0(z28, z19, max, max2, o17, i48, false, this.U1, 2, false);
    }

    public final void i() {
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi() != null && ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().f0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallView", "checkDoTranslateAnimation forceHideAllFloatBall and ignore");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "checkDoTranslateAnimation: %s", java.lang.Boolean.valueOf(this.F1));
        if (this.G1 || !this.F1) {
            return;
        }
        rp1.g1 g1Var = new rp1.g1(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "showByTranslation");
        setNeedTranslateAnimation(false);
        if (this.f93544o != null) {
            boolean Z = Z(((android.view.WindowManager.LayoutParams) getLayoutParams()).x);
            ep1.x xVar = this.f93544o;
            int currentStateWidth = getCurrentStateWidth() - qp1.c0.f365707p;
            android.view.View view = xVar.f255687a;
            if (view == null) {
                return;
            }
            if (xVar.d()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewAnimationHandler", "isAnimatingShow");
                return;
            }
            if (xVar.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallViewAnimationHandler", "cancel hide animator");
                xVar.f255689c.cancel();
            }
            android.animation.Animator a17 = xVar.a(true, currentStateWidth, Z, new ep1.w(xVar, view, g1Var));
            xVar.f255688b = a17;
            a17.start();
            android.view.View view2 = xVar.f255687a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = xVar.f255687a;
            if (view3 instanceof com.tencent.mm.plugin.ball.view.FloatBallView) {
                ((com.tencent.mm.plugin.ball.view.FloatBallView) view3).p();
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/ball/animation/FloatBallViewAnimationHandler", "playShowTranslateAnimation", "(IZLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void i0(boolean z17) {
        if (!z17 || c0(this.f93524d)) {
            if (!G(this.f93524d) && !C(this.f93524d)) {
                this.M = false;
                return;
            }
            this.M = !z17;
            this.B.setVisibility(z17 ? 0 : 4);
            if (z17) {
                r0(true);
            }
        }
    }

    public final boolean j(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        android.graphics.PointF pointF = this.f93568z1;
        return java.lang.Math.abs(rawX - pointF.x) > ((float) this.f93530g) || java.lang.Math.abs(motionEvent.getRawY() - pointF.y) > ((float) this.f93530g);
    }

    public final void j0(android.view.MotionEvent motionEvent) {
        android.graphics.PointF pointF = this.f93568z1;
        pointF.x = motionEvent.getRawX();
        pointF.y = motionEvent.getRawY();
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        android.graphics.Point point = this.A1;
        point.x = layoutParams.x;
        point.y = layoutParams.y;
    }

    public final void k() {
        int i17;
        if (((int) getAlpha()) == 1 && getVisibility() == 0 && (i17 = getResources().getConfiguration().orientation) != this.f93538l1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "checkOrientationIfNeed currentOrientation: %d, lastOrientation: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f93538l1));
            h0(i17, false);
        }
    }

    public final void k0() {
        if (this.f93523c2) {
            final rp1.v0 v0Var = this.f93525d2;
            java.util.Objects.requireNonNull(v0Var);
            pm0.v.W(new java.lang.Runnable() { // from class: rp1.d1$$c
                @Override // java.lang.Runnable
                public final void run() {
                    rp1.v0.this.b();
                }
            });
        }
    }

    public final boolean l(int i17, int i18) {
        android.view.View view = this.f93550q;
        if (view == null) {
            return false;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
            if (layoutParams == null) {
                return false;
            }
            int i19 = layoutParams.x;
            int i27 = layoutParams.y;
            int i28 = iArr[0] + i19;
            int i29 = iArr[1] + i27;
            return new android.graphics.Rect(i28, i29, view.getWidth() + i28, view.getHeight() + i29).contains(i17, i18);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallView", e17, "checkPositionInCustomView exception", new java.lang.Object[0]);
            return false;
        }
    }

    public void l0(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Boolean.valueOf(z17));
        arrayList.add(animatorListenerAdapter);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "show", "(ZLandroid/animation/AnimatorListenerAdapter;)V", this, array);
        m0(z17, false, animatorListenerAdapter);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "show", "(ZLandroid/animation/AnimatorListenerAdapter;)V");
    }

    public final void m(boolean z17, boolean z18, int i17) {
        k0();
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        int y17 = y(Z(layoutParams.x), false);
        if (z18) {
            boolean z19 = this.f93563x1;
            int i18 = layoutParams.x;
            int i19 = layoutParams.y;
            t0(z19, false, i18, i19, y17, i19, z17, -1, i17);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f93556t.getLayoutParams();
        layoutParams2.gravity = this.f93563x1 ? 8388611 : 8388613;
        this.f93556t.setLayoutParams(layoutParams2);
        F0(z17, false, -1, i17);
        y0(y17, layoutParams.y, true, z17);
        I0(this.f93563x1, y17, layoutParams.y, true, false);
        Y0(1.0f);
    }

    public void m0(boolean z17, boolean z18, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        G0(this.Y1 && W());
        if (getVisibility() == 0 && z18) {
            boolean z19 = this.f93550q != null;
            com.tencent.mm.view.shadow.layout.WxShadowLinearLayout wxShadowLinearLayout = this.f93561x;
            if (wxShadowLinearLayout != null) {
                wxShadowLinearLayout.setAlpha(z19 ? 1.0f : 0.0f);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "showFloatBallView already show");
            i();
            return;
        }
        if (this.H1 || !z17 || this.f93544o == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "showFloatBallView without animation");
            setVisibility(0);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "showFloatBallView with animation");
            this.f93544o.f(animatorListenerAdapter);
        }
        s0();
    }

    public void n(boolean z17, boolean z18, int i17) {
        if (W()) {
            if (z17 || (this.V1 && this.U1 == 2)) {
                m(false, z18, i17);
            }
        }
    }

    public final void n0(boolean z17) {
        this.C.setVisibility(z17 ? 0 : 8);
    }

    public final int o(int i17) {
        if (this.f93538l1 != 2) {
            return i17;
        }
        int rotation = this.f93542n.getDefaultDisplay().getRotation();
        qp1.w.n(getContext());
        return (this.f93563x1 || rotation != 3) ? i17 : i17 - this.J1;
    }

    public final void o0(boolean z17) {
        this.E.setVisibility(z17 ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        yj0.a.a("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onAttachedToWindow", "()V", this);
        super.onAttachedToWindow();
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        int y17 = y(Z(layoutParams.x), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "onAttachedToWindow targetX: %s", java.lang.Integer.valueOf(y17));
        int i17 = layoutParams.x;
        if (i17 != y17) {
            y0(y17, layoutParams.y, true, false);
        } else {
            f0(i17, layoutParams.y, true, false, true);
        }
        if (W()) {
            I0(this.f93563x1, layoutParams.x, layoutParams.y, true, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onAttachedToWindow", "()V");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        g0(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        yj0.a.a("com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onDetachedFromWindow", "()V", this);
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f93540m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f93540m = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatBallView", "com/tencent/mm/plugin/ball/view/FloatBallView", "onDetachedFromWindow", "()V");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (W()) {
            return true;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (motionEvent.getAction() == 0) {
            j0(motionEvent);
        }
        if (!l(rawX, rawY)) {
            return true;
        }
        if (motionEvent.getAction() != 2) {
            return false;
        }
        return j(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != 3) goto L124;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.FloatBallView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p() {
        super.setVisibility(0);
    }

    public final void p0(boolean z17) {
        if (this.L == null) {
            return;
        }
        if (!this.Y1 || Y()) {
            this.L.b();
        } else {
            H0(z17 ? (this.f93523c2 && this.f93525d2.f398539c) ? getIdleAlpha() : 1.0f : 0.0f);
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: rp1.d1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = com.tencent.mm.plugin.ball.view.FloatBallView.this;
                    com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = floatBallView.L;
                    if (floatBallCollapseView == null || !floatBallView.Y1 || floatBallCollapseView.getVisibility() == 0) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseView", "quickShow");
                    floatBallCollapseView.setVisibility(0);
                }
            });
        }
    }

    public final void q0(boolean z17) {
        if (z17 && this.f93561x.getVisibility() != 0) {
            this.f93561x.setVisibility(0);
            if (this.f93550q == null || this.O1 == null) {
                this.f93561x.setVisibility(4);
            }
        } else if (!z17 && this.f93561x.getVisibility() != 8) {
            this.f93561x.setVisibility(8);
        }
        android.view.View view = this.f93550q;
        if (view != null) {
            if (z17 && view.getVisibility() != 0) {
                android.view.View view2 = this.f93550q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "showCustomView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "showCustomView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (z17 || this.f93550q.getVisibility() == 8) {
                return;
            }
            android.view.View view3 = this.f93550q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "showCustomView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/ball/view/FloatBallView", "showCustomView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final int r(int i17) {
        android.graphics.Point point;
        int i18;
        if (!E(i17) || (point = this.O1) == null || point.x <= 0 || (i18 = point.y) <= 0) {
            return 0;
        }
        return i18;
    }

    public final void r0(boolean z17) {
        if (this.M) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallView", "showOtherContentView not show");
            this.B.setVisibility(4);
            return;
        }
        this.B.setVisibility(z17 ? 0 : 8);
        if (z17) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.B.getLayoutParams();
            marginLayoutParams.topMargin = E(this.f93524d) ? -qp1.e0.a(qp1.c0.f365704m + qp1.c0.f365706o) : 0;
            this.B.setLayoutParams(marginLayoutParams);
        }
    }

    public final int s(int i17) {
        android.graphics.Point point;
        int i18;
        if (!E(i17) || (point = this.O1) == null || (i18 = point.x) <= 0 || point.y <= 0) {
            return 0;
        }
        return i18;
    }

    public final void s0() {
        if (this.f93523c2) {
            final rp1.v0 v0Var = this.f93525d2;
            if (!v0Var.f398539c && g()) {
                java.util.Objects.requireNonNull(v0Var);
                pm0.v.W(new java.lang.Runnable() { // from class: rp1.d1$$h
                    @Override // java.lang.Runnable
                    public final void run() {
                        rp1.v0.this.c();
                    }
                });
            }
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        if (!this.f93523c2 || !this.f93525d2.f398539c) {
            super.setAlpha(f17);
        } else if (this.Y1 && W()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setAlpha isCurrentCollapsed", java.lang.Float.valueOf(f17));
            super.setAlpha(0.0f);
            H0(getIdleAlpha());
        } else {
            super.setAlpha(getIdleAlpha());
        }
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setCustomView(com.tencent.mm.plugin.ball.model.BallInfo r14) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.view.FloatBallView.setCustomView(com.tencent.mm.plugin.ball.model.BallInfo):void");
    }

    public void setEnableClick(boolean z17) {
        this.I1 = z17;
    }

    public void setFloatBallAlpha(float f17) {
        ep1.x xVar = this.f93544o;
        if (!(xVar.d() || xVar.c())) {
            setFloatBallAlphaInternal(f17);
        } else {
            this.f93544o.f255690d.add(new rp1.h1(this, f17));
        }
    }

    public void setFloatBallPageAnimating(boolean z17) {
        this.H1 = z17;
        if (z17) {
            this.F1 = false;
            n(true, false, 2);
        }
    }

    public void setFloatBallViewDelegate(gp1.k kVar) {
        this.f93531g2 = kVar;
    }

    public void setNeedTranslateAnimation(boolean z17) {
        this.F1 = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (!this.G1 && Y()) {
            super.setVisibility(8);
            com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = this.L;
            if (floatBallCollapseView != null) {
                floatBallCollapseView.b();
                return;
            }
            return;
        }
        if (this.Y1 && W()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setVisibility isCurrentCollapsed");
            super.setVisibility(8);
            this.f93548p1 = true;
            return;
        }
        super.setVisibility(i17);
        int alpha = (int) getAlpha();
        if (alpha != 0 && alpha == 1) {
            this.f93548p1 = true;
            k();
        }
        if (getAlpha() <= 0.0f || !this.f93525d2.f398539c) {
            return;
        }
        this.f93548p1 = true;
    }

    public final int t(android.view.MotionEvent motionEvent) {
        return (int) java.lang.Math.max(java.lang.Math.min((this.A1.x + motionEvent.getRawX()) - this.f93568z1.x, this.f93566y1.x), -getLayoutParams().width);
    }

    public final void t0(boolean z17, boolean z18, int i17, int i18, int i19, int i27, boolean z19, int i28, int i29) {
        u0(z17, z18, i17, i18, i19, i27, z19, i28, i29, true);
    }

    public final int u(android.view.MotionEvent motionEvent) {
        return (int) java.lang.Math.max(java.lang.Math.min((this.A1.y + motionEvent.getRawY()) - this.f93568z1.y, this.f93566y1.y), -getLayoutParams().height);
    }

    public final void u0(boolean z17, boolean z18, int i17, int i18, int i19, int i27, boolean z19, int i28, int i29, boolean z27) {
        boolean z28;
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "startStickyAnimation, stickToLeft:%s, needCollapse: %s, startPositionX: %s, targetPositionX: %s, startPositionY: %s, targetPositionY: %scollapseReason: %d, expandReason: %d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
        if (z18) {
            qp1.i.a();
        }
        android.animation.ValueAnimator valueAnimator = this.f93540m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "cancelStickyAnimation");
            this.f93540m.cancel();
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f93556t.getLayoutParams();
        if (z17) {
            layoutParams.getMarginEnd();
        } else {
            layoutParams.getMarginStart();
        }
        float customViewAlphaAnimationStartX = getCustomViewAlphaAnimationStartX();
        boolean z29 = true;
        boolean z37 = ((z17 && (((float) i17) > customViewAlphaAnimationStartX ? 1 : (((float) i17) == customViewAlphaAnimationStartX ? 0 : -1)) < 0) || (!z17 && (((float) i17) > customViewAlphaAnimationStartX ? 1 : (((float) i17) == customViewAlphaAnimationStartX ? 0 : -1)) > 0)) && this.L1 != null;
        float alpha = (!z37 || (view = this.f93550q) == null) ? 0.0f : view.getAlpha();
        float f17 = z18 ? 0.0f : 1.0f;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f93540m = ofFloat;
        ofFloat.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        float f18 = this.X1;
        if (this.Y1) {
            if (!z18 && f18 >= 1.0f) {
                int y17 = y(z17, false);
                if (!z17 ? i17 <= y17 : i17 >= y17) {
                    z29 = false;
                }
            }
            z28 = z29;
        } else {
            z28 = false;
        }
        this.f93540m.setDuration(200L);
        this.f93540m.addUpdateListener(new rp1.i1(this, i17, i19, i18, i27, z28, z27, z18, z17, z37, alpha, f17));
        this.f93540m.addListener(new rp1.j1(this, z18, z19, i28, i29, layoutParams, z27, z28));
        this.f93540m.start();
    }

    public android.graphics.Point v(int i17, int i18) {
        return (this.L != null && this.Y1 && (W() || this.f93539l2 || this.Z1)) ? this.L.getCollapseViewSize() : new android.graphics.Point(i17 - qp1.e0.a(getHorizontalShadowSize()), i18 - qp1.e0.a(getVerticalShadowSize()));
    }

    public final boolean v0() {
        android.graphics.Point point = this.f93528f;
        if (point != null && point.x <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "stickToScreenEdgeIfNeed ignore because of view size = 0");
            return false;
        }
        boolean w07 = w0(this.W);
        this.W = false;
        return w07;
    }

    public final boolean w0(boolean z17) {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        int i17 = layoutParams.x;
        int i18 = layoutParams.y;
        int currentStateWidth = getCurrentStateWidth() + i17;
        int i19 = this.f93566y1.x;
        boolean z18 = false;
        if (!(currentStateWidth != i19) && !z17) {
            return false;
        }
        int max = java.lang.Math.max(java.lang.Math.min(i17, i19), -getLayoutParams().width);
        int max2 = java.lang.Math.max(java.lang.Math.min(i18, this.f93566y1.y), 0);
        if (this.V1 && W()) {
            z18 = true;
        }
        int y17 = y(Z(max), z18);
        int z19 = z(max2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "stickToScreenEdgeIfNeed, start:[%s, %s], target:[%s, %s]", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(y17), java.lang.Integer.valueOf(z19));
        if (max != y17 || max2 != z19) {
            z0(y17, z19, true, false, true, true);
            I0(this.f93563x1, y17, z19, true, false);
        }
        return true;
    }

    public final android.graphics.Point x(android.graphics.Point point, int i17, int i18, int i19, int i27, boolean z17) {
        int c17;
        if (point == null) {
            point = getFloatBallCurrentPositionExceptShadow();
        }
        int i28 = point.x;
        int i29 = point.y;
        android.graphics.Point floatBallCurrentSizeExceptShadow = getFloatBallCurrentSizeExceptShadow();
        if (z17 != this.f93536j2) {
            return null;
        }
        int i37 = floatBallCurrentSizeExceptShadow.x;
        boolean z18 = true;
        if (i28 <= i17 ? i28 + i37 <= i17 : i17 + i19 <= i28) {
            z18 = false;
        }
        if (!z18 || (c17 = qp1.g0.c(i18, i27, i29, floatBallCurrentSizeExceptShadow.y, new yz5.l() { // from class: rp1.d1$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                int intValue = ((java.lang.Integer) obj).intValue();
                int i38 = com.tencent.mm.plugin.ball.view.FloatBallView.f93514u2;
                com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = com.tencent.mm.plugin.ball.view.FloatBallView.this;
                floatBallView.getClass();
                int a17 = intValue - qp1.e0.a(qp1.c0.f365704m);
                if (floatBallView.L != null && floatBallView.Y1 && floatBallView.W()) {
                    a17 -= (qp1.e0.a(floatBallView.r(floatBallView.f93524d)) - floatBallView.L.getCollapseViewHeight()) / 2;
                }
                return java.lang.Boolean.valueOf(floatBallView.z(a17) == a17);
            }
        })) == i29) {
            return null;
        }
        int a17 = c17 - qp1.e0.a(qp1.c0.f365704m);
        if (this.Y1 && W()) {
            a17 -= (qp1.e0.a(r(this.f93524d)) - floatBallCurrentSizeExceptShadow.y) / 2;
        }
        return new android.graphics.Point(getCurrentBallX(), a17);
    }

    public final void x0(com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo) {
        if (ballBlurInfo.f93068f != null) {
            android.view.View view = this.f93558u;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateBallContainerMask", "(Lcom/tencent/mm/plugin/ball/model/BallInfo$BallBlurInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateBallContainerMask", "(Lcom/tencent/mm/plugin/ball/model/BallInfo$BallBlurInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f93558u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ball/view/FloatBallView", "updateBallContainerMask", "(Lcom/tencent/mm/plugin/ball/model/BallInfo$BallBlurInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ball/view/FloatBallView", "updateBallContainerMask", "(Lcom/tencent/mm/plugin/ball/model/BallInfo$BallBlurInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final int y(boolean z17, boolean z18) {
        int i17;
        int a17;
        int a18;
        if (this.V1) {
            if (z18) {
                int s17 = s(this.f93524d);
                a18 = z17 ? qp1.e0.a(((this.K1 + 0) - s17) - qp1.c0.f365707p) : (this.f93566y1.x + qp1.e0.a((s17 + qp1.c0.f365707p) - this.K1)) - getLayoutParams().width;
            } else {
                int i18 = G2;
                if (z17) {
                    a18 = qp1.e0.a(i18 - qp1.c0.f365707p);
                } else {
                    i17 = this.f93566y1.x - getLayoutParams().width;
                    a17 = qp1.e0.a(qp1.c0.f365707p - i18);
                    a18 = i17 + a17;
                }
            }
        } else if (z17) {
            a18 = 0 - (E(this.f93524d) ? qp1.e0.a(qp1.c0.f365707p) : qp1.e0.a(qp1.c0.f365707p));
        } else {
            i17 = this.f93566y1.x - getLayoutParams().width;
            a17 = E(this.f93524d) ? qp1.e0.a(qp1.c0.f365707p) : qp1.e0.a(qp1.c0.f365707p);
            a18 = i17 + a17;
        }
        int o17 = o(a18);
        int i19 = this.f93566y1.x;
        int i27 = qp1.c0.f365692a;
        int i28 = getLayoutParams().width;
        return o17;
    }

    public void y0(int i17, int i18, boolean z17, boolean z18) {
        z0(i17, i18, z17, z18, true, true);
    }

    public final int z(int i17) {
        int currentBallHeight = this.f93566y1.y - getCurrentBallHeight();
        int i18 = qp1.c0.f365702k;
        return java.lang.Math.max(java.lang.Math.min(i17, currentBallHeight - i18), i18);
    }

    public void z0(int i17, int i18, boolean z17, boolean z18, boolean z19, boolean z27) {
        android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) getLayoutParams();
        int i19 = layoutParams.x;
        int i27 = layoutParams.y;
        if (this.f93542n != null) {
            if (i19 == i17 && i27 == i18) {
                return;
            }
            layoutParams.x = i17;
            layoutParams.y = i18;
            try {
                this.f93542n.updateViewLayout(this, layoutParams);
                if (z19) {
                    f0(i17, i18, z17, z18, z27);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallView", th6, "updateBallPosition fail", new java.lang.Object[0]);
            }
        }
    }

    public FloatBallView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f93524d = 0;
        this.f93526e = 0;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        this.f93528f = null;
        this.f93546p = new java.util.concurrent.CopyOnWriteArraySet();
        this.M = false;
        this.S = 0;
        this.T = -1;
        this.V = false;
        this.W = false;
        this.f93547p0 = 0;
        this.f93562x0 = 0;
        this.f93568z1 = new android.graphics.PointF();
        this.A1 = new android.graphics.Point();
        this.B1 = -1.0f;
        this.C1 = 0;
        this.D1 = false;
        this.E1 = true;
        this.F1 = false;
        this.G1 = false;
        this.H1 = false;
        this.I1 = true;
        this.J1 = 0;
        this.K1 = F2;
        this.O1 = null;
        this.P1 = new android.graphics.Point();
        this.Q1 = false;
        this.R1 = 16;
        this.S1 = -1;
        this.T1 = 0;
        this.U1 = 0;
        this.V1 = false;
        this.W1 = 1.0f;
        this.X1 = 1.0f;
        this.Y1 = false;
        this.Z1 = false;
        qp1.r rVar = new qp1.r(getContext());
        this.f93521a2 = rVar;
        qp1.l lVar = new qp1.l(getContext());
        this.f93522b2 = lVar;
        boolean Di = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di();
        this.f93523c2 = Di;
        rp1.v0 v0Var = new rp1.v0("normal");
        this.f93525d2 = v0Var;
        this.f93527e2 = false;
        this.f93529f2 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f93531g2 = null;
        this.f93533h2 = false;
        this.f93535i2 = false;
        this.f93536j2 = false;
        this.f93537k2 = 0;
        this.f93539l2 = false;
        this.f93541m2 = false;
        boolean wi6 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi();
        this.f93543n2 = wi6;
        this.f93545o2 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f93549p2 = new rp1.f1(this);
        this.f93551q2 = false;
        this.f93553r2 = false;
        this.f93555s2 = false;
        this.f93557t2 = 0;
        android.view.View.inflate(context, com.tencent.mm.R.layout.bo7, this);
        this.N = getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1);
        this.P = getContext().getResources().getColor(com.tencent.mm.R.color.a9e);
        if (wi6) {
            this.K1 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            this.E1 = false;
        }
        this.f93554s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.acz);
        this.f93556t = (com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById(com.tencent.mm.R.id.f483334ad3);
        this.f93558u = findViewById(com.tencent.mm.R.id.ptz);
        this.C = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.acy);
        this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483335ad4);
        this.f93560w = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.co9);
        this.f93561x = (com.tencent.mm.view.shadow.layout.WxShadowLinearLayout) findViewById(com.tencent.mm.R.id.cpn);
        this.A = (com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout) findViewById(com.tencent.mm.R.id.kmu);
        this.B = (com.tencent.mm.view.shadow.layout.WxShadowLinearLayout) findViewById(com.tencent.mm.R.id.kmw);
        this.f93552r = findViewById(com.tencent.mm.R.id.d1a);
        this.E = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f483330ad0);
        this.F = (com.tencent.mm.plugin.ball.view.CircleAnimateView) findViewById(com.tencent.mm.R.id.of7);
        this.G = (com.tencent.mm.plugin.ball.view.CircleAnimateView) findViewById(com.tencent.mm.R.id.atd);
        this.H = (com.tencent.mm.plugin.ball.view.CircleAnimateView) findViewById(com.tencent.mm.R.id.f487290o60);
        this.I = (com.tencent.mm.plugin.ball.view.CircleAnimateView) findViewById(com.tencent.mm.R.id.gd7);
        android.widget.FrameLayout ballStateViewContainer = this.E;
        kotlin.jvm.internal.o.g(ballStateViewContainer, "ballStateViewContainer");
        rVar.f365738b = ballStateViewContainer;
        kz5.h0.w(rVar.f365739c, new com.tencent.mm.plugin.ball.view.CircleAnimateView[]{this.F, this.G, this.H, this.I});
        android.widget.ImageView contentImageView = this.D;
        kotlin.jvm.internal.o.g(contentImageView, "contentImageView");
        lVar.f365734d = contentImageView;
        if (wi6) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = new com.tencent.mm.plugin.ball.view.FloatBallCollapseView(context2, null);
            this.L = floatBallCollapseView;
            floatBallCollapseView.f93487m = this;
            this.f93559v = floatBallCollapseView.getF93484g();
            this.f93520J = this.L.getF93485h();
            this.L.setOnClickListener(new android.view.View.OnClickListener() { // from class: rp1.d1$$i
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i18 = com.tencent.mm.plugin.ball.view.FloatBallView.f93514u2;
                    com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = com.tencent.mm.plugin.ball.view.FloatBallView.this;
                    floatBallView.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/ball/view/FloatBallView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", floatBallView, array);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "onCollapseViewClick-normal isCurrentCollapsedState: %s", java.lang.Boolean.valueOf(floatBallView.W()));
                    if (floatBallView.L.getVisibility() == 0 && floatBallView.W()) {
                        android.graphics.PointF pointF = floatBallView.f93568z1;
                        floatBallView.d0(pointF.x, pointF.y);
                    }
                    yj0.a.h(floatBallView, "com/tencent/mm/plugin/ball/view/FloatBallView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            this.f93559v = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f483332ad2);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483331ad1);
            this.f93520J = weImageView;
            qp1.g0.e(weImageView, qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480515a04)), qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480514a03)));
            android.widget.LinearLayout linearLayout = this.f93559v;
            int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480516a05));
            if (linearLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a17;
                } else {
                    layoutParams2 = null;
                }
                linearLayout.setLayoutParams(layoutParams2);
            }
        }
        this.f93554s.setLayoutTransition(null);
        this.f93559v.setVisibility(8);
        if (Di) {
            v0Var.f398540d = new rp1.p0() { // from class: rp1.d1$$d
                @Override // rp1.p0
                public final void a(boolean z17) {
                    com.tencent.mm.plugin.ball.view.FloatBallView.a(com.tencent.mm.plugin.ball.view.FloatBallView.this, z17);
                }
            };
        }
        this.f93544o = new ep1.x(this);
        this.f93534i = (android.os.Vibrator) context.getSystemService("vibrator");
        this.f93542n = (android.view.WindowManager) context.getSystemService("window");
        this.f93530g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f93566y1 = com.tencent.mm.ui.bk.h(context);
        if (com.tencent.mm.ui.bk.v0() && com.tencent.mm.ui.bk.P(context)) {
            this.f93566y1.x = com.tencent.mm.ui.bk.g();
        }
        if (com.tencent.mm.ui.bk.y()) {
            this.f93566y1.x = com.tencent.mm.ui.bk.f();
        }
        this.f93532h = android.view.ViewConfiguration.getLongPressTimeout();
        android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition();
        this.U = layoutTransition;
        this.f93554s.setLayoutTransition(layoutTransition);
        this.f93538l1 = getResources().getConfiguration().orientation;
        this.J1 = com.tencent.mm.ui.bk.j(getContext());
        com.tencent.mm.ui.bk.p(getContext());
        this.f93556t.setRadius(qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a0p)));
        android.view.View view = this.f93552r;
        int a18 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a0n));
        kotlin.jvm.internal.o.g(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.height = a18;
            layoutParams = layoutParams3;
        }
        view.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams4 = this.B.getLayoutParams();
        if (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).topMargin = -qp1.e0.a(i65.a.b(getContext(), 20));
        }
    }
}
