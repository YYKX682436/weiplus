package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class tx implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f190644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f190646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f190647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f190648h;

    public tx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, yz5.a aVar, in5.s0 s0Var, int i17) {
        this.f190644d = pzVar;
        this.f190645e = abstractC14490x69736cb5;
        this.f190646f = aVar;
        this.f190647g = s0Var;
        this.f190648h = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String m75945x2fec8307;
        jz5.f0 f0Var;
        cw2.da videoView;
        r45.q23 m76980xaa7f977e;
        r45.tz0 tz0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f190644d;
        java.lang.String str = pzVar.U;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getMoreMenuItemSelectedListener] feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f190645e;
        sb6.append(feed);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(" menuItem:");
        sb6.append(menuItem.getItemId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.a aVar = this.f190646f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        if (itemId == 215) {
            y4Var.e0(pzVar.f190288g, feed);
            return;
        }
        if (itemId == 216) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = pzVar.f190288g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            r45.dm2 m76806xdef68064 = feed.getFeedObject().getFeedObject().m76806xdef68064();
            if (m76806xdef68064 == null || (m75945x2fec8307 = m76806xdef68064.m75945x2fec8307(46)) == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", m75945x2fec8307);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (itemId == 218) {
            y4Var.g0(pzVar.f190288g, feed);
            return;
        }
        in5.s0 s0Var = this.f190647g;
        if (itemId == 219) {
            y4Var.d0(pzVar.f190288g, feed, s0Var);
            return;
        }
        if (itemId == 301 || itemId == 302) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = pzVar.f190288g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.Q6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) a17, this.f190647g, false, true, false, 8, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a;
        if (itemId == 99) {
            java.util.List<E> m56392xfc5c33e5 = pzVar.C.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class);
            int indexOf = m56392xfc5c33e5.indexOf(feed);
            if (indexOf < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "[not interested] pos error=" + indexOf + ", feed=" + feed + ", dataList=" + m56392xfc5c33e5);
                return;
            }
            boolean z17 = feed instanceof so2.h1;
            bd2.r rVar = bd2.r.f100817a;
            rVar.e(pzVar.f190288g, feed.getFeedObject().m59251x5db1b11(), feed.w(), feed.getFeedObject().m59276x6c285d75(), feed.getFeedObject().m59311x25315bf4(), this.f190647g);
            if (!rVar.b() && z17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5681x10014e2 c5681x10014e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5681x10014e2();
                c5681x10014e2.f136007g.f89914a = feed.mo2128x1ed62e84();
                c5681x10014e2.e();
            }
            pzVar.getClass();
            if (feed.getFeedObject().m59311x25315bf4()) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context2 = pzVar.f190288g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.t1 t1Var = ml2.t1.f409467a2;
                jz5.l[] lVarArr = new jz5.l[3];
                r45.nw1 m59258xd0557130 = feed.getFeedObject().m59258xd0557130();
                lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null));
                lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(feed.getFeedObject().getFeedObject().m76784x5db1b11()));
                lVarArr[2] = new jz5.l("panel_sence", "1");
                zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), V6 != null ? V6.m75945x2fec8307(1) : null, java.lang.String.valueOf(V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null), feed.g0(), null, false, 96, null);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_uninterest_clk", s0Var.f3639x46306858, null, 24617);
            x3Var.c(pzVar.f190288g, "button_uninterested", feed.mo2128x1ed62e84(), this.f190648h);
            return;
        }
        if (itemId == 116) {
            if (pzVar.f190292m != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
                if (p17 != null) {
                    arrayList.add(p17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                cw2.da videoView2 = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView2 : null;
                if (c15188xd8bd4bd != null) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity2 = pzVar.f190288g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                    p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.a7((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) a18, s0Var, arrayList, c15188xd8bd4bd, null, null, null, 56, null);
                }
            }
            x3Var.c(pzVar.f190288g, "button_speedplay", feed.mo2128x1ed62e84(), this.f190648h);
            return;
        }
        if (itemId == 213) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k2 k2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k2.f183839a;
            k2Var.a(feed.getFeedObject());
            k2Var.b(pzVar.f190288g);
            return;
        }
        if (itemId == 312) {
            y4Var.M(pzVar.f190288g, s0Var, feed, pzVar.F);
            return;
        }
        if (itemId == 313) {
            y4Var.K(pzVar.f190288g, feed, s0Var, menuItem);
            return;
        }
        switch (itemId) {
            case 305:
                y4Var.L(this.f190647g, true, this.f190645e, this.f190648h, pzVar.C.m56388xcaeb60d0());
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630 /* 306 */:
                y4Var.L(this.f190647g, false, this.f190645e, this.f190648h, pzVar.C.m56388xcaeb60d0());
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8 /* 307 */:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar.f190289h;
                if (abstractC15124x7bae6180 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th) pf5.z.f435481a.b(abstractC15124x7bae6180).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th.class);
                    if (thVar != null) {
                        thVar.f217563i = true;
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity3 = pzVar.f190288g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th thVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th) pf5.z.f435481a.a(activity3).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.th.class);
                    if (thVar2 != null) {
                        thVar2.f217563i = true;
                    }
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity4 = pzVar.f190288g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2) pf5.z.f435481a.a(activity4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f2.class)).Q6(s0Var, false);
                x3Var.c(pzVar.f190288g, "button_minimize", feed.mo2128x1ed62e84(), this.f190648h);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54457x5e52d6e7 /* 308 */:
                y4Var.I(pzVar.f190288g, feed);
                return;
            case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54463x110bac93 /* 309 */:
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                vn2.u0.f519920a.a(pzVar.U, "", pzVar.f190288g, this.f190645e, true, true, (c15196x85976f5f2 == null || (videoView = c15196x85976f5f2.getVideoView()) == null) ? 0.0f : ((float) videoView.mo56685x3d7f3f1d()) / ((float) videoView.mo56695x7723e6ff()));
                return;
            default:
                switch (itemId) {
                    case 403:
                        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pzVar.f190288g;
                        r45.s02 s02Var = new r45.s02();
                        s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
                        s02Var.set(3, 1);
                        ((b92.d1) zbVar2).uj(abstractActivityC21394xb3d2c0cf, s02Var);
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity5 = pzVar.f190288g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
                        r45.qt2 V62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity5).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                        i95.m c18 = i95.n0.c(zy2.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        zy2.zb.T8((zy2.zb) c18, ml2.t1.W2, kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "1")), V62.m75945x2fec8307(1), java.lang.Integer.valueOf(V62.m75939xb282bd08(5)).toString(), null, null, false, 112, null);
                        return;
                    case 404:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "start live feed danmaku close");
                        zl2.q4.f555466a.J(pzVar.f190288g, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rx(pzVar, feed));
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context3 = pzVar.f190288g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        r45.qt2 V63 = nyVar2 != null ? nyVar2.V6() : null;
                        i95.m c19 = i95.n0.c(zy2.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        zy2.zb zbVar3 = (zy2.zb) c19;
                        ml2.t1 t1Var2 = ml2.t1.f409470b3;
                        jz5.l[] lVarArr2 = new jz5.l[2];
                        r45.nw1 m59258xd05571302 = feed.getFeedObject().m59258xd0557130();
                        lVarArr2[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd05571302 != null ? java.lang.Long.valueOf(m59258xd05571302.m75942xfb822ef2(0)) : null));
                        lVarArr2[1] = new jz5.l("status_type", "0");
                        zy2.zb.T8(zbVar3, t1Var2, kz5.c1.l(lVarArr2), V63 != null ? V63.m75945x2fec8307(1) : null, java.lang.String.valueOf(V63 != null ? java.lang.Integer.valueOf(V63.m75939xb282bd08(5)) : null), feed.g0(), null, false, 96, null);
                        return;
                    case 405:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "start live feed danmaku open");
                        zl2.q4.f555466a.J(pzVar.f190288g, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qx(pzVar, feed));
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context4 = pzVar.f190288g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context4).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        r45.qt2 V64 = nyVar3 != null ? nyVar3.V6() : null;
                        i95.m c27 = i95.n0.c(zy2.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        zy2.zb zbVar4 = (zy2.zb) c27;
                        ml2.t1 t1Var3 = ml2.t1.f409470b3;
                        jz5.l[] lVarArr3 = new jz5.l[2];
                        r45.nw1 m59258xd05571303 = feed.getFeedObject().m59258xd0557130();
                        lVarArr3[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd05571303 != null ? java.lang.Long.valueOf(m59258xd05571303.m75942xfb822ef2(0)) : null));
                        lVarArr3[1] = new jz5.l("status_type", "1");
                        zy2.zb.T8(zbVar4, t1Var3, kz5.c1.l(lVarArr3), V64 != null ? V64.m75945x2fec8307(1) : null, java.lang.String.valueOf(V64 != null ? java.lang.Integer.valueOf(V64.m75939xb282bd08(5)) : null), feed.g0(), null, false, 96, null);
                        return;
                    case 406:
                        y4Var.U(pzVar.f190288g, feed.mo2128x1ed62e84());
                        return;
                    default:
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
                        switch (itemId) {
                            case 101:
                                if (zl2.q4.f555466a.C(feed)) {
                                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context5 = pzVar.f190288g;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context5, "context");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context5).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                    r45.qt2 V65 = nyVar4 != null ? nyVar4.V6() : null;
                                    i95.m c28 = i95.n0.c(zy2.zb.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                                    zy2.zb zbVar5 = (zy2.zb) c28;
                                    ml2.t1 t1Var4 = ml2.t1.f409469b2;
                                    jz5.l[] lVarArr4 = new jz5.l[3];
                                    r45.nw1 m59258xd05571304 = feed.getFeedObject().m59258xd0557130();
                                    lVarArr4[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd05571304 != null ? java.lang.Long.valueOf(m59258xd05571304.m75942xfb822ef2(0)) : null));
                                    lVarArr4[1] = new jz5.l("feedId", pm0.v.u(feed.getFeedObject().getFeedObject().m76784x5db1b11()));
                                    lVarArr4[2] = new jz5.l("panel_sence", "1");
                                    zy2.zb.T8(zbVar5, t1Var4, kz5.c1.l(lVarArr4), V65 != null ? V65.m75945x2fec8307(1) : null, java.lang.String.valueOf(V65 != null ? java.lang.Integer.valueOf(V65.m75939xb282bd08(5)) : null), feed.g0(), null, false, 96, null);
                                    r45.nw1 m59258xd05571305 = feed.getFeedObject().m59258xd0557130();
                                    if (m59258xd05571305 != null) {
                                        long m75942xfb822ef2 = m59258xd05571305.m75942xfb822ef2(0);
                                        bd2.b bVar = bd2.b.f100777a;
                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity6 = pzVar.f190288g;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity6, "activity");
                                        bVar.j(activity6, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), m75942xfb822ef2, feed.getFeedObject().m59299x6bf53a6c(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : feed);
                                    }
                                } else {
                                    bd2.b.c(bd2.b.f100777a, pzVar.f190288g, this.f190645e, 0L, 0, 12, null);
                                }
                                x3Var.c(pzVar.f190288g, "button_complaint", feed.mo2128x1ed62e84(), this.f190648h);
                                return;
                            case 102:
                                android.os.Bundle bundle = new android.os.Bundle();
                                feed.getClass();
                                int i18 = this.f190648h;
                                c61.zb zbVar6 = (c61.zb) i95.n0.c(c61.zb.class);
                                ml2.t1 t1Var5 = ml2.t1.f409487i;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity7 = pzVar.f190288g;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity7, "activity");
                                ((b92.d1) zbVar6).rj(t1Var5, feed, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity7).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
                                n7Var.B(pzVar.f190288g, feed.getFeedObject(), bundle, 3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.sx(feed, pzVar));
                                x3Var.c(pzVar.f190288g, "button_forward_friend", feed.mo2128x1ed62e84(), i18);
                                return;
                            case 103:
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.F(n7Var, pzVar.f190288g, this.f190645e, null, 0, 0, 28, null);
                                if (feed.getFeedObject().m59311x25315bf4()) {
                                    vs5.a aVar2 = vs5.a.f521457a;
                                    r45.nw1 m59258xd05571306 = feed.getFeedObject().m59258xd0557130();
                                    java.lang.String valueOf = java.lang.String.valueOf(m59258xd05571306 != null ? java.lang.Long.valueOf(m59258xd05571306.m75942xfb822ef2(0)) : null);
                                    java.lang.String valueOf2 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().m76784x5db1b11());
                                    java.lang.String m76836x6c03c64c = feed.getFeedObject().getFeedObject().m76836x6c03c64c();
                                    java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1;
                                    aVar2.a(valueOf, valueOf2, m76836x6c03c64c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1, "2", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : feed.g0());
                                }
                                x3Var.c(pzVar.f190288g, "button_forward_friendcircle", feed.mo2128x1ed62e84(), this.f190648h);
                                c61.zb zbVar7 = (c61.zb) i95.n0.c(c61.zb.class);
                                ml2.t1 t1Var6 = ml2.t1.f409497m;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity8 = pzVar.f190288g;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity8, "activity");
                                ((b92.d1) zbVar7).rj(t1Var6, feed, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity8).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
                                return;
                            case 104:
                                so2.v0.b(so2.v0.f492177a, this.f190645e, pzVar.f190288g, null, null, 12, null);
                                i95.m c29 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Rk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c29, pzVar.f190288g, true, feed.mo2128x1ed62e84(), false, 8, null);
                                return;
                            default:
                                switch (itemId) {
                                    case 106:
                                        cu2.m.f303953a.b(pzVar.f190288g, feed, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.lx(pzVar));
                                        return;
                                    case 107:
                                        cu2.m.f303953a.b(pzVar.f190288g, feed, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kx(pzVar));
                                        return;
                                    case 108:
                                        if (feed.e()) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.R(y4Var, pzVar.f190288g, this.f190645e, 0, null, 12, null);
                                            return;
                                        }
                                        return;
                                    case 109:
                                        y4Var.S(pzVar.f190288g, this.f190645e, this.f190647g, this.f190648h, pzVar.f190295p);
                                        return;
                                    default:
                                        switch (itemId) {
                                            case 112:
                                                android.content.Intent intent2 = new android.content.Intent();
                                                intent2.putExtra("KEY_FROM_SCENE", 1);
                                                intent2.putExtra("KEY_USERNAME", xy2.c.e(pzVar.f190288g));
                                                intent2.putExtra("KEY_FINDER_SELF_FLAG", true);
                                                intent2.putExtra("KEY_IS_FULLSCREEN", true);
                                                intent2.putExtra("KEY_ENABLE_SWITCH_PREVIEW_MODE", false);
                                                hc2.e0.b(intent2, 0, kz5.b0.c(feed), null, null);
                                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).al(pzVar.f190288g, intent2);
                                                return;
                                            case 113:
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.H(n7Var, pzVar.f190288g, this.f190645e, null, 0, 12, null);
                                                x3Var.c(pzVar.f190288g, "textstatus_in_menu", feed.mo2128x1ed62e84(), this.f190648h);
                                                if (feed.getFeedObject().m59311x25315bf4()) {
                                                    vs5.a aVar3 = vs5.a.f521457a;
                                                    r45.nw1 m59258xd05571307 = feed.getFeedObject().m59258xd0557130();
                                                    java.lang.String valueOf3 = java.lang.String.valueOf(m59258xd05571307 != null ? java.lang.Long.valueOf(m59258xd05571307.m75942xfb822ef2(0)) : null);
                                                    java.lang.String valueOf4 = java.lang.String.valueOf(feed.getFeedObject().getFeedObject().m76784x5db1b11());
                                                    java.lang.String m76836x6c03c64c2 = feed.getFeedObject().getFeedObject().m76836x6c03c64c();
                                                    java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1;
                                                    aVar3.a(valueOf3, valueOf4, m76836x6c03c64c2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.D1, "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                                                }
                                                c61.zb zbVar8 = (c61.zb) i95.n0.c(c61.zb.class);
                                                ml2.t1 t1Var7 = ml2.t1.f409500n;
                                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity9 = pzVar.f190288g;
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity9, "activity");
                                                ((b92.d1) zbVar8).rj(t1Var7, feed, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity9).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
                                                return;
                                            case 114:
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) s0Var.p(com.p314xaae8f345.mm.R.id.ghd);
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15178x4303ff90);
                                                cw2.ca.d(c15178x4303ff90, null, false, 3, null);
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y5.f184249a.d(pzVar.f190288g, this.f190645e, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : this.f190647g, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mx(c15178x4303ff90, pzVar));
                                                x3Var.c(pzVar.f190288g, "button_set_bell", feed.mo2128x1ed62e84(), this.f190648h);
                                                return;
                                            default:
                                                switch (itemId) {
                                                    case 118:
                                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = feed.getFeedObject().getFeedObject().m76802x2dd01666();
                                                        r45.q23 m76980xaa7f977e2 = m76802x2dd01666 != null ? m76802x2dd01666.m76980xaa7f977e() : null;
                                                        if (m76980xaa7f977e2 == null) {
                                                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = pzVar.f190288g;
                                                            db5.t7.g(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0c));
                                                        } else {
                                                            android.content.Intent intent3 = new android.content.Intent();
                                                            int i19 = m76980xaa7f977e2.f465119e;
                                                            int i27 = i19 != 1 ? i19 != 3 ? -1 : 16 : 13;
                                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                                                            p2Var.W(p2Var.i(pzVar.f190288g, 53, false));
                                                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                                                            jSONObject.put("shoot_same_feedid", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ui(feed.getFeedObject().getFeedObject().m76784x5db1b11()));
                                                            java.lang.String jSONObject2 = jSONObject.toString();
                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                                            p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
                                                            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                                                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = pzVar.f190288g;
                                                            intent3.putExtra("key_maas_entrance", 5);
                                                            intent3.putExtra("key_ref_feed_id", feed.getFeedObject().getFeedObject().m76784x5db1b11());
                                                            intent3.putExtra("key_ref_feed_dup_flag", feed.w());
                                                            intent3.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
                                                            intent3.putExtra("KEY_FINDER_TARGET_TEMPLATE_ID", m76980xaa7f977e2.f465118d);
                                                            intent3.putExtra("KEY_FINDER_TARGET_TEMPLATE_TYPE", m76980xaa7f977e2.f465119e);
                                                            ((c61.l7) b6Var).tj(abstractActivityC21394xb3d2c0cf3, m76980xaa7f977e2, intent3, i27);
                                                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.L(p2Var, pzVar.f190288g, 93, m76980xaa7f977e2, 0L, 0, 24, null);
                                                        }
                                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity10 = pzVar.f190288g;
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity10, "activity");
                                                        r45.qt2 V66 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity10).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
                                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                                                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = feed.getFeedObject().getFeedObject().m76802x2dd01666();
                                                        java.lang.Object obj = (m76802x2dd016662 == null || (m76980xaa7f977e = m76802x2dd016662.m76980xaa7f977e()) == null) ? null : m76980xaa7f977e.f465118d;
                                                        if (obj == null) {
                                                            obj = 0;
                                                        }
                                                        jSONObject3.put("templateId", obj);
                                                        b6Var2.c(V66, "shoot_same_video", true, jSONObject3);
                                                        return;
                                                    case 119:
                                                        y4Var.X(pzVar.f190288g, feed);
                                                        return;
                                                    case 120:
                                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity11 = pzVar.f190288g;
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity11, "activity");
                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                                                        fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                                                        byte[] mo14344x5f01b1f6 = feed.getFeedObject().getFeedObject().mo14344x5f01b1f6();
                                                        ((ee0.n4) k4Var).getClass();
                                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                                        if (mo14344x5f01b1f6 == null) {
                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                                            return;
                                                        } else {
                                                            je4.a.f380848a.a(activity11, 2, mo14344x5f01b1f6, 0, 9);
                                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                                                            return;
                                                        }
                                                    case 121:
                                                        y4Var.Q(pzVar.f190288g, feed);
                                                        return;
                                                    default:
                                                        int i28 = this.f190648h;
                                                        switch (itemId) {
                                                            case 200:
                                                                y4Var.Y(feed, pzVar.f190288g, cu2.f0.f303924a.f(feed.getFeedObject().m59249x29422dc()));
                                                                return;
                                                            case 201:
                                                                y4Var.h0(pzVar.f190288g, feed);
                                                                return;
                                                            case 202:
                                                                xc2.y2 y2Var = xc2.y2.f534876a;
                                                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = pzVar.f190288g;
                                                                pzVar.getClass();
                                                                y2Var.V(abstractActivityC21394xb3d2c0cf4, feed, i28, false);
                                                                return;
                                                            default:
                                                                switch (itemId) {
                                                                    case 207:
                                                                        y4Var.f0(pzVar.f190288g, feed, i28);
                                                                        return;
                                                                    case 208:
                                                                        n7Var.I(pzVar.f190288g, feed.getFeedObject());
                                                                        return;
                                                                    case 209:
                                                                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context6 = pzVar.f190288g;
                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context6, "context");
                                                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
                                                                        r45.dm2 m76806xdef680642 = feed.getFeedObject().getFeedObject().m76806xdef68064();
                                                                        if (m76806xdef680642 == null || (tz0Var = (r45.tz0) m76806xdef680642.m75936x14adae67(11)) == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) tz0Var.m75936x14adae67(0)) == null) {
                                                                            return;
                                                                        }
                                                                        xc2.y2.i(xc2.y2.f534876a, context6, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
                                                                        return;
                                                                    case 210:
                                                                        y4Var.j0(pzVar.f190288g, feed, s0Var);
                                                                        return;
                                                                    default:
                                                                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) pzVar.f190299r).aj((db5.h4) menuItem, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.px(feed, pzVar, menuItem, i28));
                                                                        return;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
