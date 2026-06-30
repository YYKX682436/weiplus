package li2;

/* loaded from: classes10.dex */
public abstract class b extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f400291J;
    public android.widget.FrameLayout K;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 L;
    public pj2.c M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;
    public android.widget.TextView Q;
    public android.widget.ImageView R;
    public android.widget.TextView S;
    public android.widget.TextView T;
    public android.view.ViewGroup U;
    public android.view.ViewGroup V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        Z();
        setClipChildren(false);
        setClipToPadding(false);
        addView(m145802xfb84e958());
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m145802xfb84e958().setOnClickListener(this);
            m145792x53b88e51().setOnClickListener(this);
        }
    }

    @Override // wj2.w
    public void I(boolean z17) {
        if (this.f400291J == z17) {
            pj2.c m145796xc91ab508 = m145796xc91ab508();
            boolean z18 = false;
            if (m145796xc91ab508 != null && m145796xc91ab508.c() == z17) {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyUserVolumeChange notTalking:" + z17 + " lastNotTalking: " + this.f400291J);
        this.f400291J = z17;
        pm0.v.X(new li2.a(z17, this));
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

    @Override // wj2.w
    public void R() {
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            u(m145801xfa1f106b());
            t(m145788xd639d394());
            f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
            S(m145797x2f0ee047());
            r(m145794x4e6f0963(), m145800xc1e76b5b(), m145799x4723753());
        }
        if (A()) {
            m145797x2f0ee047().setOnClickListener(this);
            m174012xaf0594a2(m145797x2f0ee047());
        }
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("0");
        }
        super.S(textView);
    }

    public abstract void Z();

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
        S(m145797x2f0ee047());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && m174009x3a33aac1().a0().F())) {
            m145796xc91ab508().a();
            m145798xff646863().setVisibility(0);
            return;
        }
        m145798xff646863().setVisibility(8);
        if (this.f400291J != z17 || m145796xc91ab508().c() == z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f400291J + " animating: " + m145796xc91ab508().c());
            this.f400291J = z17;
            if (z17) {
                m145796xc91ab508().a();
            } else {
                m145796xc91ab508().b();
            }
        }
    }

    @Override // lj2.u0
    public void g() {
        r(m145794x4e6f0963(), m145800xc1e76b5b(), m145799x4723753());
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
    public android.widget.ImageView m145788xd639d394() {
        return m145794x4e6f0963();
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
    public final android.view.ViewGroup m145789xbf9ab862() {
        android.view.ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    /* renamed from: getFinderLiveMicGiftItemLayout */
    public final android.view.ViewGroup m145790xbe07e4c() {
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicHeartText */
    public final android.widget.TextView m145791xeb5fda54() {
        android.widget.TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicHeartText");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIcon */
    public final android.widget.FrameLayout m145792x53b88e51() {
        android.widget.FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIconWe */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m145793x47ce48ff() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.L;
        if (c22699x3dcdb352 != null) {
            return c22699x3dcdb352;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserAvatar */
    public final android.widget.ImageView m145794x4e6f0963() {
        android.widget.ImageView imageView = this.R;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicUserAvatar");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserNickText */
    public final android.widget.TextView m145795x87554ba() {
        android.widget.TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicUserNickText");
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
        return m145790xbe07e4c();
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
        return m145789xbf9ab862();
    }

    /* renamed from: getMicAudioWaveViewCallback */
    public pj2.c m145796xc91ab508() {
        return m145803xb290eb19();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicHeartTextView */
    public android.widget.TextView m145797x2f0ee047() {
        return m145791xeb5fda54();
    }

    /* renamed from: getMicMuteIcon */
    public android.widget.FrameLayout m145798xff646863() {
        return m145792x53b88e51();
    }

    /* renamed from: getMicTagLayout */
    public final android.view.ViewGroup m145799x4723753() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagLayout");
        throw null;
    }

    /* renamed from: getMicTagTextView */
    public final android.widget.TextView m145800xc1e76b5b() {
        android.widget.TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagTextView");
        throw null;
    }

    /* renamed from: getNickTextView */
    public android.widget.TextView m145801xfa1f106b() {
        return m145795x87554ba();
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m145802xfb84e958() {
        android.view.ViewGroup viewGroup = this.N;
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
    public final pj2.c m145803xb290eb19() {
        pj2.c cVar = this.M;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveBaseKTVRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = m145802xfb84e958().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            J();
        } else {
            int id7 = m145792x53b88e51().getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                L();
            } else {
                int id8 = m145797x2f0ee047().getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    if (m145797x2f0ee047().getVisibility() == 0) {
                        H();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/ktv/widget/FinderLiveBaseKTVRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m145796xc91ab508().a();
    }

    /* renamed from: setFinderLiveLuckyMoneyBubbleUiRoot */
    public final void m145804x91c3b56e(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.V = viewGroup;
    }

    /* renamed from: setFinderLiveMicGiftItemLayout */
    public final void m145805x13f889c0(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.U = viewGroup;
    }

    /* renamed from: setFinderLiveMicHeartText */
    public final void m145806x1da37660(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.T = textView;
    }

    /* renamed from: setFinderLiveMicMuteIcon */
    public final void m145807x23cb40c5(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.K = frameLayout;
    }

    /* renamed from: setFinderLiveMicMuteIconWe */
    public final void m145808x5dfe2e73(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22699x3dcdb352, "<set-?>");
        this.L = c22699x3dcdb352;
    }

    /* renamed from: setFinderLiveMicUserAvatar */
    public final void m145809x649eeed7(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.R = imageView;
    }

    /* renamed from: setFinderLiveMicUserNickText */
    public final void m145810x5241ad2e(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.S = textView;
    }

    /* renamed from: setMicTagLayout */
    public final void m145811x3abb325f(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    /* renamed from: setMicTagTextView */
    public final void m145812x89ddd367(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.Q = textView;
    }

    /* renamed from: setRoot */
    public final void m145813x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    /* renamed from: setWaveViewCallback */
    public final void m145814x568d8025(pj2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.M = cVar;
    }
}
