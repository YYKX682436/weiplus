package qh2;

/* loaded from: classes10.dex */
public abstract class j extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f444977J;
    public pj2.c K;
    public android.view.ViewGroup L;
    public android.widget.ImageView M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        super(context, pluginAbility, service, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        qh2.i iVar = (qh2.i) this;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(iVar.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.drm, (android.view.ViewGroup) iVar, false);
        int i18 = com.p314xaae8f345.mm.R.id.auj;
        if (((android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.auj)) != null) {
            i18 = com.p314xaae8f345.mm.R.id.f8q;
            android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.f8q);
            if (a17 != null) {
                fg2.c0 a18 = fg2.c0.a(a17);
                android.view.View a19 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
                if (a19 != null) {
                    fg2.h0 a27 = fg2.h0.a(a19);
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                    int i19 = com.p314xaae8f345.mm.R.id.qrn;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrn);
                    if (imageView != null) {
                        i19 = com.p314xaae8f345.mm.R.id.qxy;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qxy);
                        if (c14246xaa893502 != null) {
                            iVar.Q = c14246xaa893502;
                            c14246xaa893502.b(iVar.m174010xb411027f().a());
                            iVar.m160166x568d8025(new qh2.g(iVar));
                            iVar.m174009x3a33aac1().a0().b(new qh2.h(iVar));
                            iVar.m160164x649eeed7(imageView);
                            android.widget.RelativeLayout relativeLayout = a27.f343595a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                            iVar.m160163x13f889c0(relativeLayout);
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = a18.f343490a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
                            iVar.m160162x91c3b56e(c22645x24069159);
                            iVar.m160157xbe07e4c().setTranslationY(-i65.a.b(iVar.getContext(), 10));
                            iVar.m160157xbe07e4c().setTranslationX(i65.a.b(iVar.getContext(), 32));
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                            iVar.m160165x764fb064(c1073x7e08a787);
                            setClipChildren(false);
                            setClipToPadding(false);
                            addView(m160160xfb84e958());
                            if (pluginAbility.f() == lj2.w0.f400491d) {
                                m160160xfb84e958().setOnClickListener(this);
                                return;
                            }
                            return;
                        }
                    }
                    i18 = i19;
                } else {
                    i18 = com.p314xaae8f345.mm.R.id.fak;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    @Override // wj2.w
    public void J() {
        java.lang.String str;
        super.J();
        if (zl2.r4.f555483a.x1()) {
            fj2.s sVar = fj2.s.f344716a;
            ml2.w4 w4Var = ml2.w4.f409720e;
            km2.q m145849x949ba2a5 = m145849x949ba2a5();
            if (m145849x949ba2a5 == null || (str = m145849x949ba2a5.f390705c) == null) {
                str = "";
            }
            fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        }
    }

    @Override // wj2.w
    public void K() {
        if (B()) {
            return;
        }
        super.K();
    }

    @Override // sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    @Override // sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && m174009x3a33aac1().a0().F())) {
            m160159xc91ab508().a();
            return;
        }
        if (this.f444977J != z17 || m160159xc91ab508().c() == z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f444977J);
            this.f444977J = z17;
            if (z17) {
                m160159xc91ab508().a();
            } else {
                m160159xc91ab508().b();
            }
        }
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    /* renamed from: getAvatarView */
    public android.widget.ImageView m160155xd639d394() {
        return m160158x4e6f0963();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    /* renamed from: getFinderLiveLuckyMoneyBubbleUiRoot */
    public final android.view.ViewGroup m160156xbf9ab862() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    /* renamed from: getFinderLiveMicGiftItemLayout */
    public final android.view.ViewGroup m160157xbe07e4c() {
        android.view.ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserAvatar */
    public final android.widget.ImageView m160158x4e6f0963() {
        android.widget.ImageView imageView = this.M;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicUserAvatar");
        throw null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        return m160157xbe07e4c();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "getLuckyMoneyRootView");
        return m160156xbf9ab862();
    }

    /* renamed from: getMicAudioWaveViewCallback */
    public pj2.c m160159xc91ab508() {
        return m160161xb290eb19();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m160160xfb84e958() {
        android.view.ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* renamed from: getWaveViewCallback */
    public final pj2.c m160161xb290eb19() {
        pj2.c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("waveViewCallback");
        throw null;
    }

    @Override // sj2.m
    public void h() {
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setVisibility(8);
        }
        android.view.ViewGroup mo124433x9681e6d2 = mo124433x9681e6d();
        if (mo124433x9681e6d2 == null) {
            return;
        }
        mo124433x9681e6d2.setTranslationX(0.0f);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicBaseCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = m160160xfb84e958().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            J();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/widget/KTVSingMicBaseCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m160159xc91ab508().a();
    }

    /* renamed from: setFinderLiveLuckyMoneyBubbleUiRoot */
    public final void m160162x91c3b56e(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    /* renamed from: setFinderLiveMicGiftItemLayout */
    public final void m160163x13f889c0(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    /* renamed from: setFinderLiveMicUserAvatar */
    public final void m160164x649eeed7(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.M = imageView;
    }

    /* renamed from: setRoot */
    public final void m160165x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.L = viewGroup;
    }

    /* renamed from: setWaveViewCallback */
    public final void m160166x568d8025(pj2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.K = cVar;
    }
}
