package di2;

/* loaded from: classes10.dex */
public final class e extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public final fg2.m0 f314178J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, boolean z17) {
        super(context, pluginAbility, service, 4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        fg2.m0 a17 = fg2.m0.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.f314178J = a17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = a17.f343668b.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343667a;
        addView(c1073x7e08a787);
        if (pluginAbility.f() == lj2.w0.f400491d) {
            c1073x7e08a787.setOnClickListener(this);
        }
        c22645x24069159.setVisibility(4);
        if (z17) {
            a17.f343671e.setVisibility(4);
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
        return "FinderLiveChatVoiceRoomGrabWidget";
    }

    @Override // wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // wj2.w, lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widgetMode, "widgetMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.l(widgetMode, data);
        this.K = data.f536054b.f536086e;
        fg2.m0 m0Var = this.f314178J;
        m0Var.f343671e.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw8));
        m0Var.f343670d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3m);
        m0Var.f343669c.setImageResource(com.p314xaae8f345.mm.R.raw.f79995xde511849);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/chatvoiceroom/widget/FinderLiveChatVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.f314178J.f343667a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f555483a.w1()) {
                fj2.s.h(fj2.s.f344716a, ml2.w4.f409720e, null, 0, 0, 14, null);
                xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
                if (m145850xf6df7a5e != null) {
                    m174010xb411027f().e(m145850xf6df7a5e);
                }
            } else {
                m174010xb411027f().S(this.K);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/chatvoiceroom/widget/FinderLiveChatVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
