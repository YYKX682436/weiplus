package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.c.class)
/* loaded from: classes7.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.c, g05.j {

    /* renamed from: e, reason: collision with root package name */
    public long f280855e = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f280856f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280857g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f280858h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f280859i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f280860m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f280861n;

    public k() {
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.f280856f = new java.util.HashMap();
        this.f280860m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g(this);
        this.f280861n = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h.f280666d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingEnterAnimEnd");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onComponentUnInstall, this:" + hashCode());
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Ri();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (m0()) {
            this.f280857g = false;
            this.f280859i = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingExitAnimEnd");
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Zi();
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Ri();
            android.view.View view = this.f280858h;
            if (view != null) {
                view.removeOnLayoutChangeListener(this.f280860m);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onComponentInstall, this:" + hashCode());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingInit");
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        jc3.i0 i0Var;
        if (!m0() || java.lang.System.currentTimeMillis() - this.f280855e < ((java.lang.Number) ((jz5.n) this.f280861n).mo141623x754a37bb()).longValue()) {
            return;
        }
        android.view.View view2 = this.f280858h;
        int height = view2 != null ? view2.getHeight() : -1;
        android.view.View view3 = this.f280858h;
        int i28 = view3 != null ? pm0.v.s(view3)[1] : -1;
        double c17 = i65.a.c(this.f280113d.g(), height);
        double d17 = i28;
        iq0.c Di = ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Di();
        if (Di != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            nq0.p pVar = (nq0.p) ((gq0.t) c18);
            synchronized (Di) {
                i0Var = (jc3.i0) ((java.util.LinkedHashMap) pVar.f420477f).get(Di);
                if (i0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
                } else if (!(i0Var instanceof hq0.h)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
                }
                i0Var = null;
            }
            hq0.h hVar = (hq0.h) i0Var;
            if (hVar != null) {
                hq0.b0 b0Var = (hq0.b0) hVar;
                iq0.e eVar = b0Var.f364503x.f375196i;
                if (eVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f364504y, "removeFrameSetView rootConfig nil");
                } else {
                    d75.b.g(new hq0.x(b0Var, eVar, d17, c17));
                }
            }
        }
        this.f280855e = java.lang.System.currentTimeMillis();
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (m0()) {
            if (i17 == 1 || i17 == 2) {
                this.f280859i = true;
            }
        }
    }

    public final boolean m0() {
        return this.f280113d.x().equals("gh_25d9ac85a4bc");
    }

    public void n0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "markAllView update isForeGround:" + this.f280857g);
        o0();
        if (this.f280857g) {
            this.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    public final void o0() {
        java.util.Collection<com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0> values = this.f280856f.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var : values) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g0Var);
            p0(g0Var, true);
        }
    }

    public final void p0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 m80051xdfe7150c = holder.m80051xdfe7150c(this.f280113d);
        if (m80051xdfe7150c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "holder msg is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a9 a9Var = m80051xdfe7150c.f275460g2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(a9Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgWxGameDynamicCard.MsgExtInfoAppMsgWxGameDynamicCard");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.af afVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.af) a9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "johnjh markViewUpdate msgid: " + m80051xdfe7150c.m124847x74d37ac6() + ", msg extinfo oldrefresh:" + afVar.f284883d + ", newrefresh:" + z17);
        afVar.f284883d = z17;
        m80051xdfe7150c.f275460g2 = afVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingResume, component:" + hashCode());
            this.f280857g = true;
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onEnterChattingRoom");
            g05.r rVar = (g05.r) ((g05.i) i95.n0.c(g05.i.class));
            rVar.getClass();
            rVar.f349021h = new java.lang.ref.WeakReference(this);
            android.view.View c17 = this.f280113d.c(com.p314xaae8f345.mm.R.id.f565216bp0);
            this.f280858h = c17;
            if (c17 != null) {
                c17.addOnLayoutChangeListener(this.f280860m);
            }
            o0();
            if (!((g05.r) ((g05.i) i95.n0.c(g05.i.class))).f349022i) {
                ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Bi();
            }
            this.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (m0()) {
            this.f280857g = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingPause");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (m0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "onChattingEnterAnimStart, component:" + hashCode());
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onEnterChattingRoom");
            g05.r rVar = (g05.r) ((g05.i) i95.n0.c(g05.i.class));
            rVar.getClass();
            rVar.f349021h = new java.lang.ref.WeakReference(this);
            ((g05.r) ((g05.i) i95.n0.c(g05.i.class))).Bi();
            this.f280113d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }
}
