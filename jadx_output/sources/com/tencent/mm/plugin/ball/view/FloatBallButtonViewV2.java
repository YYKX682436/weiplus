package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallButtonViewV2;", "Lcom/tencent/mm/plugin/ball/view/BaseFloatBallButtonView;", "", "show", "Ljz5/f0;", "setShowAudioWaveButton", "Landroid/view/View$OnClickListener;", "clickListener", "setOnPlayButtonClickListener", "setOnDeleteButtonClickListener", "setOnPlayModeButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FloatBallButtonViewV2 extends com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93474d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93475e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93476f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallAudioWaveRootView f93477g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f93478h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatBallButtonViewV2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
        boolean z17 = ballButtonInfo.f93070e;
        boolean z18 = ballButtonInfo.f93071f;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93474d;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        boolean z19 = false;
        weImageView.setVisibility(z17 ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f93474d;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        weImageView2.setEnabled(z18);
        boolean z27 = ballButtonInfo.f93078p;
        boolean z28 = ballButtonInfo.f93079q;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f93475e;
        if (weImageView3 == null) {
            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
            throw null;
        }
        weImageView3.setVisibility(z27 ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f93475e;
        if (weImageView4 == null) {
            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
            throw null;
        }
        weImageView4.setEnabled(z28);
        boolean z29 = ballButtonInfo.f93073h;
        boolean z37 = ballButtonInfo.f93074i;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f93476f;
        if (weImageView5 == null) {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
        weImageView5.setVisibility(z29 ? 0 : 8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f93476f;
        if (weImageView6 == null) {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
        weImageView6.setEnabled(z37);
        if (ballButtonInfo.f93080r && !ballButtonInfo.f93077o) {
            z19 = true;
        }
        setShowAudioWaveButton(z19);
        boolean z38 = ballButtonInfo.f93069d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.f93474d;
        if (weImageView7 == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        weImageView7.setImageResource(z38 ? com.tencent.mm.R.raw.float_ball_icon_pause_regular : com.tencent.mm.R.raw.float_ball_icon_specialplay_regular);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = this.f93474d;
        if (weImageView8 == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        weImageView8.setContentDescription(z38 ? getResources().getString(com.tencent.mm.R.string.f493313lg1) : getResources().getString(com.tencent.mm.R.string.f493314lg2));
        boolean z39 = ballButtonInfo.f93077o;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView9 = this.f93475e;
        if (weImageView9 == null) {
            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
            throw null;
        }
        weImageView9.setImageResource(z39 ? com.tencent.mm.R.raw.float_ball_icon_switch_to_video : com.tencent.mm.R.raw.float_ball_icon_eyes_on);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView10 = this.f93475e;
        if (weImageView10 == null) {
            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
            throw null;
        }
        weImageView10.setContentDescription(z39 ? getResources().getString(com.tencent.mm.R.string.oks) : getResources().getString(com.tencent.mm.R.string.oku));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView11 = this.f93474d;
        if (weImageView11 == null) {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        b(weImageView11, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView12 = this.f93475e;
        if (weImageView12 == null) {
            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
            throw null;
        }
        b(weImageView12, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView13 = this.f93476f;
        if (weImageView13 != null) {
            b(weImageView13, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480513a02));
        } else {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
    }

    public final void b(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = qp1.e0.a(i17);
        layoutParams.height = qp1.e0.a(i17);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void setOnDeleteButtonClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93476f;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("mDeleteButton");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void setOnPlayButtonClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93474d;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.ball.view.BaseFloatBallButtonView
    public void setOnPlayModeButtonClickListener(android.view.View.OnClickListener onClickListener) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93475e;
        if (weImageView != null) {
            weImageView.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
            throw null;
        }
    }

    public final void setShowAudioWaveButton(boolean z17) {
        android.widget.RelativeLayout relativeLayout = this.f93478h;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("mFloatBallAudioWaveContainer");
            throw null;
        }
        relativeLayout.setVisibility(z17 ? 0 : 8);
        if (z17) {
            com.tencent.mm.plugin.ball.view.FloatBallAudioWaveRootView floatBallAudioWaveRootView = this.f93477g;
            if (floatBallAudioWaveRootView == null) {
                kotlin.jvm.internal.o.o("mFloatBallAudioWaveRoot");
                throw null;
            }
            com.tencent.mars.xlog.Log.i(floatBallAudioWaveRootView.f93442d, "[showAnim] isQuickMode:true");
            com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView = floatBallAudioWaveRootView.leftWave;
            if (!floatBallAudioWaveView.f93458q) {
                int i17 = floatBallAudioWaveView.f93449e / 2;
                floatBallAudioWaveView.f93451g = floatBallAudioWaveView.f93450f / 2;
            }
            floatBallAudioWaveView.f93458q = true;
            com.tencent.mm.plugin.ball.view.FloatBallAudioWaveView floatBallAudioWaveView2 = floatBallAudioWaveRootView.rightWave;
            if (!floatBallAudioWaveView2.f93458q) {
                int i18 = floatBallAudioWaveView2.f93449e / 2;
                floatBallAudioWaveView2.f93451g = floatBallAudioWaveView2.f93450f / 2;
            }
            floatBallAudioWaveView2.f93458q = true;
            com.tencent.mm.plugin.ball.view.FloatBallAudioWaveRootView floatBallAudioWaveRootView2 = this.f93477g;
            if (floatBallAudioWaveRootView2 == null) {
                kotlin.jvm.internal.o.o("mFloatBallAudioWaveRoot");
                throw null;
            }
            floatBallAudioWaveRootView2.titleTxt.setTextSize(1, 12.0f);
            int h17 = i65.a.h(floatBallAudioWaveRootView2.getContext(), com.tencent.mm.R.dimen.f479688cn);
            int h18 = i65.a.h(floatBallAudioWaveRootView2.getContext(), com.tencent.mm.R.dimen.f479673ca);
            i65.a.h(floatBallAudioWaveRootView2.getContext(), com.tencent.mm.R.dimen.f479646bl);
            float b17 = i65.a.b(floatBallAudioWaveRootView2.getContext(), 2);
            floatBallAudioWaveRootView2.leftWave.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h18, h17));
            floatBallAudioWaveRootView2.rightWave.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h18, h17));
            floatBallAudioWaveRootView2.leftWave.setTranslationX(i65.a.b(floatBallAudioWaveRootView2.getContext(), 2));
            floatBallAudioWaveRootView2.rightWave.setTranslationX(-i65.a.b(floatBallAudioWaveRootView2.getContext(), 2));
            float f17 = h18;
            floatBallAudioWaveRootView2.leftWave.setArcWidth(f17);
            floatBallAudioWaveRootView2.rightWave.setArcWidth(f17);
            floatBallAudioWaveRootView2.leftWave.setWaveWidth(b17);
            floatBallAudioWaveRootView2.rightWave.setWaveWidth(b17);
            floatBallAudioWaveRootView2.leftWave.b(true, false);
            floatBallAudioWaveRootView2.rightWave.b(true, true);
            com.tencent.mm.plugin.ball.view.FloatBallAudioWaveRootView floatBallAudioWaveRootView3 = this.f93477g;
            if (floatBallAudioWaveRootView3 != null) {
                floatBallAudioWaveRootView3.getTitleTxt().setText(getContext().getResources().getString(com.tencent.mm.R.string.okt));
            } else {
                kotlin.jvm.internal.o.o("mFloatBallAudioWaveRoot");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatBallButtonViewV2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489205ei2, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kwj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f93474d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.crz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f93476f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.uqj);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f93475e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.tx9);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f93477g = (com.tencent.mm.plugin.ball.view.FloatBallAudioWaveRootView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.tx8);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f93478h = (android.widget.RelativeLayout) findViewById5;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93476f;
        if (weImageView != null) {
            weImageView.setContentDescription(getResources().getString(com.tencent.mm.R.string.f493312lg0));
            android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.tx_);
            kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
            ((com.tencent.mm.plugin.ball.view.FloatBallRoundGradientFrameLayout) findViewById6).setUseBottomGradient(true);
            int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479648bn));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f93474d;
            if (weImageView2 != null) {
                weImageView2.setPadding(a17, a17, a17, a17);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f93475e;
                if (weImageView3 != null) {
                    weImageView3.setPadding(a17, a17, a17, a17);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f93476f;
                    if (weImageView4 != null) {
                        weImageView4.setPadding(a17, a17, a17, a17);
                        int d17 = i65.a.d(context, com.tencent.mm.R.color.aby);
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f93474d;
                        if (weImageView5 != null) {
                            weImageView5.setIconColor(d17);
                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f93475e;
                            if (weImageView6 != null) {
                                weImageView6.setIconColor(d17);
                                com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = this.f93476f;
                                if (weImageView7 != null) {
                                    weImageView7.setIconColor(d17);
                                    return;
                                } else {
                                    kotlin.jvm.internal.o.o("mDeleteButton");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
                            throw null;
                        }
                        kotlin.jvm.internal.o.o("mPlayButton");
                        throw null;
                    }
                    kotlin.jvm.internal.o.o("mDeleteButton");
                    throw null;
                }
                kotlin.jvm.internal.o.o("mPlayModeSwitchButton");
                throw null;
            }
            kotlin.jvm.internal.o.o("mPlayButton");
            throw null;
        }
        kotlin.jvm.internal.o.o("mDeleteButton");
        throw null;
    }
}
