package di2;

/* loaded from: classes10.dex */
public final class d extends oj2.c {
    public android.widget.TextView P;
    public android.widget.FrameLayout Q;
    public android.view.ViewGroup R;
    public android.widget.TextView S;
    public android.view.ViewGroup T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, boolean z17) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (z17) {
            m124431x87554ba().setVisibility(4);
            m124436x4723753().setVisibility(4);
        }
    }

    @Override // oj2.c, wj2.w
    public void R() {
        super.R();
        u(m124431x87554ba());
        r(m151488x4e6f0963(), m124437xc1e76b5b(), m124436x4723753());
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setTranslationY(-i65.a.b(getContext(), 10));
        }
        e();
        m174009x3a33aac1().a0().b(new di2.a(this));
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
        fg2.s a17 = fg2.s.a(com.p314xaae8f345.mm.ui.id.b(getContext()), this, false);
        m151495x9a8ebbc0(a17.f343825h);
        m174009x3a33aac1().a0().b(new di2.c(this));
        m151493x649eeed7(a17.f343824g);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicNickName = a17.f343822e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        m124444x5241ad2e(finderLiveMicNickName);
        m151492x1da37660(a17.f343819b);
        android.widget.RelativeLayout relativeLayout = a17.f343821d.f343595a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        this.T = relativeLayout;
        fg2.h1 h1Var = a17.f343823f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = h1Var.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        m124445x3abb325f(c22645x24069159);
        android.widget.TextView tagTextView = h1Var.f343597b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagTextView, "tagTextView");
        m124446x89ddd367(tagTextView);
        com.p314xaae8f345.mm.ui.fk.a(m124437xc1e76b5b());
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f343820c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        m124443x23cb40c5(finderLiveMicMuteIcon);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343818a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
        m151494x764fb064(c1073x7e08a787);
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

    /* renamed from: getFinderLiveMicMuteIcon */
    public final android.widget.FrameLayout m124430x53b88e51() {
        android.widget.FrameLayout frameLayout = this.Q;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("finderLiveMicMuteIcon");
        throw null;
    }

    /* renamed from: getFinderLiveMicUserNickText */
    public final android.widget.TextView m124431x87554ba() {
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
        ofFloat.addUpdateListener(new di2.b(this));
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
    public final android.view.ViewGroup m124436x4723753() {
        android.view.ViewGroup viewGroup = this.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micTagLayout");
        throw null;
    }

    /* renamed from: getMicTagTextView */
    public final android.widget.TextView m124437xc1e76b5b() {
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
        return "FinderLiveChatVoiceRoomAnchorWidget";
    }

    @Override // wj2.w, lj2.j
    /* renamed from: getTagText */
    public java.lang.String mo124440xe17957b1() {
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d5o);
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
            m124430x53b88e51().setVisibility(0);
        } else {
            m124430x53b88e51().setVisibility(8);
        }
    }

    /* renamed from: setFinderLiveMicMuteIcon */
    public final void m124443x23cb40c5(android.widget.FrameLayout frameLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameLayout, "<set-?>");
        this.Q = frameLayout;
    }

    /* renamed from: setFinderLiveMicUserNickText */
    public final void m124444x5241ad2e(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.P = textView;
    }

    /* renamed from: setMicTagLayout */
    public final void m124445x3abb325f(android.view.ViewGroup viewGroup) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "<set-?>");
        this.R = viewGroup;
    }

    /* renamed from: setMicTagTextView */
    public final void m124446x89ddd367(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<set-?>");
        this.S = textView;
    }
}
