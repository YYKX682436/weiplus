package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1596x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/ui/special/fragment/LiveThemeTagFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeTagFragment */
/* loaded from: classes2.dex */
public final class C14568x797587ad extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 {

    /* renamed from: n, reason: collision with root package name */
    public final er2.a f203647n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f203648o;

    public C14568x797587ad(er2.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f203647n = params;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, cr2.y.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        android.content.Intent intent;
        super.o0();
        this.f203648o = true;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        int i17 = 0;
        if (mo7430x19263085 != null && (intent = mo7430x19263085.getIntent()) != null) {
            i17 = intent.getIntExtra("KEY_SHARE_TYPE", 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String valueOf = java.lang.String.valueOf(m7479x8cdac1b());
        java.lang.String valueOf2 = java.lang.String.valueOf(getB());
        java.lang.String valueOf3 = java.lang.String.valueOf(getB());
        cl0.g gVar = new cl0.g();
        er2.a aVar = this.f203647n;
        gVar.s("topic_id", aVar.f337542b);
        gVar.s("topic_title", aVar.f337544d);
        gVar.s("tag_id", aVar.f337543c);
        if (i17 > 0) {
            gVar.o("share_type", i17);
        }
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        a4Var.c(valueOf, valueOf2, valueOf3, gVar2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        cr2.y yVar = (cr2.y) pf5.z.f435481a.b(this).a(cr2.y.class);
        yVar.getClass();
        er2.a params = this.f203647n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        android.app.Activity m80379x76847179 = yVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View m80380x71e92c1d = yVar.m80380x71e92c1d();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = yVar.m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc6, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment");
        cr2.x xVar = new cr2.x((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179, m80380x71e92c1d, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656) m158358x197d1fc6, params);
        yVar.f303454d = xVar;
        android.view.View view = xVar.f303429b;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        xVar.f303440m = c22849x81a93d25;
        int i17 = xVar.f303435h;
        xVar.f303453z = new zo2.e(c22849x81a93d25, (i17 == 11 || i17 == 4) ? 2 : 1);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        xVar.f303441n = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById2;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = xVar.f303440m;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656 fragment = xVar.f303430c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = xVar.f303428a;
        if (i18 >= 26) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(activity.getClass().getSimpleName());
            sb6.append('#');
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            sb6.append(nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
            c22849x81a93d252.i(new or2.s(sb6.toString()));
        }
        java.util.ArrayList arrayList = xVar.f303444q;
        dq2.f fVar = new dq2.f(arrayList, new cr2.g(xVar), xVar.f303450w, new cr2.h(xVar), new cr2.i(xVar), (i17 == 11 || i17 == 4) ? 2 : 1);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = xVar.f303440m;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c22849x81a93d253.i(fVar);
        xVar.f303451x = fVar;
        er2.a aVar = xVar.f303431d;
        if (i17 == 11 || i17 == 4) {
            xVar.f303446s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.C14566xe7108751(xVar.f303428a, fragment.getB(), 0.0f, 4, null);
            xVar.f303442o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(2, 1);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = xVar.f303440m;
            if (c22849x81a93d254 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            ar2.a aVar2 = new ar2.a(activity);
            if (aVar.f337549i == 1) {
                aVar2.f94915f = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12);
            }
            c22849x81a93d254.N(aVar2);
        } else {
            xVar.f303446s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.C14564xa3e65185(activity, fragment.getB(), xVar.B);
            xVar.f303442o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7(1, 1);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d255 = xVar.f303440m;
            if (c22849x81a93d255 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c22849x81a93d255.N(new ar2.b(activity));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1595xbeeb310a.AbstractC14565x91bfdb1c abstractC14565x91bfdb1c = xVar.f303446s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC14565x91bfdb1c);
        cr2.a aVar3 = new cr2.a(abstractC14565x91bfdb1c, arrayList);
        aVar3.f374638o = new cr2.j(xVar);
        aVar3.f374637n = new cr2.l(xVar);
        xVar.f303445r = aVar3;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d256 = xVar.f303440m;
        if (c22849x81a93d256 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = xVar.f303442o;
        if (layoutManager == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerViewLayoutManager");
            throw null;
        }
        c22849x81a93d256.mo7967x900dcbe1(layoutManager);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d257 = xVar.f303440m;
        if (c22849x81a93d257 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c22849x81a93d257.mo7960x6cab2c8d(xVar.f303445r);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = xVar.f303441n;
        if (c22851x22587864 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
            throw null;
        }
        c22851x22587864.m82945xba09cf09(new cr2.m(xVar));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d258 = xVar.f303440m;
        if (c22849x81a93d258 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        in5.o.b(c22849x81a93d258, new cr2.n(xVar), cr2.d.f303388d);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d259 = xVar.f303440m;
        if (c22849x81a93d259 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = xVar.f303428a;
        boolean z17 = !((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mk();
        int i19 = aVar.f337549i;
        mn0.d0 d0Var = i19 == 1 ? mn0.d0.f411260z : mn0.d0.f411255u;
        int i27 = i19 == 1 ? 7 : 20;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 == null || (str = java.lang.Integer.valueOf(nyVar2.f216913n).toString()) == null) {
            str = "";
        }
        gp2.l0 l0Var = new gp2.l0(abstractActivityC21394xb3d2c0cf, c22849x81a93d259, arrayList, false, 0, true, false, z17, null, d0Var, i27, str, (i17 == 11 || i17 == 4) ? 2 : 1, false, null, null, 57600, null);
        l0Var.f355791q = "Theme_AutoPlayManager";
        l0Var.G = new cr2.e(xVar);
        xVar.A = l0Var;
        l0Var.e(null);
        if (xVar.f303440m == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        cr2.a aVar4 = xVar.f303445r;
        if (aVar4 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            sp2.x3 x3Var = (sp2.x3) zVar.a(activity).a(sp2.x3.class);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d2510 = xVar.f303440m;
            if (c22849x81a93d2510 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            x3Var.R6(c22849x81a93d2510, aVar4);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        fr2.p pVar = (fr2.p) zVar.a(activity).e(fr2.p.class);
        if (pVar != null) {
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.ilk);
            if (findViewById3 != null) {
                findViewById3.setPadding(findViewById3.getPaddingLeft(), findViewById3.getPaddingTop(), findViewById3.getPaddingRight(), activity.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561189bt));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d2511 = xVar.f303440m;
            if (c22849x81a93d2511 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c22849x81a93d2511.i(new cr2.f(pVar));
        }
        if (mo7503x18bad100 != null) {
        }
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        if (this.f203648o) {
            java.lang.String hashCode = java.lang.String.valueOf(m7479x8cdac1b());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashCode, "hashCode");
            ml2.b1.a(ml2.b1.f408744a, hashCode, null, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        android.content.Intent intent;
        super.mo7517x57429eec();
        if (this.f203648o) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            int i17 = 0;
            if (mo7430x19263085 != null && (intent = mo7430x19263085.getIntent()) != null) {
                i17 = intent.getIntExtra("KEY_SHARE_TYPE", 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            java.lang.String valueOf = java.lang.String.valueOf(m7479x8cdac1b());
            java.lang.String valueOf2 = java.lang.String.valueOf(getB());
            java.lang.String valueOf3 = java.lang.String.valueOf(getB());
            cl0.g gVar = new cl0.g();
            er2.a aVar = this.f203647n;
            gVar.s("topic_id", aVar.f337542b);
            gVar.s("topic_title", aVar.f337544d);
            gVar.s("tag_id", aVar.f337543c);
            if (i17 > 0) {
                gVar.o("share_type", i17);
            }
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            a4Var.c(valueOf, valueOf2, valueOf3, gVar2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
        this.f203648o = false;
        java.lang.String hashCode = java.lang.String.valueOf(m7479x8cdac1b());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hashCode, "hashCode");
        ml2.b1.a(ml2.b1.f408744a, hashCode, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getB() {
        er2.a aVar = this.f203647n;
        if (aVar.f337550j == 2) {
            return 329;
        }
        int i17 = aVar.f337545e;
        if (i17 == 4 || i17 == 11) {
            return 261;
        }
        return i17 == 10 ? 260 : 0;
    }
}
