package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

@db5.a(m123858x6ac9171 = 128)
/* renamed from: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI */
/* loaded from: classes8.dex */
public class ActivityC15990xef42d2e4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final com.p314xaae8f345.mm.p794xb0fa9b5e.r L = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.s6();
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E;
    public float F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation G;
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r H;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b7 I;

    /* renamed from: J, reason: collision with root package name */
    public int f222517J;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d K;

    /* renamed from: d, reason: collision with root package name */
    public p53.u f222518d;

    /* renamed from: e, reason: collision with root package name */
    public o53.e f222519e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f222520f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o6 f222521g;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f222526o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f222527p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 f222528q;

    /* renamed from: r, reason: collision with root package name */
    public long f222529r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f222530s;

    /* renamed from: u, reason: collision with root package name */
    public org.json.JSONObject f222532u;

    /* renamed from: v, reason: collision with root package name */
    public long f222533v;

    /* renamed from: w, reason: collision with root package name */
    public sx4.v f222534w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f222522h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f222523i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f222524m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f222525n = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f222531t = new java.util.HashSet();

    /* renamed from: x, reason: collision with root package name */
    public long f222535x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f222536y = false;

    /* renamed from: z, reason: collision with root package name */
    public final int f222537z = 32;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public java.lang.String D = "";

    public ActivityC15990xef42d2e4() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5576x33f32239>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.1
            {
                this.f39173x3fe91575 = 2013420617;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5576x33f32239 c5576x33f32239) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4 activityC15990xef42d2e4;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5576x33f32239 c5576x33f322392 = c5576x33f32239;
                if (!"com.tencent.mm.game.ACTION_EXIT".equals(c5576x33f322392.f135898g.f89427a) || (activityC15990xef42d2e4 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4.this) == null || activityC15990xef42d2e4.isFinishing() || java.lang.System.identityHashCode(activityC15990xef42d2e4) != c5576x33f322392.f135898g.f89428b) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppGameTabUI", "%s exit!", activityC15990xef42d2e4.getClass().getSimpleName());
                activityC15990xef42d2e4.finish();
                return false;
            }
        };
        this.F = 1.0f;
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16010xe7956427.IPCInvoke_readGameLifeConversation();
        this.K = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.9
            {
                this.f39173x3fe91575 = -1425682821;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b c6289xd4421c6b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6289xd4421c6b c6289xd4421c6b2 = c6289xd4421c6b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4 activityC15990xef42d2e4 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4.this;
                if (activityC15990xef42d2e4.mo78538xecd98af8()) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r2 r2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r2();
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(c6289xd4421c6b2.f136537g.f88167b);
                    java.util.HashMap hashMap = activityC15990xef42d2e4.f222524m;
                    am.f30 f30Var = c6289xd4421c6b2.f136537g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7 a7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7) hashMap.get(f30Var.f88168c);
                    if ("setGameTab".equals(f30Var.f88166a)) {
                        r2Var.a(activityC15990xef42d2e4.mo55332x76847179(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7(null);
                        }
                        a7Var.f222566a = jSONObject;
                    } else if (nd1.d1.f72920x24728b.equals(f30Var.f88166a)) {
                        r2Var.c(activityC15990xef42d2e4.mo55332x76847179(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7(null);
                        }
                        a7Var.f222567b = jSONObject;
                    } else if ("setPageTitle".equals(f30Var.f88166a)) {
                        r2Var.d(activityC15990xef42d2e4.mo55332x76847179(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7(null);
                        }
                        a7Var.f222568c = jSONObject;
                    } else if ("setNavigationBarButtons".equals(f30Var.f88166a)) {
                        r2Var.b(activityC15990xef42d2e4.mo55332x76847179(), jSONObject);
                        if (a7Var == null) {
                            a7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7(null);
                        }
                        a7Var.f222569d = jSONObject;
                    } else if ("setNavigationBarHidden".equals(f30Var.f88166a) && jSONObject.has("navigationBarHidden") && activityC15990xef42d2e4.f222519e != null) {
                        if (jSONObject.optBoolean("navigationBarHidden", false)) {
                            activityC15990xef42d2e4.f222519e.setVisibility(8);
                        } else {
                            activityC15990xef42d2e4.f222519e.setVisibility(0);
                        }
                    }
                    hashMap.put(f30Var.f88168c, a7Var);
                    return true;
                } catch (org.json.JSONException unused) {
                    return false;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T6(android.view.ViewGroup viewGroup, java.lang.String str) {
        java.lang.String str2;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v6 v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v6(this);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 c16266x3ede7a38 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38(this);
        c16266x3ede7a38.f127592z = false;
        c16266x3ede7a38.A = false;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = null;
        c16266x3ede7a38.f225910y0 = null;
        c16266x3ede7a38.f225909x0 = v6Var;
        c16266x3ede7a38.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c16266x3ede7a38, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "addLiteAppView", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c16266x3ede7a38.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c16266x3ede7a38, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "addLiteAppView", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f222523i.put(str, c16266x3ede7a38);
        final o53.e eVar = new o53.e(this, this.f222526o);
        eVar.Q = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 c16008xdb77bd65 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65) eVar.F.getParcelable("game_tab_data");
        boolean z17 = eVar.F.getBoolean("game_index_setting_jump_lite", false);
        java.lang.String str3 = eVar.Q;
        if (str3 == null || str3.length() == 0) {
            eVar.N = true;
            str2 = eVar.F.getString("game_tab_key");
        } else {
            str2 = eVar.Q;
        }
        if (c16008xdb77bd65 != null) {
            if (!(str2 == null || str2.length() == 0)) {
                android.widget.ImageView imageView = eVar.f221359n;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem tabItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65.TabItem) c16008xdb77bd65.f222684d.get(str2);
                if (eVar.F.getBoolean("from_find_more_friend", false) && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k() != null && !z17 && !com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k().f405511g && tabItem != null && !tabItem.G) {
                    synchronized (eVar) {
                        if (eVar.f221350y == null) {
                            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(eVar.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdo, (android.view.ViewGroup) eVar.f221358m, false);
                            eVar.f221350y = inflate;
                            eVar.f221351z = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19258xc2f2ab2b) inflate.findViewById(com.p314xaae8f345.mm.R.id.d3w);
                            eVar.A = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19265x23988ddd) eVar.f221350y.findViewById(com.p314xaae8f345.mm.R.id.d3y);
                            eVar.f221358m.addView(eVar.f221350y, 0);
                            if (eVar.A != null) {
                                if (((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ni()) {
                                    eVar.A.setVisibility(0);
                                } else {
                                    eVar.A.setVisibility(8);
                                }
                            }
                            eVar.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui.b(eVar);
                            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
                            m02.u uVar = eVar.B;
                            ((l02.q) sVar).getClass();
                            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D.add(uVar);
                        }
                    }
                }
                if (tabItem != null) {
                    java.util.List list = tabItem.F;
                    if (!(list == null || ((java.util.ArrayList) list).isEmpty())) {
                        java.util.List topCornerSettings = tabItem.F;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(topCornerSettings, "topCornerSettings");
                        java.util.Iterator it = ((java.util.ArrayList) topCornerSettings).iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211 c15924x61e54211 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15924x61e54211) it.next();
                            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(eVar.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdp, (android.view.ViewGroup) eVar.f221358m, false);
                            android.widget.ImageView imageView2 = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f566935hk5);
                            eVar.I.add(imageView2);
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15924x61e54211.f221709d, "chat")) {
                                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(""), com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb.b.class, rVar);
                                eVar.G = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.gii);
                                eVar.H = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.avs);
                                android.content.Context context = eVar.E;
                                if (context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
                                    ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.game.ui.liteapp.GameLiteSettingActionBar$initChatTab$1
                                        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                                        /* renamed from: onResume */
                                        public final void m64806x57429eec() {
                                            o53.e.this.m150648xef1b8414().mo48813x58998cd();
                                        }
                                    });
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15923xcaadde67 c15923xcaadde67 = c15924x61e54211.f221712g;
                                if (c15923xcaadde67 != null && c15923xcaadde67.f221705d == 4) {
                                    android.net.Uri parse = android.net.Uri.parse(c15923xcaadde67.f221706e);
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parse.getPath(), "chat")) {
                                        try {
                                            eVar.K = java.lang.Integer.parseInt(parse.getQueryParameter("sourceSence"));
                                        } catch (java.lang.NumberFormatException unused) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLiteSettingActionBar", "gamelog parse reportSourceScene error");
                                        }
                                    }
                                }
                                if (com.p314xaae8f345.mm.ui.bk.C()) {
                                    java.lang.String str4 = c15924x61e54211.f221711f;
                                    if (str4 == null || str4.length() == 0) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                                        eVar.d(imageView2, com.p314xaae8f345.mm.R.raw.f79456x6a8b26);
                                    }
                                }
                                if (!com.p314xaae8f345.mm.ui.bk.C()) {
                                    java.lang.String str5 = c15924x61e54211.f221710e;
                                    if (str5 == null || str5.length() == 0) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                                        eVar.d(imageView2, com.p314xaae8f345.mm.R.raw.f79456x6a8b26);
                                    }
                                }
                                vo0.a aVar = vo0.e.f520001b;
                                java.lang.String str6 = com.p314xaae8f345.mm.ui.bk.C() ? c15924x61e54211.f221711f : c15924x61e54211.f221710e;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                                yo0.f fVar = new yo0.f();
                                fVar.f545611b = true;
                                fVar.f545610a = true;
                                aVar.h(str6, imageView2, fVar.a(), new o53.b(c15924x61e54211, imageView2, eVar));
                            } else {
                                vo0.a aVar2 = vo0.e.f520001b;
                                java.lang.String str7 = com.p314xaae8f345.mm.ui.bk.C() ? c15924x61e54211.f221711f : c15924x61e54211.f221710e;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                                yo0.f fVar2 = new yo0.f();
                                fVar2.f545611b = true;
                                fVar2.f545610a = true;
                                aVar2.h(str7, imageView2, fVar2.a(), new o53.c(c15924x61e54211, imageView2));
                            }
                            inflate2.setOnClickListener(new o53.d(eVar, c15924x61e54211));
                            eVar.f221358m.addView(inflate2, 0);
                            rVar = null;
                        }
                    }
                }
            }
        }
        eVar.m64567xff3c34b8(eVar.f221365t);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w6 w6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w6(this);
        android.widget.ImageView imageView3 = eVar.f221356h;
        imageView3.setOnClickListener(w6Var);
        imageView3.setImageResource(com.p314xaae8f345.mm.R.raw.f78357x4cad4fd4);
        eVar.m64571xdc742163(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fq7));
        new android.widget.FrameLayout.LayoutParams(-1, -2).gravity = 48;
        eVar.setVisibility(8);
        this.f222522h.put(str, eVar);
        this.f222524m.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7(null));
        viewGroup.addView(c16266x3ede7a38);
        viewGroup.addView(eVar);
    }

    public final void U6(android.net.Uri uri) {
        java.lang.String query = uri.getQuery();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (query == null) {
            query = "";
        }
        java.lang.String[] split = query.split("&");
        if (split == null || split.length == 0) {
            return;
        }
        for (java.lang.String str : split) {
            java.lang.String[] split2 = str.split("=");
            if (split2 != null && split2.length == 2) {
                try {
                    if (this.f222532u == null) {
                        this.f222532u = new org.json.JSONObject();
                    }
                    this.f222532u.put(split2[0], split2[1]);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppGameTabUI", e17, "JSONException", new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4.V6():void");
    }

    public final void W6() {
        m53.i5 p17;
        java.lang.String string = this.f222526o.getString("rawUrl");
        this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b7(null);
        android.net.Uri parse = android.net.Uri.parse(string);
        java.lang.String queryParameter = parse.getQueryParameter("immersiveUIStyle");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (queryParameter == null) {
            queryParameter = "";
        }
        if (queryParameter.equals("1")) {
            this.I.f222598a = true;
        }
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.y6(this);
        java.lang.String queryParameter2 = parse.getQueryParameter("immersivePageBgIsDark");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        if (queryParameter2.equals("1")) {
            this.I.f222599b = true;
        } else {
            java.lang.String queryParameter3 = parse.getQueryParameter("immersivePageBgIsDark");
            if (queryParameter3 == null) {
                queryParameter3 = "";
            }
            if (!queryParameter3.equals("2")) {
                this.I.f222599b = false;
            } else if (com.p314xaae8f345.mm.ui.bk.C()) {
                this.I.f222599b = true;
            } else {
                this.I.f222599b = false;
            }
        }
        java.lang.String queryParameter4 = parse.getQueryParameter("hide_share_option");
        if ((queryParameter4 != null ? queryParameter4 : "").equals("1")) {
            this.I.getClass();
        }
        java.lang.String string2 = this.f222526o.getString("rawUrl");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            android.net.Uri parse2 = android.net.Uri.parse(string2);
            java.lang.String queryParameter5 = parse2.getQueryParameter("nav_color");
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                queryParameter5 = parse2.getQueryParameter("darkmode_nav_color");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter5)) {
                try {
                    this.f222526o.putInt("customize_status_bar_color", android.graphics.Color.parseColor("#" + queryParameter5));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        int i17 = this.f222526o.getInt("customize_status_bar_color");
        this.f222517J = i17;
        if (i17 == 0 && (p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.p()) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.f405328d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.f405330f)) {
            try {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    this.f222517J = android.graphics.Color.parseColor(p17.f405330f);
                } else {
                    this.f222517J = android.graphics.Color.parseColor(p17.f405328d);
                }
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppGameTabUI", "parse color: " + e17.getMessage());
            }
            if (this.f222517J == 0) {
                this.f222517J = b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560119bk);
            }
        }
        o53.e eVar = this.f222519e;
        if (eVar != null) {
            int i18 = this.f222517J;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b7 b7Var = this.I;
            eVar.b(i18, b7Var.f222598a, b7Var.f222599b);
        }
    }

    public void X6(android.content.Intent intent) {
        java.lang.String str = "";
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("game_tab_entrance_msgid") : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 p17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().p1(stringExtra) : ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().o1(null);
        if (p17 != null) {
            p17.t0();
            java.lang.String str2 = this.f222530s;
            if (str2 != null && str2.equals(p17.M2.f222057b)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().K1(p17.f68458xd54c6aa5);
                return;
            }
            str = p17.M2.f222057b;
        }
        if (this.f222518d != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x6(this, str));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f222526o.getBoolean("back_to_find_page")) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bek;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (!this.f222536y) {
            super.onBackPressed();
        }
        android.view.View view = this.f222520f;
        if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
            com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, "backpress");
            } catch (org.json.JSONException unused) {
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(c3717xac6c2329.mo28563xe7b2546(), java.lang.Integer.parseInt(c3717xac6c2329.mo28569xa3f2e0d6()), "app.rightGesture", jSONObject);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        if (com.p314xaae8f345.mm.ui.bk.C() != this.A) {
            W6();
            this.A = C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(C);
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z6(this));
            if (this.f222518d != null) {
                int z17 = r53.f.z(this.f222528q.f222686f);
                int z18 = r53.f.z(this.f222528q.f222687g);
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    if (z18 != 0) {
                        this.f222518d.m157861x421622b1().setBackgroundColor(z18);
                    } else {
                        this.f222518d.m157861x421622b1().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560048x);
                    }
                } else if (z17 != 0) {
                    this.f222518d.m157861x421622b1().setBackgroundColor(z17);
                } else {
                    this.f222518d.m157861x421622b1().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77920x41d15e22);
                }
            }
        }
        int i17 = configuration.orientation;
        if (i17 == 2 && !this.B) {
            this.B = true;
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            android.util.DisplayMetrics displayMetrics2 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37161xa0784b6e;
            if (displayMetrics2 != null) {
                displayMetrics.setTo(displayMetrics2);
            }
            p53.u uVar = this.f222518d;
            if (uVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b1 = uVar.m157861x421622b1();
                m157861x421622b1.getClass();
                m157861x421622b1.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s0(m157861x421622b1));
            }
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 4100);
            return;
        }
        if (i17 != 1 || !this.B) {
            float f17 = configuration.fontScale;
            if (f17 == this.F || !com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
                return;
            }
            this.F = f17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f17);
            return;
        }
        this.B = false;
        android.util.DisplayMetrics displayMetrics3 = getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics4 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37161xa0784b6e;
        if (displayMetrics4 != null) {
            displayMetrics3.setTo(displayMetrics4);
        }
        p53.u uVar2 = this.f222518d;
        if (uVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16009xd65d32cb m157861x421622b12 = uVar2.m157861x421622b1();
            m157861x421622b12.getClass();
            m157861x421622b12.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s0(m157861x421622b12));
        }
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-4101));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(10);
        mo2550x7c2abd06(1);
        mo2550x7c2abd06(9);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e53.b.a(hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        for (o53.e eVar : this.f222522h.values()) {
            eVar.getClass();
            m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
            m02.u uVar = eVar.B;
            ((l02.q) sVar).getClass();
            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.j0.f178819a.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0.D.remove(uVar);
            eVar.R.mo48814x2efc64();
        }
        this.f222534w.f495199f.a();
        this.K.mo48814x2efc64();
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.h(this.H);
        this.H = null;
        this.E.mo48814x2efc64();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        c5675xda3892c3.f136001g.f89350a = 3;
        c5675xda3892c3.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.r0.b(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.l1) ((m33.q1) i95.n0.c(m33.q1.class));
        l1Var.getClass();
        try {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.k1(l1Var, "game.gameCenterExit", new cl0.g()), "GameLiteAppStoreService.SerialQueue");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e("MicroMsg.GameLiteAppStoreService", "notifyGameCenterExit exp:" + e17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9, com.p314xaae8f345.mm.R.C30854x2dc211.f559348c9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppGameTabUI", "onNewIntent");
        if (intent == null) {
            return;
        }
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("game_tab_key");
        if (stringExtra != null) {
            java.lang.String str = this.f222530s;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (str.equalsIgnoreCase(stringExtra)) {
                return;
            }
            this.f222530s = stringExtra;
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.q6(this));
            o53.e eVar = this.f222519e;
            if (eVar != null) {
                eVar.setVisibility(8);
            }
            android.view.View view = this.f222520f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f222519e = (o53.e) this.f222522h.get(stringExtra);
            android.view.View view2 = (android.view.View) this.f222523i.get(stringExtra);
            this.f222520f = view2;
            if (!((java.util.HashSet) this.f222525n).contains(view2)) {
                this.f222526o = intent.getExtras();
                W6();
                try {
                    this.f222532u = new org.json.JSONObject(this.f222526o.getString("query"));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppGameTabUI", e17, "JSONException", new java.lang.Object[0]);
                }
                U6(android.net.Uri.parse(this.f222526o.getString("rawUrl")));
                this.f222526o.putString("query", this.f222532u.toString());
                V6();
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk((android.view.View) this.f222523i.get(stringExtra), this.f222526o, false, false, this.f222527p, null);
                ((java.util.HashSet) this.f222525n).add((android.view.View) this.f222523i.get(stringExtra));
            }
            o53.e eVar2 = this.f222519e;
            if (eVar2 == null || this.f222520f == null) {
                return;
            }
            eVar2.setVisibility(0);
            android.view.View view3 = this.f222520f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/LiteAppGameTabUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7 a7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.a7) this.f222524m.get(this.f222530s);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r2 r2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r2();
            if (a7Var != null) {
                if (a7Var.f222566a != null) {
                    r2Var.a(mo55332x76847179(), a7Var.f222566a);
                }
                if (a7Var.f222567b != null) {
                    r2Var.c(mo55332x76847179(), a7Var.f222567b);
                }
                if (a7Var.f222568c != null) {
                    r2Var.d(mo55332x76847179(), a7Var.f222568c);
                }
                if (a7Var.f222569d != null) {
                    r2Var.b(mo55332x76847179(), a7Var.f222569d);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(null);
        e53.b.c(hashCode());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f222535x > 1000) {
            e53.e.b((int) ((currentTimeMillis - this.f222533v) / 1000), this.f222526o.getString("rawUrl") + "&date_source=1", this.f222537z);
            this.f222535x = currentTimeMillis;
        }
        this.G.mo8834xb9724478(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(2), L);
        this.f222534w.f495199f.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        int i17;
        super.onResume();
        if (this.f222528q.f222688h != null) {
            int i18 = android.os.Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                getWindow().setNavigationBarContrastEnforced(false);
                i17 = 16;
            } else {
                i17 = 0;
            }
            getWindow().getDecorView().setSystemUiVisibility(i17 | 512 | 1024 | 256);
            android.view.Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
                window.setNavigationBarColor(0);
                if (i18 >= 28) {
                    window.setNavigationBarDividerColor(0);
                }
            }
            if (com.p314xaae8f345.mm.ui.bl.f(this)) {
                this.f222518d.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.r6(this));
            }
        }
        java.util.HashSet hashSet = (java.util.HashSet) this.f222531t;
        if (!hashSet.contains(this.f222530s)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("__gameTabFirstShow__", 1);
            this.f222527p.d(hashMap);
            hashSet.add(this.f222530s);
        }
        e53.b.b(hashCode());
        this.G.mo8834xb9724478(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(1), L);
        this.f222533v = java.lang.System.currentTimeMillis();
        this.f222534w.f495199f.d();
        android.view.View view = this.f222520f;
        if (view instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
            if (this.f222521g == null) {
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                this.f222521g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.o6(new yz5.a() { // from class: com.tencent.mm.plugin.game.ui.LiteAppGameTabUI$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4.L;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4 activityC15990xef42d2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) weakReference.get();
                        if (activityC15990xef42d2e4 != null) {
                            android.view.View view2 = activityC15990xef42d2e4.f222520f;
                            if (view2 instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) {
                                return java.lang.Long.valueOf(((com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) view2).m29024x29bd2700());
                            }
                        }
                        return -1L;
                    }
                });
            }
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) i95.n0.c(ct.e3.class))).Ni(this.f222521g);
        }
    }
}
