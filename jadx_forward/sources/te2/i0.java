package te2;

/* loaded from: classes10.dex */
public final class i0 extends ie2.a implements te2.x3 {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww f499623g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499624h;

    /* renamed from: i, reason: collision with root package name */
    public final te2.w3 f499625i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f499626m;

    /* renamed from: n, reason: collision with root package name */
    public te2.c0 f499627n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f499628o;

    /* renamed from: p, reason: collision with root package name */
    public int f499629p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f499630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww plugin, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.w3 w3Var, gk2.e eVar, android.view.View rootView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a c14179xd6e3454a) {
        super(rootView, c14179xd6e3454a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f499623g = plugin;
        this.f499624h = activity;
        this.f499625i = w3Var;
        this.f499626m = "AnchorLuckyMoneyView_" + hashCode();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f499628o = true;
        zl2.q4.f555466a.R("FinderLiveAnchorLuckyMoneyBubbleViewCallback");
    }

    public final void A(android.os.Bundle bundle) {
        if (this.f499630q) {
            p(this.f499629p);
            android.view.View B = B();
            if (B != null) {
                B.setOnClickListener(new te2.d0(this));
            }
            android.view.View B2 = B();
            if (B2 == null) {
                return;
            }
            B2.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsl));
        }
    }

    public final android.view.View B() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.agx);
        if (t17 instanceof android.view.View) {
            return t17;
        }
        return null;
    }

    public final android.widget.TextView C() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.f565301c03);
        if (t17 instanceof android.widget.TextView) {
            return (android.widget.TextView) t17;
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D() {
        android.view.View t17 = t(com.p314xaae8f345.mm.R.id.iy7);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = t17 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) t17 : null;
        if (c22789xd23e9a9b == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.Z));
        return c22789xd23e9a9b;
    }

    public void E() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D2 = D();
        boolean z17 = false;
        if (D2 != null && D2.f()) {
            z17 = true;
        }
        if (z17 && (D = D()) != null) {
            D.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D3 = D();
        if (D3 != null) {
            D3.i(this.f499627n);
        }
    }

    @Override // te2.x3
    public void b() {
        android.widget.TextView C = C();
        if (C != null) {
            zl2.r4.f555483a.b3(C);
        }
        this.f499627n = new te2.c0(this, this);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D = D();
        if (D != null) {
            D.a(this.f499627n);
        }
        android.view.View u17 = u();
        if (u17 != null) {
            u17.setOnClickListener(new te2.e0(this));
        }
        android.view.View B = B();
        if (B != null) {
            B.setOnClickListener(new te2.f0(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(D(), "finder_live_red_packet");
        if (!zl2.r4.f555483a.w1()) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(D(), 40, 25561);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(D(), new te2.g0(this));
        }
        android.view.View B2 = B();
        if (B2 != null) {
            B2.setContentDescription(this.f499624h.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dsl));
        }
        this.f499630q = true;
    }

    @Override // te2.x3
    /* renamed from: destroy */
    public void mo166307x5cd39ffa() {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499624h;
    }

    @Override // ie2.h
    public void l(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.h
    public android.os.Bundle o() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b D = D();
        if (D != null) {
            D.m82582x3ae760af(0.5d);
        }
        E();
        return null;
    }

    @Override // te2.x3
    public void p(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499626m, "updateLuckyMoneyCount: count:" + i17 + ", currentCnt=" + this.f499629p + ", pagView:" + D() + ", isPagEnable:" + this.f499628o);
        if (i17 >= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww wwVar = this.f499623g;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wwVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new te2.h0(this, i17, null), 2, null);
            return;
        }
        android.view.View u17 = u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        y();
    }

    @Override // te2.x3
    /* renamed from: release */
    public void mo166308x41012807() {
        this.f499630q = false;
        android.view.View u17 = u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        E();
        y();
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        A(bundle);
    }

    @Override // ie2.a
    public java.lang.String v() {
        return this.f499626m;
    }
}
