package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class th extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f217558d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f217559e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f217560f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f217561g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f217562h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f217563i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217564m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f217565n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f217560f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rh(this);
        this.f217562h = true;
        this.f217565n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }

    public final void O6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN;
        boolean z18 = !c17.o(u3Var, false);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f217558d;
        boolean c18 = c1163xf1deaba4 != null ? vd2.m3.f517342a.c(c1163xf1deaba4) : false;
        pf5.u uVar = pf5.u.f435469a;
        boolean z19 = ((ey2.n0) uVar.e(c61.l7.class).a(ey2.n0.class)).N6(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(m80379x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()).f338963a != 0;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0);
        if (!this.f217561g) {
            this.f217561g = z17;
        }
        if (this.f217561g && (abstractC14490x69736cb5 = this.f217564m) != null) {
            abstractC14490x69736cb5.U1(-1);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCheckShowGuide] isUseNewGuide=");
        sb6.append(z19);
        sb6.append(" isShowGuideTips:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f217564m;
        sb6.append(abstractC14490x69736cb52 != null ? java.lang.Integer.valueOf(abstractC14490x69736cb52.getIsShowGuideTips()) : null);
        sb6.append(" isFirst=");
        sb6.append(z18);
        sb6.append(", liveListIsVisible:");
        sb6.append(c18);
        sb6.append(",recyclerView is null:");
        sb6.append(this.f217558d == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FullFeedGuideUIC", sb6.toString());
        if (!z18 || c18 || z19 || this.f217561g || !this.f217562h) {
            return;
        }
        this.f217565n.mo77786xdceccb8e(this.f217560f, 2000L);
        if (r17 >= 3) {
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        }
    }

    public final void P6(so2.j5 j5Var) {
        pf5.u uVar = pf5.u.f435469a;
        if (((ey2.n0) uVar.e(c61.l7.class).a(ey2.n0.class)).N6(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(m80379x76847179()).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6()).f338963a != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FullFeedGuideUIC", "isUseNewGuide");
            return;
        }
        if (this.f217561g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FullFeedGuideUIC", "first video media type placeholder no show guide");
            return;
        }
        if (!this.f217562h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FullFeedGuideUIC", "no show guide by share tips");
            return;
        }
        boolean z17 = !gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, false);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT;
        int r17 = c17.r(u3Var, 0);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f217558d;
        boolean c18 = c1163xf1deaba4 != null ? vd2.m3.f517342a.c(c1163xf1deaba4) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FullFeedGuideUIC", "setShowGuideFeed isFirst:" + z17 + ",liveListIsVisible:" + c18);
        if (!z17 || c18 || !(j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) || r17 >= 3) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        abstractC14490x69736cb5.U1(1);
        this.f217564m = abstractC14490x69736cb5;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f217558d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba42 != null ? c1163xf1deaba42.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.c0(abstractC14490x69736cb5.mo2128x1ed62e84());
        }
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        if (this.f217564m != null) {
            android.view.View view = this.f217559e;
            if ((view != null && view.getVisibility() == 0) && (c1163xf1deaba4 = this.f217558d) != null) {
                c1163xf1deaba4.scrollBy(0, -((int) c1163xf1deaba4.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0)));
            }
        }
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217562h = !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h50) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h50.class)).P6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f217564m;
        if (abstractC14490x69736cb5 != null) {
            abstractC14490x69736cb5.U1(-1);
        }
        this.f217565n.mo50302x6b17ad39(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217560f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rh(this);
        this.f217562h = true;
        this.f217565n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
    }
}
