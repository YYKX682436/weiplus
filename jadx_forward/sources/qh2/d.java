package qh2;

/* loaded from: classes10.dex */
public final class d extends oj2.c {
    public android.view.ViewGroup P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m151490xfb84e958().setOnClickListener(new qh2.a(this, service, pluginAbility));
        }
    }

    @Override // oj2.c, wj2.w
    public void R() {
        lf2.a aVar;
        super.R();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab4 = m151491x9fd65ab4();
        if (m151491x9fd65ab4 != null) {
            m151491x9fd65ab4.b(m174010xb411027f().a());
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a5.f390705c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab42 = m151491x9fd65ab4();
                if (m151491x9fd65ab42 != null) {
                    m151491x9fd65ab42.m56875xb4464262(jj2.e.f381512d);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab43 = m151491x9fd65ab4();
                if (m151491x9fd65ab43 != null) {
                    m151491x9fd65ab43.m56875xb4464262(jj2.e.f381513e);
                }
            }
        }
        m160151xbe07e4c().setVisibility(8);
        if (!G() || (aVar = (lf2.a) m174009x3a33aac1().o(lf2.a.class)) == null) {
            return;
        }
        aVar.Z6(1, 4);
    }

    @Override // oj2.c
    public void Z() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.drc, (android.view.ViewGroup) this, false);
        int i17 = com.p314xaae8f345.mm.R.id.fak;
        android.view.View a17 = x4.b.a(inflate, com.p314xaae8f345.mm.R.id.fak);
        if (a17 != null) {
            fg2.h0 a18 = fg2.h0.a(a17);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
            int i18 = com.p314xaae8f345.mm.R.id.qrn;
            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrn);
            if (imageView != null) {
                i18 = com.p314xaae8f345.mm.R.id.qxy;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qxy);
                if (c14246xaa893502 != null) {
                    m151495x9a8ebbc0(c14246xaa893502);
                    m174009x3a33aac1().a0().b(new qh2.c(this));
                    m151493x649eeed7(imageView);
                    android.widget.RelativeLayout relativeLayout = a18.f343595a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
                    m160152x13f889c0(relativeLayout);
                    m160151xbe07e4c().setTranslationY(-i65.a.b(getContext(), 10));
                    m160151xbe07e4c().setTranslationX(i65.a.b(getContext(), 32));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                    m151494x764fb064(c1073x7e08a787);
                    return;
                }
            }
            i17 = i18;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
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
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
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

    /* renamed from: getFinderLiveMicGiftItemLayout */
    public final android.view.ViewGroup m160151xbe07e4c() {
        android.view.ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicGiftItemLayout");
        throw null;
    }

    @Override // oj2.c, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public android.animation.ValueAnimator mo124432x5dc7fd72() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qh2.b(this));
        return ofFloat;
    }

    @Override // oj2.c, wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        return m160151xbe07e4c();
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

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "KTVSingMicAnchorCoverWidget";
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* renamed from: setFinderLiveMicGiftItemLayout */
    public final void m160152x13f889c0(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.P = viewGroup;
    }

    @Override // lj2.j
    public void t(android.widget.ImageView imageView) {
        jz5.f0 f0Var;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (m145849x949ba2a5 == null || imageView == null) {
            f0Var = null;
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a5.f390705c)) {
                g1Var.a().c(new mn2.q3(m145849x949ba2a5.f390704b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411498s));
            } else {
                g1Var.l().c(new mn2.q3(m145849x949ba2a5.f390704b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411498s));
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null || imageView == null) {
            return;
        }
        vo0.d a17 = g1Var.a();
        km2.q m145849x949ba2a52 = m145849x949ba2a5();
        a17.c(new mn2.q3(m145849x949ba2a52 != null ? m145849x949ba2a52.f390704b : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411494o));
    }
}
