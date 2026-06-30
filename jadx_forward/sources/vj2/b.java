package vj2;

/* loaded from: classes10.dex */
public final class b extends oj2.m {
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b W;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.ViewGroup f519197l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.FrameLayout f519198p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.ImageView f519199p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.ViewGroup f519200x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.TextView f519201x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.view.ViewGroup f519202y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.ViewGroup f519203y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // oj2.m, wj2.w
    public void R() {
        super.R();
        if (a0()) {
            android.view.ViewGroup viewGroup = this.f519202y0;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicSmallLayout");
                throw null;
            }
            viewGroup.setVisibility(8);
            android.view.ViewGroup viewGroup2 = this.f519200x0;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusLayout");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup3 = this.f519202y0;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicSmallLayout");
            throw null;
        }
        viewGroup3.setVisibility(0);
        android.view.ViewGroup viewGroup4 = this.f519200x0;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusLayout");
            throw null;
        }
    }

    @Override // oj2.m
    public void Z() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ash, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.a6r;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a6r);
        if (c1073x7e08a787 != null) {
            i17 = com.p314xaae8f345.mm.R.id.a7r;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.a7r);
            if (c1073x7e08a7872 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f566160ey2;
                android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566160ey2);
                if (a17 != null) {
                    fg2.y a18 = fg2.y.a(a17);
                    android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
                    if (a19 != null) {
                        fg2.z a27 = fg2.z.a(a19);
                        int i18 = com.p314xaae8f345.mm.R.id.f_y;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_y);
                        if (frameLayout != null) {
                            i18 = com.p314xaae8f345.mm.R.id.f_z;
                            if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f_z)) != null) {
                                i18 = com.p314xaae8f345.mm.R.id.f566257fa0;
                                android.view.View a28 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566257fa0);
                                if (a28 != null) {
                                    fg2.r0 a29 = fg2.r0.a(a28);
                                    int i19 = com.p314xaae8f345.mm.R.id.f566259fa2;
                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566259fa2);
                                    if (imageView != null) {
                                        i19 = com.p314xaae8f345.mm.R.id.f566260fa3;
                                        if (((android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566260fa3)) != null) {
                                            i19 = com.p314xaae8f345.mm.R.id.f566261fa4;
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566261fa4);
                                            if (c14296xe95b9a60 != null) {
                                                i19 = com.p314xaae8f345.mm.R.id.f566262fa5;
                                                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566262fa5);
                                                if (c22789xd23e9a9b != null) {
                                                    i19 = com.p314xaae8f345.mm.R.id.fa_;
                                                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fa_);
                                                    if (textView != null) {
                                                        i19 = com.p314xaae8f345.mm.R.id.fag;
                                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fag);
                                                        if (frameLayout2 != null) {
                                                            i19 = com.p314xaae8f345.mm.R.id.fah;
                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fah);
                                                            if (c22699x3dcdb352 != null) {
                                                                i19 = com.p314xaae8f345.mm.R.id.fak;
                                                                android.view.View a37 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                                                                if (a37 != null) {
                                                                    fg2.r0 a38 = fg2.r0.a(a37);
                                                                    android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.faq);
                                                                    if (imageView2 != null) {
                                                                        android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.far);
                                                                        if (imageView3 != null) {
                                                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a602 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fay);
                                                                            if (c14296xe95b9a602 != null) {
                                                                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                                                                                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f566263fb0);
                                                                                if (c22789xd23e9a9b2 != null) {
                                                                                    i18 = com.p314xaae8f345.mm.R.id.qrl;
                                                                                    android.view.View a39 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrl);
                                                                                    if (a39 != null) {
                                                                                        fg2.s0 a47 = fg2.s0.a(a39);
                                                                                        m151573xbb341eca(c22789xd23e9a9b2);
                                                                                        m151567x23cb40c5(frameLayout2);
                                                                                        m151568x5dfe2e73(c22699x3dcdb352);
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7873, "getRoot(...)");
                                                                                        m151575x764fb064(c1073x7e08a7873);
                                                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = a38.f343815a;
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7874, "getRoot(...)");
                                                                                        m151569x96ee7780(c1073x7e08a7874);
                                                                                        m151570x83dd4f11(imageView2);
                                                                                        m151572xc6161643(c14296xe95b9a602);
                                                                                        m151571x5ec635fd(imageView3);
                                                                                        m151566x1da37660(textView);
                                                                                        android.widget.RelativeLayout relativeLayout = a27.f343939a;
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                                                                                        m151565x91c3b56e(relativeLayout);
                                                                                        this.f519202y0 = c1073x7e08a7872;
                                                                                        m151574x719c0af4(a47.f343827b);
                                                                                        this.W = c22789xd23e9a9b;
                                                                                        this.f519198p0 = frameLayout;
                                                                                        android.widget.FrameLayout frameLayout3 = this.f519198p0;
                                                                                        if (frameLayout3 == null) {
                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusMuteIcon");
                                                                                            throw null;
                                                                                        }
                                                                                        frameLayout3.setOnClickListener(this);
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7873, "getRoot(...)");
                                                                                        m151575x764fb064(c1073x7e08a7873);
                                                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = a29.f343815a;
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a7875, "getRoot(...)");
                                                                                        this.f519197l1 = c1073x7e08a7875;
                                                                                        this.f519199p1 = imageView;
                                                                                        this.f519201x1 = c14296xe95b9a60;
                                                                                        android.widget.RelativeLayout relativeLayout2 = a18.f343929a;
                                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
                                                                                        this.f519203y1 = relativeLayout2;
                                                                                        this.f519200x0 = c1073x7e08a787;
                                                                                        return;
                                                                                    }
                                                                                } else {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.f566263fb0;
                                                                                }
                                                                            } else {
                                                                                i17 = com.p314xaae8f345.mm.R.id.fay;
                                                                            }
                                                                        } else {
                                                                            i17 = com.p314xaae8f345.mm.R.id.far;
                                                                        }
                                                                    } else {
                                                                        i17 = com.p314xaae8f345.mm.R.id.faq;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i17 = i19;
                                }
                            }
                        }
                        i17 = i18;
                    } else {
                        i17 = com.p314xaae8f345.mm.R.id.f8q;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final boolean a0() {
        xh2.i iVar;
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        return (m145850xf6df7a5e == null || (iVar = m145850xf6df7a5e.f536054b) == null || iVar.f536086e != 1) ? false : true;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.m
    /* renamed from: getAvatarView */
    public android.widget.ImageView mo151549xd639d394() {
        if (!a0()) {
            return m151555x219a509d();
        }
        android.widget.ImageView imageView = this.f519199p1;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusStateAudioAvatar");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // oj2.m, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // oj2.m, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        if (!a0()) {
            return m151554x3e2ffa0c();
        }
        android.view.ViewGroup viewGroup = this.f519197l1;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusGiftItemLayout");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "getLuckyMoneyRootView");
        if (!a0()) {
            return m151550xbf9ab862();
        }
        android.view.ViewGroup viewGroup = this.f519203y1;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveFocusLuckyMoneyBubbleUiRoot");
        throw null;
    }

    @Override // oj2.m
    /* renamed from: getMicAudioWaveIcon */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo151560xc71e8577() {
        if (!a0()) {
            return super.mo151560xc71e8577();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.W;
        if (c22789xd23e9a9b != null) {
            return c22789xd23e9a9b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusStateAudioWaveIcon");
        throw null;
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // oj2.m
    /* renamed from: getMicMuteIcon */
    public android.widget.FrameLayout mo151562xff646863() {
        if (!a0()) {
            return super.mo151562xff646863();
        }
        android.widget.FrameLayout frameLayout = this.f519198p0;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusMuteIcon");
        throw null;
    }

    @Override // oj2.m
    /* renamed from: getNickTextView */
    public android.widget.TextView mo151563xfa1f106b() {
        if (!a0()) {
            return m151557xbdfe0acf();
        }
        android.widget.TextView textView = this.f519201x1;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusStateAudioName");
        throw null;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabCoverAudioWidget";
    }

    @Override // oj2.m, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // oj2.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/grabfocus/FinderLiveMicGrabFocusCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        super.onClick(view);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.FrameLayout frameLayout = this.f519198p0;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicFocusMuteIcon");
            throw null;
        }
        int id6 = frameLayout.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            L();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/grabfocus/FinderLiveMicGrabFocusCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
