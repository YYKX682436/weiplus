package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView */
/* loaded from: classes10.dex */
public class C19690x7f5eb045 extends com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d {

    /* renamed from: r, reason: collision with root package name */
    public int f272341r;

    /* renamed from: s, reason: collision with root package name */
    public int f272342s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f272343t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f272344u;

    public C19690x7f5eb045(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        int m64931xcb3a64b7;
        int m64930x82433856;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        super.onMeasure(i17, i18);
        if (getStatus() == 1 || (interfaceC4987x84e327cb = this.f272343t) == null) {
            m64931xcb3a64b7 = m64931xcb3a64b7();
            m64930x82433856 = m64930x82433856();
        } else {
            int mo42937x755bd410 = (int) (interfaceC4987x84e327cb.mo42937x755bd410() * m64929x43aa77f2());
            int mo42931x1c4fb41d = (int) (this.f272343t.mo42931x1c4fb41d() * m64929x43aa77f2());
            if (mo42937x755bd410 <= 0) {
                mo42937x755bd410 = this.f272341r;
            }
            if (mo42931x1c4fb41d <= 0) {
                mo42931x1c4fb41d = this.f272341r;
            }
            m64931xcb3a64b7 = java.lang.Math.max(0, mo42937x755bd410);
            m64930x82433856 = java.lang.Math.max(0, mo42931x1c4fb41d);
        }
        if (m64931xcb3a64b7 <= 0) {
            m64931xcb3a64b7 = this.f272341r;
        }
        if (m64930x82433856 <= 0) {
            m64930x82433856 = this.f272341r;
        }
        int i19 = this.f272342s;
        if (m64930x82433856 < i19 || m64931xcb3a64b7 < i19) {
            if (m64931xcb3a64b7 < m64930x82433856) {
                m64930x82433856 = (int) (m64930x82433856 * (i19 / m64931xcb3a64b7));
                m64931xcb3a64b7 = i19;
            } else if (m64930x82433856 < m64931xcb3a64b7) {
                m64931xcb3a64b7 = (int) (m64931xcb3a64b7 * (i19 / m64930x82433856));
                m64930x82433856 = i19;
            } else {
                m64931xcb3a64b7 = i19;
                m64930x82433856 = m64931xcb3a64b7;
            }
        }
        int i27 = this.f272341r;
        if (m64931xcb3a64b7 > i27 || m64930x82433856 > i27) {
            if (m64931xcb3a64b7 > m64930x82433856) {
                m64930x82433856 = (int) (m64930x82433856 * (i27 / m64931xcb3a64b7));
                m64931xcb3a64b7 = i27;
            } else if (m64930x82433856 > m64931xcb3a64b7) {
                m64931xcb3a64b7 = (int) (m64931xcb3a64b7 * (i27 / m64930x82433856));
                m64930x82433856 = i27;
            } else {
                m64931xcb3a64b7 = i27;
                m64930x82433856 = m64931xcb3a64b7;
            }
        }
        setMeasuredDimension(m64931xcb3a64b7, m64930x82433856);
    }

    /* renamed from: setChattingEmojiMaxSize */
    public void m75574x5f9a8547(int i17) {
        this.f272341r = i17;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void z() {
        if (this.f272343t == null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class))).getClass();
            zq.h.f556505a.b(this);
            return;
        }
        m43716xb42a35d(0);
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5 w5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo = this.f272343t;
        java.lang.String cacheKey = this.f272344u;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) w5Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheKey, "cacheKey");
        zq.h hVar = zq.h.f556505a;
        dr.s.g(new dr.d((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo, this, cacheKey), false, 1, null);
    }

    public C19690x7f5eb045(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272341r = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561924wm);
        this.f272342s = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561923wl);
        m64937x6f817d4a(0);
        m43713x8e102604(false);
    }
}
