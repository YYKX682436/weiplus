package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView */
/* loaded from: classes8.dex */
public class ActivityC19067xb53aa1de extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int E = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public r45.e8 D;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f260697d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f260698e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f260699f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f260700g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f260701h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f260702i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f260703m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d f260704n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ProgressBar f260705o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f260706p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f260707q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f260708r;

    /* renamed from: s, reason: collision with root package name */
    public ms4.t f260709s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f260710t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f260711u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f260712v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f260713w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f260714x;

    /* renamed from: y, reason: collision with root package name */
    public int f260715y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f260716z;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de, long j17, android.view.View view, android.widget.TextView textView) {
        activityC19067xb53aa1de.getClass();
        java.lang.String o17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i(pm0.v.u(j17), "100", 2, java.math.RoundingMode.HALF_UP).doubleValue());
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showPendingBalance", "(JLandroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView != null) {
            textView.setText(activityC19067xb53aa1de.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kf_, o17));
        }
        if (view != null) {
            view.setOnClickListener(new ns4.h2(activityC19067xb53aa1de));
        }
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        ms4.t tVar = activityC19067xb53aa1de.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        r45.kj5 kj5Var = (r45.kj5) tVar.f412646h.mo3195x754a37bb();
        ms4.t tVar2 = activityC19067xb53aa1de.f260709s;
        if (tVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        java.lang.Long l17 = (java.lang.Long) tVar2.f412644f.mo3195x754a37bb();
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateClickButtonEvent balance:");
        sb6.append(longValue);
        sb6.append(", mViewModel.useNewStyle:");
        ms4.t tVar3 = activityC19067xb53aa1de.f260709s;
        if (tVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        sb6.append(tVar3.f412651p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        ms4.t tVar4 = activityC19067xb53aa1de.f260709s;
        if (tVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        if (tVar4.f412651p) {
            android.widget.Button button = activityC19067xb53aa1de.f260708r;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCloseBtn");
                throw null;
            }
            button.setVisibility(8);
            if (longValue > 0) {
                android.widget.Button button2 = activityC19067xb53aa1de.f260707q;
                if (button2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
                    throw null;
                }
                button2.setVisibility(0);
            } else {
                android.widget.Button button3 = activityC19067xb53aa1de.f260707q;
                if (button3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
                    throw null;
                }
                button3.setVisibility(8);
            }
        } else if (longValue == 0 && tVar4.f412657v) {
            android.widget.Button button4 = activityC19067xb53aa1de.f260708r;
            if (button4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCloseBtn");
                throw null;
            }
            button4.setVisibility(0);
            android.widget.Button button5 = activityC19067xb53aa1de.f260707q;
            if (button5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
                throw null;
            }
            button5.setVisibility(8);
            android.widget.Button button6 = activityC19067xb53aa1de.f260708r;
            if (button6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCloseBtn");
                throw null;
            }
            button6.setOnClickListener(new ns4.i2(activityC19067xb53aa1de));
        } else {
            android.widget.Button button7 = activityC19067xb53aa1de.f260708r;
            if (button7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCloseBtn");
                throw null;
            }
            button7.setVisibility(8);
            android.widget.Button button8 = activityC19067xb53aa1de.f260707q;
            if (button8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
                throw null;
            }
            button8.setVisibility(0);
        }
        java.util.Objects.toString(kj5Var);
        android.widget.Button button9 = activityC19067xb53aa1de.f260707q;
        if (button9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
            throw null;
        }
        button9.setEnabled(false);
        android.widget.Button button10 = activityC19067xb53aa1de.f260707q;
        if (button10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
            throw null;
        }
        button10.setTextColor(activityC19067xb53aa1de.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        if (longValue <= 0) {
            return;
        }
        android.widget.Button button11 = activityC19067xb53aa1de.f260707q;
        if (button11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
            throw null;
        }
        button11.setEnabled(true);
        android.widget.Button button12 = activityC19067xb53aa1de.f260707q;
        if (button12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
            throw null;
        }
        button12.setTextColor(activityC19067xb53aa1de.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
        android.widget.Button button13 = activityC19067xb53aa1de.f260707q;
        if (button13 != null) {
            button13.setOnClickListener(new ns4.k2(activityC19067xb53aa1de, kj5Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFetchBtn");
            throw null;
        }
    }

    public final void V6() {
        ms4.t tVar = this.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        r45.v11 v11Var = tVar.f412655t;
        java.util.LinkedList m75941xfb821914 = v11Var != null ? v11Var.m75941xfb821914(6) : null;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            ms4.t tVar2 = this.f260709s;
            if (tVar2 != null) {
                W6(tVar2.f412653r, null, 0, null, null);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, true);
        k0Var.q(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lpl), 17);
        k0Var.f293405n = new ns4.y1(m75941xfb821914, this);
        k0Var.f293414s = new ns4.z1(m75941xfb821914, this);
        k0Var.v();
    }

    public final void W6(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, java.lang.Long l17, int i17, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click encash, jumpInfo:");
        sb6.append(c19786x6a1e2862 != null ? ms4.t.f412641x.a(c19786x6a1e2862) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        if (c19786x6a1e2862 != null) {
            if (this.f260709s == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailViewModel", "jumpEncashInterceptor");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534785n = 0;
            xc2.y2.i(y2Var, this, p0Var, 0, null, 8, null);
            return;
        }
        android.content.Intent intent = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.class);
        if (l17 == null) {
            ms4.t tVar = this.f260709s;
            if (tVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            l17 = (java.lang.Long) tVar.f412644f.mo3195x754a37bb();
        }
        if (l17 != null) {
            intent.putExtra("wecoin_income_balance", l17.longValue());
        }
        ms4.t tVar2 = this.f260709s;
        if (tVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        intent.putExtra("wecoin_enter_encash_business_kv_data", tVar2.f412656u);
        ms4.t tVar3 = this.f260709s;
        if (tVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        intent.putExtra("WECOIN_BUSINESS_ID", tVar3.f412642d);
        ms4.t tVar4 = this.f260709s;
        if (tVar4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        intent.putExtra("WECOIN_ENCASH_SCENE", tVar4.f412654s);
        intent.putExtra("WECOIN_ENCASH_BIZ_TYPE", i17);
        intent.putExtra("WECOIN_ENCASH_BIZ_ACCT_ID", str);
        intent.putExtra("WECOIN_ENCASH_KEYBOARD_TIPS", str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "gotoIncomeBalanceView", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "gotoIncomeBalanceView", "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void X6() {
        int i17;
        android.content.res.Resources resources;
        int i18;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564598vo);
        if (findViewById == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f564597vn);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564599vp);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f564596vm);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f564595vl);
        r45.e8 e8Var = this.D;
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
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "has clicked lastId:" + v17);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        i17 = 0;
                        if (r17 > 0 && e17 - r17 > e8Var.m75939xb282bd08(1)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "out of active_time, lastId:" + v17 + ", current:" + e17 + ", lastFetchTime:" + r17 + ", " + e8Var.m75939xb282bd08(1));
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    }
                    if (e8Var.m75939xb282bd08(5) == 2) {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80097x8eab27b0, com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
                        }
                        if (com.p314xaae8f345.mm.ui.bk.C()) {
                            resources = mo55332x76847179().getResources();
                            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cnt;
                        } else {
                            resources = mo55332x76847179().getResources();
                            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.cns;
                        }
                        findViewById.setBackground(resources.getDrawable(i18));
                        if (textView != null) {
                            textView.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                        }
                        if (c22699x3dcdb3522 != null) {
                            c22699x3dcdb3522.s(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
                        }
                    } else {
                        if (c22699x3dcdb352 != null) {
                            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78416x20edba8f, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                        }
                        findViewById.setBackground(mo55332x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ahg));
                        if (textView != null) {
                            textView.setTextColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                        }
                        if (c22699x3dcdb3522 != null) {
                            c22699x3dcdb3522.s(com.p314xaae8f345.mm.R.raw.f80007x8e72c9b1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                        }
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (textView != null) {
                        java.lang.String m75945x2fec8307 = e8Var.m75945x2fec8307(i17);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        textView.setText(m75945x2fec8307);
                    }
                    boolean m75933x41a8a7f2 = e8Var.m75933x41a8a7f2(3);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new ns4.f2(c19786x6a1e2862, findViewById, m75933x41a8a7f2, this));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "jumpInfo or id is empty");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "refreshAnnouncement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void Y6(long j17) {
        android.view.View view = this.f260699f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeMoneyLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showMoney", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "showMoney", "(J)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String o17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i("" + j17, "100", 2, java.math.RoundingMode.HALF_UP).doubleValue());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d = this.f260704n;
        if (c19152xaaf0e35d != null) {
            c19152xaaf0e35d.e(o17, false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBalanceView");
            throw null;
        }
    }

    public final void Z6(java.lang.Long l17) {
        if (l17 != null) {
            long longValue = l17.longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateIncomeBalanceView balance:");
            sb6.append(l17);
            sb6.append(", mViewModel.useNewStyle:");
            ms4.t tVar = this.f260709s;
            if (tVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            sb6.append(tVar.f412651p);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
            ms4.t tVar2 = this.f260709s;
            if (tVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            if (tVar2.f412651p) {
                android.view.View view = this.f260697d;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTitleLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f260698e;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeContentLayout");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.f260702i;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cocertActivateModeLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = this.f260700g;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTips");
                    throw null;
                }
                textView.setVisibility(8);
                if (longValue > 0) {
                    Y6(longValue);
                    return;
                }
                android.view.View view4 = this.f260699f;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeMoneyLayout");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = this.f260697d;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTitleLayout");
                    throw null;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (longValue == 0) {
                if (tVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                    throw null;
                }
                if (tVar2.f412657v) {
                    android.view.View view6 = this.f260697d;
                    if (view6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTitleLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view7 = this.f260698e;
                    if (view7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeContentLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView2 = this.f260700g;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTips");
                        throw null;
                    }
                    textView2.setVisibility(8);
                    android.view.View view8 = this.f260702i;
                    if (view8 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cocertActivateModeLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(0);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.TextView textView3 = this.f260703m;
                    if (textView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cocertActivateModeTips");
                        throw null;
                    }
                    textView3.setVisibility(0);
                    android.widget.TextView textView4 = this.f260703m;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cocertActivateModeTips");
                        throw null;
                    }
                    ms4.t tVar3 = this.f260709s;
                    if (tVar3 != null) {
                        textView4.setText(tVar3.f412658w);
                        return;
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                        throw null;
                    }
                }
            }
            android.view.View view9 = this.f260697d;
            if (view9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTitleLayout");
                throw null;
            }
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = this.f260698e;
            if (view10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeContentLayout");
                throw null;
            }
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView5 = this.f260700g;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTips");
                throw null;
            }
            textView5.setVisibility(0);
            android.view.View view11 = this.f260702i;
            if (view11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cocertActivateModeLayout");
                throw null;
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "updateIncomeBalanceView", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView6 = this.f260703m;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cocertActivateModeTips");
                throw null;
            }
            textView6.setVisibility(8);
            ms4.t tVar4 = this.f260709s;
            if (tVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            java.lang.String str = tVar4.f412658w;
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                android.widget.TextView textView7 = this.f260700g;
                if (textView7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("normalModeTips");
                    throw null;
                }
                textView7.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575021kf3, str));
            }
            Y6(longValue);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569483cd;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        r45.e92 e92Var;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.String str;
        java.lang.String str2;
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        mo54450xbf7c1df6("");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kde);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f260697d = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.kdb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f260698e = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.qdb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f260699f = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.kdd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f260700g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.qd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f260701h = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f565308c04);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f260702i = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.f565309c05);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f260703m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = findViewById(com.p314xaae8f345.mm.R.id.f569174pa4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f260704n = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d) findViewById8;
        android.view.View findViewById9 = findViewById(com.p314xaae8f345.mm.R.id.pcr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f260705o = (android.widget.ProgressBar) findViewById9;
        android.view.View findViewById10 = findViewById(com.p314xaae8f345.mm.R.id.pkc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f260706p = (android.widget.LinearLayout) findViewById10;
        this.f260711u = findViewById(com.p314xaae8f345.mm.R.id.ac_);
        this.f260712v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iem);
        this.f260713w = findViewById(com.p314xaae8f345.mm.R.id.f564001fc);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d = this.f260704n;
        if (c19152xaaf0e35d == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBalanceView");
            throw null;
        }
        android.widget.ProgressBar progressBar = this.f260705o;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mMoneyLoadingPb");
            throw null;
        }
        c19152xaaf0e35d.m73933xaf1ebe0c(progressBar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d2 = this.f260704n;
        if (c19152xaaf0e35d2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBalanceView");
            throw null;
        }
        c19152xaaf0e35d2.m73936xb2ceec4c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyi));
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = mo273xed6858b4();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d c19152xaaf0e35d3 = this.f260704n;
        if (c19152xaaf0e35d3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBalanceView");
            throw null;
        }
        mo273xed6858b4.a(c19152xaaf0e35d3);
        android.view.View findViewById11 = findViewById(com.p314xaae8f345.mm.R.id.f569171pa1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f260707q = (android.widget.Button) findViewById11;
        android.view.View findViewById12 = findViewById(com.p314xaae8f345.mm.R.id.f569170pa0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.f260708r = (android.widget.Button) findViewById12;
        this.f260714x = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.dh9);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.pkf)).setOnClickListener(new ns4.a2(this));
        this.f260716z = findViewById(com.p314xaae8f345.mm.R.id.oah);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qd_);
        this.B = findViewById(com.p314xaae8f345.mm.R.id.f567826kt5);
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kt6);
        mo74406x9c8c0d33(new ns4.b2(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        Z6(0L);
        android.view.View view = this.f260711u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveTaskEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView", "initLiveTaskEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (((s40.w0) i95.n0.c(s40.w0.class)) != null) {
            ya2.g gVar = ya2.h.f542017a;
            e92Var = new r45.e92();
            e92Var.set(2, java.lang.Boolean.valueOf(pm0.v.z((int) gVar.e().f69326x798040b1, 512)));
            r45.m36 m36Var = gVar.e().f69340x9e5b1f5c;
            if (m36Var == null || (str = m36Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            e92Var.set(0, str);
            r45.m36 m36Var2 = gVar.e().f69340x9e5b1f5c;
            if (m36Var2 == null || (str2 = m36Var2.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            e92Var.set(1, str2);
        } else {
            e92Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("settlementEnable:");
        sb6.append(e92Var != null ? java.lang.Boolean.valueOf(e92Var.m75933x41a8a7f2(2)) : null);
        sb6.append(", url:");
        sb6.append(e92Var != null ? e92Var.m75945x2fec8307(1) : null);
        sb6.append(", tip:");
        sb6.append(e92Var != null ? e92Var.m75945x2fec8307(0) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", sb6.toString());
        if (!(e92Var != null && e92Var.m75933x41a8a7f2(2))) {
            android.view.View view2 = this.f260713w;
            java.lang.Object layoutParams = view2 != null ? view2.getLayoutParams() : null;
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 64);
            }
            android.widget.TextView textView = this.f260712v;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e92Var.m75945x2fec8307(0))) {
            android.view.View view3 = this.f260713w;
            java.lang.Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 64);
            }
            android.widget.TextView textView2 = this.f260712v;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.widget.TextView textView3 = this.f260712v;
            if (textView3 == null) {
                return;
            }
            textView3.setText("");
            return;
        }
        android.view.View view4 = this.f260713w;
        java.lang.Object layoutParams3 = view4 != null ? view4.getLayoutParams() : null;
        marginLayoutParams = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 48);
        }
        android.widget.TextView textView4 = this.f260712v;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        android.widget.TextView textView5 = this.f260712v;
        if (textView5 == null) {
            return;
        }
        textView5.setText(e92Var.m75945x2fec8307(0));
    }

    /* renamed from: onActivityResult */
    public void m73860x9d4787cb(int i17, int i18, android.content.Intent intent, android.app.ComponentCaller caller) {
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        super.onActivityResult(i17, i18, intent, caller);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 40002) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 != -1 || bundleExtra == null || (map = (java.util.Map) bundleExtra.getSerializable("next_params")) == null) {
                return;
            }
            java.lang.String str = (java.lang.String) map.get("next_step");
            java.lang.String str2 = (java.lang.String) map.get("result");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "onActivityResult nextStep:" + str + ", resultMap:" + str2);
            if (!r26.i0.p("realname_verify", str, true) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            java.lang.String string = jSONObject.getString("code");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "onActivityResult nextStep:" + str + ", code:" + string + ", msg:" + jSONObject.getString("msg"));
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new ns4.d2(this, string, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        ms4.t tVar = this.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        tVar.R6(10);
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0166 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ms4.t tVar = this.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        tVar.Q6("", 9, 1, 0, "");
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ms4.q qVar = new ms4.q(tVar, this);
        ((c61.l7) b6Var).getClass();
        db2.x0 x0Var = new db2.x0(xy2.c.e(this));
        az2.j.u(x0Var, this, null, 0L, 6, null);
        pm0.v.T(x0Var.l(), new c61.z5(qVar)).f(this);
    }
}
