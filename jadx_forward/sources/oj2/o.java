package oj2;

/* loaded from: classes10.dex */
public abstract class o extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public android.widget.FrameLayout f427312J;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 K;
    public android.view.ViewGroup L;
    public android.view.ViewGroup M;
    public android.widget.TextView N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.view.ViewGroup R;
    public android.widget.TextView S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        a0();
        addView(m151586xfb84e958());
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m151585xffe777c6().setOnClickListener(this);
            mo151577x8a4c27d4().setOnClickListener(this);
            m151581x53b88e51().setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMicTagTextView */
    public final android.widget.TextView m151576xc1e76b5b() {
        return this.S;
    }

    @Override // wj2.w
    public boolean C() {
        return true;
    }

    @Override // wj2.w
    public void R() {
        pm0.v.X(new oj2.n(this));
    }

    @Override // sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    public abstract void a0();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x010b, code lost:
    
        if (r1.X() == true) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oj2.o.b0():void");
    }

    @Override // sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(this.Q);
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && m174009x3a33aac1().a0().F())) {
            m151581x53b88e51().setVisibility(0);
        } else {
            m151581x53b88e51().setVisibility(8);
        }
    }

    @Override // lj2.u0
    public void g() {
        s(m151576xc1e76b5b());
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

    /* renamed from: getClickRoot */
    public android.view.ViewGroup mo151577x8a4c27d4() {
        return m151586xfb84e958();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    /* renamed from: getFinderLiveFinderLogo */
    public final android.view.View m151578x15c24b39() {
        return this.P;
    }

    /* renamed from: getFinderLiveLuckyMoneyBubbleUiRoot */
    public final android.view.ViewGroup m151579xbf9ab862() {
        android.view.ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    /* renamed from: getFinderLiveMicHeartText */
    public final android.widget.TextView m151580xeb5fda54() {
        return this.Q;
    }

    /* renamed from: getFinderLiveMicMuteIcon */
    public final android.widget.FrameLayout m151581x53b88e51() {
        android.widget.FrameLayout frameLayout = this.f427312J;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIconWe */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m151582x47ce48ff() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.K;
        if (c22699x3dcdb352 != null) {
            return c22699x3dcdb352;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    /* renamed from: getFinderLiveMicNewNormalMicGiftItemLayout */
    public final android.view.ViewGroup m151583x3e2ffa0c() {
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicTagText */
    public final android.widget.TextView m151584xf748dbe8() {
        return this.S;
    }

    /* renamed from: getFinderLiveVideoLinkBottomBarName */
    public final android.widget.TextView m151585xffe777c6() {
        android.widget.TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveVideoLinkBottomBarName");
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
        return m151583x3e2ffa0c();
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
        return m151579xbf9ab862();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m151586xfb84e958() {
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

    @Override // sj2.m
    public void h() {
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d == null) {
            return;
        }
        mo124433x9681e6d.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = m151585xffe777c6().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            b0();
        } else {
            int id7 = mo151577x8a4c27d4().getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                J();
            } else {
                int id8 = m151581x53b88e51().getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    L();
                } else {
                    android.widget.TextView textView = this.Q;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, textView != null ? java.lang.Integer.valueOf(textView.getId()) : null)) {
                        android.widget.TextView textView2 = this.Q;
                        boolean z17 = false;
                        if (textView2 != null) {
                            if (textView2.getVisibility() == 0) {
                                z17 = true;
                            }
                        }
                        if (z17) {
                            H();
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverVideoWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setFinderLiveFinderLogo */
    public final void m151587x90157a45(android.view.View view) {
        this.P = view;
    }

    /* renamed from: setFinderLiveLuckyMoneyBubbleUiRoot */
    public final void m151588x91c3b56e(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.R = viewGroup;
    }

    /* renamed from: setFinderLiveMicHeartText */
    public final void m151589x1da37660(android.widget.TextView textView) {
        this.Q = textView;
    }

    /* renamed from: setFinderLiveMicMuteIcon */
    public final void m151590x23cb40c5(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.f427312J = frameLayout;
    }

    /* renamed from: setFinderLiveMicMuteIconWe */
    public final void m151591x5dfe2e73(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22699x3dcdb352, "<set-?>");
        this.K = c22699x3dcdb352;
    }

    /* renamed from: setFinderLiveMicNewNormalMicGiftItemLayout */
    public final void m151592x96ee7780(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.M = viewGroup;
    }

    /* renamed from: setFinderLiveMicTagText */
    public final void m151593x719c0af4(android.widget.TextView textView) {
        this.S = textView;
    }

    /* renamed from: setFinderLiveVideoLinkBottomBarName */
    public final void m151594xd21074d2(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.N = textView;
    }

    /* renamed from: setRoot */
    public final void m151595x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.L = viewGroup;
    }
}
