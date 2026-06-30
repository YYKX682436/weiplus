package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ad extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h {
    public int A;
    public boolean B;
    public int C;
    public com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 D;
    public android.graphics.drawable.Drawable E;
    public final jz5.g F;
    public final jz5.g G;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f193393p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f193394q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f193395r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f193396s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f193397t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f193398u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f193399v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f193400w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f193401x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f193402y;

    /* renamed from: z, reason: collision with root package name */
    public r45.q84 f193403z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ad(android.view.ViewGroup r1, qo0.c r2, r45.qt2 r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r4 = "root"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            java.lang.String r4 = "statusMonitor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r4)
            r0.<init>(r1, r2, r3)
            r0.f193393p = r2
            com.tencent.mm.plugin.finder.live.plugin.qc r1 = new com.tencent.mm.plugin.finder.live.plugin.qc
            r1.<init>(r0)
            jz5.g r1 = jz5.h.b(r1)
            r0.F = r1
            com.tencent.mm.plugin.finder.live.plugin.wc r1 = new com.tencent.mm.plugin.finder.live.plugin.wc
            r1.<init>(r0)
            jz5.g r1 = jz5.h.b(r1)
            r0.G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.<init>(android.view.ViewGroup, qo0.c, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    public static final void C1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, boolean z17) {
        android.widget.TextView textView = adVar.f193397t;
        if (textView == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView.getTag(), java.lang.Boolean.valueOf(z17))) {
            return;
        }
        android.view.ViewGroup viewGroup = adVar.f446856d;
        if (z17) {
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            textView.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            com.p314xaae8f345.mm.ui.bk.t0(textView.getPaint());
        }
        textView.setTag(java.lang.Boolean.valueOf(z17));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        android.view.View view = adVar.f193401x;
        if (view != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = adVar.D;
            if (c22787x6853c653 != null && (layoutParams3 = c22787x6853c653.getLayoutParams()) != null) {
                layoutParams3.width = view.getMeasuredWidth() + gm2.c1.f354853a.g();
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6532 = adVar.D;
            if (c22787x6853c6532 != null) {
                c22787x6853c6532.requestLayout();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showFreeTimeOverWarning costInnerContainer size:");
            sb6.append(view.getMeasuredWidth());
            sb6.append('-');
            sb6.append(view.getMeasuredHeight());
            sb6.append(",freeTimeOverPag:");
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6533 = adVar.D;
            java.lang.Integer num = null;
            sb6.append((c22787x6853c6533 == null || (layoutParams2 = c22787x6853c6533.getLayoutParams()) == null) ? null : java.lang.Integer.valueOf(layoutParams2.width));
            sb6.append('-');
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6534 = adVar.D;
            if (c22787x6853c6534 != null && (layoutParams = c22787x6853c6534.getLayoutParams()) != null) {
                num = java.lang.Integer.valueOf(layoutParams.height);
            }
            sb6.append(num);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", sb6.toString());
        }
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar) {
        r45.o52 P6 = ((mm2.g0) adVar.P0(mm2.g0.class)).P6();
        if (P6 != null && P6.m75939xb282bd08(0) == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ld.b(adVar, true);
            return;
        }
        long m75942xfb822ef2 = ((mm2.e1) adVar.P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayPluginEx", "#payForLiveV2 liveId=" + m75942xfb822ef2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(adVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kd(adVar, m75942xfb822ef2, null), 3, null);
    }

    public static void z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, r45.q84 freeTimeInfo, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        boolean z19 = (i17 & 2) != 0 ? true : z17;
        boolean z27 = (i17 & 4) != 0 ? false : z18;
        adVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freeTimeInfo, "freeTimeInfo");
        boolean x07 = adVar.x0();
        adVar.f193403z = freeTimeInfo;
        r45.o52 P6 = ((mm2.g0) adVar.P0(mm2.g0.class)).P6();
        adVar.A = P6 != null ? P6.m75939xb282bd08(4) : 0;
        android.view.ViewGroup viewGroup = adVar.f446856d;
        adVar.f193394q = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hkq);
        adVar.f193395r = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565142bf0);
        adVar.f193396s = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bfk);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566591ge3);
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 15.0f, 0.0f, 8, null);
        adVar.f193397t = textView;
        adVar.f193398u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565147bf5);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bf6);
        android.content.Context context2 = textView2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 15.0f, 0.0f, 8, null);
        adVar.f193399v = textView2;
        hc2.o.a(textView2, false);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565146bf4);
        adVar.f193400w = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.sc(adVar));
        }
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bf8);
        android.content.Context context3 = textView3.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        d92.f.a(fVar, context3, textView3, 15.0f, 0.0f, 8, null);
        adVar.f193402y = textView3;
        adVar.f193401x = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bf7);
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = (com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o7r);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22787x6853c653.o(ae2.in.f85221a.a(ym5.f6.B));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(adVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tc(c22787x6853c653, null), 3, null);
        c22787x6853c653.m82583xcde73672(0);
        if (!x07) {
            c22787x6853c653.m82584xebcf33cb(1);
        }
        adVar.D = c22787x6853c653;
        if (mm2.g0.R6((mm2.g0) adVar.P0(mm2.g0.class), null, 1, null) && !x07) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(adVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uc(adVar, null), 3, null);
        } else if (!x07) {
            android.widget.TextView textView4 = adVar.f193397t;
            if (textView4 != null) {
                textView4.setTextSize(15.0f);
            }
            android.widget.TextView textView5 = adVar.f193397t;
            if (textView5 != null) {
                textView5.setAlpha(1.0f);
            }
            android.widget.TextView textView6 = adVar.f193396s;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            android.view.View view = adVar.f193395r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin", "initView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin", "initView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        adVar.x1(true);
        adVar.A1(false, false);
        adVar.B1();
        if (z27 && x07) {
            zl2.r4.f555483a.e(adVar, false);
        }
        if (z19) {
            viewGroup.setAlpha(0.0f);
            viewGroup.animate().alpha(1.0f).start();
        }
        adVar.K0(0);
        android.view.ViewGroup viewGroup3 = adVar.f193400w;
        boolean z28 = ((mm2.c1) adVar.P0(mm2.c1.class)).f410334f2 == 2;
        long j17 = ((mm2.e1) adVar.P0(mm2.e1.class)).f410516m;
        if (viewGroup3 != null) {
            ym5.a1.h(viewGroup3, new ml2.y0(z28, j17));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", "show freeTomeToWatch:" + cm2.a.f124861a.r(freeTimeInfo) + ",isLandscape:" + x07 + ",purchasePrice:" + adVar.A);
    }

    public final void A1(boolean z17, boolean z18) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view;
        android.widget.TextView textView = this.f193399v;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(this.A));
        }
        if (z17) {
            android.view.View view2 = this.f193401x;
            if (view2 != null) {
                if (!(this.C != 3)) {
                    view2 = null;
                }
                if (view2 != null) {
                    D1(3);
                    y1(false);
                    if (x0()) {
                        B1();
                    } else {
                        android.view.View view3 = this.f193401x;
                        java.lang.Object tag = view3 != null ? view3.getTag() : null;
                        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", "foldCostLayout layoutFolded:" + bool + '!');
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2) && (view = this.f193401x) != null) {
                            int width = view.getWidth();
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f193398u;
                            int width2 = width - (c22699x3dcdb352 != null ? c22699x3dcdb352.getWidth() : 0);
                            android.widget.TextView textView2 = this.f193399v;
                            int width3 = width2 - (textView2 != null ? textView2.getWidth() : 0);
                            zl2.q4 q4Var = zl2.q4.f555466a;
                            zl2.q4.k(q4Var, view, width, width3, 150L, null, 16, null);
                            view.setTag(bool2);
                            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = this.D;
                            if (c22787x6853c653 != null) {
                                gm2.c1 c1Var = gm2.c1.f354853a;
                                zl2.q4.k(q4Var, c22787x6853c653, width + c1Var.g(), width3 + c1Var.g(), 150L, null, 16, null);
                            }
                        }
                    }
                    view2.postDelayed((java.lang.Runnable) ((jz5.n) this.G).mo141623x754a37bb(), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
                    ml2.z0.f409863a.c(true, ((mm2.c1) P0(mm2.c1.class)).f410334f2 == 2, ((mm2.e1) P0(mm2.e1.class)).f410516m);
                    return;
                }
                return;
            }
            return;
        }
        int w17 = w1();
        android.view.ViewGroup viewGroup = this.f446856d;
        if (w17 <= 0 && !mm2.g0.R6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            if (z18) {
                D1(2);
                y1(true);
                if (x0()) {
                    B1();
                    return;
                } else {
                    viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yc(this));
                    return;
                }
            }
            if (this.C != 3) {
                D1(2);
            }
            android.view.View view4 = this.f193401x;
            if (view4 != null) {
                view4.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zc(this, view4), 100L);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6532 = this.D;
        if (c22787x6853c6532 != null && c22787x6853c6532.f()) {
            r4 = true;
        }
        if (r4) {
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6533 = this.D;
            if (c22787x6853c6533 != null) {
                c22787x6853c6533.n();
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6534 = this.D;
            if (c22787x6853c6534 != null) {
                c22787x6853c6534.setVisibility(8);
            }
            android.view.View view5 = this.f193401x;
            if (view5 != null && (viewTreeObserver = view5.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pc) ((jz5.n) this.F).mo141623x754a37bb());
            }
            if (x0()) {
                android.view.ViewGroup viewGroup2 = this.f193400w;
                if (viewGroup2 != null) {
                    android.graphics.drawable.Drawable drawable = this.E;
                    if (drawable == null) {
                        drawable = viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1g);
                    }
                    viewGroup2.setBackground(drawable);
                }
            } else {
                android.view.View view6 = this.f193401x;
                if (view6 != null) {
                    android.graphics.drawable.Drawable drawable2 = this.E;
                    if (drawable2 == null) {
                        drawable2 = viewGroup.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1g);
                    }
                    view6.setBackground(drawable2);
                }
            }
        }
        if (!z18) {
            if (this.C != 3) {
                D1(1);
            }
        } else {
            D1(1);
            y1(true);
            if (x0()) {
                B1();
            } else {
                viewGroup.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yc(this));
            }
        }
    }

    public final void B1() {
        int m75939xb282bd08;
        java.lang.String string;
        int m75939xb282bd082;
        java.lang.String string2;
        int w17 = w1();
        android.view.ViewGroup viewGroup = this.f446856d;
        if (w17 <= 0) {
            C1(this, true);
            if (mm2.g0.R6((mm2.g0) P0(mm2.g0.class), null, 1, null) || x0()) {
                android.widget.TextView textView = this.f193397t;
                if (textView == null) {
                    return;
                }
                textView.setVisibility(8);
                return;
            }
            android.widget.TextView textView2 = this.f193397t;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f193397t;
            if (textView3 == null) {
                return;
            }
            textView3.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d8y));
            return;
        }
        if (w1() >= 60) {
            if (x0() && this.C == 3) {
                android.widget.TextView textView4 = this.f193397t;
                if (textView4 == null) {
                    return;
                }
                textView4.setVisibility(8);
                return;
            }
            C1(this, false);
            android.widget.TextView textView5 = this.f193397t;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            r45.td2 td2Var = ((mm2.g0) P0(mm2.g0.class)).f410599m;
            int m75939xb282bd083 = td2Var != null ? td2Var.m75939xb282bd08(3) : 0;
            android.widget.TextView textView6 = this.f193397t;
            if (textView6 == null) {
                return;
            }
            if (m75939xb282bd083 > 0) {
                string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfv, k35.m1.d(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfs), m75939xb282bd083));
            } else {
                android.content.res.Resources resources = viewGroup.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                ne2.c cVar = ne2.c.f418060a;
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                r45.q84 q84Var = this.f193403z;
                if (q84Var != null) {
                    m75939xb282bd08 = q84Var.m75939xb282bd08(2);
                } else {
                    r45.td2 td2Var2 = ((mm2.g0) P0(mm2.g0.class)).f410599m;
                    m75939xb282bd08 = td2Var2 != null ? td2Var2.m75939xb282bd08(1) : 0;
                }
                objArr[0] = cVar.b(context, m75939xb282bd08);
                string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dft, objArr);
            }
            textView6.setText(string);
            return;
        }
        if (x0() && this.C == 3) {
            android.widget.TextView textView7 = this.f193397t;
            if (textView7 == null) {
                return;
            }
            textView7.setVisibility(8);
            return;
        }
        C1(this, false);
        android.widget.TextView textView8 = this.f193397t;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        r45.td2 td2Var3 = ((mm2.g0) P0(mm2.g0.class)).f410599m;
        int m75939xb282bd084 = td2Var3 != null ? td2Var3.m75939xb282bd08(3) : 0;
        android.widget.TextView textView9 = this.f193397t;
        if (textView9 == null) {
            return;
        }
        if (m75939xb282bd084 > 0) {
            string2 = x0() ? viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfv, k35.m1.d(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfs), m75939xb282bd084)) : viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfw, k35.m1.d(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfs), m75939xb282bd084), java.lang.Integer.valueOf(w1()));
        } else if (x0()) {
            string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfy, java.lang.Integer.valueOf(w1()));
        } else {
            android.content.res.Resources resources2 = viewGroup.getContext().getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            ne2.c cVar2 = ne2.c.f418060a;
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            r45.q84 q84Var2 = this.f193403z;
            if (q84Var2 != null) {
                m75939xb282bd082 = q84Var2.m75939xb282bd08(2);
            } else {
                r45.td2 td2Var4 = ((mm2.g0) P0(mm2.g0.class)).f410599m;
                m75939xb282bd082 = td2Var4 != null ? td2Var4.m75939xb282bd08(1) : 0;
            }
            objArr2[0] = cVar2.b(context2, m75939xb282bd082);
            objArr2[1] = java.lang.Integer.valueOf(w1());
            string2 = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dfu, objArr2);
        }
        textView9.setText(string2);
    }

    public final void D1(int i17) {
        android.widget.TextView textView;
        this.C = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", "update payStatus:" + i17);
        int i18 = this.C;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 == 3 && (textView = this.f193402y) != null) {
                    textView.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9t));
                    return;
                }
                return;
            }
            android.widget.TextView textView2 = this.f193402y;
            if (textView2 == null) {
                return;
            }
            textView2.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9r));
            return;
        }
        if (mm2.g0.R6((mm2.g0) P0(mm2.g0.class), null, 1, null)) {
            android.widget.TextView textView3 = this.f193402y;
            if (textView3 == null) {
                return;
            }
            textView3.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9s));
            return;
        }
        android.widget.TextView textView4 = this.f193402y;
        if (textView4 == null) {
            return;
        }
        textView4.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9r));
    }

    public final void E1(r45.q84 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f193403z = info;
        ((mm2.g0) P0(mm2.g0.class)).f410600n = info.m75939xb282bd08(1);
        if (this.B) {
            if (info.m75939xb282bd08(1) <= 0 && !a1()) {
                x1(false);
                qo0.c.a(this.f193393p, qo0.b.X4, null, 2, null);
            }
            A1(false, false);
            B1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", "updateTimer " + cm2.a.f124861a.r(info) + " finish:" + a1());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        android.view.View view;
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view2 = this.f193401x;
        if (view2 != null) {
            view2.removeCallbacks((java.lang.Runnable) ((jz5.n) this.G).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c653 = this.D;
        if (c22787x6853c653 != null) {
            c22787x6853c653.n();
        }
        if (this.D != null && (view = this.f193401x) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pc) ((jz5.n) this.F).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22787x6853c653 c22787x6853c6532 = this.D;
        if (c22787x6853c6532 == null) {
            return;
        }
        c22787x6853c6532.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 == 1 || ((mm2.c1) P0(mm2.c1.class)).f410334f2 == 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void v1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", "finishCountDown freeTimeInfo:" + this.f193403z);
        r45.q84 q84Var = this.f193403z;
        if (q84Var != null) {
            E1(q84Var);
        }
    }

    public final int w1() {
        r45.q84 q84Var = this.f193403z;
        if (q84Var != null) {
            return q84Var.m75939xb282bd08(1);
        }
        return 0;
    }

    public final void x1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayLazyPlugin", "enableCountDown:" + z17);
        this.B = z17;
    }

    public final void y1(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f193398u;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            android.widget.TextView textView = this.f193399v;
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f193398u;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(8);
        }
        android.widget.TextView textView2 = this.f193399v;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
