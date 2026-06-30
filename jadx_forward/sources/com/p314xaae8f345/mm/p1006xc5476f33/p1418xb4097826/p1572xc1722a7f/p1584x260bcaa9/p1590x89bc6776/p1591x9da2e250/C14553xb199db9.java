package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment */
/* loaded from: classes2.dex */
public final class C14553xb199db9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 {

    /* renamed from: n, reason: collision with root package name */
    public final jq2.a f203617n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a f203618o;

    /* renamed from: p, reason: collision with root package name */
    public lq2.a f203619p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f203620q;

    public C14553xb199db9(jq2.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f203617n = params;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemeTagFragment", "LiveStreamTabFragment init id: " + params.f382629b + " pos: " + params.f382628a + " hashCode: " + m7479x8cdac1b());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.o1.c(lq2.a.class);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveStreamTabFragment onCreate id: ");
        jq2.a aVar = this.f203617n;
        sb6.append(aVar.f382629b);
        sb6.append(" pos: ");
        sb6.append(aVar.f382628a);
        sb6.append(" hashCode: ");
        sb6.append(m7479x8cdac1b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemeTagFragment", sb6.toString());
        this.f203620q = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String str;
        gp2.l0 l0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        lq2.a aVar = (lq2.a) pf5.z.f435481a.b(this).a(lq2.a.class);
        this.f203619p = aVar;
        java.lang.Object[] objArr = 0;
        if (aVar != null) {
            jq2.a params = this.f203617n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
            android.app.Activity m80379x76847179 = aVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            android.view.View m80380x71e92c1d = aVar.m80380x71e92c1d();
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = aVar.m158358x197d1fc6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment");
            iq2.d0 d0Var = new iq2.d0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179, m80380x71e92c1d, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656) m158358x197d1fc6, params);
            aVar.f401988e = d0Var;
            java.lang.System.currentTimeMillis();
            android.view.View view = d0Var.f375251b;
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.nqo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
            d0Var.f375261l = c22849x81a93d25;
            jq2.a aVar2 = d0Var.f375252c;
            r45.dd2 dd2Var = aVar2.f382630c;
            int i17 = 0;
            if (dd2Var != null) {
                c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext(), 0, false));
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = d0Var.f375261l;
                if (c22849x81a93d252 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subTabLayout");
                    throw null;
                }
                kq2.c cVar = new kq2.c(dd2Var, d0Var);
                d0Var.f375264o = cVar;
                c22849x81a93d252.mo7960x6cab2c8d(cVar);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = d0Var.f375261l;
                if (c22849x81a93d253 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subTabLayout");
                    throw null;
                }
                c22849x81a93d253.setBackgroundColor(c22849x81a93d253.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
                if (dd2Var.m75941xfb821914(6).isEmpty()) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = d0Var.f375261l;
                    if (c22849x81a93d254 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subTabLayout");
                        throw null;
                    }
                    c22849x81a93d254.setVisibility(8);
                } else {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d255 = d0Var.f375261l;
                    if (c22849x81a93d255 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subTabLayout");
                        throw null;
                    }
                    c22849x81a93d255.setVisibility(0);
                }
            }
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568121lr5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            d0Var.f375271v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById2;
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a) findViewById3;
            d0Var.f375259j = c14594x9de071a;
            d0Var.D = new zo2.e(c14594x9de071a, i17, 2, objArr == true ? 1 : 0);
            android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            d0Var.f375262m = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById4;
            android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.auj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
            d0Var.f375260k = findViewById5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629 c15430xb1d1f629 = findViewById5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae.C15430xb1d1f629) findViewById5 : null;
            if (c15430xb1d1f629 != null) {
                c15430xb1d1f629.m62883xc5db1d8f(new iq2.j(d0Var));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a2 = d0Var.f375259j;
            if (c14594x9de071a2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f375250a;
            java.util.ArrayList arrayList = d0Var.f375265p;
            boolean z17 = !((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mk();
            mn0.d0 d0Var2 = mn0.d0.f411255u;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = d0Var.f375250a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                str = "";
            }
            dq2.d dVar = new dq2.d(abstractActivityC21394xb3d2c0cf, c14594x9de071a2, arrayList, false, 0, true, false, z17, null, d0Var2, 7, str, 0, new iq2.l(d0Var), 4352, null);
            dVar.f355791q = "Vertical_AutoPlayManager";
            dVar.G = new iq2.m(dVar, d0Var);
            d0Var.E = dVar;
            r45.dk2 g17 = ((gq2.j) aVar2.f382634g).f356097g.g();
            if (g17 != null && (l0Var = d0Var.E) != null) {
                l0Var.H(g17.m75939xb282bd08(15));
            }
            gp2.l0 l0Var2 = d0Var.E;
            if (l0Var2 != null) {
                l0Var2.J(false);
            }
            gp2.l0 l0Var3 = d0Var.E;
            if (l0Var3 != null) {
                l0Var3.e(null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a3 = d0Var.f375259j;
            if (c14594x9de071a3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                c14594x9de071a3.i(new or2.s(activity.getClass().getSimpleName() + '#' + d0Var.f375253d));
            }
            iq2.n nVar = new iq2.n(d0Var);
            sp2.c4 c4Var = d0Var.B;
            dq2.f fVar = new dq2.f(arrayList, nVar, c4Var, new iq2.o(d0Var), new iq2.p(d0Var), 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a4 = d0Var.f375259j;
            if (c14594x9de071a4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c14594x9de071a4.i(fVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14542xcd9688c0 c14542xcd9688c0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14542xcd9688c0(d0Var.f375250a, false, false, 0, d0Var.f375263n, new iq2.q(d0Var), c4Var);
            d0Var.f375268s = c14542xcd9688c0;
            up2.h hVar = new up2.h(c14542xcd9688c0, arrayList);
            hVar.f374638o = new iq2.r(d0Var);
            hVar.f374637n = new iq2.t(d0Var);
            d0Var.f375267r = hVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a5 = d0Var.f375259j;
            if (c14594x9de071a5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c14594x9de071a5.N(new ar2.a(activity));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a6 = d0Var.f375259j;
            if (c14594x9de071a6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c14594x9de071a6.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(2, 1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a7 = d0Var.f375259j;
            if (c14594x9de071a7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c14594x9de071a7.mo7960x6cab2c8d(d0Var.f375267r);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = d0Var.f375262m;
            if (c22851x22587864 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x22587864.m82945xba09cf09(new iq2.g(d0Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a8 = d0Var.f375259j;
            if (c14594x9de071a8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            in5.o.b(c14594x9de071a8, new iq2.h(d0Var), iq2.i.f375281d);
            aVar.f401987d = "LiveStreamTabFragmentUIC_" + params.f382629b + '_' + params.f382628a;
        }
        this.f203618o = mo7503x18bad100 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a) mo7503x18bad100.findViewById(com.p314xaae8f345.mm.R.id.lqa) : null;
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveStreamTabFragment onDestroy id: ");
        jq2.a aVar = this.f203617n;
        sb6.append(aVar.f382629b);
        sb6.append(" pos: ");
        sb6.append(aVar.f382628a);
        sb6.append(" hashCode: ");
        sb6.append(m7479x8cdac1b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemeTagFragment", sb6.toString());
        this.f203620q = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveStreamTabFragment onResume id: ");
        jq2.a aVar = this.f203617n;
        sb6.append(aVar.f382629b);
        sb6.append(" pos: ");
        sb6.append(aVar.f382628a);
        sb6.append(" hashCode: ");
        sb6.append(m7479x8cdac1b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemeTagFragment", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getB() {
        return 0;
    }
}
