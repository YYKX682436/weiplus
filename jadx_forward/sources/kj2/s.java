package kj2;

/* loaded from: classes10.dex */
public final class s extends oj2.c {
    public android.widget.TextView P;
    public android.widget.FrameLayout Q;
    public android.view.ViewGroup R;
    public android.widget.TextView S;
    public android.view.ViewGroup T;
    public final int U;
    public lj2.s0 V;
    public oj2.s W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.U = android.graphics.Color.parseColor("#A18B98");
    }

    @Override // oj2.c, wj2.w
    public void R() {
        java.lang.String str;
        java.lang.String str2;
        super.R();
        u(m143571x87554ba());
        r(m151488x4e6f0963(), m143573xc1e76b5b(), m143572x4723753());
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setTranslationY(-i65.a.b(getContext(), 10));
        }
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e != null) {
            lj2.s0 s0Var = this.V;
            if (s0Var != null) {
                km2.q qVar = m145850xf6df7a5e.f536053a;
                java.lang.String str3 = "";
                if (qVar == null || (str = qVar.f390705c) == null) {
                    str = "";
                }
                if (qVar != null && (str2 = qVar.f390703a) != null) {
                    str3 = str2;
                }
                s0Var.a(str, str3);
            }
            oj2.s sVar = this.W;
            if (sVar != null) {
                sVar.b(mo124441xc9b30e32(), m145850xf6df7a5e);
            }
        }
        e();
        if (m174009x3a33aac1().a0().K() == null || m145851x309290b1() != pm2.a.f438395r) {
            m174009x3a33aac1().a0().b(new kj2.p(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab4 = m151491x9fd65ab4();
            if (m151491x9fd65ab4 != null) {
                m151491x9fd65ab4.m56876x52d2f021(this.U);
            }
        }
        k(m174009x3a33aac1().a0().F());
    }

    @Override // wj2.w
    public void S(android.widget.TextView textView) {
        if (textView != null) {
            textView.setText("0");
        }
        super.S(textView);
    }

    @Override // oj2.c
    public void Z() {
        fg2.i a17 = fg2.i.a(com.p314xaae8f345.mm.ui.id.b(getContext()), this, false);
        m151495x9a8ebbc0(a17.f343606i);
        m174009x3a33aac1().a0().b(new kj2.r(this));
        m151493x649eeed7(a17.f343605h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicNickName = a17.f343603f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        m143575x5241ad2e(finderLiveMicNickName);
        m151492x1da37660(a17.f343600c);
        android.widget.RelativeLayout relativeLayout = a17.f343602e.f343595a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        this.T = relativeLayout;
        fg2.h1 h1Var = a17.f343604g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = h1Var.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        m143576x3abb325f(c22645x24069159);
        android.widget.TextView tagTextView = h1Var.f343597b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagTextView, "tagTextView");
        m143577x89ddd367(tagTextView);
        this.W = new oj2.s(m143572x4723753(), m174009x3a33aac1());
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f343601d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        m143574x23cb40c5(finderLiveMicMuteIcon);
        fg2.r1 r1Var = a17.f343599b;
        android.widget.RelativeLayout relativeLayout2 = r1Var.f343817a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout2, "getRoot(...)");
        this.V = new lj2.s0(relativeLayout2);
        r1Var.f343817a.setTranslationY(i65.a.b(getContext(), 14));
        r1Var.f343817a.setTranslationX(i65.a.b(getContext(), -3));
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343598a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
        m151494x764fb064(c1073x7e08a787);
    }

    @Override // oj2.c, lj2.u0
    public void e() {
        jz5.f0 f0Var;
        oj2.s sVar;
        android.widget.TextView m151487xeb5fda54 = m151487xeb5fda54();
        if (m151487xeb5fda54 != null) {
            m151487xeb5fda54.setVisibility(8);
        }
        android.widget.TextView m151487xeb5fda542 = m151487xeb5fda54();
        int i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.a5v;
        if (m151487xeb5fda542 != null) {
            m151487xeb5fda542.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a5v);
        }
        dk2.u4 K = m174009x3a33aac1().a0().K();
        if (K != null) {
            if (K.h() || K.i()) {
                android.widget.TextView m151487xeb5fda543 = m151487xeb5fda54();
                if (m151487xeb5fda543 != null) {
                    m151487xeb5fda543.setText("0");
                }
                if (K.f315693g == 1) {
                    int h17 = m174009x3a33aac1().a0().h(m145849x949ba2a5());
                    android.widget.TextView m151487xeb5fda544 = m151487xeb5fda54();
                    if (m151487xeb5fda544 != null) {
                        if (h17 == 1) {
                            i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.a2y;
                        }
                        m151487xeb5fda544.setBackgroundResource(i17);
                    }
                    W(m151487xeb5fda54());
                    android.widget.TextView m151487xeb5fda545 = m151487xeb5fda54();
                    if (m151487xeb5fda545 != null) {
                        m151487xeb5fda545.setVisibility(0);
                    }
                } else {
                    S(m151487xeb5fda54());
                }
            } else {
                super.e();
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.e();
        }
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (m145850xf6df7a5e == null || (sVar = this.W) == null) {
            return;
        }
        sVar.b(mo124441xc9b30e32(), m145850xf6df7a5e);
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public ai2.a mo124427x4f7d778f() {
        return this.V;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    /* renamed from: getFinderLiveMicMuteIcon */
    public final android.widget.FrameLayout m143570x53b88e51() {
        android.widget.FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserNickText */
    public final android.widget.TextView m143571x87554ba() {
        android.widget.TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicUserNickText");
        throw null;
    }

    @Override // oj2.c, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public android.animation.ValueAnimator mo124432x5dc7fd72() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new kj2.q(this));
        return ofFloat;
    }

    @Override // oj2.c, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        android.view.ViewGroup viewGroup = this.T;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("giftRootView");
        throw null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicTagLayout */
    public final android.view.ViewGroup m143572x4723753() {
        android.view.ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagLayout");
        throw null;
    }

    /* renamed from: getMicTagTextView */
    public final android.widget.TextView m143573xc1e76b5b() {
        android.widget.TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagTextView");
        throw null;
    }

    @Override // lj2.j
    /* renamed from: getTagLayoutBackgroundDrawable */
    public android.graphics.drawable.Drawable mo124438x9f24d53a() {
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        return drawable;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabCoverAnchorWidget";
    }

    @Override // wj2.w, lj2.j
    /* renamed from: getTagText */
    public java.lang.String mo124440xe17957b1() {
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // lj2.j
    /* renamed from: getTagTextColor */
    public int mo124441xc9b30e32() {
        return android.graphics.Color.parseColor("#E6000000");
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // lj2.u0
    public void k(boolean z17) {
        if (G() && z17) {
            m143570x53b88e51().setVisibility(0);
        } else {
            m143570x53b88e51().setVisibility(8);
        }
    }

    @Override // wj2.w, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oj2.s sVar = this.W;
        if (sVar != null) {
            sVar.c();
        }
    }

    /* renamed from: setFinderLiveMicMuteIcon */
    public final void m143574x23cb40c5(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.Q = frameLayout;
    }

    /* renamed from: setFinderLiveMicUserNickText */
    public final void m143575x5241ad2e(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.P = textView;
    }

    /* renamed from: setMicTagLayout */
    public final void m143576x3abb325f(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.R = viewGroup;
    }

    /* renamed from: setMicTagTextView */
    public final void m143577x89ddd367(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.S = textView;
    }
}
