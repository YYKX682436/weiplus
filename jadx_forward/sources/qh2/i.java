package qh2;

/* loaded from: classes10.dex */
public final class i extends qh2.j {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m160160xfb84e958().setOnClickListener(new qh2.e(service, this));
        }
    }

    @Override // wj2.w
    public void R() {
        t(m160155xd639d394());
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            f(m145849x949ba2a5.f390716n, m145849x949ba2a5.f390724v, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.Q;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(m174010xb411027f().a());
        }
        km2.q m145849x949ba2a52 = m145849x949ba2a5();
        if (m145849x949ba2a52 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a52.f390705c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935022 = this.Q;
                if (c14246xaa8935022 != null) {
                    c14246xaa8935022.m56875xb4464262(jj2.e.f381512d);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935023 = this.Q;
                if (c14246xaa8935023 != null) {
                    c14246xaa8935023.m56875xb4464262(jj2.e.f381513e);
                }
            }
        }
        m160157xbe07e4c().setVisibility(8);
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // qh2.j, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public android.animation.ValueAnimator mo124432x5dc7fd72() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new qh2.f(this));
        return ofFloat;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "KTVSingMicAudioCoverWidget";
    }

    @Override // qh2.j, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    /* renamed from: getWaveView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m160153x9fd65ab4() {
        return this.Q;
    }

    /* renamed from: setWaveView */
    public final void m160154x9a8ebbc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502) {
        this.Q = c14246xaa893502;
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
