package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wm extends xt2.m6 implements jf2.o, jf2.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f201739d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f201740e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f201741f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f201742g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f201743h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f201744i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f201745m;

    /* renamed from: n, reason: collision with root package name */
    public r45.xn1 f201746n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f201747o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f201748p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Vibrator f201749q;

    /* renamed from: r, reason: collision with root package name */
    public zi2.w f201750r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.k0 f201751s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f201752t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f201753u;

    /* renamed from: v, reason: collision with root package name */
    public vg2.y1 f201754v;

    public wm(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f201739d = root;
        this.f201740e = basePlugin;
        this.f201741f = "Finder.FinderLiveKTVSendFlowerEntranceWidget";
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.u8a);
        this.f201742g = viewGroup;
        this.f201743h = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.u8c);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.u8d);
        this.f201744i = findViewById;
        java.lang.Object systemService = root.getContext().getSystemService("vibrator");
        this.f201749q = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        this.f201752t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.om(this));
        findViewById.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.tm(this));
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.um(this));
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vm(this));
    }

    public static void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar, android.view.ViewGroup viewGroup, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        if ((i18 & 4) != 0) {
            i17 = 1;
        }
        wmVar.f201745m = str;
        zi2.w wVar = wmVar.f201750r;
        java.lang.String str2 = wmVar.f201741f;
        if (wVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "jumpToSendGift failed: plugin is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "jumpToSendGift: giftId=" + str + ", batchCount=" + i17);
        android.os.Vibrator vibrator = wmVar.f201749q;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
        java.lang.String str3 = ((mm2.c1) wVar.P0(mm2.c1.class)).f410385o;
        qo0.b bVar = qo0.b.f446859a2;
        qo0.c cVar = wVar.f554686p;
        qo0.c.a(cVar, bVar, null, 2, null);
        qo0.b bVar2 = qo0.b.Z1;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", wmVar.f201745m);
        bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i17);
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_IS_PKG", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_FREE_GIFT", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_SEND_BY_KTV_OUTER", true);
        r45.xn1 xn1Var = wmVar.f201746n;
        if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null && (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76197x6c03c64c, str3)) {
            bundle.putString("PARAM_FINDER_LIVE_SEND_GIFT_TARGET_USER_NAME", m76197x6c03c64c);
        }
        cVar.mo46557x60d69242(bVar2, bundle);
    }

    @Override // jf2.o
    public void b() {
        android.view.ViewGroup viewGroup = this.f201739d;
        if (viewGroup.getVisibility() != 0) {
            zi2.w wVar = this.f201750r;
            if (wVar == null) {
                return;
            } else {
                l(wVar);
            }
        }
        viewGroup.setVisibility(0);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f201742g;
    }

    @Override // jf2.o
    public void g() {
        this.f201739d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f201739d;
    }

    @Override // jf2.o
    public boolean i() {
        return this.f201747o;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView iconView = this.f201743h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconView, "iconView");
        return iconView;
    }

    public final boolean k(android.content.Context context, int i17, java.lang.String str) {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_KTV_SEND_GIFT_SHOWN_BOOLEAN_SYNC, false);
        if (!o17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201741f, "Showing first-time gift guide");
            this.f201753u = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570483df2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
            c22646x1e9ca55.b(com.p314xaae8f345.mm.ui.zk.a(context, 12), com.p314xaae8f345.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f565984eb4);
            android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f2w);
            android.widget.TextView textView3 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f566172q56);
            android.widget.TextView textView4 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            android.view.View findViewById = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nqn);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
            com.p314xaae8f345.mm.ui.fk.a(textView4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            com.p314xaae8f345.mm.ui.fk.a(textView3);
            textView2.setText(java.lang.String.valueOf(i17));
            textView4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.em(this));
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fm(this, str, i17));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f201753u;
            if (k0Var != null) {
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gm(this, c22646x1e9ca55);
            }
            if (k0Var != null) {
                k0Var.e(true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f201753u;
            if (k0Var2 != null) {
                k0Var2.v();
            }
        }
        return o17;
    }

    public final void l(zi2.w wVar) {
        if (((mm2.c1) wVar.P0(mm2.c1.class)).f410413s3 <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.im(this, wVar, null), 3, null);
        }
    }

    public final void n() {
        this.f201747o = false;
        this.f201739d.setVisibility(8);
    }

    public final void o(r45.tp1 tp1Var) {
        boolean z17;
        java.lang.String str;
        if (this.f201748p) {
            return;
        }
        if (!(tp1Var != null && tp1Var.m75939xb282bd08(4) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201741f, "updateGiftInfo got gift type not ktv, set func disable");
            this.f201747o = false;
            this.f201739d.setVisibility(8);
            return;
        }
        this.f201748p = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201741f, "updateGiftInfo got gift type ktv, bind success");
        r45.kv1 kv1Var = (r45.kv1) tp1Var.m75936x14adae67(0);
        zi2.w wVar = this.f201750r;
        if (wVar == null) {
            return;
        }
        boolean z18 = ((mm2.c1) this.f201740e.P0(mm2.c1.class)).T;
        boolean z19 = ((mm2.n0) this.f201740e.P0(mm2.n0.class)).f410806r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) this.f201740e.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        if (ag0Var != null) {
            jf2.k0 k0Var = (jf2.k0) ag0Var.U0(jf2.k0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = ag0Var.A;
            boolean z27 = k0Var != null && k0Var.g7(wmVar);
            android.view.ViewGroup viewGroup = z27 ? ag0Var.f193412J.f335454d : wmVar.f201739d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ag0Var.f193414w, "[ktvOuterFlowerView] isFolded=" + z27 + ", result.isShown=" + viewGroup.isShown() + ", result.visibility=" + viewGroup.getVisibility());
            z17 = viewGroup.isShown();
        } else {
            z17 = false;
        }
        java.lang.String str2 = this.f201741f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUpdateOuterGift - gift: ");
        if (kv1Var == null || (str = kv1Var.m75945x2fec8307(0)) == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(", isAssistant: ");
        sb6.append(z18);
        sb6.append(", isCoLiveInviteeAnchor: ");
        sb6.append(z19);
        sb6.append(", isGiftEntranceVisible: ");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (kv1Var == null || z18 || z19) {
            n();
            return;
        }
        java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f201741f, "onUpdateOuterGift: giftId is null");
            n();
            return;
        }
        if (this.f201739d.getVisibility() == 0) {
            java.lang.Object tag = this.f201739d.getTag();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.String ? (java.lang.String) tag : null, m75945x2fec8307)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201741f, "outerGift: " + m75945x2fec8307 + " already show, return");
                return;
            }
        }
        n();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wVar, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sm(kv1Var, this, m75945x2fec8307, wVar, null), 2, null);
    }

    public final void p(om2.d0 d0Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        java.lang.String m76197x6c03c64c;
        java.lang.String str = null;
        om2.e0 e0Var = d0Var instanceof om2.e0 ? (om2.e0) d0Var : null;
        om2.o oVar = e0Var != null ? e0Var.f427832a : null;
        r45.xn1 xn1Var = oVar != null ? oVar.f427894b : null;
        if ((xn1Var == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (m76197x6c03c64c = c19782x23db1cfa2.m76197x6c03c64c()) == null) ? false : zl2.r4.f555483a.k2(m76197x6c03c64c)) {
            xn1Var = null;
        }
        this.f201746n = xn1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update self target username: ");
        r45.xn1 xn1Var2 = this.f201746n;
        if (xn1Var2 != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76197x6c03c64c();
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f201741f, sb6.toString());
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 27;
    }

    @Override // jf2.o
    public boolean u() {
        return true;
    }
}
