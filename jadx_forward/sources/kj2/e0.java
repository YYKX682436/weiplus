package kj2;

/* loaded from: classes10.dex */
public class e0 extends wj2.w implements android.view.View.OnClickListener {

    /* renamed from: J, reason: collision with root package name */
    public int f389929J;
    public final fg2.f0 K;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 L;
    public final android.widget.TextView M;
    public android.graphics.drawable.Drawable N;
    public final android.graphics.drawable.Drawable P;
    public final android.graphics.drawable.Drawable Q;
    public final android.graphics.drawable.Drawable R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service, 4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        fg2.f0 a17 = fg2.f0.a(com.p314xaae8f345.mm.ui.id.b(context), this, false);
        this.K = a17;
        fg2.h1 h1Var = a17.f343559b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = h1Var.f343596a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22645x24069159, "getRoot(...)");
        this.L = c22645x24069159;
        android.widget.TextView tagTextView = h1Var.f343597b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tagTextView, "tagTextView");
        this.M = tagTextView;
        this.P = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560624af4);
        this.Q = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.af6);
        this.R = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f560626af5);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = a17.f343558a;
        addView(c1073x7e08a787);
        if (pluginAbility.f() == lj2.w0.f400491d) {
            c1073x7e08a787.setOnClickListener(this);
        }
        pluginAbility.a0().b(new kj2.d0(this));
    }

    /* renamed from: getTeamTagDrawable */
    private final android.graphics.drawable.Drawable m143568x43957585() {
        xh2.i iVar;
        lj2.t0 a07 = m174009x3a33aac1().a0();
        xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
        if (a07.d((m145850xf6df7a5e == null || (iVar = m145850xf6df7a5e.f536054b) == null) ? 0 : iVar.f536086e)) {
            android.graphics.drawable.Drawable drawable = this.Q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.R;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable2);
        return drawable2;
    }

    @Override // lj2.u0
    public void g() {
        r(this.K.f343561d, this.M, this.L);
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
    /* renamed from: getTagLayoutBackgroundDrawable */
    public android.graphics.drawable.Drawable mo124438x9f24d53a() {
        dk2.u4 K = m174009x3a33aac1().a0().K();
        lj2.w0 f17 = m174009x3a33aac1().f();
        lj2.w0 w0Var = lj2.w0.f400491d;
        android.graphics.drawable.Drawable drawable = this.P;
        if (f17 != w0Var && m174009x3a33aac1().f() != lj2.w0.f400492e) {
            int a17 = m174009x3a33aac1().a0().a();
            if ((a17 == 5 || a17 == 4) && m145851x309290b1() == pm2.a.f438395r) {
                if (a17 == 5) {
                    return m143568x43957585();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
                return drawable;
            }
        } else if (K != null && m145851x309290b1() == pm2.a.f438395r) {
            if (K.f315693g == 2) {
                return m143568x43957585();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.N;
        if (drawable2 != null) {
            return drawable2;
        }
        android.graphics.drawable.Drawable mo124438x9f24d53a = super.mo124438x9f24d53a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo124438x9f24d53a, "getTagLayoutBackgroundDrawable(...)");
        return mo124438x9f24d53a;
    }

    @Override // lj2.j
    /* renamed from: getTagString */
    public java.lang.String mo124439x679de195() {
        return "GrabRequestWidget";
    }

    @Override // lj2.j
    /* renamed from: getTagTextColor */
    public int mo124441xc9b30e32() {
        return getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4);
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
        this.f389929J = data.f536054b.f536086e;
        fg2.f0 f0Var = this.K;
        f0Var.f343562e.setText(zl2.r4.f555483a.x1() ? getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lko) : getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw8));
        f0Var.f343560c.setImageResource(com.p314xaae8f345.mm.R.raw.f79995xde511849);
        f0Var.f343561d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3m);
        r(f0Var.f343561d, this.M, this.L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        lj2.x0 m174010xb411027f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int id6 = this.K.f343558a.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            if (zl2.r4.f555483a.w1()) {
                fj2.s.h(fj2.s.f344716a, ml2.w4.f409720e, null, 0, 0, 14, null);
                xh2.a m145850xf6df7a5e = m145850xf6df7a5e();
                if (m145850xf6df7a5e != null && (m174010xb411027f = m174010xb411027f()) != null) {
                    m174010xb411027f.e(m145850xf6df7a5e);
                }
            } else {
                lj2.x0 m174010xb411027f2 = m174010xb411027f();
                if (m174010xb411027f2 != null) {
                    m174010xb411027f2.S(this.f389929J);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/voiceroom/widget/FinderLiveVoiceRoomGrabWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
