package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f202772d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f202773e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f202774f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0 f202775g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f202776h;

    /* renamed from: i, reason: collision with root package name */
    public int f202777i;

    /* renamed from: m, reason: collision with root package name */
    public int f202778m;

    /* renamed from: n, reason: collision with root package name */
    public int f202779n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f202780o;

    /* renamed from: p, reason: collision with root package name */
    public ya2.b2 f202781p;

    /* renamed from: q, reason: collision with root package name */
    public int f202782q;

    /* renamed from: r, reason: collision with root package name */
    public int f202783r;

    /* renamed from: s, reason: collision with root package name */
    public int f202784s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f202773e = new java.util.ArrayList();
        this.f202775g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0(0, null, 3, null);
        this.f202776h = "";
        this.f202780o = "";
    }

    public final android.view.View O6() {
        android.view.View view = this.f202772d;
        if (view == null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2y, (android.view.ViewGroup) null, false);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.lqa);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jfy);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.l4v);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jfd);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jff);
            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a86);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jfi);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jfq);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) inflate.findViewById(com.p314xaae8f345.mm.R.id.l3n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) inflate.findViewById(com.p314xaae8f345.mm.R.id.l4j);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.l4i);
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kqj);
            android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kr6);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kqh)).getPaint(), 0.8f);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kqw)).getPaint(), 0.8f);
            com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fsf)).getPaint(), 0.8f);
            textView.setText(this.f202780o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.c(findViewById, this));
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            ya2.b2 b2Var = this.f202781p;
            java.lang.String m176700xe5e0d2a0 = b2Var != null ? b2Var.m176700xe5e0d2a0() : null;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m176700xe5e0d2a0 == null) {
                m176700xe5e0d2a0 = "";
            }
            mn2.n nVar = new mn2.n(m176700xe5e0d2a0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity m80379x76847179 = m80379x76847179();
            ya2.b2 b2Var2 = this.f202781p;
            java.lang.String w07 = b2Var2 != null ? b2Var2.w0() : null;
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x76847179, w07));
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f542044a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            ya2.b2 b2Var3 = this.f202781p;
            zy2.tb.a(m1Var, imageView2, b2Var3 != null ? b2Var3.f69300x731cac1b : null, 0, 4, null);
            com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
            if (this.f202782q == 0) {
                textView4.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.en6, java.lang.Integer.valueOf(this.f202783r)));
            } else {
                textView4.setText(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573455en5, java.lang.Integer.valueOf(this.f202783r)));
            }
            c2678xa407981c.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.d(this, textView));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba42);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15343x638a173f);
            c1163xf1deaba42.m7964x8d4ad49c(null);
            c1163xf1deaba42.mo7967x900dcbe1(this.f202775g.d(m80379x76847179()));
            c1163xf1deaba42.N(this.f202775g.c());
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.member.preview.FinderMemberPreviewFeedItemUIC$initRecycleView$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k.this.f202775g.b(null).mo43555xf2bb75ea(type);
                }
            }, this.f202773e, false);
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.f(this);
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf);
            c15343x638a173f.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.g(this, c1163xf1deaba42, c15343x638a173f));
            c15343x638a173f.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.h(c15343x638a173f));
            qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
            android.app.Activity m80379x768471792 = m80379x76847179();
            ((pg0.s3) h0Var).getClass();
            textView5.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(m80379x768471792, 3));
            int i17 = this.f202778m;
            textView5.setText(i17 > 0 ? java.lang.String.valueOf(i17) : java.lang.String.valueOf(this.f202777i));
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            eo2.b bVar = (eo2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(eo2.b.class);
            int i18 = bVar != null ? bVar.f337091d : 0;
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.e(this, findViewById2, i18));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById2, "become_member");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById2, 40, 25496);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(m80379x76847179());
            lVarArr[1] = new jz5.l("comment_scene", e17 != null ? java.lang.Integer.valueOf(e17.f216913n) : null);
            lVarArr[2] = new jz5.l("finder_username", this.f202776h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(m80379x76847179());
            lVarArr[3] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f216919r : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(m80379x76847179());
            lVarArr[4] = new jz5.l("finder_context_id", e19 != null ? e19.f216915p : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e27 = iyVar.e(m80379x76847179());
            lVarArr[5] = new jz5.l("behaviour_session_id", e27 != null ? e27.f216918q : null);
            ((cy1.a) rVar).gk(findViewById2, kz5.c1.k(lVarArr));
            view = inflate;
        }
        this.f202772d = view;
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f202773e = new java.util.ArrayList();
        this.f202775g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.jj0(0, null, 3, null);
        this.f202776h = "";
        this.f202780o = "";
    }
}
