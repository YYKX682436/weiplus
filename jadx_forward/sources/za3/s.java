package za3;

/* loaded from: classes8.dex */
public final class s extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f552540f;

    /* renamed from: g, reason: collision with root package name */
    public final z80.p0 f552541g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f552542h;

    /* renamed from: i, reason: collision with root package name */
    public xj.m f552543i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f552544m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f552545n;

    /* renamed from: o, reason: collision with root package name */
    public za3.n f552546o;

    /* renamed from: p, reason: collision with root package name */
    public int f552547p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f552548q;

    /* renamed from: r, reason: collision with root package name */
    public final za3.d f552549r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f552550s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f552551t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f552552u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, z80.p0 jumpData, java.util.Map reportParam) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpData, "jumpData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportParam, "reportParam");
        this.f552540f = context;
        this.f552541g = jumpData;
        this.f552542h = reportParam;
        this.f552549r = new za3.d(context);
        this.f552550s = "";
    }

    public static final void D(za3.s sVar, java.lang.String str, boolean z17) {
        sVar.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_installation", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("navigation_software_id", java.lang.Integer.valueOf(sVar.F(str)));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "click_the_navigation_software", kz5.c1.m(kz5.b1.e(new jz5.l("click_navigation_sid", sVar.f552550s)), linkedHashMap), 34048);
    }

    public final void E() {
        this.f552543i = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(wj.t0.G);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F(java.lang.String r2) {
        /*
            r1 = this;
            int r0 = r2.hashCode()
            switch(r0) {
                case -103524794: goto L29;
                case 40719148: goto L1e;
                case 744792033: goto L13;
                case 1254578009: goto L8;
                default: goto L7;
            }
        L7:
            goto L34
        L8:
            java.lang.String r0 = "com.autonavi.minimap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11
            goto L34
        L11:
            r2 = 3
            goto L35
        L13:
            java.lang.String r0 = "com.baidu.BaiduMap"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1c
            goto L34
        L1c:
            r2 = 4
            goto L35
        L1e:
            java.lang.String r0 = "com.google.android.apps.maps"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L27
            goto L34
        L27:
            r2 = 2
            goto L35
        L29:
            java.lang.String r0 = "com.tencent.map"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L32
            goto L34
        L32:
            r2 = 1
            goto L35
        L34:
            r2 = 0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: za3.s.F(java.lang.String):int");
    }

    public final void G(boolean z17, boolean z18) {
        long currentTimeMillis;
        long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("PoiNavigationAppSheetView").q("mmkvkey_navigate_map_ad_frequance_config", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PoiNavigationAppSheetView", "updateAdFreqConfig, expireTime:" + q17 + ", validDaysConfig:" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_navigate_ad_frequance_config_valid_days, 30.0f) + ", exposedDaysConfig:" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_android_navigate_ad_frequance_config_exposed_days, 30.0f));
        if (z17 && ((int) q17) == 0) {
            currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) + (r3 * 24 * 3600);
        } else {
            if (!z18) {
                return;
            }
            currentTimeMillis = (java.lang.System.currentTimeMillis() / 1000) + (r5 * 24 * 3600);
            if (currentTimeMillis <= q17) {
                return;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("PoiNavigationAppSheetView").B("mmkvkey_navigate_map_ad_frequance_config", currentTimeMillis);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        xj.m mVar;
        java.util.List list;
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.elr);
        boolean z18 = true;
        setCanceledOnTouchOutside(true);
        this.f552550s = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        z80.p0 p0Var = this.f552541g;
        e0Var.n(p0Var.f552191d, p0Var.f552190c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = p0Var.f552188a;
        va3.w.b(c16279x64cea23);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_poi_navigate_txmap_ad, 0);
        boolean z19 = Ni == 0;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_poi_navigation_list_style, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PoiNavigationAppSheetView", "map list style config: " + Ni2);
        java.util.List e17 = this.f552549r.e(c16279x64cea23, z19, !(Ni2 == 1 || Ni2 == 2));
        this.f552544m = e17;
        java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) it.next()).f226346e, "com.tencent.map")) {
                break;
            } else {
                i17++;
            }
        }
        this.f552552u = i17 > -1;
        android.content.Context context = this.f552540f;
        if (Ni == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c() && !this.f552552u && (list = this.f552544m) != null) {
            java.lang.String r17 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.juc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
            ((java.util.ArrayList) list).add(0, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0(false, false, r17, null, "com.tencent.map", i65.a.i(context, com.p314xaae8f345.mm.R.C30861xcebc809e.c8m), null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PoiNavigationAppSheetView", "ad config: " + Ni);
        if (Ni > 1) {
            if (Ni == 4) {
                E();
            } else if (Ni == 2 && !this.f552552u) {
                E();
            } else if (Ni == 3 && this.f552552u) {
                E();
            }
        }
        g32.b0 b0Var = (g32.b0) i95.n0.c(g32.b0.class);
        long j17 = p0Var.f552190c;
        java.lang.String str = p0Var.f552191d;
        final g32.d dVar = (g32.d) b0Var;
        dVar.getClass();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0(j17, str);
        z0Var.h();
        java.util.List e18 = z0Var.e(j17, "", "", "", str);
        z0Var.f180655h = j17;
        z0Var.f180656i = str;
        z0Var.f180657m = "";
        z0Var.f180658n = "";
        z0Var.f180659o = "";
        java.util.List list2 = z0Var.f180669y;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) e18;
        if (!arrayList2.isEmpty()) {
            arrayList2.forEach(new java.util.function.Consumer() { // from class: g32.d$$a
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    java.util.Map map = (java.util.Map) obj;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c c13409xda58c12c = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c();
                    c13409xda58c12c.f180331e = (java.lang.String) map.get("deviceID");
                    c13409xda58c12c.f180330d = (java.lang.String) map.get("displayName");
                    c13409xda58c12c.f180332f = (java.lang.String) map.get("iconUrl");
                    java.lang.String str2 = (java.lang.String) map.get("ability");
                    if (str2 == null || !str2.contains("wxmsg_poi")) {
                        return;
                    }
                    arrayList.add(c13409xda58c12c);
                }
            });
        }
        if (list2 != null) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) list2;
            if (!arrayList3.isEmpty()) {
                arrayList3.forEach(new java.util.function.Consumer() { // from class: g32.d$$b
                    @Override // java.util.function.Consumer
                    public final void accept(java.lang.Object obj) {
                        boolean z27;
                        r45.pf4 pf4Var = (r45.pf4) obj;
                        g32.d.this.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c c13409xda58c12c = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c();
                        c13409xda58c12c.f180331e = pf4Var.f464537e;
                        c13409xda58c12c.f180330d = pf4Var.f464538f;
                        c13409xda58c12c.f180332f = pf4Var.f464539g;
                        java.util.LinkedList linkedList = pf4Var.f464540h;
                        if (linkedList != null && !linkedList.isEmpty()) {
                            java.util.Iterator it6 = linkedList.iterator();
                            while (it6.hasNext()) {
                                if (((java.lang.Integer) it6.next()).intValue() == 2) {
                                    z27 = true;
                                    break;
                                }
                            }
                        }
                        z27 = false;
                        if (z27) {
                            arrayList.add(c13409xda58c12c);
                        }
                    }
                });
            }
        }
        this.f552545n = arrayList;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.f552543i != null) {
            int F = F("com.tencent.map");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(F);
            sb7.append(':');
            sb7.append(this.f552552u ? 1 : 0);
            arrayList4.add(sb7.toString());
            sb6.append("com.tencent.map|");
        }
        java.util.List list3 = this.f552544m;
        if (list3 != null) {
            java.util.Iterator it6 = ((java.util.ArrayList) list3).iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) it6.next();
                java.lang.String str2 = f0Var.f226346e;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList4.add(F(str2) + ":1");
                java.lang.String str3 = f0Var.f226346e;
                if (str3 == null) {
                    str3 = "";
                }
                sb6.append(str3);
                sb6.append("|");
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("navigate_the_software_status", kz5.n0.g0(arrayList4, "#", null, null, 0, null, null, 62, null));
        linkedHashMap.toString();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50243, "view_exp", kz5.c1.m(kz5.b1.e(new jz5.l("click_navigation_sid", this.f552550s)), linkedHashMap), 34048);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 3, sb6.toString(), "");
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575607dp);
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(0);
        }
        int i18 = (int) (context.getResources().getDisplayMetrics().heightPixels * 0.7d);
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.ssk);
        android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a787 != null ? c1073x7e08a787.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i18;
        }
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setLayoutParams(layoutParams);
        }
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setOnClickListener(new za3.o(this));
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f567186uc5);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(za3.p.f552534d);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.u7e);
        if (imageView != null) {
            imageView.setColorFilter(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.shu);
        if (findViewById != null) {
            findViewById.setOnClickListener(new za3.q(this));
        }
        if (this.f552543i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PoiNavigationAppSheetView", "adinfo is null");
            z17 = false;
        } else {
            long q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("PoiNavigationAppSheetView").q("mmkvkey_navigate_map_ad_frequance_config", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PoiNavigationAppSheetView", "shouldShowAd, expireTime:" + q17 + ", curTime:" + currentTimeMillis);
            z17 = !(1 <= q17 && q17 < currentTimeMillis);
        }
        if (z17 && (mVar = this.f552543i) != null) {
            java.util.List list4 = this.f552544m;
            if (list4 != null) {
                ((java.util.ArrayList) list4).add(0, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0(false, true, mVar.f536287b, mVar.f536288c, null, null, mVar.f536289d));
            }
            G(true, false);
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map t17 = kz5.c1.t(this.f552542h);
            t17.put("view_id", "tencent_maps_promote_btn");
            ((cy1.a) rVar2).Ej("view_exp", t17, 27051);
            i95.m c17 = i95.n0.c(xj.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, mVar.f536286a, wj.w0.f528074d, null, 4, null);
            java.util.List list5 = this.f552544m;
            if (!(list5 == null || ((java.util.ArrayList) list5).isEmpty())) {
                java.util.List list6 = this.f552544m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list6);
                java.util.Iterator it7 = ((java.util.ArrayList) list6).iterator();
                int i19 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i19 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0) it7.next()).f226346e, "com.tencent.map")) {
                        break;
                    } else {
                        i19++;
                    }
                }
                this.f552547p = i19;
                if (i19 > -1) {
                    java.util.List list7 = this.f552544m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list7);
                    if (i19 < ((java.util.ArrayList) list7).size()) {
                        java.util.List list8 = this.f552544m;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list8);
                    }
                }
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.ueh);
        java.util.List list9 = this.f552544m;
        if (list9 == null) {
            list9 = new java.util.ArrayList();
        }
        za3.n nVar = new za3.n(context, list9);
        this.f552546o = nVar;
        nVar.f552529f = new za3.r(this);
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16285x3247d2b(context));
        }
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(this.f552546o);
        }
        za3.n nVar2 = this.f552546o;
        if (nVar2 != null) {
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c> list10 = this.f552545n;
            if (list10 == null) {
                list10 = new java.util.ArrayList();
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c c13409xda58c12c : list10) {
                java.lang.String name = c13409xda58c12c.f180330d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0 f0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f0(true, false, name, null, null, null, c13409xda58c12c.f180332f);
                f0Var2.f226349h = c13409xda58c12c;
                nVar2.f552528e.add(f0Var2);
            }
            nVar2.m8146xced61ae5();
        }
        this.f552548q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qxd);
        if (this.f552543i == null) {
            java.util.List list11 = this.f552544m;
            if (list11 == null || ((java.util.ArrayList) list11).isEmpty()) {
                java.util.List list12 = this.f552545n;
                if (list12 != null && !((java.util.ArrayList) list12).isEmpty()) {
                    z18 = false;
                }
                if (z18) {
                    android.widget.TextView textView = this.f552548q;
                    if (textView == null) {
                        return;
                    }
                    textView.setVisibility(0);
                    return;
                }
            }
        }
        android.widget.TextView textView2 = this.f552548q;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onStop() {
        xj.m mVar;
        super.onStop();
        if (this.f552551t || (mVar = this.f552543i) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(xj.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        xj.i.gg((xj.i) c17, mVar.f536286a, wj.w0.f528075e, null, 4, null);
        this.f552551t = true;
    }
}
