package t74;

/* loaded from: classes4.dex */
public final class d implements t74.f2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f497654b;

    public d(t74.w1 w1Var, float f17) {
        this.f497653a = w1Var;
        this.f497654b = f17;
    }

    public void a(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActionUpFling", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
        t74.w1 w1Var = this.f497653a;
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            R.f497695e++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsFlipCardDragMove$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        boolean z17 = w1Var.f497801i0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsFlipCardDragMove$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "onActionUpFling, doFlipCardTurnedAnim, mIsFlipCardDragMove is true, mCurrentPageIndex is " + t74.w1.N(w1Var));
            int N = t74.w1.N(w1Var);
            float f18 = this.f497654b;
            if (N == 0) {
                w1Var.o0(t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), f18);
            } else {
                w1Var.o0(t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), f18);
            }
        } else {
            float f19 = f17 > 0.0f ? 90.0f : -90.0f;
            if (t74.w1.N(w1Var) == 0) {
                java.lang.String j17 = w1Var.j();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActionUpFling, mIsFlipCardDragMove is false, mCurrentPageIndex is front_page, rotationY is ");
                android.widget.ImageView S = t74.w1.S(w1Var);
                sb6.append(S != null ? java.lang.Float.valueOf(S.getRotationY()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
                w1Var.n0(t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), t74.w1.T(w1Var), t74.w1.F(w1Var), 1, f19, this.f497654b);
            } else {
                java.lang.String j18 = w1Var.j();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onActionUpFling, mIsFlipCardDragMove is false, mCurrentPageIndex is back_page, rotationY is ");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 D = t74.w1.D(w1Var);
                sb7.append(D != null ? java.lang.Float.valueOf(D.getRotationY()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j18, sb7.toString());
                w1Var.n0(t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), t74.w1.F(w1Var), t74.w1.T(w1Var), 0, f19, this.f497654b);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActionUpFling", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
    }

    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActionUpNoFling", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
        t74.w1 w1Var = this.f497653a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w1Var.j(), "onActionUpNoFling, velocityX is " + f17 + ", mCurrentPageIndex is " + t74.w1.N(w1Var));
        t74.i2 R = t74.w1.R(w1Var);
        if (R != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
            R.f497695e++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.FlipCardAdChannelData");
        }
        int N = t74.w1.N(w1Var);
        float f18 = this.f497654b;
        if (N == 0) {
            w1Var.o0(t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), f18);
        } else {
            w1Var.o0(t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), f18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActionUpNoFling", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
    }

    public void c(float f17) {
        java.lang.String str;
        int i17;
        int i18;
        java.lang.String str2 = "onTouchDrag";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchDrag", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMIsDoingFlipCardAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.w1 w1Var = this.f497653a;
        boolean z17 = w1Var.f497802j0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMIsDoingFlipCardAnim$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchDrag", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMInitAnimDone$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.f497803k0 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMInitAnimDone$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMInitFlipCardAnimatorSet$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.animation.AnimatorSet animatorSet = w1Var.f497799g0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMInitFlipCardAnimatorSet$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFlipIntroduceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.LinearLayout D0 = w1Var.D0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFlipIntroduceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (D0 != null) {
            D0.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce O = t74.w1.O(w1Var);
        if (O != null) {
            O.setAlpha(1.0f);
        }
        float M = (f17 / t74.w1.M(w1Var)) * 180;
        float f18 = (-M) / 90;
        w1Var.j();
        t74.w1.M(w1Var);
        android.widget.ImageView S = t74.w1.S(w1Var);
        if (S != null) {
            S.getRotationY();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 D = t74.w1.D(w1Var);
        if (D != null) {
            D.getRotationY();
        }
        t74.w1.N(w1Var);
        int N = t74.w1.N(w1Var);
        float f19 = this.f497654b;
        if (N == 0) {
            android.widget.ImageView S2 = t74.w1.S(w1Var);
            if (S2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchDrag", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
                return;
            }
            w1Var.s0(t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), f18, M, this.f497654b);
            if (S2.getRotationY() <= -90.0f || S2.getRotationY() >= 90.0f) {
                t74.i2 R = t74.w1.R(w1Var);
                if (R != null) {
                    R.d();
                }
                t74.i2 R2 = t74.w1.R(w1Var);
                if (R2 != null) {
                    R2.c(1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsFlipCardDragMove$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.f497801i0 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsFlipCardDragMove$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                t74.w1.i0(w1Var, 1);
                if (t74.w1.Z(w1Var)) {
                    t74.i2 R3 = t74.w1.R(w1Var);
                    if (R3 != null) {
                        R3.e(0);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W = t74.w1.W(w1Var);
                    if (W != null) {
                        W.M(0, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W2 = t74.w1.W(w1Var);
                    if (W2 != null) {
                        W2.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 1);
                    }
                }
                if (S2.getRotationY() <= -90.0f) {
                    float f27 = -f19;
                    str = "onTouchDrag";
                    i17 = 4;
                    i18 = 0;
                    w1Var.p0(t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), -90.0f, f27, f27 * 2);
                } else {
                    str = "onTouchDrag";
                    i17 = 4;
                    i18 = 0;
                    android.widget.ImageView S3 = t74.w1.S(w1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17762xf413b514 U = t74.w1.U(w1Var);
                    android.widget.ImageView X = t74.w1.X(w1Var);
                    android.view.View E = t74.w1.E(w1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17762xf413b514 G = t74.w1.G(w1Var);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 I = t74.w1.I(w1Var);
                    float f28 = this.f497654b;
                    w1Var.p0(S3, U, X, E, G, I, 90.0f, f28, f28 * 2);
                }
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce O2 = t74.w1.O(w1Var);
                if (O2 != null) {
                    O2.m78922x7d600aec(t74.w1.N(w1Var));
                }
                android.widget.FrameLayout T = t74.w1.T(w1Var);
                if (T != null) {
                    T.setVisibility(i17);
                }
                android.widget.FrameLayout F = t74.w1.F(w1Var);
                if (F != null) {
                    F.setVisibility(i18);
                }
                str2 = str;
            } else {
                t74.w1.i0(w1Var, 0);
                android.widget.FrameLayout T2 = t74.w1.T(w1Var);
                if (T2 != null) {
                    T2.setVisibility(0);
                }
                android.widget.FrameLayout F2 = t74.w1.F(w1Var);
                if (F2 != null) {
                    F2.setVisibility(4);
                }
            }
        } else {
            android.view.View E2 = t74.w1.E(w1Var);
            if (E2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchDrag", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
                return;
            }
            w1Var.s0(t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), f18, M, this.f497654b);
            if (E2.getRotationY() <= -90.0f || E2.getRotationY() >= 90.0f) {
                t74.i2 R4 = t74.w1.R(w1Var);
                if (R4 != null) {
                    R4.d();
                }
                t74.i2 R5 = t74.w1.R(w1Var);
                if (R5 != null) {
                    R5.c(0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsFlipCardDragMove$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                w1Var.f497801i0 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsFlipCardDragMove$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
                t74.w1.i0(w1Var, 0);
                if (t74.w1.Y(w1Var)) {
                    t74.i2 R6 = t74.w1.R(w1Var);
                    if (R6 != null) {
                        R6.e(1);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H = t74.w1.H(w1Var);
                    if (H != null) {
                        H.M(0, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 H2 = t74.w1.H(w1Var);
                    if (H2 != null) {
                        H2.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 1);
                    }
                }
                if (E2.getRotationY() <= -90.0f) {
                    float f29 = -f19;
                    w1Var.p0(t74.w1.E(w1Var), t74.w1.G(w1Var), t74.w1.I(w1Var), t74.w1.S(w1Var), t74.w1.U(w1Var), t74.w1.X(w1Var), -90.0f, f29, f29 * 2);
                } else {
                    android.view.View E3 = t74.w1.E(w1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17762xf413b514 G2 = t74.w1.G(w1Var);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 I2 = t74.w1.I(w1Var);
                    android.widget.ImageView S4 = t74.w1.S(w1Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17762xf413b514 U2 = t74.w1.U(w1Var);
                    android.widget.ImageView X2 = t74.w1.X(w1Var);
                    float f37 = this.f497654b;
                    w1Var.p0(E3, G2, I2, S4, U2, X2, 90.0f, f37, f37 * 2);
                }
                w1Var.L0();
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce O3 = t74.w1.O(w1Var);
                if (O3 != null) {
                    O3.m78922x7d600aec(t74.w1.N(w1Var));
                }
                android.widget.FrameLayout T3 = t74.w1.T(w1Var);
                if (T3 != null) {
                    T3.setVisibility(0);
                }
                android.widget.FrameLayout F3 = t74.w1.F(w1Var);
                if (F3 != null) {
                    F3.setVisibility(4);
                }
            } else {
                t74.w1.i0(w1Var, 1);
                android.widget.FrameLayout T4 = t74.w1.T(w1Var);
                if (T4 != null) {
                    T4.setVisibility(4);
                }
                android.widget.FrameLayout F4 = t74.w1.F(w1Var);
                if (F4 != null) {
                    F4.setVisibility(0);
                }
            }
            str2 = "onTouchDrag";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$8");
    }
}
