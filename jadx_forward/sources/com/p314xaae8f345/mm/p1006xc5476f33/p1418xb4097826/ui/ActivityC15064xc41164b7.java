package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingDataPermissionUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingDataPermissionUI */
/* loaded from: classes8.dex */
public final class ActivityC15064xc41164b7 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 f210241d;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576416dm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574391of1);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.jg(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m79336x8b97809d, "getPreferenceScreen(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5(this, m79336x8b97809d);
        this.f210241d = d5Var;
        android.app.Activity activity = d5Var.f210584a;
        java.lang.String stringExtra = activity.getIntent().getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        d5Var.f210586c = stringExtra;
        if (stringExtra.length() == 0) {
            d5Var.f210586c = xy2.c.e(activity);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        az2.f fVar;
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var = this.f210241d;
        if (d5Var == null || (fVar = d5Var.f210587d) == null) {
            return;
        }
        fVar.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var = this.f210241d;
        if (d5Var == null) {
            return true;
        }
        java.lang.String str = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "click ".concat(str));
            boolean y17 = r26.i0.y(str, "reference_", false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = d5Var.f210585b;
            if (y17) {
                try {
                    int parseInt = java.lang.Integer.parseInt(r26.n0.W(str, "reference_"));
                    if (parseInt != 0) {
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h(str);
                        c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
                        if (c21541x1c1b08fe != null) {
                            boolean N = c21541x1c1b08fe.N();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "onReferencePermissionClick: referenceType=" + parseInt + ", isEnable=" + N);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.c5 c5Var = d5Var.f210589f;
                            hb2.u uVar = hb2.u.f361629e;
                            uVar.getClass();
                            r45.ro4 ro4Var = new r45.ro4();
                            ro4Var.set(1, java.lang.Integer.valueOf(parseInt));
                            ro4Var.set(0, java.lang.Integer.valueOf(N ? 1 : 2));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.u.f361630f, "[modifyReferenceSwitch] referenceType=" + parseInt + ", isEnable=" + N);
                            hb2.w0.m(uVar, ro4Var, c5Var, false, false, null, null, 60, null);
                        }
                    }
                } catch (java.lang.NumberFormatException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderDataPermissionSetting", "onReferencePermissionClick: invalid key=".concat(str), e17);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "feed_reproduction")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("feed_reproduction");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
                if (c21541x1c1b08fe2 != null) {
                    boolean N2 = c21541x1c1b08fe2.N();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Lj(3, N2 ? 1 : 2);
                    g92.b bVar = g92.b.f351302e;
                    m92.b j37 = g92.a.j3(bVar, d5Var.f210586c, false, 2, null);
                    int i17 = j37 != null ? j37.f68698x26b1b2e8 : 0;
                    int i18 = N2 ? i17 & (-257) : i17 | 256;
                    m92.c cVar = new m92.c(d5Var.f210586c);
                    cVar.f68698x26b1b2e8 = i18;
                    bVar.C(cVar, m92.j.f406530o);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.f fVar = hb2.f.f361573e;
                    fVar.getClass();
                    r45.vh2 vh2Var = new r45.vh2();
                    vh2Var.set(0, java.lang.Integer.valueOf(!N2 ? 1 : 0));
                    hb2.w0.m(fVar, vh2Var, null, false, false, null, null, 60, null);
                }
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finder_mini_app_reference")) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("finder_mini_app_reference");
                c21541x1c1b08fe = h19 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h19 : null;
                if (c21541x1c1b08fe != null) {
                    boolean N3 = c21541x1c1b08fe.N();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "onMiniAppReferenceClick: isEnableMiniAppReference=" + N3);
                    ya2.g gVar = ya2.h.f542017a;
                    ya2.b2 b17 = gVar.b(d5Var.f210586c);
                    long j17 = b17 != null ? b17.f69298x75e87a18 : 0L;
                    long j18 = c21541x1c1b08fe.N() ? j17 & (-17) : j17 | 16;
                    if (b17 != null) {
                        b17.f69298x75e87a18 = j18;
                        gVar.o(b17);
                    }
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    hb2.s0 s0Var = hb2.s0.f361623e;
                    java.lang.String str2 = d5Var.f210586c;
                    s0Var.getClass();
                    r45.ri2 ri2Var = new r45.ri2();
                    ri2Var.set(24, java.lang.Integer.valueOf(N3 ? 1 : 2));
                    if (str2 != null) {
                        hb2.w0.a(s0Var, str2, ri2Var, null, false, false, null, 56, null);
                    }
                }
            } else {
                boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "material_poi_switch");
                android.app.Activity activity = d5Var.f210584a;
                if (b18) {
                    az2.f fVar2 = d5Var.f210587d;
                    if (fVar2 != null) {
                        fVar2.b();
                    }
                    az2.f a17 = az2.c.a(az2.f.f97658d, activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 0L, null, 8, null);
                    d5Var.f210587d = a17;
                    a17.a();
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h27 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("material_poi_switch");
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = h27 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h27 : null;
                    if (c21541x1c1b08fe3 != null) {
                        boolean N4 = c21541x1c1b08fe3.N();
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        hb2.s0.f361623e.o(N4, d5Var.f210588e, d5Var.f210586c);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "onMaterialPoiSwitchClick: isEnable=" + N4);
                        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("view_clk", null, kz5.c1.k(new jz5.l("view_id", "grant_position_info_purview"), new jz5.l("my_finder_username", d5Var.f210586c), new jz5.l("purview_switch", java.lang.Integer.valueOf(N4 ? 1 : 0))), false);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "save_edited_media_switch")) {
                    i95.m c17 = i95.n0.c(cq.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    cq.k kVar = (cq.k) c17;
                    boolean z17 = !cq.l1.b(kVar);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = kVar.f302759g.f323818b;
                    if (o4Var != null) {
                        o4Var.G("KEY_FINDER_SAVE_EDITED_MEDIA_SWITCH", z17);
                    }
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h28 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("save_edited_media_switch");
                    c21541x1c1b08fe = h28 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h28 : null;
                    if (c21541x1c1b08fe != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "onSaveEditedMediaSwitchClick: isEnable=" + c21541x1c1b08fe.N() + " isSave:" + z17);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "new_life_pic_content")) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h29 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("new_life_pic_content");
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = h29 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h29 : null;
                    if (c21541x1c1b08fe4 != null) {
                        boolean N5 = c21541x1c1b08fe4.N();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "onNewLifePicContentReferenceClick: isEnable=" + N5);
                        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(d85.g0.IMAGE_CONTENT_DATA.f308725d, d85.f0.Q.f308709d, N5);
                        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("view_clk", null, kz5.c1.k(new jz5.l("view_id", "grant_picture_info_purview"), new jz5.l("my_finder_username", d5Var.f210586c), new jz5.l("purview_switch", java.lang.Integer.valueOf(N5 ? 1 : 0))), false);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "settings_protect_hint")) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).sk(activity, null);
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        boolean z17;
        java.util.LinkedList<r45.dt2> m75941xfb821914;
        boolean z18;
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5 d5Var = this.f210241d;
        if (d5Var != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) d5Var.f210585b;
            h0Var.m("material_poi_switch", false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = h0Var.h("material_poi_switch");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
            if (c21541x1c1b08fe != null) {
                boolean c17 = hc2.s.c(ya2.h.f542017a.b(d5Var.f210586c));
                c21541x1c1b08fe.O(c17);
                c21541x1c1b08fe.w(true);
                c21541x1c1b08fe.f279318v = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "[initMaterialPoiSwitch] checked:" + c17);
            }
            h0Var.m("new_life_pic_content", true);
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            d85.g0 g0Var = d85.g0.IMAGE_CONTENT_DATA;
            java.lang.String str = d85.f0.Q.f308709d;
            d85.d1 d1Var = (d85.d1) m0Var;
            d1Var.getClass();
            java.lang.String str2 = g0Var.f308725d;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Zi = d1Var.Zi(str2);
            if (Zi != null) {
                if (str == null) {
                    str = "";
                }
                z17 = Zi.getBoolean(str, false);
            } else {
                z17 = false;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = h0Var.h("new_life_pic_content");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe2 = h18 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h18 : null;
            if (c21541x1c1b08fe2 != null) {
                c21541x1c1b08fe2.O(z17);
                c21541x1c1b08fe2.f279318v = false;
            }
            h0Var.m("save_edited_media_switch", false);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = h0Var.h("save_edited_media_switch");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe3 = h19 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h19 : null;
            if (c21541x1c1b08fe3 != null) {
                i95.m c18 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                boolean b17 = cq.l1.b((cq.k) c18);
                c21541x1c1b08fe3.O(b17);
                c21541x1c1b08fe3.w(true);
                c21541x1c1b08fe3.f279318v = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "[initSaveEditedMediaSwitch] checked:" + b17);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h27 = h0Var.h("settings_protect_hint");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15510x335ebacb c15510x335ebacb = h27 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15510x335ebacb ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1686x34a223.C15510x335ebacb) h27 : null;
            if (c15510x335ebacb != null) {
                if (hc2.s.g()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                    if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W0).mo141623x754a37bb()).r()).booleanValue()) {
                        z18 = true;
                        c15510x335ebacb.L = z18;
                    }
                }
                z18 = false;
                c15510x335ebacb.L = z18;
            }
            if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d5.f210583g).mo141623x754a37bb()).booleanValue()) {
                d5Var.a("feed_reproduction");
                d5Var.a("finder_mini_app_reference");
                d5Var.a("settings_video_reference_desc");
                ya2.b2 b18 = ya2.h.f542017a.b(d5Var.f210586c);
                r45.et2 et2Var = b18 != null ? b18.f69337x3eb82f07 : null;
                android.app.Activity activity = d5Var.f210584a;
                if (et2Var != null && (m75941xfb821914 = et2Var.m75941xfb821914(0)) != null) {
                    for (r45.dt2 dt2Var : m75941xfb821914) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderDataPermissionSetting", "initReferencePermissions type=" + dt2Var.m75939xb282bd08(0) + ", name=" + dt2Var.m75945x2fec8307(1) + ", status=" + dt2Var.m75939xb282bd08(2));
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reference_");
                        sb6.append(dt2Var.m75939xb282bd08(0));
                        java.lang.String sb7 = sb6.toString();
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h28 = h0Var.h(sb7);
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe4 = h28 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h28 : null;
                        if (c21541x1c1b08fe4 == null) {
                            c21541x1c1b08fe4 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe(activity);
                            c21541x1c1b08fe4.f279318v = false;
                            c21541x1c1b08fe4.C(sb7);
                            h0Var.d(c21541x1c1b08fe4, -1);
                        }
                        c21541x1c1b08fe4.L(dt2Var.m75945x2fec8307(1));
                        if (hc2.s.g()) {
                            c21541x1c1b08fe4.O(false);
                            c21541x1c1b08fe4.w(false);
                        } else {
                            c21541x1c1b08fe4.O(dt2Var.m75939xb282bd08(2) == 1);
                            c21541x1c1b08fe4.w(true);
                        }
                    }
                }
                if (!hc2.s.g() && h0Var.h("settings_video_reference_desc") == null) {
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21563x29f29d94 c21563x29f29d94 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21563x29f29d94(activity);
                    c21563x29f29d94.C("settings_video_reference_desc");
                    c21563x29f29d94.L(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p5u));
                    h0Var.d(c21563x29f29d94, -1);
                }
            } else {
                m92.b j37 = g92.a.j3(g92.b.f351302e, d5Var.f210586c, false, 2, null);
                boolean z19 = ((j37 != null ? j37.f68698x26b1b2e8 : 0) & 256) == 0;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h29 = h0Var.h("feed_reproduction");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe5 = h29 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h29 : null;
                if (c21541x1c1b08fe5 != null) {
                    if (hc2.s.g()) {
                        c21541x1c1b08fe5.O(false);
                        c21541x1c1b08fe5.w(false);
                    } else {
                        c21541x1c1b08fe5.O(z19);
                        c21541x1c1b08fe5.w(true);
                    }
                    c21541x1c1b08fe5.f279318v = false;
                }
                h0Var.m("finder_mini_app_reference", ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.J0).mo141623x754a37bb()).r()).intValue() == 0);
                ya2.b2 b19 = ya2.h.f542017a.b(d5Var.f210586c);
                boolean z27 = ((b19 != null ? b19.f69298x75e87a18 : 0L) & 16) == 0;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h37 = h0Var.h("finder_mini_app_reference");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe6 = h37 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h37 : null;
                if (c21541x1c1b08fe6 != null) {
                    if (hc2.s.g()) {
                        c21541x1c1b08fe6.O(false);
                        c21541x1c1b08fe6.w(false);
                    } else {
                        c21541x1c1b08fe6.O(z27);
                        c21541x1c1b08fe6.w(true);
                    }
                    c21541x1c1b08fe6.f279318v = false;
                }
            }
            h0Var.notifyDataSetChanged();
        }
    }
}
