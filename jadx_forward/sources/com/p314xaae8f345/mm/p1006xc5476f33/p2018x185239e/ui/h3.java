package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class h3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l2 f239266t = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l2(null);

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Map f239267u = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f239268d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f239269e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j2 f239270f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k2 f239271g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m2 f239272h;

    /* renamed from: i, reason: collision with root package name */
    public int f239273i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f239274m;

    /* renamed from: n, reason: collision with root package name */
    public int f239275n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f239276o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239277p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239278q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 f239279r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239280s;

    public h3(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f239268d = context;
        this.f239274m = "";
        this.f239276o = "";
    }

    public static final void x(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        h3Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "clickid is null ignore set");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "set click to " + i17 + " , " + str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str3 = java.lang.String.valueOf(i17);
        } else {
            str3 = i17 + '_' + str;
        }
        f239267u.put(str3, str2);
    }

    public final void B(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 viewHolder, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 accountChannelInfo) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountChannelInfo, "accountChannelInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l2 l2Var = f239266t;
        int b17 = l2Var.b(accountChannelInfo.f238602a, accountChannelInfo.f238621t);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a f17 = l2Var.f(this.f239274m, accountChannelInfo.f238621t);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "[checkShowFirstLogo]，name: " + accountChannelInfo.f238603b + " chooseCount: " + b17 + ", bindSerialResult：" + f17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = viewHolder.f239366i;
        if (b17 < 1 && accountChannelInfo.f238604c != null) {
            int i17 = this.f239273i;
            int i18 = accountChannelInfo.f238602a;
            if (i17 != i18 || (f17 != com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239151d && f17 != com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239152e)) {
                java.lang.String str3 = accountChannelInfo.f238621t;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    str = java.lang.String.valueOf(i18);
                } else {
                    str = i18 + '_' + str3;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("remittance_recv_account_first_icon_time_setting");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
                long j17 = M.getLong(str, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getRemittanceRecvAccountFirstIconTimeSetting: " + j17 + " key: " + str);
                long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "checkShowFirstLogo，time check：" + j17 + (char) 12289 + currentTimeMillis);
                if (j17 > 0 && currentTimeMillis > 604800000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "overtime，not show");
                    c19659x677e0913.setVisibility(8);
                    return;
                }
                if (j17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "first show，set time");
                    int i19 = accountChannelInfo.f238602a;
                    java.lang.String str4 = accountChannelInfo.f238621t;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        str2 = java.lang.String.valueOf(i19);
                    } else {
                        str2 = i19 + '_' + str4;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "setRemittanceRecvAccountFirstIconTimeSetting: " + str2 + " firstShowTime: " + currentTimeMillis2);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("remittance_recv_account_first_icon_time_setting");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M2, "getMMKV(...)");
                    M2.putLong(str2, currentTimeMillis2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "viewHolder.itemNameIcon.visibility = VISIBLE name: " + accountChannelInfo.f238603b);
                c19659x677e0913.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.g(viewHolder.f239366i, accountChannelInfo.f238604c, -1, 0, 0, true, i65.a.q(this.f239268d));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "viewHolder.itemNameIcon.visibility = GONE name: " + accountChannelInfo.f238603b);
        c19659x677e0913.setVisibility(8);
    }

    public final int E(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var, long j17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var = z0Var.f238620s;
        if (((d1Var == null || (arrayList = d1Var.f238341d) == null) ? 0 : arrayList.size()) <= 1) {
            return 0;
        }
        java.util.Iterator it = z0Var.f238620s.f238341d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = i17 + 1;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) it.next()).f238333a == j17) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }

    public final android.graphics.drawable.Drawable I(float f17, float f18, long j17, long j18) {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor((int) j18);
        gradientDrawable.setCornerRadii(new float[]{f17, f17, f17, f17, f18, f18, f18, f18});
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor((int) j17);
        gradientDrawable2.setCornerRadii(new float[]{f17, f17, f17, f17, f18, f18, f18, f18});
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 J(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var = this.f239279r;
        if (g1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var);
            if (g1Var.D != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var2 = this.f239279r;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var2);
                java.util.Iterator it = g1Var2.D.f238584e.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1) it.next();
                    if (a1Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(a1Var.f238319a)) {
                        java.util.Iterator it6 = a1Var.f238319a.iterator();
                        int i19 = 0;
                        while (it6.hasNext()) {
                            int i27 = i19 + 1;
                            java.lang.Integer num = (java.lang.Integer) it6.next();
                            if (i17 == i18) {
                                java.util.ArrayList arrayList = a1Var.f238320b;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1 w1Var = arrayList != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w1) kz5.n0.a0(arrayList, i19) : null;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                                int intValue = num.intValue();
                                java.lang.String str = w1Var != null ? w1Var.f238589b : null;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var3 = this.f239279r;
                                if (g1Var3 == null || g1Var3.D == null) {
                                    return null;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var4 = this.f239279r;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var4);
                                java.util.Iterator it7 = g1Var4.D.f238583d.iterator();
                                while (it7.hasNext()) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0) it7.next();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a f17 = f239266t.f(str, z0Var.f238621t);
                                    if (z0Var.f238602a == intValue && (f17 == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239151d || f17 == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239152e)) {
                                        return z0Var;
                                    }
                                }
                                return null;
                            }
                            i18++;
                            i19 = i27;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo864xe5e2e48d(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 viewHolder, int i17) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var;
        java.lang.String recv_channel_logo;
        android.view.View view2;
        ?? r102;
        java.lang.String str;
        java.lang.String str2;
        long j17;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x0 x0Var;
        r45.rl6 rl6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var2;
        long j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        java.util.List list = this.f239269e;
        if (list == null || i17 < 0 || i17 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        boolean P = P();
        int i18 = 0;
        android.content.Context context = this.f239268d;
        android.view.View view3 = viewHolder.f239361d;
        if (P) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 J2 = J(i17);
            if (J2 == null) {
                return;
            }
            r45.cg0 cg0Var = J2.f238618q;
            long v17 = cg0Var != null ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v(cg0Var) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
            long color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560295gi);
            int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
            android.view.ViewGroup.LayoutParams layoutParams = viewHolder.f239375u.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.llh);
            layoutParams2.rightMargin = 0;
            layoutParams2.leftMargin = i65.a.b(context, 48);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var = this.f239279r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g1Var);
            java.util.Iterator it = g1Var.D.f238584e.iterator();
            char c17 = 6;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.a1) it.next();
                if (a1Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(a1Var.f238319a)) {
                    j18 = color;
                } else {
                    java.util.Iterator it6 = a1Var.f238319a.iterator();
                    int i19 = 0;
                    while (it6.hasNext()) {
                        int i27 = i19 + 1;
                        long j19 = color;
                        if (a1Var.f238319a.size() == 1) {
                            if (i17 == i19 + i18) {
                                c17 = 5;
                            }
                        } else if (i17 == i18) {
                            c17 = 3;
                        } else if (i17 == (a1Var.f238319a.size() - 1) + i18) {
                            c17 = 4;
                        }
                        i19 = i27;
                        color = j19;
                    }
                    j18 = color;
                    i18 += a1Var.f238319a.size();
                }
                color = j18;
            }
            long j27 = color;
            if (c17 == 3) {
                view = view3;
                z0Var2 = J2;
                if (i17 != 0) {
                    com.p314xaae8f345.mm.ui.kk.f(view, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
                }
                view.setBackground(I(b17, 0.0f, v17, j27));
                android.view.View view4 = viewHolder.f239375u;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c17 == 4) {
                view = view3;
                z0Var2 = J2;
                view.setBackground(I(0.0f, b17, v17, j27));
                android.view.View view5 = viewHolder.f239375u;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c17 == 5) {
                view = view3;
                z0Var2 = J2;
                if (i17 != 0) {
                    com.p314xaae8f345.mm.ui.kk.f(view, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8));
                }
                float f17 = b17;
                view.setBackground(I(f17, f17, v17, j27));
                android.view.View view6 = viewHolder.f239375u;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (c17 != 6) {
                view = view3;
                z0Var2 = J2;
            } else {
                view = view3;
                z0Var2 = J2;
                view.setBackground(I(0.0f, 0.0f, v17, j27));
                android.view.View view7 = viewHolder.f239375u;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
            viewHolder.f239362e.setPadding(b18, b18, b18, b18);
            z0Var = z0Var2;
        } else {
            view = view3;
            java.util.List list2 = this.f239269e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0) ((java.util.ArrayList) list2).get(i17);
            java.util.List list3 = this.f239269e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
            if (i17 == ((java.util.ArrayList) list3).size() - 1) {
                android.view.View view8 = viewHolder.f239375u;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view9 = viewHolder.f239375u;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view10 = viewHolder.f239361d;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view10, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemInfo name：");
        sb6.append(z0Var.f238603b);
        sb6.append("， type: ");
        sb6.append(z0Var.f238602a);
        sb6.append(", bindSerial: ");
        sb6.append(z0Var.f238621t);
        sb6.append(",  state：");
        sb6.append(z0Var.f238607f);
        sb6.append(", chooseSetting：");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l2 l2Var = f239266t;
        sb6.append(l2Var.b(z0Var.f238602a, z0Var.f238621t));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", sb6.toString());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = viewHolder.f239363f;
        c19659x677e0913.m75394x3288e7c1(true);
        c19659x677e0913.m75395x7083e041(0.5f);
        if (!com.p314xaae8f345.mm.ui.bk.C() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f238606e)) {
            recv_channel_logo = z0Var.f238605d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recv_channel_logo, "recv_channel_logo");
        } else {
            recv_channel_logo = z0Var.f238606e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recv_channel_logo, "recv_channel_logo_darkmode");
        }
        int b19 = i65.a.b(context, 24);
        c19659x677e0913.m75397xc185581c(true);
        c19659x677e0913.b(recv_channel_logo, b19, b19, -1);
        java.lang.String str3 = z0Var.f238603b;
        android.widget.TextView textView = viewHolder.f239365h;
        textView.setText(str3);
        android.widget.TextView textView2 = viewHolder.f239368n;
        textView2.setVisibility(8);
        viewHolder.f239369o.setVisibility(8);
        if (z0Var.f238612k != null) {
            if (!y(z0Var.f238602a, z0Var.f238621t) || (x0Var = z0Var.f238612k) == null || (rl6Var = x0Var.f238595c) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x0 x0Var2 = z0Var.f238612k;
                M(viewHolder, z0Var, x0Var2.f238593a, x0Var2.f238594b);
            } else {
                M(viewHolder, z0Var, rl6Var, x0Var.f238596d);
            }
        }
        if (P()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var = z0Var.f238620s;
            java.lang.String str4 = "TRANS_SELECTED_SHOP_";
            if (((d1Var == null || (arrayList2 = d1Var.f238341d) == null) ? 0 : arrayList2.size()) > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var2 = z0Var.f238620s;
                long j28 = d1Var2.f238339b;
                java.util.Iterator it7 = d1Var2.f238341d.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        java.lang.String str5 = str4;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f238621t)) {
                            str = str5;
                            str2 = str + z0Var.f238602a;
                        } else {
                            str = str5;
                            str2 = str + z0Var.f238602a + '_' + z0Var.f238621t;
                        }
                        view2 = view;
                        long j29 = l2Var.a().getLong(str2, 0L);
                        if (j29 != 0) {
                            java.util.Iterator it8 = z0Var.f238620s.f238341d.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: cache id is unavailable, return first id, id=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) z0Var.f238620s.f238341d.get(0)).f238333a);
                                    j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) z0Var.f238620s.f238341d.get(0)).f238333a;
                                    break;
                                }
                                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) it8.next()).f238333a == j29) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: cache id is available, return=" + j29);
                                    j17 = j29;
                                    break;
                                }
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: cache id is 0L, return first id, id=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) z0Var.f238620s.f238341d.get(0)).f238333a);
                            j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) z0Var.f238620s.f238341d.get(0)).f238333a;
                        }
                    } else {
                        java.lang.String str6 = str4;
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) it7.next()).f238333a == j28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: default id from server is available return=" + j28);
                            j17 = j28;
                            str = str6;
                            view2 = view;
                            break;
                        }
                        str4 = str6;
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "getDefaultSelectedSubChannelId: sub channel list is empty");
                str = "TRANS_SELECTED_SHOP_";
                view2 = view;
                j17 = 0;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f238621t)) {
                l2Var.a().putLong(str + z0Var.f238602a, j17);
            } else {
                l2Var.a().putLong(str + z0Var.f238602a + '_' + z0Var.f238621t, j17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m2 m2Var = this.f239272h;
            if (m2Var != null) {
                int i28 = z0Var.f238602a;
                java.lang.String str7 = z0Var.f238621t;
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883.f238869u2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t5) m2Var).f239487a;
                ((java.util.HashMap) activityC17133x39d21883.Z1).put(activityC17133x39d21883.h7(i28, str7), java.lang.Long.valueOf(j17));
            }
            if (z0Var.f238607f == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var3 = z0Var.f238620s;
                if (((d1Var3 == null || (arrayList = d1Var3.f238341d) == null) ? 0 : arrayList.size()) > 1 && j17 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "showing sub channel, type: " + z0Var.f238602a + ", defaultSubChannelId: " + j17);
                    if (!this.f239278q) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj("wxalite5902f97ca32a59d74355fc2e32843e79@pay", new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.y2(this));
                    }
                    int E = E(z0Var, j17);
                    android.widget.LinearLayout linearLayout = viewHolder.f239372r;
                    linearLayout.setVisibility(0);
                    O(viewHolder, z0Var.f238620s.f238338a + ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) z0Var.f238620s.f238341d.get(E)).f238334b);
                    linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t2(z0Var, this, viewHolder));
                }
            }
        } else {
            view2 = view;
        }
        android.widget.TextView textView3 = viewHolder.f239367m;
        textView3.setVisibility(8);
        if (z0Var.f238613l != null) {
            textView3.setVisibility(0);
            r45.xt5 xt5Var = new r45.xt5();
            r45.rl6 rl6Var2 = z0Var.f238613l;
            xt5Var.f471934e = rl6Var2;
            if (rl6Var2.f466520d.size() > 0) {
                r45.hl6 hl6Var = (r45.hl6) z0Var.f238613l.f466520d.get(0);
                xt5Var.f471936g = hl6Var.f457813p;
                if (hl6Var.f457812o != null) {
                    r45.t35 t35Var = new r45.t35();
                    t35Var.f467627d = 1.0f;
                    t35Var.f467629f = 4.0f;
                    t35Var.f467628e = 1.0f;
                    t35Var.f467630g = 4.0f;
                    xt5Var.f471935f = t35Var;
                    xt5Var.f471938i = hl6Var.f457812o;
                } else {
                    r45.cg0 cg0Var2 = new r45.cg0();
                    cg0Var2.f453071d = 0L;
                    cg0Var2.f453072e = 0L;
                    xt5Var.f471938i = cg0Var2;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.i(textView3, xt5Var);
        }
        l2Var.e(1, z0Var.f238602a, z0Var.f238621t);
        int i37 = z0Var.f238607f;
        android.widget.LinearLayout linearLayout2 = viewHolder.f239364g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = viewHolder.f239370p;
        android.widget.TextView textView4 = viewHolder.f239371q;
        if (i37 == 1) {
            android.view.View view11 = view2;
            c19659x677e0913.setAlpha(1.0f);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            textView4.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a f18 = l2Var.f(this.f239274m, z0Var.f238621t);
            if (z0Var.f238602a == this.f239273i && (f18 == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239151d || f18 == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239152e)) {
                c22699x3dcdb352.setVisibility(0);
                c22699x3dcdb352.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u2(this, viewHolder, viewHolder));
            } else {
                c22699x3dcdb352.setVisibility(8);
                Q(linearLayout2, 0);
            }
            B(viewHolder, z0Var);
            if (!P()) {
                view11.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b_s);
            }
            view11.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.v2(this, z0Var));
            return;
        }
        if (i37 != 2) {
            android.view.View view12 = viewHolder.f239361d;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view12, arrayList10.toArray(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "unknow type");
            return;
        }
        if (z0Var.f238619r != null) {
            c19659x677e0913.setAlpha(1.0f);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            c19659x677e0913.setAlpha(0.3f);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
        java.lang.String str8 = z0Var.f238610i.f238344a;
        if (str8 == null || str8.length() == 0) {
            r102 = 0;
        } else {
            textView4.setVisibility(0);
            c22699x3dcdb352.setVisibility(8);
            if (textView2.getVisibility() == 0) {
                textView4.setVisibility(8);
            }
            android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.ui.bk.C() ? context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cdx) : context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cdw);
            int q17 = (int) (i65.a.q(context) * 16);
            if (drawable != null) {
                drawable.setBounds(0, 0, com.p314xaae8f345.mm.ui.zk.a(context, q17), com.p314xaae8f345.mm.ui.zk.a(context, q17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k(drawable);
            com.p314xaae8f345.mm.p2802xd031a825.ui.a0 a0Var = new com.p314xaae8f345.mm.p2802xd031a825.ui.a0(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x2(this, z0Var));
            a0Var.f295640e = false;
            textView4.setClickable(true);
            textView4.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(context));
            java.lang.String str9 = z0Var.f238610i.f238344a + ' ';
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str9);
            spannableStringBuilder.setSpan(kVar, str9.length() - 1, str9.length(), 17);
            r102 = 0;
            spannableStringBuilder.setSpan(a0Var, 0, str9.length(), 18);
            textView4.setText(spannableStringBuilder);
            textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
        android.view.View view13 = view2;
        view13.setOnClickListener(null);
        view13.setClickable(r102);
        boolean P2 = P();
        android.widget.Button button = viewHolder.f239376v;
        if (!P2) {
            view13.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            button.setVisibility(8);
            return;
        }
        r45.gq gqVar = z0Var.f238619r;
        if (gqVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "float_button is null");
            button.setVisibility(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "show float_button");
        button.setVisibility(r102);
        android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout2.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((android.widget.LinearLayout.LayoutParams) layoutParams3).rightMargin = i65.a.b(context, 68);
        button.setText(gqVar.f456999h);
        if (gqVar.f457005q != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "float_button text_color is " + gqVar.f457005q);
            button.setTextColor((int) com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v(gqVar.f457005q));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "float_button text_color is null, use FG-2");
        }
        r45.cg0 cg0Var3 = gqVar.f457006r;
        long v18 = cg0Var3 != null ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.v(cg0Var3) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        long color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560295gi);
        float b27 = i65.a.b(context, 6);
        button.setBackground(I(b27, b27, v18, color2));
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w2(this, gqVar));
    }

    public final void L(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 accountChannelInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountChannelInfo, "accountChannelInfo");
        this.f239273i = accountChannelInfo.f238602a;
        java.lang.String bind_serial = accountChannelInfo.f238621t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bind_serial, "bind_serial");
        this.f239274m = bind_serial;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_INT_SYNC, java.lang.Integer.valueOf(accountChannelInfo.f238602a));
        java.lang.String str = accountChannelInfo.f238621t;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_BIND_SERIAL_STRING_SYNC;
        if (str == null) {
            str = "";
        }
        c17.x(u3Var, str);
    }

    public final void M(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var, r45.rl6 rl6Var, r45.gq gqVar) {
        r45.bz3 bz3Var;
        if (rl6Var != null) {
            n2Var.f239368n.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.k(n2Var.f239368n, rl6Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a3(this, z0Var), java.lang.Boolean.TRUE);
        }
        if (gqVar == null || gqVar.f456997f != 0 || (bz3Var = gqVar.f456998g) == null) {
            return;
        }
        java.lang.String str = bz3Var.f452705d;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            str = gqVar.f456998g.f452710i;
        }
        if (str != null) {
            n2Var.f239369o.m75399x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e3(rl6Var, n2Var, gqVar, this, z0Var));
            n2Var.f239369o.m75396xca029dad(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w0 r18) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.N(com.tencent.mm.plugin.remittance.model.w0):void");
    }

    public final void O(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var, java.lang.String str) {
        int textSize = (int) n2Var.f239373s.getTextSize();
        android.graphics.drawable.Drawable drawable = n2Var.f239374t.getDrawable();
        if (drawable == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "Drawable is null, cannot set bounds");
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(90.0f, drawable.getIntrinsicWidth() / 2.0f, drawable.getIntrinsicHeight() / 2.0f);
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "setSubChannelSelectTextView", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;Ljava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter", "setSubChannelSelectTextView", "(Lcom/tencent/mm/plugin/remittance/ui/RemittanceDetailReceiveAccountInfoAdapter$NormalViewHolder;Ljava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.widget.TextView textView = n2Var.f239373s;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(textView.getResources(), createBitmap);
        bitmapDrawable.setBounds(0, 0, ((int) (textSize * (createBitmap.getWidth() / createBitmap.getHeight()))) / 2, textSize / 2);
        android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(bitmapDrawable, 2);
        android.text.SpannableString spannableString = new android.text.SpannableString(str + "  ");
        spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 17);
        textView.setText(spannableString);
    }

    public final boolean P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.w0 w0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g1 g1Var = this.f239279r;
        if (g1Var == null || (w0Var = g1Var.D) == null) {
            return false;
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(w0Var.f238584e);
    }

    public final void Q(android.widget.LinearLayout linearLayout, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = i17;
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setLayoutParams(layoutParams2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f239269e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        return list.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570928ce4, viewGroup, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2(inflate);
    }

    public final boolean y(int i17, java.lang.String str) {
        java.lang.String valueOf = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? java.lang.String.valueOf(i17) : i17 + '_' + str;
        java.util.Map map = f239267u;
        if (map != null && (!map.isEmpty())) {
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, valueOf)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", valueOf + " is clicked");
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", valueOf + " is not clicked");
        return false;
    }

    public final void z(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 accountChannelInfo, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accountChannelInfo, "accountChannelInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l2 l2Var = f239266t;
        int b17 = l2Var.b(accountChannelInfo.f238602a, accountChannelInfo.f238621t);
        if (z17 && b17 < accountChannelInfo.f238617p) {
            if (accountChannelInfo.f238616o != null) {
                l2Var.e(6, accountChannelInfo.f238602a, accountChannelInfo.f238621t);
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", accountChannelInfo.f238616o.m75962x8b6d8abc());
                h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
                if (qVar != null) {
                    qVar.mo24837xef221a95("commonRoute", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.o2(accountChannelInfo));
                }
            } else {
                java.lang.String str2 = accountChannelInfo.f238609h;
                if (!(str2 == null || str2.length() == 0)) {
                    com.p314xaae8f345.mm.p2802xd031a825.ui.r1.y0(this.f239268d, accountChannelInfo.f238609h, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.p2(accountChannelInfo));
                }
            }
        }
        int i17 = accountChannelInfo.f238602a;
        java.lang.String str3 = accountChannelInfo.f238621t;
        int i18 = b17 + 1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str = java.lang.String.valueOf(i17);
        } else {
            str = i17 + '_' + str3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "setRemittanceRecvAccountChooseSetting: " + str + " choosCount: " + i18);
        l2Var.a().putInt(str, i18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 viewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(viewHolder, i17);
            return;
        }
        java.util.List list = this.f239269e;
        if (list == null || i17 < 0 || i17 >= ((java.util.ArrayList) list).size()) {
            return;
        }
        if (P()) {
            z0Var = J(i17);
            if (z0Var == null) {
                return;
            }
        } else {
            java.util.List list2 = this.f239269e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0) ((java.util.ArrayList) list2).get(i17);
        }
        if (z0Var.f238607f == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a f17 = f239266t.f(this.f239274m, z0Var.f238621t);
            int i18 = z0Var.f238602a;
            int i19 = this.f239273i;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = viewHolder.f239370p;
            if (i18 == i19 && (f17 == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239151d || f17 == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.a.f239152e)) {
                c22699x3dcdb352.setVisibility(0);
                c22699x3dcdb352.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q2(this, viewHolder));
            } else {
                c22699x3dcdb352.setVisibility(8);
                Q(viewHolder.f239364g, 0);
            }
        }
        if (z0Var.f238612k != null && y(z0Var.f238602a, z0Var.f238621t) && z0Var.f238612k.f238595c != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "used data, channel type is " + z0Var.f238602a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.x0 x0Var = z0Var.f238612k;
            M(viewHolder, z0Var, x0Var.f238595c, x0Var.f238596d);
        }
        B(viewHolder, z0Var);
    }
}
