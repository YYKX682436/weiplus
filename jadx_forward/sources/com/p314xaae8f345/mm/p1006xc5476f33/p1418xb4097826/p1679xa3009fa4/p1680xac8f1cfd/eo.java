package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class eo extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements js4.p {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f215815d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f215816e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f215817f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f215818g;

    /* renamed from: h, reason: collision with root package name */
    public r45.j71 f215819h;

    /* renamed from: i, reason: collision with root package name */
    public r45.e8 f215820i;

    /* renamed from: m, reason: collision with root package name */
    public int f215821m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f215818g = new java.util.ArrayList();
        this.f215819h = new r45.j71();
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar, java.lang.String str) {
        eoVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("allow_mix_content_mode", false);
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        j45.l.j(eoVar.m80379x76847179(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar) {
        java.lang.String str;
        r45.gs2 gs2Var;
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f217343d.m75936x14adae67(9);
        if (v11Var == null || (gs2Var = (r45.gs2) v11Var.m75936x14adae67(5)) == null || (str = gs2Var.m75945x2fec8307(7)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "#openRealNameNewAuth, verifyUrl:".concat(str));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", str);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(eoVar.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54057xa587db98);
    }

    public static final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar) {
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f217343d.m75936x14adae67(9);
        if (v11Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(eoVar.m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zn(eoVar, v11Var, null), 3, null);
        }
    }

    public static final boolean R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar) {
        java.lang.String str;
        r45.gs2 gs2Var;
        r45.gs2 gs2Var2;
        r45.gs2 gs2Var3;
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f217343d.m75936x14adae67(9);
        boolean m75933x41a8a7f2 = (v11Var == null || (gs2Var3 = (r45.gs2) v11Var.m75936x14adae67(5)) == null) ? false : gs2Var3.m75933x41a8a7f2(5);
        r45.mw1 mw1Var = rnVar.f217343d;
        r45.v11 v11Var2 = (r45.v11) mw1Var.m75936x14adae67(9);
        int m75939xb282bd08 = (v11Var2 == null || (gs2Var2 = (r45.gs2) v11Var2.m75936x14adae67(5)) == null) ? 0 : gs2Var2.m75939xb282bd08(6);
        r45.v11 v11Var3 = (r45.v11) mw1Var.m75936x14adae67(9);
        if (v11Var3 == null || (gs2Var = (r45.gs2) v11Var3.m75936x14adae67(5)) == null || (str = gs2Var.m75945x2fec8307(7)) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "#shouldOpenRealNameNewAuth, hasRealnameAuth:" + m75933x41a8a7f2 + ", authType:" + m75939xb282bd08 + ", verifyUrl:" + str);
        return !m75933x41a8a7f2 && m75939xb282bd08 == 1 && str.length() > 0;
    }

    public static final boolean S6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar) {
        r45.gs2 gs2Var;
        eoVar.getClass();
        r45.v11 v11Var = (r45.v11) rnVar.f217343d.m75936x14adae67(9);
        return (v11Var == null || (gs2Var = (r45.gs2) v11Var.m75936x14adae67(5)) == null || gs2Var.m75939xb282bd08(6) != 2 || gs2Var.m75939xb282bd08(8) == 1) ? false : true;
    }

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo eoVar, long j17, android.view.View view, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar) {
        java.math.BigDecimal bigDecimal;
        java.lang.String obj;
        eoVar.getClass();
        if (j17 <= 0) {
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC$FinderLiveIncomePageItemData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zl2.q4 q4Var = zl2.q4.f555466a;
        java.lang.String u17 = pm0.v.u(j17);
        java.math.RoundingMode roundingMode = java.math.RoundingMode.HALF_UP;
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(u17, 0.0d) == 0.0d) {
                obj = "0";
            } else {
                int length = u17.length() - 1;
                int i17 = 0;
                boolean z17 = false;
                while (i17 <= length) {
                    boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(u17.charAt(!z17 ? i17 : length), 32) <= 0;
                    if (z17) {
                        if (!z18) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z18) {
                        i17++;
                    } else {
                        z17 = true;
                    }
                }
                obj = u17.subSequence(i17, length + 1).toString();
            }
            java.math.BigDecimal bigDecimal2 = new java.math.BigDecimal(obj);
            int i18 = 2;
            int i19 = 0;
            boolean z19 = false;
            while (i19 <= i18) {
                boolean z27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i("100".charAt(!z19 ? i19 : i18), 32) <= 0;
                if (z19) {
                    if (!z27) {
                        break;
                    } else {
                        i18--;
                    }
                } else if (z27) {
                    i19++;
                } else {
                    z19 = true;
                }
            }
            bigDecimal = bigDecimal2.divide(new java.math.BigDecimal("100".subSequence(i19, i18 + 1).toString()), 2, roundingMode);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderUtil2", e17, "", new java.lang.Object[0]);
            bigDecimal = new java.math.BigDecimal(0);
        }
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{bigDecimal != null ? java.lang.Double.valueOf(bigDecimal.doubleValue()) : null}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        if (textView != null) {
            textView.setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3y, format));
        }
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.Cdo(eoVar, rnVar));
        }
    }

    public final void U6() {
        int i17;
        android.content.res.Resources resources;
        int i18;
        ae2.in.f85221a.l();
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564598vo);
        if (mo144222x4ff8c0f0 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564597vn);
        android.widget.TextView textView = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564599vp);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564596vm);
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f564595vl);
        r45.e8 e8Var = this.f215820i;
        if (e8Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = e8Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) e8Var.m75936x14adae67(2) : null;
            if (c19786x6a1e2862 != null) {
                java.lang.String m76501xf2fd2296 = c19786x6a1e2862.m76501xf2fd2296();
                if (!(m76501xf2fd2296 == null || m76501xf2fd2296.length() == 0)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_ID_STRING_SYNC;
                    java.lang.String v17 = c17.v(u3Var, "");
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_FETCH_TIME_INT_SYNC;
                    int r17 = c18.r(u3Var2, 0);
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LAST_INCOME_ANNOUNCEMENT_CLICK_BOOLEAN_SYNC;
                    boolean o17 = c19.o(u3Var3, false);
                    int e17 = c01.id.e();
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v17, c19786x6a1e2862.m76501xf2fd2296())) {
                        i17 = 0;
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c27 = gm0.j1.u().c();
                        java.lang.String m76501xf2fd22962 = c19786x6a1e2862.m76501xf2fd2296();
                        if (m76501xf2fd22962 == null) {
                            m76501xf2fd22962 = "";
                        }
                        c27.x(u3Var, m76501xf2fd22962);
                        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(e17));
                        gm0.j1.u().c().x(u3Var3, java.lang.Boolean.FALSE);
                    } else {
                        if (o17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "has clicked lastId:" + v17);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(mo144222x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        i17 = 0;
                        if (r17 > 0 && e17 - r17 > e8Var.m75939xb282bd08(1)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "out of active_time, lastId:" + v17 + ", current:" + e17 + ", lastFetchTime:" + r17 + ", " + e8Var.m75939xb282bd08(1));
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(mo144222x4ff8c0f0, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    }
                    if (e8Var.m75939xb282bd08(5) == 2) {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0, com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
                        }
                        if (com.p314xaae8f345.mm.ui.bk.C()) {
                            resources = m80379x76847179().getResources();
                            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cnv;
                        } else {
                            resources = m80379x76847179().getResources();
                            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cnu;
                        }
                        mo144222x4ff8c0f0.setBackground(resources.getDrawable(i18));
                        if (textView != null) {
                            textView.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                        }
                        if (c22699x3dcdb3522 != null) {
                            c22699x3dcdb3522.s(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
                        }
                    } else {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80488x6240307c, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                        }
                        mo144222x4ff8c0f0.setBackground(m80379x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ajt));
                        if (textView != null) {
                            textView.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                        }
                        if (c22699x3dcdb3522 != null) {
                            c22699x3dcdb3522.s(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                        }
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(mo144222x4ff8c0f0, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
                    yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (textView != null) {
                        java.lang.String m75945x2fec8307 = e8Var.m75945x2fec8307(i17);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        textView.setText(m75945x2fec8307);
                    }
                    boolean m75933x41a8a7f2 = e8Var.m75933x41a8a7f2(3);
                    if (mo144222x4ff8c0f02 != null) {
                        mo144222x4ff8c0f02.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ao(c19786x6a1e2862, mo144222x4ff8c0f0, m75933x41a8a7f2, this));
                    }
                    if (m75933x41a8a7f2) {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.setVisibility(i17);
                        }
                        if (c22699x3dcdb3522 == null) {
                            return;
                        }
                        c22699x3dcdb3522.setVisibility(i17);
                        return;
                    }
                    if (e8Var.m75939xb282bd08(5) == 2) {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.setVisibility(i17);
                        }
                        if (c22699x3dcdb3522 == null) {
                            return;
                        }
                        c22699x3dcdb3522.setVisibility(8);
                        return;
                    }
                    if (c22699x3dcdb352 != null) {
                        c22699x3dcdb352.setVisibility(8);
                    }
                    if (c22699x3dcdb3522 != null) {
                        c22699x3dcdb3522.setVisibility(8);
                    }
                    if (textView == null) {
                        return;
                    }
                    textView.setGravity(17);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "jumpInfo or id is empty");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(mo144222x4ff8c0f0, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo144222x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(mo144222x4ff8c0f0, "com/tencent/mm/plugin/finder/viewmodel/component/FinderLiveIncomeListUIC", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void V6(r45.j71 j71Var) {
        int i17;
        r45.kj5 kj5Var;
        this.f215819h = j71Var;
        java.util.LinkedList m75941xfb821914 = j71Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getItems(...)");
        java.util.ArrayList<r45.mw1> arrayList = new java.util.ArrayList();
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((r45.mw1) next).m75939xb282bd08(0) == 4 ? 1 : 0) != 0) {
                arrayList.add(next);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "refreshData size:" + arrayList.size());
        java.util.ArrayList arrayList2 = this.f215818g;
        arrayList2.clear();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.mw1 mw1Var : arrayList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mw1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn rnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rn(mw1Var);
            r45.v11 v11Var = (r45.v11) rnVar.f217343d.m75936x14adae67(9);
            if (v11Var != null) {
                rnVar.f217344e = java.lang.Long.valueOf(v11Var.m75942xfb822ef2(i17));
                r45.gs2 gs2Var = (r45.gs2) v11Var.m75936x14adae67(5);
                if (gs2Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "has_realname_auth:" + gs2Var.m75933x41a8a7f2(5) + " appid:" + gs2Var.m75945x2fec8307(i17) + ", category_id:" + gs2Var.m75941xfb821914(1));
                    kj5Var = new r45.kj5();
                    kj5Var.f460294d = gs2Var.m75945x2fec8307(i17);
                    kj5Var.f460295e = gs2Var.m75941xfb821914(1);
                    kj5Var.f460296f = gs2Var.m75939xb282bd08(2);
                    kj5Var.f460297g = gs2Var.m75945x2fec8307(3);
                    kj5Var.f460298h = gs2Var.m75945x2fec8307(4);
                    kj5Var.f460299i = ((gs2Var.m75939xb282bd08(6) == 2 || !gs2Var.m75933x41a8a7f2(5)) && !(gs2Var.m75939xb282bd08(6) == 2 && gs2Var.m75939xb282bd08(8) == 1)) ? 1 : 2;
                } else {
                    kj5Var = null;
                }
                rnVar.f217346g = kj5Var;
                rnVar.f217345f = null;
                rnVar.f217347h = v11Var.m75945x2fec8307(1);
                rnVar.f217348i = java.lang.Long.valueOf(v11Var.m75942xfb822ef2(2));
                rnVar.f217349m = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) v11Var.m75936x14adae67(3);
                rnVar.f217350n = v11Var.m75939xb282bd08(4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "encashScene:" + rnVar.f217350n + ", encashInterceptJumpInfo, " + rnVar.a());
            }
            arrayList3.add(rnVar);
            i17 = 0;
        }
        arrayList2.addAll(arrayList3);
    }

    public final void W6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "refreshEncashInfo");
        db2.x0 x0Var = new db2.x0(xy2.c.e(m80379x76847179()));
        az2.j.u(x0Var, m80379x76847179(), null, 0L, 6, null);
        x0Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.co(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.asy;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.util.Map map;
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40002) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 != -1 || bundleExtra == null || (map = (java.util.Map) bundleExtra.getSerializable("next_params")) == null) {
                return;
            }
            java.lang.String str = (java.lang.String) map.get("next_step");
            java.lang.String str2 = (java.lang.String) map.get("result");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "onActivityResult nextStep:" + str + ", resultMap:" + str2);
            if (!r26.i0.p("realname_verify", str, true) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String string = jSONObject.getString("code");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveIncomeListUIC", "onActivityResult nextStep:" + str + ", code:" + string + ", msg:" + jSONObject.getString("msg"));
            p3325xe03a0797.p3326xc267989b.l.d(mo144225x95f74600(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yn(this, string, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.eo.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        W6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f215818g = new java.util.ArrayList();
        this.f215819h = new r45.j71();
    }
}
