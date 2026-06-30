package li2;

/* loaded from: classes10.dex */
public class o extends li2.b {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 W;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.drawable.Drawable f400304p0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f400305x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
    }

    @Override // li2.b, wj2.w
    public void J() {
        if (G()) {
            wj2.w.U(this, 0, 1, null);
        } else {
            X();
        }
    }

    @Override // li2.b, wj2.w
    public void R() {
        super.R();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.W;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(m174010xb411027f().a());
        }
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 != null) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(m145849x949ba2a5.f390705c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935022 = this.W;
                if (c14246xaa8935022 != null) {
                    c14246xaa8935022.m56875xb4464262(jj2.e.f381512d);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935023 = this.W;
                if (c14246xaa8935023 != null) {
                    c14246xaa8935023.m56875xb4464262(jj2.e.f381513e);
                }
            }
        }
        android.view.ViewGroup mo124433x9681e6d = mo124433x9681e6d();
        if (mo124433x9681e6d != null) {
            mo124433x9681e6d.setTranslationY(-i65.a.b(getContext(), 10));
        }
        e();
        m174009x3a33aac1().a0().b(new li2.k(this));
    }

    @Override // li2.b
    public void Z() {
        fg2.t a17 = fg2.t.a(com.p314xaae8f345.mm.ui.id.b(getContext()), this, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = a17.f343847j;
        this.W = c14246xaa893502;
        if (c14246xaa893502 != null) {
            c14246xaa893502.b(m174010xb411027f().a());
        }
        m145814x568d8025(new li2.m(this));
        android.widget.FrameLayout finderLiveMicMuteIcon = a17.f343841d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIcon, "finderLiveMicMuteIcon");
        m145807x23cb40c5(finderLiveMicMuteIcon);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 finderLiveMicMuteIconWe = a17.f343842e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicMuteIconWe, "finderLiveMicMuteIconWe");
        m145808x5dfe2e73(finderLiveMicMuteIconWe);
        android.widget.ImageView finderLiveMicUserAvatar = a17.f343846i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicUserAvatar, "finderLiveMicUserAvatar");
        m145809x649eeed7(finderLiveMicUserAvatar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicNickName = a17.f343844g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicNickName, "finderLiveMicNickName");
        m145810x5241ad2e(finderLiveMicNickName);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 finderLiveMicHeartText = a17.f343840c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderLiveMicHeartText, "finderLiveMicHeartText");
        m145806x1da37660(finderLiveMicHeartText);
        android.widget.RelativeLayout relativeLayout = a17.f343843f.f343595a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relativeLayout, "getRoot(...)");
        m145805x13f889c0(relativeLayout);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = a17.f343839b.f343490a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        m145804x91c3b56e(c22645x24069159);
        fg2.h1 h1Var = a17.f343845h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x240691592 = h1Var.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x240691592, "getRoot(...)");
        m145811x3abb325f(c22645x240691592);
        android.widget.TextView tagTextView = h1Var.f343597b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagTextView, "tagTextView");
        m145812x89ddd367(tagTextView);
        com.p314xaae8f345.mm.ui.fk.a(m145800xc1e76b5b());
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343838a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
        m145813x764fb064(c1073x7e08a787);
        m174009x3a33aac1().a0().b(new li2.n(this));
    }

    @Override // li2.b, lj2.u0
    public void e() {
        java.lang.String str;
        java.lang.String str2;
        super.e();
        boolean z17 = this.f400305x0;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        km2.q m174007xdd2aa071 = m174007xdd2aa071();
        java.lang.String str3 = "";
        if (m174007xdd2aa071 == null || (str = m174007xdd2aa071.f390703a) == null) {
            str = "";
        }
        if (z17 != a07.j(str)) {
            lj2.t0 a08 = m174009x3a33aac1().a0();
            km2.q m174007xdd2aa0712 = m174007xdd2aa071();
            if (m174007xdd2aa0712 != null && (str2 = m174007xdd2aa0712.f390703a) != null) {
                str3 = str2;
            }
            this.f400305x0 = a08.j(str3);
            g();
        }
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getAnchorAudioModeLayout */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124425xd504a5f8() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getAnchorCriticalLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124426x1ce0d634() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getBattleResultWidget */
    public /* bridge */ /* synthetic */ ai2.a mo124427x4f7d778f() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getBattleTipsWidget */
    public /* bridge */ /* synthetic */ qi2.s1 mo124428x3f645dea() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getCriticalGiftLayout */
    public /* bridge */ /* synthetic */ android.widget.FrameLayout mo124429x4ed4a76f() {
        return null;
    }

    @Override // li2.b, wj2.w, sj2.m
    /* renamed from: getGiftInAnimator */
    public android.animation.ValueAnimator mo124432x5dc7fd72() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new li2.l(this));
        return ofFloat;
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getLotteryBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124434x83df3d46() {
        return null;
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getMicGiftCallback */
    public sj2.m mo124435xb95f5746() {
        return this;
    }

    @Override // lj2.j
    /* renamed from: getTagLayoutBackgroundDrawable */
    public android.graphics.drawable.Drawable mo124438x9f24d53a() {
        android.graphics.drawable.Drawable drawable = this.f400304p0;
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560636q2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable2, "getDrawable(...)");
        return drawable2;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "KTVRoomVisitorWidget";
    }

    @Override // wj2.w, lj2.j
    /* renamed from: getTagText */
    public java.lang.String mo124440xe17957b1() {
        java.lang.String string = getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // lj2.j
    /* renamed from: getTagTextColor */
    public int mo124441xc9b30e32() {
        return getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz);
    }

    @Override // li2.b, wj2.w, lj2.u0
    /* renamed from: getVoteBubbleRootView */
    public /* bridge */ /* synthetic */ android.view.ViewGroup mo124442x86ddad3() {
        return null;
    }

    @Override // lj2.j
    public void r(android.view.View view, android.widget.TextView textView, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        super.r(view, textView, viewGroup);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m145853xb5886c64(), "showMicTagLayout isSelfSinger: " + this.f400305x0);
        if (viewGroup == null) {
            return;
        }
        lj2.t0 a07 = m174009x3a33aac1().a0();
        km2.q m145849x949ba2a5 = m145849x949ba2a5();
        if (m145849x949ba2a5 == null || (str = m145849x949ba2a5.f390703a) == null) {
            str = "";
        }
        viewGroup.setVisibility(a07.j(str) ? 0 : 8);
    }

    @Override // wj2.w
    public boolean z() {
        return false;
    }
}
