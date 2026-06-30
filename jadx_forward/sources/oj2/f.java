package oj2;

/* loaded from: classes10.dex */
public abstract class f extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public boolean f427296J;
    public android.widget.FrameLayout K;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 L;
    public pj2.c M;
    public android.view.ViewGroup N;
    public android.view.ViewGroup P;
    public android.widget.TextView Q;
    public oj2.s R;
    public android.widget.ImageView S;
    public android.widget.TextView T;
    public android.widget.TextView U;
    public android.view.ViewGroup V;
    public android.view.ViewGroup W;

    /* renamed from: l1, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f427297l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.drawable.Drawable f427298p0;

    /* renamed from: x0, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f427299x0;

    /* renamed from: y0, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f427300y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f427299x0 = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560624af4);
        this.f427300y0 = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.af6);
        this.f427297l1 = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560626af5);
        kj2.j0 j0Var = (kj2.j0) this;
        fg2.j a17 = fg2.j.a(com.p314xaae8f345.mm.ui.id.b(j0Var.getContext()), j0Var, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = a17.f343630k;
        j0Var.f389942p1 = c14246xaa893502;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(j0Var.m174010xb411027f().a());
        }
        j0Var.m151525x568d8025(new kj2.i0(j0Var));
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f343624e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        j0Var.m151517x23cb40c5(finderLiveMicMuteIcon);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 finderLiveMicMuteIconWe = a17.f343625f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        j0Var.m151518x5dfe2e73(finderLiveMicMuteIconWe);
        android.widget.ImageView finderLiveMicUserAvatar = a17.f343629j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicUserAvatar, "finderLiveMicUserAvatar");
        j0Var.m151519x649eeed7(finderLiveMicUserAvatar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicNickName = a17.f343627h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        j0Var.m151520x5241ad2e(finderLiveMicNickName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicHeartText = a17.f343623d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        j0Var.m151516x1da37660(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f343626g.f343595a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        j0Var.m151515x13f889c0(relativeLayout);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = a17.f343622c.f343490a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        j0Var.m151514x91c3b56e(c22645x24069159);
        fg2.h1 h1Var = a17.f343628i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592 = h1Var.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x240691592, "getRoot(...)");
        j0Var.m151521x3abb325f(c22645x240691592);
        android.widget.TextView tagTextView = h1Var.f343597b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagTextView, "tagTextView");
        j0Var.m151523x89ddd367(tagTextView);
        j0Var.m151522xfcf4bc8e(new oj2.s(j0Var.m151508x4723753(), j0Var.m174009x3a33aac1()));
        fg2.r1 r1Var = a17.f343621b;
        android.widget.RelativeLayout relativeLayout2 = r1Var.f343817a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
        j0Var.f389943x1 = new lj2.s0(relativeLayout2);
        float b17 = i65.a.b(j0Var.getContext(), 14);
        android.widget.RelativeLayout relativeLayout3 = r1Var.f343817a;
        relativeLayout3.setTranslationY(b17);
        relativeLayout3.setTranslationX(i65.a.b(j0Var.getContext(), -3));
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343620a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
        j0Var.m151524x764fb064(c1073x7e08a787);
        setClipChildren(false);
        setClipToPadding(false);
        addView(m151512xfb84e958());
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m151512xfb84e958().setOnClickListener(this);
            m151501x53b88e51().setOnClickListener(this);
        }
        pluginAbility.a0().b(new oj2.d(this));
    }

    /* renamed from: getTeamTagDrawable */
    private final android.graphics.drawable.Drawable m151496x43957585() {
        xh2.i iVar;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (a07.d((m145850xf6df7a5e == null || (iVar = m145850xf6df7a5e.f536054b) == null) ? 0 : iVar.f536086e)) {
            android.graphics.drawable.Drawable drawable = this.f427300y0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.f427297l1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable2);
        return drawable2;
    }

    @Override // wj2.w
    public void I(boolean z17) {
        if (this.f427296J == z17) {
            pj2.c m151505xc91ab508 = m151505xc91ab508();
            boolean z18 = false;
            if (m151505xc91ab508 != null && m151505xc91ab508.c() == z17) {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyUserVolumeChange notTalking:" + z17 + " lastNotTalking: " + this.f427296J);
        this.f427296J = z17;
        pm0.v.X(new oj2.e(z17, this));
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
    public void S(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("0");
        }
        super.S(textView);
    }

    @Override // sj2.m
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationStart");
    }

    @Override // sj2.m
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "onGiftAnimationEnd");
    }

    @Override // wj2.w, lj2.u0
    public void f(boolean z17, int i17, boolean z18) {
        super.f(z17, i17, z18);
        boolean z19 = false;
        if (B() || (G() && m174009x3a33aac1().a0().F())) {
            m151505xc91ab508().a();
            m151507xff646863().setVisibility(0);
            return;
        }
        m151507xff646863().setVisibility(8);
        if (this.f427296J == z17) {
            pj2.c m151505xc91ab508 = m151505xc91ab508();
            if (m151505xc91ab508 != null && m151505xc91ab508.c() == z17) {
                z19 = true;
            }
            if (!z19) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyMicUserTalkingState notTalking:" + z17 + " lastNotTalking: " + this.f427296J);
        this.f427296J = z17;
        if (z17) {
            m151505xc91ab508().a();
        } else {
            m151505xc91ab508().b();
        }
    }

    @Override // lj2.u0
    public void g() {
        r(m151503x4e6f0963(), m151510xc1e76b5b(), m151508x4723753());
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
    public android.widget.ImageView m151497xd639d394() {
        return m151503x4e6f0963();
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
    public final android.view.ViewGroup m151498xbf9ab862() {
        android.view.ViewGroup viewGroup = this.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveLuckyMoneyBubbleUiRoot");
        throw null;
    }

    /* renamed from: getFinderLiveMicGiftItemLayout */
    public final android.view.ViewGroup m151499xbe07e4c() {
        android.view.ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    /* renamed from: getFinderLiveMicHeartText */
    public final android.widget.TextView m151500xeb5fda54() {
        android.widget.TextView textView = this.U;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicHeartText");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIcon */
    public final android.widget.FrameLayout m151501x53b88e51() {
        android.widget.FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicMuteIconWe */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m151502x47ce48ff() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.L;
        if (c22699x3dcdb352 != null) {
            return c22699x3dcdb352;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIconWe");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserAvatar */
    public final android.widget.ImageView m151503x4e6f0963() {
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicUserAvatar");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserNickText */
    public final android.widget.TextView m151504x87554ba() {
        android.widget.TextView textView = this.T;
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
        return m151499xbe07e4c();
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
        return m151498xbf9ab862();
    }

    /* renamed from: getMicAudioWaveViewCallback */
    public pj2.c m151505xc91ab508() {
        return m151513xb290eb19();
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicHeartTextView */
    public android.widget.TextView m151506x2f0ee047() {
        return m151500xeb5fda54();
    }

    /* renamed from: getMicMuteIcon */
    public android.widget.FrameLayout m151507xff646863() {
        return m151501x53b88e51();
    }

    /* renamed from: getMicTagLayout */
    public final android.view.ViewGroup m151508x4723753() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagLayout");
        throw null;
    }

    /* renamed from: getMicTagLocationWidget */
    public final oj2.s m151509x82a18d82() {
        return this.R;
    }

    /* renamed from: getMicTagTextView */
    public final android.widget.TextView m151510xc1e76b5b() {
        android.widget.TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagTextView");
        throw null;
    }

    /* renamed from: getNickTextView */
    public android.widget.TextView m151511xfa1f106b() {
        return m151504x87554ba();
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m151512xfb84e958() {
        android.view.ViewGroup viewGroup = this.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // lj2.j
    /* renamed from: getTagLayoutBackgroundDrawable */
    public android.graphics.drawable.Drawable mo124438x9f24d53a() {
        dk2.u4 K = m174009x3a33aac1().a0().K();
        lj2.w0 f17 = m174009x3a33aac1().f();
        lj2.w0 w0Var = lj2.w0.f400491d;
        android.graphics.drawable.Drawable drawable = this.f427299x0;
        if (f17 != w0Var && m174009x3a33aac1().f() != lj2.w0.f400492e) {
            int a17 = m174009x3a33aac1().a0().a();
            if ((a17 == 5 || a17 == 4) && m145851x309290b1() == pm2.a.f438395r) {
                if (a17 == 5) {
                    return m151496x43957585();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
                return drawable;
            }
        } else if (K != null && m145851x309290b1() == pm2.a.f438395r) {
            if (K.f315693g == 2) {
                return m151496x43957585();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.f427298p0;
        if (drawable2 != null) {
            return drawable2;
        }
        android.graphics.drawable.Drawable mo124438x9f24d53a = super.mo124438x9f24d53a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo124438x9f24d53a, "getTagLayoutBackgroundDrawable(...)");
        return mo124438x9f24d53a;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* renamed from: getWaveViewCallback */
    public final pj2.c m151513xb290eb19() {
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = m151512xfb84e958().getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            J();
        } else {
            int id7 = m151501x53b88e51().getId();
            if (valueOf != null && valueOf.intValue() == id7) {
                L();
            } else {
                int id8 = m151506x2f0ee047().getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    if (m151506x2f0ee047().getVisibility() == 0) {
                        H();
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomCoverWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m151505xc91ab508().a();
    }

    /* renamed from: setFinderLiveLuckyMoneyBubbleUiRoot */
    public final void m151514x91c3b56e(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.W = viewGroup;
    }

    /* renamed from: setFinderLiveMicGiftItemLayout */
    public final void m151515x13f889c0(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.V = viewGroup;
    }

    /* renamed from: setFinderLiveMicHeartText */
    public final void m151516x1da37660(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.U = textView;
    }

    /* renamed from: setFinderLiveMicMuteIcon */
    public final void m151517x23cb40c5(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.K = frameLayout;
    }

    /* renamed from: setFinderLiveMicMuteIconWe */
    public final void m151518x5dfe2e73(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22699x3dcdb352, "<set-?>");
        this.L = c22699x3dcdb352;
    }

    /* renamed from: setFinderLiveMicUserAvatar */
    public final void m151519x649eeed7(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.S = imageView;
    }

    /* renamed from: setFinderLiveMicUserNickText */
    public final void m151520x5241ad2e(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.T = textView;
    }

    /* renamed from: setMicTagLayout */
    public final void m151521x3abb325f(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    /* renamed from: setMicTagLocationWidget */
    public final void m151522xfcf4bc8e(oj2.s sVar) {
        this.R = sVar;
    }

    /* renamed from: setMicTagTextView */
    public final void m151523x89ddd367(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.Q = textView;
    }

    /* renamed from: setRoot */
    public final void m151524x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    /* renamed from: setWaveViewCallback */
    public final void m151525x568d8025(pj2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.M = cVar;
    }
}
