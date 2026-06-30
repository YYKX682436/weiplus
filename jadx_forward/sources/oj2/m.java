package oj2;

/* loaded from: classes10.dex */
public abstract class m extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f427310J;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b K;
    public android.widget.FrameLayout L;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;
    public android.widget.ImageView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;
    public android.widget.TextView T;
    public android.view.ViewGroup U;
    public android.widget.TextView V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        Z();
        setClipChildren(false);
        setClipToPadding(false);
        ym5.l2 l2Var = ym5.l2.f544957a;
        m151558xddb6ed56();
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        m151558xddb6ed56().o(ae2.in.f85221a.a(ym5.f6.X));
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m151558xddb6ed56 = m151558xddb6ed56();
        android.content.res.AssetManager assets = context.getAssets();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
        m151558xddb6ed56.k(assets, "finder_live_link_mic_wave.pag");
        m151558xddb6ed56().m82583xcde73672(-1);
        addView(m151564xfb84e958());
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m151564xfb84e958().setOnClickListener(this);
            m151552x53b88e51().setOnClickListener(this);
        }
    }

    /* renamed from: getMicTagTextView */
    private final android.widget.TextView m151547xc1e76b5b() {
        return this.V;
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
            u(mo151563xfa1f106b());
            t(mo151549xd639d394());
            q(m151548xd66d26ca());
            f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
            S(m151561x2f0ee047());
            s(m151547xc1e76b5b());
        }
        if (A()) {
            m151561x2f0ee047().setOnClickListener(this);
            m174012xaf0594a2(m151561x2f0ee047());
        }
    }

    public abstract void Z();

    @Override // sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftgiAnimationStart");
    }

    @Override // sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // lj2.u0
    public void e() {
        S(m151561x2f0ee047());
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        if (B() || (G() && m174009x3a33aac1().a0().F())) {
            mo151560xc71e8577().setVisibility(8);
            mo151560xc71e8577().n();
            mo151562xff646863().setVisibility(0);
            return;
        }
        mo151562xff646863().setVisibility(8);
        if (this.f427310J != z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f427310J);
            this.f427310J = z17;
            if (z17) {
                mo151560xc71e8577().n();
                mo151560xc71e8577().setVisibility(8);
            } else {
                mo151560xc71e8577().setVisibility(0);
                mo151560xc71e8577().g();
            }
        }
    }

    @Override // lj2.u0
    public void g() {
        s(m151547xc1e76b5b());
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

    /* renamed from: getAudioBgView */
    public android.widget.ImageView m151548xd66d26ca() {
        return m151556x14f9dd89();
    }

    /* renamed from: getAvatarView */
    public android.widget.ImageView mo151549xd639d394() {
        return m151555x219a509d();
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
    public final android.view.ViewGroup m151550xbf9ab862() {
        android.view.ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    /* renamed from: getFinderLiveMicHeartText */
    public final android.widget.TextView m151551xeb5fda54() {
        android.widget.TextView textView = this.T;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicHeartText");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIcon */
    public final android.widget.FrameLayout m151552x53b88e51() {
        android.widget.FrameLayout frameLayout = this.L;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIconWe */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m151553x47ce48ff() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.M;
        if (c22699x3dcdb352 != null) {
            return c22699x3dcdb352;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    /* renamed from: getFinderLiveMicNewNormalMicGiftItemLayout */
    public final android.view.ViewGroup m151554x3e2ffa0c() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicNewNormalMicGiftItemLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicStateAudioAvatar */
    public final android.widget.ImageView m151555x219a509d() {
        android.widget.ImageView imageView = this.Q;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicStateAudioAvatar");
        throw null;
    }

    /* renamed from: getFinderLiveMicStateAudioBg */
    public final android.widget.ImageView m151556x14f9dd89() {
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicStateAudioBg");
        throw null;
    }

    /* renamed from: getFinderLiveMicStateAudioName */
    public final android.widget.TextView m151557xbdfe0acf() {
        android.widget.TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicStateAudioName");
        throw null;
    }

    /* renamed from: getFinderLiveMicStateAudioWaveIcon */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m151558xddb6ed56() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.K;
        if (c22789xd23e9a9b != null) {
            return c22789xd23e9a9b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicStateAudioWaveIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicTagText */
    public final android.widget.TextView m151559xf748dbe8() {
        return this.V;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        return m151554x3e2ffa0c();
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
        return m151550xbf9ab862();
    }

    /* renamed from: getMicAudioWaveIcon */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo151560xc71e8577() {
        return m151558xddb6ed56();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicHeartTextView */
    public android.widget.TextView m151561x2f0ee047() {
        return m151551xeb5fda54();
    }

    /* renamed from: getMicMuteIcon */
    public android.widget.FrameLayout mo151562xff646863() {
        return m151552x53b88e51();
    }

    /* renamed from: getNickTextView */
    public android.widget.TextView mo151563xfa1f106b() {
        return m151557xbdfe0acf();
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m151564xfb84e958() {
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = m151564xfb84e958().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            J();
        } else {
            int id7 = m151552x53b88e51().getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                L();
            } else {
                int id8 = m151561x2f0ee047().getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    if (m151561x2f0ee047().getVisibility() == 0) {
                        H();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveMicBaseCoverAudioWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo151560xc71e8577().setVisibility(8);
        mo151560xc71e8577().n();
    }

    /* renamed from: setFinderLiveLuckyMoneyBubbleUiRoot */
    public final void m151565x91c3b56e(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.U = viewGroup;
    }

    /* renamed from: setFinderLiveMicHeartText */
    public final void m151566x1da37660(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.T = textView;
    }

    /* renamed from: setFinderLiveMicMuteIcon */
    public final void m151567x23cb40c5(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.L = frameLayout;
    }

    /* renamed from: setFinderLiveMicMuteIconWe */
    public final void m151568x5dfe2e73(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22699x3dcdb352, "<set-?>");
        this.M = c22699x3dcdb352;
    }

    /* renamed from: setFinderLiveMicNewNormalMicGiftItemLayout */
    public final void m151569x96ee7780(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    /* renamed from: setFinderLiveMicStateAudioAvatar */
    public final void m151570x83dd4f11(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.Q = imageView;
    }

    /* renamed from: setFinderLiveMicStateAudioBg */
    public final void m151571x5ec635fd(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.S = imageView;
    }

    /* renamed from: setFinderLiveMicStateAudioName */
    public final void m151572xc6161643(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.R = textView;
    }

    /* renamed from: setFinderLiveMicStateAudioWaveIcon */
    public final void m151573xbb341eca(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22789xd23e9a9b, "<set-?>");
        this.K = c22789xd23e9a9b;
    }

    /* renamed from: setFinderLiveMicTagText */
    public final void m151574x719c0af4(android.widget.TextView textView) {
        this.V = textView;
    }

    /* renamed from: setRoot */
    public final void m151575x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }
}
