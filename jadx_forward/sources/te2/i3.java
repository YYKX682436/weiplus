package te2;

/* loaded from: classes10.dex */
public final class i3 implements te2.x3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww f499636d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499637e;

    /* renamed from: f, reason: collision with root package name */
    public final te2.w3 f499638f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f499639g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f499640h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f499641i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f499642m;

    /* renamed from: n, reason: collision with root package name */
    public te2.d3 f499643n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f499644o;

    /* renamed from: p, reason: collision with root package name */
    public int f499645p;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww plugin, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.w3 w3Var, gk2.e eVar, android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f499636d = plugin;
        this.f499637e = activity;
        this.f499638f = w3Var;
        this.f499639g = rootView;
        this.f499640h = "CommonLuckyMoneyView_" + hashCode();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f499644o = true;
        zl2.q4.f555466a.R("FinderLiveLuckyMoneyBubbleViewCallback");
    }

    public void a() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f499642m;
        boolean z17 = false;
        if (c22789xd23e9a9b2 != null && c22789xd23e9a9b2.f()) {
            z17 = true;
        }
        if (z17 && (c22789xd23e9a9b = this.f499642m) != null) {
            c22789xd23e9a9b.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f499642m;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.i(this.f499643n);
        }
    }

    @Override // te2.x3
    public void b() {
        android.view.View view = this.f499639g;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565301c03);
        this.f499641i = textView;
        if (textView != null) {
            zl2.r4.f555483a.b3(textView);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) view.findViewById(com.p314xaae8f345.mm.R.id.iy7);
        if (c22789xd23e9a9b != null) {
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.Y));
        } else {
            c22789xd23e9a9b = null;
        }
        this.f499642m = c22789xd23e9a9b;
        te2.d3 d3Var = new te2.d3(this, this);
        this.f499643n = d3Var;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f499642m;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.a(d3Var);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = this.f499642m;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.setOnClickListener(new te2.e3(this));
        }
        if (view != null) {
            view.setOnClickListener(new te2.f3(this));
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(this.f499642m, "finder_live_red_packet");
        if (zl2.r4.f555483a.w1()) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this.f499642m, 40, 25561);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this.f499642m, new te2.g3(this));
    }

    @Override // te2.x3
    /* renamed from: destroy */
    public void mo166307x5cd39ffa() {
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499637e;
    }

    @Override // te2.x3
    public android.view.View h() {
        return this.f499639g;
    }

    @Override // te2.x3
    public void p(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f499640h, "updateLuckyMoneyCount: count:" + i17 + ", currentCnt=" + this.f499645p + ", pagView:" + this.f499642m + ", isPagEnable:" + this.f499644o);
        a();
        if (i17 >= 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww wwVar = this.f499636d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(wwVar, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new te2.h3(i17, this, null), 2, null);
            return;
        }
        android.view.View view = this.f499639g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "updateLuckyMoneyCount", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // te2.x3
    /* renamed from: release */
    public void mo166308x41012807() {
        android.view.View view = this.f499639g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCommonLuckyMoneyBubbleViewCallback", "release", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a();
    }
}
