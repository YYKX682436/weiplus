package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallButtonViewV2;", "Lcom/tencent/mm/plugin/ball/view/BaseFloatBallButtonView;", "", "show", "Ljz5/f0;", "setShowAudioWaveButton", "Landroid/view/View$OnClickListener;", "clickListener", "setOnPlayButtonClickListener", "setOnDeleteButtonClickListener", "setOnPlayModeButtonClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallButtonViewV2 */
/* loaded from: classes10.dex */
public final class C12924xc2b367ce extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f175007d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f175008e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f175009f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12920x271eee9b f175010g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f175011h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12924xc2b367ce(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = ballInfo.f174587o;
        boolean z17 = ballButtonInfo.f174603e;
        boolean z18 = ballButtonInfo.f174604f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175007d;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        boolean z19 = false;
        c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f175007d;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        c22699x3dcdb3522.setEnabled(z18);
        boolean z27 = ballButtonInfo.f174611p;
        boolean z28 = ballButtonInfo.f174612q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f175008e;
        if (c22699x3dcdb3523 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
            throw null;
        }
        c22699x3dcdb3523.setVisibility(z27 ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f175008e;
        if (c22699x3dcdb3524 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
            throw null;
        }
        c22699x3dcdb3524.setEnabled(z28);
        boolean z29 = ballButtonInfo.f174606h;
        boolean z37 = ballButtonInfo.f174607i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f175009f;
        if (c22699x3dcdb3525 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
        c22699x3dcdb3525.setVisibility(z29 ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.f175009f;
        if (c22699x3dcdb3526 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
        c22699x3dcdb3526.setEnabled(z37);
        if (ballButtonInfo.f174613r && !ballButtonInfo.f174610o) {
            z19 = true;
        }
        m54146x11ca6b82(z19);
        boolean z38 = ballButtonInfo.f174602d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = this.f175007d;
        if (c22699x3dcdb3527 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        c22699x3dcdb3527.setImageResource(z38 ? com.p314xaae8f345.mm.R.raw.f79371x277d5a6a : com.p314xaae8f345.mm.R.raw.f79373x9d1ce7a1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = this.f175007d;
        if (c22699x3dcdb3528 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        c22699x3dcdb3528.setContentDescription(z38 ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574846lg1) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574847lg2));
        boolean z39 = ballButtonInfo.f174610o;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3529 = this.f175008e;
        if (c22699x3dcdb3529 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
            throw null;
        }
        c22699x3dcdb3529.setImageResource(z39 ? com.p314xaae8f345.mm.R.raw.f79374x91dfecb9 : com.p314xaae8f345.mm.R.raw.f79365x59692433);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35210 = this.f175008e;
        if (c22699x3dcdb35210 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
            throw null;
        }
        c22699x3dcdb35210.setContentDescription(z39 ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oks) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oku));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35211 = this.f175007d;
        if (c22699x3dcdb35211 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        b(c22699x3dcdb35211, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35212 = this.f175008e;
        if (c22699x3dcdb35212 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
            throw null;
        }
        b(c22699x3dcdb35212, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35213 = this.f175009f;
        if (c22699x3dcdb35213 != null) {
            b(c22699x3dcdb35213, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562046a02));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
    }

    public final void b(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = qp1.e0.a(i17);
        layoutParams.height = qp1.e0.a(i17);
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    /* renamed from: setOnDeleteButtonClickListener */
    public void mo54082x5ab9ddbe(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175009f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    /* renamed from: setOnPlayButtonClickListener */
    public void mo54083xb892d55(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175007d;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12911xaef21721
    /* renamed from: setOnPlayModeButtonClickListener */
    public void mo54084xf2051d32(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175008e;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(onClickListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
            throw null;
        }
    }

    /* renamed from: setShowAudioWaveButton */
    public final void m54146x11ca6b82(boolean z17) {
        android.widget.RelativeLayout relativeLayout = this.f175011h;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFloatBallAudioWaveContainer");
            throw null;
        }
        relativeLayout.setVisibility(z17 ? 0 : 8);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12920x271eee9b c12920x271eee9b = this.f175010g;
            if (c12920x271eee9b == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFloatBallAudioWaveRoot");
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c12920x271eee9b.f174975d, "[showAnim] isQuickMode:true");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12921xde8d5499 c12921xde8d5499 = c12920x271eee9b.leftWave;
            if (!c12921xde8d5499.f174991q) {
                int i17 = c12921xde8d5499.f174982e / 2;
                c12921xde8d5499.f174984g = c12921xde8d5499.f174983f / 2;
            }
            c12921xde8d5499.f174991q = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12921xde8d5499 c12921xde8d54992 = c12920x271eee9b.rightWave;
            if (!c12921xde8d54992.f174991q) {
                int i18 = c12921xde8d54992.f174982e / 2;
                c12921xde8d54992.f174984g = c12921xde8d54992.f174983f / 2;
            }
            c12921xde8d54992.f174991q = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12920x271eee9b c12920x271eee9b2 = this.f175010g;
            if (c12920x271eee9b2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFloatBallAudioWaveRoot");
                throw null;
            }
            c12920x271eee9b2.titleTxt.setTextSize(1, 12.0f);
            int h17 = i65.a.h(c12920x271eee9b2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            int h18 = i65.a.h(c12920x271eee9b2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
            i65.a.h(c12920x271eee9b2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            float b17 = i65.a.b(c12920x271eee9b2.getContext(), 2);
            c12920x271eee9b2.leftWave.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h18, h17));
            c12920x271eee9b2.rightWave.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h18, h17));
            c12920x271eee9b2.leftWave.setTranslationX(i65.a.b(c12920x271eee9b2.getContext(), 2));
            c12920x271eee9b2.rightWave.setTranslationX(-i65.a.b(c12920x271eee9b2.getContext(), 2));
            float f17 = h18;
            c12920x271eee9b2.leftWave.m54136xf560516(f17);
            c12920x271eee9b2.rightWave.m54136xf560516(f17);
            c12920x271eee9b2.leftWave.m54137xb756d00b(b17);
            c12920x271eee9b2.rightWave.m54137xb756d00b(b17);
            c12920x271eee9b2.leftWave.b(true, false);
            c12920x271eee9b2.rightWave.b(true, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12920x271eee9b c12920x271eee9b3 = this.f175010g;
            if (c12920x271eee9b3 != null) {
                c12920x271eee9b3.getTitleTxt().setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.okt));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFloatBallAudioWaveRoot");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12924xc2b367ce(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570738ei2, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kwj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f175007d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.crz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f175009f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.uqj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f175008e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.tx9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f175010g = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12920x271eee9b) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.tx8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f175011h = (android.widget.RelativeLayout) findViewById5;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f175009f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574845lg0));
            android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.tx_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12928x49e6eb4) findViewById6).m54166x84d007a0(true);
            int a17 = qp1.e0.a(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f175007d;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setPadding(a17, a17, a17, a17);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f175008e;
                if (c22699x3dcdb3523 != null) {
                    c22699x3dcdb3523.setPadding(a17, a17, a17, a17);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f175009f;
                    if (c22699x3dcdb3524 != null) {
                        c22699x3dcdb3524.setPadding(a17, a17, a17, a17);
                        int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f175007d;
                        if (c22699x3dcdb3525 != null) {
                            c22699x3dcdb3525.m82040x7541828(d17);
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.f175008e;
                            if (c22699x3dcdb3526 != null) {
                                c22699x3dcdb3526.m82040x7541828(d17);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = this.f175009f;
                                if (c22699x3dcdb3527 != null) {
                                    c22699x3dcdb3527.m82040x7541828(d17);
                                    return;
                                } else {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
                                    throw null;
                                }
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
                            throw null;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
                        throw null;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
                    throw null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayModeSwitchButton");
                throw null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayButton");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDeleteButton");
        throw null;
    }
}
