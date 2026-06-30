package op2;

/* loaded from: classes2.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.dd2 f428773d;

    /* renamed from: e, reason: collision with root package name */
    public op2.c f428774e;

    /* renamed from: f, reason: collision with root package name */
    public op2.f f428775f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f428776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c77;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        op2.f fVar = this.f428775f;
        if (fVar != null) {
            fVar.f302431w.mo56048x7bb163d5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        r45.dd2 dd2Var;
        r45.qt2 V6;
        byte[] byteArray;
        android.os.Bundle arguments = getArguments();
        this.f428776g = arguments != null && arguments.getInt("key_use_dark_style", 1) == 1;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("key_by_pass")) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        android.content.Intent intent = m80379x76847179().getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("nearby_live_target_square_page_params_buffer_key") : null;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (byteArray = arguments3.getByteArray("nearby_live_square_tab_info_key")) == null) {
            dd2Var = null;
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.dd2().mo11468x92b714fd(byteArray);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            dd2Var = (r45.dd2) mo11468x92b714fd;
        }
        this.f428773d = dd2Var;
        android.os.Bundle arguments4 = getArguments();
        boolean z17 = arguments4 != null ? arguments4.getBoolean("nearby_live_target_auto_refresh_params_key", false) : false;
        android.os.Bundle arguments5 = getArguments();
        byte[] byteArray2 = arguments5 != null ? arguments5.getByteArray("nearby_live_target_last_buffer_params_key") : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate(), tab:");
        r45.dd2 dd2Var2 = this.f428773d;
        sb6.append(dd2Var2 != null ? dd2Var2.m75945x2fec8307(1) : null);
        sb6.append(" targetPageForceRefreshFlag:");
        sb6.append(z17);
        sb6.append(" targetTabPageLastBuffer:");
        sb6.append(byteArray2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", "onCreate(), jump_navlive_buffer_encode:" + stringExtra);
        tq2.a aVar = tq2.d.f502763a;
        tq2.d.f502763a.c("livePageOnCreate");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        if (m158358x197d1fc6 != null) {
            V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m158358x197d1fc62);
        this.f428774e = new op2.c((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, m158358x197d1fc62, V6, this.f428773d, str2, stringExtra);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158358x197d1fc63, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) m158358x197d1fc63;
        op2.c cVar = this.f428774e;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
        op2.f fVar = new op2.f(abstractActivityC21394xb3d2c0cf, abstractC14499x6ba3301, cVar, m80380x71e92c1d(), this.f428776g, this.f428773d);
        this.f428775f = fVar;
        op2.c cVar2 = this.f428774e;
        if (cVar2 != null) {
            cVar2.C(fVar, z17, byteArray2 != null ? new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArray2, 0, byteArray2.length) : null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f428774e;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.D();
        op2.c cVar2 = this.f428774e;
        if (cVar2 != null) {
            cVar2.mo979x3f5eee52();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f428774e;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.G();
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        op2.f fVar = this.f428775f;
        if (fVar != null) {
            j0Var.xj(fVar.g(), ml2.x1.f409735f, "80", ml2.y.f409774f, ((ml2.j0) i95.n0.c(ml2.j0.class)).f409121e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f409121e);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        op2.c cVar = this.f428774e;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onRequestPermissionsResult requestCode:" + i17 + " grantResults[0]:" + grantResults[0]);
        if (i17 == 79 || i17 == 153) {
            if (grantResults[0] == 0) {
                cVar.i();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "onRequestPermissionsResult return for grant.");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f428774e;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.F();
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        op2.f fVar = this.f428775f;
        if (fVar != null) {
            j0Var.xj(fVar.g(), ml2.x1.f409735f, "80", ml2.y.f409773e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f409121e, ((ml2.j0) i95.n0.c(ml2.j0.class)).f409121e);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStart() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStop() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleFocused */
    public void mo58275xd317978f() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085;
        super.mo58275xd317978f();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVisibleFocused() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        pf5.u uVar = pf5.u.f435469a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).a7(op2.d.f428772d);
        op2.c cVar = this.f428774e;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
        cVar.I();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        if (m158358x197d1fc6 == null || (mo7430x19263085 = m158358x197d1fc6.mo7430x19263085()) == null) {
            return;
        }
        op2.f fVar = this.f428775f;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g17 = fVar.g();
        if (!(g17 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25)) {
            g17 = null;
        }
        op2.f fVar2 = this.f428775f;
        if (fVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsCallback");
            throw null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g18 = fVar2.g();
        java.lang.Object mo7946xf939df19 = g18 != null ? g18.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (g17 == null || c22848x6ddd90cf == null) {
            return;
        }
        ((sp2.x3) uVar.b(mo7430x19263085).a(sp2.x3.class)).R6(g17, c22848x6ddd90cf);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onUserVisibleUnFocused */
    public void mo58437xaa858cb6() {
        super.mo58437xaa858cb6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserVisibleUnFocused() tab:");
        r45.dd2 dd2Var = this.f428773d;
        sb6.append(dd2Var != null ? dd2Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabUIC", sb6.toString());
        op2.c cVar = this.f428774e;
        if (cVar != null) {
            cVar.M();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
