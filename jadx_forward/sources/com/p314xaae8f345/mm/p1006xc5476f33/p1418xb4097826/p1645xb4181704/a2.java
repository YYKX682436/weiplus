package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public class a2 implements cn5.k {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d f211700d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 f211701e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 f211702f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f211703g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f211704h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f211705i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f211706m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f211707n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 f211708o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f211709p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f211710q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f211711r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f211712s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f211713t;

    /* renamed from: u, reason: collision with root package name */
    public android.content.Context f211714u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f211715v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.l f211716w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.a f211717x;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f211700d = presenter;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 y2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        y2Var.e(1, 10);
        y2Var.e(2, 10);
        this.f211701e = y2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.y2 y2Var2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y2();
        y2Var2.e(1, 10);
        y2Var2.e(2, 10);
        this.f211702f = y2Var2;
        this.f211716w = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.y1(this);
        this.f211717x = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.s1(this);
    }

    @Override // cn5.k
    public void a(float f17) {
    }

    @Override // cn5.k
    public void b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) this.f211700d).j();
        e().f295092s.remove(this);
    }

    @Override // cn5.k
    public void c(boolean z17, boolean z18, int i17) {
        boolean z19;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var2;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) this.f211700d).j();
            return;
        }
        if (e().getShowFooter()) {
            f().setVisibility(0);
            android.view.View findViewById = g().findViewById(com.p314xaae8f345.mm.R.id.eal);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            f().setVisibility(8);
            if (e().getCloseComment()) {
                android.view.View findViewById2 = g().findViewById(com.p314xaae8f345.mm.R.id.eal);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View i18 = i();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(i18, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(i18, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View j17 = j();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(j17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showCommentClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup viewGroup = this.f211703g;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                h().setVisibility(0);
            } else {
                android.view.View findViewById3 = g().findViewById(com.p314xaae8f345.mm.R.id.eal);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onDrawerOpen", "(ZZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d dVar = this.f211700d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 e17 = e();
        iv2.a feedObj = e().getFeedObj();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(feedObj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c onCloseDrawerCallback = e().getOnCloseDrawerCallback();
        int i19 = e().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String();
        boolean z27 = e().isSingleMode;
        long refCommentId = e().getRefCommentId();
        jv2.a replyCommentObj = e().getReplyCommentObj();
        boolean useCache = e().getUseCache();
        boolean blinkRefComment = e().getBlinkRefComment();
        e().getCloseComment();
        e().getOldVersion();
        boolean z28 = e().isOnlyShowDesc;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) dVar;
        o0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "onAttach: userName=" + feedObj.f376652b + ", statusId=" + feedObj.f376651a);
        o0Var.f211874z = false;
        java.lang.System.currentTimeMillis();
        o0Var.f211863o = this;
        o0Var.C = e17;
        o0Var.f211861m = feedObj;
        o0Var.f211869u = z27;
        o0Var.f211862n = i19;
        o0Var.f211865q = onCloseDrawerCallback;
        o0Var.f211871w = refCommentId;
        o0Var.f211870v = useCache;
        o0Var.f211872x = blinkRefComment;
        fp0.t tVar = new fp0.t("TextStatusCommentExecutor");
        o0Var.A = tVar;
        tVar.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var = o0Var.f211859h;
        android.content.Context context = o0Var.f211855d;
        int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0) this.f211700d).f211862n;
        o1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList6 = o1Var.f211875a;
        if (arrayList6.size() > 0) {
            arrayList6.clear();
        }
        boolean z29 = refCommentId != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentLoader", "miss cache, upContinue:" + z29 + ", downContinue:true");
        o0Var.f211866r = null;
        o0Var.m(z29);
        o0Var.l(true);
        o0Var.B = true;
        if (o0Var.f211867s) {
            d(true);
        } else {
            d(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var3 = o0Var.f211863o;
            if (a2Var3 != null) {
                a2Var3.e().f295084h.m82860xad1bd797(true);
            }
        }
        f().m61053x710e23e0(0);
        if (refCommentId == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var4 = o0Var.f211863o;
            if (a2Var4 != null) {
                a2Var4.f().h(hc2.t.b(o0Var.f211855d, o0Var.f211862n), feedObj.f376655e, null);
            }
        } else {
            java.util.Iterator it = o0Var.f211859h.f211875a.iterator();
            int i28 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i28 = -1;
                    break;
                } else {
                    if (((jv2.d) it.next()).mo2128x1ed62e84() == refCommentId) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            int i29 = i28;
            if (i29 >= 0) {
                jv2.d dVar2 = (jv2.d) o0Var.f211859h.f211875a.get(i29);
                dVar2.f383745i = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var5 = o0Var.f211863o;
                if (a2Var5 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f17 = a2Var5.f();
                    java.lang.String b17 = hc2.t.b(o0Var.f211855d, o0Var.f211862n);
                    i95.m c17 = i95.n0.c(c61.yb.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    f17.g(b17, c61.yb.md((c61.yb) c17, dVar2.f383740d.D0(), dVar2.f383740d.y0(), false, 4, null), dVar2.f383740d);
                }
            }
        }
        if (z28) {
            z19 = false;
            k().m82688x390c1d00(false);
            k().m82690xd3a27e96(false);
        } else {
            z19 = false;
            k().m82688x390c1d00(true);
            k().m82690xd3a27e96(true);
        }
        k().m82555x4905e9fa().mo7966xf161ffec(z19);
        o0Var.f211864p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g(o0Var, k().m82555x4905e9fa());
        o0Var.E.mo48813x58998cd();
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = k().m82555x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.mo8163xed962dec(o0Var.G);
            }
        } catch (java.lang.IllegalStateException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", e18, "", new java.lang.Object[0]);
        }
        k().m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.c0(o0Var));
        f().m61060x8fd5b89a(o0Var);
        f().m61024xdb574fcd().feedId = feedObj.f376656f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f18 = f();
        java.lang.String feedUserName = feedObj.f376652b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedUserName, "feedUserName");
        f18.mFeedUserName = feedUserName;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 m61024xdb574fcd = f().m61024xdb574fcd();
        if (m61024xdb574fcd != null) {
            iu2.a aVar = iu2.a.f376516a;
            java.lang.String key = feedObj.f376651a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDraftCache", "getDraft() called with: key = ".concat(key));
            java.lang.String str = (java.lang.String) iu2.a.f376517b.get(key);
            if (str != null) {
                m61024xdb574fcd.setText(str);
                m61024xdb574fcd.mo81549xf579a34a(m61024xdb574fcd.getText().length());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    f().m61075x6435bedc(true);
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).ij(m61024xdb574fcd.getContext(), 19L, "", feedObj.f376652b);
                }
            }
        }
        android.widget.TextView textView = this.f211704h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTv");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var6 = o0Var.f211863o;
        if (a2Var6 != null) {
            android.content.Context context2 = a2Var6.f211714u;
            if (context2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            resources = context2.getResources();
        } else {
            resources = null;
        }
        textView.setText(resources != null ? resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jus) : null);
        android.widget.TextView textView2 = this.f211705i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerSubTitleTv");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var7 = o0Var.f211863o;
        if (a2Var7 != null) {
            android.content.Context context3 = a2Var7.f211714u;
            if (context3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            resources2 = context3.getResources();
        } else {
            resources2 = null;
        }
        textView2.setText(resources2 != null ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jur) : null);
        f().m61033x623e5088().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.d0(o0Var, this, feedObj));
        if (replyCommentObj != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f19 = f();
            java.lang.String b18 = hc2.t.b(o0Var.f211855d, o0Var.f211862n);
            i95.m c18 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            f19.g(b18, c61.yb.md((c61.yb) c18, replyCommentObj.D0(), replyCommentObj.y0(), false, 4, null), replyCommentObj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var8 = o0Var.f211863o;
        if ((a2Var8 != null ? a2Var8.f().m61017xd639d394() : null) != null && i19 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var9 = o0Var.f211863o;
            ng5.a.a(a2Var9 != null ? a2Var9.f().m61017xd639d394() : null, c01.z1.r());
        }
        if (z28) {
            g().setVisibility(0);
            k().setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var10 = o0Var.f211863o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f27 = a2Var10 != null ? a2Var10.f() : null;
            if (f27 != null) {
                f27.setVisibility(8);
            }
            e().m82849x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563074w3);
        } else if (z27) {
            e().m82849x50955ab0(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            e().m82842x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            g().setVisibility(8);
            k().setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g17 = o0Var.g();
            if (g17 != null) {
                g17.requestFocus();
            }
            if (!o0Var.f211873y && (a2Var = o0Var.f211863o) != null) {
                a2Var.f().m(true);
            }
        } else {
            o0Var.k(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var11 = o0Var.f211863o;
            if (a2Var11 != null) {
                a2Var11.l();
            }
            if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.r().r()).intValue() == 1) {
                e().m82842x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            } else {
                e().m82842x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92);
            }
            e().m82849x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563074w3);
            k().setVisibility(0);
            g().setVisibility(0);
        }
        if (o0Var.f211868t || (a2Var2 = o0Var.f211863o) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(a2Var2.k(), null, 1, null);
    }

    public final void d(boolean z17) {
        if (e().isOnlyShowDesc) {
            k().m82690xd3a27e96(false);
            return;
        }
        if (!z17) {
            k().m82690xd3a27e96(false);
            return;
        }
        k().m82690xd3a27e96(true);
        if (k().getRefreshHeader() == null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 k17 = k();
            android.content.Context context = this.f211714u;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571102d05, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            k17.m82701x7344efcb(inflate);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1 = this.f211708o;
        if (c15144x165092d1 != null) {
            return c15144x165092d1;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("commentDrawer");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = this.f211707n;
        if (c15147x19964f7b != null) {
            return c15147x19964f7b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerFooter");
        throw null;
    }

    public final android.widget.FrameLayout g() {
        android.widget.FrameLayout frameLayout = this.f211709p;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
        throw null;
    }

    public final android.widget.FrameLayout h() {
        android.widget.FrameLayout frameLayout = this.f211710q;
        if (frameLayout != null) {
            return frameLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
        throw null;
    }

    public final android.view.View i() {
        android.view.View view = this.f211712s;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nothingView");
        throw null;
    }

    public final android.view.View j() {
        android.view.View view = this.f211713t;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 k() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f211706m;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final void l() {
        h().setVisibility(0);
        android.view.View view = this.f211711r;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View i17 = i();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(i17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(i17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View j17 = j();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(j17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(j17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
