package kj2;

/* loaded from: classes10.dex */
public final class c0 extends wj2.w {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.j f389923J;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 K;
    public final pj2.c L;
    public boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        fg2.j a17 = fg2.j.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.f389923J = a17;
        a17.f343627h.setVisibility(4);
        a17.f343628i.f343596a.setVisibility(4);
        addView(a17.f343620a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = a17.f343630k;
        this.K = c14246xaa893502;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(service.a());
        }
        this.L = new kj2.a0(this);
        setClipChildren(false);
    }

    @Override // wj2.w
    public void I(boolean z17) {
        if (this.M == z17) {
            boolean z18 = false;
            pj2.c cVar = this.L;
            if (cVar != null && cVar.c() == z17) {
                z18 = true;
            }
            if (!z18) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "notifyUserVolumeChange notTalking:" + z17 + " lastNotTalking: " + this.M);
        this.M = z17;
        pm0.v.X(new kj2.b0(z17, this));
    }

    @Override // wj2.w
    public void R() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.K;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(m174010xb411027f().a());
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a5.f390705c)) {
                if (c14246xaa893502 != null) {
                    c14246xaa893502.m56875xb4464262(jj2.e.f381512d);
                }
            } else if (c14246xaa893502 != null) {
                c14246xaa893502.m56875xb4464262(jj2.e.f381513e);
            }
        }
        if (m145849x949ba2a5() != null) {
            t(this.f389923J.f343629j);
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

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124433x9681e6d() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124447xe76ca375() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "FinderLiveVoiceRoomFloatVisitorWidget";
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }
}
