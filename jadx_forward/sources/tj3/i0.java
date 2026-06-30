package tj3;

/* loaded from: classes8.dex */
public final class i0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f501279d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f501280e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f501281f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f501282g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f501283h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f501284i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f501285m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f501286n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f501279d = jz5.h.b(new tj3.z(this));
        this.f501280e = jz5.h.b(new tj3.h0(this));
        this.f501281f = jz5.h.b(new tj3.c0(this));
        this.f501282g = jz5.h.b(new tj3.b0(this));
        this.f501283h = jz5.h.b(new tj3.y(this));
        this.f501284i = jz5.h.b(tj3.a0.f501258d);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570842c31, (android.view.ViewGroup) this, true);
        this.f501285m = "";
    }

    /* renamed from: getAvatarLayoutInfo */
    private final android.widget.TextView m166667xf6fa18a7() {
        return (android.widget.TextView) ((jz5.n) this.f501283h).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAvatarView */
    public final android.widget.ImageView m166668xd639d394() {
        return (android.widget.ImageView) ((jz5.n) this.f501279d).mo141623x754a37bb();
    }

    /* renamed from: getLoadingView */
    private final android.widget.ImageView m166669xcc04d8cb() {
        return (android.widget.ImageView) ((jz5.n) this.f501282g).mo141623x754a37bb();
    }

    /* renamed from: getMaskView */
    private final android.widget.ImageView m166670x8c409d27() {
        return (android.widget.ImageView) ((jz5.n) this.f501281f).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getVideoView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m166671x4ee17f0a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0) ((jz5.n) this.f501280e).mo141623x754a37bb();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarView", "close " + this.f501285m);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
        if (n17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m166671x4ee17f0a = m166671x4ee17f0a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m166671x4ee17f0a, "<get-videoView>(...)");
            n17.l(m166671x4ee17f0a, this.f501285m);
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t memberInfo) {
        java.lang.String format;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberInfo, "memberInfo");
        java.lang.Boolean bool = this.f501286n;
        boolean z17 = memberInfo.f231832d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(z17));
        java.lang.String str = memberInfo.f231830b;
        if (!b17) {
            this.f501286n = java.lang.Boolean.valueOf(z17);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (z17) {
                java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574115h13);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{e17}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            } else {
                java.lang.String string2 = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574114h12);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{e17}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            }
            m166671x4ee17f0a().setContentDescription(format);
            m166668xd639d394().setContentDescription(format);
        }
        if (z17 || memberInfo.a()) {
            this.f501285m = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m166671x4ee17f0a = m166671x4ee17f0a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m166671x4ee17f0a, "<get-videoView>(...)");
                n17.a(m166671x4ee17f0a, str);
            }
            if (indexOfChild(m166671x4ee17f0a()) == -1) {
                addView(m166671x4ee17f0a(), 0);
            }
            if (m166668xd639d394().getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarView", "refreshVideoState: show video view");
                m166671x4ee17f0a().m67063x60d7080c(new tj3.f0(this));
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n18 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n18 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 m166671x4ee17f0a2 = m166671x4ee17f0a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m166671x4ee17f0a2, "<get-videoView>(...)");
                n18.l(m166671x4ee17f0a2, str);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Di(m166668xd639d394(), str);
            m166668xd639d394().setBackgroundColor(-16776961);
            m166671x4ee17f0a().m67063x60d7080c(tj3.g0.f501271d);
            m166668xd639d394().setVisibility(0);
            removeView(m166671x4ee17f0a());
        }
        if (m166667xf6fa18a7().getVisibility() == 0) {
            m166667xf6fa18a7().setText("isILink: " + ((java.lang.Boolean) ((jz5.n) this.f501284i).mo141623x754a37bb()).booleanValue() + "\nmid:" + memberInfo.f231829a);
        }
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t memberInfo) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberInfo, "memberInfo");
        if (memberInfo.f231831c || memberInfo.f231836h == 102) {
            m166670x8c409d27().setVisibility(0);
            m166669xcc04d8cb().setVisibility(0);
            android.graphics.drawable.Drawable background = m166669xcc04d8cb().getBackground();
            animationDrawable = background instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) background : null;
            if (animationDrawable != null) {
                animationDrawable.start();
                return;
            }
            return;
        }
        m166670x8c409d27().setVisibility(8);
        m166669xcc04d8cb().setVisibility(8);
        android.graphics.drawable.Drawable background2 = m166669xcc04d8cb().getBackground();
        animationDrawable = background2 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) background2 : null;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }
}
