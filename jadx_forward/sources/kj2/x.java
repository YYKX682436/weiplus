package kj2;

/* loaded from: classes10.dex */
public final class x extends oj2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // oj2.c, wj2.w
    public void R() {
        super.R();
        m151490xfb84e958().getViewTreeObserver().addOnPreDrawListener(new kj2.w(this));
    }

    @Override // oj2.c
    public void Z() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6h, (android.view.ViewGroup) this, false);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
        int i17 = com.p314xaae8f345.mm.R.id.qrn;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrn);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.qxy;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qxy);
            if (c14246xaa893502 != null) {
                m151495x9a8ebbc0(c14246xaa893502);
                m174009x3a33aac1().a0().b(new kj2.v(this));
                m151493x649eeed7(imageView);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
                m151494x764fb064(c1073x7e08a787);
                return;
            }
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

    @Override // oj2.c, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
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
        return "BroadcastAnchorWidget";
    }

    @Override // oj2.c, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // lj2.j
    public void t(android.widget.ImageView imageView) {
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 == null || imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a5.f390705c);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (S3) {
            g1Var.a().c(new mn2.q3(m145849x949ba2a5.f390704b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411498s));
        } else {
            g1Var.l().c(new mn2.n(m145849x949ba2a5.f390704b, null, 2, null), imageView, g1Var.h(mn2.f1.f411498s));
        }
    }
}
