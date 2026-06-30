package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference */
/* loaded from: classes11.dex */
public class ViewOnClickListenerC16860xc669c20a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public boolean L;
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public final android.content.Context R;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r S;
    public android.view.View T;
    public cr3.d0 U;
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f235259l1;

    /* renamed from: p0, reason: collision with root package name */
    public y35.k f235260p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f235261p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f235262x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f235263y0;

    public ViewOnClickListenerC16860xc669c20a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.f235262x0 = null;
        this.f235259l1 = 0;
        this.f235261p1 = 0;
        this.R = context;
    }

    public static java.lang.String N(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return a17;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return str2;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }

    public static java.lang.CharSequence Q(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17, java.lang.String str, boolean z17) {
        java.lang.String str2;
        if (i17 == 9) {
            i17 = z3Var.m43619x2fa78b11();
        }
        if (i17 == 1) {
            return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bif) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bie) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.big);
        }
        if (i17 == 6) {
            return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbe);
        }
        java.lang.String str3 = null;
        if (i17 != 8) {
            if (i17 != 10) {
                if (i17 == 34) {
                    return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bho);
                }
                if (i17 == 48) {
                    return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bia);
                }
                if (i17 == 76) {
                    return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bi7);
                }
                if (i17 != 96) {
                    if (i17 == 161) {
                        return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572525bi2);
                    }
                    if (i17 == 184) {
                        return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572526bi3);
                    }
                    if (i17 == 3) {
                        return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bii) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bih) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bij);
                    }
                    if (i17 != 4) {
                        if (i17 == 17) {
                            android.app.Activity activity = (android.app.Activity) context;
                            java.lang.String N = N(activity.getIntent().getStringExtra("share_card_username"), activity.getIntent().getStringExtra("share_card_nickname"));
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N)) {
                                N = N(activity.getIntent().getStringExtra("source_from_user_name"), activity.getIntent().getStringExtra("source_from_nick_name"));
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N)) {
                                java.lang.String Z0 = z3Var.Z0();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalProfileHeaderPreference", "[getSource] SEND_CARD fallback to contact sourceExtInfo, username:%s, sourceExtInfo:%s", str, Z0);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Z0)) {
                                    N = N(Z0, null);
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalProfileHeaderPreference", "[getSource] SEND_CARD username:%s, displayName:%s, isVerify:%s, serverSource:%d, isContact:%s", str, N, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(z3Var.f318108p0), java.lang.Boolean.valueOf(z3Var.r2()));
                            if (z17 || z3Var.f318108p0 > 1000000) {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N)) {
                                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhv);
                                }
                                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhu, N);
                                ((ke0.e) xVar).getClass();
                                return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string);
                            }
                            if (z3Var.r2()) {
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N)) {
                                    return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhs);
                                }
                                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bht, N);
                                ((ke0.e) xVar2).getClass();
                                return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string2);
                            }
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(N)) {
                                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhw, N);
                            }
                            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhx);
                            ((ke0.e) xVar3).getClass();
                            return com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, string3);
                        }
                        if (i17 == 18) {
                            return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572528bi5) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572527bi4) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bi6);
                        }
                        switch (i17) {
                            case 12:
                                break;
                            case 13:
                                break;
                            case 14:
                                break;
                            case 15:
                                return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bic) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bib) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bid);
                            default:
                                switch (i17) {
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                        return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bil) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bik) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bim);
                                    case 25:
                                        return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhq) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhp) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhr);
                                    case 30:
                                        return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bi9) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bi8) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bi_);
                                    default:
                                        switch (i17) {
                                            case 58:
                                            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                                            case 60:
                                                return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqr);
                                            default:
                                                return null;
                                        }
                                }
                        }
                    }
                    return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbd);
                }
            }
            return (z17 || z3Var.f318108p0 > 1000000) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bio) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bin) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bip);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p7 W0 = r21.w.Ai().W0(str);
        if (W0 == null) {
            str2 = z3Var.Z0();
        } else {
            str2 = W0.f66486x3745f483;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = z3Var.Z0();
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.d1())) {
            str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0()) ? c01.v1.p(n17.d1()) : n17.P0();
        }
        return (z17 || z3Var.f318108p0 > 1000000) ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572524bi1, str3) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhz) : z3Var.r2() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572523bi0, str3) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bhy);
    }

    public void M(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, int i17, boolean z17, cr3.d0 d0Var) {
        android.content.Context context = this.R;
        this.N = ((android.app.Activity) context).getIntent().getStringExtra("Contact_RoomNickname");
        this.P = ((android.app.Activity) context).getIntent().getStringExtra("Contact_ChatRoomId");
        this.M = z3Var;
        this.Q = i17;
        this.L = true;
        this.U = d0Var;
    }

    public final java.lang.String O(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.lang.String g27;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(this.M.d1())) {
            android.content.res.Resources resources = this.R.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.X) ? ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Di(z3Var.W) : z3Var.X;
            g27 = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aoi, objArr).trim();
        } else {
            g27 = z3Var.g2();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return g27 == null ? "" : g27;
    }

    public bi4.i0 R() {
        android.view.View view = this.T;
        if (view != null) {
            return ((hr3.u9) view.getTag()).f365608w;
        }
        return null;
    }

    public final void S(hr3.t9 t9Var, java.lang.CharSequence charSequence, java.lang.String str) {
        if (t9Var.mo133977xfb85ada3() != null) {
            java.lang.CharSequence mo133977xfb85ada3 = t9Var.mo133977xfb85ada3();
            t9Var.mo133979x765074af(charSequence);
            rl5.r rVar = new rl5.r(this.R, t9Var.mo133978xfb86a31b());
            rVar.f478884u = new hr3.r9(this);
            rVar.f478887x = new hr3.s9(this, str);
            rVar.L = new hr3.l9(this, t9Var, mo133977xfb85ada3);
            if (!(t9Var.mo133978xfb86a31b().getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[])) {
                rVar.n(this.f235259l1, this.f235261p1);
            } else {
                int[] iArr = (int[]) t9Var.mo133978xfb86a31b().getTag(com.p314xaae8f345.mm.R.id.ohu);
                rVar.n(iArr[0], iArr[1]);
            }
        }
    }

    public void T() {
        android.view.View view = this.T;
        if (view != null) {
            hr3.u9 u9Var = (hr3.u9) view.getTag();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19704xf24fb064 c19704xf24fb064 = u9Var.f365604s;
            if (c19704xf24fb064 != null) {
                c19704xf24fb064.b();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd c19715xef2590cd = u9Var.f365605t;
            if (c19715xef2590cd != null) {
                c19715xef2590cd.b();
            }
        }
        if (R() != null) {
            R().S5(0L);
        }
    }

    public void V(boolean z17, int i17, boolean z18) {
        int a17 = com.p314xaae8f345.mm.ui.bl.a(this.f279303d);
        this.V = z17;
        this.W = z18;
        this.X = i17;
        this.Y = bi4.v1.g();
        if (i17 <= 0) {
            this.X = a17;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.S;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalProfileHeaderPreference", "setHasStory action=%s weuiActionBarHeight=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17));
    }

    public final void W(hr3.u9 u9Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.Z;
        if (c19782x23db1cfa == null) {
            android.view.View view = u9Var.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc m76160xd133dfec = c19782x23db1cfa.m76160xd133dfec();
        if (m76160xd133dfec == null || m76160xd133dfec.m76027x1cbb0791() <= 0) {
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.A5).mo141623x754a37bb()).r()).booleanValue()) {
                m76160xd133dfec = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc();
                m76160xd133dfec.m76038x5304029d(1);
                m76160xd133dfec.m76039xa7d6d9ac("https://dldir1v6.qq.com/weixin/checkresupdate/auth_icon_level3_2e2f94615c1e4651a25a7e0446f63135.png");
                m76160xd133dfec.m76040x758fddc6("摄影博主");
            }
        }
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B5).mo141623x754a37bb()).r()).intValue() == 0 || m76160xd133dfec == null || m76160xd133dfec.m76027x1cbb0791() <= 0) {
            android.view.View view2 = u9Var.D;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = u9Var.D;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "updateFinderAuthInfo", "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1.f542044a.c(u9Var.E, m76160xd133dfec, 1);
        u9Var.F.setText(m76160xd133dfec.m76029xad9975ba());
        u9Var.D.setOnClickListener(new hr3.m9(this));
    }

    public final void Y(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalProfileHeaderPreference", "view stranger remark, username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_Scene", this.Q);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.y(intent, this.R);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        android.content.Context context = this.R;
        if (id6 == com.p314xaae8f345.mm.R.id.f568143lu3) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.M;
            if (z3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormalProfileHeaderPreference", "contact is null");
            } else if (z3Var.r2()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.ViewOnClickListenerC19710x6eeb8653 viewOnClickListenerC19710x6eeb8653 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.ViewOnClickListenerC19710x6eeb8653) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.S).h("contact_profile_phone");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_Scene", this.Q);
                intent.putExtra("Contact_User", z3Var.d1());
                intent.putExtra("view_mode", true);
                viewOnClickListenerC19710x6eeb8653.getClass();
                intent.putExtra("contact_phone_number_by_md5", (java.lang.String) null);
                intent.putExtra("contact_phone_number_list", z3Var.E1);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.m(intent, context);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.J0())) {
                Y(z3Var.d1(), z3Var);
            } else {
                Y(z3Var.J0(), z3Var);
            }
        } else if (id6 == com.p314xaae8f345.mm.R.id.jp_) {
            cr3.d0 d0Var = this.U;
            if (d0Var != null) {
                d0Var.e();
            }
        } else if (id6 == com.p314xaae8f345.mm.R.id.cey) {
            java.lang.String d17 = this.M.d1();
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19646xabcfe59e.class);
            intent2.putExtra(dm.i4.f66875xa013b0d5, d17);
            android.content.Context context2 = this.R;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "clickAvatar", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "clickAvatar", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(((android.app.Activity) context).getIntent(), 16, 1, this.M.d1());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int id6 = view.getId();
        android.content.Context context = this.R;
        if (id6 == com.p314xaae8f345.mm.R.id.cff || id6 == com.p314xaae8f345.mm.R.id.cf6 || id6 == com.p314xaae8f345.mm.R.id.f565440cf0 || id6 == com.p314xaae8f345.mm.R.id.cf7) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getText() != null) {
                java.lang.String charSequence = textView.getText().toString();
                int indexOf = charSequence.indexOf(58);
                if (indexOf >= 0) {
                    charSequence = charSequence.substring(indexOf + 1).trim();
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835)), indexOf >= 0 ? indexOf + 2 : 0, textView.getText().length(), 33);
                S(new hr3.p9(this, textView), spannableString, charSequence);
            }
            yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (id6 != com.p314xaae8f345.mm.R.id.cf8) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20263xdc7abfaf()) == 1) {
            ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.M.d1()) + "-" + k35.m1.d("yyyy-MM-dd_HH:mm:ss", c01.id.e()) + ".txt", this.M);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view;
        if (c22624x85d69039.a() != null) {
            java.lang.String charSequence2 = c22624x85d69039.a().toString();
            android.text.SpannableString spannableString2 = new android.text.SpannableString(c22624x85d69039.a());
            spannableString2.setSpan(new android.text.style.BackgroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835)), 0, c22624x85d69039.a().length(), 33);
            S(new hr3.q9(this, c22624x85d69039), spannableString2, charSequence2);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05c6  */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(android.view.View r37) {
        /*
            Method dump skipped, instructions count: 2975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a.t(android.view.View):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.T == null) {
            this.T = super.u(viewGroup);
        }
        return this.T;
    }

    public ViewOnClickListenerC16860xc669c20a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        this.f235262x0 = null;
        this.f235259l1 = 0;
        this.f235261p1 = 0;
        this.R = context;
    }

    public ViewOnClickListenerC16860xc669c20a(android.content.Context context) {
        super(context);
        this.L = false;
        this.f235262x0 = null;
        this.f235259l1 = 0;
        this.f235261p1 = 0;
        this.R = context;
    }
}
