package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 {

    /* renamed from: y1, reason: collision with root package name */
    public static final java.lang.String f226481y1 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxu) + "/tencentMapTouch/app/download/apkForWXAndroidConf.json";
    public za3.i1 S;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16295x2743832 T;
    public android.view.View U;
    public za3.h V;
    public android.view.View W;
    public java.util.Map X;
    public int Y;
    public zy2.q9 Z;

    /* renamed from: l1, reason: collision with root package name */
    public final java.lang.Runnable f226482l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f226483p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.view.View f226484p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f226485x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f226486x1;

    /* renamed from: y0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f226487y0;

    public y1(android.app.Activity activity) {
        super(activity);
        this.f226483p0 = false;
        this.f226485x0 = false;
        this.f226487y0 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f226482l1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.b2(this);
        this.f226486x1 = false;
        new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void A() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void C() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void D() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void E(double d17, double d18, int i17, double d19) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void G(java.lang.String str) {
        if (this.Z == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) this.Z).n7("view_clk", hashMap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void H() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f226261d, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.z1(this, null);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a2(this);
        k0Var.v();
    }

    public final int J() {
        int intExtra = n().getIntExtra("type_tag", 0);
        if (intExtra != 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.s.a(intExtra);
        }
        int i17 = this.f226263f;
        if (i17 == 10) {
            return 4;
        }
        if (i17 == 12) {
            return 5;
        }
        int i18 = 7;
        if (i17 == 7) {
            return 6;
        }
        if (i17 != 2) {
            i18 = 11;
            if (i17 == 11) {
                return 8;
            }
            if (i17 == 13) {
                return 9;
            }
            if (i17 != 14) {
                return 0;
            }
        }
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    @Override // ab3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.KeyEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getKeyCode()
            r1 = 1
            r2 = 0
            r3 = 4
            if (r0 != r3) goto L5c
            int r0 = r13.getAction()
            if (r0 != 0) goto L5c
            zy2.q9 r0 = r12.Z
            if (r0 == 0) goto L5c
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) r0
            boolean r4 = r0.L
            if (r4 != 0) goto L58
            gx2.q r4 = r0.f183309J
            r5 = 0
            if (r4 == 0) goto L23
            float r4 = r4.m62637x6c20397b()
            goto L24
        L23:
            r4 = r5
        L24:
            gx2.q r6 = r0.f183309J
            if (r6 == 0) goto L2c
            float r5 = r6.m62620x5b051b9d()
        L2c:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L58
            gx2.q r5 = r0.f183309J
            if (r5 == 0) goto L3e
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(r5, r6, r7, r8, r9, r10, r11)
        L3e:
            ia2.n0 r4 = r0.f183315v
            if (r4 == 0) goto L4f
            com.tencent.pigeon.finder.POIFlutterAPI r4 = r4.f371488f
            if (r4 == 0) goto L4f
            java.lang.String r5 = "scrollToTop"
            yz5.l r5 = ia2.q0.a(r5)
            r4.m88605x7a7ec60d(r5)
        L4f:
            boolean r4 = r0.D
            if (r4 != 0) goto L56
            r0.q7(r2)
        L56:
            r0 = r1
            goto L59
        L58:
            r0 = r2
        L59:
            if (r0 == 0) goto L5c
            return r1
        L5c:
            int r0 = r13.getKeyCode()
            if (r0 != r3) goto L71
            int r13 = r13.getAction()
            if (r13 != 0) goto L71
            r12.j()
            android.app.Activity r13 = r12.f226261d
            r13.finish()
            goto L72
        L71:
            r1 = r2
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.a(android.view.KeyEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, ab3.e
    public void c(int i17, int i18, android.content.Intent intent) {
        super.c(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, ab3.e
    public void e(android.os.Bundle bundle) {
        java.lang.Integer num;
        boolean z17;
        java.lang.String Cj;
        int i17;
        super.e(bundle);
        this.f226483p0 = n().getBooleanExtra("key_drawer_expend", false);
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TENCENT_MAP_COUNT_INT, 0)).intValue();
        this.Y = intValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "count: %s", java.lang.Integer.valueOf(intValue));
        this.f226264g.f226127p = n().getStringExtra("kPoiid");
        java.util.HashMap hashMap = new java.util.HashMap();
        int J2 = J();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f226264g;
        hashMap.put("poiid", c16279x64cea23.f226127p);
        hashMap.put("poi_biz_source", java.lang.Integer.valueOf(J2));
        java.lang.String str = c16279x64cea23.f226127p;
        hashMap.put("is_official_poi", java.lang.Integer.valueOf((str == null || !str.startsWith("UgcPoiEx_")) ? 1 : 0));
        android.app.Activity activity = this.f226261d;
        hashMap.put("qqmap_installed", java.lang.Integer.valueOf(va3.w.c(activity, "com.tencent.map") != null ? 1 : 2));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Mj(activity);
        cy1.a aVar2 = (cy1.a) aVar.ak(activity, iy1.c.TrackMapUI);
        aVar2.dk(activity, "TrackMapUI");
        aVar2.gk(activity, hashMap);
        aVar2.ik(activity, 4, 27051);
        if (q()) {
            r45.f96 f96Var = new r45.f96();
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea232 = this.f226264g;
            java.lang.String str2 = c16279x64cea232.f226127p;
            if (str2 == null || !str2.startsWith("nearby")) {
                z17 = false;
            } else {
                str2 = str2.replace("nearby", "qqmap");
                z17 = true;
            }
            f96Var.set(5, str2);
            f96Var.set(3, c16279x64cea232.f226124m);
            f96Var.set(4, c16279x64cea232.f226122h);
            f96Var.set(0, java.lang.Float.valueOf((float) c16279x64cea232.f226120f));
            f96Var.set(1, java.lang.Float.valueOf((float) c16279x64cea232.f226119e));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "initFinderPoiDrawer: name=%s, locationInfo.slat=%s, locationInfo.slong=%s", c16279x64cea232.f226124m, java.lang.Double.valueOf(c16279x64cea232.f226119e), java.lang.Double.valueOf(c16279x64cea232.f226120f));
            f96Var.set(16, java.lang.Boolean.valueOf(n().getBooleanExtra("KIsFromPoiList", false)));
            f96Var.set(17, n().getStringExtra("KPoiCategoryTips"));
            f96Var.set(18, n().getStringExtra("kPoiBusinessHour"));
            f96Var.set(19, n().getStringExtra("KPoiPhone"));
            f96Var.set(20, java.lang.Float.valueOf(n().getFloatExtra("KPoiPriceTips", 0.0f)));
            boolean booleanExtra = n().getBooleanExtra("key_drawer_allow_no_poiid", false);
            boolean booleanExtra2 = n().getBooleanExtra("key_drawer_expend", false);
            long longExtra = n().getLongExtra("key_from_object_id", 0L);
            android.os.Bundle bundleExtra = n().getBundleExtra("poi_from_chat_report_bundle");
            if (bundleExtra != null) {
                bundleExtra.putBoolean("poi_from_chat_is_nearby", z17);
                n().putExtra("poi_from_chat_report_bundle", bundleExtra);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "initFinderPoiDrawer: isNearByPoi %s", java.lang.Boolean.valueOf(z17));
            }
            android.view.View view = this.V.f552454d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initFinderPoiDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initFinderPoiDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context = (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) this.f226261d;
            java.io.Serializable serializable = this.E;
            if (serializable == null) {
                serializable = zy2.o9.f559051f;
            }
            int J3 = J();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            num = 0;
            context.getIntent().getBooleanExtra("key_enable_flutter_poi", false);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_from_type", serializable);
            intent.putExtra("key_drawer_allow_no_poiid", booleanExtra);
            intent.putExtra("key_location", f96Var.mo14344x5f01b1f6());
            intent.putExtra("key_biz_source", J3);
            intent.putExtra("KEY_ENTER_MEDIA_TAB_TYPE", context.getIntent().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0));
            intent.putExtra("key_from_object_id", longExtra);
            intent.putExtra("key_show_take_car_button", true);
            intent.putExtra("map_view_type", context.getIntent().getIntExtra("map_view_type", 0));
            intent.putExtra("poi_from_chat_report_bundle", context.getIntent().getBundleExtra("poi_from_chat_report_bundle"));
            intent.putExtra("kMsgId", context.getIntent().getLongExtra("kMsgId", -1L));
            java.lang.String stringExtra = context.getIntent().getStringExtra("map_talker_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            intent.putExtra("map_talker_name", stringExtra);
            java.lang.String stringExtra2 = context.getIntent().getStringExtra("key_context_id");
            if (stringExtra2 == null || stringExtra2.length() == 0) {
                if (J3 != 8) {
                    intent.putExtra("key_poi_drawer_report_stay", true);
                }
                switch (J3) {
                    case 1:
                        i17 = 2;
                        break;
                    case 2:
                        i17 = 3;
                        break;
                    case 3:
                    default:
                        i17 = 0;
                        break;
                    case 4:
                        i17 = 15;
                        break;
                    case 5:
                    case 7:
                        i17 = 43;
                        break;
                    case 6:
                        i17 = 4;
                        break;
                    case 8:
                        i17 = 1;
                        break;
                }
                Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, 36, 81, intent);
            } else {
                Cj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(stringExtra2, intent);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiService", "poi contextId %s", Cj);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.H1;
            intent.putExtra("key_half_screen_mode", la2.a.f399033d);
            intent.putExtra("key_drawer_expend", booleanExtra2);
            intent.putExtra("key_from_type", (zy2.o9) serializable);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.p314xaae8f345.mm.R.id.g3u);
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a17 = lk5.q0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.class, intent, false, false, false, null, 60, null);
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = context.mo7595x9cdc264().m7630xb2c12e75();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
            m7630xb2c12e75.l(-1, -1, 0, 0);
            m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.g3u, a17, null);
            m7630xb2c12e75.f();
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = a17.f292654p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC22579xbed01a37, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) abstractActivityC22579xbed01a37;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.m7(activityC13656x51707ca3, context, a17, null, frameLayout, java.lang.Integer.valueOf(android.R.id.content), java.lang.Integer.valueOf(intent.getIntExtra("key_biz_source", 0)), 0, 68, null);
            this.Z = activityC13656x51707ca3;
            activityC13656x51707ca3.M = new yz5.l() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$b
                @Override // yz5.l
                /* renamed from: invoke */
                public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                    float floatValue = ((java.lang.Float) obj).floatValue();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this;
                    y1Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "drawer peek height change %s", java.lang.Float.valueOf(floatValue));
                    android.view.ViewGroup.LayoutParams layoutParams = y1Var.T.getLayoutParams();
                    if (layoutParams != null) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) floatValue;
                        y1Var.T.setLayoutParams(layoutParams);
                    }
                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) y1Var.m(com.p314xaae8f345.mm.R.id.jbp);
                    if (frameLayout2 != null) {
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) frameLayout2.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                        }
                        layoutParams2.height = (com.p314xaae8f345.mm.ui.bl.b(frameLayout2.getContext()).y - com.p314xaae8f345.mm.ui.bl.g(frameLayout2.getContext())) - ((int) floatValue);
                        frameLayout2.setLayoutParams(layoutParams2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TrackMapUI", "handleDrawerPeekHeightChange: mapcontent null");
                    }
                    y1Var.f226274t.mo1014xb96b113b(new int[]{24, 24});
                    return java.lang.Boolean.TRUE;
                }
            };
            activityC13656x51707ca3.N = new yz5.p() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$c
                @Override // yz5.p
                /* renamed from: invoke */
                public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                    double floatValue = ((java.lang.Float) obj).floatValue();
                    double floatValue2 = ((java.lang.Float) obj2).floatValue();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this;
                    java.io.Serializable serializable2 = y1Var.E;
                    if (serializable2 == zy2.o9.f559050e || serializable2 == zy2.o9.f559049d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "onLatLngUpdate: lat %s lng %s", java.lang.Double.valueOf(floatValue), java.lang.Double.valueOf(floatValue2));
                        y1Var.F = false;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea233 = y1Var.f226264g;
                        c16279x64cea233.f226119e = floatValue;
                        c16279x64cea233.f226120f = floatValue2;
                        y1Var.f226266i.f226337f.mo1001x8873d7af().mo992x76535355(y1Var.f226272r);
                        y1Var.u(c16279x64cea233);
                        za3.l1 l1Var = y1Var.B;
                        l1Var.getClass();
                        double d17 = c16279x64cea233.f226119e;
                        l1Var.f552515e = d17;
                        double d18 = c16279x64cea233.f226120f;
                        l1Var.f552516f = d18;
                        if (va3.w.d(d17, d18)) {
                            u60.h hVar = new u60.h(c16279x64cea233.f226119e, c16279x64cea233.f226120f);
                            hVar.f506406f = c16279x64cea233.f226118d;
                            ((i11.g) y1Var.f226268n).b(hVar, y1Var.f226278x);
                        }
                    }
                    return java.lang.Boolean.TRUE;
                }
            };
            activityC13656x51707ca3.P = new yz5.p() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$d
                @Override // yz5.p
                /* renamed from: invoke */
                public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                    float floatValue = ((java.lang.Float) obj).floatValue();
                    float floatValue2 = ((java.lang.Float) obj2).floatValue();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this;
                    if (y1Var.f226483p0 && floatValue2 >= 0.0f) {
                        if (!y1Var.f226486x1) {
                            y1Var.f226274t.setTranslationY((-java.lang.Math.abs(floatValue2 - floatValue)) / 2.0f);
                        }
                        if (floatValue >= floatValue2) {
                            y1Var.f226486x1 = true;
                            y1Var.f226274t.setTranslationY(0.0f);
                        }
                    }
                    return jz5.f0.f384359a;
                }
            };
            activityC13656x51707ca3.Q = new yz5.q() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$e
                @Override // yz5.q
                /* renamed from: invoke */
                public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    android.view.View view2;
                    float floatValue = ((java.lang.Float) obj).floatValue();
                    ((java.lang.Float) obj2).floatValue();
                    boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this;
                    y1Var.getClass();
                    if (!booleanValue && floatValue >= 0.0f && (view2 = y1Var.U) != null) {
                        view2.setTranslationY(-floatValue);
                    }
                    return java.lang.Boolean.TRUE;
                }
            };
            activityC13656x51707ca3.R = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$f
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this.f226485x0 = true;
                    return java.lang.Boolean.TRUE;
                }
            };
            activityC13656x51707ca3.S = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$g
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this.f226265h;
                }
            };
            activityC13656x51707ca3.T = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$h
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this.f226264g;
                }
            };
            activityC13656x51707ca3.U = new yz5.a() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$i
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this.F);
                }
            };
            android.view.View view2 = this.V.f552454d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            num = 0;
        }
        s(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f226266i.f226338g.setVisibility(8);
        this.f226266i.f226333b.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f226261d, com.p314xaae8f345.mm.R.raw.f79637x41330813, -1));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f226266i.f226333b.getLayoutParams();
        marginLayoutParams.leftMargin = (int) this.f226261d.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        marginLayoutParams.width = (int) this.f226261d.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        marginLayoutParams.height = (int) this.f226261d.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        this.f226266i.f226333b.setPadding(0, 0, 0, 0);
        this.f226266i.f226333b.setLayoutParams(marginLayoutParams);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f226266i.f226334c.getLayoutParams();
        marginLayoutParams2.width = 0;
        marginLayoutParams2.height = 0;
        this.f226266i.f226334c.setPadding(0, 0, 0, 0);
        this.f226266i.f226334c.setLayoutParams(marginLayoutParams2);
        this.f226266i.f226334c.setBackground(null);
        this.f226266i.f226334c.setVisibility(8);
        android.app.Activity activity2 = this.f226261d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activity2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) this.f226266i.f226339h.getLayoutParams();
        marginLayoutParams3.topMargin += h17;
        marginLayoutParams3.height = ym5.x.a(activity2, 44.0f);
        this.f226266i.f226339h.setLayoutParams(marginLayoutParams3);
        android.view.View m17 = m(com.p314xaae8f345.mm.R.id.f567222in4);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(num);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(m17, arrayList3.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f226264g.f226133v = n().getStringExtra("kBuildingID");
        this.f226264g.f226134w = n().getStringExtra("kFloorName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2 c16293xe2a3baf2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16293xe2a3baf2) m(com.p314xaae8f345.mm.R.id.cov);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo1021xe8ef6fcd = this.f226274t.mo1007xb0d6012().mo1021xe8ef6fcd();
        if (mo1021xe8ef6fcd != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea233 = this.f226264g;
            mo1021xe8ef6fcd.mo98996x255ed3b7(c16279x64cea233.f226133v, c16279x64cea233.f226134w);
            this.f226274t.mo999x4e2a20af(false);
            mo1021xe8ef6fcd.mo98994x16b0fc2c(false);
            if (n().getIntExtra("map_indoor_support", 0) == 1) {
                mo1021xe8ef6fcd.mo98994x16b0fc2c(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea234 = this.f226264g;
                c16293xe2a3baf2.h1(c16279x64cea234.f226133v, c16279x64cea234.f226134w);
                c16293xe2a3baf2.g1(mo1021xe8ef6fcd, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c2(this, c16293xe2a3baf2));
            }
        }
        if (com.p314xaae8f345.mm.ui.b4.c(this.f226261d)) {
            android.view.View decorView = this.f226261d.getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decorView, "<this>");
            com.p314xaae8f345.mm.ui.a4.e(decorView, true, false, 2, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, ab3.e
    public void f() {
        super.f();
        za3.i1 i1Var = this.S;
        if (i1Var != null) {
            synchronized (za3.i1.f552475x) {
                java.util.List list = i1Var.f552477b;
                if (list != null) {
                    ((java.util.ArrayList) list).clear();
                }
                i1Var.f552487l.mo996x5a5b649();
            }
        }
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.t.f33750x366c91de, this);
        zy2.q9 q9Var = this.Z;
        if (q9Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) q9Var).onDestroy();
        }
    }

    @Override // ab3.e
    public void h() {
        db5.m9.a(false, new android.content.Intent().putExtra("classname", com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.class.getName()));
        boolean equals = j62.e.g().a("clicfg_track_map_up_is_need_delay_stop_locate_and", "1", false, false).equals("1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "onPause: hasClickTakeCarBtn:%s isNeedDelayStopLocate:%s", java.lang.Boolean.valueOf(this.f226485x0), java.lang.Boolean.valueOf(equals));
        boolean z17 = this.f226485x0;
        if (z17 && equals) {
            this.f226487y0.mo50297x7c4d7ca2(this.f226482l1, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "doPause: hasClickTakeCarBtn:%s", java.lang.Boolean.valueOf(z17));
        i11.e eVar = this.f226277w;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f226408J);
        }
        za3.i1 i1Var = this.S;
        if (i1Var != null) {
            i1Var.b();
        }
    }

    @Override // ab3.e
    public void i() {
        db5.m9.a(true, new android.content.Intent().putExtra("classname", com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.class.getName()));
        this.f226485x0 = false;
        this.f226487y0.mo50300x3fa464aa(this.f226482l1);
        i11.e eVar = this.f226277w;
        if (eVar != null) {
            ((i11.h) eVar).j(this.f226408J, true);
        }
        za3.i1 i1Var = this.S;
        if (i1Var != null) {
            i1Var.c();
        }
        int i17 = this.f226263f;
        if (i17 == 2 || i17 == 12 || i17 == 13) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            long longExtra = n().getLongExtra("kFavInfoLocalId", -1L);
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90065e = longExtra;
            z9Var.f90061a = 4;
            c5432x35bb364f.e();
            am.aa aaVar = c5432x35bb364f.f135777h;
            if (aaVar.f87668b != null) {
                java.util.ArrayList arrayList = this.f226271q;
                if (arrayList == null) {
                    this.f226271q = new java.util.ArrayList();
                } else {
                    arrayList.clear();
                }
                this.f226271q.addAll(aaVar.f87668b);
                r();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a
    public int o() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bie;
    }

    @Override // d85.j0
    /* renamed from: onBusinessPermissionDenied */
    public void mo65979x34301f29(java.lang.String str) {
    }

    @Override // d85.j0
    /* renamed from: onBusinessPermissionGranted */
    public void mo65980x600c4ed(java.lang.String str) {
        this.f226261d.recreate();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void w() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        zy2.q9 q9Var = this.Z;
        if (q9Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) q9Var;
            r45.f96 f96Var = activityC13656x51707ca3.f183317x;
            java.lang.String str = (f96Var == null || (m75945x2fec83073 = f96Var.m75945x2fec8307(5)) == null) ? "" : m75945x2fec83073;
            r45.f96 f96Var2 = activityC13656x51707ca3.f183317x;
            java.lang.String str2 = (f96Var2 == null || (m75945x2fec83072 = f96Var2.m75945x2fec8307(3)) == null) ? "" : m75945x2fec83072;
            r45.f96 f96Var3 = activityC13656x51707ca3.f183317x;
            java.lang.String str3 = (f96Var3 == null || (m75945x2fec8307 = f96Var3.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307;
            r45.f96 f96Var4 = activityC13656x51707ca3.f183317x;
            float m75938x746dc8a6 = f96Var4 != null ? f96Var4.m75938x746dc8a6(0) : 0.0f;
            r45.f96 f96Var5 = activityC13656x51707ca3.f183317x;
            z80.q0 q0Var = new z80.q0(str, str2, str3, m75938x746dc8a6, f96Var5 != null ? f96Var5.m75938x746dc8a6(1) : 0.0f);
            z80.m0 m0Var = (z80.m0) i95.n0.c(z80.m0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13656x51707ca3.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((y80.e1) m0Var).wi(mo55332x76847179, q0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2
    public void y() {
        super.y();
        android.widget.TextView textView = (android.widget.TextView) m(com.p314xaae8f345.mm.R.id.f567470jl4);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ggj);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        android.view.View m17 = m(com.p314xaae8f345.mm.R.id.f568879od5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m17, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewStub viewStub = (android.view.ViewStub) m(com.p314xaae8f345.mm.R.id.inb);
        viewStub.setOnInflateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.e2(this));
        this.W = viewStub.inflate();
        android.app.Activity activity = this.f226261d;
        activity.getWindow().getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f2(this));
        za3.i1 i1Var = new za3.i1(activity, this.f226266i.f226337f, false);
        this.S = i1Var;
        i1Var.f552489n = false;
        boolean z17 = true;
        i1Var.f552485j = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16298xbb1f6725 c16298xbb1f6725 = i1Var.f552479d;
        if (c16298xbb1f6725 != null) {
            c16298xbb1f6725.m65968x23b704c3(null);
            i1Var.f552479d.m65969xb4a07727(null);
            i1Var.f552479d.a();
        }
        this.S.f552482g = false;
        activity.getResources();
        this.f226266i.f226333b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.g2(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16295x2743832 c16295x2743832 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.C16295x2743832) m(com.p314xaae8f345.mm.R.id.f567220in2);
        this.T = c16295x2743832;
        if (c16295x2743832 != null) {
            this.U = m(com.p314xaae8f345.mm.R.id.ucu);
        }
        za3.i1 i1Var2 = this.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.h2(this);
        ab3.h hVar = i1Var2.f552487l;
        if (hVar != null) {
            hVar.mo1016xda829c15(h2Var);
        }
        this.T.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.j2(this));
        java.lang.String stringExtra = n().getStringExtra("kPoi_url");
        android.widget.TextView textView2 = (android.widget.TextView) m(com.p314xaae8f345.mm.R.id.jr8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.k2(this, stringExtra));
        }
        this.B.f552519i.setImageResource(j65.e.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.c8k : com.p314xaae8f345.mm.R.C30861xcebc809e.c8j);
        this.V = new za3.h(this.f226266i.f226337f, activity);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f226264g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226122h) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226124m)) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = this.f226270p;
            if (str != null && !str.equals("")) {
                this.V.f552455e = this.f226270p;
            }
            java.lang.String str2 = android.text.TextUtils.isEmpty(c16279x64cea23.f226122h) ? "" : c16279x64cea23.f226122h;
            za3.h hVar2 = this.V;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            this.B.getClass();
            sb6.append(str2);
            hVar2.mo65933x765074af(sb6.toString());
        }
        za3.h hVar3 = this.V;
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.y1$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1.this;
                y1Var.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", y1Var, array);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrackMapUI", "newpoi old go back onclick");
                y1Var.z();
                yj0.a.h(y1Var, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.widget.ImageButton imageButton = hVar3.f552458h;
        imageButton.setOnClickListener(onClickListener);
        imageButton.setVisibility(0);
        android.view.ViewGroup viewGroup = hVar3.f552459i;
        viewGroup.setVisibility(0);
        viewGroup.setOnClickListener(onClickListener);
        this.f226484p1 = m(com.p314xaae8f345.mm.R.id.d3i);
    }
}
