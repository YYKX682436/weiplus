package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFansListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/gc;", "Lr45/kh2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderFansListUI */
/* loaded from: classes8.dex */
public final class ActivityC15029x292078 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements zy2.gc {
    public static final /* synthetic */ int D = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15030xc9d2c4a9 C;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ListView f210099t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f210100u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f210103x;

    /* renamed from: y, reason: collision with root package name */
    public rl5.r f210104y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f210105z;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e f210101v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f210102w = new java.util.ArrayList();
    public final jz5.g A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o5(this));

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.ui.FinderFansListUI$addBlackListListener$1] */
    public ActivityC15029x292078() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5449x7a125bbe>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderFansListUI$addBlackListListener$1
            {
                this.f39173x3fe91575 = 2076502958;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5449x7a125bbe c5449x7a125bbe) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5449x7a125bbe event = c5449x7a125bbe;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ma maVar = event.f135789g;
                if (maVar == null) {
                    return true;
                }
                java.lang.String fansId = maVar.f88864a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansId, "fansId");
                int i17 = maVar.f88865b;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078.D;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078.this;
                activityC15029x292078.getClass();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w5(i17, activityC15029x292078, fansId));
                return true;
            }
        };
    }

    public static final void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078) {
        android.widget.ListView listView = activityC15029x292078.f210099t;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        if (listView.getFooterViewsCount() == 0) {
            android.widget.ListView listView2 = activityC15029x292078.f210099t;
            if (listView2 != null) {
                listView2.addFooterView(android.view.View.inflate(activityC15029x292078.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.agu, null));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                throw null;
            }
        }
    }

    public final void d7() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f210105z;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f210105z;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        new bq.h0(gVar2, 0L, 0, xy2.c.d(mo55332x76847179)).l().q(new cq.f0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n5(this, gVar), null));
    }

    public final void e7() {
        g92.b bVar = g92.b.f351302e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(mo55332x76847179), false, 2, null);
        int m75939xb282bd08 = j37 != null ? j37.u0().m75939xb282bd08(20) : 0;
        if (m75939xb282bd08 == 0) {
            m75939xb282bd08 = getIntent().getIntExtra("fans_count", 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFansListUI", "update title %s", java.lang.Integer.valueOf(m75939xb282bd08));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqo, java.lang.Integer.valueOf(m75939xb282bd08)));
        if (m75939xb282bd08 != 0) {
            android.widget.TextView textView = this.f210100u;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(8);
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80298x5ddec500, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.b6(this));
            return;
        }
        android.widget.TextView textView2 = this.f210100u;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
        textView2.setVisibility(0);
        android.widget.TextView textView3 = this.f210100u;
        if (textView3 != null) {
            textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cug));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ceg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210099t = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210100u = (android.widget.TextView) findViewById2;
        e7();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p5(this));
        this.f210104y = new rl5.r(this);
        android.widget.ListView listView = this.f210099t;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = this.f210101v;
        listView.setAdapter((android.widget.ListAdapter) eVar);
        android.widget.ListView listView2 = this.f210099t;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView2.setSelector(new android.graphics.drawable.ColorDrawable(0));
        android.widget.ListView listView3 = this.f210099t;
        if (listView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView3.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.q5(this));
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.G().r()).intValue() > 0) {
            eVar.f210618h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.s5(this);
        }
        eVar.f210617g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t5(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        pm0.v.T(pm0.v.J(km5.u.d(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u5(this)), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.v5(this));
        d7();
        mo48813x58998cd();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFansListUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mo48814x2efc64();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        java.lang.String m75945x2fec8307 = req.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.w5(ret.m75939xb282bd08(1), this, m75945x2fec8307));
    }
}
