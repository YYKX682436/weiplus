package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public class a5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d2, com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 f211721d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f211722e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f211723f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea f211724g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 f211725h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f211726i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f211727m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f211728n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f211729o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f211730p;

    /* renamed from: q, reason: collision with root package name */
    public android.content.Context f211731q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f211732r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.a f211733s;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f211721d = presenter;
        this.f211733s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.u4(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        if (h().isSingleMode && l().getFooterMode() == 2) {
            com.p314xaae8f345.mm.ui.ga.L((android.app.Activity) k());
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) this.f211721d).mo979x3f5eee52();
        h().t(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var2;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) this.f211721d).mo979x3f5eee52();
            return;
        }
        if (h().getShowFooter()) {
            l().setVisibility(0);
            android.view.View findViewById = n().findViewById(com.p314xaae8f345.mm.R.id.eal);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            l().setVisibility(8);
            if (h().getCloseComment()) {
                android.view.View findViewById2 = n().findViewById(com.p314xaae8f345.mm.R.id.eal);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                q().setVisibility(8);
                android.view.View r17 = r();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(r17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                r17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p().setVisibility(0);
            } else {
                android.view.View findViewById3 = n().findViewById(com.p314xaae8f345.mm.R.id.eal);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g2 g2Var = this.f211721d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 h17 = h();
        iv2.b feedObj = h().getFeedObj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(feedObj);
        h().m61083x4354fe59();
        int i19 = h().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        boolean z19 = h().isSingleMode;
        long refCommentId = h().getRefCommentId();
        jv2.c replyCommentObj = h().getReplyCommentObj();
        boolean useCache = h().getUseCache();
        boolean blinkRefComment = h().getBlinkRefComment();
        boolean closeComment = h().getCloseComment();
        h().getOldVersion();
        boolean z27 = h().isOnlyShowDesc;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) g2Var;
        q3Var.getClass();
        q3Var.f211916w = false;
        java.lang.System.currentTimeMillis();
        q3Var.f211906m = this;
        q3Var.A = h17;
        q3Var.f211904h = feedObj;
        q3Var.f211911r = z19;
        q3Var.f211905i = i19;
        q3Var.f211913t = refCommentId;
        q3Var.f211912s = useCache;
        q3Var.f211914u = blinkRefComment;
        fp0.t tVar = new fp0.t("UniCommentExecutor");
        q3Var.f211917x = tVar;
        tVar.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.p4 p4Var = q3Var.f211902f;
        android.content.Context context = q3Var.f211900d;
        int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3) this.f211721d).f211905i;
        p4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList5 = p4Var.f211893a;
        if (arrayList5.size() > 0) {
            arrayList5.clear();
        }
        boolean z28 = refCommentId != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.FinderCommentLoader", "miss cache, upContinue:" + z28 + ", downContinue:true");
        q3Var.f211908o = null;
        q3Var.B(z28);
        q3Var.A(true);
        q3Var.f211918y = true;
        q3Var.f211919z = closeComment;
        q3Var.B = z27;
        if (!q3Var.f211909p || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            i18 = 0;
            g(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var3 = q3Var.f211906m;
            if (a5Var3 != null) {
                a5Var3.h().l(true);
            }
        } else {
            g(true);
            i18 = 0;
        }
        l().m61148x710e23e0(i18);
        if (refCommentId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var4 = q3Var.f211906m;
            if (a5Var4 != null) {
                a5Var4.l().h(hc2.t.b(q3Var.f211900d, q3Var.f211905i), feedObj.f376661d, null);
            }
        } else {
            java.util.Iterator it = q3Var.f211902f.f211893a.iterator();
            int i28 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i28 = -1;
                    break;
                } else {
                    if (((jv2.i) it.next()).mo2128x1ed62e84() == refCommentId) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            int i29 = i28;
            if (i29 >= 0) {
                jv2.i iVar = (jv2.i) q3Var.f211902f.f211893a.get(i29);
                iVar.f383760h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var5 = q3Var.f211906m;
                if (a5Var5 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l17 = a5Var5.l();
                    java.lang.String b17 = hc2.t.b(q3Var.f211900d, q3Var.f211905i);
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    l17.g(b17, c61.yb.md((c61.yb) c17, iVar.f383756d.L0(), iVar.f383756d.D0(), false, 4, null), iVar.f383756d);
                }
            }
        }
        if (z27) {
            s().m82688x390c1d00(false);
            s().m82690xd3a27e96(false);
        } else {
            s().m82688x390c1d00(!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7());
            s().m82690xd3a27e96(!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7());
        }
        s().m82555x4905e9fa().mo7966xf161ffec(false);
        q3Var.f211907n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j2(q3Var, s().m82555x4905e9fa());
        q3Var.C.mo48813x58998cd();
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = s().m82555x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.mo8163xed962dec(q3Var.E);
            }
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MusicUni.DrawerPresenter", e17, "", new java.lang.Object[0]);
        }
        s().m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.f3(q3Var));
        l().m61154x8fd5b89a(q3Var);
        l().m61120xdb574fcd().feedId = feedObj.f376663f;
        if (z27) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var6 = q3Var.f211906m;
            android.widget.TextView o17 = a5Var6 != null ? a5Var6.o() : null;
            if (o17 != null) {
                android.content.res.Resources q17 = q3Var.q();
                o17.setText(q17 != null ? q17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cyd) : null);
            }
        } else if (q3Var.i() <= 0) {
            o().setText(k().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cox));
        } else {
            o().setText(k().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpc, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(q3Var.f211905i, q3Var.i())));
        }
        l().m61128x623e5088().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g3(q3Var, this));
        if (replyCommentObj != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l18 = l();
            java.lang.String b18 = hc2.t.b(q3Var.f211900d, q3Var.f211905i);
            i95.m c18 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            l18.g(b18, c61.yb.md((c61.yb) c18, replyCommentObj.L0(), replyCommentObj.D0(), false, 4, null), replyCommentObj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var7 = q3Var.f211906m;
        if ((a5Var7 != null ? a5Var7.l().m61113xd639d394() : null) != null) {
            if (i19 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var8 = q3Var.f211906m;
                ng5.a.a(a5Var8 != null ? a5Var8.l().m61113xd639d394() : null, c01.z1.r());
            } else {
                ya2.b2 b19 = ya2.h.f542017a.b(xy2.c.e(q3Var.f211900d));
                java.lang.String m176700xe5e0d2a0 = b19 != null ? b19.m176700xe5e0d2a0() : "";
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d a17 = g1Var.a();
                mn2.n nVar = new mn2.n(m176700xe5e0d2a0, null, 2, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var9 = q3Var.f211906m;
                android.widget.ImageView m61113xd639d394 = a5Var9 != null ? a5Var9.l().m61113xd639d394() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m61113xd639d394);
                a17.c(nVar, m61113xd639d394, g1Var.h(mn2.f1.f411490h));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var10 = q3Var.f211906m;
        if (a5Var10 != null) {
            a5Var10.p().setVisibility(8);
            a5Var10.r().setOnClickListener(null);
        }
        if (z27) {
            n().setVisibility(0);
            s().setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var11 = q3Var.f211906m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l19 = a5Var11 != null ? a5Var11.l() : null;
            if (l19 != null) {
                l19.setVisibility(8);
            }
            h().m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563074w3);
        } else if (z19) {
            h().m82809x50955ab0(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            h().m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            n().setVisibility(8);
            s().setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 p17 = q3Var.p();
            if (p17 != null) {
                p17.requestFocus();
            }
            if (!q3Var.f211915v && (a5Var = q3Var.f211906m) != null) {
                a5Var.l().m(true);
            }
        } else {
            q3Var.y(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var12 = q3Var.f211906m;
            if (a5Var12 != null) {
                a5Var12.t();
            }
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r().r()).intValue() == 1) {
                h().m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            } else {
                h().m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
            }
            h().m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563074w3);
            s().setVisibility(0);
            n().setVisibility(0);
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a5 a5Var13 = q3Var.f211906m;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l27 = a5Var13 != null ? a5Var13.l() : null;
                if (l27 != null) {
                    l27.setVisibility(8);
                }
            }
        }
        if (q3Var.f211910q || (a5Var2 = q3Var.f211906m) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(a5Var2.s(), null, 1, null);
    }

    public final void g(boolean z17) {
        if (h().isOnlyShowDesc) {
            s().m82690xd3a27e96(false);
            return;
        }
        if (!z17) {
            s().m82690xd3a27e96(false);
            return;
        }
        s().m82690xd3a27e96(true);
        if (s().getRefreshHeader() == null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 s17 = s();
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(k()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d2s, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            s17.m82701x7344efcb(inflate);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15148xe5368540 c15148xe5368540 = this.f211725h;
        if (c15148xe5368540 != null) {
            return c15148xe5368540;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("commentDrawer");
        throw null;
    }

    public final android.content.Context k() {
        android.content.Context context = this.f211731q;
        if (context != null) {
            return context;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea = this.f211724g;
        if (c15151xe87c41ea != null) {
            return c15151xe87c41ea;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerFooter");
        throw null;
    }

    public final android.widget.FrameLayout n() {
        android.widget.FrameLayout frameLayout = this.f211726i;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
        throw null;
    }

    public final android.widget.TextView o() {
        android.widget.TextView textView = this.f211722e;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
        throw null;
    }

    public final android.widget.FrameLayout p() {
        android.widget.FrameLayout frameLayout = this.f211727m;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
        throw null;
    }

    public final android.widget.TextView q() {
        android.widget.TextView textView = this.f211729o;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
        throw null;
    }

    public final android.view.View r() {
        android.view.View view = this.f211730p;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 s() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f211723f;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void t() {
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.TimelineDrawerBuilder", "showLoading return for teen mode.");
            return;
        }
        p().setVisibility(0);
        android.view.View view = this.f211728n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q().setVisibility(8);
        android.view.View r17 = r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
