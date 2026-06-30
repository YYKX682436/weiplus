package oj2;

/* loaded from: classes10.dex */
public abstract class c extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f427292J;
    public android.widget.ImageView K;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 L;
    public java.lang.Boolean M;
    public android.view.ViewGroup N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        Z();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.L;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(service.a());
        }
        if (pluginAbility.f() == lj2.w0.f400491d) {
            m151490xfb84e958().setOnClickListener(new oj2.a(this, pluginAbility));
        }
        addView(m151490xfb84e958());
        setClipChildren(false);
    }

    @Override // wj2.w
    public void R() {
        android.widget.TextView m151489xb52f4282;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.L;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(m174010xb411027f().a());
        }
        t(m151486xd639d394());
        S(m151489xb52f4282());
        if (A() && (m151489xb52f4282 = m151489xb52f4282()) != null) {
            m174012xaf0594a2(m151489xb52f4282);
            m151489xb52f4282.setOnClickListener(this);
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a5.f390705c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935022 = this.L;
                if (c14246xaa8935022 != null) {
                    c14246xaa8935022.m56875xb4464262(jj2.e.f381512d);
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935023 = this.L;
            if (c14246xaa8935023 != null) {
                c14246xaa8935023.m56875xb4464262(jj2.e.f381513e);
            }
        }
    }

    public abstract void Z();

    @Override // sj2.m
    public void a() {
    }

    public final void a0(boolean z17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.M, java.lang.Boolean.valueOf(z17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.L;
            boolean z18 = false;
            if (c14246xaa893502 != null && c14246xaa893502.c() == z17) {
                z18 = true;
            }
            if (z18) {
                return;
            }
        }
        this.M = java.lang.Boolean.valueOf(z17);
        pm0.v.X(new oj2.b(z17, this));
    }

    @Override // sj2.m
    public void d() {
    }

    public void e() {
        S(m151489xb52f4282());
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
    public android.widget.ImageView m151486xd639d394() {
        return this.K;
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

    /* renamed from: getFinderLiveMicHeartText */
    public final android.widget.TextView m151487xeb5fda54() {
        return this.f427292J;
    }

    /* renamed from: getFinderLiveMicUserAvatar */
    public final android.widget.ImageView m151488x4e6f0963() {
        return this.K;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public /* bridge */ /* synthetic */ android.animation.ValueAnimator mo124432x5dc7fd72() {
        return null;
    }

    @Override // wj2.w, sj2.m
    /* renamed from: getGiftRootView */
    public android.view.ViewGroup mo124433x9681e6d() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getLuckyMoneyRootView */
    public android.view.ViewGroup mo124447xe76ca375() {
        return null;
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    /* renamed from: getMicHeartText */
    public android.widget.TextView m151489xb52f4282() {
        return this.f427292J;
    }

    /* renamed from: getRoot */
    public final android.view.ViewGroup m151490xfb84e958() {
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

    /* renamed from: getWaveView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab4() {
        return this.L;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.widget.TextView m151489xb52f4282 = m151489xb52f4282();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, m151489xb52f4282 != null ? java.lang.Integer.valueOf(m151489xb52f4282.getId()) : null)) {
            android.widget.TextView m151489xb52f42822 = m151489xb52f4282();
            boolean z17 = false;
            if (m151489xb52f42822 != null) {
                if (m151489xb52f42822.getVisibility() == 0) {
                    z17 = true;
                }
            }
            if (z17) {
                H();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/base/FinderLiveBaseAudioRoomAnchorWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setFinderLiveMicHeartText */
    public final void m151492x1da37660(android.widget.TextView textView) {
        this.f427292J = textView;
    }

    /* renamed from: setFinderLiveMicUserAvatar */
    public final void m151493x649eeed7(android.widget.ImageView imageView) {
        this.K = imageView;
    }

    /* renamed from: setRoot */
    public final void m151494x764fb064(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.N = viewGroup;
    }

    /* renamed from: setWaveView */
    public final void m151495x9a8ebbc0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502) {
        this.L = c14246xaa893502;
    }
}
