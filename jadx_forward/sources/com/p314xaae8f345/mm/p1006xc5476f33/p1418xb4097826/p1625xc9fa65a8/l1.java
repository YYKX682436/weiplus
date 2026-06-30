package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class l1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f207287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f207288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f207290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f207291h;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160, in5.s0 s0Var, int i17) {
        this.f207287d = abstractC14490x69736cb5;
        this.f207288e = aVar;
        this.f207289f = activityC14945x8c20f160;
        this.f207290g = s0Var;
        this.f207291h = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.tz0 tz0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.String m75945x2fec8307;
        cw2.da videoView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMoreMenuItemSelectedListener feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f207287d;
        sb6.append(feed);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" menuItem:");
        sb6.append(menuItem.getItemId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", sb6.toString());
        yz5.a aVar = this.f207288e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        int itemId = menuItem.getItemId();
        cu2.m mVar = cu2.m.f303953a;
        int i18 = this.f207291h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a;
        in5.s0 s0Var = this.f207290g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activity = this.f207289f;
        switch (itemId) {
            case 99:
                int indexOf = activity.C.indexOf(feed);
                if (indexOf >= 0) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activity.P;
                    if (c1163xf1deaba4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c1163xf1deaba4.m7949x5701d990();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.z zVar = new p012xc85e97e9.p103xe821e364.p104xd1075a44.z();
                    zVar.f93702d = 2000L;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = activity.P;
                    if (c1163xf1deaba42 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    c1163xf1deaba42.m7964x8d4ad49c(zVar);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = activity.P;
                    if (c1163xf1deaba43 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                        throw null;
                    }
                    c1163xf1deaba43.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.g1(activity, m7949x5701d990), zVar.f93702d);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "defaultItemAnimator.removeDuration =" + zVar.f93702d);
                    bd2.r rVar = bd2.r.f100817a;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activity.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    rVar.e(mo55332x76847179, feed.getFeedObject().m59251x5db1b11(), feed.w(), feed.getFeedObject().m59276x6c285d75(), (r17 & 16) != 0 ? false : false, (r17 & 32) != 0 ? null : this.f207290g);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedSearchUI", "[UNINTEREST] pos error " + indexOf);
                }
                activity.getClass();
                x3Var.c(activity, "button_uninterested", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case 101:
                if (zl2.q4.f555466a.C(feed)) {
                    r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
                    if (m59258xd0557130 != null) {
                        long m75942xfb822ef2 = m59258xd0557130.m75942xfb822ef2(0);
                        bd2.b bVar = bd2.b.f100777a;
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activity.mo55332x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activity.mo55332x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471793, "getContext(...)");
                        bVar.j(mo55332x768471792, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471793).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), m75942xfb822ef2, feed.getFeedObject().m59299x6bf53a6c(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : null);
                    }
                } else {
                    bd2.b bVar2 = bd2.b.f100777a;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = activity.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471794, "getContext(...)");
                    bd2.b.c(bVar2, mo55332x768471794, this.f207287d, 0L, 0, 12, null);
                }
                activity.getClass();
                x3Var.c(activity, "button_complaint", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case 102:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.C(n7Var, this.f207289f, feed.getFeedObject(), null, 3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.h1(feed), 4, null);
                activity.getClass();
                x3Var.c(activity, "button_forward_friend", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case 103:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.F(n7Var, this.f207289f, this.f207287d, null, 0, 0, 28, null);
                if (feed.getFeedObject().m59311x25315bf4()) {
                    vs5.a aVar2 = vs5.a.f521457a;
                    r45.nw1 m59258xd05571302 = feed.getFeedObject().m59258xd0557130();
                    java.lang.String valueOf = java.lang.String.valueOf(m59258xd05571302 != null ? java.lang.Long.valueOf(m59258xd05571302.m75942xfb822ef2(0)) : null);
                    java.lang.String valueOf2 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().m76784x5db1b11());
                    java.lang.String m76836x6c03c64c = feed.getFeedObject().getFeedObject().m76836x6c03c64c();
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1;
                    aVar2.a(valueOf, valueOf2, m76836x6c03c64c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                }
                activity.getClass();
                x3Var.c(activity, "button_forward_friendcircle", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case 104:
                so2.v0.b(so2.v0.f492177a, this.f207287d, this.f207289f, null, null, 12, null);
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471795 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471795, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Rk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, mo55332x768471795, true, feed.mo2128x1ed62e84(), false, 8, null);
                return;
            case 106:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471796 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471796, "getContext(...)");
                mVar.b(mo55332x768471796, feed, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k1(activity));
                return;
            case 107:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471797 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471797, "getContext(...)");
                mVar.b(mo55332x768471797, feed, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.j1(activity));
                return;
            case 109:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471798 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471798, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.T(y4Var, mo55332x768471798, this.f207287d, this.f207290g, this.f207291h, 0, 16, null);
                return;
            case 113:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471799 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471799, "getContext(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.H(n7Var, mo55332x768471799, this.f207287d, null, 0, 12, null);
                activity.getClass();
                x3Var.c(activity, "textstatus_in_menu", feed.mo2128x1ed62e84(), this.f207291h);
                if (feed.getFeedObject().m59311x25315bf4()) {
                    vs5.a aVar3 = vs5.a.f521457a;
                    r45.nw1 m59258xd05571303 = feed.getFeedObject().m59258xd0557130();
                    java.lang.String valueOf3 = java.lang.String.valueOf(m59258xd05571303 != null ? java.lang.Long.valueOf(m59258xd05571303.m75942xfb822ef2(0)) : null);
                    java.lang.String valueOf4 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().m76784x5db1b11());
                    java.lang.String m76836x6c03c64c2 = feed.getFeedObject().getFeedObject().m76836x6c03c64c();
                    java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1;
                    aVar3.a(valueOf3, valueOf4, m76836x6c03c64c2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1, "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                    return;
                }
                return;
            case 114:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15178x4303ff90);
                cw2.ca.d(c15178x4303ff90, null, false, 3, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5 y5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717910 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717910, "getContext(...)");
                y5Var.d(mo55332x7684717910, this.f207287d, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : this.f207290g, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i1(c15178x4303ff90));
                activity.getClass();
                x3Var.c(activity, "button_set_bell", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case 116:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
                if (p17 != null) {
                    arrayList.add(p17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                cw2.da videoView2 = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView2 : null;
                if (c15188xd8bd4bd != null) {
                    in5.s0 s0Var2 = this.f207290g;
                    activity.getClass();
                    p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.a7((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) a17, s0Var2, arrayList, c15188xd8bd4bd, null, null, null, 56, null);
                }
                activity.getClass();
                x3Var.c(activity, "button_speedplay", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case 119:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717911 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717911, "getContext(...)");
                y4Var.X(mo55332x7684717911, feed);
                return;
            case 120:
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                byte[] mo14344x5f01b1f6 = feed.getFeedObject().getFeedObject().mo14344x5f01b1f6();
                ((ee0.n4) k4Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                if (mo14344x5f01b1f6 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                } else {
                    je4.a.f380848a.a(activity, 2, mo14344x5f01b1f6, 0, 9);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                }
            case 121:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717912 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717912, "getContext(...)");
                y4Var.Q(mo55332x7684717912, feed);
                return;
            case 200:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717913 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717913, "getContext(...)");
                y4Var.Y(feed, mo55332x7684717913, cu2.f0.f303924a.f(feed.getFeedObject().m59249x29422dc()));
                return;
            case 201:
                activity.getClass();
                y4Var.h0(activity, feed);
                return;
            case 202:
                xc2.y2 y2Var = xc2.y2.f534876a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717914 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717914, "getContext(...)");
                activity.getClass();
                y2Var.V(mo55332x7684717914, feed, i18, false);
                return;
            case 207:
                activity.getClass();
                y4Var.f0(activity, feed, i18);
                return;
            case 209:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717915 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717915, "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                r45.dm2 m76806xdef68064 = feed.getFeedObject().getFeedObject().m76806xdef68064();
                if (m76806xdef68064 == null || (tz0Var = (r45.tz0) m76806xdef68064.m75936x14adae67(11)) == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) tz0Var.m75936x14adae67(0)) == null) {
                    return;
                }
                xc2.y2.i(xc2.y2.f534876a, mo55332x7684717915, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
                return;
            case 210:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717916 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717916, "getContext(...)");
                y4Var.j0(mo55332x7684717916, feed, s0Var);
                return;
            case 213:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k2 k2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k2.f183839a;
                k2Var.a(feed.getFeedObject());
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717917 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717917, "getContext(...)");
                k2Var.b(mo55332x7684717917);
                return;
            case 215:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717918 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717918, "getContext(...)");
                y4Var.e0(mo55332x7684717918, feed);
                return;
            case 216:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717919 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717919, "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                r45.dm2 m76806xdef680642 = feed.getFeedObject().getFeedObject().m76806xdef68064();
                if (m76806xdef680642 == null || (m75945x2fec8307 = m76806xdef680642.m75945x2fec8307(46)) == null) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", m75945x2fec8307);
                j45.l.j(mo55332x7684717919, "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            case 218:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717920 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717920, "getContext(...)");
                y4Var.g0(mo55332x7684717920, feed);
                return;
            case 219:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717921 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717921, "getContext(...)");
                y4Var.d0(mo55332x7684717921, feed, s0Var);
                return;
            case 301:
            case 302:
                activity.getClass();
                p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.Q6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) a18, this.f207290g, false, true, false, 8, null);
                return;
            case 305:
                y4Var.L(this.f207290g, true, this.f207287d, this.f207291h, activity.C);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630 /* 306 */:
                y4Var.L(this.f207290g, false, this.f207287d, this.f207291h, activity.C);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8 /* 307 */:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717922 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717922, "getContext(...)");
                p012xc85e97e9.p093xedfae76a.c1 a19 = pf5.z.f435481a.a(mo55332x7684717922).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2) a19).Q6(s0Var, false);
                activity.getClass();
                x3Var.c(activity, "button_minimize", feed.mo2128x1ed62e84(), this.f207291h);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7 /* 308 */:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717923 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717923, "getContext(...)");
                y4Var.I(mo55332x7684717923, feed);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93 /* 309 */:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                float mo56685x3d7f3f1d = (c15196x85976f5f2 == null || (videoView = c15196x85976f5f2.getVideoView()) == null) ? 0.0f : ((float) videoView.mo56685x3d7f3f1d()) / ((float) videoView.mo56695x7723e6ff());
                vn2.u0 u0Var = vn2.u0.f519920a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717924 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717924, "getContext(...)");
                u0Var.a("Finder.FinderFeedSearchUI", "", mo55332x7684717924, this.f207287d, true, true, mo56685x3d7f3f1d);
                return;
            case 312:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717925 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717925, "getContext(...)");
                y4Var.M(mo55332x7684717925, s0Var, feed, activity.S);
                return;
            case 313:
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717926 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717926, "getContext(...)");
                y4Var.K(mo55332x7684717926, feed, s0Var, menuItem);
                return;
            case 403:
                c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717927 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717927, "getContext(...)");
                r45.s02 s02Var = new r45.s02();
                s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
                s02Var.set(3, 1);
                ((b92.d1) zbVar).uj(mo55332x7684717927, s02Var);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717928 = activity.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x7684717928, "getContext(...)");
                r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x7684717928).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                i95.m c18 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb.T8((zy2.zb) c18, ml2.t1.W2, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1")), V6.m75945x2fec8307(1), java.lang.Integer.valueOf(V6.m75939xb282bd08(5)).toString(), null, null, false, 112, null);
                return;
            default:
                o25.y1 y1Var = activity.f207085x0;
                if (y1Var != null) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).aj((db5.h4) menuItem, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.f1(feed, activity, menuItem, i18));
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("quickMenuHelper");
                    throw null;
                }
        }
    }
}
