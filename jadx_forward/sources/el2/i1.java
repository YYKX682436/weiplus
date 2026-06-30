package el2;

/* loaded from: classes3.dex */
public final class i1 extends xt2.m6 implements jf2.o, jf2.k {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f335345d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f335346e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f335347f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f335348g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f335349h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f335350i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f335351m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f335352n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f335353o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f335354p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f335355q;

    /* renamed from: r, reason: collision with root package name */
    public int f335356r;

    /* renamed from: s, reason: collision with root package name */
    public final long f335357s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f335358t;

    /* renamed from: u, reason: collision with root package name */
    public r45.kv1 f335359u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f335360v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f335361w;

    public i1(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f335345d = root;
        this.f335346e = statusMonitor;
        this.f335347f = basePlugin;
        this.f335348g = "Micro.FinderLiveOuterGiftWidget";
        this.f335349h = jz5.h.b(new el2.u0(this));
        this.f335350i = jz5.h.b(new el2.s0(this));
        this.f335351m = jz5.h.b(new el2.m0(this));
        this.f335352n = jz5.h.b(new el2.h1(this));
        this.f335353o = jz5.h.b(new el2.t0(this));
        this.f335357s = 100L;
    }

    public static final void k(el2.i1 i1Var, r45.kv1 kv1Var, boolean z17) {
        java.lang.Object obj;
        android.view.ViewGroup J1;
        i1Var.f335359u = kv1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) i1Var.f335347f.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        i1Var.f335356r = ag0Var != null ? ag0Var.I1(i1Var.f335345d) : 0;
        boolean z18 = ((mm2.c1) i1Var.f335347f.P0(mm2.c1.class)).T;
        boolean z19 = ((mm2.n0) i1Var.f335347f.P0(mm2.n0.class)).f410806r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) i1Var.f335347f.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        boolean isShown = (ag0Var2 == null || (J1 = ag0Var2.J1()) == null) ? false : J1.isShown();
        java.lang.String str = i1Var.f335348g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gift:");
        if (kv1Var == null || (obj = pm0.b0.g(kv1Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        sb6.append(", visibleSize:");
        sb6.append(i1Var.f335356r);
        sb6.append(", isAssistant:");
        sb6.append(z18);
        sb6.append(", isCoLiveInviteeAnchor:");
        sb6.append(z19);
        sb6.append(", isGiftEntranceVisible:");
        sb6.append(isShown);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!isShown || kv1Var == null || z18 || z19) {
            i1Var.f335358t = false;
            i1Var.o(false);
            return;
        }
        if (i1Var.f335345d.getVisibility() == 0) {
            java.lang.Object tag = i1Var.f335345d.getTag();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag instanceof java.lang.String ? (java.lang.String) tag : null, kv1Var.m75945x2fec8307(0))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f335348g, "outerGift: " + kv1Var.m75945x2fec8307(0) + " already show, return");
                return;
            }
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(kv1Var.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) i1Var.f335349h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-imgView>(...)");
        ((wo0.b) a17).c(imageView);
        i1Var.f335345d.setOnTouchListener(new el2.e1(i1Var, kv1Var, z17));
        i1Var.f335358t = true;
        i1Var.f335345d.setTag(kv1Var.m75945x2fec8307(0));
        android.view.View view = (android.view.View) ((jz5.n) i1Var.f335353o).mo141623x754a37bb();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget", "onUpdateOuterGift", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget", "onUpdateOuterGift", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGift;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void l(el2.i1 i1Var, r45.kv1 kv1Var, int i17, boolean z17) {
        boolean z18;
        java.lang.String str = "[openSendAgainView] notify2OpenSendAgainViewAlready:" + i1Var.f335355q;
        java.lang.String str2 = i1Var.f335348g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GIFT_OUTER_GUIDE_SHOWN_BOOLEAN_SYNC;
        boolean o17 = c17.o(u3Var, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[checkAndShowGuide] hasShownGuide:" + o17);
        if (o17 || z17) {
            z18 = false;
        } else {
            android.view.ViewGroup viewGroup = i1Var.f335345d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(viewGroup.getContext(), 1, false);
            android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570483df2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) inflate;
            c22646x1e9ca55.b(com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 12), com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f565984eb4);
            android.widget.TextView textView2 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f2w);
            android.widget.TextView textView3 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.f566172q56);
            android.widget.TextView textView4 = (android.widget.TextView) c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.b5i);
            android.view.View findViewById = c22646x1e9ca55.findViewById(com.p314xaae8f345.mm.R.id.khs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            com.p314xaae8f345.mm.ui.fk.a(textView);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView4);
            com.p314xaae8f345.mm.ui.fk.a(textView4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
            com.p314xaae8f345.mm.ui.fk.a(textView2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
            com.p314xaae8f345.mm.ui.fk.a(textView3);
            textView2.setText(java.lang.String.valueOf((int) kv1Var.m75938x746dc8a6(9)));
            textView4.setOnClickListener(new el2.n0(k0Var, i1Var, kv1Var));
            findViewById.setOnClickListener(new el2.o0(i1Var, kv1Var, z17, k0Var));
            k0Var.f293405n = new el2.p0(k0Var, c22646x1e9ca55);
            k0Var.e(true);
            java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            i1Var.p(23, m75945x2fec8307, -1);
            k0Var.v();
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            z18 = true;
        }
        if (z18 || i1Var.f335355q) {
            return;
        }
        i1Var.f335355q = true;
        qo0.b bVar = qo0.b.f446859a2;
        qo0.c cVar = i1Var.f335346e;
        qo0.c.a(cVar, bVar, null, 2, null);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", kv1Var.m75945x2fec8307(0));
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SEND_BTN", false);
        bundle.putBoolean("PARAM_FINDER_LIVE_GIFT_SEND_BY_OUTER", true);
        bundle.putInt("PARAM_FINDER_LIVE_GIFT_BATCH_SUM", i17);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_FREE_GIFT", z17);
        cVar.mo46557x60d69242(qo0.b.Z1, bundle);
    }

    public static final void m(el2.i1 i1Var) {
        i1Var.n().animate().alpha(1.0f).setDuration(500L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(new el2.g1(i1Var)).start();
    }

    @Override // jf2.o
    public void b() {
        java.lang.String str;
        android.view.ViewGroup viewGroup = this.f335345d;
        if (viewGroup.getVisibility() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f335347f;
            if (((mm2.c1) lVar.P0(mm2.c1.class)).f410413s3 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.g(lVar, oz5.m.f431862d, p3325xe03a0797.p3326xc267989b.a1.DEFAULT, new el2.r0(this, null));
            }
        }
        viewGroup.setVisibility(0);
        r45.kv1 kv1Var = this.f335359u;
        if (kv1Var == null || (str = kv1Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        p(21, str, -1);
    }

    @Override // xt2.m6
    public android.view.View f() {
        return (android.view.View) ((jz5.n) this.f335351m).mo141623x754a37bb();
    }

    @Override // jf2.o
    public void g() {
        this.f335345d.setVisibility(8);
        o(false);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f335345d;
    }

    @Override // jf2.o
    public boolean i() {
        return this.f335358t;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f335349h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-imgView>(...)");
        return imageView;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b n() {
        return (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) ((jz5.n) this.f335352n).mo141623x754a37bb();
    }

    public final void o(boolean z17) {
        if (z17) {
            if (this.f335361w) {
                return;
            }
            n().animate().alpha(0.0f).setDuration(1000L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setListener(new el2.c1(this)).start();
            this.f335361w = true;
            return;
        }
        n().setVisibility(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f335360v;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        n().n();
    }

    public final void p(int i17, java.lang.String str, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("giftid", str);
        if (i18 > 0) {
            jSONObject.put("num", i18);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335348g, "[report] json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408815z, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 22;
    }
}
